
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.UnicodeProperties;
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
public class GroupMock
    extends MockService<Group>
    implements Group
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Group.class));
    }

    public boolean hasPublicLayouts() {
        return this.mockObject.hasPublicLayouts();
    }

    public long getDefaultPrivatePlid() {
        return this.mockObject.getDefaultPrivatePlid();
    }

    public long getDefaultPublicPlid() {
        return this.mockObject.getDefaultPublicPlid();
    }

    public String getDescriptiveName()
        throws PortalException, SystemException
    {
        return this.mockObject.getDescriptiveName();
    }

    public String getDescriptiveName(Locale param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDescriptiveName(param0);
    }

    public Group getLiveGroup() {
        return this.mockObject.getLiveGroup();
    }

    public long getOrganizationId() {
        return this.mockObject.getOrganizationId();
    }

    public Group getParentGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getParentGroup();
    }

    public String getPathFriendlyURL(boolean param0, ThemeDisplay param1) {
        return this.mockObject.getPathFriendlyURL(param0, param1);
    }

    public LayoutSet getPrivateLayoutSet() {
        return this.mockObject.getPrivateLayoutSet();
    }

    public int getPrivateLayoutsPageCount() {
        return this.mockObject.getPrivateLayoutsPageCount();
    }

    public LayoutSet getPublicLayoutSet() {
        return this.mockObject.getPublicLayoutSet();
    }

    public int getPublicLayoutsPageCount() {
        return this.mockObject.getPublicLayoutsPageCount();
    }

    public Group getStagingGroup() {
        return this.mockObject.getStagingGroup();
    }

    public String getTypeLabel() {
        return this.mockObject.getTypeLabel();
    }

    public String getTypeSettings() {
        return this.mockObject.getTypeSettings();
    }

    public UnicodeProperties getTypeSettingsProperties() {
        return this.mockObject.getTypeSettingsProperties();
    }

    public String getTypeSettingsProperty(String param0) {
        return this.mockObject.getTypeSettingsProperty(param0);
    }

    public boolean hasPrivateLayouts() {
        return this.mockObject.hasPrivateLayouts();
    }

    public boolean hasStagingGroup() {
        return this.mockObject.hasStagingGroup();
    }

    public boolean isCommunity() {
        return this.mockObject.isCommunity();
    }

    public boolean isCompany() {
        return this.mockObject.isCompany();
    }

    public boolean isControlPanel() {
        return this.mockObject.isControlPanel();
    }

    public boolean isGuest() {
        return this.mockObject.isGuest();
    }

    public boolean isLayout() {
        return this.mockObject.isLayout();
    }

    public boolean isLayoutPrototype() {
        return this.mockObject.isLayoutPrototype();
    }

    public boolean isLayoutSetPrototype() {
        return this.mockObject.isLayoutSetPrototype();
    }

    public boolean isOrganization() {
        return this.mockObject.isOrganization();
    }

    public boolean isRegularSite() {
        return this.mockObject.isRegularSite();
    }

    public boolean isStaged() {
        return this.mockObject.isStaged();
    }

    public boolean isStagedPortlet(String param0) {
        return this.mockObject.isStagedPortlet(param0);
    }

    public boolean isStagedRemotely() {
        return this.mockObject.isStagedRemotely();
    }

    public boolean isStagingGroup() {
        return this.mockObject.isStagingGroup();
    }

    public boolean isUser() {
        return this.mockObject.isUser();
    }

    public boolean isUserGroup() {
        return this.mockObject.isUserGroup();
    }

    public boolean isUserPersonalSite() {
        return this.mockObject.isUserPersonalSite();
    }

    public void setTypeSettings(String param0) {
    }

    public void setTypeSettingsProperties(UnicodeProperties param0) {
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

    public int compareTo(Group param0) {
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

    public CacheModel<Group> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Group toEscapedModel() {
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

    public long getParentGroupId() {
        return this.mockObject.getParentGroupId();
    }

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public void setType(int param0) {
    }

    public void setClassNameId(long param0) {
    }

    public boolean getActive() {
        return this.mockObject.getActive();
    }

    public boolean isActive() {
        return this.mockObject.isActive();
    }

    public void setActive(boolean param0) {
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setGroupId(long param0) {
    }

    public long getCreatorUserId() {
        return this.mockObject.getCreatorUserId();
    }

    public void setCreatorUserId(long param0) {
    }

    public String getCreatorUserUuid()
        throws SystemException
    {
        return this.mockObject.getCreatorUserUuid();
    }

    public void setCreatorUserUuid(String param0) {
    }

    public void setParentGroupId(long param0) {
    }

    public long getLiveGroupId() {
        return this.mockObject.getLiveGroupId();
    }

    public void setLiveGroupId(long param0) {
    }

    public void setDescription(String param0) {
    }

    public String getFriendlyURL() {
        return this.mockObject.getFriendlyURL();
    }

    public void setFriendlyURL(String param0) {
    }

    public boolean getSite() {
        return this.mockObject.getSite();
    }

    public boolean isSite() {
        return this.mockObject.isSite();
    }

    public void setSite(boolean param0) {
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
