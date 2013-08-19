package de.inovex.punit.servicemock;


import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.ReflectionUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserMock;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceMock;
import com.liferay.portal.service.UserLocalServiceUtil;

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
public class ServiceInitializer {
	
	private final static Logger LOG = LoggerFactory.getLogger(ServiceInitializer.class);
	
	public static void setMockedService(Object liferayLocalServiceUtil, Object mockedService){
		Field serviceField = ReflectionUtils.findField(liferayLocalServiceUtil.getClass(), "_service");
		ReflectionUtils.makeAccessible(serviceField);
		ReflectionUtils.setField(serviceField, liferayLocalServiceUtil, mockedService);
	}
	
	public static void initAllMockedServices() throws IOException, InstantiationException, IllegalAccessException{
		Properties serviceProperties = PropertiesLoaderUtils.loadAllProperties("service-mock.properties");
		Properties customProperties = PropertiesLoaderUtils.loadAllProperties("custom-service-mock.properties");
		if(customProperties != null && !customProperties.isEmpty()){
			LOG.info("Loading custom service properties");
			serviceProperties.putAll(customProperties);
		}
		Enumeration<Object> keys = serviceProperties.keys();
		while (keys.hasMoreElements()) {
			Object object = keys.nextElement();
			LOG.debug(object.toString());
			try {
				Class<?> utilClass = findLiferayUtilClass(object.toString());
				Class<?> serviceClass = Class.forName(serviceProperties.getProperty(object.toString()));
				Object utilInstance = utilClass.newInstance();
				setMockedService(utilInstance, getMockObject(serviceClass));
				servicePostConstruct(utilInstance);
			} catch (ClassNotFoundException e) {
				LOG.error("Util class not found for: " + object);
			}
		}
	}
	
	private static Object getMockObject(Class<?> fieldClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException{		
		if(MockService.class.isAssignableFrom(fieldClass)){
			return fieldClass.newInstance();
		} else {
			return mock(fieldClass);
		}
	}
	
	private static Class<?> findLiferayUtilClass(String serviceInterface) throws ClassNotFoundException{
		Class<?> utilClass = Class.forName(serviceInterface + "Util");
		return utilClass;
	}
	
	private static void servicePostConstruct(Object utilInstance){
		Method method = ReflectionUtils.findMethod(ServiceInitializer.class, "handle" + utilInstance.getClass().getSimpleName() + "PostConstruct", utilInstance.getClass());
		if(method != null){
			ReflectionUtils.invokeMethod(method, null, utilInstance);
		}
	}
	
	@SuppressWarnings("static-access")
	public static void handleUserLocalServiceUtilPostConstruct(
			UserLocalServiceUtil userLocalServiceUtil) throws PortalException,
			SystemException {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Handle UserLocalServiceUtil post construct");
		}
		UserLocalServiceMock userLocalServiceMock = (UserLocalServiceMock) userLocalServiceUtil.getService();
		when(
			userLocalServiceMock.getMockObject().addUser(anyLong(),
					anyLong(), anyBoolean(), anyString(), anyString(),
					anyBoolean(), anyString(), anyString(), anyLong(),
					anyString(), isA(Locale.class), anyString(),
					anyString(), anyString(), anyInt(), anyInt(),
					anyBoolean(), anyInt(), anyInt(), anyInt(),
					anyString(), any(long[].class), any(long[].class),
					any(long[].class), any(long[].class), anyBoolean(),
					isA(ServiceContext.class))).
		thenAnswer(
			new Answer<User>() {

				@SuppressWarnings("deprecation")
				@Override
				public User answer(InvocationOnMock invocation)
						throws Throwable {
					Object[] args = invocation.getArguments();
					User user = new UserMock();
					when(user.getCompanyId()).thenReturn((Long) args[1]);
					when(user.getPassword()).thenReturn((String) args[3]);
					when(user.getScreenName()).thenReturn((String) args[6]);
					when(user.getEmailAddress()).thenReturn((String) args[7]);
					when(user.getFacebookId()).thenReturn((Long) args[8]);
					when(user.getOpenId()).thenReturn((String) args[9]);
					when(user.getLocale()).thenReturn((Locale) args[10]);
					when(user.getFirstName()).thenReturn((String) args[11]);
					when(user.getMiddleName()).thenReturn((String) args[12]);
					when(user.getLastName()).thenReturn((String) args[13]);
					when(user.isMale()).thenReturn((Boolean) args[16]);
					when(user.getBirthday()).thenReturn(new Date((Integer)args[19], (Integer)args[17], (Integer)args[18]));
					when(user.getJobTitle()).thenReturn((String) args[20]);
					when(user.getGroupIds()).thenReturn((long[]) args[21]);
					when(user.getOrganizationIds()).thenReturn((long[]) args[22]);
					when(user.getRoleIds()).thenReturn((long[]) args[23]);
					when(user.getUserGroupIds()).thenReturn((long[]) args[24]);
					return user;
				}
			});
	}
}
