
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
public class LayoutSetMock
    extends MockService<LayoutSet>
    implements LayoutSet
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.LayoutSet.class));
    }

    public Group getGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroup();
    }

    public long getLayoutSetPrototypeId()
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutSetPrototypeId();
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

    public boolean isLayoutSetPrototypeLinkActive() {
        return this.mockObject.isLayoutSetPrototypeLinkActive();
    }

    public void setSettingsProperties(UnicodeProperties param0) {
    }

    public Theme getWapTheme()
        throws SystemException
    {
        return this.mockObject.getWapTheme();
    }

    public String getVirtualHostname() {
        return this.mockObject.getVirtualHostname();
    }

    public void setVirtualHostname(String param0) {
    }

    public ColorScheme getColorScheme()
        throws SystemException
    {
        return this.mockObject.getColorScheme();
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

    public String toString() {
        return this.mockObject.toString();
    }

    public int hashCode() {
        return this.mockObject.hashCode();
    }

    public Object clone() {
        return this.mockObject.clone();
    }

    public int compareTo(LayoutSet param0) {
        return this.mockObject.compareTo(param0);
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

    public LayoutSet toEscapedModel() {
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

    public CacheModel<LayoutSet> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Date getModifiedDate() {
        return this.mockObject.getModifiedDate();
    }

    public void setModifiedDate(Date param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setLayoutSetId(long param0) {
    }

    public boolean getPrivateLayout() {
        return this.mockObject.getPrivateLayout();
    }

    public boolean isPrivateLayout() {
        return this.mockObject.isPrivateLayout();
    }

    public void setPrivateLayout(boolean param0) {
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

    public int getPageCount() {
        return this.mockObject.getPageCount();
    }

    public void setPageCount(int param0) {
    }

    public void setSettings(String param0) {
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

    public long getLogoId() {
        return this.mockObject.getLogoId();
    }

    public void setLogoId(long param0) {
    }

    public LayoutSet toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public String getColorSchemeId() {
        return this.mockObject.getColorSchemeId();
    }

    public long getLayoutSetId() {
        return this.mockObject.getLayoutSetId();
    }

    public boolean getLogo() {
        return this.mockObject.getLogo();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setCompanyId(long param0) {
    }

    public String getThemeId() {
        return this.mockObject.getThemeId();
    }

    public String getSettings() {
        return this.mockObject.getSettings();
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
