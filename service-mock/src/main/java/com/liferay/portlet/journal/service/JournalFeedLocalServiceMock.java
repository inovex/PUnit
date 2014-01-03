
package com.liferay.portlet.journal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.journal.model.JournalFeed;
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
public class JournalFeedLocalServiceMock
    extends MockService<JournalFeedLocalService>
    implements JournalFeedLocalService
{

    private HashMap<Long, JournalFeed> _serviceObjects = new HashMap<Long, JournalFeed>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalFeedLocalService.class));
    }

    public List<JournalFeed> search(long param0, long param1, String param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public List<JournalFeed> search(long param0, long param1, String param2, String param3, String param4, boolean param5, int param6, int param7, OrderByComparator param8)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public int searchCount(long param0, long param1, String param2, String param3, String param4, boolean param5)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5);
    }

    public int searchCount(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2);
    }

    public JournalFeed addJournalFeed(JournalFeed param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalFeed getFeed(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFeed(param0);
    }

    public JournalFeed getFeed(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFeed(param0, param1);
    }

    public JournalFeed fetchFeed(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchFeed(param0, param1);
    }

    public JournalFeed createJournalFeed(long param0) {
        return this.mockObject.createJournalFeed(param0);
    }

    public List<JournalFeed> getFeeds()
        throws SystemException
    {
        return this.mockObject.getFeeds();
    }

    public List<JournalFeed> getFeeds(long param0)
        throws SystemException
    {
        return this.mockObject.getFeeds(param0);
    }

    public List<JournalFeed> getFeeds(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFeeds(param0, param1, param2);
    }

    public JournalFeed addFeed(long param0, long param1, String param2, boolean param3, String param4, String param5, String param6, String param7, String param8, String param9, int param10, String param11, String param12, String param13, String param14, String param15, String param16, double param17, ServiceContext param18)
        throws PortalException, SystemException
    {
        return this.mockObject.addFeed(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18);
    }

    public void deleteFeed(JournalFeed param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFeed(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFeed(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public JournalFeed updateFeed(long param0, String param1, String param2, String param3, String param4, String param5, String param6, String param7, int param8, String param9, String param10, String param11, String param12, String param13, String param14, double param15, ServiceContext param16)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFeed(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
    }

    public JournalFeed deleteJournalFeed(JournalFeed param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalFeed(param0);
    }

    public JournalFeed deleteJournalFeed(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalFeed(param0);
    }

    public JournalFeed fetchJournalFeed(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalFeed fetchJournalFeedByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchJournalFeedByUuidAndCompanyId(param0, param1);
    }

    public JournalFeed fetchJournalFeedByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchJournalFeedByUuidAndGroupId(param0, param1);
    }

    public JournalFeed getJournalFeed(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalFeed getJournalFeedByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalFeedByUuidAndCompanyId(param0, param1);
    }

    public JournalFeed getJournalFeedByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalFeedByUuidAndGroupId(param0, param1);
    }

    public List<JournalFeed> getJournalFeeds(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalFeeds(param0, param1);
    }

    public int getJournalFeedsCount()
        throws SystemException
    {
        return this.mockObject.getJournalFeedsCount();
    }

    public JournalFeed updateJournalFeed(JournalFeed param0)
        throws SystemException
    {
        return this.mockObject.updateJournalFeed(param0);
    }

    public void addFeedResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addFeedResources(JournalFeed param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addFeedResources(JournalFeed param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addFeedResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public int getFeedsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getFeedsCount(param0);
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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
