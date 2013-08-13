
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PasswordTracker;
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
public class PasswordTrackerLocalServiceMock
    extends MockService<PasswordTrackerLocalService>
    implements PasswordTrackerLocalService
{

    private HashMap<Long, PasswordTracker> _serviceObjects = new HashMap<Long, PasswordTracker>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PasswordTrackerLocalService.class));
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

    public PasswordTracker addPasswordTracker(PasswordTracker param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public PasswordTracker createPasswordTracker(long param0) {
        return this.mockObject.createPasswordTracker(param0);
    }

    public PasswordTracker deletePasswordTracker(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePasswordTracker(param0);
    }

    public PasswordTracker deletePasswordTracker(PasswordTracker param0)
        throws SystemException
    {
        return this.mockObject.deletePasswordTracker(param0);
    }

    public PasswordTracker fetchPasswordTracker(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PasswordTracker getPasswordTracker(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<PasswordTracker> getPasswordTrackers(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPasswordTrackers(param0, param1);
    }

    public int getPasswordTrackersCount()
        throws SystemException
    {
        return this.mockObject.getPasswordTrackersCount();
    }

    public PasswordTracker updatePasswordTracker(PasswordTracker param0)
        throws SystemException
    {
        return this.mockObject.updatePasswordTracker(param0);
    }

    public PasswordTracker updatePasswordTracker(PasswordTracker param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updatePasswordTracker(param0, param1);
    }

    public void deletePasswordTrackers(long param0)
        throws SystemException
    {
    }

    public boolean isSameAsCurrentPassword(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.isSameAsCurrentPassword(param0, param1);
    }

    public boolean isValidPassword(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.isValidPassword(param0, param1);
    }

    public void trackPassword(long param0, String param1)
        throws PortalException, SystemException
    {
    }

}
