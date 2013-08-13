
package com.liferay.portlet.social.model;

import java.io.Serializable;
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
public class SocialRequestMock
    extends MockService<SocialRequest>
    implements SocialRequest
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.model.SocialRequest.class));
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

    public int compareTo(SocialRequest param0) {
        return this.mockObject.compareTo(param0);
    }

    public int getType() {
        return this.mockObject.getType();
    }

    public String getClassName() {
        return this.mockObject.getClassName();
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

    public CacheModel<SocialRequest> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public SocialRequest toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public long getClassPK() {
        return this.mockObject.getClassPK();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setClassName(String param0) {
    }

    public void setClassPK(long param0) {
    }

    public void setCompanyId(long param0) {
    }

    public long getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(long param0) {
    }

    public long getModifiedDate() {
        return this.mockObject.getModifiedDate();
    }

    public void setModifiedDate(long param0) {
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

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public String getUserUuid()
        throws SystemException
    {
        return this.mockObject.getUserUuid();
    }

    public void setUserUuid(String param0) {
    }

    public void setType(int param0) {
    }

    public void setClassNameId(long param0) {
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

    public String getExtraData() {
        return this.mockObject.getExtraData();
    }

    public void setExtraData(String param0) {
    }

    public long getReceiverUserId() {
        return this.mockObject.getReceiverUserId();
    }

    public void setReceiverUserId(long param0) {
    }

    public String getReceiverUserUuid()
        throws SystemException
    {
        return this.mockObject.getReceiverUserUuid();
    }

    public void setReceiverUserUuid(String param0) {
    }

    public long getRequestId() {
        return this.mockObject.getRequestId();
    }

    public void setRequestId(long param0) {
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
