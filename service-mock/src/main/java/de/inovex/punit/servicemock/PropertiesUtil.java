package de.inovex.punit.servicemock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

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
