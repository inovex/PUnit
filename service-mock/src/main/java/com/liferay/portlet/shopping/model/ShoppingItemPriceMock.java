
package com.liferay.portlet.shopping.model;

import java.io.Serializable;
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
public class ShoppingItemPriceMock
    extends MockService<ShoppingItemPrice>
    implements ShoppingItemPrice
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.model.ShoppingItemPrice.class));
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

    public int compareTo(ShoppingItemPrice param0) {
        return this.mockObject.compareTo(param0);
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public int getStatus() {
        return this.mockObject.getStatus();
    }

    public void setStatus(int param0) {
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

    public ShoppingItemPrice toEscapedModel() {
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

    public CacheModel<ShoppingItemPrice> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public int getMinQuantity() {
        return this.mockObject.getMinQuantity();
    }

    public void setMinQuantity(int param0) {
    }

    public int getMaxQuantity() {
        return this.mockObject.getMaxQuantity();
    }

    public void setMaxQuantity(int param0) {
    }

    public double getPrice() {
        return this.mockObject.getPrice();
    }

    public void setPrice(double param0) {
    }

    public boolean getTaxable() {
        return this.mockObject.getTaxable();
    }

    public boolean isTaxable() {
        return this.mockObject.isTaxable();
    }

    public void setTaxable(boolean param0) {
    }

    public double getShipping() {
        return this.mockObject.getShipping();
    }

    public void setShipping(double param0) {
    }

    public boolean getUseShippingFormula() {
        return this.mockObject.getUseShippingFormula();
    }

    public boolean isUseShippingFormula() {
        return this.mockObject.isUseShippingFormula();
    }

    public void setUseShippingFormula(boolean param0) {
    }

    public long getItemPriceId() {
        return this.mockObject.getItemPriceId();
    }

    public void setItemPriceId(long param0) {
    }

    public long getItemId() {
        return this.mockObject.getItemId();
    }

    public double getDiscount() {
        return this.mockObject.getDiscount();
    }

    public void setDiscount(double param0) {
    }

    public void setItemId(long param0) {
    }

    public ShoppingItemPrice toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
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
