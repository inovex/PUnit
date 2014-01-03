
package com.liferay.portal.model;

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
public class ResourceMock
    extends MockService<Resource>
    implements Resource
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Resource.class));
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public void setCodeId(long param0) {
    }

    public String getPrimKey() {
        return this.mockObject.getPrimKey();
    }

    public void setPrimKey(String param0) {
    }

    public long getCodeId() {
        return this.mockObject.getCodeId();
    }

    public void setScope(int param0) {
    }

    public long getResourceId() {
        return this.mockObject.getResourceId();
    }

    public void setResourceId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setCompanyId(long param0) {
    }

    public int getScope() {
        return this.mockObject.getScope();
    }

}
