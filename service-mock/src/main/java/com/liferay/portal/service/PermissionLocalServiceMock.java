
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Permission;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Resource;
import com.liferay.portal.security.permission.PermissionCheckerBag;

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
public class PermissionLocalServiceMock
    extends MockService<PermissionLocalService>
    implements PermissionLocalService
{

    private HashMap<Long, Permission> _serviceObjects = new HashMap<Long, Permission>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PermissionLocalService.class));
    }

    public List<String> getActions(List<Permission> param0) {
        return this.mockObject.getActions(param0);
    }

    public List<Permission> getPermissions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPermissions(param0, param1);
    }

    public List<Permission> getPermissions(long param0, String[] param1, long param2)
        throws SystemException
    {
        return this.mockObject.getPermissions(param0, param1, param2);
    }

    public Permission getPermission(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<Permission> addPermissions(long param0, List<String> param1, long param2)
        throws SystemException
    {
        return this.mockObject.addPermissions(param0, param1, param2);
    }

    public List<Permission> addPermissions(long param0, String param1, long param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.addPermissions(param0, param1, param2, param3);
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

    public List<Permission> getGroupPermissions(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getGroupPermissions(param0, param1);
    }

    public List<Permission> getGroupPermissions(long param0, long param1, String param2, int param3, String param4)
        throws SystemException
    {
        return this.mockObject.getGroupPermissions(param0, param1, param2, param3, param4);
    }

    public void setGroupPermissions(long param0, String[] param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void setGroupPermissions(String param0, String param1, long param2, String[] param3, long param4)
        throws PortalException, SystemException
    {
    }

    public boolean hasUserPermission(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.hasUserPermission(param0, param1, param2);
    }

    public Permission addPermission(Permission param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Permission addPermission(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.addPermission(param0, param1, param2);
    }

    public Permission createPermission(long param0) {
        return this.mockObject.createPermission(param0);
    }

    public Permission deletePermission(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePermission(param0);
    }

    public Permission deletePermission(Permission param0)
        throws SystemException
    {
        return this.mockObject.deletePermission(param0);
    }

    public Permission fetchPermission(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int getPermissionsCount()
        throws SystemException
    {
        return this.mockObject.getPermissionsCount();
    }

    public Permission updatePermission(Permission param0)
        throws SystemException
    {
        return this.mockObject.updatePermission(param0);
    }

    public Permission updatePermission(Permission param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updatePermission(param0, param1);
    }

    public void addUserPermissions(long param0, String[] param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void checkPermissions(String param0, List<String> param1)
        throws PortalException, SystemException
    {
    }

    public long getLatestPermissionId()
        throws SystemException
    {
        return this.mockObject.getLatestPermissionId();
    }

    public List<Permission> getOrgGroupPermissions(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getOrgGroupPermissions(param0, param1, param2);
    }

    public List<Permission> getRolePermissions(long param0)
        throws SystemException
    {
        return this.mockObject.getRolePermissions(param0);
    }

    public List<Permission> getRolePermissions(long param0, int[] param1)
        throws SystemException
    {
        return this.mockObject.getRolePermissions(param0, param1);
    }

    public List<Permission> getRolePermissions(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getRolePermissions(param0, param1);
    }

    public List<Permission> getUserPermissions(long param0)
        throws SystemException
    {
        return this.mockObject.getUserPermissions(param0);
    }

    public List<Permission> getUserPermissions(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserPermissions(param0, param1);
    }

    public List<Permission> getUserPermissions(long param0, long param1, String param2, int param3, String param4)
        throws SystemException
    {
        return this.mockObject.getUserPermissions(param0, param1, param2, param3, param4);
    }

    public boolean hasGroupPermission(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.hasGroupPermission(param0, param1, param2);
    }

    public boolean hasRolePermission(long param0, long param1, String param2, int param3, String param4)
        throws SystemException
    {
        return this.mockObject.hasRolePermission(param0, param1, param2, param3, param4);
    }

    public boolean hasRolePermission(long param0, long param1, String param2, int param3, String param4, String param5)
        throws SystemException
    {
        return this.mockObject.hasRolePermission(param0, param1, param2, param3, param4, param5);
    }

    public boolean hasUserPermissions(long param0, long param1, List<Resource> param2, String param3, PermissionCheckerBag param4)
        throws PortalException, SystemException
    {
        return this.mockObject.hasUserPermissions(param0, param1, param2, param3, param4);
    }

    public void setContainerResourcePermissions(String param0, String param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void setOrgGroupPermissions(long param0, long param1, String[] param2, long param3)
        throws PortalException, SystemException
    {
    }

    public void setRolePermission(long param0, long param1, String param2, int param3, String param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void setRolePermissions(long param0, long param1, String param2, int param3, String param4, String[] param5)
        throws PortalException, SystemException
    {
    }

    public void setRolePermissions(long param0, String[] param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void setRolesPermissions(long param0, Map<Long, String[]> param1, long param2)
        throws SystemException
    {
    }

    public void setRolesPermissions(long param0, Map<Long, String[]> param1, String param2, int param3, String param4)
        throws SystemException
    {
    }

    public void setUserPermissions(long param0, String[] param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void unsetRolePermission(long param0, long param1)
        throws SystemException
    {
    }

    public void unsetRolePermission(long param0, long param1, String param2, int param3, String param4, String param5)
        throws SystemException
    {
    }

    public void unsetRolePermissions(long param0, long param1, String param2, int param3, String param4)
        throws SystemException
    {
    }

    public void unsetUserPermissions(long param0, String[] param1, long param2)
        throws SystemException
    {
    }

}
