
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.expando.model.ExpandoBridge;

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
public class UserMock
    extends MockService<User>
    implements User
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.User.class));
    }

    public TimeZone getTimeZone() {
        return this.mockObject.getTimeZone();
    }

    public String getDigest() {
        return this.mockObject.getDigest();
    }

    public String getDigest(String param0) {
        return this.mockObject.getDigest(param0);
    }

    public void setLanguageId(String param0) {
    }

    public Group getGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroup();
    }

    public boolean hasPublicLayouts()
        throws PortalException, SystemException
    {
        return this.mockObject.hasPublicLayouts();
    }

    public Locale getLocale() {
        return this.mockObject.getLocale();
    }

    public List<Address> getAddresses()
        throws SystemException
    {
        return this.mockObject.getAddresses();
    }

    public boolean isActive() {
        return this.mockObject.isActive();
    }

    public boolean hasCompanyMx()
        throws PortalException, SystemException
    {
        return this.mockObject.hasCompanyMx();
    }

    public boolean hasCompanyMx(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.hasCompanyMx(param0);
    }

    public int getPrivateLayoutsPageCount()
        throws PortalException, SystemException
    {
        return this.mockObject.getPrivateLayoutsPageCount();
    }

    public int getPublicLayoutsPageCount()
        throws PortalException, SystemException
    {
        return this.mockObject.getPublicLayoutsPageCount();
    }

    public boolean hasPrivateLayouts()
        throws PortalException, SystemException
    {
        return this.mockObject.hasPrivateLayouts();
    }

    public long getGroupId()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupId();
    }

    public Date getBirthday()
        throws PortalException, SystemException
    {
        return this.mockObject.getBirthday();
    }

    public String getCompanyMx()
        throws PortalException, SystemException
    {
        return this.mockObject.getCompanyMx();
    }

    public Contact getContact()
        throws PortalException, SystemException
    {
        return this.mockObject.getContact();
    }

    public String getDisplayEmailAddress() {
        return this.mockObject.getDisplayEmailAddress();
    }

    public String getDisplayURL(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDisplayURL(param0, param1);
    }

    public String getDisplayURL(ThemeDisplay param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDisplayURL(param0);
    }

    public List<EmailAddress> getEmailAddresses()
        throws SystemException
    {
        return this.mockObject.getEmailAddresses();
    }

    public boolean getFemale()
        throws PortalException, SystemException
    {
        return this.mockObject.getFemale();
    }

    public String getFullName() {
        return this.mockObject.getFullName();
    }

    public long[] getGroupIds()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupIds();
    }

    public List<Group> getGroups()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroups();
    }

    public String getLogin()
        throws PortalException, SystemException
    {
        return this.mockObject.getLogin();
    }

    public boolean getMale()
        throws PortalException, SystemException
    {
        return this.mockObject.getMale();
    }

    public List<Group> getMySites()
        throws PortalException, SystemException
    {
        return this.mockObject.getMySites();
    }

    public List<Group> getMySites(boolean param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMySites(param0, param1);
    }

    public List<Group> getMySites(int param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getMySites(param0);
    }

    public List<Group> getMySites(String[] param0, boolean param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getMySites(param0, param1, param2);
    }

    public List<Group> getMySites(String[] param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMySites(param0, param1);
    }

    public long[] getOrganizationIds()
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizationIds();
    }

    public long[] getOrganizationIds(boolean param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizationIds(param0);
    }

    public List<Organization> getOrganizations()
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizations();
    }

    public List<Organization> getOrganizations(boolean param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizations(param0);
    }

    public boolean getPasswordModified() {
        return this.mockObject.getPasswordModified();
    }

    public PasswordPolicy getPasswordPolicy()
        throws PortalException, SystemException
    {
        return this.mockObject.getPasswordPolicy();
    }

    public String getPasswordUnencrypted() {
        return this.mockObject.getPasswordUnencrypted();
    }

    public List<Phone> getPhones()
        throws SystemException
    {
        return this.mockObject.getPhones();
    }

    public String getPortraitURL(ThemeDisplay param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPortraitURL(param0);
    }

    public Set<String> getReminderQueryQuestions()
        throws PortalException, SystemException
    {
        return this.mockObject.getReminderQueryQuestions();
    }

    public long[] getRoleIds()
        throws SystemException
    {
        return this.mockObject.getRoleIds();
    }

    public List<Role> getRoles()
        throws SystemException
    {
        return this.mockObject.getRoles();
    }

    public long[] getTeamIds()
        throws SystemException
    {
        return this.mockObject.getTeamIds();
    }

    public List<Team> getTeams()
        throws SystemException
    {
        return this.mockObject.getTeams();
    }

    public long[] getUserGroupIds()
        throws SystemException
    {
        return this.mockObject.getUserGroupIds();
    }

    public List<UserGroup> getUserGroups()
        throws SystemException
    {
        return this.mockObject.getUserGroups();
    }

    public List<Website> getWebsites()
        throws SystemException
    {
        return this.mockObject.getWebsites();
    }

    public boolean hasMySites()
        throws PortalException, SystemException
    {
        return this.mockObject.hasMySites();
    }

    public boolean hasOrganization()
        throws PortalException, SystemException
    {
        return this.mockObject.hasOrganization();
    }

    public boolean hasReminderQuery() {
        return this.mockObject.hasReminderQuery();
    }

    public boolean isFemale()
        throws PortalException, SystemException
    {
        return this.mockObject.isFemale();
    }

    public boolean isMale()
        throws PortalException, SystemException
    {
        return this.mockObject.isMale();
    }

    public boolean isPasswordModified() {
        return this.mockObject.isPasswordModified();
    }

    public void setPasswordModified(boolean param0) {
    }

    public void setPasswordUnencrypted(String param0) {
    }

    public void setTimeZoneId(String param0) {
    }

    public String toString() {
        return this.mockObject.toString();
    }

    public int hashCode() {
        return this.mockObject.hashCode();
    }

    public Object clone() {
        return this.mockObject.clone();
    }

    public int compareTo(User param0) {
        return this.mockObject.compareTo(param0);
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public void setPrimaryKey(long param0) {
    }

    public boolean isNew() {
        return this.mockObject.isNew();
    }

    public void setNew(boolean param0) {
    }

    public boolean isCachedModel() {
        return this.mockObject.isCachedModel();
    }

    public void setCachedModel(boolean param0) {
    }

    public boolean isEscapedModel() {
        return this.mockObject.isEscapedModel();
    }

    public Serializable getPrimaryKeyObj() {
        return this.mockObject.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(Serializable param0) {
    }

    public ExpandoBridge getExpandoBridge() {
        return this.mockObject.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public CacheModel<User> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public User toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setCompanyId(long param0) {
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public String getLanguageId() {
        return this.mockObject.getLanguageId();
    }

    public Date getModifiedDate() {
        return this.mockObject.getModifiedDate();
    }

    public void setModifiedDate(Date param0) {
    }

    public long getUserId() {
        return this.mockObject.getUserId();
    }

    public void setUserId(long param0) {
    }

    public String getUuid() {
        return this.mockObject.getUuid();
    }

    public void setUuid(String param0) {
    }

    public String getUserUuid()
        throws SystemException
    {
        return this.mockObject.getUserUuid();
    }

    public void setUserUuid(String param0) {
    }

    public boolean getDefaultUser() {
        return this.mockObject.getDefaultUser();
    }

    public String getEmailAddress() {
        return this.mockObject.getEmailAddress();
    }

    public boolean isDefaultUser() {
        return this.mockObject.isDefaultUser();
    }

    public void setDefaultUser(boolean param0) {
    }

    public long getContactId() {
        return this.mockObject.getContactId();
    }

    public void setContactId(long param0) {
    }

    public String getPassword() {
        return this.mockObject.getPassword();
    }

    public void setPassword(String param0) {
    }

    public boolean getPasswordEncrypted() {
        return this.mockObject.getPasswordEncrypted();
    }

    public boolean isPasswordEncrypted() {
        return this.mockObject.isPasswordEncrypted();
    }

    public void setPasswordEncrypted(boolean param0) {
    }

    public boolean getPasswordReset() {
        return this.mockObject.getPasswordReset();
    }

    public boolean isPasswordReset() {
        return this.mockObject.isPasswordReset();
    }

    public void setPasswordReset(boolean param0) {
    }

    public Date getPasswordModifiedDate() {
        return this.mockObject.getPasswordModifiedDate();
    }

    public void setPasswordModifiedDate(Date param0) {
    }

    public void setDigest(String param0) {
    }

    public String getReminderQueryQuestion() {
        return this.mockObject.getReminderQueryQuestion();
    }

    public void setReminderQueryQuestion(String param0) {
    }

    public String getReminderQueryAnswer() {
        return this.mockObject.getReminderQueryAnswer();
    }

    public void setReminderQueryAnswer(String param0) {
    }

    public int getGraceLoginCount() {
        return this.mockObject.getGraceLoginCount();
    }

    public void setGraceLoginCount(int param0) {
    }

    public String getScreenName() {
        return this.mockObject.getScreenName();
    }

    public void setScreenName(String param0) {
    }

    public void setEmailAddress(String param0) {
    }

    public long getFacebookId() {
        return this.mockObject.getFacebookId();
    }

    public void setFacebookId(long param0) {
    }

    public String getOpenId() {
        return this.mockObject.getOpenId();
    }

    public void setOpenId(String param0) {
    }

    public long getPortraitId() {
        return this.mockObject.getPortraitId();
    }

    public void setPortraitId(long param0) {
    }

    public String getTimeZoneId() {
        return this.mockObject.getTimeZoneId();
    }

    public String getGreeting() {
        return this.mockObject.getGreeting();
    }

    public void setGreeting(String param0) {
    }

    public String getComments() {
        return this.mockObject.getComments();
    }

    public void setComments(String param0) {
    }

    public String getFirstName() {
        return this.mockObject.getFirstName();
    }

    public void setFirstName(String param0) {
    }

    public String getMiddleName() {
        return this.mockObject.getMiddleName();
    }

    public void setMiddleName(String param0) {
    }

    public String getLastName() {
        return this.mockObject.getLastName();
    }

    public void setLastName(String param0) {
    }

    public String getJobTitle() {
        return this.mockObject.getJobTitle();
    }

    public void setJobTitle(String param0) {
    }

    public Date getLoginDate() {
        return this.mockObject.getLoginDate();
    }

    public void setLoginDate(Date param0) {
    }

    public String getLoginIP() {
        return this.mockObject.getLoginIP();
    }

    public void setLoginIP(String param0) {
    }

    public Date getLastLoginDate() {
        return this.mockObject.getLastLoginDate();
    }

    public void setLastLoginDate(Date param0) {
    }

    public String getLastLoginIP() {
        return this.mockObject.getLastLoginIP();
    }

    public void setLastLoginIP(String param0) {
    }

    public Date getLastFailedLoginDate() {
        return this.mockObject.getLastFailedLoginDate();
    }

    public void setLastFailedLoginDate(Date param0) {
    }

    public int getFailedLoginAttempts() {
        return this.mockObject.getFailedLoginAttempts();
    }

    public void setFailedLoginAttempts(int param0) {
    }

    public boolean getLockout() {
        return this.mockObject.getLockout();
    }

    public boolean isLockout() {
        return this.mockObject.isLockout();
    }

    public void setLockout(boolean param0) {
    }

    public Date getLockoutDate() {
        return this.mockObject.getLockoutDate();
    }

    public void setLockoutDate(Date param0) {
    }

    public boolean getAgreedToTermsOfUse() {
        return this.mockObject.getAgreedToTermsOfUse();
    }

    public boolean isAgreedToTermsOfUse() {
        return this.mockObject.isAgreedToTermsOfUse();
    }

    public void setAgreedToTermsOfUse(boolean param0) {
    }

    public boolean getEmailAddressVerified() {
        return this.mockObject.getEmailAddressVerified();
    }

    public boolean isEmailAddressVerified() {
        return this.mockObject.isEmailAddressVerified();
    }

    public void setEmailAddressVerified(boolean param0) {
    }

    public int getStatus() {
        return this.mockObject.getStatus();
    }

    public void setStatus(int param0) {
    }

    public Map<String, Object> getModelAttributes() {
        return this.mockObject.getModelAttributes();
    }

    public void resetOriginalValues() {
    }

    public void setModelAttributes(Map<String, Object> param0) {
    }

    public Class<?> getModelClass() {
        return this.mockObject.getModelClass();
    }

    public String getModelClassName() {
        return this.mockObject.getModelClassName();
    }

    public void persist()
        throws SystemException
    {
    }

}
