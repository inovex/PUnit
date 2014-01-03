
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
public class ShoppingOrderItemMock
    extends MockService<ShoppingOrderItem>
    implements ShoppingOrderItem
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.model.ShoppingOrderItem.class));
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

    public int compareTo(ShoppingOrderItem param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
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

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public ShoppingOrderItem toEscapedModel() {
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

    public CacheModel<ShoppingOrderItem> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public void setSku(String param0) {
    }

    public void setOrderId(long param0) {
    }

    public String getSku() {
        return this.mockObject.getSku();
    }

    public double getPrice() {
        return this.mockObject.getPrice();
    }

    public void setPrice(double param0) {
    }

    public long getOrderId() {
        return this.mockObject.getOrderId();
    }

    public String getItemId() {
        return this.mockObject.getItemId();
    }

    public void setQuantity(int param0) {
    }

    public void setItemId(String param0) {
    }

    public int getQuantity() {
        return this.mockObject.getQuantity();
    }

    public void setOrderItemId(long param0) {
    }

    public Date getShippedDate() {
        return this.mockObject.getShippedDate();
    }

    public void setShippedDate(Date param0) {
    }

    public long getOrderItemId() {
        return this.mockObject.getOrderItemId();
    }

    public ShoppingOrderItem toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
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
