package de.inovex.punit.servicemock;

import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.ReflectionUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

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
public class UtilInitializer {

	private final static Logger LOG = LoggerFactory.getLogger(UtilInitializer.class);
	
	private static Map<String, Object> INSTANCE_MAP = new ConcurrentHashMap<String, Object>();
	
	private static final String UTIL_PROPERTIES = "util-mock";
	
	private static final String CUSTOM_UTIL_PROPERTIES = "util-mock";
	
	private static final String PROPERTIES = ".properties";
	
	public static void initAllMockedUtils() throws SecurityException,
			IllegalArgumentException, IOException, InstantiationException,
			IllegalAccessException, NoSuchMethodException,
			InvocationTargetException, PortalException, SystemException {
		UtilInitializer.initAllMockedUtils(new DefaultUtilInitializerMap());
	}

	public static void initAllMockedUtils(InitializerMap initializerMap) throws IOException,
			InstantiationException, IllegalAccessException, SecurityException,
			IllegalArgumentException, NoSuchMethodException,
			InvocationTargetException {			
			initConfiguredUtils(getUtilProperties(), initializerMap);
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
			throws InstantiationException, IllegalAccessException,
			SecurityException, NoSuchMethodException, IllegalArgumentException,
			InvocationTargetException {
		Object utilInstance = null;
		if(INSTANCE_MAP.containsKey(utilClass.getName())){
			utilInstance = INSTANCE_MAP.get(utilClass.getName());
		} else {
			Constructor<?> constructor = utilClass.getDeclaredConstructor();
			constructor.setAccessible(true);
			utilInstance = constructor.newInstance();
			INSTANCE_MAP.put(utilClass.getName(), utilInstance);			
		}
		return utilInstance;
	}
	
	private static void initConfiguredUtils(Properties utilProperties, InitializerMap initializerMap)
			throws InstantiationException, IllegalAccessException,
			SecurityException, IllegalArgumentException, NoSuchMethodException,
			InvocationTargetException {		
		List<Object> keyList = PropertiesUtil.getSortedKeyList(utilProperties);
		for(Object object : keyList){			
			LOG.debug(object.toString());
			try {				
				Class<?> utilClass = Class.forName(object.toString());
				String value = utilProperties.getProperty(object.toString());
				Object utilInstance = getUtilInstance(utilClass);
				initFields(utilInstance, value);
				invokeInitializer(utilInstance, initializerMap);
			} catch (ClassNotFoundException e) {
				LOG.error("Util class not found for: " + object);
			} catch (Exception e) {
				LOG.error("Exception during init of " + object);
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
	
	@SuppressWarnings("unchecked")
	private static <T> void invokeInitializer(T utilInstance, InitializerMap initializerMap) throws Exception{
		Class<T> clazz = (Class<T>) utilInstance.getClass();
		Collection<Initializer<T>> initializers = initializerMap.getInitializers(clazz);
		for(Initializer<T> initializer : initializers){
			initializer.initialize(utilInstance);
		}
	}

}
