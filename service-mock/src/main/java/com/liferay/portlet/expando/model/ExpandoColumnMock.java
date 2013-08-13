
package com.liferay.portlet.expando.model;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

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
public class ExpandoColumnMock
    extends MockService<ExpandoColumn>
    implements ExpandoColumn
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.expando.model.ExpandoColumn.class));
    }

    public Serializable getDefaultValue() {
        return this.mockObject.getDefaultValue();
    }

    public String getDisplayName(Locale param0) {
        return this.mockObject.getDisplayName(param0);
    }

    public String getTypeSettings() {
        return this.mockObject.getTypeSettings();
    }

    public UnicodeProperties getTypeSettingsProperties() {
        return this.mockObject.getTypeSettingsProperties();
    }

    public void setTypeSettings(String param0) {
    }

    public void setTypeSettingsProperties(UnicodeProperties param0) {
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

    public int compareTo(ExpandoColumn param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public int getType() {
        return this.mockObject.getType();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public void setPrimaryKey(long param0) {
    }

    public boolean isNew() {
        return this.mockObject.isNew();
    }

    public void setNew(boolean param0) {
    }

    public boolean isCachedModel() {
        return this.mockObject.isCachedModel();
    }

    public void setCachedModel(boolean param0) {
    }

    public boolean isEscapedModel() {
        return this.mockObject.isEscapedModel();
    }

    public Serializable getPrimaryKeyObj() {
        return this.mockObject.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(Serializable param0) {
    }

    public ExpandoBridge getExpandoBridge() {
        return this.mockObject.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public CacheModel<ExpandoColumn> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public ExpandoColumn toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setCompanyId(long param0) {
    }

    public void setType(int param0) {
    }

    public long getColumnId() {
        return this.mockObject.getColumnId();
    }

    public void setColumnId(long param0) {
    }

    public long getTableId() {
        return this.mockObject.getTableId();
    }

    public void setTableId(long param0) {
    }

    public String getDefaultData() {
        return this.mockObject.getDefaultData();
    }

    public void setDefaultData(String param0) {
    }

    public Map<String, Object> getModelAttributes() {
        return this.mockObject.getModelAttributes();
    }

    public void resetOriginalValues() {
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
