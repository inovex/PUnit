
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
public class SocialActivityCounterMock
    extends MockService<SocialActivityCounter>
    implements SocialActivityCounter
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.model.SocialActivityCounter.class));
    }

    public boolean isActivePeriod(int param0) {
        return this.mockObject.isActivePeriod(param0);
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

    public int compareTo(SocialActivityCounter param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
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

    public CacheModel<SocialActivityCounter> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public SocialActivityCounter toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public int getOwnerType() {
        return this.mockObject.getOwnerType();
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

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public void setClassNameId(long param0) {
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setGroupId(long param0) {
    }

    public void setOwnerType(int param0) {
    }

    public long getActivityCounterId() {
        return this.mockObject.getActivityCounterId();
    }

    public void setActivityCounterId(long param0) {
    }

    public int getCurrentValue() {
        return this.mockObject.getCurrentValue();
    }

    public void setCurrentValue(int param0) {
    }

    public int getTotalValue() {
        return this.mockObject.getTotalValue();
    }

    public void setTotalValue(int param0) {
    }

    public int getGraceValue() {
        return this.mockObject.getGraceValue();
    }

    public void setGraceValue(int param0) {
    }

    public int getStartPeriod() {
        return this.mockObject.getStartPeriod();
    }

    public void setStartPeriod(int param0) {
    }

    public int getEndPeriod() {
        return this.mockObject.getEndPeriod();
    }

    public void setEndPeriod(int param0) {
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
