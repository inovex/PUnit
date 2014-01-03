
package com.liferay.portlet.social.model;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetEntry;
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
public class SocialActivityMock
    extends MockService<SocialActivity>
    implements SocialActivity
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.model.SocialActivity.class));
    }

    public AssetEntry getAssetEntry()
        throws SystemException
    {
        return this.mockObject.getAssetEntry();
    }

    public boolean isClassName(String param0) {
        return this.mockObject.isClassName(param0);
    }

    public String getExtraDataValue(String param0, Locale param1)
        throws JSONException
    {
        return this.mockObject.getExtraDataValue(param0, param1);
    }

    public String getExtraDataValue(String param0)
        throws JSONException
    {
        return this.mockObject.getExtraDataValue(param0);
    }

    public void setAssetEntry(AssetEntry param0) {
    }

    public void setExtraDataValue(String param0, String param1)
        throws JSONException
    {
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

    public int compareTo(SocialActivity param0) {
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

    public SocialActivity toEscapedModel() {
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

    public CacheModel<SocialActivity> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public long getUserId() {
        return this.mockObject.getUserId();
    }

    public void setUserId(long param0) {
    }

    public long getClassPK() {
        return this.mockObject.getClassPK();
    }

    public String getUserUuid()
        throws SystemException
    {
        return this.mockObject.getUserUuid();
    }

    public void setUserUuid(String param0) {
    }

    public void setExtraData(String param0) {
    }

    public String getExtraData() {
        return this.mockObject.getExtraData();
    }

    public void setType(int param0) {
    }

    public void setClassNameId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public SocialActivity toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public long getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(long param0) {
    }

    public void setClassName(String param0) {
    }

    public void setClassPK(long param0) {
    }

    public void setCompanyId(long param0) {
    }

    public long getActivitySetId() {
        return this.mockObject.getActivitySetId();
    }

    public void setActivitySetId(long param0) {
    }

    public long getMirrorActivityId() {
        return this.mockObject.getMirrorActivityId();
    }

    public long getActivityId() {
        return this.mockObject.getActivityId();
    }

    public void setActivityId(long param0) {
    }

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public void setMirrorActivityId(long param0) {
    }

    public long getParentClassNameId() {
        return this.mockObject.getParentClassNameId();
    }

    public void setParentClassNameId(long param0) {
    }

    public long getParentClassPK() {
        return this.mockObject.getParentClassPK();
    }

    public void setParentClassPK(long param0) {
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
