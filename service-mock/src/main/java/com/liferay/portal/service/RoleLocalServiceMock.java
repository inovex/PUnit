
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Role;

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
public class RoleLocalServiceMock
    extends MockService<RoleLocalService>
    implements RoleLocalService
{

    private HashMap<Long, Role> _serviceObjects = new HashMap<Long, Role>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.RoleLocalService.class));
    }

    public List<Role> search(long param0, String param1, Integer[] param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public List<Role> search(long param0, String param1, Integer[] param2, LinkedHashMap<String, Object> param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Role> search(long param0, String param1, String param2, Integer[] param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Role> search(long param0, String param1, String param2, Integer[] param3, LinkedHashMap<String, Object> param4, int param5, int param6, OrderByComparator param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
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

    public Role getDefaultGroupRole(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultGroupRole(param0);
    }

    public List<Role> getRoles(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRoles(param0, param1);
    }

    public List<Role> getRoles(int param0, String param1)
        throws SystemException
    {
        return this.mockObject.getRoles(param0, param1);
    }

    public List<Role> getRoles(long param0)
        throws SystemException
    {
        return this.mockObject.getRoles(param0);
    }

    public List<Role> getRoles(long[] param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRoles(param0);
    }

    public int searchCount(long param0, String param1, Integer[] param2)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2);
    }

    public int searchCount(long param0, String param1, Integer[] param2, LinkedHashMap<String, Object> param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public int searchCount(long param0, String param1, String param2, Integer[] param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public int searchCount(long param0, String param1, String param2, Integer[] param3, LinkedHashMap<String, Object> param4)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4);
    }

    public Role addRole(Role param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Role addRole(long param0, long param1, String param2, Map<Locale, String> param3, Map<Locale, String> param4, int param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addRole(param0, param1, param2, param3, param4, param5);
    }

    public Role addRole(long param0, long param1, String param2, Map<Locale, String> param3, Map<Locale, String> param4, int param5, String param6, long param7)
        throws PortalException, SystemException
    {
        return this.mockObject.addRole(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public Role createRole(long param0) {
        return this.mockObject.createRole(param0);
    }

    public Role deleteRole(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteRole(param0);
    }

    public Role deleteRole(Role param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteRole(param0);
    }

    public Role fetchRole(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Role fetchRole(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchRole(param0, param1);
    }

    public Role getRole(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Role getRole(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getRole(param0, param1);
    }

    public int getRolesCount()
        throws SystemException
    {
        return this.mockObject.getRolesCount();
    }

    public Role updateRole(Role param0)
        throws SystemException
    {
        return this.mockObject.updateRole(param0);
    }

    public Role updateRole(Role param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateRole(param0, param1);
    }

    public Role updateRole(long param0, String param1, Map<Locale, String> param2, Map<Locale, String> param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRole(param0, param1, param2, param3, param4);
    }

    public void addUserRoles(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void checkSystemRoles()
        throws PortalException, SystemException
    {
    }

    public void checkSystemRoles(long param0)
        throws PortalException, SystemException
    {
    }

    public List<Role> getGroupRoles(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupRoles(param0);
    }

    public List<Role> getResourceBlockRoles(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getResourceBlockRoles(param0, param1, param2);
    }

    public Map<String, List<String>> getResourceRoles(long param0, String param1, int param2, String param3)
        throws SystemException
    {
        return this.mockObject.getResourceRoles(param0, param1, param2, param3);
    }

    public List<Role> getResourceRoles(long param0, String param1, int param2, String param3, String param4)
        throws SystemException
    {
        return this.mockObject.getResourceRoles(param0, param1, param2, param3, param4);
    }

    public List<Role> getSubtypeRoles(String param0)
        throws SystemException
    {
        return this.mockObject.getSubtypeRoles(param0);
    }

    public int getSubtypeRolesCount(String param0)
        throws SystemException
    {
        return this.mockObject.getSubtypeRolesCount(param0);
    }

    public Role getTeamRole(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTeamRole(param0, param1);
    }

    public List<Role> getUserGroupGroupRoles(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroupRoles(param0, param1);
    }

    public List<Role> getUserGroupRoles(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserGroupRoles(param0, param1);
    }

    public List<Role> getUserRelatedRoles(long param0, List<Group> param1)
        throws SystemException
    {
        return this.mockObject.getUserRelatedRoles(param0, param1);
    }

    public List<Role> getUserRelatedRoles(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserRelatedRoles(param0, param1);
    }

    public List<Role> getUserRelatedRoles(long param0, long[] param1)
        throws SystemException
    {
        return this.mockObject.getUserRelatedRoles(param0, param1);
    }

    public List<Role> getUserRoles(long param0)
        throws SystemException
    {
        return this.mockObject.getUserRoles(param0);
    }

    public boolean hasUserRole(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasUserRole(param0, param1);
    }

    public boolean hasUserRole(long param0, long param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasUserRole(param0, param1, param2, param3);
    }

    public boolean hasUserRoles(long param0, long param1, String[] param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasUserRoles(param0, param1, param2, param3);
    }

    public Role loadFetchRole(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.loadFetchRole(param0, param1);
    }

    public Role loadGetRole(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.loadGetRole(param0, param1);
    }

    public void setUserRoles(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void unsetUserRoles(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

}
