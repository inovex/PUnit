
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.service.persistence.UserGroupRolePK;

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
public class UserGroupRoleLocalServiceMock
    extends MockService<UserGroupRoleLocalService>
    implements UserGroupRoleLocalService
{

    private HashMap<UserGroupRolePK, UserGroupRole> _serviceObjects = new HashMap<UserGroupRolePK, UserGroupRole>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.UserGroupRoleLocalService.class));
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

    public List<UserGroupRole> getUserGroupRoles(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupRoles(param0, param1);
    }

    public List<UserGroupRole> getUserGroupRoles(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupRoles(param0);
    }

    public List<UserGroupRole> getUserGroupRoles(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupRoles(param0, param1);
    }

    public UserGroupRole addUserGroupRole(UserGroupRole param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public UserGroupRole createUserGroupRole(UserGroupRolePK param0) {
        return this.mockObject.createUserGroupRole(param0);
    }

    public UserGroupRole deleteUserGroupRole(UserGroupRolePK param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUserGroupRole(param0);
    }

    public UserGroupRole deleteUserGroupRole(UserGroupRole param0)
        throws SystemException
    {
        return this.mockObject.deleteUserGroupRole(param0);
    }

    public UserGroupRole fetchUserGroupRole(UserGroupRolePK param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserGroupRole getUserGroupRole(UserGroupRolePK param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int getUserGroupRolesCount()
        throws SystemException
    {
        return this.mockObject.getUserGroupRolesCount();
    }

    public UserGroupRole updateUserGroupRole(UserGroupRole param0)
        throws SystemException
    {
        return this.mockObject.updateUserGroupRole(param0);
    }

    public UserGroupRole updateUserGroupRole(UserGroupRole param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateUserGroupRole(param0, param1);
    }

    public void addUserGroupRoles(long param0, long param1, long[] param2)
        throws PortalException, SystemException
    {
    }

    public void addUserGroupRoles(long[] param0, long param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void deleteUserGroupRoles(long param0, long param1, long[] param2)
        throws SystemException
    {
    }

    public void deleteUserGroupRoles(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteUserGroupRoles(long[] param0, long param1)
        throws SystemException
    {
    }

    public void deleteUserGroupRoles(long[] param0, long param1, long param2)
        throws SystemException
    {
    }

    public void deleteUserGroupRolesByGroupId(long param0)
        throws SystemException
    {
    }

    public void deleteUserGroupRolesByRoleId(long param0)
        throws SystemException
    {
    }

    public void deleteUserGroupRolesByUserId(long param0)
        throws SystemException
    {
    }

    public List<UserGroupRole> getUserGroupRolesByGroupAndRole(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupRolesByGroupAndRole(param0, param1);
    }

    public List<UserGroupRole> getUserGroupRolesByUserUserGroupAndGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupRolesByUserUserGroupAndGroup(param0, param1);
    }

    public boolean hasUserGroupRole(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.hasUserGroupRole(param0, param1, param2);
    }

    public boolean hasUserGroupRole(long param0, long param1, long param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.hasUserGroupRole(param0, param1, param2, param3);
    }

    public boolean hasUserGroupRole(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.hasUserGroupRole(param0, param1, param2);
    }

    public boolean hasUserGroupRole(long param0, long param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasUserGroupRole(param0, param1, param2, param3);
    }

}
