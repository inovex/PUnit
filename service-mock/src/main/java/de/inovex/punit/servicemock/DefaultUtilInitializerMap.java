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

import java.util.Collection;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
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
 * @param <T>
 * 
 */
public class DefaultUtilInitializerMap extends AbstractInitializerMap {	
	
	public DefaultUtilInitializerMap() {
		addHttpUtilInitializer();
		addConfigurationFactoryInitializer();
		addPortalUtilInitializer();
		addPortletURLFactoryInitializer();
	}
	
	protected void addPortalUtilInitializer() {
		Class<PortalUtil> typeClass = PortalUtil.class;
		Collection<Initializer<PortalUtil>> configurationFactoryUtilInitializers = getInitializers(typeClass, true);
		configurationFactoryUtilInitializers.add(new Initializer<PortalUtil>(){

			@Override
			public void initialize(PortalUtil portalUtil) throws Exception{
				logPostInitialize(portalUtil.getClass());
				PortalMock portalMock = (PortalMock) PortalUtil.getPortal();
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
			
		});
		putInitializer(typeClass,  configurationFactoryUtilInitializers);
	}
	
	protected <T> void addPortletURLFactoryInitializer() {
		Class<PortletURLFactoryUtil> typeClass = PortletURLFactoryUtil.class;
		Collection<Initializer<PortletURLFactoryUtil>> configurationFactoryUtilInitializers = getInitializers(typeClass, true);
		configurationFactoryUtilInitializers.add(new Initializer<PortletURLFactoryUtil>(){

			@Override
			public void initialize(PortletURLFactoryUtil instance) {
				logPostInitialize(instance.getClass());
				when(PortletURLFactoryUtil.getPortletURLFactory().create(
						any(PortletRequest.class), anyString(), anyLong(),
						anyString()))
					.thenReturn(mock(LiferayPortletURL.class));
			}
			
		});
		putInitializer(typeClass, configurationFactoryUtilInitializers);	
	}
	
	protected <T> void addHttpUtilInitializer(){
		Class<HttpUtil> typeClass = HttpUtil.class;
		Collection<Initializer<HttpUtil>> configurationFactoryUtilInitializers = getInitializers(typeClass, true);
		configurationFactoryUtilInitializers.add(new Initializer<HttpUtil>() {

			@Override			
			public void initialize(HttpUtil httpUtil) {
				logPostInitialize(httpUtil.getClass());
				Answer<String> simpleAddAnswer = new Answer<String>() {

					@Override
					public String answer(InvocationOnMock invocation) throws Throwable {
						Object[] args = invocation.getArguments();
						return args[0] + "&" + args[1] + "=" + args[2];
					}
				};
				
				when(HttpUtil.addParameter(anyString(), anyString(), anyBoolean()))
						.then(simpleAddAnswer);
				when(HttpUtil.addParameter(anyString(), anyString(), anyDouble()))
						.then(simpleAddAnswer);
				when(HttpUtil.addParameter(anyString(), anyString(), anyInt())).then(
						simpleAddAnswer);
				when(HttpUtil.addParameter(anyString(), anyString(), anyLong())).then(
						simpleAddAnswer);
				when(HttpUtil.addParameter(anyString(), anyString(), anyShort())).then(
						simpleAddAnswer);
				when(HttpUtil.addParameter(anyString(), anyString(), anyString()))
						.then(simpleAddAnswer);
			}
			
		});
		putInitializer(typeClass, configurationFactoryUtilInitializers);
	}
	
	protected void addConfigurationFactoryInitializer() {		
		Class<ConfigurationFactoryUtil> clazz = ConfigurationFactoryUtil.class;
		Collection<Initializer<ConfigurationFactoryUtil>> configurationFactoryUtilInitializers = getInitializers(clazz, true);
		configurationFactoryUtilInitializers.add(new Initializer<ConfigurationFactoryUtil>() {

			@Override
			public void initialize(ConfigurationFactoryUtil configurationFactoryUtil) {
				logPostInitialize(configurationFactoryUtil.getClass());
				when(ConfigurationFactoryUtil.getConfiguration(any(ClassLoader.class), anyString()))
					.thenReturn(mock(Configuration.class));
			}
			
		});
		putInitializer(clazz, configurationFactoryUtilInitializers);
	}

}
