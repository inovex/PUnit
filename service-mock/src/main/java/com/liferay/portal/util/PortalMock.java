
package com.liferay.portal.util;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PreferencesValidator;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;
import javax.portlet.WindowState;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.servlet.taglib.ui.BreadcrumbEntry;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.upload.UploadServletRequest;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.model.Resource;
import com.liferay.portal.model.ResourcePermission;
import com.liferay.portal.model.User;
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
public class PortalMock
    extends MockService<Portal>
    implements Portal
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.util.Portal.class));
    }

    public String getClassName(long param0) {
        return this.mockObject.getClassName(param0);
    }

    public String getHost(HttpServletRequest param0) {
        return this.mockObject.getHost(param0);
    }

    public String getHost(PortletRequest param0) {
        return this.mockObject.getHost(param0);
    }

    public Date getDate(int param0, int param1, int param2) {
        return this.mockObject.getDate(param0, param1, param2);
    }

    public Date getDate(int param0, int param1, int param2, Class<? extends PortalException> param3)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3);
    }

    public Date getDate(int param0, int param1, int param2, int param3, int param4, Class<? extends PortalException> param5)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3, param4, param5);
    }

    public Date getDate(int param0, int param1, int param2, int param3, int param4, PortalException param5)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3, param4, param5);
    }

    public Date getDate(int param0, int param1, int param2, int param3, int param4, TimeZone param5, Class<? extends PortalException> param6)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3, param4, param5, param6);
    }

    public Date getDate(int param0, int param1, int param2, int param3, int param4, TimeZone param5, PortalException param6)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3, param4, param5, param6);
    }

    public Date getDate(int param0, int param1, int param2, PortalException param3)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3);
    }

    public Date getDate(int param0, int param1, int param2, TimeZone param3, Class<? extends PortalException> param4)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3, param4);
    }

    public Date getDate(int param0, int param1, int param2, TimeZone param3, PortalException param4)
        throws PortalException
    {
        return this.mockObject.getDate(param0, param1, param2, param3, param4);
    }

    public long getCompanyId(HttpServletRequest param0) {
        return this.mockObject.getCompanyId(param0);
    }

    public long getCompanyId(PortletRequest param0) {
        return this.mockObject.getCompanyId(param0);
    }

    public String getCurrentURL(HttpServletRequest param0) {
        return this.mockObject.getCurrentURL(param0);
    }

    public String getCurrentURL(PortletRequest param0) {
        return this.mockObject.getCurrentURL(param0);
    }

    public Map<String, Serializable> getExpandoBridgeAttributes(ExpandoBridge param0, PortletRequest param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getExpandoBridgeAttributes(param0, param1);
    }

    public Map<String, Serializable> getExpandoBridgeAttributes(ExpandoBridge param0, UploadPortletRequest param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getExpandoBridgeAttributes(param0, param1);
    }

    public String[] getGroupPermissions(HttpServletRequest param0) {
        return this.mockObject.getGroupPermissions(param0);
    }

    public String[] getGroupPermissions(PortletRequest param0) {
        return this.mockObject.getGroupPermissions(param0);
    }

    public String[] getGuestPermissions(HttpServletRequest param0) {
        return this.mockObject.getGuestPermissions(param0);
    }

    public String[] getGuestPermissions(PortletRequest param0) {
        return this.mockObject.getGuestPermissions(param0);
    }

    public String getLayoutFullURL(Layout param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFullURL(param0, param1);
    }

    public String getLayoutFullURL(Layout param0, ThemeDisplay param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFullURL(param0, param1, param2);
    }

    public String getLayoutFullURL(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFullURL(param0, param1);
    }

    public String getLayoutFullURL(long param0, String param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFullURL(param0, param1, param2);
    }

    public String getLayoutFullURL(ThemeDisplay param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFullURL(param0);
    }

    public String getLayoutURL(Layout param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutURL(param0, param1);
    }

    public String getLayoutURL(Layout param0, ThemeDisplay param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutURL(param0, param1, param2);
    }

    public String getLayoutURL(ThemeDisplay param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutURL(param0);
    }

    public String getPathMain() {
        return this.mockObject.getPathMain();
    }

    public String getPortalURL(HttpServletRequest param0) {
        return this.mockObject.getPortalURL(param0);
    }

    public String getPortalURL(HttpServletRequest param0, boolean param1) {
        return this.mockObject.getPortalURL(param0, param1);
    }

    public String getPortalURL(Layout param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPortalURL(param0, param1);
    }

    public String getPortalURL(PortletRequest param0) {
        return this.mockObject.getPortalURL(param0);
    }

    public String getPortalURL(PortletRequest param0, boolean param1) {
        return this.mockObject.getPortalURL(param0, param1);
    }

    public String getPortalURL(String param0, int param1, boolean param2) {
        return this.mockObject.getPortalURL(param0, param1, param2);
    }

    public String getPortalURL(ThemeDisplay param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPortalURL(param0);
    }

    public long getScopeGroupId(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getScopeGroupId(param0);
    }

    public long getScopeGroupId(HttpServletRequest param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getScopeGroupId(param0, param1);
    }

    public long getScopeGroupId(HttpServletRequest param0, String param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getScopeGroupId(param0, param1, param2);
    }

    public long getScopeGroupId(Layout param0) {
        return this.mockObject.getScopeGroupId(param0);
    }

    public long getScopeGroupId(Layout param0, String param1) {
        return this.mockObject.getScopeGroupId(param0, param1);
    }

    public long getScopeGroupId(long param0) {
        return this.mockObject.getScopeGroupId(param0);
    }

    public long getScopeGroupId(PortletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getScopeGroupId(param0);
    }

    public long getUserId(HttpServletRequest param0) {
        return this.mockObject.getUserId(param0);
    }

    public long getUserId(PortletRequest param0) {
        return this.mockObject.getUserId(param0);
    }

    public long getParentGroupId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentGroupId(param0);
    }

    public Locale getLocale(HttpServletRequest param0) {
        return this.mockObject.getLocale(param0);
    }

    public Locale getLocale(RenderRequest param0) {
        return this.mockObject.getLocale(param0);
    }

    public String getPortletId(HttpServletRequest param0) {
        return this.mockObject.getPortletId(param0);
    }

    public String getPortletId(PortletRequest param0) {
        return this.mockObject.getPortletId(param0);
    }

    public void addPageDescription(String param0, HttpServletRequest param1) {
    }

    public void addPageKeywords(String param0, HttpServletRequest param1) {
    }

    public void addPageSubtitle(String param0, HttpServletRequest param1) {
    }

    public void addPageTitle(String param0, HttpServletRequest param1) {
    }

    public void addPortalPortEventListener(PortalPortEventListener param0) {
    }

    public void addPortletBreadcrumbEntry(HttpServletRequest param0, String param1, String param2) {
    }

    public void addPortletBreadcrumbEntry(HttpServletRequest param0, String param1, String param2, Map<String, Object> param3) {
    }

    public void addPortletDefaultResource(HttpServletRequest param0, Portlet param1)
        throws PortalException, SystemException
    {
    }

    public void addPortletDefaultResource(long param0, Layout param1, Portlet param2)
        throws PortalException, SystemException
    {
    }

    public String addPreservedParameters(ThemeDisplay param0, Layout param1, String param2, boolean param3) {
        return this.mockObject.addPreservedParameters(param0, param1, param2, param3);
    }

    public String addPreservedParameters(ThemeDisplay param0, String param1) {
        return this.mockObject.addPreservedParameters(param0, param1);
    }

    public void clearRequestParameters(RenderRequest param0) {
    }

    public void copyRequestParameters(ActionRequest param0, ActionResponse param1) {
    }

    public String escapeRedirect(String param0) {
        return this.mockObject.escapeRedirect(param0);
    }

    public String generateRandomKey(HttpServletRequest param0, String param1) {
        return this.mockObject.generateRandomKey(param0, param1);
    }

    public String getActualURL(long param0, boolean param1, String param2, String param3, Map<String, String[]> param4, Map<String, Object> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getActualURL(param0, param1, param2, param3, param4, param5);
    }

    public Locale[] getAlternateLocales(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getAlternateLocales(param0);
    }

    public String getAlternateURL(HttpServletRequest param0, String param1, Locale param2) {
        return this.mockObject.getAlternateURL(param0, param1, param2);
    }

    public String getAlternateURL(String param0, ThemeDisplay param1, Locale param2) {
        return this.mockObject.getAlternateURL(param0, param1, param2);
    }

    public Set<String> getAuthTokenIgnoreActions() {
        return this.mockObject.getAuthTokenIgnoreActions();
    }

    public Set<String> getAuthTokenIgnorePortlets() {
        return this.mockObject.getAuthTokenIgnorePortlets();
    }

    public BaseModel<?> getBaseModel(Resource param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getBaseModel(param0);
    }

    public BaseModel<?> getBaseModel(ResourcePermission param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getBaseModel(param0);
    }

    public BaseModel<?> getBaseModel(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getBaseModel(param0, param1);
    }

    public long getBasicAuthUserId(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getBasicAuthUserId(param0);
    }

    public long getBasicAuthUserId(HttpServletRequest param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getBasicAuthUserId(param0, param1);
    }

    public String getCanonicalURL(String param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getCanonicalURL(param0, param1);
    }

    public String getCanonicalURL(String param0, ThemeDisplay param1, Layout param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getCanonicalURL(param0, param1, param2);
    }

    public String getCDNHost() {
        return this.mockObject.getCDNHost();
    }

    public String getCDNHost(boolean param0) {
        return this.mockObject.getCDNHost(param0);
    }

    public String getCDNHost(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCDNHost(param0);
    }

    public String getCDNHostHttp(long param0) {
        return this.mockObject.getCDNHostHttp(param0);
    }

    public String getCDNHostHttps(long param0) {
        return this.mockObject.getCDNHostHttps(param0);
    }

    public long getClassNameId(Class<?> param0) {
        return this.mockObject.getClassNameId(param0);
    }

    public long getClassNameId(String param0) {
        return this.mockObject.getClassNameId(param0);
    }

    public String getClassNamePortletId(String param0) {
        return this.mockObject.getClassNamePortletId(param0);
    }

    public Company getCompany(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompany(param0);
    }

    public Company getCompany(PortletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompany(param0);
    }

    public long[] getCompanyIds() {
        return this.mockObject.getCompanyIds();
    }

    public String getComputerAddress() {
        return this.mockObject.getComputerAddress();
    }

    public String getComputerName() {
        return this.mockObject.getComputerName();
    }

    public String getControlPanelCategory(String param0, ThemeDisplay param1)
        throws SystemException
    {
        return this.mockObject.getControlPanelCategory(param0, param1);
    }

    public String getControlPanelFullURL(long param0, String param1, Map<String, String[]> param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getControlPanelFullURL(param0, param1, param2);
    }

    public Set<Portlet> getControlPanelPortlets(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getControlPanelPortlets(param0, param1);
    }

    public List<Portlet> getControlPanelPortlets(String param0, ThemeDisplay param1)
        throws SystemException
    {
        return this.mockObject.getControlPanelPortlets(param0, param1);
    }

    public String getCreateAccountURL(HttpServletRequest param0, ThemeDisplay param1)
        throws Exception
    {
        return this.mockObject.getCreateAccountURL(param0, param1);
    }

    public String getCurrentCompleteURL(HttpServletRequest param0) {
        return this.mockObject.getCurrentCompleteURL(param0);
    }

    public String getCustomSQLFunctionIsNotNull() {
        return this.mockObject.getCustomSQLFunctionIsNotNull();
    }

    public String getCustomSQLFunctionIsNull() {
        return this.mockObject.getCustomSQLFunctionIsNull();
    }

    public long getDefaultCompanyId() {
        return this.mockObject.getDefaultCompanyId();
    }

    public long getDigestAuthUserId(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDigestAuthUserId(param0);
    }

    public String getEmailFromAddress(PortletPreferences param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getEmailFromAddress(param0, param1, param2);
    }

    public String getEmailFromName(PortletPreferences param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getEmailFromName(param0, param1, param2);
    }

    public Serializable getExpandoValue(PortletRequest param0, String param1, int param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getExpandoValue(param0, param1, param2, param3);
    }

    public Serializable getExpandoValue(UploadPortletRequest param0, String param1, int param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getExpandoValue(param0, param1, param2, param3);
    }

    public String getFacebookURL(Portlet param0, String param1, ThemeDisplay param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFacebookURL(param0, param1, param2);
    }

    public String getFirstPageLayoutTypes(PageContext param0) {
        return this.mockObject.getFirstPageLayoutTypes(param0);
    }

    public String getGlobalLibDir() {
        return this.mockObject.getGlobalLibDir();
    }

    public String getGoogleGadgetURL(Portlet param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGoogleGadgetURL(param0, param1);
    }

    public String getGroupFriendlyURL(Group param0, boolean param1, ThemeDisplay param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupFriendlyURL(param0, param1, param2);
    }

    public String getHomeURL(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getHomeURL(param0);
    }

    public HttpServletRequest getHttpServletRequest(PortletRequest param0) {
        return this.mockObject.getHttpServletRequest(param0);
    }

    public HttpServletResponse getHttpServletResponse(PortletResponse param0) {
        return this.mockObject.getHttpServletResponse(param0);
    }

    public String getJournalArticleActualURL(long param0, String param1, String param2, Map<String, String[]> param3, Map<String, Object> param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalArticleActualURL(param0, param1, param2, param3, param4);
    }

    public String getJsSafePortletId(String param0) {
        return this.mockObject.getJsSafePortletId(param0);
    }

    public String getLayoutActualURL(Layout param0) {
        return this.mockObject.getLayoutActualURL(param0);
    }

    public String getLayoutActualURL(Layout param0, String param1) {
        return this.mockObject.getLayoutActualURL(param0, param1);
    }

    public String getLayoutActualURL(long param0, boolean param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutActualURL(param0, param1, param2, param3);
    }

    public String getLayoutActualURL(long param0, boolean param1, String param2, String param3, Map<String, String[]> param4, Map<String, Object> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutActualURL(param0, param1, param2, param3, param4, param5);
    }

    public String getLayoutEditPage(Layout param0) {
        return this.mockObject.getLayoutEditPage(param0);
    }

    public String getLayoutEditPage(String param0) {
        return this.mockObject.getLayoutEditPage(param0);
    }

    public String getLayoutFriendlyURL(Layout param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFriendlyURL(param0, param1);
    }

    public String getLayoutFriendlyURL(Layout param0, ThemeDisplay param1, Locale param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFriendlyURL(param0, param1, param2);
    }

    public String getLayoutSetFriendlyURL(LayoutSet param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutSetFriendlyURL(param0, param1);
    }

    public String getLayoutTarget(Layout param0) {
        return this.mockObject.getLayoutTarget(param0);
    }

    public String getLayoutViewPage(Layout param0) {
        return this.mockObject.getLayoutViewPage(param0);
    }

    public String getLayoutViewPage(String param0) {
        return this.mockObject.getLayoutViewPage(param0);
    }

    public LiferayPortletRequest getLiferayPortletRequest(PortletRequest param0) {
        return this.mockObject.getLiferayPortletRequest(param0);
    }

    public LiferayPortletResponse getLiferayPortletResponse(PortletResponse param0) {
        return this.mockObject.getLiferayPortletResponse(param0);
    }

    public String getMailId(String param0, String param1, Object[] param2) {
        return this.mockObject.getMailId(param0, param1, param2);
    }

    public String getNetvibesURL(Portlet param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getNetvibesURL(param0, param1);
    }

    public String getNewPortletTitle(String param0, String param1, String param2) {
        return this.mockObject.getNewPortletTitle(param0, param1, param2);
    }

    public HttpServletRequest getOriginalServletRequest(HttpServletRequest param0) {
        return this.mockObject.getOriginalServletRequest(param0);
    }

    public String getOuterPortletId(HttpServletRequest param0) {
        return this.mockObject.getOuterPortletId(param0);
    }

    public String getPathContext() {
        return this.mockObject.getPathContext();
    }

    public String getPathFriendlyURLPrivateGroup() {
        return this.mockObject.getPathFriendlyURLPrivateGroup();
    }

    public String getPathFriendlyURLPrivateUser() {
        return this.mockObject.getPathFriendlyURLPrivateUser();
    }

    public String getPathFriendlyURLPublic() {
        return this.mockObject.getPathFriendlyURLPublic();
    }

    public String getPathImage() {
        return this.mockObject.getPathImage();
    }

    public String getPathProxy() {
        return this.mockObject.getPathProxy();
    }

    public long getPlidFromFriendlyURL(long param0, String param1) {
        return this.mockObject.getPlidFromFriendlyURL(param0, param1);
    }

    public long getPlidFromPortletId(long param0, boolean param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getPlidFromPortletId(param0, param1, param2);
    }

    public long getPlidFromPortletId(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPlidFromPortletId(param0, param1);
    }

    public String getPortalLibDir() {
        return this.mockObject.getPortalLibDir();
    }

    public int getPortalPort() {
        return this.mockObject.getPortalPort();
    }

    public int getPortalPort(boolean param0) {
        return this.mockObject.getPortalPort(param0);
    }

    public Properties getPortalProperties() {
        return this.mockObject.getPortalProperties();
    }

    public String getPortalWebDir() {
        return this.mockObject.getPortalWebDir();
    }

    public Set<String> getPortletAddDefaultResourceCheckWhitelist() {
        return this.mockObject.getPortletAddDefaultResourceCheckWhitelist();
    }

    public Set<String> getPortletAddDefaultResourceCheckWhitelistActions() {
        return this.mockObject.getPortletAddDefaultResourceCheckWhitelistActions();
    }

    public List<BreadcrumbEntry> getPortletBreadcrumbList(HttpServletRequest param0) {
        return this.mockObject.getPortletBreadcrumbList(param0);
    }

    public List<BreadcrumbEntry> getPortletBreadcrumbs(HttpServletRequest param0) {
        return this.mockObject.getPortletBreadcrumbs(param0);
    }

    public String getPortletDescription(Portlet param0, ServletContext param1, Locale param2) {
        return this.mockObject.getPortletDescription(param0, param1, param2);
    }

    public String getPortletDescription(Portlet param0, User param1) {
        return this.mockObject.getPortletDescription(param0, param1);
    }

    public String getPortletDescription(String param0, Locale param1) {
        return this.mockObject.getPortletDescription(param0, param1);
    }

    public String getPortletDescription(String param0, String param1) {
        return this.mockObject.getPortletDescription(param0, param1);
    }

    public String getPortletDescription(String param0, User param1) {
        return this.mockObject.getPortletDescription(param0, param1);
    }

    public String getPortletLongTitle(Portlet param0, Locale param1) {
        return this.mockObject.getPortletLongTitle(param0, param1);
    }

    public String getPortletLongTitle(Portlet param0, ServletContext param1, Locale param2) {
        return this.mockObject.getPortletLongTitle(param0, param1, param2);
    }

    public String getPortletLongTitle(Portlet param0, String param1) {
        return this.mockObject.getPortletLongTitle(param0, param1);
    }

    public String getPortletLongTitle(Portlet param0, User param1) {
        return this.mockObject.getPortletLongTitle(param0, param1);
    }

    public String getPortletLongTitle(String param0, Locale param1) {
        return this.mockObject.getPortletLongTitle(param0, param1);
    }

    public String getPortletLongTitle(String param0, String param1) {
        return this.mockObject.getPortletLongTitle(param0, param1);
    }

    public String getPortletLongTitle(String param0, User param1) {
        return this.mockObject.getPortletLongTitle(param0, param1);
    }

    public String getPortletNamespace(String param0) {
        return this.mockObject.getPortletNamespace(param0);
    }

    public String getPortletTitle(Portlet param0, Locale param1) {
        return this.mockObject.getPortletTitle(param0, param1);
    }

    public String getPortletTitle(Portlet param0, ServletContext param1, Locale param2) {
        return this.mockObject.getPortletTitle(param0, param1, param2);
    }

    public String getPortletTitle(Portlet param0, String param1) {
        return this.mockObject.getPortletTitle(param0, param1);
    }

    public String getPortletTitle(Portlet param0, User param1) {
        return this.mockObject.getPortletTitle(param0, param1);
    }

    public String getPortletTitle(RenderResponse param0) {
        return this.mockObject.getPortletTitle(param0);
    }

    public String getPortletTitle(String param0, Locale param1) {
        return this.mockObject.getPortletTitle(param0, param1);
    }

    public String getPortletTitle(String param0, String param1) {
        return this.mockObject.getPortletTitle(param0, param1);
    }

    public String getPortletTitle(String param0, User param1) {
        return this.mockObject.getPortletTitle(param0, param1);
    }

    public String getPortletXmlFileName()
        throws SystemException
    {
        return this.mockObject.getPortletXmlFileName();
    }

    public PortletPreferences getPreferences(HttpServletRequest param0) {
        return this.mockObject.getPreferences(param0);
    }

    public PreferencesValidator getPreferencesValidator(Portlet param0) {
        return this.mockObject.getPreferencesValidator(param0);
    }

    public String getRelativeHomeURL(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRelativeHomeURL(param0);
    }

    public User getSelectedUser(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getSelectedUser(param0);
    }

    public User getSelectedUser(HttpServletRequest param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getSelectedUser(param0, param1);
    }

    public User getSelectedUser(PortletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getSelectedUser(param0);
    }

    public User getSelectedUser(PortletRequest param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getSelectedUser(param0, param1);
    }

    public ServletContext getServletContext(Portlet param0, ServletContext param1) {
        return this.mockObject.getServletContext(param0, param1);
    }

    public String getSiteLoginURL(ThemeDisplay param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getSiteLoginURL(param0);
    }

    public String getStaticResourceURL(HttpServletRequest param0, String param1) {
        return this.mockObject.getStaticResourceURL(param0, param1);
    }

    public String getStaticResourceURL(HttpServletRequest param0, String param1, long param2) {
        return this.mockObject.getStaticResourceURL(param0, param1, param2);
    }

    public String getStaticResourceURL(HttpServletRequest param0, String param1, String param2) {
        return this.mockObject.getStaticResourceURL(param0, param1, param2);
    }

    public String getStaticResourceURL(HttpServletRequest param0, String param1, String param2, long param3) {
        return this.mockObject.getStaticResourceURL(param0, param1, param2, param3);
    }

    public String getStrutsAction(HttpServletRequest param0) {
        return this.mockObject.getStrutsAction(param0);
    }

    public String[] getSystemGroups() {
        return this.mockObject.getSystemGroups();
    }

    public String[] getSystemOrganizationRoles() {
        return this.mockObject.getSystemOrganizationRoles();
    }

    public String[] getSystemRoles() {
        return this.mockObject.getSystemRoles();
    }

    public String[] getSystemSiteRoles() {
        return this.mockObject.getSystemSiteRoles();
    }

    public String getUniqueElementId(HttpServletRequest param0, String param1, String param2) {
        return this.mockObject.getUniqueElementId(param0, param1, param2);
    }

    public String getUniqueElementId(PortletRequest param0, String param1, String param2) {
        return this.mockObject.getUniqueElementId(param0, param1, param2);
    }

    public UploadPortletRequest getUploadPortletRequest(PortletRequest param0) {
        return this.mockObject.getUploadPortletRequest(param0);
    }

    public UploadServletRequest getUploadServletRequest(HttpServletRequest param0) {
        return this.mockObject.getUploadServletRequest(param0);
    }

    public Date getUptime() {
        return this.mockObject.getUptime();
    }

    public String getURLWithSessionId(String param0, String param1) {
        return this.mockObject.getURLWithSessionId(param0, param1);
    }

    public User getUser(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUser(param0);
    }

    public User getUser(PortletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUser(param0);
    }

    public String getUserEmailAddress(long param0)
        throws SystemException
    {
        return this.mockObject.getUserEmailAddress(param0);
    }

    public String getUserName(long param0, String param1) {
        return this.mockObject.getUserName(param0, param1);
    }

    public String getUserName(long param0, String param1, HttpServletRequest param2) {
        return this.mockObject.getUserName(param0, param1, param2);
    }

    public String getUserName(long param0, String param1, String param2) {
        return this.mockObject.getUserName(param0, param1, param2);
    }

    public String getUserName(long param0, String param1, String param2, HttpServletRequest param3) {
        return this.mockObject.getUserName(param0, param1, param2, param3);
    }

    public String getUserPassword(HttpServletRequest param0) {
        return this.mockObject.getUserPassword(param0);
    }

    public String getUserPassword(HttpSession param0) {
        return this.mockObject.getUserPassword(param0);
    }

    public String getUserPassword(PortletRequest param0) {
        return this.mockObject.getUserPassword(param0);
    }

    public String getUserValue(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getUserValue(param0, param1, param2);
    }

    public long getValidUserId(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getValidUserId(param0, param1);
    }

    public String getVirtualLayoutActualURL(long param0, boolean param1, String param2, String param3, Map<String, String[]> param4, Map<String, Object> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getVirtualLayoutActualURL(param0, param1, param2, param3, param4, param5);
    }

    public String getWidgetURL(Portlet param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getWidgetURL(param0, param1);
    }

    public void initCustomSQL() {
    }

    public boolean isAllowAddPortletDefaultResource(HttpServletRequest param0, Portlet param1)
        throws PortalException, SystemException
    {
        return this.mockObject.isAllowAddPortletDefaultResource(param0, param1);
    }

    public boolean isCDNDynamicResourcesEnabled(HttpServletRequest param0)
        throws PortalException, SystemException
    {
        return this.mockObject.isCDNDynamicResourcesEnabled(param0);
    }

    public boolean isCDNDynamicResourcesEnabled(long param0) {
        return this.mockObject.isCDNDynamicResourcesEnabled(param0);
    }

    public boolean isCommunityAdmin(User param0, long param1)
        throws Exception
    {
        return this.mockObject.isCommunityAdmin(param0, param1);
    }

    public boolean isCommunityOwner(User param0, long param1)
        throws Exception
    {
        return this.mockObject.isCommunityOwner(param0, param1);
    }

    public boolean isCompanyAdmin(User param0)
        throws Exception
    {
        return this.mockObject.isCompanyAdmin(param0);
    }

    public boolean isCompanyControlPanelPortlet(String param0, String param1, ThemeDisplay param2)
        throws PortalException, SystemException
    {
        return this.mockObject.isCompanyControlPanelPortlet(param0, param1, param2);
    }

    public boolean isCompanyControlPanelPortlet(String param0, ThemeDisplay param1)
        throws PortalException, SystemException
    {
        return this.mockObject.isCompanyControlPanelPortlet(param0, param1);
    }

    public boolean isCompanyControlPanelVisible(ThemeDisplay param0)
        throws PortalException, SystemException
    {
        return this.mockObject.isCompanyControlPanelVisible(param0);
    }

    public boolean isControlPanelPortlet(String param0, String param1, ThemeDisplay param2)
        throws SystemException
    {
        return this.mockObject.isControlPanelPortlet(param0, param1, param2);
    }

    public boolean isControlPanelPortlet(String param0, ThemeDisplay param1)
        throws SystemException
    {
        return this.mockObject.isControlPanelPortlet(param0, param1);
    }

    public boolean isGroupAdmin(User param0, long param1)
        throws Exception
    {
        return this.mockObject.isGroupAdmin(param0, param1);
    }

    public boolean isGroupOwner(User param0, long param1)
        throws Exception
    {
        return this.mockObject.isGroupOwner(param0, param1);
    }

    public boolean isLayoutDescendant(Layout param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.isLayoutDescendant(param0, param1);
    }

    public boolean isLayoutFirstPageable(Layout param0) {
        return this.mockObject.isLayoutFirstPageable(param0);
    }

    public boolean isLayoutFirstPageable(String param0) {
        return this.mockObject.isLayoutFirstPageable(param0);
    }

    public boolean isLayoutFriendliable(Layout param0) {
        return this.mockObject.isLayoutFriendliable(param0);
    }

    public boolean isLayoutFriendliable(String param0) {
        return this.mockObject.isLayoutFriendliable(param0);
    }

    public boolean isLayoutParentable(Layout param0) {
        return this.mockObject.isLayoutParentable(param0);
    }

    public boolean isLayoutParentable(String param0) {
        return this.mockObject.isLayoutParentable(param0);
    }

    public boolean isLayoutSitemapable(Layout param0) {
        return this.mockObject.isLayoutSitemapable(param0);
    }

    public boolean isMethodGet(PortletRequest param0) {
        return this.mockObject.isMethodGet(param0);
    }

    public boolean isMethodPost(PortletRequest param0) {
        return this.mockObject.isMethodPost(param0);
    }

    public boolean isMultipartRequest(HttpServletRequest param0) {
        return this.mockObject.isMultipartRequest(param0);
    }

    public boolean isOmniadmin(long param0) {
        return this.mockObject.isOmniadmin(param0);
    }

    public boolean isReservedParameter(String param0) {
        return this.mockObject.isReservedParameter(param0);
    }

    public boolean isSecure(HttpServletRequest param0) {
        return this.mockObject.isSecure(param0);
    }

    public boolean isSystemGroup(String param0) {
        return this.mockObject.isSystemGroup(param0);
    }

    public boolean isSystemRole(String param0) {
        return this.mockObject.isSystemRole(param0);
    }

    public boolean isUpdateAvailable()
        throws SystemException
    {
        return this.mockObject.isUpdateAvailable();
    }

    public boolean isValidResourceId(String param0) {
        return this.mockObject.isValidResourceId(param0);
    }

    public void removePortalPortEventListener(PortalPortEventListener param0) {
    }

    public String renderPage(ServletContext param0, HttpServletRequest param1, HttpServletResponse param2, String param3)
        throws IOException, ServletException
    {
        return this.mockObject.renderPage(param0, param1, param2, param3);
    }

    public String renderPortlet(ServletContext param0, HttpServletRequest param1, HttpServletResponse param2, Portlet param3, String param4, boolean param5)
        throws IOException, ServletException
    {
        return this.mockObject.renderPortlet(param0, param1, param2, param3, param4, param5);
    }

    public String renderPortlet(ServletContext param0, HttpServletRequest param1, HttpServletResponse param2, Portlet param3, String param4, String param5, Integer param6, Integer param7, boolean param8)
        throws IOException, ServletException
    {
        return this.mockObject.renderPortlet(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public String renderPortlet(ServletContext param0, HttpServletRequest param1, HttpServletResponse param2, Portlet param3, String param4, String param5, Integer param6, Integer param7, String param8, boolean param9)
        throws IOException, ServletException
    {
        return this.mockObject.renderPortlet(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public void resetCDNHosts() {
    }

    public Set<String> resetPortletAddDefaultResourceCheckWhitelist() {
        return this.mockObject.resetPortletAddDefaultResourceCheckWhitelist();
    }

    public Set<String> resetPortletAddDefaultResourceCheckWhitelistActions() {
        return this.mockObject.resetPortletAddDefaultResourceCheckWhitelistActions();
    }

    public void sendError(Exception param0, ActionRequest param1, ActionResponse param2)
        throws IOException
    {
    }

    public void sendError(Exception param0, HttpServletRequest param1, HttpServletResponse param2)
        throws IOException, ServletException
    {
    }

    public void sendError(int param0, Exception param1, ActionRequest param2, ActionResponse param3)
        throws IOException
    {
    }

    public void sendError(int param0, Exception param1, HttpServletRequest param2, HttpServletResponse param3)
        throws IOException, ServletException
    {
    }

    public void setPageDescription(String param0, HttpServletRequest param1) {
    }

    public void setPageKeywords(String param0, HttpServletRequest param1) {
    }

    public void setPageSubtitle(String param0, HttpServletRequest param1) {
    }

    public void setPageTitle(String param0, HttpServletRequest param1) {
    }

    public void setPortalPort(HttpServletRequest param0) {
    }

    public void storePreferences(PortletPreferences param0)
        throws IOException, ValidatorException
    {
    }

    public String[] stripURLAnchor(String param0, String param1) {
        return this.mockObject.stripURLAnchor(param0, param1);
    }

    public String transformCustomSQL(String param0) {
        return this.mockObject.transformCustomSQL(param0);
    }

    public PortletMode updatePortletMode(String param0, User param1, Layout param2, PortletMode param3, HttpServletRequest param4) {
        return this.mockObject.updatePortletMode(param0, param1, param2, param3, param4);
    }

    public String updateRedirect(String param0, String param1, String param2) {
        return this.mockObject.updateRedirect(param0, param1, param2);
    }

    public WindowState updateWindowState(String param0, User param1, Layout param2, WindowState param3, HttpServletRequest param4) {
        return this.mockObject.updateWindowState(param0, param1, param2, param3, param4);
    }

}
