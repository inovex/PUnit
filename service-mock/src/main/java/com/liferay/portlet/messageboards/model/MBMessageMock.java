
package com.liferay.portlet.messageboards.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;
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
public class MBMessageMock
    extends MockService<MBMessage>
    implements MBMessage
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.model.MBMessage.class));
    }

    public List<FileEntry> getAttachmentsFileEntries(int param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getAttachmentsFileEntries(param0, param1);
    }

    public List<FileEntry> getAttachmentsFileEntries()
        throws PortalException, SystemException
    {
        return this.mockObject.getAttachmentsFileEntries();
    }

    public Folder addAttachmentsFolder()
        throws PortalException, SystemException
    {
        return this.mockObject.addAttachmentsFolder();
    }

    public int getAttachmentsFileEntriesCount()
        throws PortalException, SystemException
    {
        return this.mockObject.getAttachmentsFileEntriesCount();
    }

    public long getAttachmentsFolderId()
        throws PortalException, SystemException
    {
        return this.mockObject.getAttachmentsFolderId();
    }

    public int getDeletedAttachmentsFileEntriesCount()
        throws PortalException, SystemException
    {
        return this.mockObject.getDeletedAttachmentsFileEntriesCount();
    }

    public MBThread getThread()
        throws PortalException, SystemException
    {
        return this.mockObject.getThread();
    }

    public long getThreadAttachmentsFolderId()
        throws PortalException, SystemException
    {
        return this.mockObject.getThreadAttachmentsFolderId();
    }

    public String getWorkflowClassName() {
        return this.mockObject.getWorkflowClassName();
    }

    public boolean isDiscussion() {
        return this.mockObject.isDiscussion();
    }

    public boolean isFormatBBCode() {
        return this.mockObject.isFormatBBCode();
    }

    public boolean isReply() {
        return this.mockObject.isReply();
    }

    public void setAttachmentsFolderId(long param0) {
    }

    public List<FileEntry> getDeletedAttachmentsFileEntries(int param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDeletedAttachmentsFileEntries(param0, param1);
    }

    public List<FileEntry> getDeletedAttachmentsFileEntries()
        throws PortalException, SystemException
    {
        return this.mockObject.getDeletedAttachmentsFileEntries();
    }

    public String getBody(boolean param0) {
        return this.mockObject.getBody(param0);
    }

    public MBCategory getCategory()
        throws PortalException, SystemException
    {
        return this.mockObject.getCategory();
    }

    public String[] getAssetTagNames()
        throws SystemException
    {
        return this.mockObject.getAssetTagNames();
    }

    public boolean isRoot() {
        return this.mockObject.isRoot();
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

    public int compareTo(MBMessage param0) {
        return this.mockObject.compareTo(param0);
    }

    public void setPriority(double param0) {
    }

    public double getPriority() {
        return this.mockObject.getPriority();
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

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public MBMessage toEscapedModel() {
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

    public CacheModel<MBMessage> toCacheModel() {
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

    public String getUuid() {
        return this.mockObject.getUuid();
    }

    public void setUuid(String param0) {
    }

    public long getClassPK() {
        return this.mockObject.getClassPK();
    }

    public long getCategoryId() {
        return this.mockObject.getCategoryId();
    }

    public void setCategoryId(long param0) {
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

    public boolean getAllowPingbacks() {
        return this.mockObject.getAllowPingbacks();
    }

    public boolean isAllowPingbacks() {
        return this.mockObject.isAllowPingbacks();
    }

    public void setAllowPingbacks(boolean param0) {
    }

    public TrashEntry getTrashEntry()
        throws PortalException, SystemException
    {
        return this.mockObject.getTrashEntry();
    }

    public long getTrashEntryClassPK() {
        return this.mockObject.getTrashEntryClassPK();
    }

    public TrashHandler getTrashHandler() {
        return this.mockObject.getTrashHandler();
    }

    public boolean isInTrash() {
        return this.mockObject.isInTrash();
    }

    public boolean isInTrashContainer() {
        return this.mockObject.isInTrashContainer();
    }

    public void setMessageId(long param0) {
    }

    public long getRootMessageId() {
        return this.mockObject.getRootMessageId();
    }

    public void setRootMessageId(long param0) {
    }

    public long getMessageId() {
        return this.mockObject.getMessageId();
    }

    public long getParentMessageId() {
        return this.mockObject.getParentMessageId();
    }

    public void setParentMessageId(long param0) {
    }

    public String getSubject() {
        return this.mockObject.getSubject();
    }

    public void setSubject(String param0) {
    }

    public void setBody(String param0) {
    }

    public void setFormat(String param0) {
    }

    public boolean getAnonymous() {
        return this.mockObject.getAnonymous();
    }

    public void setAnonymous(boolean param0) {
    }

    public boolean getAnswer() {
        return this.mockObject.getAnswer();
    }

    public boolean isAnswer() {
        return this.mockObject.isAnswer();
    }

    public void setAnswer(boolean param0) {
    }

    public boolean isAnonymous() {
        return this.mockObject.isAnonymous();
    }

    public long getThreadId() {
        return this.mockObject.getThreadId();
    }

    public void setThreadId(long param0) {
    }

    public String getBody() {
        return this.mockObject.getBody();
    }

    public void setClassNameId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public MBMessage toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
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

    public String getFormat() {
        return this.mockObject.getFormat();
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

    public StagedModelType getStagedModelType() {
        return this.mockObject.getStagedModelType();
    }

    public void persist()
        throws SystemException
    {
    }

}
