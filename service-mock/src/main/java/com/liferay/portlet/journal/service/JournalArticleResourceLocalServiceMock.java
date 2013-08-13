
package com.liferay.portlet.journal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.journal.model.JournalArticleResource;

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
public class JournalArticleResourceLocalServiceMock
    extends MockService<JournalArticleResourceLocalService>
    implements JournalArticleResourceLocalService
{

    private HashMap<Long, JournalArticleResource> _serviceObjects = new HashMap<Long, JournalArticleResource>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalArticleResourceLocalService.class));
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

    public JournalArticleResource getArticleResource(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleResource(param0);
    }

    public JournalArticleResource addJournalArticleResource(JournalArticleResource param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalArticleResource createJournalArticleResource(long param0) {
        return this.mockObject.createJournalArticleResource(param0);
    }

    public JournalArticleResource deleteJournalArticleResource(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalArticleResource(param0);
    }

    public JournalArticleResource deleteJournalArticleResource(JournalArticleResource param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalArticleResource(param0);
    }

    public JournalArticleResource fetchJournalArticleResource(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalArticleResource getJournalArticleResource(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalArticleResource getJournalArticleResourceByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalArticleResourceByUuidAndGroupId(param0, param1);
    }

    public List<JournalArticleResource> getJournalArticleResources(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalArticleResources(param0, param1);
    }

    public int getJournalArticleResourcesCount()
        throws SystemException
    {
        return this.mockObject.getJournalArticleResourcesCount();
    }

    public JournalArticleResource updateJournalArticleResource(JournalArticleResource param0)
        throws SystemException
    {
        return this.mockObject.updateJournalArticleResource(param0);
    }

    public JournalArticleResource updateJournalArticleResource(JournalArticleResource param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateJournalArticleResource(param0, param1);
    }

    public void deleteArticleResource(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public long getArticleResourcePrimKey(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getArticleResourcePrimKey(param0, param1);
    }

    public long getArticleResourcePrimKey(String param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getArticleResourcePrimKey(param0, param1, param2);
    }

    public List<JournalArticleResource> getArticleResources(long param0)
        throws SystemException
    {
        return this.mockObject.getArticleResources(param0);
    }

}
