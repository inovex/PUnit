
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Website;
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
public class WebsiteLocalServiceMock
    extends MockService<WebsiteLocalService>
    implements WebsiteLocalService
{

    private HashMap<Long, Website> _serviceObjects = new HashMap<Long, Website>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.WebsiteLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Website addWebsite(Website param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Website addWebsite(long param0, String param1, long param2, String param3, int param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addWebsite(param0, param1, param2, param3, param4, param5);
    }

    public Website addWebsite(long param0, String param1, long param2, String param3, int param4, boolean param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addWebsite(param0, param1, param2, param3, param4, param5, param6);
    }

    public Website fetchWebsite(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Website getWebsite(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Website getWebsiteByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getWebsiteByUuidAndCompanyId(param0, param1);
    }

    public int getWebsitesCount()
        throws SystemException
    {
        return this.mockObject.getWebsitesCount();
    }

    public Website updateWebsite(long param0, String param1, int param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateWebsite(param0, param1, param2, param3);
    }

    public Website updateWebsite(Website param0)
        throws SystemException
    {
        return this.mockObject.updateWebsite(param0);
    }

    public void deleteWebsites(long param0, String param1, long param2)
        throws SystemException
    {
    }

    public Website createWebsite(long param0) {
        return this.mockObject.createWebsite(param0);
    }

    public Website deleteWebsite(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWebsite(param0);
    }

    public Website deleteWebsite(Website param0)
        throws SystemException
    {
        return this.mockObject.deleteWebsite(param0);
    }

    public Website fetchWebsiteByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchWebsiteByUuidAndCompanyId(param0, param1);
    }

    public List<Website> getWebsites()
        throws SystemException
    {
        return this.mockObject.getWebsites();
    }

    public List<Website> getWebsites(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getWebsites(param0, param1, param2);
    }

    public List<Website> getWebsites(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getWebsites(param0, param1);
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

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public long dynamicQueryCount(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0);
    }

    public long dynamicQueryCount(DynamicQuery param0, Projection param1)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0, param1);
    }

    public String getBeanIdentifier() {
        return this.mockObject.getBeanIdentifier();
    }

    public void setBeanIdentifier(String param0) {
    }

}
