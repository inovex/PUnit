
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
public class AddressMock
    extends MockService<Address>
    implements Address
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Address.class));
    }

    public ListType getType() {
        return this.mockObject.getType();
    }

    public Country getCountry() {
        return this.mockObject.getCountry();
    }

    public Region getRegion() {
        return this.mockObject.getRegion();
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

    public int compareTo(Address param0) {
        return this.mockObject.compareTo(param0);
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

    public CacheModel<Address> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Address toEscapedModel() {
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

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
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

    public long getAddressId() {
        return this.mockObject.getAddressId();
    }

    public void setAddressId(long param0) {
    }

    public void setClassNameId(long param0) {
    }

    public String getStreet1() {
        return this.mockObject.getStreet1();
    }

    public void setStreet1(String param0) {
    }

    public String getStreet2() {
        return this.mockObject.getStreet2();
    }

    public void setStreet2(String param0) {
    }

    public String getStreet3() {
        return this.mockObject.getStreet3();
    }

    public void setStreet3(String param0) {
    }

    public String getCity() {
        return this.mockObject.getCity();
    }

    public void setCity(String param0) {
    }

    public String getZip() {
        return this.mockObject.getZip();
    }

    public void setZip(String param0) {
    }

    public long getRegionId() {
        return this.mockObject.getRegionId();
    }

    public void setRegionId(long param0) {
    }

    public long getCountryId() {
        return this.mockObject.getCountryId();
    }

    public void setCountryId(long param0) {
    }

    public int getTypeId() {
        return this.mockObject.getTypeId();
    }

    public void setTypeId(int param0) {
    }

    public boolean getMailing() {
        return this.mockObject.getMailing();
    }

    public boolean isMailing() {
        return this.mockObject.isMailing();
    }

    public void setMailing(boolean param0) {
    }

    public boolean getPrimary() {
        return this.mockObject.getPrimary();
    }

    public boolean isPrimary() {
        return this.mockObject.isPrimary();
    }

    public void setPrimary(boolean param0) {
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
