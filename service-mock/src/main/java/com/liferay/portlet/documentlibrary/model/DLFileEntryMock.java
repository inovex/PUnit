
package com.liferay.portlet.documentlibrary.model;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Lock;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
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
public class DLFileEntryMock
    extends MockService<DLFileEntry>
    implements DLFileEntry
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.model.DLFileEntry.class));
    }

    public DLFileVersion getFileVersion(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileVersion(param0);
    }

    public DLFileVersion getFileVersion()
        throws PortalException, SystemException
    {
        return this.mockObject.getFileVersion();
    }

    public DLFolder getFolder()
        throws PortalException, SystemException
    {
        return this.mockObject.getFolder();
    }

    public InputStream getContentStream()
        throws PortalException, SystemException
    {
        return this.mockObject.getContentStream();
    }

    public InputStream getContentStream(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getContentStream(param0);
    }

    public long getDataRepositoryId() {
        return this.mockObject.getDataRepositoryId();
    }

    public boolean isCheckedOut() {
        return this.mockObject.isCheckedOut();
    }

    public Map<String, Fields> getFieldsMap(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldsMap(param0);
    }

    public UnicodeProperties getExtraSettingsProperties() {
        return this.mockObject.getExtraSettingsProperties();
    }

    public List<DLFileVersion> getFileVersions(int param0)
        throws SystemException
    {
        return this.mockObject.getFileVersions(param0);
    }

    public int getFileVersionsCount(int param0)
        throws SystemException
    {
        return this.mockObject.getFileVersionsCount(param0);
    }

    public DLFileVersion getLatestFileVersion(boolean param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestFileVersion(param0);
    }

    public String getLuceneProperties() {
        return this.mockObject.getLuceneProperties();
    }

    public long getVersionUserId() {
        return this.mockObject.getVersionUserId();
    }

    public String getVersionUserName() {
        return this.mockObject.getVersionUserName();
    }

    public String getVersionUserUuid() {
        return this.mockObject.getVersionUserUuid();
    }

    public boolean isInHiddenFolder() {
        return this.mockObject.isInHiddenFolder();
    }

    public void setExtraSettingsProperties(UnicodeProperties param0) {
    }

    public String getIcon() {
        return this.mockObject.getIcon();
    }

    public Lock getLock() {
        return this.mockObject.getLock();
    }

    public String buildTreePath()
        throws PortalException, SystemException
    {
        return this.mockObject.buildTreePath();
    }

    public boolean hasLock() {
        return this.mockObject.hasLock();
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

    public int compareTo(DLFileEntry param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public long getSize() {
        return this.mockObject.getSize();
    }

    public String getClassName() {
        return this.mockObject.getClassName();
    }

    public void setSize(long param0) {
    }

    public String getExtension() {
        return this.mockObject.getExtension();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public String getDescription() {
        return this.mockObject.getDescription();
    }

    public void setGroupId(long param0) {
    }

    public long getFolderId() {
        return this.mockObject.getFolderId();
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public int getStatus() {
        return this.mockObject.getStatus();
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

    public DLFileEntry toEscapedModel() {
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

    public CacheModel<DLFileEntry> toCacheModel() {
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

    public void setExtension(String param0) {
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

    public long getSmallImageId() {
        return this.mockObject.getSmallImageId();
    }

    public void setSmallImageId(long param0) {
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

    public long getFileEntryId() {
        return this.mockObject.getFileEntryId();
    }

    public void setFileEntryId(long param0) {
    }

    public String getExtraSettings() {
        return this.mockObject.getExtraSettings();
    }

    public int getReadCount() {
        return this.mockObject.getReadCount();
    }

    public void setExtraSettings(String param0) {
    }

    public long getFileEntryTypeId() {
        return this.mockObject.getFileEntryTypeId();
    }

    public void setFileEntryTypeId(long param0) {
    }

    public void setReadCount(int param0) {
    }

    public long getLargeImageId() {
        return this.mockObject.getLargeImageId();
    }

    public void setLargeImageId(long param0) {
    }

    public long getCustom1ImageId() {
        return this.mockObject.getCustom1ImageId();
    }

    public void setCustom1ImageId(long param0) {
    }

    public long getCustom2ImageId() {
        return this.mockObject.getCustom2ImageId();
    }

    public void setCustom2ImageId(long param0) {
    }

    public void setFolderId(long param0) {
    }

    public void setVersion(String param0) {
    }

    public void setMimeType(String param0) {
    }

    public boolean getManualCheckInRequired() {
        return this.mockObject.getManualCheckInRequired();
    }

    public boolean isManualCheckInRequired() {
        return this.mockObject.isManualCheckInRequired();
    }

    public void setManualCheckInRequired(boolean param0) {
    }

    public void setRepositoryId(long param0) {
    }

    public String getVersion() {
        return this.mockObject.getVersion();
    }

    public String getMimeType() {
        return this.mockObject.getMimeType();
    }

    public void setClassNameId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public String getTitle() {
        return this.mockObject.getTitle();
    }

    public void setTitle(String param0) {
    }

    public DLFileEntry toUnescapedModel() {
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

    public void setTreePath(String param0) {
    }

    public void setDescription(String param0) {
    }

    public String getTreePath() {
        return this.mockObject.getTreePath();
    }

    public long getRepositoryId() {
        return this.mockObject.getRepositoryId();
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

    public void updateTreePath(String param0)
        throws SystemException
    {
    }

}
