
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Organization;
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
public class GroupLocalServiceMock
    extends MockService<GroupLocalService>
    implements GroupLocalService
{

    private HashMap<Long, Group> _serviceObjects = new HashMap<Long, Group>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.GroupLocalService.class));
    }

    public List<Group> search(long param0, long param1, String param2, String param3, LinkedHashMap<String, Object> param4, boolean param5, int param6, int param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<Group> search(long param0, long param1, String param2, String param3, LinkedHashMap<String, Object> param4, boolean param5, int param6, int param7, OrderByComparator param8)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public List<Group> search(long param0, long[] param1, long param2, String param3, LinkedHashMap<String, Object> param4, int param5, int param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Group> search(long param0, long[] param1, long param2, String param3, LinkedHashMap<String, Object> param4, int param5, int param6, OrderByComparator param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<Group> search(long param0, long[] param1, long param2, String param3, String param4, LinkedHashMap<String, Object> param5, boolean param6, int param7, int param8)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public List<Group> search(long param0, String param1, String param2, LinkedHashMap<String, Object> param3, boolean param4, int param5, int param6, OrderByComparator param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<Group> search(long param0, LinkedHashMap<String, Object> param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3);
    }

    public List<Group> search(long param0, long param1, String param2, LinkedHashMap<String, Object> param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public List<Group> search(long param0, long param1, String param2, LinkedHashMap<String, Object> param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Group> search(long param0, long[] param1, String param2, String param3, LinkedHashMap<String, Object> param4, boolean param5, int param6, int param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<Group> search(long param0, String param1, String param2, LinkedHashMap<String, Object> param3, boolean param4, int param5, int param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Group> search(long param0, long[] param1, String param2, String param3, LinkedHashMap<String, Object> param4, boolean param5, int param6, int param7, OrderByComparator param8)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public List<Group> search(long param0, String param1, LinkedHashMap<String, Object> param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4);
    }

    public List<Group> search(long param0, String param1, LinkedHashMap<String, Object> param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public List<Group> search(long param0, long[] param1, String param2, LinkedHashMap<String, Object> param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Group> search(long param0, long[] param1, long param2, String param3, String param4, LinkedHashMap<String, Object> param5, boolean param6, int param7, int param8, OrderByComparator param9)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public List<Group> search(long param0, long[] param1, String param2, LinkedHashMap<String, Object> param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Group createGroup(long param0) {
        return this.mockObject.createGroup(param0);
    }

    public Group getGroup(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Group getGroup(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroup(param0, param1);
    }

    public Group getLayoutGroup(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutGroup(param0, param1);
    }

    public Group getLayoutPrototypeGroup(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutPrototypeGroup(param0, param1);
    }

    public Group getLayoutSetPrototypeGroup(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutSetPrototypeGroup(param0, param1);
    }

    public List<Group> getLayoutsGroups(long param0, long param1, boolean param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getLayoutsGroups(param0, param1, param2, param3, param4);
    }

    public int getLayoutsGroupsCount(long param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getLayoutsGroupsCount(param0, param1, param2);
    }

    public List<Group> getLiveGroups()
        throws SystemException
    {
        return this.mockObject.getLiveGroups();
    }

    public List<Group> getNoLayoutsGroups(String param0, boolean param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getNoLayoutsGroups(param0, param1, param2, param3);
    }

    public List<Group> getNullFriendlyURLGroups()
        throws SystemException
    {
        return this.mockObject.getNullFriendlyURLGroups();
    }

    public Group getOrganizationGroup(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizationGroup(param0, param1);
    }

    public List<Group> getOrganizationsGroups(List<Organization> param0) {
        return this.mockObject.getOrganizationsGroups(param0);
    }

    public List<Group> getOrganizationsRelatedGroups(List<Organization> param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationsRelatedGroups(param0);
    }

    public List<Group> getParentGroups(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentGroups(param0);
    }

    public Group getUserGroup(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroup(param0, param1);
    }

    public Group getUserGroupGroup(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroupGroup(param0, param1);
    }

    public List<Group> getUserGroupsGroups(List<UserGroup> param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroupsGroups(param0);
    }

    public List<Group> getUserGroupsRelatedGroups(List<UserGroup> param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupsRelatedGroups(param0);
    }

    public List<Group> getUserOrganizationsGroups(long param0, int param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserOrganizationsGroups(param0, param1, param2);
    }

    public Group getUserPersonalSiteGroup(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserPersonalSiteGroup(param0);
    }

    public List<Group> getUserSitesGroups(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserSitesGroups(param0, param1);
    }

    public List<Group> getUserSitesGroups(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserSitesGroups(param0);
    }

    public Group loadFetchGroup(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.loadFetchGroup(param0, param1);
    }

    public Group loadGetGroup(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.loadGetGroup(param0, param1);
    }

    public void rebuildTree(long param0)
        throws PortalException, SystemException
    {
    }

    public int searchCount(long param0, long[] param1, long param2, String param3, LinkedHashMap<String, Object> param4)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4);
    }

    public int searchCount(long param0, long param1, String param2, String param3, LinkedHashMap<String, Object> param4, boolean param5)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5);
    }

    public int searchCount(long param0, long param1, String param2, LinkedHashMap<String, Object> param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public int searchCount(long param0, String param1, LinkedHashMap<String, Object> param2)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2);
    }

    public int searchCount(long param0, long[] param1, String param2, String param3, LinkedHashMap<String, Object> param4, boolean param5)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5);
    }

    public int searchCount(long param0, String param1, String param2, LinkedHashMap<String, Object> param3, boolean param4)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4);
    }

    public int searchCount(long param0, long[] param1, String param2, LinkedHashMap<String, Object> param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public int searchCount(long param0, long[] param1, long param2, String param3, String param4, LinkedHashMap<String, Object> param5, boolean param6)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6);
    }

    public void clearOrganizationGroups(long param0)
        throws SystemException
    {
    }

    public void deleteOrganizationGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void deleteOrganizationGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteOrganizationGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteOrganizationGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public List<Group> getOrganizationGroups(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getOrganizationGroups(param0, param1, param2, param3);
    }

    public List<Group> getOrganizationGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getOrganizationGroups(param0, param1, param2);
    }

    public List<Group> getOrganizationGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationGroups(param0);
    }

    public int getOrganizationGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationGroupsCount(param0);
    }

    public boolean hasOrganizationGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasOrganizationGroup(param0, param1);
    }

    public boolean hasOrganizationGroups(long param0)
        throws SystemException
    {
        return this.mockObject.hasOrganizationGroups(param0);
    }

    public void setOrganizationGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addRoleGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void addRoleGroup(long param0, long param1)
        throws SystemException
    {
    }

    public boolean hasRoleGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasRoleGroup(param0, param1);
    }

    public List<Group> getUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroups(param0);
    }

    public List<Group> getUserGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserGroups(param0, param1, param2);
    }

    public List<Group> getUserGroups(long param0, int param1, int param2, OrderByComparator param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroups(param0, param1, param2, param3);
    }

    public List<Group> getUserGroups(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroups(param0, param1);
    }

    public List<Group> getUserGroups(long param0, boolean param1, int param2, int param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroups(param0, param1, param2, param3);
    }

    public Group fetchGroup(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Group fetchGroup(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchGroup(param0, param1);
    }

    public Group addGroup(long param0, long param1, String param2, long param3, String param4, String param5, int param6, String param7, boolean param8, boolean param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.addGroup(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public Group addGroup(Group param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Group addGroup(long param0, long param1, String param2, long param3, long param4, String param5, String param6, int param7, boolean param8, int param9, String param10, boolean param11, boolean param12, ServiceContext param13)
        throws PortalException, SystemException
    {
        return this.mockObject.addGroup(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public Group addGroup(long param0, String param1, long param2, long param3, String param4, String param5, int param6, String param7, boolean param8, boolean param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.addGroup(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public Group addGroup(long param0, String param1, long param2, String param3, String param4, int param5, String param6, boolean param7, boolean param8, ServiceContext param9)
        throws PortalException, SystemException
    {
        return this.mockObject.addGroup(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public Group getGroupByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupByUuidAndCompanyId(param0, param1);
    }

    public int getGroupsCount(long param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getGroupsCount(param0, param1, param2);
    }

    public int getGroupsCount()
        throws SystemException
    {
        return this.mockObject.getGroupsCount();
    }

    public int getGroupsCount(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getGroupsCount(param0, param1, param2);
    }

    public void addOrganizationGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void addOrganizationGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void addOrganizationGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public void addOrganizationGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public Group deleteGroup(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteGroup(param0);
    }

    public Group deleteGroup(Group param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteGroup(param0);
    }

    public void addRoleGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addRoleGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public void clearRoleGroups(long param0)
        throws SystemException
    {
    }

    public void deleteRoleGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteRoleGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void deleteRoleGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public void deleteRoleGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<Group> getRoleGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getRoleGroups(param0);
    }

    public List<Group> getRoleGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRoleGroups(param0, param1, param2);
    }

    public List<Group> getRoleGroups(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getRoleGroups(param0, param1, param2, param3);
    }

    public int getRoleGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRoleGroupsCount(param0);
    }

    public boolean hasRoleGroups(long param0)
        throws SystemException
    {
        return this.mockObject.hasRoleGroups(param0);
    }

    public void setRoleGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addUserGroupGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void addUserGroupGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void addUserGroupGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addUserGroupGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public void clearUserGroupGroups(long param0)
        throws SystemException
    {
    }

    public void deleteUserGroupGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void deleteUserGroupGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteUserGroupGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteUserGroupGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public List<Group> getUserGroupGroups(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroups(param0, param1, param2, param3);
    }

    public List<Group> getUserGroupGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroups(param0, param1, param2);
    }

    public List<Group> getUserGroupGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroups(param0);
    }

    public int getUserGroupGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupGroupsCount(param0);
    }

    public boolean hasUserGroupGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasUserGroupGroup(param0, param1);
    }

    public boolean hasUserGroupGroups(long param0)
        throws SystemException
    {
        return this.mockObject.hasUserGroupGroups(param0);
    }

    public void setUserGroupGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void addUserGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void addUserGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public void addUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void clearUserGroups(long param0)
        throws SystemException
    {
    }

    public void deleteUserGroup(long param0, Group param1)
        throws SystemException
    {
    }

    public void deleteUserGroup(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteUserGroups(long param0, List<Group> param1)
        throws SystemException
    {
    }

    public void deleteUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public int getUserGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupsCount(param0);
    }

    public boolean hasUserGroup(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasUserGroup(param0, param1);
    }

    public boolean hasUserGroup(long param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.hasUserGroup(param0, param1, param2);
    }

    public boolean hasUserGroups(long param0)
        throws SystemException
    {
        return this.mockObject.hasUserGroups(param0);
    }

    public void setUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void checkCompanyGroup(long param0)
        throws PortalException, SystemException
    {
    }

    public void checkSystemGroups(long param0)
        throws PortalException, SystemException
    {
    }

    public void disableStaging(long param0)
        throws PortalException, SystemException
    {
    }

    public void enableStaging(long param0)
        throws PortalException, SystemException
    {
    }

    public Group fetchFriendlyURLGroup(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchFriendlyURLGroup(param0, param1);
    }

    public Group getCompanyGroup(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompanyGroup(param0);
    }

    public List<Group> getCompanyGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyGroups(param0, param1, param2);
    }

    public int getCompanyGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyGroupsCount(param0);
    }

    public Group getFriendlyURLGroup(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFriendlyURLGroup(param0, param1);
    }

    public String getGroupDescriptiveName(long param0, Locale param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupDescriptiveName(param0, param1);
    }

    public String getGroupDescriptiveName(Group param0, Locale param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupDescriptiveName(param0, param1);
    }

    public Group fetchGroupByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchGroupByUuidAndCompanyId(param0, param1);
    }

    public Group updateGroup(long param0, long param1, String param2, String param3, int param4, boolean param5, int param6, String param7, boolean param8, ServiceContext param9)
        throws PortalException, SystemException
    {
        return this.mockObject.updateGroup(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public Group updateGroup(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateGroup(param0, param1);
    }

    public Group updateGroup(Group param0)
        throws SystemException
    {
        return this.mockObject.updateGroup(param0);
    }

    public void unsetRoleGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void unsetUserGroups(long param0, long[] param1)
        throws SystemException
    {
    }

    public void updateAsset(long param0, Group param1, long[] param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public Group updateFriendlyURL(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFriendlyURL(param0, param1);
    }

    public Group updateSite(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateSite(param0, param1);
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

    public Group getStagingGroup(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getStagingGroup(param0);
    }

    public boolean hasStagingGroup(long param0)
        throws SystemException
    {
        return this.mockObject.hasStagingGroup(param0);
    }

    public List<Group> getGroups(long param0, String param1, long param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getGroups(param0, param1, param2, param3, param4);
    }

    public List<Group> getGroups(long[] param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroups(param0);
    }

    public List<Group> getGroups(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getGroups(param0, param1);
    }

    public List<Group> getGroups(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getGroups(param0, param1, param2);
    }

    public List<Group> getGroups(long param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getGroups(param0, param1, param2);
    }

}
