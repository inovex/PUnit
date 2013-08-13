
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.LocaleException;
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
public class LayoutRevisionMock
    extends MockService<LayoutRevision>
    implements LayoutRevision
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.LayoutRevision.class));
    }

    public String getTypeSettings() {
        return this.mockObject.getTypeSettings();
    }

    public UnicodeProperties getTypeSettingsProperties() {
        return this.mockObject.getTypeSettingsProperties();
    }

    public void setTypeSettings(String param0) {
    }

    public void setTypeSettingsProperties(UnicodeProperties param0) {
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

    public Theme getTheme()
        throws PortalException, SystemException
    {
        return this.mockObject.getTheme();
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

    public LayoutBranch getLayoutBranch()
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutBranch();
    }

    public List<LayoutRevision> getChildren()
        throws SystemException
    {
        return this.mockObject.getChildren();
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

    public boolean hasChildren()
        throws SystemException
    {
        return this.mockObject.hasChildren();
    }

    public boolean isInheritLookAndFeel() {
        return this.mockObject.isInheritLookAndFeel();
    }

    public boolean isInheritWapLookAndFeel() {
        return this.mockObject.isInheritWapLookAndFeel();
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

    public int compareTo(LayoutRevision param0) {
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

    public void setHead(boolean param0) {
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

    public CacheModel<LayoutRevision> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public LayoutRevision toEscapedModel() {
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

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setGroupId(long param0) {
    }

    public void setDescription(String param0) {
    }

    public void setDescription(String param0, Locale param1) {
    }

    public void setDescription(String param0, Locale param1, Locale param2) {
    }

    public int getStatus() {
        return this.mockObject.getStatus();
    }

    public void setStatus(int param0) {
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

    public long getLayoutBranchId() {
        return this.mockObject.getLayoutBranchId();
    }

    public void setLayoutBranchId(long param0) {
    }

    public long getLayoutSetBranchId() {
        return this.mockObject.getLayoutSetBranchId();
    }

    public void setLayoutSetBranchId(long param0) {
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

    public void prepareLocalizedFieldsForImport(Locale param0)
        throws LocaleException
    {
    }

    public long getLayoutRevisionId() {
        return this.mockObject.getLayoutRevisionId();
    }

    public void setLayoutRevisionId(long param0) {
    }

    public long getParentLayoutRevisionId() {
        return this.mockObject.getParentLayoutRevisionId();
    }

    public void setParentLayoutRevisionId(long param0) {
    }

    public boolean getHead() {
        return this.mockObject.getHead();
    }

    public boolean isHead() {
        return this.mockObject.isHead();
    }

    public boolean getMajor() {
        return this.mockObject.getMajor();
    }

    public boolean isMajor() {
        return this.mockObject.isMajor();
    }

    public void setMajor(boolean param0) {
    }

    public long getStatusByUserId() {
        return this.mockObject.getStatusByUserId();
    }

    public void setStatusByUserId(long param0) {
    }

    public String getStatusByUserUuid()
        throws SystemException
    {
        return this.mockObject.getStatusByUserUuid();
    }

    public void setStatusByUserUuid(String param0) {
    }

    public String getStatusByUserName() {
        return this.mockObject.getStatusByUserName();
    }

    public void setStatusByUserName(String param0) {
    }

    public Date getStatusDate() {
        return this.mockObject.getStatusDate();
    }

    public void setStatusDate(Date param0) {
    }

    public boolean getApproved() {
        return this.mockObject.getApproved();
    }

    public boolean isApproved() {
        return this.mockObject.isApproved();
    }

    public boolean isDenied() {
        return this.mockObject.isDenied();
    }

    public boolean isDraft() {
        return this.mockObject.isDraft();
    }

    public boolean isExpired() {
        return this.mockObject.isExpired();
    }

    public boolean isInactive() {
        return this.mockObject.isInactive();
    }

    public boolean isIncomplete() {
        return this.mockObject.isIncomplete();
    }

    public boolean isPending() {
        return this.mockObject.isPending();
    }

    public boolean isScheduled() {
        return this.mockObject.isScheduled();
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
