
package com.liferay.portlet.expando.model;

import com.liferay.portal.theme.ThemeDisplay;
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
public class CustomAttributesDisplayMock
    extends MockService<CustomAttributesDisplay>
    implements CustomAttributesDisplay
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.expando.model.CustomAttributesDisplay.class));
    }

    public String getClassName() {
        return this.mockObject.getClassName();
    }

    public String getIconPath(ThemeDisplay param0) {
        return this.mockObject.getIconPath(param0);
    }

    public String getPortletId() {
        return this.mockObject.getPortletId();
    }

    public void setClassNameId(long param0) {
    }

    public void setPortletId(String param0) {
    }

}
