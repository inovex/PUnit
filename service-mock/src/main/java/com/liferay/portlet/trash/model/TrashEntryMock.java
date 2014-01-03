
package com.liferay.portlet.trash.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.TrashedModel;
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
public class TrashEntryMock
    extends MockService<TrashEntry>
    implements TrashEntry
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.trash.model.TrashEntry.class));
    }

    public boolean isTrashEntry(String param0, long param1) {
        return this.mockObject.isTrashEntry(param0, param1);
    }

    public boolean isTrashEntry(TrashedModel param0) {
        return this.mockObject.isTrashEntry(param0);
    }

    public boolean isTrashEntry(Class<?> param0, long param1) {
        return this.mockObject.isTrashEntry(param0, param1);
    }

    public void setRootEntry(TrashEntry param0) {
    }

    public TrashEntry getRootEntry() {
        return this.mockObject.getRootEntry();
    }

    public UnicodeProperties getTypeSettingsProperties() {
        return this.mockObject.getTypeSettingsProperties();
    }

    public String getTypeSettingsProperty(String param0, String param1) {
        return this.mockObject.getTypeSettingsProperty(param0, param1);
    }

    public String getTypeSettingsProperty(String param0) {
        return this.mockObject.getTypeSettingsProperty(param0);
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

    public int compareTo(TrashEntry param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getClassName() {
        return this.mockObject.getClassName();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public void setGroupId(long param0) {
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public int getStatus() {
        return this.mockObject.getStatus();
    }

    public void setStatus(int param0) {
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

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public TrashEntry toEscapedModel() {
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

    public CacheModel<TrashEntry> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public long getUserId() {
        return this.mockObject.getUserId();
    }

    public void setUserId(long param0) {
    }

    public long getClassPK() {
        return this.mockObject.getClassPK();
    }

    public void setEntryId(long param0) {
    }

    public long getEntryId() {
        return this.mockObject.getEntryId();
    }

    public String getUserName() {
        return this.mockObject.getUserName();
    }

    public String getUserUuid()
        throws SystemException
    {
        return this.mockObject.getUserUuid();
    }

    public void setUserUuid(String param0) {
    }

    public void setUserName(String param0) {
    }

    public void setSystemEventSetKey(long param0) {
    }

    public long getSystemEventSetKey() {
        return this.mockObject.getSystemEventSetKey();
    }

    public void setClassNameId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public TrashEntry toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setClassName(String param0) {
    }

    public void setClassPK(long param0) {
    }

    public void setCompanyId(long param0) {
    }

    public String getTypeSettings() {
        return this.mockObject.getTypeSettings();
    }

    public void setTypeSettings(String param0) {
    }

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
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
