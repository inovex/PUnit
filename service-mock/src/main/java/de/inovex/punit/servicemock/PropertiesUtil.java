package de.inovex.punit.servicemock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

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
public class PropertiesUtil {

	public static List<Object> getSortedKeyList(Properties properties){
		List<Object> keyList = new ArrayList<Object>(properties.keySet());
		Collections.sort(keyList, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 == null){
					o1 = StringUtils.EMPTY;
				}
				if(o2 == null){
					o2 = StringUtils.EMPTY;
				}
				return o1.toString().compareTo(o2.toString());
			}
		});
		return keyList;
	}
}
