package de.inovex.punit.portlettest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.ResourceRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mock.web.portlet.MockActionRequest;
import org.springframework.mock.web.portlet.MockActionResponse;
import org.springframework.mock.web.portlet.MockRenderRequest;
import org.springframework.mock.web.portlet.MockRenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.LayoutMock;
import com.liferay.portal.model.UserMock;
import com.liferay.portal.theme.ThemeDisplay;

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
public class LiferayTestRequestUtil {
	
	private final static Logger LOG = LoggerFactory.getLogger(LiferayTestRequestUtil.class);

	public MockActionRequest getActionRequest() {		
		MockActionRequest request = new MockActionRequest();		
		request = (MockActionRequest) setThemeDisplay(request);
		return request;
	}

	public MockRenderRequest getRenderRequest() {
		MockRenderRequest request = new MockRenderRequest();
		request = (MockRenderRequest) setThemeDisplay(request);
		return request;
	}

	public PortletRequest setThemeDisplay(PortletRequest request) {
		ThemeDisplay themeDisplay = mock(ThemeDisplay.class);
		UserMock user = new UserMock();
		
		when(themeDisplay.getUser()).thenReturn(user);
		
		LayoutMock layout = new LayoutMock();
		when(layout.getPlid()).thenReturn(Long.valueOf(1l));
		when(layout.getParentLayoutId()).thenReturn(Long.valueOf(0l));
		try {
			when(layout.getParentPlid()).thenReturn(Long.valueOf(0l));
		} catch (PortalException e) {
			LOG.error("Failed to mock getParentPlid()", e);
		} catch (SystemException e) {
			LOG.error("Failed to mock getParentPlid()", e);
		}
		
		when(themeDisplay.getLayout()).thenReturn(layout);
		
		if (request instanceof ActionRequest) {
			when(themeDisplay.isLifecycleAction()).thenReturn(Boolean.TRUE);
			when(themeDisplay.isLifecycleRender()).thenReturn(Boolean.FALSE);
			when(themeDisplay.isLifecycleResource()).thenReturn(Boolean.FALSE);
		} else if (request instanceof RenderRequest) {
			when(themeDisplay.isLifecycleAction()).thenReturn(Boolean.FALSE);
			when(themeDisplay.isLifecycleRender()).thenReturn(Boolean.TRUE);
			when(themeDisplay.isLifecycleResource()).thenReturn(Boolean.FALSE);
		} else if (request instanceof ResourceRequest) {
			when(themeDisplay.isLifecycleAction()).thenReturn(Boolean.FALSE);
			when(themeDisplay.isLifecycleRender()).thenReturn(Boolean.FALSE);
			when(themeDisplay.isLifecycleResource()).thenReturn(Boolean.TRUE);
		}
		request.setAttribute(WebKeys.THEME_DISPLAY, themeDisplay);
		return request;
	}

	public MockActionResponse getActionResponse() {
		MockActionResponse response = new MockActionResponse();
		return response;
	}

	public MockRenderResponse getRenderResponse() {
		MockRenderResponse response = new MockRenderResponse();
		return response;
	}

}
