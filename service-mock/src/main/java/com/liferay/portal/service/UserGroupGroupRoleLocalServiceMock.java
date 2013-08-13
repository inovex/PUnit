
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.UserGroupGroupRole;
import com.liferay.portal.service.persistence.UserGroupGroupRolePK;

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
public class UserGroupGroupRoleLocalServiceMock
    extends MockService<UserGroupGroupRoleLocalService>
    implements UserGroupGroupRoleLocalService
{

    private HashMap<UserGroupGroupRolePK, UserGroupGroupRole> _serviceObjects = new HashMap<UserGroupGroupRolePK, UserGroupGroupRole>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.UserGroupGroupRoleLocalService.class));
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

    public List<UserGroupGroupRole> getUserGroupGroupRoles(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroupRoles(param0, param1);
    }

    public List<UserGroupGroupRole> getUserGroupGroupRoles(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroupRoles(param0);
    }

    public List<UserGroupGroupRole> getUserGroupGroupRoles(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroupRoles(param0, param1);
    }

    public UserGroupGroupRole addUserGroupGroupRole(UserGroupGroupRole param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public UserGroupGroupRole createUserGroupGroupRole(UserGroupGroupRolePK param0) {
        return this.mockObject.createUserGroupGroupRole(param0);
    }

    public UserGroupGroupRole deleteUserGroupGroupRole(UserGroupGroupRolePK param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUserGroupGroupRole(param0);
    }

    public UserGroupGroupRole deleteUserGroupGroupRole(UserGroupGroupRole param0)
        throws SystemException
    {
        return this.mockObject.deleteUserGroupGroupRole(param0);
    }

    public UserGroupGroupRole fetchUserGroupGroupRole(UserGroupGroupRolePK param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserGroupGroupRole getUserGroupGroupRole(UserGroupGroupRolePK param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int getUserGroupGroupRolesCount()
        throws SystemException
    {
        return this.mockObject.getUserGroupGroupRolesCount();
    }

    public UserGroupGroupRole updateUserGroupGroupRole(UserGroupGroupRole param0)
        throws SystemException
    {
        return this.mockObject.updateUserGroupGroupRole(param0);
    }

    public UserGroupGroupRole updateUserGroupGroupRole(UserGroupGroupRole param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateUserGroupGroupRole(param0, param1);
    }

    public void addUserGroupGroupRoles(long param0, long param1, long[] param2)
        throws PortalException, SystemException
    {
    }

    public void addUserGroupGroupRoles(long[] param0, long param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void deleteUserGroupGroupRoles(long param0, long param1, long[] param2)
        throws SystemException
    {
    }

    public void deleteUserGroupGroupRoles(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteUserGroupGroupRoles(long[] param0, long param1)
        throws SystemException
    {
    }

    public void deleteUserGroupGroupRoles(long[] param0, long param1, long param2)
        throws SystemException
    {
    }

    public void deleteUserGroupGroupRolesByGroupId(long param0)
        throws SystemException
    {
    }

    public void deleteUserGroupGroupRolesByRoleId(long param0)
        throws SystemException
    {
    }

    public void deleteUserGroupGroupRolesByUserGroupId(long param0)
        throws SystemException
    {
    }

    public List<UserGroupGroupRole> getUserGroupGroupRolesByGroupAndRole(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroupRolesByGroupAndRole(param0, param1);
    }

    public boolean hasUserGroupGroupRole(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.hasUserGroupGroupRole(param0, param1, param2);
    }

    public boolean hasUserGroupGroupRole(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.hasUserGroupGroupRole(param0, param1, param2);
    }

}
