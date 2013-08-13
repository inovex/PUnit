
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
public class LayoutPrototypeMock
    extends MockService<LayoutPrototype>
    implements LayoutPrototype
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.LayoutPrototype.class));
    }

    public Group getGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroup();
    }

    public long getGroupId()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupId();
    }

    public Layout getLayout()
        throws PortalException, SystemException
    {
        return this.mockObject.getLayout();
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

    public int compareTo(LayoutPrototype param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public String getName(Locale param0) {
        return this.mockObject.getName(param0);
    }

    public String getName(Locale param0, boolean param1) {
        return this.mockObject.getName(param0, param1);
    }

    public String getName(String param0) {
        return this.mockObject.getName(param0);
    }

    public String getName(String param0, boolean param1) {
        return this.mockObject.getName(param0, param1);
    }

    public void setName(String param0) {
    }

    public void setName(String param0, Locale param1) {
    }

    public void setName(String param0, Locale param1, Locale param2) {
    }

    public String getDescription() {
        return this.mockObject.getDescription();
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

    public CacheModel<LayoutPrototype> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public LayoutPrototype toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setCompanyId(long param0) {
    }

    public String getUuid() {
        return this.mockObject.getUuid();
    }

    public void setUuid(String param0) {
    }

    public boolean getActive() {
        return this.mockObject.getActive();
    }

    public boolean isActive() {
        return this.mockObject.isActive();
    }

    public void setActive(boolean param0) {
    }

    public void setDescription(String param0) {
    }

    public String getSettings() {
        return this.mockObject.getSettings();
    }

    public void setSettings(String param0) {
    }

    public String getNameCurrentLanguageId() {
        return this.mockObject.getNameCurrentLanguageId();
    }

    public String getNameCurrentValue() {
        return this.mockObject.getNameCurrentValue();
    }

    public Map<Locale, String> getNameMap() {
        return this.mockObject.getNameMap();
    }

    public void setNameCurrentLanguageId(String param0) {
    }

    public void setNameMap(Map<Locale, String> param0) {
    }

    public void setNameMap(Map<Locale, String> param0, Locale param1) {
    }

    public void prepareLocalizedFieldsForImport(Locale param0)
        throws LocaleException
    {
    }

    public long getLayoutPrototypeId() {
        return this.mockObject.getLayoutPrototypeId();
    }

    public void setLayoutPrototypeId(long param0) {
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
