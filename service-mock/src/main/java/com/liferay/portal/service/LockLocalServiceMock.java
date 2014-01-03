
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Lock;
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
public class LockLocalServiceMock
    extends MockService<LockLocalService>
    implements LockLocalService
{

    private HashMap<Long, Lock> _serviceObjects = new HashMap<Long, Lock>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.LockLocalService.class));
    }

    public Lock lock(String param0, String param1, String param2, String param3, boolean param4)
        throws SystemException
    {
        return this.mockObject.lock(param0, param1, param2, param3, param4);
    }

    public Lock lock(String param0, String param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.lock(param0, param1, param2, param3);
    }

    public Lock lock(long param0, String param1, long param2, String param3, boolean param4, long param5)
        throws PortalException, SystemException
    {
        return this.mockObject.lock(param0, param1, param2, param3, param4, param5);
    }

    public Lock lock(String param0, String param1, String param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.lock(param0, param1, param2, param3);
    }

    public Lock lock(String param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.lock(param0, param1, param2);
    }

    public Lock lock(long param0, String param1, String param2, String param3, boolean param4, long param5)
        throws PortalException, SystemException
    {
        return this.mockObject.lock(param0, param1, param2, param3, param4, param5);
    }

    public void clear()
        throws SystemException
    {
    }

    public void unlock(String param0, String param1, String param2, boolean param3)
        throws SystemException
    {
    }

    public void unlock(String param0, long param1)
        throws SystemException
    {
    }

    public void unlock(String param0, String param1, String param2)
        throws SystemException
    {
    }

    public void unlock(String param0, String param1)
        throws SystemException
    {
    }

    public boolean isLocked(String param0, String param1)
        throws SystemException
    {
        return this.mockObject.isLocked(param0, param1);
    }

    public boolean isLocked(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.isLocked(param0, param1);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Lock fetchLockByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchLockByUuidAndCompanyId(param0, param1);
    }

    public Lock getLock(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Lock getLock(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLock(param0, param1);
    }

    public Lock getLock(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLock(param0, param1);
    }

    public Lock getLockByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLockByUuidAndCompanyId(param0, param1);
    }

    public List<Lock> getLocks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLocks(param0, param1);
    }

    public int getLocksCount()
        throws SystemException
    {
        return this.mockObject.getLocksCount();
    }

    public Lock updateLock(Lock param0)
        throws SystemException
    {
        return this.mockObject.updateLock(param0);
    }

    public Lock refresh(String param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.refresh(param0, param1, param2);
    }

    public Lock createLock(long param0) {
        return this.mockObject.createLock(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public Lock deleteLock(Lock param0)
        throws SystemException
    {
        return this.mockObject.deleteLock(param0);
    }

    public Lock deleteLock(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLock(param0);
    }

    public Lock fetchLock(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Lock addLock(Lock param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public boolean hasLock(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.hasLock(param0, param1, param2);
    }

    public boolean hasLock(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.hasLock(param0, param1, param2);
    }

}
