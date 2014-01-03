
package com.liferay.portlet.shopping.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
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
public class ShoppingItemMock
    extends MockService<ShoppingItem>
    implements ShoppingItem
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.model.ShoppingItem.class));
    }

    public void setFieldsQuantitiesArray(String[] param0) {
    }

    public ShoppingCategory getCategory() {
        return this.mockObject.getCategory();
    }

    public List<ShoppingItemPrice> getItemPrices()
        throws PortalException, SystemException
    {
        return this.mockObject.getItemPrices();
    }

    public String[] getFieldsQuantitiesArray() {
        return this.mockObject.getFieldsQuantitiesArray();
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

    public int compareTo(ShoppingItem param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public boolean getFields() {
        return this.mockObject.getFields();
    }

    public String getProperties() {
        return this.mockObject.getProperties();
    }

    public void setProperties(String param0) {
    }

    public void setName(String param0) {
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public String getDescription() {
        return this.mockObject.getDescription();
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

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public ShoppingItem toEscapedModel() {
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

    public CacheModel<ShoppingItem> toCacheModel() {
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

    public long getCategoryId() {
        return this.mockObject.getCategoryId();
    }

    public void setCategoryId(long param0) {
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

    public boolean getSmallImage() {
        return this.mockObject.getSmallImage();
    }

    public boolean isSmallImage() {
        return this.mockObject.isSmallImage();
    }

    public void setSmallImage(boolean param0) {
    }

    public long getSmallImageId() {
        return this.mockObject.getSmallImageId();
    }

    public void setSmallImageId(long param0) {
    }

    public String getSmallImageURL() {
        return this.mockObject.getSmallImageURL();
    }

    public void setSmallImageURL(String param0) {
    }

    public void setSku(String param0) {
    }

    public boolean isFields() {
        return this.mockObject.isFields();
    }

    public void setFields(boolean param0) {
    }

    public String getFieldsQuantities() {
        return this.mockObject.getFieldsQuantities();
    }

    public String getSku() {
        return this.mockObject.getSku();
    }

    public void setFieldsQuantities(String param0) {
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

    public boolean getRequiresShipping() {
        return this.mockObject.getRequiresShipping();
    }

    public boolean isRequiresShipping() {
        return this.mockObject.isRequiresShipping();
    }

    public void setRequiresShipping(boolean param0) {
    }

    public int getStockQuantity() {
        return this.mockObject.getStockQuantity();
    }

    public void setStockQuantity(int param0) {
    }

    public boolean getFeatured() {
        return this.mockObject.getFeatured();
    }

    public boolean isFeatured() {
        return this.mockObject.isFeatured();
    }

    public void setFeatured(boolean param0) {
    }

    public boolean getSale() {
        return this.mockObject.getSale();
    }

    public boolean isSale() {
        return this.mockObject.isSale();
    }

    public long getLargeImageId() {
        return this.mockObject.getLargeImageId();
    }

    public void setLargeImageId(long param0) {
    }

    public void setSale(boolean param0) {
    }

    public boolean getMediumImage() {
        return this.mockObject.getMediumImage();
    }

    public boolean isMediumImage() {
        return this.mockObject.isMediumImage();
    }

    public void setMediumImage(boolean param0) {
    }

    public long getMediumImageId() {
        return this.mockObject.getMediumImageId();
    }

    public void setMediumImageId(long param0) {
    }

    public String getMediumImageURL() {
        return this.mockObject.getMediumImageURL();
    }

    public void setMediumImageURL(String param0) {
    }

    public boolean getLargeImage() {
        return this.mockObject.getLargeImage();
    }

    public boolean isLargeImage() {
        return this.mockObject.isLargeImage();
    }

    public void setLargeImage(boolean param0) {
    }

    public String getLargeImageURL() {
        return this.mockObject.getLargeImageURL();
    }

    public void setLargeImageURL(String param0) {
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

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public ShoppingItem toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setCompanyId(long param0) {
    }

    public void setDescription(String param0) {
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
