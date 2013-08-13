
package com.liferay.portlet.messageboards.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Lock;
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
public class MBThreadMock
    extends MockService<MBThread>
    implements MBThread
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.model.MBThread.class));
    }

    public boolean isLocked() {
        return this.mockObject.isLocked();
    }

    public Lock getLock() {
        return this.mockObject.getLock();
    }

    public boolean hasLock(long param0) {
        return this.mockObject.hasLock(param0);
    }

    public String getAttachmentsDir() {
        return this.mockObject.getAttachmentsDir();
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

    public int compareTo(MBThread param0) {
        return this.mockObject.compareTo(param0);
    }

    public void setPriority(double param0) {
    }

    public double getPriority() {
        return this.mockObject.getPriority();
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

    public CacheModel<MBThread> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public MBThread toEscapedModel() {
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

    public long getCategoryId() {
        return this.mockObject.getCategoryId();
    }

    public void setCategoryId(long param0) {
    }

    public int getViewCount() {
        return this.mockObject.getViewCount();
    }

    public void setViewCount(int param0) {
    }

    public Date getLastPostDate() {
        return this.mockObject.getLastPostDate();
    }

    public void setLastPostDate(Date param0) {
    }

    public int getMessageCount() {
        return this.mockObject.getMessageCount();
    }

    public void setMessageCount(int param0) {
    }

    public long getThreadId() {
        return this.mockObject.getThreadId();
    }

    public void setThreadId(long param0) {
    }

    public long getRootMessageId() {
        return this.mockObject.getRootMessageId();
    }

    public void setRootMessageId(long param0) {
    }

    public long getRootMessageUserId() {
        return this.mockObject.getRootMessageUserId();
    }

    public void setRootMessageUserId(long param0) {
    }

    public String getRootMessageUserUuid()
        throws SystemException
    {
        return this.mockObject.getRootMessageUserUuid();
    }

    public void setRootMessageUserUuid(String param0) {
    }

    public long getLastPostByUserId() {
        return this.mockObject.getLastPostByUserId();
    }

    public void setLastPostByUserId(long param0) {
    }

    public String getLastPostByUserUuid()
        throws SystemException
    {
        return this.mockObject.getLastPostByUserUuid();
    }

    public void setLastPostByUserUuid(String param0) {
    }

    public boolean getQuestion() {
        return this.mockObject.getQuestion();
    }

    public boolean isQuestion() {
        return this.mockObject.isQuestion();
    }

    public void setQuestion(boolean param0) {
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
