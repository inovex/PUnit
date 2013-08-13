
package com.liferay.portlet.dynamicdatalists.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatamapping.storage.Field;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
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
public class DDLRecordMock
    extends MockService<DDLRecord>
    implements DDLRecord
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatalists.model.DDLRecord.class));
    }

    public Field getField(String param0)
        throws PortalException
    {
        return this.mockObject.getField(param0);
    }

    public Fields getFields()
        throws PortalException
    {
        return this.mockObject.getFields();
    }

    public int getStatus()
        throws PortalException, SystemException
    {
        return this.mockObject.getStatus();
    }

    public Serializable getFieldDataType(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldDataType(param0);
    }

    public Serializable getFieldType(String param0)
        throws Exception
    {
        return this.mockObject.getFieldType(param0);
    }

    public DDLRecordVersion getLatestRecordVersion()
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestRecordVersion();
    }

    public DDLRecordVersion getRecordVersion()
        throws PortalException, SystemException
    {
        return this.mockObject.getRecordVersion();
    }

    public DDLRecordVersion getRecordVersion(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecordVersion(param0);
    }

    public Serializable getFieldValue(String param0)
        throws PortalException
    {
        return this.mockObject.getFieldValue(param0);
    }

    public DDLRecordSet getRecordSet()
        throws PortalException, SystemException
    {
        return this.mockObject.getRecordSet();
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

    public int compareTo(DDLRecord param0) {
        return this.mockObject.compareTo(param0);
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

    public CacheModel<DDLRecord> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public DDLRecord toEscapedModel() {
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

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public Date getModifiedDate() {
        return this.mockObject.getModifiedDate();
    }

    public void setModifiedDate(Date param0) {
    }

    public long getUserId() {
        return this.mockObject.getUserId();
    }

    public void setUserId(long param0) {
    }

    public String getUuid() {
        return this.mockObject.getUuid();
    }

    public void setUuid(String param0) {
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

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setGroupId(long param0) {
    }

    public String getVersion() {
        return this.mockObject.getVersion();
    }

    public void setVersion(String param0) {
    }

    public long getVersionUserId() {
        return this.mockObject.getVersionUserId();
    }

    public void setVersionUserId(long param0) {
    }

    public String getVersionUserUuid()
        throws SystemException
    {
        return this.mockObject.getVersionUserUuid();
    }

    public void setVersionUserUuid(String param0) {
    }

    public String getVersionUserName() {
        return this.mockObject.getVersionUserName();
    }

    public void setVersionUserName(String param0) {
    }

    public long getDDMStorageId() {
        return this.mockObject.getDDMStorageId();
    }

    public void setDDMStorageId(long param0) {
    }

    public long getRecordId() {
        return this.mockObject.getRecordId();
    }

    public void setRecordId(long param0) {
    }

    public long getRecordSetId() {
        return this.mockObject.getRecordSetId();
    }

    public void setRecordSetId(long param0) {
    }

    public int getDisplayIndex() {
        return this.mockObject.getDisplayIndex();
    }

    public void setDisplayIndex(int param0) {
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
