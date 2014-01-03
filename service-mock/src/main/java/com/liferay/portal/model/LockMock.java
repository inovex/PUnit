
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
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
public class LockMock
    extends MockService<Lock>
    implements Lock
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Lock.class));
    }

    public long getExpirationTime() {
        return this.mockObject.getExpirationTime();
    }

    public boolean isNeverExpires() {
        return this.mockObject.isNeverExpires();
    }

    public boolean isExpired() {
        return this.mockObject.isExpired();
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

    public int compareTo(Lock param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getKey() {
        return this.mockObject.getKey();
    }

    public String getClassName() {
        return this.mockObject.getClassName();
    }

    public String getOwner() {
        return this.mockObject.getOwner();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
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

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public Lock toEscapedModel() {
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

    public CacheModel<Lock> toCacheModel() {
        return this.mockObject.toCacheModel();
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

    public void setLockId(long param0) {
    }

    public void setOwner(String param0) {
    }

    public boolean getInheritable() {
        return this.mockObject.getInheritable();
    }

    public boolean isInheritable() {
        return this.mockObject.isInheritable();
    }

    public void setInheritable(boolean param0) {
    }

    public Date getExpirationDate() {
        return this.mockObject.getExpirationDate();
    }

    public long getLockId() {
        return this.mockObject.getLockId();
    }

    public void setExpirationDate(Date param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setKey(String param0) {
    }

    public Lock toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setClassName(String param0) {
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
