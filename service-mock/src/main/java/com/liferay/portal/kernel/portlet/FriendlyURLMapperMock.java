
package com.liferay.portal.kernel.portlet;

import java.util.Map;

import de.inovex.punit.servicemock.MockService;


/**
 * 
 * Copyright (C) 2013 Andreas Friedel - https://github.com/inovex/PUnit - <inovex GmbH> 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *  
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 * 
 */
public class FriendlyURLMapperMock
    extends MockService<FriendlyURLMapper>
    implements FriendlyURLMapper
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.kernel.portlet.FriendlyURLMapper.class));
    }

    public String getPortletId() {
        return this.mockObject.getPortletId();
    }

    public void setPortletId(String param0) {
    }

    public String buildPath(LiferayPortletURL param0) {
        return this.mockObject.buildPath(param0);
    }

    public String getMapping() {
        return this.mockObject.getMapping();
    }

    public Router getRouter() {
        return this.mockObject.getRouter();
    }

    public boolean isCheckMappingWithPrefix() {
        return this.mockObject.isCheckMappingWithPrefix();
    }

    public boolean isPortletInstanceable() {
        return this.mockObject.isPortletInstanceable();
    }

    public void populateParams(String param0, Map<String, String[]> param1, Map<String, Object> param2) {
    }

    public void setMapping(String param0) {
    }

    public void setPortletInstanceable(boolean param0) {
    }

    public void setRouter(Router param0) {
    }

}
