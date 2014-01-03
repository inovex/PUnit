
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.KeyValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
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
public class UserLocalServiceMock
    extends MockService<UserLocalService>
    implements UserLocalService
{

    private HashMap<Long, User> _serviceObjects = new HashMap<Long, User>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.UserLocalService.class));
    }

    public List<User> search(long param0, String param1, int param2, LinkedHashMap<String, Object> param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public Hits search(long param0, String param1, int param2, LinkedHashMap<String, Object> param3, int param4, int param5, Sort param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public Hits search(long param0, String param1, String param2, String param3, String param4, String param5, int param6, LinkedHashMap<String, Object> param7, boolean param8, int param9, int param10, Sort param11)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public List<User> search(long param0, String param1, String param2, String param3, String param4, String param5, int param6, LinkedHashMap<String, Object> param7, boolean param8, int param9, int param10, OrderByComparator param11)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public int getGroupUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupUsersCount(param0);
    }

    public int getGroupUsersCount(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupUsersCount(param0, param1);
    }

    public boolean hasGroupUsers(long param0)
        throws SystemException
    {
        return this.mockObject.hasGroupUsers(param0);
    }

    public void setGroupUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addOrganizationUser(long param0, User param1)
        throws SystemException
    {
    }

    public void addOrganizationUser(long param0, long param1)
        throws SystemException
    {
    }

    public void addOrganizationUsers(long param0, List<User> param1)
        throws PortalException, SystemException
    {
    }

    public void addOrganizationUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void clearOrganizationUsers(long param0)
        throws SystemException
    {
    }

    public void deleteOrganizationUser(long param0, User param1)
        throws SystemException
    {
    }

    public void deleteOrganizationUser(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteOrganizationUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteOrganizationUsers(long param0, List<User> param1)
        throws SystemException
    {
    }

    public List<User> getOrganizationUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getOrganizationUsers(param0, param1, param2, param3);
    }

    public List<User> getOrganizationUsers(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationUsers(param0);
    }

    public List<User> getOrganizationUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getOrganizationUsers(param0, param1, param2);
    }

    public int getOrganizationUsersCount(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizationUsersCount(param0, param1);
    }

    public int getOrganizationUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationUsersCount(param0);
    }

    public boolean hasOrganizationUser(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasOrganizationUser(param0, param1);
    }

    public boolean hasOrganizationUsers(long param0)
        throws SystemException
    {
        return this.mockObject.hasOrganizationUsers(param0);
    }

    public void setOrganizationUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addRoleUser(long param0, long param1)
        throws SystemException
    {
    }

    public void addRoleUser(long param0, User param1)
        throws SystemException
    {
    }

    public void addRoleUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void addRoleUsers(long param0, List<User> param1)
        throws PortalException, SystemException
    {
    }

    public void clearRoleUsers(long param0)
        throws SystemException
    {
    }

    public void deleteRoleUser(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteRoleUser(long param0, User param1)
        throws PortalException, SystemException
    {
    }

    public void deleteRoleUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteRoleUsers(long param0, List<User> param1)
        throws SystemException
    {
    }

    public List<User> getRoleUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getRoleUsers(param0, param1, param2, param3);
    }

    public List<User> getRoleUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRoleUsers(param0, param1, param2);
    }

    public List<User> getRoleUsers(long param0)
        throws SystemException
    {
        return this.mockObject.getRoleUsers(param0);
    }

    public int getRoleUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRoleUsersCount(param0);
    }

    public int getRoleUsersCount(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getRoleUsersCount(param0, param1);
    }

    public boolean hasRoleUser(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasRoleUser(param0, param1);
    }

    public boolean hasRoleUser(long param0, String param1, long param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasRoleUser(param0, param1, param2, param3);
    }

    public boolean hasRoleUsers(long param0)
        throws SystemException
    {
        return this.mockObject.hasRoleUsers(param0);
    }

    public void setRoleUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void addTeamUser(long param0, User param1)
        throws SystemException
    {
    }

    public void addTeamUser(long param0, long param1)
        throws SystemException
    {
    }

    public void addTeamUsers(long param0, List<User> param1)
        throws PortalException, SystemException
    {
    }

    public void addTeamUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void clearTeamUsers(long param0)
        throws SystemException
    {
    }

    public void deleteTeamUser(long param0, User param1)
        throws SystemException
    {
    }

    public void deleteTeamUser(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteTeamUsers(long param0, List<User> param1)
        throws SystemException
    {
    }

    public void deleteTeamUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<User> getTeamUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getTeamUsers(param0, param1, param2);
    }

    public List<User> getTeamUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getTeamUsers(param0, param1, param2, param3);
    }

    public List<User> getTeamUsers(long param0)
        throws SystemException
    {
        return this.mockObject.getTeamUsers(param0);
    }

    public void sendEmailAddressVerification(User param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public void sendPassword(long param0, String param1, String param2, String param3, String param4, String param5, ServiceContext param6)
        throws PortalException, SystemException
    {
    }

    public void unsetGroupTeamsUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void unsetGroupUsers(long param0, long[] param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public void unsetOrganizationUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void unsetPasswordPolicyUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public void unsetRoleUsers(long param0, List<User> param1)
        throws PortalException, SystemException
    {
    }

    public void unsetRoleUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void unsetTeamUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void unsetUserGroupUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public User updateAgreedToTermsOfUse(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateAgreedToTermsOfUse(param0, param1);
    }

    public User updateCreateDate(long param0, Date param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCreateDate(param0, param1);
    }

    public User updateEmailAddressVerified(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEmailAddressVerified(param0, param1);
    }

    public User updateFacebookId(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFacebookId(param0, param1);
    }

    public void updateGroups(long param0, long[] param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public User updateIncompleteUser(long param0, long param1, boolean param2, String param3, String param4, boolean param5, String param6, String param7, long param8, String param9, Locale param10, String param11, String param12, String param13, int param14, int param15, boolean param16, int param17, int param18, int param19, String param20, boolean param21, boolean param22, ServiceContext param23)
        throws PortalException, SystemException
    {
        return this.mockObject.updateIncompleteUser(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23);
    }

    public User updateJobTitle(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateJobTitle(param0, param1);
    }

    public User updateLastLogin(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLastLogin(param0, param1);
    }

    public User updateLockout(User param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLockout(param0, param1);
    }

    public User updateLockoutByEmailAddress(long param0, String param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLockoutByEmailAddress(param0, param1, param2);
    }

    public User updateLockoutById(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLockoutById(param0, param1);
    }

    public User updateLockoutByScreenName(long param0, String param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLockoutByScreenName(param0, param1, param2);
    }

    public User updateModifiedDate(long param0, Date param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateModifiedDate(param0, param1);
    }

    public User updateOpenId(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateOpenId(param0, param1);
    }

    public void updateOrganizations(long param0, long[] param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public User updatePassword(long param0, String param1, String param2, boolean param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePassword(param0, param1, param2, param3, param4);
    }

    public User updatePassword(long param0, String param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePassword(param0, param1, param2, param3);
    }

    public User updatePasswordManually(long param0, String param1, boolean param2, boolean param3, Date param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePasswordManually(param0, param1, param2, param3, param4);
    }

    public User updatePasswordReset(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePasswordReset(param0, param1);
    }

    public User updatePortrait(long param0, byte[] param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePortrait(param0, param1);
    }

    public User updateReminderQuery(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateReminderQuery(param0, param1, param2);
    }

    public User updateScreenName(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateScreenName(param0, param1);
    }

    public void verifyEmailAddress(String param0)
        throws PortalException, SystemException
    {
    }

    public User fetchUser(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int searchCount(long param0, String param1, String param2, String param3, String param4, String param5, int param6, LinkedHashMap<String, Object> param7, boolean param8)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public int searchCount(long param0, String param1, int param2, LinkedHashMap<String, Object> param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public User getUser(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public User addUser(User param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public User addUser(long param0, long param1, boolean param2, String param3, String param4, boolean param5, String param6, String param7, long param8, String param9, Locale param10, String param11, String param12, String param13, int param14, int param15, boolean param16, int param17, int param18, int param19, String param20, long[] param21, long[] param22, long[] param23, long[] param24, boolean param25, ServiceContext param26)
        throws PortalException, SystemException
    {
        return this.mockObject.addUser(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26);
    }

    public long getDefaultUserId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultUserId(param0);
    }

    public User createUser(long param0) {
        return this.mockObject.createUser(param0);
    }

    public User fetchUserByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchUserByUuidAndCompanyId(param0, param1);
    }

    public User getUserByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByUuidAndCompanyId(param0, param1);
    }

    public List<User> getUsers(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUsers(param0, param1);
    }

    public void addGroupUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void addGroupUsers(long param0, List<User> param1)
        throws PortalException, SystemException
    {
    }

    public void clearGroupUsers(long param0)
        throws SystemException
    {
    }

    public void deleteGroupUser(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteGroupUser(long param0, User param1)
        throws SystemException
    {
    }

    public void deleteGroupUsers(long param0, List<User> param1)
        throws SystemException
    {
    }

    public void deleteGroupUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<User> getGroupUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getGroupUsers(param0, param1, param2, param3);
    }

    public List<User> getGroupUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupUsers(param0, param1, param2);
    }

    public List<User> getGroupUsers(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupUsers(param0);
    }

    public int getTeamUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getTeamUsersCount(param0);
    }

    public boolean hasTeamUser(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasTeamUser(param0, param1);
    }

    public boolean hasTeamUsers(long param0)
        throws SystemException
    {
        return this.mockObject.hasTeamUsers(param0);
    }

    public void setTeamUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addUserGroupUser(long param0, User param1)
        throws SystemException
    {
    }

    public void addUserGroupUser(long param0, long param1)
        throws SystemException
    {
    }

    public void addUserGroupUsers(long param0, List<User> param1)
        throws PortalException, SystemException
    {
    }

    public void addUserGroupUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void clearUserGroupUsers(long param0)
        throws SystemException
    {
    }

    public void deleteUserGroupUser(long param0, User param1)
        throws PortalException, SystemException
    {
    }

    public void deleteUserGroupUser(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteUserGroupUsers(long param0, List<User> param1)
        throws SystemException
    {
    }

    public void deleteUserGroupUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<User> getUserGroupUsers(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupUsers(param0);
    }

    public List<User> getUserGroupUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserGroupUsers(param0, param1, param2);
    }

    public List<User> getUserGroupUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getUserGroupUsers(param0, param1, param2, param3);
    }

    public int getUserGroupUsersCount(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserGroupUsersCount(param0, param1);
    }

    public int getUserGroupUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupUsersCount(param0);
    }

    public boolean hasUserGroupUser(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasUserGroupUser(param0, param1);
    }

    public boolean hasUserGroupUsers(long param0)
        throws SystemException
    {
        return this.mockObject.hasUserGroupUsers(param0);
    }

    public void setUserGroupUsers(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public User addDefaultAdminUser(long param0, String param1, String param2, Locale param3, String param4, String param5, String param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addDefaultAdminUser(param0, param1, param2, param3, param4, param5, param6);
    }

    public void addDefaultGroups(long param0)
        throws PortalException, SystemException
    {
    }

    public void addDefaultRoles(long param0)
        throws PortalException, SystemException
    {
    }

    public void addDefaultUserGroups(long param0)
        throws PortalException, SystemException
    {
    }

    public void addPasswordPolicyUsers(long param0, long[] param1)
        throws SystemException
    {
    }

    public User addUserWithWorkflow(long param0, long param1, boolean param2, String param3, String param4, boolean param5, String param6, String param7, long param8, String param9, Locale param10, String param11, String param12, String param13, int param14, int param15, boolean param16, int param17, int param18, int param19, String param20, long[] param21, long[] param22, long[] param23, long[] param24, boolean param25, ServiceContext param26)
        throws PortalException, SystemException
    {
        return this.mockObject.addUserWithWorkflow(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26);
    }

    public int authenticateByEmailAddress(long param0, String param1, String param2, Map<String, String[]> param3, Map<String, String[]> param4, Map<String, Object> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.authenticateByEmailAddress(param0, param1, param2, param3, param4, param5);
    }

    public int authenticateByScreenName(long param0, String param1, String param2, Map<String, String[]> param3, Map<String, String[]> param4, Map<String, Object> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.authenticateByScreenName(param0, param1, param2, param3, param4, param5);
    }

    public int authenticateByUserId(long param0, long param1, String param2, Map<String, String[]> param3, Map<String, String[]> param4, Map<String, Object> param5)
        throws PortalException, SystemException
    {
        return this.mockObject.authenticateByUserId(param0, param1, param2, param3, param4, param5);
    }

    public long authenticateForBasic(long param0, String param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.authenticateForBasic(param0, param1, param2, param3);
    }

    public long authenticateForDigest(long param0, String param1, String param2, String param3, String param4, String param5, String param6)
        throws PortalException, SystemException
    {
        return this.mockObject.authenticateForDigest(param0, param1, param2, param3, param4, param5, param6);
    }

    public boolean authenticateForJAAS(long param0, String param1) {
        return this.mockObject.authenticateForJAAS(param0, param1);
    }

    public void checkLockout(User param0)
        throws PortalException, SystemException
    {
    }

    public void checkLoginFailure(User param0)
        throws SystemException
    {
    }

    public void checkLoginFailureByEmailAddress(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void checkLoginFailureById(long param0)
        throws PortalException, SystemException
    {
    }

    public void checkLoginFailureByScreenName(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void checkPasswordExpired(User param0)
        throws PortalException, SystemException
    {
    }

    public void completeUserRegistration(User param0, ServiceContext param1)
        throws PortalException, SystemException
    {
    }

    public KeyValuePair decryptUserId(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.decryptUserId(param0, param1, param2);
    }

    public void deletePortrait(long param0)
        throws PortalException, SystemException
    {
    }

    public String encryptUserId(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.encryptUserId(param0);
    }

    public User fetchUserByEmailAddress(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchUserByEmailAddress(param0, param1);
    }

    public User fetchUserByFacebookId(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchUserByFacebookId(param0, param1);
    }

    public User fetchUserById(long param0)
        throws SystemException
    {
        return this.mockObject.fetchUserById(param0);
    }

    public User fetchUserByOpenId(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchUserByOpenId(param0, param1);
    }

    public User fetchUserByScreenName(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchUserByScreenName(param0, param1);
    }

    public List<User> getCompanyUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyUsers(param0, param1, param2);
    }

    public int getCompanyUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyUsersCount(param0);
    }

    public long[] getGroupUserIds(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupUserIds(param0);
    }

    public List<User> getInheritedRoleUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getInheritedRoleUsers(param0, param1, param2, param3);
    }

    public List<User> getNoAnnouncementsDeliveries(String param0)
        throws SystemException
    {
        return this.mockObject.getNoAnnouncementsDeliveries(param0);
    }

    public List<User> getNoContacts()
        throws SystemException
    {
        return this.mockObject.getNoContacts();
    }

    public List<User> getNoGroups()
        throws SystemException
    {
        return this.mockObject.getNoGroups();
    }

    public long[] getOrganizationUserIds(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationUserIds(param0);
    }

    public long[] getRoleUserIds(long param0)
        throws SystemException
    {
        return this.mockObject.getRoleUserIds(param0);
    }

    public List<User> getSocialUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsers(param0, param1, param2, param3);
    }

    public List<User> getSocialUsers(long param0, long param1, int param2, int param3, int param4, OrderByComparator param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsers(param0, param1, param2, param3, param4, param5);
    }

    public List<User> getSocialUsers(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsers(param0, param1, param2, param3, param4);
    }

    public List<User> getSocialUsers(long param0, int param1, int param2, int param3, OrderByComparator param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsers(param0, param1, param2, param3, param4);
    }

    public int getSocialUsersCount(long param0, long param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsersCount(param0, param1, param2);
    }

    public int getSocialUsersCount(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsersCount(param0, param1);
    }

    public int getSocialUsersCount(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsersCount(param0, param1);
    }

    public int getSocialUsersCount(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialUsersCount(param0);
    }

    public User getUserByContactId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByContactId(param0);
    }

    public User getUserByEmailAddress(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByEmailAddress(param0, param1);
    }

    public User getUserByFacebookId(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByFacebookId(param0, param1);
    }

    public User getUserById(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserById(param0);
    }

    public User getUserById(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserById(param0, param1);
    }

    public User getUserByOpenId(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByOpenId(param0, param1);
    }

    public User getUserByPortraitId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByPortraitId(param0);
    }

    public User getUserByScreenName(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByScreenName(param0, param1);
    }

    public User getUserByUuid(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserByUuid(param0);
    }

    public long getUserIdByEmailAddress(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserIdByEmailAddress(param0, param1);
    }

    public long getUserIdByScreenName(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserIdByScreenName(param0, param1);
    }

    public boolean hasPasswordPolicyUser(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasPasswordPolicyUser(param0, param1);
    }

    public boolean isPasswordExpired(User param0)
        throws PortalException, SystemException
    {
        return this.mockObject.isPasswordExpired(param0);
    }

    public boolean isPasswordExpiringSoon(User param0)
        throws PortalException, SystemException
    {
        return this.mockObject.isPasswordExpiringSoon(param0);
    }

    public User loadGetDefaultUser(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.loadGetDefaultUser(param0);
    }

    public User deleteUser(User param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUser(param0);
    }

    public User deleteUser(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUser(param0);
    }

    public int getUsersCount()
        throws SystemException
    {
        return this.mockObject.getUsersCount();
    }

    public User updateUser(User param0)
        throws SystemException
    {
        return this.mockObject.updateUser(param0);
    }

    public User updateUser(long param0, String param1, String param2, String param3, boolean param4, String param5, String param6, String param7, String param8, long param9, String param10, String param11, String param12, String param13, String param14, String param15, String param16, String param17, int param18, int param19, boolean param20, int param21, int param22, int param23, String param24, String param25, String param26, String param27, String param28, String param29, String param30, String param31, String param32, String param33, String param34, long[] param35, long[] param36, long[] param37, List<UserGroupRole> param38, long[] param39, ServiceContext param40)
        throws PortalException, SystemException
    {
        return this.mockObject.updateUser(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26, param27, param28, param29, param30, param31, param32, param33, param34, param35, param36, param37, param38, param39, param40);
    }

    public void addGroupUser(long param0, long param1)
        throws SystemException
    {
    }

    public void addGroupUser(long param0, User param1)
        throws SystemException
    {
    }

    public boolean hasGroupUser(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasGroupUser(param0, param1);
    }

    public User updateEmailAddress(long param0, String param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEmailAddress(param0, param1, param2, param3, param4);
    }

    public User updateEmailAddress(long param0, String param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEmailAddress(param0, param1, param2, param3);
    }

    public void updateAsset(long param0, User param1, long[] param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
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

    public User updateStatus(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1);
    }

    public User getDefaultUser(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultUser(param0);
    }

}
