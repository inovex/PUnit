
package com.liferay.portlet.dynamicdatamapping.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
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
public class DDMStructureMock
    extends MockService<DDMStructure>
    implements DDMStructure
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatamapping.model.DDMStructure.class));
    }

    public Map<String, String> getFields(String param0, String param1, String param2) {
        return this.mockObject.getFields(param0, param1, param2);
    }

    public Map<String, String> getFields(String param0, String param1, String param2, String param3) {
        return this.mockObject.getFields(param0, param1, param2, param3);
    }

    public String getFieldType(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldType(param0);
    }

    public Map<String, Map<String, Map<String, String>>> getLocalizedFieldsMap() {
        return this.mockObject.getLocalizedFieldsMap();
    }

    public Map<String, Map<String, Map<String, String>>> getLocalizedTransientFieldsMap() {
        return this.mockObject.getLocalizedTransientFieldsMap();
    }

    public List<String> getChildrenFieldNames(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getChildrenFieldNames(param0);
    }

    public String getCompleteXsd()
        throws PortalException, SystemException
    {
        return this.mockObject.getCompleteXsd();
    }

    public String getFieldDataType(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldDataType(param0);
    }

    public String getFieldLabel(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldLabel(param0, param1);
    }

    public String getFieldLabel(String param0, Locale param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldLabel(param0, param1);
    }

    public Set<String> getFieldNames()
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldNames();
    }

    public String getFieldProperty(String param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldProperty(param0, param1, param2);
    }

    public String getFieldProperty(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldProperty(param0, param1);
    }

    public boolean getFieldRepeatable(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldRepeatable(param0);
    }

    public boolean getFieldRequired(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldRequired(param0);
    }

    public String getFieldTip(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldTip(param0, param1);
    }

    public String getFieldTip(String param0, Locale param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldTip(param0, param1);
    }

    public List<String> getRootFieldNames()
        throws PortalException, SystemException
    {
        return this.mockObject.getRootFieldNames();
    }

    public List<DDMTemplate> getTemplates()
        throws SystemException
    {
        return this.mockObject.getTemplates();
    }

    public Map<String, Map<String, String>> getTransientFieldsMap(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTransientFieldsMap(param0);
    }

    public String getWebDavURL(ThemeDisplay param0, String param1) {
        return this.mockObject.getWebDavURL(param0, param1);
    }

    public boolean hasField(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.hasField(param0);
    }

    public boolean isFieldPrivate(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.isFieldPrivate(param0);
    }

    public boolean isFieldRepeatable(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.isFieldRepeatable(param0);
    }

    public void setDocument(Document param0) {
    }

    public void setLocalizedFieldsMap(Map<String, Map<String, Map<String, String>>> param0) {
    }

    public void setLocalizedTransientFieldsMap(Map<String, Map<String, Map<String, String>>> param0) {
    }

    public Map<String, Map<String, String>> getFieldsMap()
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldsMap();
    }

    public Map<String, Map<String, String>> getFieldsMap(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFieldsMap(param0);
    }

    public Document getDocument() {
        return this.mockObject.getDocument();
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

    public int compareTo(DDMStructure param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName(Locale param0, boolean param1) {
        return this.mockObject.getName(param0, param1);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public String getName(String param0) {
        return this.mockObject.getName(param0);
    }

    public String getName(Locale param0) {
        return this.mockObject.getName(param0);
    }

    public String getName(String param0, boolean param1) {
        return this.mockObject.getName(param0, param1);
    }

    public void setName(String param0, Locale param1) {
    }

    public void setName(String param0, Locale param1, Locale param2) {
    }

    public void setName(String param0) {
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

    public String getDescription(String param0) {
        return this.mockObject.getDescription(param0);
    }

    public String getDescription(String param0, boolean param1) {
        return this.mockObject.getDescription(param0, param1);
    }

    public String getDescription() {
        return this.mockObject.getDescription();
    }

    public String getDescription(Locale param0, boolean param1) {
        return this.mockObject.getDescription(param0, param1);
    }

    public String getDescription(Locale param0) {
        return this.mockObject.getDescription(param0);
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

    public DDMStructure toEscapedModel() {
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

    public CacheModel<DDMStructure> toCacheModel() {
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

    public long getStructureId() {
        return this.mockObject.getStructureId();
    }

    public void setStructureId(long param0) {
    }

    public long getParentStructureId() {
        return this.mockObject.getParentStructureId();
    }

    public String getXsd() {
        return this.mockObject.getXsd();
    }

    public void setParentStructureId(long param0) {
    }

    public String getStructureKey() {
        return this.mockObject.getStructureKey();
    }

    public void setStructureKey(String param0) {
    }

    public void setXsd(String param0) {
    }

    public String getStorageType() {
        return this.mockObject.getStorageType();
    }

    public void setStorageType(String param0) {
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

    public void setType(int param0) {
    }

    public void setClassNameId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public String getNameCurrentLanguageId() {
        return this.mockObject.getNameCurrentLanguageId();
    }

    public String getNameCurrentValue() {
        return this.mockObject.getNameCurrentValue();
    }

    public void setNameCurrentLanguageId(String param0) {
    }

    public Map<Locale, String> getNameMap() {
        return this.mockObject.getNameMap();
    }

    public void setNameMap(Map<Locale, String> param0) {
    }

    public void setNameMap(Map<Locale, String> param0, Locale param1) {
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

    public void setDescriptionMap(Map<Locale, String> param0, Locale param1) {
    }

    public void setDescriptionMap(Map<Locale, String> param0) {
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

    public DDMStructure toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setClassName(String param0) {
    }

    public void setCompanyId(long param0) {
    }

    public void setDescription(String param0, Locale param1) {
    }

    public void setDescription(String param0, Locale param1, Locale param2) {
    }

    public void setDescription(String param0) {
    }

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
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
