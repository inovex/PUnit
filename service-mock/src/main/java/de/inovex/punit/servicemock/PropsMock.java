package de.inovex.punit.servicemock;

import java.util.Properties;

import com.liferay.portal.kernel.configuration.Filter;
import com.liferay.portal.kernel.util.Props;
/**
 * Copyright (C) 2013 Andreas Friedel - ${website} - inovex GmbH>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class PropsMock implements Props {

	private Properties properties = new Properties();

	private static final String[] EMPTY_ARRAY = new String[0];

	@Override
	public boolean contains(String key) {
		return properties.contains(key);
	}

	@Override
	public String get(String key) {
		return properties.getProperty(key);
	}

	@Override
	public String get(String key, Filter filter) {
		return properties.getProperty(key);
	}

	@Override
	public String[] getArray(String key) {
		return EMPTY_ARRAY;
	}

	@Override
	public String[] getArray(String key, Filter filter) {
		return EMPTY_ARRAY;
	}

	@Override
	public Properties getProperties() {
		return properties;
	}

	@Override
	public Properties getProperties(String prefix, boolean removePrefix) {
		return properties;
	}

}
