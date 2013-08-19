package de.inovex.punit.servicemock;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.when;

import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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
 * @param <T>
 * 
 */
public class DefaultServiceInitializerMap extends AbstractInitializerMap{

	public DefaultServiceInitializerMap(){
		addUserLocalServiceUtilInitializer();
	}
	
	protected void addUserLocalServiceUtilInitializer() {
		Class<UserLocalServiceUtil> typeClass = UserLocalServiceUtil.class;
		Collection<Initializer<UserLocalServiceUtil>> configurationFactoryUtilInitializers = getInitializers(typeClass, true);
		configurationFactoryUtilInitializers.add(new Initializer<UserLocalServiceUtil>(){

			@Override
			public void initialize(UserLocalServiceUtil userLocalServiceUtil)
					throws Exception {
				logPostInitialize(userLocalServiceUtil.getClass());
				UserLocalServiceMock userLocalServiceMock = (UserLocalServiceMock) UserLocalServiceUtil.getService();
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
			
		});
		putInitializer(typeClass,  configurationFactoryUtilInitializers);
		
	}
}
