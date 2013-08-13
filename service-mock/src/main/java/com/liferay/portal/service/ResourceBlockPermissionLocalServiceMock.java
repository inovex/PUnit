
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.ResourceBlockPermission;
import com.liferay.portal.model.ResourceBlockPermissionsContainer;

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
public class ResourceBlockPermissionLocalServiceMock
    extends MockService<ResourceBlockPermissionLocalService>
    implements ResourceBlockPermissionLocalService
{

    private HashMap<Long, ResourceBlockPermission> _serviceObjects = new HashMap<Long, ResourceBlockPermission>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ResourceBlockPermissionLocalService.class));
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

    public ResourceBlockPermission addResourceBlockPermission(ResourceBlockPermission param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ResourceBlockPermission createResourceBlockPermission(long param0) {
        return this.mockObject.createResourceBlockPermission(param0);
    }

    public ResourceBlockPermission deleteResourceBlockPermission(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteResourceBlockPermission(param0);
    }

    public ResourceBlockPermission deleteResourceBlockPermission(ResourceBlockPermission param0)
        throws SystemException
    {
        return this.mockObject.deleteResourceBlockPermission(param0);
    }

    public ResourceBlockPermission fetchResourceBlockPermission(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ResourceBlockPermission getResourceBlockPermission(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ResourceBlockPermission> getResourceBlockPermissions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getResourceBlockPermissions(param0, param1);
    }

    public int getResourceBlockPermissionsCount()
        throws SystemException
    {
        return this.mockObject.getResourceBlockPermissionsCount();
    }

    public ResourceBlockPermission updateResourceBlockPermission(ResourceBlockPermission param0)
        throws SystemException
    {
        return this.mockObject.updateResourceBlockPermission(param0);
    }

    public ResourceBlockPermission updateResourceBlockPermission(ResourceBlockPermission param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateResourceBlockPermission(param0, param1);
    }

    public void updateResourceBlockPermission(long param0, long param1, long param2, int param3)
        throws SystemException
    {
    }

    public void addResourceBlockPermissions(long param0, ResourceBlockPermissionsContainer param1)
        throws SystemException
    {
    }

    public void deleteResourceBlockPermissions(long param0)
        throws SystemException
    {
    }

    public Map<Long, Set<String>> getAvailableResourceBlockPermissionActionIds(long[] param0, String param1, long param2, List<String> param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getAvailableResourceBlockPermissionActionIds(param0, param1, param2, param3);
    }

    public ResourceBlockPermissionsContainer getResourceBlockPermissionsContainer(long param0)
        throws SystemException
    {
        return this.mockObject.getResourceBlockPermissionsContainer(param0);
    }

}
