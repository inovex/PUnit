
package com.liferay.portlet.ratings.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.ratings.model.RatingsEntry;

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
public class RatingsEntryLocalServiceMock
    extends MockService<RatingsEntryLocalService>
    implements RatingsEntryLocalService
{

    private HashMap<Long, RatingsEntry> _serviceObjects = new HashMap<Long, RatingsEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.ratings.service.RatingsEntryLocalService.class));
    }

    public RatingsEntry getEntry(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0, param1, param2);
    }

    public List<RatingsEntry> getEntries(long param0, String param1, List<Long> param2)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2);
    }

    public List<RatingsEntry> getEntries(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1);
    }

    public List<RatingsEntry> getEntries(String param0, long param1, double param2)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void deleteEntry(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
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

    public int getEntriesCount(String param0, long param1, double param2)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0, param1, param2);
    }

    public RatingsEntry updateEntry(long param0, String param1, long param2, double param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4);
    }

    public RatingsEntry fetchEntry(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.fetchEntry(param0, param1, param2);
    }

    public RatingsEntry addRatingsEntry(RatingsEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public RatingsEntry createRatingsEntry(long param0) {
        return this.mockObject.createRatingsEntry(param0);
    }

    public RatingsEntry deleteRatingsEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteRatingsEntry(param0);
    }

    public RatingsEntry deleteRatingsEntry(RatingsEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteRatingsEntry(param0);
    }

    public RatingsEntry fetchRatingsEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public RatingsEntry getRatingsEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<RatingsEntry> getRatingsEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRatingsEntries(param0, param1);
    }

    public int getRatingsEntriesCount()
        throws SystemException
    {
        return this.mockObject.getRatingsEntriesCount();
    }

    public RatingsEntry updateRatingsEntry(RatingsEntry param0)
        throws SystemException
    {
        return this.mockObject.updateRatingsEntry(param0);
    }

    public RatingsEntry updateRatingsEntry(RatingsEntry param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateRatingsEntry(param0, param1);
    }

}
