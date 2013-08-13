package de.inovex.punit.portlettest;

import org.junit.rules.ExternalResource;
import org.springframework.mock.web.portlet.MockActionRequest;
import org.springframework.mock.web.portlet.MockActionResponse;
import org.springframework.mock.web.portlet.MockRenderRequest;
import org.springframework.mock.web.portlet.MockRenderResponse;

import de.inovex.punit.servicemock.MockedServiceInitializer;
import de.inovex.punit.servicemock.PropsMock;
import de.inovex.punit.servicemock.StaticUtilInitializer;

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
public class DefaultGuestScenario extends ExternalResource implements Scenario{
	
	protected LiferayTestRequestUtil requestUtil = new LiferayTestRequestUtil();

	@Override
	protected void before() throws Throwable {				
		super.before();
		com.liferay.portal.kernel.util.PropsUtil.setProps(new PropsMock());
		MockedServiceInitializer.initAllMockedServices();
		StaticUtilInitializer.initAllMockedUtils();
	}

	@Override
	public MockActionRequest getActionRequest() {
		return requestUtil.getActionRequest();
	}

	@Override
	public MockActionResponse getActionResponse() {
		return requestUtil.getActionResponse();
	}

	@Override
	public MockRenderRequest getRenderRequest() {
		return requestUtil.getRenderRequest();
	}

	@Override
	public MockRenderResponse getRenderResponse() {
		return requestUtil.getRenderResponse();
	}

}
