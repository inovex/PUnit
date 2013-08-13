
package com.liferay.portlet.wiki.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.wiki.model.WikiPageResource;

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
public class WikiPageResourceLocalServiceMock
    extends MockService<WikiPageResourceLocalService>
    implements WikiPageResourceLocalService
{

    private HashMap<Long, WikiPageResource> _serviceObjects = new HashMap<Long, WikiPageResource>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.wiki.service.WikiPageResourceLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
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

    public WikiPageResource addWikiPageResource(WikiPageResource param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public WikiPageResource createWikiPageResource(long param0) {
        return this.mockObject.createWikiPageResource(param0);
    }

    public WikiPageResource deleteWikiPageResource(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWikiPageResource(param0);
    }

    public WikiPageResource deleteWikiPageResource(WikiPageResource param0)
        throws SystemException
    {
        return this.mockObject.deleteWikiPageResource(param0);
    }

    public WikiPageResource fetchWikiPageResource(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public WikiPageResource getWikiPageResource(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<WikiPageResource> getWikiPageResources(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getWikiPageResources(param0, param1);
    }

    public int getWikiPageResourcesCount()
        throws SystemException
    {
        return this.mockObject.getWikiPageResourcesCount();
    }

    public WikiPageResource updateWikiPageResource(WikiPageResource param0)
        throws SystemException
    {
        return this.mockObject.updateWikiPageResource(param0);
    }

    public WikiPageResource updateWikiPageResource(WikiPageResource param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateWikiPageResource(param0, param1);
    }

    public WikiPageResource addPageResource(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.addPageResource(param0, param1);
    }

    public void deletePageResource(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public WikiPageResource getPageResource(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPageResource(param0);
    }

    public WikiPageResource getPageResource(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPageResource(param0, param1);
    }

    public long getPageResourcePrimKey(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getPageResourcePrimKey(param0, param1);
    }

}
