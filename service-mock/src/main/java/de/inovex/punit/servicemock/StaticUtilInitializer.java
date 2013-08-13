package de.inovex.punit.servicemock;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyShort;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.util.ReflectionUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.CompanyMock;
import com.liferay.portal.util.PortalMock;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;

/**
 * 
 * Copyright (C) 2013 Andreas Friedel - https://github.com/inovex/PUnit - <inovex GmbH>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 */
public class StaticUtilInitializer {
	
	private static final String POST_CONSTRUCT = "PostConstruct";

	private static final String HANDLE = "handle";

	private final static Logger LOG = LoggerFactory.getLogger(StaticUtilInitializer.class);
	
	private static Map<String, Object> INSTANCE_MAP = new ConcurrentHashMap<String, Object>();
	
	private static final String UTIL_PROPERTIES = "util-mock";
	
	private static final String CUSTOM_UTIL_PROPERTIES = "util-mock";
	
	private static final String PROPERTIES = ".properties";

	public static void initAllMockedUtils() throws IOException,
			InstantiationException, IllegalAccessException {			
		initConfiguredUtils(getUtilProperties());
	}
	
	private static Properties getUtilProperties() throws IOException{
		Properties utilProperties = loadUtilProperties();		
		Properties customUtilProperties = loadCustomUtilProperties();		
		if(customUtilProperties != null && !customUtilProperties.isEmpty()){
			LOG.info("Loading custom util properties");
			utilProperties.putAll(customUtilProperties);
		}
		return utilProperties;
	}
	
	private static Properties loadUtilProperties() throws IOException{
		return PropertiesLoaderUtils.loadAllProperties(UTIL_PROPERTIES + PROPERTIES);
	}
	
	private static Properties loadCustomUtilProperties() throws IOException{
		return PropertiesLoaderUtils.loadAllProperties(CUSTOM_UTIL_PROPERTIES + PROPERTIES);
	}
	
	private static Object getUtilInstance(Class<?> utilClass)
			throws InstantiationException, IllegalAccessException {
		Object utilInstance = null;
		if(INSTANCE_MAP.containsKey(utilClass.getName())){
			utilInstance = INSTANCE_MAP.get(utilClass.getName());
		} else {
			utilInstance = utilClass.newInstance();
			INSTANCE_MAP.put(utilClass.getName(), utilInstance);			
		}
		return utilInstance;
	}
	
	private static void initConfiguredUtils(Properties utilProperties)
			throws InstantiationException, IllegalAccessException {
		Enumeration<Object> keys = utilProperties.keys();
		while (keys.hasMoreElements()) {
			Object object = keys.nextElement();
			LOG.debug(object.toString());
			try {				
				Class<?> utilClass = Class.forName(object.toString());
				String value = utilProperties.getProperty(object.toString());
				Object utilInstance = getUtilInstance(utilClass);
				initFields(utilInstance, value);
			} catch (ClassNotFoundException e) {
				LOG.error("Util class not found for: " + object);
			}
		}
	}
	
	private static void initFields(Object utilInstance, String fieldDefinition)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		String[] values = fieldDefinition.split("#");
		Field serviceField = ReflectionUtils.findField(utilInstance.getClass(), values[0]);
		ReflectionUtils.makeAccessible(serviceField);
		ReflectionUtils.setField(serviceField, utilInstance, getMockObject(values[1]));
		utilPostConstruct(utilInstance);
	}
	
	private static Object getMockObject(String className)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Class<?> fieldClass = Class.forName(className);
		if(MockService.class.isAssignableFrom(fieldClass)){
			return fieldClass.newInstance();
		} else {
			return mock(Class.forName(className));
		}
	}
	
	private static void utilPostConstruct(Object utilInstance){
		Method method = ReflectionUtils.findMethod(StaticUtilInitializer.class,
				HANDLE + utilInstance.getClass().getSimpleName()
						+ POST_CONSTRUCT, utilInstance.getClass());
		if(method != null){
			ReflectionUtils.invokeMethod(method, null, utilInstance);
		}
	}
	
	@SuppressWarnings("static-access")
	public static void handlePortalUtilPostConstruct(PortalUtil portalUtil)
			throws PortalException, SystemException {
		if(LOG.isDebugEnabled()){
			LOG.debug("Handle PortalUtil post construct");
		}
		PortalMock portalMock = (PortalMock) portalUtil.getPortal();
		when(portalMock.getMockObject().getHttpServletRequest(isA(PortletRequest.class)))
			.thenReturn(new MockHttpServletRequest());
		
		when(portalMock.getMockObject().getHttpServletResponse(isA(PortletResponse.class)))
			.thenReturn(new MockHttpServletResponse());
		
		Company mockedCompany = new CompanyMock();
		when(mockedCompany.getCompanyId()).thenReturn(Long.valueOf(1l));
		when(mockedCompany.getKey()).thenReturn("testPW1223456");

		when(portalMock.getMockObject().getCompanyId(
				isA(HttpServletRequest.class)))
			.thenReturn(Long.valueOf(1l));
		
		when(portalMock.getMockObject().getCompanyId(isA(PortletRequest.class)))
			.thenReturn(Long.valueOf(1l));

		when(portalMock.getMockObject().getCompany(
				isA(HttpServletRequest.class)))
			.thenReturn(mockedCompany);
		
		when(portalMock.getMockObject().getCompany(isA(PortletRequest.class)))
			.thenReturn(mockedCompany);
	}
	
	public static void handlePortletURLFactoryUtilPostConstruct(
			PortletURLFactoryUtil portletURLFactoryUtil) {
		if(LOG.isDebugEnabled()){
			LOG.debug("Handle PortletURLFactoryUtil post construct");
		}
		when(PortletURLFactoryUtil.getPortletURLFactory().create(
				any(PortletRequest.class), anyString(), anyLong(),
				anyString()))
			.thenReturn(mock(LiferayPortletURL.class));
	}
	
	@SuppressWarnings("static-access")
	public static void handleHttpUtilPostConstruct(HttpUtil httpUtil){
		if(LOG.isDebugEnabled()){
			LOG.debug("Handle HttpUtil post construct");
		}
		Answer<String> simpleAddAnswer = new Answer<String>() {

			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				Object[] args = invocation.getArguments();
				return args[0] + "&" + args[1] + "=" + args[2];
			}
		};
		
		when(httpUtil.addParameter(anyString(), anyString(), anyBoolean()))
				.then(simpleAddAnswer);
		when(httpUtil.addParameter(anyString(), anyString(), anyDouble()))
				.then(simpleAddAnswer);
		when(httpUtil.addParameter(anyString(), anyString(), anyInt())).then(
				simpleAddAnswer);
		when(httpUtil.addParameter(anyString(), anyString(), anyLong())).then(
				simpleAddAnswer);
		when(httpUtil.addParameter(anyString(), anyString(), anyShort())).then(
				simpleAddAnswer);
		when(httpUtil.addParameter(anyString(), anyString(), anyString()))
				.then(simpleAddAnswer);
	}

}
