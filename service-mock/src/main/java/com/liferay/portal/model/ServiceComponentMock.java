
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
public class ServiceComponentMock
    extends MockService<ServiceComponent>
    implements ServiceComponent
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.ServiceComponent.class));
    }

    public String getIndexesSQL() {
        return this.mockObject.getIndexesSQL();
    }

    public String getSequencesSQL() {
        return this.mockObject.getSequencesSQL();
    }

    public String getTablesSQL() {
        return this.mockObject.getTablesSQL();
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

    public int compareTo(ServiceComponent param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getData() {
        return this.mockObject.getData();
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

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public ServiceComponent toEscapedModel() {
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

    public CacheModel<ServiceComponent> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public long getServiceComponentId() {
        return this.mockObject.getServiceComponentId();
    }

    public void setData(String param0) {
    }

    public void setBuildDate(long param0) {
    }

    public long getBuildNumber() {
        return this.mockObject.getBuildNumber();
    }

    public void setBuildNumber(long param0) {
    }

    public long getBuildDate() {
        return this.mockObject.getBuildDate();
    }

    public void setServiceComponentId(long param0) {
    }

    public String getBuildNamespace() {
        return this.mockObject.getBuildNamespace();
    }

    public void setBuildNamespace(String param0) {
    }

    public ServiceComponent toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
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
