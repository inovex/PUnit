
package com.liferay.portlet.softwarecatalog.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
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
public class SCProductEntryMock
    extends MockService<SCProductEntry>
    implements SCProductEntry
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.softwarecatalog.model.SCProductEntry.class));
    }

    public List<SCLicense> getLicenses()
        throws SystemException
    {
        return this.mockObject.getLicenses();
    }

    public SCProductVersion getLatestVersion()
        throws SystemException
    {
        return this.mockObject.getLatestVersion();
    }

    public List<SCProductScreenshot> getScreenshots()
        throws SystemException
    {
        return this.mockObject.getScreenshots();
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

    public int compareTo(SCProductEntry param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public String getType() {
        return this.mockObject.getType();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public void setGroupId(long param0) {
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
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

    public SCProductEntry toEscapedModel() {
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

    public CacheModel<SCProductEntry> toCacheModel() {
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

    public String getAuthor() {
        return this.mockObject.getAuthor();
    }

    public String getLongDescription() {
        return this.mockObject.getLongDescription();
    }

    public String getPageURL() {
        return this.mockObject.getPageURL();
    }

    public String getTags() {
        return this.mockObject.getTags();
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

    public void setType(String param0) {
    }

    public String getShortDescription() {
        return this.mockObject.getShortDescription();
    }

    public void setAuthor(String param0) {
    }

    public void setLongDescription(String param0) {
    }

    public void setPageURL(String param0) {
    }

    public void setShortDescription(String param0) {
    }

    public void setTags(String param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public long getProductEntryId() {
        return this.mockObject.getProductEntryId();
    }

    public void setProductEntryId(long param0) {
    }

    public String getRepoGroupId() {
        return this.mockObject.getRepoGroupId();
    }

    public void setRepoGroupId(String param0) {
    }

    public String getRepoArtifactId() {
        return this.mockObject.getRepoArtifactId();
    }

    public void setRepoArtifactId(String param0) {
    }

    public SCProductEntry toUnescapedModel() {
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
