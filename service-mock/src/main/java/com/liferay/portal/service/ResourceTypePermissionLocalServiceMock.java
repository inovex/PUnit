
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.ResourceBlockPermissionsContainer;
import com.liferay.portal.model.ResourceTypePermission;

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
public class ResourceTypePermissionLocalServiceMock
    extends MockService<ResourceTypePermissionLocalService>
    implements ResourceTypePermissionLocalService
{

    private HashMap<Long, ResourceTypePermission> _serviceObjects = new HashMap<Long, ResourceTypePermission>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ResourceTypePermissionLocalService.class));
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

    public ResourceBlockPermissionsContainer getResourceBlockPermissionsContainer(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getResourceBlockPermissionsContainer(param0, param1, param2);
    }

    public ResourceTypePermission addResourceTypePermission(ResourceTypePermission param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ResourceTypePermission createResourceTypePermission(long param0) {
        return this.mockObject.createResourceTypePermission(param0);
    }

    public ResourceTypePermission deleteResourceTypePermission(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteResourceTypePermission(param0);
    }

    public ResourceTypePermission deleteResourceTypePermission(ResourceTypePermission param0)
        throws SystemException
    {
        return this.mockObject.deleteResourceTypePermission(param0);
    }

    public ResourceTypePermission fetchResourceTypePermission(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ResourceTypePermission getResourceTypePermission(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ResourceTypePermission> getResourceTypePermissions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getResourceTypePermissions(param0, param1);
    }

    public int getResourceTypePermissionsCount()
        throws SystemException
    {
        return this.mockObject.getResourceTypePermissionsCount();
    }

    public ResourceTypePermission updateResourceTypePermission(ResourceTypePermission param0)
        throws SystemException
    {
        return this.mockObject.updateResourceTypePermission(param0);
    }

    public ResourceTypePermission updateResourceTypePermission(ResourceTypePermission param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateResourceTypePermission(param0, param1);
    }

    public long getCompanyScopeActionIds(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getCompanyScopeActionIds(param0, param1, param2);
    }

    public long getGroupScopeActionIds(long param0, long param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getGroupScopeActionIds(param0, param1, param2, param3);
    }

    public List<ResourceTypePermission> getGroupScopeResourceTypePermissions(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getGroupScopeResourceTypePermissions(param0, param1, param2);
    }

    public List<ResourceTypePermission> getRoleResourceTypePermissions(long param0)
        throws SystemException
    {
        return this.mockObject.getRoleResourceTypePermissions(param0);
    }

    public boolean hasCompanyScopePermission(long param0, String param1, long param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasCompanyScopePermission(param0, param1, param2, param3);
    }

    public boolean hasEitherScopePermission(long param0, String param1, long param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasEitherScopePermission(param0, param1, param2, param3);
    }

    public boolean hasGroupScopePermission(long param0, long param1, String param2, long param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.hasGroupScopePermission(param0, param1, param2, param3, param4);
    }

    public void updateCompanyScopeResourceTypePermissions(long param0, String param1, long param2, long param3, long param4)
        throws SystemException
    {
    }

    public void updateGroupScopeResourceTypePermissions(long param0, long param1, String param2, long param3, long param4, long param5)
        throws SystemException
    {
    }

}
