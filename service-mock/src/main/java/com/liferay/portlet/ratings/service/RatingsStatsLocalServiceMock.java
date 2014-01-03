
package com.liferay.portlet.ratings.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.ratings.model.RatingsStats;
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
public class RatingsStatsLocalServiceMock
    extends MockService<RatingsStatsLocalService>
    implements RatingsStatsLocalService
{

    private HashMap<Long, RatingsStats> _serviceObjects = new HashMap<Long, RatingsStats>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.ratings.service.RatingsStatsLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void deleteStats(String param0, long param1)
        throws SystemException
    {
    }

    public RatingsStats addStats(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.addStats(param0, param1);
    }

    public RatingsStats fetchRatingsStats(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public RatingsStats getRatingsStats(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<RatingsStats> getRatingsStatses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRatingsStatses(param0, param1);
    }

    public int getRatingsStatsesCount()
        throws SystemException
    {
        return this.mockObject.getRatingsStatsesCount();
    }

    public RatingsStats updateRatingsStats(RatingsStats param0)
        throws SystemException
    {
        return this.mockObject.updateRatingsStats(param0);
    }

    public RatingsStats getStats(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getStats(param0);
    }

    public RatingsStats getStats(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getStats(param0, param1);
    }

    public List<RatingsStats> getStats(String param0, List<Long> param1)
        throws SystemException
    {
        return this.mockObject.getStats(param0, param1);
    }

    public RatingsStats addRatingsStats(RatingsStats param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public RatingsStats createRatingsStats(long param0) {
        return this.mockObject.createRatingsStats(param0);
    }

    public RatingsStats deleteRatingsStats(RatingsStats param0)
        throws SystemException
    {
        return this.mockObject.deleteRatingsStats(param0);
    }

    public RatingsStats deleteRatingsStats(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteRatingsStats(param0);
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
