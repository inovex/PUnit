
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
import com.liferay.portal.model.UserNotificationDelivery;
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
public class UserNotificationDeliveryLocalServiceMock
    extends MockService<UserNotificationDeliveryLocalService>
    implements UserNotificationDeliveryLocalService
{

    private HashMap<Long, UserNotificationDelivery> _serviceObjects = new HashMap<Long, UserNotificationDelivery>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.UserNotificationDeliveryLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public int getUserNotificationDeliveriesCount()
        throws SystemException
    {
        return this.mockObject.getUserNotificationDeliveriesCount();
    }

    public UserNotificationDelivery updateUserNotificationDelivery(UserNotificationDelivery param0)
        throws SystemException
    {
        return this.mockObject.updateUserNotificationDelivery(param0);
    }

    public UserNotificationDelivery updateUserNotificationDelivery(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateUserNotificationDelivery(param0, param1);
    }

    public void deleteUserNotificationDeliveries(long param0)
        throws SystemException
    {
    }

    public UserNotificationDelivery addUserNotificationDelivery(long param0, String param1, long param2, int param3, int param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addUserNotificationDelivery(param0, param1, param2, param3, param4, param5);
    }

    public UserNotificationDelivery addUserNotificationDelivery(UserNotificationDelivery param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public UserNotificationDelivery createUserNotificationDelivery(long param0) {
        return this.mockObject.createUserNotificationDelivery(param0);
    }

    public UserNotificationDelivery deleteUserNotificationDelivery(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUserNotificationDelivery(param0);
    }

    public UserNotificationDelivery deleteUserNotificationDelivery(UserNotificationDelivery param0)
        throws SystemException
    {
        return this.mockObject.deleteUserNotificationDelivery(param0);
    }

    public void deleteUserNotificationDelivery(long param0, String param1, long param2, int param3, int param4)
        throws SystemException
    {
    }

    public UserNotificationDelivery fetchUserNotificationDelivery(long param0, String param1, long param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.fetchUserNotificationDelivery(param0, param1, param2, param3, param4);
    }

    public UserNotificationDelivery fetchUserNotificationDelivery(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserNotificationDelivery getUserNotificationDelivery(long param0, String param1, long param2, int param3, int param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserNotificationDelivery(param0, param1, param2, param3, param4, param5);
    }

    public UserNotificationDelivery getUserNotificationDelivery(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<UserNotificationDelivery> getUserNotificationDeliveries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUserNotificationDeliveries(param0, param1);
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

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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
