
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.UnicodeProperties;
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
public class LayoutSetBranchMock
    extends MockService<LayoutSetBranch>
    implements LayoutSetBranch
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.LayoutSetBranch.class));
    }

    public Group getGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroup();
    }

    public ColorScheme getColorScheme()
        throws SystemException
    {
        return this.mockObject.getColorScheme();
    }

    public LayoutSet getLayoutSet() {
        return this.mockObject.getLayoutSet();
    }

    public Theme getTheme()
        throws SystemException
    {
        return this.mockObject.getTheme();
    }

    public String getThemeSetting(String param0, String param1)
        throws SystemException
    {
        return this.mockObject.getThemeSetting(param0, param1);
    }

    public String getSettings() {
        return this.mockObject.getSettings();
    }

    public long getLiveLogoId() {
        return this.mockObject.getLiveLogoId();
    }

    public UnicodeProperties getSettingsProperties() {
        return this.mockObject.getSettingsProperties();
    }

    public String getSettingsProperty(String param0) {
        return this.mockObject.getSettingsProperty(param0);
    }

    public ColorScheme getWapColorScheme()
        throws SystemException
    {
        return this.mockObject.getWapColorScheme();
    }

    public Theme getWapTheme()
        throws SystemException
    {
        return this.mockObject.getWapTheme();
    }

    public boolean isLayoutSetPrototypeLinkActive() {
        return this.mockObject.isLayoutSetPrototypeLinkActive();
    }

    public void setSettings(String param0) {
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

    public int compareTo(LayoutSetBranch param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
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

    public CacheModel<LayoutSetBranch> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public LayoutSetBranch toEscapedModel() {
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

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
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

    public long getLogoId() {
        return this.mockObject.getLogoId();
    }

    public void setLogoId(long param0) {
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setGroupId(long param0) {
    }

    public void setDescription(String param0) {
    }

    public String getColorSchemeId() {
        return this.mockObject.getColorSchemeId();
    }

    public String getThemeId() {
        return this.mockObject.getThemeId();
    }

    public boolean getPrivateLayout() {
        return this.mockObject.getPrivateLayout();
    }

    public boolean isPrivateLayout() {
        return this.mockObject.isPrivateLayout();
    }

    public void setPrivateLayout(boolean param0) {
    }

    public boolean getLogo() {
        return this.mockObject.getLogo();
    }

    public boolean isLogo() {
        return this.mockObject.isLogo();
    }

    public void setLogo(boolean param0) {
    }

    public void setThemeId(String param0) {
    }

    public void setColorSchemeId(String param0) {
    }

    public String getWapThemeId() {
        return this.mockObject.getWapThemeId();
    }

    public void setWapThemeId(String param0) {
    }

    public String getWapColorSchemeId() {
        return this.mockObject.getWapColorSchemeId();
    }

    public void setWapColorSchemeId(String param0) {
    }

    public String getCss() {
        return this.mockObject.getCss();
    }

    public void setCss(String param0) {
    }

    public String getLayoutSetPrototypeUuid() {
        return this.mockObject.getLayoutSetPrototypeUuid();
    }

    public void setLayoutSetPrototypeUuid(String param0) {
    }

    public boolean getLayoutSetPrototypeLinkEnabled() {
        return this.mockObject.getLayoutSetPrototypeLinkEnabled();
    }

    public boolean isLayoutSetPrototypeLinkEnabled() {
        return this.mockObject.isLayoutSetPrototypeLinkEnabled();
    }

    public void setLayoutSetPrototypeLinkEnabled(boolean param0) {
    }

    public long getLayoutSetBranchId() {
        return this.mockObject.getLayoutSetBranchId();
    }

    public void setLayoutSetBranchId(long param0) {
    }

    public boolean getMaster() {
        return this.mockObject.getMaster();
    }

    public boolean isMaster() {
        return this.mockObject.isMaster();
    }

    public void setMaster(boolean param0) {
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
