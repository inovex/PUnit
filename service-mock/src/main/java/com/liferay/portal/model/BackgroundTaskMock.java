
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
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
public class BackgroundTaskMock
    extends MockService<BackgroundTask>
    implements BackgroundTask
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.BackgroundTask.class));
    }

    public List<FileEntry> getAttachmentsFileEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAttachmentsFileEntries(param0, param1);
    }

    public List<FileEntry> getAttachmentsFileEntries()
        throws SystemException
    {
        return this.mockObject.getAttachmentsFileEntries();
    }

    public boolean isInProgress() {
        return this.mockObject.isInProgress();
    }

    public Folder addAttachmentsFolder()
        throws PortalException, SystemException
    {
        return this.mockObject.addAttachmentsFolder();
    }

    public int getAttachmentsFileEntriesCount()
        throws SystemException
    {
        return this.mockObject.getAttachmentsFileEntriesCount();
    }

    public long getAttachmentsFolderId()
        throws SystemException
    {
        return this.mockObject.getAttachmentsFolderId();
    }

    public String getStatusLabel() {
        return this.mockObject.getStatusLabel();
    }

    public Map<String, Serializable> getTaskContextMap() {
        return this.mockObject.getTaskContextMap();
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

    public int compareTo(BackgroundTask param0) {
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

    public long getBackgroundTaskId() {
        return this.mockObject.getBackgroundTaskId();
    }

    public void setGroupId(long param0) {
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setBackgroundTaskId(long param0) {
    }

    public String getServletContextNames() {
        return this.mockObject.getServletContextNames();
    }

    public void setServletContextNames(String param0) {
    }

    public String getTaskExecutorClassName() {
        return this.mockObject.getTaskExecutorClassName();
    }

    public void setTaskExecutorClassName(String param0) {
    }

    public String getTaskContext() {
        return this.mockObject.getTaskContext();
    }

    public void setTaskContext(String param0) {
    }

    public boolean getCompleted() {
        return this.mockObject.getCompleted();
    }

    public boolean isCompleted() {
        return this.mockObject.isCompleted();
    }

    public void setCompleted(boolean param0) {
    }

    public Date getCompletionDate() {
        return this.mockObject.getCompletionDate();
    }

    public void setCompletionDate(Date param0) {
    }

    public int getStatus() {
        return this.mockObject.getStatus();
    }

    public void setStatus(int param0) {
    }

    public String getStatusMessage() {
        return this.mockObject.getStatusMessage();
    }

    public void setStatusMessage(String param0) {
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

    public BackgroundTask toEscapedModel() {
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

    public CacheModel<BackgroundTask> toCacheModel() {
        return this.mockObject.toCacheModel();
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

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public BackgroundTask toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setCompanyId(long param0) {
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
