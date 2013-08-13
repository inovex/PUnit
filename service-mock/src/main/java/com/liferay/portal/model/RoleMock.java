
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
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
public class RoleMock
    extends MockService<Role>
    implements Role
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Role.class));
    }

    public String getDescriptiveName()
        throws PortalException, SystemException
    {
        return this.mockObject.getDescriptiveName();
    }

    public String getTypeLabel() {
        return this.mockObject.getTypeLabel();
    }

    public String getTitle(String param0) {
        return this.mockObject.getTitle(param0);
    }

    public String getTitle(String param0, boolean param1) {
        return this.mockObject.getTitle(param0, param1);
    }

    public boolean isTeam() {
        return this.mockObject.isTeam();
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

    public int compareTo(Role param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public int getType() {
        return this.mockObject.getType();
    }

    public String getClassName() {
        return this.mockObject.getClassName();
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

    public String getDescription(String param0) {
        return this.mockObject.getDescription(param0);
    }

    public String getDescription(String param0, boolean param1) {
        return this.mockObject.getDescription(param0, param1);
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

    public CacheModel<Role> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Role toEscapedModel() {
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

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public void setType(int param0) {
    }

    public void setClassNameId(long param0) {
    }

    public void setDescription(String param0) {
    }

    public void setDescription(String param0, Locale param1) {
    }

    public void setDescription(String param0, Locale param1, Locale param2) {
    }

    public String getTitle() {
        return this.mockObject.getTitle();
    }

    public String getTitle(Locale param0) {
        return this.mockObject.getTitle(param0);
    }

    public String getTitle(Locale param0, boolean param1) {
        return this.mockObject.getTitle(param0, param1);
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

    public void setTitle(String param0) {
    }

    public void setTitle(String param0, Locale param1) {
    }

    public void setTitle(String param0, Locale param1, Locale param2) {
    }

    public void setTitleCurrentLanguageId(String param0) {
    }

    public void setTitleMap(Map<Locale, String> param0) {
    }

    public void setTitleMap(Map<Locale, String> param0, Locale param1) {
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

    public void prepareLocalizedFieldsForImport(Locale param0)
        throws LocaleException
    {
    }

    public long getRoleId() {
        return this.mockObject.getRoleId();
    }

    public void setRoleId(long param0) {
    }

    public String getSubtype() {
        return this.mockObject.getSubtype();
    }

    public void setSubtype(String param0) {
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
