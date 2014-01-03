
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.UserGroup;
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
public class UserGroupLocalServiceMock
    extends MockService<UserGroupLocalService>
    implements UserGroupLocalService
{

    private HashMap<Long, UserGroup> _serviceObjects = new HashMap<Long, UserGroup>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.UserGroupLocalService.class));
    }

    public Hits search(long param0, String param1, LinkedHashMap<String, Object> param2, int param3, int param4, Sort param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public Hits search(long param0, String param1, String param2, LinkedHashMap<String, Object> param3, boolean param4, int param5, int param6, Sort param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<UserGroup> search(long param0, String param1, LinkedHashMap<String, Object> param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public UserGroup getUserGroup(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserGroup getUserGroup(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroup(param0, param1);
    }

    public int searchCount(long param0, String param1, LinkedHashMap<String, Object> param2)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2);
    }

    public UserGroup createUserGroup(long param0) {
        return this.mockObject.createUserGroup(param0);
    }

    public UserGroup fetchUserGroup(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserGroup fetchUserGroup(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchUserGroup(param0, param1);
    }

    public UserGroup fetchUserGroupByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchUserGroupByUuidAndCompanyId(param0, param1);
    }

    public UserGroup getUserGroupByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroupByUuidAndCompanyId(param0, param1);
    }

    public UserGroup updateUserGroup(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateUserGroup(param0, param1, param2, param3);
    }

    public UserGroup updateUserGroup(long param0, long param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateUserGroup(param0, param1, param2, param3, param4);
    }

    public UserGroup updateUserGroup(UserGroup param0)
        throws SystemException
    {
        return this.mockObject.updateUserGroup(param0);
    }

    public void addGroupUserGroup(long param0, UserGroup param1)
        throws SystemException
    {
    }

    public void addGroupUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void addGroupUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addGroupUserGroups(long param0, List<UserGroup> param1)
        throws SystemException
    {
    }

    public void clearGroupUserGroups(long param0)
        throws SystemException
    {
    }

    public void deleteGroupUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteGroupUserGroup(long param0, UserGroup param1)
        throws SystemException
    {
    }

    public void deleteGroupUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteGroupUserGroups(long param0, List<UserGroup> param1)
        throws SystemException
    {
    }

    public List<UserGroup> getGroupUserGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupUserGroups(param0, param1, param2);
    }

    public List<UserGroup> getGroupUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupUserGroups(param0);
    }

    public List<UserGroup> getGroupUserGroups(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getGroupUserGroups(param0, param1, param2, param3);
    }

    public int getGroupUserGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupUserGroupsCount(param0);
    }

    public boolean hasGroupUserGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasGroupUserGroup(param0, param1);
    }

    public boolean hasGroupUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.hasGroupUserGroups(param0);
    }

    public void setGroupUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addTeamUserGroup(long param0, UserGroup param1)
        throws SystemException
    {
    }

    public void addTeamUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void addTeamUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addTeamUserGroups(long param0, List<UserGroup> param1)
        throws SystemException
    {
    }

    public void clearTeamUserGroups(long param0)
        throws SystemException
    {
    }

    public void deleteTeamUserGroup(long param0, UserGroup param1)
        throws SystemException
    {
    }

    public void deleteTeamUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteTeamUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteTeamUserGroups(long param0, List<UserGroup> param1)
        throws SystemException
    {
    }

    public List<UserGroup> getTeamUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getTeamUserGroups(param0);
    }

    public List<UserGroup> getTeamUserGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getTeamUserGroups(param0, param1, param2);
    }

    public List<UserGroup> getTeamUserGroups(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getTeamUserGroups(param0, param1, param2, param3);
    }

    public int getTeamUserGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getTeamUserGroupsCount(param0);
    }

    public boolean hasTeamUserGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasTeamUserGroup(param0, param1);
    }

    public boolean hasTeamUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.hasTeamUserGroups(param0);
    }

    public void setTeamUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addUserUserGroup(long param0, UserGroup param1)
        throws SystemException
    {
    }

    public void addUserUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void addUserUserGroups(long param0, List<UserGroup> param1)
        throws SystemException
    {
    }

    public void addUserUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void clearUserUserGroups(long param0)
        throws SystemException
    {
    }

    public void deleteUserUserGroup(long param0, UserGroup param1)
        throws SystemException
    {
    }

    public void deleteUserUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteUserUserGroups(long param0, List<UserGroup> param1)
        throws SystemException
    {
    }

    public void deleteUserUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<UserGroup> getUserUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getUserUserGroups(param0);
    }

    public List<UserGroup> getUserUserGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserUserGroups(param0, param1, param2);
    }

    public List<UserGroup> getUserUserGroups(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getUserUserGroups(param0, param1, param2, param3);
    }

    public int getUserUserGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserUserGroupsCount(param0);
    }

    public boolean hasUserUserGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasUserUserGroup(param0, param1);
    }

    public boolean hasUserUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.hasUserUserGroups(param0);
    }

    public void setUserUserGroups(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void copyUserGroupLayouts(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void copyUserGroupLayouts(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void copyUserGroupLayouts(long[] param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void unsetGroupUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void unsetTeamUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<UserGroup> getUserGroups(long[] param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroups(param0);
    }

    public List<UserGroup> getUserGroups(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUserGroups(param0, param1);
    }

    public List<UserGroup> getUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroups(param0);
    }

    public UserGroup addUserGroup(UserGroup param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public UserGroup addUserGroup(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addUserGroup(param0, param1, param2, param3);
    }

    public UserGroup addUserGroup(long param0, long param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addUserGroup(param0, param1, param2, param3, param4);
    }

    public UserGroup deleteUserGroup(UserGroup param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUserGroup(param0);
    }

    public UserGroup deleteUserGroup(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUserGroup(param0);
    }

    public void deleteUserGroups(long param0)
        throws PortalException, SystemException
    {
    }

    public int getUserGroupsCount()
        throws SystemException
    {
        return this.mockObject.getUserGroupsCount();
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public long dynamicQueryCount(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0);
    }

    public long dynamicQueryCount(DynamicQuery param0, Projection param1)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0, param1);
    }

    public String getBeanIdentifier() {
        return this.mockObject.getBeanIdentifier();
    }

    public void setBeanIdentifier(String param0) {
    }

}
