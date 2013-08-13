
package com.liferay.portlet.journal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
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
public class JournalFeedMock
    extends MockService<JournalFeed>
    implements JournalFeed
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.model.JournalFeed.class));
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

    public int compareTo(JournalFeed param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public long getId() {
        return this.mockObject.getId();
    }

    public void setName(String param0) {
    }

    public String getType() {
        return this.mockObject.getType();
    }

    public String getDescription() {
        return this.mockObject.getDescription();
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

    public CacheModel<JournalFeed> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public JournalFeed toEscapedModel() {
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

    public void setId(long param0) {
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

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setGroupId(long param0) {
    }

    public void setDescription(String param0) {
    }

    public String getOrderByCol() {
        return this.mockObject.getOrderByCol();
    }

    public String getOrderByType() {
        return this.mockObject.getOrderByType();
    }

    public String getStructureId() {
        return this.mockObject.getStructureId();
    }

    public void setStructureId(String param0) {
    }

    public String getTemplateId() {
        return this.mockObject.getTemplateId();
    }

    public void setTemplateId(String param0) {
    }

    public String getFeedId() {
        return this.mockObject.getFeedId();
    }

    public void setFeedId(String param0) {
    }

    public String getRendererTemplateId() {
        return this.mockObject.getRendererTemplateId();
    }

    public void setRendererTemplateId(String param0) {
    }

    public int getDelta() {
        return this.mockObject.getDelta();
    }

    public void setDelta(int param0) {
    }

    public void setOrderByCol(String param0) {
    }

    public void setOrderByType(String param0) {
    }

    public String getTargetLayoutFriendlyUrl() {
        return this.mockObject.getTargetLayoutFriendlyUrl();
    }

    public void setTargetLayoutFriendlyUrl(String param0) {
    }

    public String getTargetPortletId() {
        return this.mockObject.getTargetPortletId();
    }

    public void setTargetPortletId(String param0) {
    }

    public String getContentField() {
        return this.mockObject.getContentField();
    }

    public void setContentField(String param0) {
    }

    public String getFeedType() {
        return this.mockObject.getFeedType();
    }

    public void setFeedType(String param0) {
    }

    public double getFeedVersion() {
        return this.mockObject.getFeedVersion();
    }

    public void setFeedVersion(double param0) {
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
