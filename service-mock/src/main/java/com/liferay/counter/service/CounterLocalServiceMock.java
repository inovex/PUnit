
package com.liferay.counter.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.counter.model.Counter;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;

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
public class CounterLocalServiceMock
    extends MockService<CounterLocalService>
    implements CounterLocalService
{

    private HashMap<String, Counter> _serviceObjects = new HashMap<String, Counter>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.counter.service.CounterLocalService.class));
    }

    public void reset(String param0)
        throws SystemException
    {
    }

    public void reset(String param0, long param1)
        throws SystemException
    {
    }

    public void rename(String param0, String param1)
        throws SystemException
    {
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Counter addCounter(Counter param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Counter createCounter(String param0) {
        return this.mockObject.createCounter(param0);
    }

    public Counter deleteCounter(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteCounter(param0);
    }

    public Counter deleteCounter(Counter param0)
        throws SystemException
    {
        return this.mockObject.deleteCounter(param0);
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

    public Counter fetchCounter(String param0)
        throws SystemException
    {
        return this.mockObject.fetchCounter(param0);
    }

    public Counter getCounter(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCounter(param0);
    }

    public List<Counter> getCounters(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getCounters(param0, param1);
    }

    public int getCountersCount()
        throws SystemException
    {
        return this.mockObject.getCountersCount();
    }

    public Counter updateCounter(Counter param0)
        throws SystemException
    {
        return this.mockObject.updateCounter(param0);
    }

    public Counter updateCounter(Counter param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateCounter(param0, param1);
    }

    public String getBeanIdentifier() {
        return this.mockObject.getBeanIdentifier();
    }

    public void setBeanIdentifier(String param0) {
    }

    public List<String> getNames()
        throws SystemException
    {
        return this.mockObject.getNames();
    }

    public long increment()
        throws SystemException
    {
        return this.mockObject.increment();
    }

    public long increment(String param0)
        throws SystemException
    {
        return this.mockObject.increment(param0);
    }

    public long increment(String param0, int param1)
        throws SystemException
    {
        return this.mockObject.increment(param0, param1);
    }

}
