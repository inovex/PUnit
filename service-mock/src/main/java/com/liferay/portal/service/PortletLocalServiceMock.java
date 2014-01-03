
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.plugin.PluginPackage;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.model.PortletApp;
import com.liferay.portal.model.PortletCategory;
import com.liferay.portlet.expando.model.CustomAttributesDisplay;
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
public class PortletLocalServiceMock
    extends MockService<PortletLocalService>
    implements PortletLocalService
{

    private HashMap<Long, Portlet> _serviceObjects = new HashMap<Long, Portlet>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PortletLocalService.class));
    }

    public void clearCache() {
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<Portlet> getPortlets(long param0)
        throws SystemException
    {
        return this.mockObject.getPortlets(param0);
    }

    public List<Portlet> getPortlets(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPortlets(param0, param1);
    }

    public List<Portlet> getPortlets() {
        return this.mockObject.getPortlets();
    }

    public List<Portlet> getPortlets(long param0, boolean param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getPortlets(param0, param1, param2);
    }

    public Portlet fetchPortlet(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Portlet getPortlet(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Portlet addPortlet(Portlet param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Portlet createPortlet(long param0) {
        return this.mockObject.createPortlet(param0);
    }

    public void deletePortlet(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
    }

    public Portlet deletePortlet(Portlet param0)
        throws SystemException
    {
        return this.mockObject.deletePortlet(param0);
    }

    public Portlet deletePortlet(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePortlet(param0);
    }

    public int getPortletsCount()
        throws SystemException
    {
        return this.mockObject.getPortletsCount();
    }

    public Portlet clonePortlet(long param0, String param1) {
        return this.mockObject.clonePortlet(param0, param1);
    }

    public Portlet clonePortlet(String param0) {
        return this.mockObject.clonePortlet(param0);
    }

    public void checkPortlet(Portlet param0)
        throws PortalException, SystemException
    {
    }

    public Portlet updatePortlet(long param0, String param1, String param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.updatePortlet(param0, param1, param2, param3);
    }

    public Portlet updatePortlet(Portlet param0)
        throws SystemException
    {
        return this.mockObject.updatePortlet(param0);
    }

    public void addPortletCategory(long param0, String param1) {
    }

    public void checkPortlets(long param0)
        throws PortalException, SystemException
    {
    }

    public void clearCompanyPortletsPool() {
    }

    public void deletePortlets(long param0, String[] param1, long param2)
        throws PortalException, SystemException
    {
    }

    public Portlet deployRemotePortlet(Portlet param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deployRemotePortlet(param0, param1);
    }

    public Portlet deployRemotePortlet(Portlet param0, String[] param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deployRemotePortlet(param0, param1);
    }

    public void destroyPortlet(Portlet param0) {
    }

    public void destroyRemotePortlet(Portlet param0) {
    }

    public List<CustomAttributesDisplay> getCustomAttributesDisplays() {
        return this.mockObject.getCustomAttributesDisplays();
    }

    public PortletCategory getEARDisplay(String param0)
        throws SystemException
    {
        return this.mockObject.getEARDisplay(param0);
    }

    public List<Portlet> getFriendlyURLMapperPortlets() {
        return this.mockObject.getFriendlyURLMapperPortlets();
    }

    public List<FriendlyURLMapper> getFriendlyURLMappers() {
        return this.mockObject.getFriendlyURLMappers();
    }

    public PortletApp getPortletApp(String param0) {
        return this.mockObject.getPortletApp(param0);
    }

    public Portlet getPortletById(String param0) {
        return this.mockObject.getPortletById(param0);
    }

    public Portlet getPortletById(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getPortletById(param0, param1);
    }

    public Portlet getPortletByStrutsPath(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getPortletByStrutsPath(param0, param1);
    }

    public List<Portlet> getScopablePortlets() {
        return this.mockObject.getScopablePortlets();
    }

    public PortletCategory getWARDisplay(String param0, String param1)
        throws SystemException
    {
        return this.mockObject.getWARDisplay(param0, param1);
    }

    public boolean hasPortlet(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.hasPortlet(param0, param1);
    }

    public void initEAR(ServletContext param0, String[] param1, PluginPackage param2) {
    }

    public List<Portlet> initWAR(String param0, ServletContext param1, String[] param2, PluginPackage param3) {
        return this.mockObject.initWAR(param0, param1, param2, param3);
    }

    public Map<String, Portlet> loadGetPortletsPool(long param0)
        throws SystemException
    {
        return this.mockObject.loadGetPortletsPool(param0);
    }

    public void removeCompanyPortletsPool(long param0) {
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public long dynamicQueryCount(DynamicQuery param0, Projection param1)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0, param1);
    }

    public long dynamicQueryCount(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0);
    }

    public String getBeanIdentifier() {
        return this.mockObject.getBeanIdentifier();
    }

    public void setBeanIdentifier(String param0) {
    }

}
