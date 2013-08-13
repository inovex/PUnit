
package com.liferay.portlet.wiki.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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
public class WikiPageMock
    extends MockService<WikiPage>
    implements WikiPage
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.wiki.model.WikiPage.class));
    }

    public WikiNode getNode() {
        return this.mockObject.getNode();
    }

    public boolean isResourceMain() {
        return this.mockObject.isResourceMain();
    }

    public String getAttachmentsDir() {
        return this.mockObject.getAttachmentsDir();
    }

    public String[] getAttachmentsFiles()
        throws PortalException, SystemException
    {
        return this.mockObject.getAttachmentsFiles();
    }

    public void setAttachmentsDir(String param0) {
    }

    public List<WikiPage> getChildPages() {
        return this.mockObject.getChildPages();
    }

    public WikiPage getParentPage() {
        return this.mockObject.getParentPage();
    }

    public List<WikiPage> getParentPages() {
        return this.mockObject.getParentPages();
    }

    public WikiPage getRedirectPage() {
        return this.mockObject.getRedirectPage();
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

    public int compareTo(WikiPage param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getContent() {
        return this.mockObject.getContent();
    }

    public void setHead(boolean param0) {
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

    public CacheModel<WikiPage> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public WikiPage toEscapedModel() {
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

    public String getFormat() {
        return this.mockObject.getFormat();
    }

    public String getTitle() {
        return this.mockObject.getTitle();
    }

    public void setTitle(String param0) {
    }

    public boolean getHead() {
        return this.mockObject.getHead();
    }

    public boolean isHead() {
        return this.mockObject.isHead();
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

    public double getVersion() {
        return this.mockObject.getVersion();
    }

    public void setContent(String param0) {
    }

    public String getSummary() {
        return this.mockObject.getSummary();
    }

    public void setSummary(String param0) {
    }

    public void setVersion(double param0) {
    }

    public long getResourcePrimKey() {
        return this.mockObject.getResourcePrimKey();
    }

    public void setResourcePrimKey(long param0) {
    }

    public void setFormat(String param0) {
    }

    public long getNodeId() {
        return this.mockObject.getNodeId();
    }

    public void setNodeId(long param0) {
    }

    public long getPageId() {
        return this.mockObject.getPageId();
    }

    public void setPageId(long param0) {
    }

    public boolean getMinorEdit() {
        return this.mockObject.getMinorEdit();
    }

    public boolean isMinorEdit() {
        return this.mockObject.isMinorEdit();
    }

    public void setMinorEdit(boolean param0) {
    }

    public String getParentTitle() {
        return this.mockObject.getParentTitle();
    }

    public void setParentTitle(String param0) {
    }

    public String getRedirectTitle() {
        return this.mockObject.getRedirectTitle();
    }

    public void setRedirectTitle(String param0) {
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
