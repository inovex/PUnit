package de.inovex.punit.portlettest;

import org.junit.rules.TestRule;
import org.springframework.mock.web.portlet.MockActionRequest;
import org.springframework.mock.web.portlet.MockActionResponse;
import org.springframework.mock.web.portlet.MockRenderRequest;
import org.springframework.mock.web.portlet.MockRenderResponse;

public interface Scenario extends TestRule {

	public MockActionRequest getActionRequest();
	
	public MockActionResponse getActionResponse();
	
	public MockRenderRequest getRenderRequest();
	
	public MockRenderResponse getRenderResponse();
}
