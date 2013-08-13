package de.inovex.punit.portlettest;

import org.junit.rules.ExternalResource;
import org.springframework.mock.web.portlet.MockActionRequest;
import org.springframework.mock.web.portlet.MockActionResponse;
import org.springframework.mock.web.portlet.MockRenderRequest;
import org.springframework.mock.web.portlet.MockRenderResponse;

import de.inovex.punit.servicemock.MockedServiceInitializer;
import de.inovex.punit.servicemock.PropsMock;
import de.inovex.punit.servicemock.StaticUtilInitializer;

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
