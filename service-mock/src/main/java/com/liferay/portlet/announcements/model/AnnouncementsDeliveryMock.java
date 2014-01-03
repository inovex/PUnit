
package com.liferay.portlet.announcements.model;

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
public class AnnouncementsDeliveryMock
    extends MockService<AnnouncementsDelivery>
    implements AnnouncementsDelivery
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.announcements.model.AnnouncementsDelivery.class));
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

    public int compareTo(AnnouncementsDelivery param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getType() {
        return this.mockObject.getType();
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

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public AnnouncementsDelivery toEscapedModel() {
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

    public CacheModel<AnnouncementsDelivery> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public long getUserId() {
        return this.mockObject.getUserId();
    }

    public void setUserId(long param0) {
    }

    public long getDeliveryId() {
        return this.mockObject.getDeliveryId();
    }

    public void setDeliveryId(long param0) {
    }

    public boolean isEmail() {
        return this.mockObject.isEmail();
    }

    public void setEmail(boolean param0) {
    }

    public boolean getEmail() {
        return this.mockObject.getEmail();
    }

    public boolean getSms() {
        return this.mockObject.getSms();
    }

    public boolean isSms() {
        return this.mockObject.isSms();
    }

    public void setSms(boolean param0) {
    }

    public boolean isWebsite() {
        return this.mockObject.isWebsite();
    }

    public void setWebsite(boolean param0) {
    }

    public String getUserUuid()
        throws SystemException
    {
        return this.mockObject.getUserUuid();
    }

    public void setUserUuid(String param0) {
    }

    public void setType(String param0) {
    }

    public boolean getWebsite() {
        return this.mockObject.getWebsite();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public AnnouncementsDelivery toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
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
