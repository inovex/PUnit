
package com.liferay.portlet.documentlibrary.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.model.CacheModel;
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
public class DLFileShortcutMock
    extends MockService<DLFileShortcut>
    implements DLFileShortcut
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.model.DLFileShortcut.class));
    }

    public Folder getFolder() {
        return this.mockObject.getFolder();
    }

    public String getToTitle() {
        return this.mockObject.getToTitle();
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

    public int compareTo(DLFileShortcut param0) {
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

    public CacheModel<DLFileShortcut> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public DLFileShortcut toEscapedModel() {
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

    public int getStatus() {
        return this.mockObject.getStatus();
    }

    public void setStatus(int param0) {
    }

    public long getStatusByUserId() {
        return this.mockObject.getStatusByUserId();
    }

    public void setStatusByUserId(long param0) {
    }

    public String getStatusByUserUuid()
        throws SystemException
    {
        return this.mockObject.getStatusByUserUuid();
    }

    public void setStatusByUserUuid(String param0) {
    }

    public String getStatusByUserName() {
        return this.mockObject.getStatusByUserName();
    }

    public void setStatusByUserName(String param0) {
    }

    public Date getStatusDate() {
        return this.mockObject.getStatusDate();
    }

    public void setStatusDate(Date param0) {
    }

    public boolean getApproved() {
        return this.mockObject.getApproved();
    }

    public boolean isApproved() {
        return this.mockObject.isApproved();
    }

    public boolean isDenied() {
        return this.mockObject.isDenied();
    }

    public boolean isDraft() {
        return this.mockObject.isDraft();
    }

    public boolean isExpired() {
        return this.mockObject.isExpired();
    }

    public boolean isInactive() {
        return this.mockObject.isInactive();
    }

    public boolean isIncomplete() {
        return this.mockObject.isIncomplete();
    }

    public boolean isPending() {
        return this.mockObject.isPending();
    }

    public boolean isScheduled() {
        return this.mockObject.isScheduled();
    }

    public long getRepositoryId() {
        return this.mockObject.getRepositoryId();
    }

    public void setRepositoryId(long param0) {
    }

    public long getFolderId() {
        return this.mockObject.getFolderId();
    }

    public void setFolderId(long param0) {
    }

    public long getFileShortcutId() {
        return this.mockObject.getFileShortcutId();
    }

    public void setFileShortcutId(long param0) {
    }

    public long getToFileEntryId() {
        return this.mockObject.getToFileEntryId();
    }

    public void setToFileEntryId(long param0) {
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
