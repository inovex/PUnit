package de.inovex.punit.servicemock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public abstract class AbstractInitializerMap implements InitializerMap{
	
	private final static Logger LOG = LoggerFactory.getLogger(AbstractInitializerMap.class);
	
	protected Map<Class<?>, Collection<Initializer<?>>> initializerMap = new HashMap<Class<?>, Collection<Initializer<?>>>();
	
	protected void logPostInitialize(Class<?> clazz){
		if(LOG.isDebugEnabled()){
			LOG.debug("Handle {} post construct", clazz.getSimpleName());
		}
	}
	
	protected <T> Collection<Initializer<T>> getInitializers (Class<T> type, boolean initializeCollection){
		Collection<Initializer<T>> configurationFactoryUtilInitializers = convertToTypedCollection(type, initializerMap.get(type));
		if(initializeCollection && configurationFactoryUtilInitializers == null){
			configurationFactoryUtilInitializers = new ArrayList<Initializer<T>>();
		} 
		return configurationFactoryUtilInitializers; 
	}
	
	public <T> Collection<Initializer<T>> getInitializers(Class<T> clazz) {		
		return getInitializers(clazz, false);
	}

	@SuppressWarnings("unchecked")
	protected <T> Collection<Initializer<T>> convertToTypedCollection(Class<T> typeClass, Collection<Initializer<?>> genericCollection){
		Collection<Initializer<T>> convertedCollection = null;
		if(genericCollection != null){
			convertedCollection = new ArrayList<Initializer<T>>(genericCollection.size());
			for(Initializer<?> genericInitializer : genericCollection){
				convertedCollection.add((Initializer<T>) genericInitializer);
			}
		}
		return convertedCollection;
	}
	
	protected <T> void putInitializer(Class<T> typeClass, Collection<Initializer<T>> collection){
		if(collection != null){
			Collection<Initializer<?>> convertedCollection = new ArrayList<Initializer<?>>(collection.size());
			for(Initializer<T> initializer : collection){
				convertedCollection.add(initializer);
			}
			this.initializerMap.put(typeClass, convertedCollection);
		}
	}
}
