
package com.liferay.portlet.asset.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.UnicodeProperties;
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
public class AssetVocabularyMock
    extends MockService<AssetVocabulary>
    implements AssetVocabulary
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.model.AssetVocabulary.class));
    }

    public boolean isMultiValued() {
        return this.mockObject.isMultiValued();
    }

    public List<AssetCategory> getCategories()
        throws SystemException
    {
        return this.mockObject.getCategories();
    }

    public boolean isRequired(long param0) {
        return this.mockObject.isRequired(param0);
    }

    public UnicodeProperties getSettingsProperties() {
        return this.mockObject.getSettingsProperties();
    }

    public void setSettingsProperties(UnicodeProperties param0) {
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

    public int compareTo(AssetVocabulary param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public String getDescription(String param0) {
        return this.mockObject.getDescription(param0);
    }

    public String getDescription(String param0, boolean param1) {
        return this.mockObject.getDescription(param0, param1);
    }

    public String getDescription() {
        return this.mockObject.getDescription();
    }

    public String getDescription(Locale param0) {
        return this.mockObject.getDescription(param0);
    }

    public String getDescription(Locale param0, boolean param1) {
        return this.mockObject.getDescription(param0, param1);
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

    public AssetVocabulary toEscapedModel() {
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

    public CacheModel<AssetVocabulary> toCacheModel() {
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

    public String getUuid() {
        return this.mockObject.getUuid();
    }

    public void setUuid(String param0) {
    }

    public long getVocabularyId() {
        return this.mockObject.getVocabularyId();
    }

    public void setVocabularyId(long param0) {
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

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public String getTitle(Locale param0, boolean param1) {
        return this.mockObject.getTitle(param0, param1);
    }

    public String getTitle(String param0) {
        return this.mockObject.getTitle(param0);
    }

    public String getTitle(String param0, boolean param1) {
        return this.mockObject.getTitle(param0, param1);
    }

    public String getTitle(Locale param0) {
        return this.mockObject.getTitle(param0);
    }

    public String getTitle() {
        return this.mockObject.getTitle();
    }

    public String getTitleCurrentLanguageId() {
        return this.mockObject.getTitleCurrentLanguageId();
    }

    public String getTitleCurrentValue() {
        return this.mockObject.getTitleCurrentValue();
    }

    public Map<Locale, String> getTitleMap() {
        return this.mockObject.getTitleMap();
    }

    public void setTitle(String param0, Locale param1) {
    }

    public void setTitle(String param0) {
    }

    public void setTitle(String param0, Locale param1, Locale param2) {
    }

    public void setTitleCurrentLanguageId(String param0) {
    }

    public void setTitleMap(Map<Locale, String> param0, Locale param1) {
    }

    public void setTitleMap(Map<Locale, String> param0) {
    }

    public String getDescriptionCurrentLanguageId() {
        return this.mockObject.getDescriptionCurrentLanguageId();
    }

    public String getDescriptionCurrentValue() {
        return this.mockObject.getDescriptionCurrentValue();
    }

    public Map<Locale, String> getDescriptionMap() {
        return this.mockObject.getDescriptionMap();
    }

    public void setDescriptionCurrentLanguageId(String param0) {
    }

    public void setDescriptionMap(Map<Locale, String> param0) {
    }

    public void setDescriptionMap(Map<Locale, String> param0, Locale param1) {
    }

    public String[] getAvailableLanguageIds() {
        return this.mockObject.getAvailableLanguageIds();
    }

    public String getDefaultLanguageId() {
        return this.mockObject.getDefaultLanguageId();
    }

    public void prepareLocalizedFieldsForImport(Locale param0)
        throws LocaleException
    {
    }

    public void prepareLocalizedFieldsForImport()
        throws LocaleException
    {
    }

    public void setSettings(String param0) {
    }

    public AssetVocabulary toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setCompanyId(long param0) {
    }

    public String getSettings() {
        return this.mockObject.getSettings();
    }

    public void setDescription(String param0) {
    }

    public void setDescription(String param0, Locale param1, Locale param2) {
    }

    public void setDescription(String param0, Locale param1) {
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

    public StagedModelType getStagedModelType() {
        return this.mockObject.getStagedModelType();
    }

    public void persist()
        throws SystemException
    {
    }

}
