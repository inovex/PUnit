
package com.liferay.portlet.shopping.model;

import java.io.Serializable;
import java.util.Date;
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
public class ShoppingOrderMock
    extends MockService<ShoppingOrder>
    implements ShoppingOrder
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.model.ShoppingOrder.class));
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

    public int compareTo(ShoppingOrder param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getNumber() {
        return this.mockObject.getNumber();
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

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public ShoppingOrder toEscapedModel() {
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

    public CacheModel<ShoppingOrder> toCacheModel() {
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

    public void setOrderId(long param0) {
    }

    public double getShipping() {
        return this.mockObject.getShipping();
    }

    public void setShipping(double param0) {
    }

    public boolean getRequiresShipping() {
        return this.mockObject.getRequiresShipping();
    }

    public boolean isRequiresShipping() {
        return this.mockObject.isRequiresShipping();
    }

    public void setRequiresShipping(boolean param0) {
    }

    public long getOrderId() {
        return this.mockObject.getOrderId();
    }

    public String getCouponCodes() {
        return this.mockObject.getCouponCodes();
    }

    public void setCouponCodes(String param0) {
    }

    public String getAltShipping() {
        return this.mockObject.getAltShipping();
    }

    public void setAltShipping(String param0) {
    }

    public boolean getInsure() {
        return this.mockObject.getInsure();
    }

    public boolean isInsure() {
        return this.mockObject.isInsure();
    }

    public void setInsure(boolean param0) {
    }

    public void setNumber(String param0) {
    }

    public void setInsurance(double param0) {
    }

    public double getCouponDiscount() {
        return this.mockObject.getCouponDiscount();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public String getComments() {
        return this.mockObject.getComments();
    }

    public void setComments(String param0) {
    }

    public ShoppingOrder toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setTax(double param0) {
    }

    public double getInsurance() {
        return this.mockObject.getInsurance();
    }

    public double getTax() {
        return this.mockObject.getTax();
    }

    public String getBillingStreet() {
        return this.mockObject.getBillingStreet();
    }

    public void setBillingStreet(String param0) {
    }

    public String getBillingCity() {
        return this.mockObject.getBillingCity();
    }

    public void setBillingCity(String param0) {
    }

    public String getBillingState() {
        return this.mockObject.getBillingState();
    }

    public void setBillingState(String param0) {
    }

    public String getBillingZip() {
        return this.mockObject.getBillingZip();
    }

    public void setBillingZip(String param0) {
    }

    public String getBillingCountry() {
        return this.mockObject.getBillingCountry();
    }

    public void setBillingCountry(String param0) {
    }

    public String getBillingPhone() {
        return this.mockObject.getBillingPhone();
    }

    public void setBillingPhone(String param0) {
    }

    public boolean getShipToBilling() {
        return this.mockObject.getShipToBilling();
    }

    public boolean isShipToBilling() {
        return this.mockObject.isShipToBilling();
    }

    public void setShipToBilling(boolean param0) {
    }

    public String getShippingFirstName() {
        return this.mockObject.getShippingFirstName();
    }

    public void setShippingFirstName(String param0) {
    }

    public String getShippingLastName() {
        return this.mockObject.getShippingLastName();
    }

    public void setShippingLastName(String param0) {
    }

    public String getShippingEmailAddress() {
        return this.mockObject.getShippingEmailAddress();
    }

    public void setShippingEmailAddress(String param0) {
    }

    public String getShippingCompany() {
        return this.mockObject.getShippingCompany();
    }

    public void setShippingCompany(String param0) {
    }

    public String getShippingStreet() {
        return this.mockObject.getShippingStreet();
    }

    public void setShippingStreet(String param0) {
    }

    public String getShippingCity() {
        return this.mockObject.getShippingCity();
    }

    public void setShippingCity(String param0) {
    }

    public String getShippingState() {
        return this.mockObject.getShippingState();
    }

    public void setShippingState(String param0) {
    }

    public String getShippingZip() {
        return this.mockObject.getShippingZip();
    }

    public void setShippingZip(String param0) {
    }

    public String getShippingCountry() {
        return this.mockObject.getShippingCountry();
    }

    public void setShippingCountry(String param0) {
    }

    public String getShippingPhone() {
        return this.mockObject.getShippingPhone();
    }

    public void setShippingPhone(String param0) {
    }

    public String getCcName() {
        return this.mockObject.getCcName();
    }

    public void setCcName(String param0) {
    }

    public String getCcType() {
        return this.mockObject.getCcType();
    }

    public void setCcType(String param0) {
    }

    public String getCcNumber() {
        return this.mockObject.getCcNumber();
    }

    public void setCcNumber(String param0) {
    }

    public int getCcExpMonth() {
        return this.mockObject.getCcExpMonth();
    }

    public void setCcExpMonth(int param0) {
    }

    public int getCcExpYear() {
        return this.mockObject.getCcExpYear();
    }

    public void setCcExpYear(int param0) {
    }

    public String getCcVerNumber() {
        return this.mockObject.getCcVerNumber();
    }

    public void setCcVerNumber(String param0) {
    }

    public String getPpTxnId() {
        return this.mockObject.getPpTxnId();
    }

    public void setPpTxnId(String param0) {
    }

    public String getPpPaymentStatus() {
        return this.mockObject.getPpPaymentStatus();
    }

    public void setPpPaymentStatus(String param0) {
    }

    public double getPpPaymentGross() {
        return this.mockObject.getPpPaymentGross();
    }

    public void setPpPaymentGross(double param0) {
    }

    public String getPpReceiverEmail() {
        return this.mockObject.getPpReceiverEmail();
    }

    public void setPpReceiverEmail(String param0) {
    }

    public String getPpPayerEmail() {
        return this.mockObject.getPpPayerEmail();
    }

    public void setPpPayerEmail(String param0) {
    }

    public boolean getSendOrderEmail() {
        return this.mockObject.getSendOrderEmail();
    }

    public boolean isSendOrderEmail() {
        return this.mockObject.isSendOrderEmail();
    }

    public void setSendOrderEmail(boolean param0) {
    }

    public boolean getSendShippingEmail() {
        return this.mockObject.getSendShippingEmail();
    }

    public boolean isSendShippingEmail() {
        return this.mockObject.isSendShippingEmail();
    }

    public void setSendShippingEmail(boolean param0) {
    }

    public void setCompanyId(long param0) {
    }

    public void setCouponDiscount(double param0) {
    }

    public String getBillingFirstName() {
        return this.mockObject.getBillingFirstName();
    }

    public void setBillingFirstName(String param0) {
    }

    public String getBillingLastName() {
        return this.mockObject.getBillingLastName();
    }

    public void setBillingLastName(String param0) {
    }

    public String getBillingEmailAddress() {
        return this.mockObject.getBillingEmailAddress();
    }

    public void setBillingEmailAddress(String param0) {
    }

    public String getBillingCompany() {
        return this.mockObject.getBillingCompany();
    }

    public void setBillingCompany(String param0) {
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
