
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.VirtualHost;

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
public class VirtualHostLocalServiceMock
    extends MockService<VirtualHostLocalService>
    implements VirtualHostLocalService
{

    private HashMap<Long, VirtualHost> _serviceObjects = new HashMap<Long, VirtualHost>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.VirtualHostLocalService.class));
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

    public VirtualHost updateVirtualHost(VirtualHost param0)
        throws SystemException
    {
        return this.mockObject.updateVirtualHost(param0);
    }

    public VirtualHost updateVirtualHost(VirtualHost param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateVirtualHost(param0, param1);
    }

    public VirtualHost updateVirtualHost(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.updateVirtualHost(param0, param1, param2);
    }

    public VirtualHost addVirtualHost(VirtualHost param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public VirtualHost createVirtualHost(long param0) {
        return this.mockObject.createVirtualHost(param0);
    }

    public VirtualHost deleteVirtualHost(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteVirtualHost(param0);
    }

    public VirtualHost deleteVirtualHost(VirtualHost param0)
        throws SystemException
    {
        return this.mockObject.deleteVirtualHost(param0);
    }

    public VirtualHost fetchVirtualHost(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public VirtualHost fetchVirtualHost(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchVirtualHost(param0, param1);
    }

    public VirtualHost fetchVirtualHost(String param0)
        throws SystemException
    {
        return this.mockObject.fetchVirtualHost(param0);
    }

    public VirtualHost getVirtualHost(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public VirtualHost getVirtualHost(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getVirtualHost(param0, param1);
    }

    public VirtualHost getVirtualHost(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getVirtualHost(param0);
    }

    public List<VirtualHost> getVirtualHosts(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getVirtualHosts(param0, param1);
    }

    public int getVirtualHostsCount()
        throws SystemException
    {
        return this.mockObject.getVirtualHostsCount();
    }

}
