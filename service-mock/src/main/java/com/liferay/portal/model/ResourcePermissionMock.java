
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.expando.model.ExpandoBridge;
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
public class ResourcePermissionMock
    extends MockService<ResourcePermission>
    implements ResourcePermission
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.ResourcePermission.class));
    }

    public boolean hasActionId(String param0) {
        return this.mockObject.hasActionId(param0);
    }

    public String toString() {
        return this.mockObject.toString();
    }

    public int hashCode() {
        return this.mockObject.hashCode();
    }

    public Object clone() {
        return this.mockObject.clone();
    }

    public int compareTo(ResourcePermission param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public boolean isCachedModel() {
        return this.mockObject.isCachedModel();
    }

    public void setCachedModel(boolean param0) {
    }

    public boolean isEscapedModel() {
        return this.mockObject.isEscapedModel();
    }

    public void setPrimaryKey(long param0) {
    }

    public ExpandoBridge getExpandoBridge() {
        return this.mockObject.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public ResourcePermission toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public Serializable getPrimaryKeyObj() {
        return this.mockObject.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(Serializable param0) {
    }

    public boolean isNew() {
        return this.mockObject.isNew();
    }

    public void setNew(boolean param0) {
    }

    public CacheModel<ResourcePermission> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public long getActionIds() {
        return this.mockObject.getActionIds();
    }

    public void setOwnerId(long param0) {
    }

    public long getOwnerId() {
        return this.mockObject.getOwnerId();
    }

    public void setActionIds(long param0) {
    }

    public long getRoleId() {
        return this.mockObject.getRoleId();
    }

    public void setRoleId(long param0) {
    }

    public String getPrimKey() {
        return this.mockObject.getPrimKey();
    }

    public void setPrimKey(String param0) {
    }

    public void setScope(int param0) {
    }

    public long getResourcePermissionId() {
        return this.mockObject.getResourcePermissionId();
    }

    public void setResourcePermissionId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public ResourcePermission toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public void setCompanyId(long param0) {
    }

    public int getScope() {
        return this.mockObject.getScope();
    }

    public void resetOriginalValues() {
    }

    public Map<String, Object> getModelAttributes() {
        return this.mockObject.getModelAttributes();
    }

    public void setModelAttributes(Map<String, Object> param0) {
    }

    public Class<?> getModelClass() {
        return this.mockObject.getModelClass();
    }

    public String getModelClassName() {
        return this.mockObject.getModelClassName();
    }

    public void persist()
        throws SystemException
    {
    }

}
