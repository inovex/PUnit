package de.inovex.punit.servicemock;


import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.ReflectionUtils;

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
	
	private static final String PROPERTIES = ".properties";
	
	private static final String SERVICE_PROPERTIES = "service-mock" + PROPERTIES;
	
	private static final String CUSTOM_SERVICE_PROPERTIES = "custom-" + SERVICE_PROPERTIES;	
	
	public static void setMockedService(Object liferayLocalServiceUtil, Object mockedService){
		Field serviceField = ReflectionUtils.findField(liferayLocalServiceUtil.getClass(), "_service");
		ReflectionUtils.makeAccessible(serviceField);
		ReflectionUtils.setField(serviceField, liferayLocalServiceUtil, mockedService);
	}
	
	public static void initAllMockedServices() throws IOException, InstantiationException, IllegalAccessException{
		initAllMockedServices(new DefaultServiceInitializerMap());
	}
	
	public static void initAllMockedServices(InitializerMap serviceInitializerMap) throws IOException, InstantiationException, IllegalAccessException{
		Properties serviceProperties = PropertiesLoaderUtils.loadAllProperties(SERVICE_PROPERTIES);
		Properties customProperties = PropertiesLoaderUtils.loadAllProperties(CUSTOM_SERVICE_PROPERTIES);
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
				Object serviceInstance = utilClass.newInstance();
				setMockedService(serviceInstance, getMockObject(serviceClass));
				invokeInitializer(serviceInstance, serviceInitializerMap);
			} catch (ClassNotFoundException e) {
				LOG.error("Util class not found for: " + object);
			} catch (Exception e) {
				LOG.error("Exception during init of " + object);
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
	
	@SuppressWarnings("unchecked")
	private static <T> void invokeInitializer(T serviceInstance, InitializerMap initializerMap) throws Exception{
		Class<T> clazz = (Class<T>) serviceInstance.getClass();
		Collection<Initializer<T>> initializers = initializerMap.getInitializers(clazz);
		if(initializers != null){
			for(Initializer<T> initializer : initializers){
				initializer.initialize(serviceInstance);
			}
		}
	}
	
}
