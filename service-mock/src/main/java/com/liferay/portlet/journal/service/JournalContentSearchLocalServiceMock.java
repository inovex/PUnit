
package com.liferay.portlet.journal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.journal.model.JournalContentSearch;

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
public class JournalContentSearchLocalServiceMock
    extends MockService<JournalContentSearchLocalService>
    implements JournalContentSearchLocalService
{

    private HashMap<Long, JournalContentSearch> _serviceObjects = new HashMap<Long, JournalContentSearch>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalContentSearchLocalService.class));
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

    public JournalContentSearch addJournalContentSearch(JournalContentSearch param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalContentSearch createJournalContentSearch(long param0) {
        return this.mockObject.createJournalContentSearch(param0);
    }

    public JournalContentSearch deleteJournalContentSearch(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalContentSearch(param0);
    }

    public JournalContentSearch deleteJournalContentSearch(JournalContentSearch param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalContentSearch(param0);
    }

    public JournalContentSearch fetchJournalContentSearch(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalContentSearch getJournalContentSearch(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<JournalContentSearch> getJournalContentSearchs(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalContentSearchs(param0, param1);
    }

    public int getJournalContentSearchsCount()
        throws SystemException
    {
        return this.mockObject.getJournalContentSearchsCount();
    }

    public JournalContentSearch updateJournalContentSearch(JournalContentSearch param0)
        throws SystemException
    {
        return this.mockObject.updateJournalContentSearch(param0);
    }

    public JournalContentSearch updateJournalContentSearch(JournalContentSearch param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateJournalContentSearch(param0, param1);
    }

    public void checkContentSearches(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteArticleContentSearch(long param0, boolean param1, long param2, String param3, String param4)
        throws PortalException, SystemException
    {
    }

    public void deleteArticleContentSearches(long param0, String param1)
        throws SystemException
    {
    }

    public void deleteLayoutContentSearches(long param0, boolean param1, long param2)
        throws SystemException
    {
    }

    public void deleteOwnerContentSearches(long param0, boolean param1)
        throws SystemException
    {
    }

    public List<JournalContentSearch> getArticleContentSearches()
        throws SystemException
    {
        return this.mockObject.getArticleContentSearches();
    }

    public List<JournalContentSearch> getArticleContentSearches(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getArticleContentSearches(param0, param1);
    }

    public List<JournalContentSearch> getArticleContentSearches(String param0)
        throws SystemException
    {
        return this.mockObject.getArticleContentSearches(param0);
    }

    public List<Long> getLayoutIds(long param0, boolean param1, String param2)
        throws SystemException
    {
        return this.mockObject.getLayoutIds(param0, param1, param2);
    }

    public int getLayoutIdsCount(long param0, boolean param1, String param2)
        throws SystemException
    {
        return this.mockObject.getLayoutIdsCount(param0, param1, param2);
    }

    public int getLayoutIdsCount(String param0)
        throws SystemException
    {
        return this.mockObject.getLayoutIdsCount(param0);
    }

    public JournalContentSearch updateContentSearch(long param0, boolean param1, long param2, String param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateContentSearch(param0, param1, param2, param3, param4);
    }

    public JournalContentSearch updateContentSearch(long param0, boolean param1, long param2, String param3, String param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateContentSearch(param0, param1, param2, param3, param4, param5);
    }

    public List<JournalContentSearch> updateContentSearch(long param0, boolean param1, long param2, String param3, String[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateContentSearch(param0, param1, param2, param3, param4);
    }

}
