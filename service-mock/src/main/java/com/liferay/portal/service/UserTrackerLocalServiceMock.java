
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.UserTracker;
import com.liferay.portal.model.UserTrackerPath;

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
public class UserTrackerLocalServiceMock
    extends MockService<UserTrackerLocalService>
    implements UserTrackerLocalService
{

    private HashMap<Long, UserTracker> _serviceObjects = new HashMap<Long, UserTracker>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.UserTrackerLocalService.class));
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

    public UserTracker addUserTracker(UserTracker param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public UserTracker addUserTracker(long param0, long param1, Date param2, String param3, String param4, String param5, String param6, List<UserTrackerPath> param7)
        throws SystemException
    {
        return this.mockObject.addUserTracker(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public UserTracker createUserTracker(long param0) {
        return this.mockObject.createUserTracker(param0);
    }

    public UserTracker deleteUserTracker(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUserTracker(param0);
    }

    public UserTracker deleteUserTracker(UserTracker param0)
        throws SystemException
    {
        return this.mockObject.deleteUserTracker(param0);
    }

    public UserTracker fetchUserTracker(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserTracker getUserTracker(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<UserTracker> getUserTrackers(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUserTrackers(param0, param1);
    }

    public List<UserTracker> getUserTrackers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserTrackers(param0, param1, param2);
    }

    public int getUserTrackersCount()
        throws SystemException
    {
        return this.mockObject.getUserTrackersCount();
    }

    public UserTracker updateUserTracker(UserTracker param0)
        throws SystemException
    {
        return this.mockObject.updateUserTracker(param0);
    }

    public UserTracker updateUserTracker(UserTracker param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateUserTracker(param0, param1);
    }

}
