
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
import com.liferay.portal.model.SystemEvent;
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
public class SystemEventLocalServiceMock
    extends MockService<SystemEventLocalService>
    implements SystemEventLocalService
{

    private HashMap<Long, SystemEvent> _serviceObjects = new HashMap<Long, SystemEvent>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.SystemEventLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public SystemEvent updateSystemEvent(SystemEvent param0)
        throws SystemException
    {
        return this.mockObject.updateSystemEvent(param0);
    }

    public SystemEvent createSystemEvent(long param0) {
        return this.mockObject.createSystemEvent(param0);
    }

    public SystemEvent deleteSystemEvent(SystemEvent param0)
        throws SystemException
    {
        return this.mockObject.deleteSystemEvent(param0);
    }

    public SystemEvent deleteSystemEvent(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSystemEvent(param0);
    }

    public SystemEvent fetchSystemEvent(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SystemEvent fetchSystemEvent(long param0, long param1, long param2, int param3)
        throws SystemException
    {
        return this.mockObject.fetchSystemEvent(param0, param1, param2, param3);
    }

    public SystemEvent getSystemEvent(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SystemEvent> getSystemEvents(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getSystemEvents(param0, param1, param2);
    }

    public List<SystemEvent> getSystemEvents(long param0, long param1, long param2, int param3)
        throws SystemException
    {
        return this.mockObject.getSystemEvents(param0, param1, param2, param3);
    }

    public List<SystemEvent> getSystemEvents(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSystemEvents(param0, param1);
    }

    public int getSystemEventsCount()
        throws SystemException
    {
        return this.mockObject.getSystemEventsCount();
    }

    public SystemEvent addSystemEvent(SystemEvent param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SystemEvent addSystemEvent(long param0, String param1, long param2, String param3, String param4, int param5, String param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addSystemEvent(param0, param1, param2, param3, param4, param5, param6);
    }

    public SystemEvent addSystemEvent(long param0, long param1, String param2, long param3, String param4, String param5, int param6, String param7)
        throws PortalException, SystemException
    {
        return this.mockObject.addSystemEvent(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public void deleteSystemEvents(long param0)
        throws SystemException
    {
    }

    public void deleteSystemEvents(long param0, long param1)
        throws SystemException
    {
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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
