
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.security.permission.PermissionChecker;
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
public class LayoutMock
    extends MockService<Layout>
    implements Layout
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Layout.class));
    }

    public Group getGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroup();
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

    public String getTypeSettingsProperty(String param0, String param1) {
        return this.mockObject.getTypeSettingsProperty(param0, param1);
    }

    public void setTypeSettings(String param0) {
    }

    public void setTypeSettingsProperties(UnicodeProperties param0) {
    }

    public void setGroupId(long param0) {
    }

    public List<Layout> getAncestors()
        throws PortalException, SystemException
    {
        return this.mockObject.getAncestors();
    }

    public ColorScheme getColorScheme()
        throws PortalException, SystemException
    {
        return this.mockObject.getColorScheme();
    }

    public LayoutSet getLayoutSet()
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutSet();
    }

    public Group getScopeGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getScopeGroup();
    }

    public boolean hasScopeGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.hasScopeGroup();
    }

    public Theme getTheme()
        throws PortalException, SystemException
    {
        return this.mockObject.getTheme();
    }

    public String getThemeSetting(String param0, String param1) {
        return this.mockObject.getThemeSetting(param0, param1);
    }

    public void setLayoutSet(LayoutSet param0) {
    }

    public ColorScheme getWapColorScheme()
        throws PortalException, SystemException
    {
        return this.mockObject.getWapColorScheme();
    }

    public Theme getWapTheme()
        throws PortalException, SystemException
    {
        return this.mockObject.getWapTheme();
    }

    public void setPrivateLayout(boolean param0) {
    }

    public List<Layout> getAllChildren()
        throws SystemException
    {
        return this.mockObject.getAllChildren();
    }

    public long getAncestorLayoutId()
        throws PortalException, SystemException
    {
        return this.mockObject.getAncestorLayoutId();
    }

    public long getAncestorPlid()
        throws PortalException, SystemException
    {
        return this.mockObject.getAncestorPlid();
    }

    public List<Layout> getChildren()
        throws SystemException
    {
        return this.mockObject.getChildren();
    }

    public List<Layout> getChildren(PermissionChecker param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getChildren(param0);
    }

    public String getCssText()
        throws PortalException, SystemException
    {
        return this.mockObject.getCssText();
    }

    public String getHTMLTitle(Locale param0) {
        return this.mockObject.getHTMLTitle(param0);
    }

    public String getHTMLTitle(String param0) {
        return this.mockObject.getHTMLTitle(param0);
    }

    public LayoutType getLayoutType() {
        return this.mockObject.getLayoutType();
    }

    public long getParentPlid()
        throws PortalException, SystemException
    {
        return this.mockObject.getParentPlid();
    }

    public String getRegularURL(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRegularURL(param0);
    }

    public String getResetLayoutURL(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getResetLayoutURL(param0);
    }

    public String getResetMaxStateURL(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getResetMaxStateURL(param0);
    }

    public String getTarget() {
        return this.mockObject.getTarget();
    }

    public boolean hasAncestor(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.hasAncestor(param0);
    }

    public boolean hasChildren()
        throws SystemException
    {
        return this.mockObject.hasChildren();
    }

    public boolean isChildSelected(boolean param0, Layout param1)
        throws PortalException, SystemException
    {
        return this.mockObject.isChildSelected(param0, param1);
    }

    public boolean isContentDisplayPage() {
        return this.mockObject.isContentDisplayPage();
    }

    public boolean isFirstChild() {
        return this.mockObject.isFirstChild();
    }

    public boolean isFirstParent() {
        return this.mockObject.isFirstParent();
    }

    public boolean isInheritLookAndFeel() {
        return this.mockObject.isInheritLookAndFeel();
    }

    public boolean isInheritWapLookAndFeel() {
        return this.mockObject.isInheritWapLookAndFeel();
    }

    public boolean isLayoutPrototypeLinkActive() {
        return this.mockObject.isLayoutPrototypeLinkActive();
    }

    public boolean isPublicLayout() {
        return this.mockObject.isPublicLayout();
    }

    public boolean isRootLayout() {
        return this.mockObject.isRootLayout();
    }

    public boolean isSelected(boolean param0, Layout param1, long param2) {
        return this.mockObject.isSelected(param0, param1, param2);
    }

    public boolean isTypeArticle() {
        return this.mockObject.isTypeArticle();
    }

    public boolean isTypeControlPanel() {
        return this.mockObject.isTypeControlPanel();
    }

    public boolean isTypeEmbedded() {
        return this.mockObject.isTypeEmbedded();
    }

    public boolean isTypeLinkToLayout() {
        return this.mockObject.isTypeLinkToLayout();
    }

    public boolean isTypePanel() {
        return this.mockObject.isTypePanel();
    }

    public boolean isTypePortlet() {
        return this.mockObject.isTypePortlet();
    }

    public boolean isTypeURL() {
        return this.mockObject.isTypeURL();
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

    public int compareTo(Layout param0) {
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

    public void setPriority(int param0) {
    }

    public int getPriority() {
        return this.mockObject.getPriority();
    }

    public void setName(String param0) {
    }

    public void setName(String param0, Locale param1) {
    }

    public void setName(String param0, Locale param1, Locale param2) {
    }

    public String getType() {
        return this.mockObject.getType();
    }

    public boolean isHidden() {
        return this.mockObject.isHidden();
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

    public CacheModel<Layout> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Layout toEscapedModel() {
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

    public long getPlid() {
        return this.mockObject.getPlid();
    }

    public void setPlid(long param0) {
    }

    public String getUuid() {
        return this.mockObject.getUuid();
    }

    public void setUuid(String param0) {
    }

    public void setType(String param0) {
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setDescription(String param0) {
    }

    public void setDescription(String param0, Locale param1) {
    }

    public void setDescription(String param0, Locale param1, Locale param2) {
    }

    public String getFriendlyURL() {
        return this.mockObject.getFriendlyURL();
    }

    public void setFriendlyURL(String param0) {
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

    public long getLayoutId() {
        return this.mockObject.getLayoutId();
    }

    public void setLayoutId(long param0) {
    }

    public long getParentLayoutId() {
        return this.mockObject.getParentLayoutId();
    }

    public void setParentLayoutId(long param0) {
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

    public String getTitle() {
        return this.mockObject.getTitle();
    }

    public String getTitle(Locale param0) {
        return this.mockObject.getTitle(param0);
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

    public String getKeywords() {
        return this.mockObject.getKeywords();
    }

    public String getKeywords(Locale param0) {
        return this.mockObject.getKeywords(param0);
    }

    public String getKeywords(Locale param0, boolean param1) {
        return this.mockObject.getKeywords(param0, param1);
    }

    public String getKeywords(String param0) {
        return this.mockObject.getKeywords(param0);
    }

    public String getKeywords(String param0, boolean param1) {
        return this.mockObject.getKeywords(param0, param1);
    }

    public String getKeywordsCurrentLanguageId() {
        return this.mockObject.getKeywordsCurrentLanguageId();
    }

    public String getKeywordsCurrentValue() {
        return this.mockObject.getKeywordsCurrentValue();
    }

    public Map<Locale, String> getKeywordsMap() {
        return this.mockObject.getKeywordsMap();
    }

    public void setKeywords(String param0) {
    }

    public void setKeywords(String param0, Locale param1) {
    }

    public void setKeywords(String param0, Locale param1, Locale param2) {
    }

    public void setKeywordsCurrentLanguageId(String param0) {
    }

    public void setKeywordsMap(Map<Locale, String> param0) {
    }

    public void setKeywordsMap(Map<Locale, String> param0, Locale param1) {
    }

    public String getRobots() {
        return this.mockObject.getRobots();
    }

    public String getRobots(Locale param0) {
        return this.mockObject.getRobots(param0);
    }

    public String getRobots(Locale param0, boolean param1) {
        return this.mockObject.getRobots(param0, param1);
    }

    public String getRobots(String param0) {
        return this.mockObject.getRobots(param0);
    }

    public String getRobots(String param0, boolean param1) {
        return this.mockObject.getRobots(param0, param1);
    }

    public String getRobotsCurrentLanguageId() {
        return this.mockObject.getRobotsCurrentLanguageId();
    }

    public String getRobotsCurrentValue() {
        return this.mockObject.getRobotsCurrentValue();
    }

    public Map<Locale, String> getRobotsMap() {
        return this.mockObject.getRobotsMap();
    }

    public void setRobots(String param0) {
    }

    public void setRobots(String param0, Locale param1) {
    }

    public void setRobots(String param0, Locale param1, Locale param2) {
    }

    public void setRobotsCurrentLanguageId(String param0) {
    }

    public void setRobotsMap(Map<Locale, String> param0) {
    }

    public void setRobotsMap(Map<Locale, String> param0, Locale param1) {
    }

    public boolean getHidden() {
        return this.mockObject.getHidden();
    }

    public void setHidden(boolean param0) {
    }

    public boolean getIconImage() {
        return this.mockObject.getIconImage();
    }

    public boolean isIconImage() {
        return this.mockObject.isIconImage();
    }

    public void setIconImage(boolean param0) {
    }

    public long getIconImageId() {
        return this.mockObject.getIconImageId();
    }

    public void setIconImageId(long param0) {
    }

    public String getLayoutPrototypeUuid() {
        return this.mockObject.getLayoutPrototypeUuid();
    }

    public void setLayoutPrototypeUuid(String param0) {
    }

    public boolean getLayoutPrototypeLinkEnabled() {
        return this.mockObject.getLayoutPrototypeLinkEnabled();
    }

    public boolean isLayoutPrototypeLinkEnabled() {
        return this.mockObject.isLayoutPrototypeLinkEnabled();
    }

    public void setLayoutPrototypeLinkEnabled(boolean param0) {
    }

    public String getSourcePrototypeLayoutUuid() {
        return this.mockObject.getSourcePrototypeLayoutUuid();
    }

    public void setSourcePrototypeLayoutUuid(String param0) {
    }

    public void prepareLocalizedFieldsForImport(Locale param0)
        throws LocaleException
    {
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
