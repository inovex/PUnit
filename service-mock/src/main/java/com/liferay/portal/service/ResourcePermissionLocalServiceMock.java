
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Resource;
import com.liferay.portal.model.ResourceAction;
import com.liferay.portal.model.ResourcePermission;
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
public class ResourcePermissionLocalServiceMock
    extends MockService<ResourcePermissionLocalService>
    implements ResourcePermissionLocalService
{

    private HashMap<Long, ResourcePermission> _serviceObjects = new HashMap<Long, ResourcePermission>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ResourcePermissionLocalService.class));
    }

    public void mergePermissions(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public ResourcePermission deleteResourcePermission(ResourcePermission param0)
        throws SystemException
    {
        return this.mockObject.deleteResourcePermission(param0);
    }

    public ResourcePermission deleteResourcePermission(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteResourcePermission(param0);
    }

    public ResourcePermission fetchResourcePermission(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ResourcePermission getResourcePermission(long param0, String param1, int param2, String param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getResourcePermission(param0, param1, param2, param3, param4);
    }

    public ResourcePermission getResourcePermission(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ResourcePermission> getResourcePermissions(long param0, String param1, int param2, String param3)
        throws SystemException
    {
        return this.mockObject.getResourcePermissions(param0, param1, param2, param3);
    }

    public List<ResourcePermission> getResourcePermissions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getResourcePermissions(param0, param1);
    }

    public int getResourcePermissionsCount(long param0, String param1, int param2, String param3)
        throws SystemException
    {
        return this.mockObject.getResourcePermissionsCount(param0, param1, param2, param3);
    }

    public int getResourcePermissionsCount()
        throws SystemException
    {
        return this.mockObject.getResourcePermissionsCount();
    }

    public ResourcePermission updateResourcePermission(ResourcePermission param0)
        throws SystemException
    {
        return this.mockObject.updateResourcePermission(param0);
    }

    public void addResourcePermissions(String param0, String param1, int param2, long param3)
        throws SystemException
    {
    }

    public void deleteResourcePermissions(long param0, String param1, int param2, long param3)
        throws PortalException, SystemException
    {
    }

    public void deleteResourcePermissions(long param0, String param1, int param2, String param3)
        throws PortalException, SystemException
    {
    }

    public List<String> getAvailableResourcePermissionActionIds(long param0, String param1, int param2, String param3, long param4, Collection<String> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getAvailableResourcePermissionActionIds(param0, param1, param2, param3, param4, param5);
    }

    public Map<Long, Set<String>> getAvailableResourcePermissionActionIds(long param0, String param1, int param2, String param3, long[] param4, Collection<String> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getAvailableResourcePermissionActionIds(param0, param1, param2, param3, param4, param5);
    }

    public ResourcePermission createResourcePermission(long param0) {
        return this.mockObject.createResourcePermission(param0);
    }

    public ResourcePermission addResourcePermission(ResourcePermission param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public void addResourcePermission(long param0, String param1, int param2, String param3, long param4, String param5)
        throws PortalException, SystemException
    {
    }

    public boolean hasActionId(ResourcePermission param0, ResourceAction param1) {
        return this.mockObject.hasActionId(param0, param1);
    }

    public List<ResourcePermission> getResourceResourcePermissions(long param0, long param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.getResourceResourcePermissions(param0, param1, param2, param3);
    }

    public List<ResourcePermission> getRoleResourcePermissions(long param0, int[] param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getRoleResourcePermissions(param0, param1, param2, param3);
    }

    public List<ResourcePermission> getRoleResourcePermissions(long param0)
        throws SystemException
    {
        return this.mockObject.getRoleResourcePermissions(param0);
    }

    public List<ResourcePermission> getScopeResourcePermissions(int[] param0)
        throws SystemException
    {
        return this.mockObject.getScopeResourcePermissions(param0);
    }

    public boolean hasResourcePermission(long param0, String param1, int param2, String param3, long param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.hasResourcePermission(param0, param1, param2, param3, param4, param5);
    }

    public boolean hasResourcePermission(List<Resource> param0, long[] param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.hasResourcePermission(param0, param1, param2);
    }

    public boolean hasResourcePermission(long param0, String param1, int param2, String param3, long[] param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.hasResourcePermission(param0, param1, param2, param3, param4, param5);
    }

    public boolean[] hasResourcePermissions(long param0, String param1, int param2, String param3, long[] param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.hasResourcePermissions(param0, param1, param2, param3, param4, param5);
    }

    public boolean hasScopeResourcePermission(long param0, String param1, int param2, long param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.hasScopeResourcePermission(param0, param1, param2, param3, param4);
    }

    public void reassignPermissions(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void removeResourcePermission(long param0, String param1, int param2, String param3, long param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void removeResourcePermissions(long param0, String param1, int param2, long param3, String param4)
        throws PortalException, SystemException
    {
    }

    public void setOwnerResourcePermissions(long param0, String param1, int param2, String param3, long param4, long param5, String[] param6)
        throws PortalException, SystemException
    {
    }

    public void setResourcePermissions(long param0, String param1, int param2, String param3, long param4, String[] param5)
        throws PortalException, SystemException
    {
    }

    public void setResourcePermissions(long param0, String param1, int param2, String param3, Map<Long, String[]> param4)
        throws PortalException, SystemException
    {
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
