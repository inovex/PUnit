
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
public class ContactMock
    extends MockService<Contact>
    implements Contact
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Contact.class));
    }

    public String getFullName() {
        return this.mockObject.getFullName();
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

    public int compareTo(Contact param0) {
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

    public CacheModel<Contact> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Contact toEscapedModel() {
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

    public String getUserName() {
        return this.mockObject.getUserName();
    }

    public long getAccountId() {
        return this.mockObject.getAccountId();
    }

    public void setAccountId(long param0) {
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

    public Date getBirthday() {
        return this.mockObject.getBirthday();
    }

    public boolean getMale() {
        return this.mockObject.getMale();
    }

    public boolean isMale() {
        return this.mockObject.isMale();
    }

    public long getContactId() {
        return this.mockObject.getContactId();
    }

    public void setContactId(long param0) {
    }

    public String getFirstName() {
        return this.mockObject.getFirstName();
    }

    public void setFirstName(String param0) {
    }

    public String getMiddleName() {
        return this.mockObject.getMiddleName();
    }

    public void setMiddleName(String param0) {
    }

    public String getLastName() {
        return this.mockObject.getLastName();
    }

    public void setLastName(String param0) {
    }

    public String getJobTitle() {
        return this.mockObject.getJobTitle();
    }

    public void setJobTitle(String param0) {
    }

    public long getParentContactId() {
        return this.mockObject.getParentContactId();
    }

    public void setParentContactId(long param0) {
    }

    public int getPrefixId() {
        return this.mockObject.getPrefixId();
    }

    public void setPrefixId(int param0) {
    }

    public int getSuffixId() {
        return this.mockObject.getSuffixId();
    }

    public void setSuffixId(int param0) {
    }

    public void setMale(boolean param0) {
    }

    public void setBirthday(Date param0) {
    }

    public String getSmsSn() {
        return this.mockObject.getSmsSn();
    }

    public void setSmsSn(String param0) {
    }

    public String getAimSn() {
        return this.mockObject.getAimSn();
    }

    public void setAimSn(String param0) {
    }

    public String getFacebookSn() {
        return this.mockObject.getFacebookSn();
    }

    public void setFacebookSn(String param0) {
    }

    public String getIcqSn() {
        return this.mockObject.getIcqSn();
    }

    public void setIcqSn(String param0) {
    }

    public String getJabberSn() {
        return this.mockObject.getJabberSn();
    }

    public void setJabberSn(String param0) {
    }

    public String getMsnSn() {
        return this.mockObject.getMsnSn();
    }

    public void setMsnSn(String param0) {
    }

    public String getMySpaceSn() {
        return this.mockObject.getMySpaceSn();
    }

    public void setMySpaceSn(String param0) {
    }

    public String getSkypeSn() {
        return this.mockObject.getSkypeSn();
    }

    public void setSkypeSn(String param0) {
    }

    public String getTwitterSn() {
        return this.mockObject.getTwitterSn();
    }

    public void setTwitterSn(String param0) {
    }

    public String getYmSn() {
        return this.mockObject.getYmSn();
    }

    public void setYmSn(String param0) {
    }

    public String getEmployeeStatusId() {
        return this.mockObject.getEmployeeStatusId();
    }

    public void setEmployeeStatusId(String param0) {
    }

    public String getEmployeeNumber() {
        return this.mockObject.getEmployeeNumber();
    }

    public void setEmployeeNumber(String param0) {
    }

    public String getJobClass() {
        return this.mockObject.getJobClass();
    }

    public void setJobClass(String param0) {
    }

    public String getHoursOfOperation() {
        return this.mockObject.getHoursOfOperation();
    }

    public void setHoursOfOperation(String param0) {
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
