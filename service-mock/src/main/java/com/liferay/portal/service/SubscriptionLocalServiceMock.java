
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Subscription;

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
public class SubscriptionLocalServiceMock
    extends MockService<SubscriptionLocalService>
    implements SubscriptionLocalService
{

    private HashMap<Long, Subscription> _serviceObjects = new HashMap<Long, Subscription>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.SubscriptionLocalService.class));
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

    public Subscription addSubscription(Subscription param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Subscription addSubscription(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addSubscription(param0, param1, param2, param3);
    }

    public Subscription addSubscription(long param0, long param1, String param2, long param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addSubscription(param0, param1, param2, param3, param4);
    }

    public Subscription createSubscription(long param0) {
        return this.mockObject.createSubscription(param0);
    }

    public Subscription deleteSubscription(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSubscription(param0);
    }

    public Subscription deleteSubscription(Subscription param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSubscription(param0);
    }

    public void deleteSubscription(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
    }

    public Subscription fetchSubscription(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Subscription getSubscription(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Subscription getSubscription(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getSubscription(param0, param1, param2, param3);
    }

    public List<Subscription> getSubscriptions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSubscriptions(param0, param1);
    }

    public List<Subscription> getSubscriptions(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getSubscriptions(param0, param1, param2);
    }

    public int getSubscriptionsCount()
        throws SystemException
    {
        return this.mockObject.getSubscriptionsCount();
    }

    public Subscription updateSubscription(Subscription param0)
        throws SystemException
    {
        return this.mockObject.updateSubscription(param0);
    }

    public Subscription updateSubscription(Subscription param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateSubscription(param0, param1);
    }

    public void deleteSubscriptions(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteSubscriptions(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
    }

    public List<Subscription> getUserSubscriptions(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getUserSubscriptions(param0, param1, param2, param3);
    }

    public List<Subscription> getUserSubscriptions(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getUserSubscriptions(param0, param1);
    }

    public int getUserSubscriptionsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserSubscriptionsCount(param0);
    }

    public boolean isSubscribed(long param0, long param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.isSubscribed(param0, param1, param2, param3);
    }

}
