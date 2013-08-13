
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.portlet.PortletMode;
import javax.portlet.WindowState;
import com.liferay.portal.kernel.atom.AtomCollectionAdapter;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.PortletDataHandler;
import com.liferay.portal.kernel.plugin.PluginPackage;
import com.liferay.portal.kernel.poller.PollerProcessor;
import com.liferay.portal.kernel.pop.MessageListener;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.liferay.portal.kernel.portlet.PortletLayoutListener;
import com.liferay.portal.kernel.scheduler.SchedulerEntry;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.OpenSearch;
import com.liferay.portal.kernel.servlet.URLEncoder;
import com.liferay.portal.kernel.webdav.WebDAVStorage;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.liferay.portal.kernel.xml.QName;
import com.liferay.portal.kernel.xmlrpc.Method;
import com.liferay.portal.security.permission.PermissionPropagator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.ControlPanelEntry;
import com.liferay.portlet.asset.model.AssetRendererFactory;
import com.liferay.portlet.expando.model.CustomAttributesDisplay;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.social.model.SocialActivityInterpreter;
import com.liferay.portlet.social.model.SocialRequestInterpreter;

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
public class PortletMock
    extends MockService<Portlet>
    implements Portlet
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Portlet.class));
    }

    public boolean equals(Object param0) {
        return this.mockObject.equals(param0);
    }

    public Object clone() {
        return this.mockObject.clone();
    }

    public int compareTo(Portlet param0) {
        return this.mockObject.compareTo(param0);
    }

    public boolean isStatic() {
        return this.mockObject.isStatic();
    }

    public void setTimestamp(long param0) {
    }

    public String getDisplayName() {
        return this.mockObject.getDisplayName();
    }

    public long getTimestamp() {
        return this.mockObject.getTimestamp();
    }

    public String getResourceBundle() {
        return this.mockObject.getResourceBundle();
    }

    public void setResourceBundle(String param0) {
    }

    public String getRootPortletId() {
        return this.mockObject.getRootPortletId();
    }

    public String getPreferencesValidator() {
        return this.mockObject.getPreferencesValidator();
    }

    public boolean getSystem() {
        return this.mockObject.getSystem();
    }

    public boolean isSystem() {
        return this.mockObject.isSystem();
    }

    public void setSystem(boolean param0) {
    }

    public String getStaticResourcePath() {
        return this.mockObject.getStaticResourcePath();
    }

    public String getContextPath() {
        return this.mockObject.getContextPath();
    }

    public String getVirtualPath() {
        return this.mockObject.getVirtualPath();
    }

    public void setVirtualPath(String param0) {
    }

    public PluginSetting getDefaultPluginSetting() {
        return this.mockObject.getDefaultPluginSetting();
    }

    public String getPluginId() {
        return this.mockObject.getPluginId();
    }

    public PluginPackage getPluginPackage() {
        return this.mockObject.getPluginPackage();
    }

    public String getPluginType() {
        return this.mockObject.getPluginType();
    }

    public void setDefaultPluginSetting(PluginSetting param0) {
    }

    public void setPluginPackage(PluginPackage param0) {
    }

    public String[] getRolesArray() {
        return this.mockObject.getRolesArray();
    }

    public boolean hasRoleWithName(String param0) {
        return this.mockObject.hasRoleWithName(param0);
    }

    public void setRoles(String param0) {
    }

    public void setRolesArray(String[] param0) {
    }

    public PortletApp getPortletApp() {
        return this.mockObject.getPortletApp();
    }

    public void addProcessingEvent(QName param0) {
    }

    public void addPublicRenderParameter(PublicRenderParameter param0) {
    }

    public void addPublishingEvent(QName param0) {
    }

    public void addSchedulerEntry(SchedulerEntry param0) {
    }

    public int getActionTimeout() {
        return this.mockObject.getActionTimeout();
    }

    public boolean getActionURLRedirect() {
        return this.mockObject.getActionURLRedirect();
    }

    public boolean getAddDefaultResource() {
        return this.mockObject.getAddDefaultResource();
    }

    public boolean getAjaxable() {
        return this.mockObject.getAjaxable();
    }

    public Set<String> getAllPortletModes() {
        return this.mockObject.getAllPortletModes();
    }

    public Set<String> getAllWindowStates() {
        return this.mockObject.getAllWindowStates();
    }

    public List<String> getAssetRendererFactoryClasses() {
        return this.mockObject.getAssetRendererFactoryClasses();
    }

    public List<AssetRendererFactory> getAssetRendererFactoryInstances() {
        return this.mockObject.getAssetRendererFactoryInstances();
    }

    public List<String> getAtomCollectionAdapterClasses() {
        return this.mockObject.getAtomCollectionAdapterClasses();
    }

    public List<AtomCollectionAdapter<?>> getAtomCollectionAdapterInstances() {
        return this.mockObject.getAtomCollectionAdapterInstances();
    }

    public Set<String> getAutopropagatedParameters() {
        return this.mockObject.getAutopropagatedParameters();
    }

    public Portlet getClonedInstance(String param0) {
        return this.mockObject.getClonedInstance(param0);
    }

    public String getConfigurationActionClass() {
        return this.mockObject.getConfigurationActionClass();
    }

    public ConfigurationAction getConfigurationActionInstance() {
        return this.mockObject.getConfigurationActionInstance();
    }

    public String getControlPanelEntryCategory() {
        return this.mockObject.getControlPanelEntryCategory();
    }

    public String getControlPanelEntryClass() {
        return this.mockObject.getControlPanelEntryClass();
    }

    public ControlPanelEntry getControlPanelEntryInstance() {
        return this.mockObject.getControlPanelEntryInstance();
    }

    public double getControlPanelEntryWeight() {
        return this.mockObject.getControlPanelEntryWeight();
    }

    public String getCssClassWrapper() {
        return this.mockObject.getCssClassWrapper();
    }

    public List<String> getCustomAttributesDisplayClasses() {
        return this.mockObject.getCustomAttributesDisplayClasses();
    }

    public List<CustomAttributesDisplay> getCustomAttributesDisplayInstances() {
        return this.mockObject.getCustomAttributesDisplayInstances();
    }

    public String getDefaultPreferences() {
        return this.mockObject.getDefaultPreferences();
    }

    public Integer getExpCache() {
        return this.mockObject.getExpCache();
    }

    public String getFacebookIntegration() {
        return this.mockObject.getFacebookIntegration();
    }

    public List<String> getFooterPortalCss() {
        return this.mockObject.getFooterPortalCss();
    }

    public List<String> getFooterPortalJavaScript() {
        return this.mockObject.getFooterPortalJavaScript();
    }

    public List<String> getFooterPortletCss() {
        return this.mockObject.getFooterPortletCss();
    }

    public List<String> getFooterPortletJavaScript() {
        return this.mockObject.getFooterPortletJavaScript();
    }

    public String getFriendlyURLMapperClass() {
        return this.mockObject.getFriendlyURLMapperClass();
    }

    public FriendlyURLMapper getFriendlyURLMapperInstance() {
        return this.mockObject.getFriendlyURLMapperInstance();
    }

    public String getFriendlyURLMapping() {
        return this.mockObject.getFriendlyURLMapping();
    }

    public String getFriendlyURLRoutes() {
        return this.mockObject.getFriendlyURLRoutes();
    }

    public List<String> getHeaderPortalCss() {
        return this.mockObject.getHeaderPortalCss();
    }

    public List<String> getHeaderPortalJavaScript() {
        return this.mockObject.getHeaderPortalJavaScript();
    }

    public List<String> getHeaderPortletCss() {
        return this.mockObject.getHeaderPortletCss();
    }

    public List<String> getHeaderPortletJavaScript() {
        return this.mockObject.getHeaderPortletJavaScript();
    }

    public String getIcon() {
        return this.mockObject.getIcon();
    }

    public boolean getInclude() {
        return this.mockObject.getInclude();
    }

    public List<String> getIndexerClasses() {
        return this.mockObject.getIndexerClasses();
    }

    public List<Indexer> getIndexerInstances() {
        return this.mockObject.getIndexerInstances();
    }

    public Map<String, String> getInitParams() {
        return this.mockObject.getInitParams();
    }

    public boolean getInstanceable() {
        return this.mockObject.getInstanceable();
    }

    public String getInstanceId() {
        return this.mockObject.getInstanceId();
    }

    public boolean getLayoutCacheable() {
        return this.mockObject.getLayoutCacheable();
    }

    public boolean getMaximizeEdit() {
        return this.mockObject.getMaximizeEdit();
    }

    public boolean getMaximizeHelp() {
        return this.mockObject.getMaximizeHelp();
    }

    public String getOpenSearchClass() {
        return this.mockObject.getOpenSearchClass();
    }

    public OpenSearch getOpenSearchInstance() {
        return this.mockObject.getOpenSearchInstance();
    }

    public String getParentStrutsPath() {
        return this.mockObject.getParentStrutsPath();
    }

    public String getPermissionPropagatorClass() {
        return this.mockObject.getPermissionPropagatorClass();
    }

    public PermissionPropagator getPermissionPropagatorInstance() {
        return this.mockObject.getPermissionPropagatorInstance();
    }

    public String getPollerProcessorClass() {
        return this.mockObject.getPollerProcessorClass();
    }

    public PollerProcessor getPollerProcessorInstance() {
        return this.mockObject.getPollerProcessorInstance();
    }

    public String getPopMessageListenerClass() {
        return this.mockObject.getPopMessageListenerClass();
    }

    public MessageListener getPopMessageListenerInstance() {
        return this.mockObject.getPopMessageListenerInstance();
    }

    public boolean getPopUpPrint() {
        return this.mockObject.getPopUpPrint();
    }

    public String getPortletClass() {
        return this.mockObject.getPortletClass();
    }

    public String getPortletDataHandlerClass() {
        return this.mockObject.getPortletDataHandlerClass();
    }

    public PortletDataHandler getPortletDataHandlerInstance() {
        return this.mockObject.getPortletDataHandlerInstance();
    }

    public Map<String, PortletFilter> getPortletFilters() {
        return this.mockObject.getPortletFilters();
    }

    public PortletInfo getPortletInfo() {
        return this.mockObject.getPortletInfo();
    }

    public String getPortletLayoutListenerClass() {
        return this.mockObject.getPortletLayoutListenerClass();
    }

    public PortletLayoutListener getPortletLayoutListenerInstance() {
        return this.mockObject.getPortletLayoutListenerInstance();
    }

    public Map<String, Set<String>> getPortletModes() {
        return this.mockObject.getPortletModes();
    }

    public String getPortletName() {
        return this.mockObject.getPortletName();
    }

    public String getPortletURLClass() {
        return this.mockObject.getPortletURLClass();
    }

    public boolean getPreferencesCompanyWide() {
        return this.mockObject.getPreferencesCompanyWide();
    }

    public boolean getPreferencesOwnedByGroup() {
        return this.mockObject.getPreferencesOwnedByGroup();
    }

    public boolean getPreferencesUniquePerLayout() {
        return this.mockObject.getPreferencesUniquePerLayout();
    }

    public boolean getPrivateRequestAttributes() {
        return this.mockObject.getPrivateRequestAttributes();
    }

    public boolean getPrivateSessionAttributes() {
        return this.mockObject.getPrivateSessionAttributes();
    }

    public QName getProcessingEvent(String param0, String param1) {
        return this.mockObject.getProcessingEvent(param0, param1);
    }

    public Set<QName> getProcessingEvents() {
        return this.mockObject.getProcessingEvents();
    }

    public PublicRenderParameter getPublicRenderParameter(String param0) {
        return this.mockObject.getPublicRenderParameter(param0);
    }

    public PublicRenderParameter getPublicRenderParameter(String param0, String param1) {
        return this.mockObject.getPublicRenderParameter(param0, param1);
    }

    public Set<PublicRenderParameter> getPublicRenderParameters() {
        return this.mockObject.getPublicRenderParameters();
    }

    public Set<QName> getPublishingEvents() {
        return this.mockObject.getPublishingEvents();
    }

    public boolean getReady() {
        return this.mockObject.getReady();
    }

    public boolean getRemoteable() {
        return this.mockObject.getRemoteable();
    }

    public int getRenderTimeout() {
        return this.mockObject.getRenderTimeout();
    }

    public int getRenderWeight() {
        return this.mockObject.getRenderWeight();
    }

    public boolean getRestoreCurrentView() {
        return this.mockObject.getRestoreCurrentView();
    }

    public Map<String, String> getRoleMappers() {
        return this.mockObject.getRoleMappers();
    }

    public Portlet getRootPortlet() {
        return this.mockObject.getRootPortlet();
    }

    public List<SchedulerEntry> getSchedulerEntries() {
        return this.mockObject.getSchedulerEntries();
    }

    public boolean getScopeable() {
        return this.mockObject.getScopeable();
    }

    public boolean getShowPortletAccessDenied() {
        return this.mockObject.getShowPortletAccessDenied();
    }

    public boolean getShowPortletInactive() {
        return this.mockObject.getShowPortletInactive();
    }

    public String getSocialActivityInterpreterClass() {
        return this.mockObject.getSocialActivityInterpreterClass();
    }

    public SocialActivityInterpreter getSocialActivityInterpreterInstance() {
        return this.mockObject.getSocialActivityInterpreterInstance();
    }

    public String getSocialRequestInterpreterClass() {
        return this.mockObject.getSocialRequestInterpreterClass();
    }

    public SocialRequestInterpreter getSocialRequestInterpreterInstance() {
        return this.mockObject.getSocialRequestInterpreterInstance();
    }

    public boolean getStatic() {
        return this.mockObject.getStatic();
    }

    public boolean getStaticEnd() {
        return this.mockObject.getStaticEnd();
    }

    public boolean getStaticStart() {
        return this.mockObject.getStaticStart();
    }

    public String getStrutsPath() {
        return this.mockObject.getStrutsPath();
    }

    public Set<String> getSupportedLocales() {
        return this.mockObject.getSupportedLocales();
    }

    public boolean getUndeployedPortlet() {
        return this.mockObject.getUndeployedPortlet();
    }

    public Set<String> getUnlinkedRoles() {
        return this.mockObject.getUnlinkedRoles();
    }

    public String getURLEncoderClass() {
        return this.mockObject.getURLEncoderClass();
    }

    public URLEncoder getURLEncoderInstance() {
        return this.mockObject.getURLEncoderInstance();
    }

    public boolean getUseDefaultTemplate() {
        return this.mockObject.getUseDefaultTemplate();
    }

    public String getUserPrincipalStrategy() {
        return this.mockObject.getUserPrincipalStrategy();
    }

    public String getWebDAVStorageClass() {
        return this.mockObject.getWebDAVStorageClass();
    }

    public WebDAVStorage getWebDAVStorageInstance() {
        return this.mockObject.getWebDAVStorageInstance();
    }

    public String getWebDAVStorageToken() {
        return this.mockObject.getWebDAVStorageToken();
    }

    public Map<String, Set<String>> getWindowStates() {
        return this.mockObject.getWindowStates();
    }

    public List<String> getWorkflowHandlerClasses() {
        return this.mockObject.getWorkflowHandlerClasses();
    }

    public List<WorkflowHandler> getWorkflowHandlerInstances() {
        return this.mockObject.getWorkflowHandlerInstances();
    }

    public String getXmlRpcMethodClass() {
        return this.mockObject.getXmlRpcMethodClass();
    }

    public Method getXmlRpcMethodInstance() {
        return this.mockObject.getXmlRpcMethodInstance();
    }

    public boolean hasAddPortletPermission(long param0) {
        return this.mockObject.hasAddPortletPermission(param0);
    }

    public boolean hasMultipleMimeTypes() {
        return this.mockObject.hasMultipleMimeTypes();
    }

    public boolean hasPortletMode(String param0, PortletMode param1) {
        return this.mockObject.hasPortletMode(param0, param1);
    }

    public boolean hasWindowState(String param0, WindowState param1) {
        return this.mockObject.hasWindowState(param0, param1);
    }

    public boolean isActionURLRedirect() {
        return this.mockObject.isActionURLRedirect();
    }

    public boolean isAddDefaultResource() {
        return this.mockObject.isAddDefaultResource();
    }

    public boolean isAjaxable() {
        return this.mockObject.isAjaxable();
    }

    public boolean isInclude() {
        return this.mockObject.isInclude();
    }

    public boolean isInstanceable() {
        return this.mockObject.isInstanceable();
    }

    public boolean isLayoutCacheable() {
        return this.mockObject.isLayoutCacheable();
    }

    public boolean isMaximizeEdit() {
        return this.mockObject.isMaximizeEdit();
    }

    public boolean isMaximizeHelp() {
        return this.mockObject.isMaximizeHelp();
    }

    public boolean isPopUpPrint() {
        return this.mockObject.isPopUpPrint();
    }

    public boolean isPreferencesCompanyWide() {
        return this.mockObject.isPreferencesCompanyWide();
    }

    public boolean isPreferencesOwnedByGroup() {
        return this.mockObject.isPreferencesOwnedByGroup();
    }

    public boolean isPreferencesUniquePerLayout() {
        return this.mockObject.isPreferencesUniquePerLayout();
    }

    public boolean isPrivateRequestAttributes() {
        return this.mockObject.isPrivateRequestAttributes();
    }

    public boolean isPrivateSessionAttributes() {
        return this.mockObject.isPrivateSessionAttributes();
    }

    public boolean isReady() {
        return this.mockObject.isReady();
    }

    public boolean isRemoteable() {
        return this.mockObject.isRemoteable();
    }

    public boolean isRestoreCurrentView() {
        return this.mockObject.isRestoreCurrentView();
    }

    public boolean isScopeable() {
        return this.mockObject.isScopeable();
    }

    public boolean isShowPortletAccessDenied() {
        return this.mockObject.isShowPortletAccessDenied();
    }

    public boolean isShowPortletInactive() {
        return this.mockObject.isShowPortletInactive();
    }

    public boolean isStaticEnd() {
        return this.mockObject.isStaticEnd();
    }

    public boolean isStaticStart() {
        return this.mockObject.isStaticStart();
    }

    public boolean isUndeployedPortlet() {
        return this.mockObject.isUndeployedPortlet();
    }

    public boolean isUseDefaultTemplate() {
        return this.mockObject.isUseDefaultTemplate();
    }

    public void linkRoles() {
    }

    public void setActionTimeout(int param0) {
    }

    public void setActionURLRedirect(boolean param0) {
    }

    public void setAddDefaultResource(boolean param0) {
    }

    public void setAjaxable(boolean param0) {
    }

    public void setAssetRendererFactoryClasses(List<String> param0) {
    }

    public void setAtomCollectionAdapterClasses(List<String> param0) {
    }

    public void setAutopropagatedParameters(Set<String> param0) {
    }

    public void setConfigurationActionClass(String param0) {
    }

    public void setControlPanelEntryCategory(String param0) {
    }

    public void setControlPanelEntryClass(String param0) {
    }

    public void setControlPanelEntryWeight(double param0) {
    }

    public void setCssClassWrapper(String param0) {
    }

    public void setCustomAttributesDisplayClasses(List<String> param0) {
    }

    public void setDefaultPreferences(String param0) {
    }

    public void setDisplayName(String param0) {
    }

    public void setExpCache(Integer param0) {
    }

    public void setFacebookIntegration(String param0) {
    }

    public void setFooterPortalCss(List<String> param0) {
    }

    public void setFooterPortalJavaScript(List<String> param0) {
    }

    public void setFooterPortletCss(List<String> param0) {
    }

    public void setFooterPortletJavaScript(List<String> param0) {
    }

    public void setFriendlyURLMapperClass(String param0) {
    }

    public void setFriendlyURLMapping(String param0) {
    }

    public void setFriendlyURLRoutes(String param0) {
    }

    public void setHeaderPortalCss(List<String> param0) {
    }

    public void setHeaderPortalJavaScript(List<String> param0) {
    }

    public void setHeaderPortletCss(List<String> param0) {
    }

    public void setHeaderPortletJavaScript(List<String> param0) {
    }

    public void setIcon(String param0) {
    }

    public void setInclude(boolean param0) {
    }

    public void setIndexerClasses(List<String> param0) {
    }

    public void setInitParams(Map<String, String> param0) {
    }

    public void setInstanceable(boolean param0) {
    }

    public void setLayoutCacheable(boolean param0) {
    }

    public void setMaximizeEdit(boolean param0) {
    }

    public void setMaximizeHelp(boolean param0) {
    }

    public void setOpenSearchClass(String param0) {
    }

    public void setParentStrutsPath(String param0) {
    }

    public void setPermissionPropagatorClass(String param0) {
    }

    public void setPollerProcessorClass(String param0) {
    }

    public void setPopMessageListenerClass(String param0) {
    }

    public void setPopUpPrint(boolean param0) {
    }

    public void setPortletApp(PortletApp param0) {
    }

    public void setPortletClass(String param0) {
    }

    public void setPortletDataHandlerClass(String param0) {
    }

    public void setPortletFilters(Map<String, PortletFilter> param0) {
    }

    public void setPortletInfo(PortletInfo param0) {
    }

    public void setPortletLayoutListenerClass(String param0) {
    }

    public void setPortletModes(Map<String, Set<String>> param0) {
    }

    public void setPortletName(String param0) {
    }

    public void setPortletURLClass(String param0) {
    }

    public void setPreferencesCompanyWide(boolean param0) {
    }

    public void setPreferencesOwnedByGroup(boolean param0) {
    }

    public void setPreferencesUniquePerLayout(boolean param0) {
    }

    public void setPreferencesValidator(String param0) {
    }

    public void setPrivateRequestAttributes(boolean param0) {
    }

    public void setPrivateSessionAttributes(boolean param0) {
    }

    public void setProcessingEvents(Set<QName> param0) {
    }

    public void setPublicRenderParameters(Set<PublicRenderParameter> param0) {
    }

    public void setPublishingEvents(Set<QName> param0) {
    }

    public void setReady(boolean param0) {
    }

    public void setRemoteable(boolean param0) {
    }

    public void setRenderTimeout(int param0) {
    }

    public void setRenderWeight(int param0) {
    }

    public void setRestoreCurrentView(boolean param0) {
    }

    public void setRoleMappers(Map<String, String> param0) {
    }

    public void setSchedulerEntries(List<SchedulerEntry> param0) {
    }

    public void setScopeable(boolean param0) {
    }

    public void setShowPortletAccessDenied(boolean param0) {
    }

    public void setShowPortletInactive(boolean param0) {
    }

    public void setSocialActivityInterpreterClass(String param0) {
    }

    public void setSocialRequestInterpreterClass(String param0) {
    }

    public void setStatic(boolean param0) {
    }

    public void setStaticStart(boolean param0) {
    }

    public void setStrutsPath(String param0) {
    }

    public void setSupportedLocales(Set<String> param0) {
    }

    public void setUndeployedPortlet(boolean param0) {
    }

    public void setUnlinkedRoles(Set<String> param0) {
    }

    public void setURLEncoderClass(String param0) {
    }

    public void setUseDefaultTemplate(boolean param0) {
    }

    public void setUserPrincipalStrategy(String param0) {
    }

    public void setWebDAVStorageClass(String param0) {
    }

    public void setWebDAVStorageToken(String param0) {
    }

    public void setWindowStates(Map<String, Set<String>> param0) {
    }

    public void setWorkflowHandlerClasses(List<String> param0) {
    }

    public void setXmlRpcMethodClass(String param0) {
    }

    public String toString() {
        return this.mockObject.toString();
    }

    public int hashCode() {
        return this.mockObject.hashCode();
    }

    public long getId() {
        return this.mockObject.getId();
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

    public CacheModel<Portlet> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Portlet toEscapedModel() {
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

    public String getPortletId() {
        return this.mockObject.getPortletId();
    }

    public void setId(long param0) {
    }

    public boolean getActive() {
        return this.mockObject.getActive();
    }

    public boolean isActive() {
        return this.mockObject.isActive();
    }

    public void setActive(boolean param0) {
    }

    public String getRoles() {
        return this.mockObject.getRoles();
    }

    public void setPortletId(String param0) {
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
