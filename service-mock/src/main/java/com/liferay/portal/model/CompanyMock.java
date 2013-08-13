
package com.liferay.portal.model;

import java.io.Serializable;
import java.security.Key;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
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
public class CompanyMock
    extends MockService<Company>
    implements Company
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Company.class));
    }

    public int compareTo(Company param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName()
        throws PortalException, SystemException
    {
        return this.mockObject.getName();
    }

    public TimeZone getTimeZone()
        throws PortalException, SystemException
    {
        return this.mockObject.getTimeZone();
    }

    public String getShortName()
        throws PortalException, SystemException
    {
        return this.mockObject.getShortName();
    }

    public String getPortalURL(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPortalURL(param0);
    }

    public Group getGroup()
        throws PortalException, SystemException
    {
        return this.mockObject.getGroup();
    }

    public Locale getLocale()
        throws PortalException, SystemException
    {
        return this.mockObject.getLocale();
    }

    public Account getAccount()
        throws PortalException, SystemException
    {
        return this.mockObject.getAccount();
    }

    public String getAdminName() {
        return this.mockObject.getAdminName();
    }

    public String getAuthType()
        throws SystemException
    {
        return this.mockObject.getAuthType();
    }

    public User getDefaultUser()
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultUser();
    }

    public String getDefaultWebId() {
        return this.mockObject.getDefaultWebId();
    }

    public String getEmailAddress() {
        return this.mockObject.getEmailAddress();
    }

    public Key getKeyObj() {
        return this.mockObject.getKeyObj();
    }

    public String getShardName()
        throws PortalException, SystemException
    {
        return this.mockObject.getShardName();
    }

    public String getVirtualHostname() {
        return this.mockObject.getVirtualHostname();
    }

    public boolean hasCompanyMx(String param0)
        throws SystemException
    {
        return this.mockObject.hasCompanyMx(param0);
    }

    public boolean isAutoLogin()
        throws SystemException
    {
        return this.mockObject.isAutoLogin();
    }

    public boolean isSendPassword()
        throws SystemException
    {
        return this.mockObject.isSendPassword();
    }

    public boolean isSendPasswordResetLink()
        throws SystemException
    {
        return this.mockObject.isSendPasswordResetLink();
    }

    public boolean isSiteLogo()
        throws SystemException
    {
        return this.mockObject.isSiteLogo();
    }

    public boolean isStrangers()
        throws SystemException
    {
        return this.mockObject.isStrangers();
    }

    public boolean isStrangersVerify()
        throws SystemException
    {
        return this.mockObject.isStrangersVerify();
    }

    public boolean isStrangersWithMx()
        throws SystemException
    {
        return this.mockObject.isStrangersWithMx();
    }

    public void setKey(String param0) {
    }

    public void setKeyObj(Key param0) {
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

    public String getKey() {
        return this.mockObject.getKey();
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

    public CacheModel<Company> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Company toEscapedModel() {
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

    public String getHomeURL() {
        return this.mockObject.getHomeURL();
    }

    public long getAccountId() {
        return this.mockObject.getAccountId();
    }

    public void setAccountId(long param0) {
    }

    public boolean getActive() {
        return this.mockObject.getActive();
    }

    public boolean isActive() {
        return this.mockObject.isActive();
    }

    public void setActive(boolean param0) {
    }

    public String getWebId() {
        return this.mockObject.getWebId();
    }

    public void setWebId(String param0) {
    }

    public String getMx() {
        return this.mockObject.getMx();
    }

    public void setMx(String param0) {
    }

    public void setHomeURL(String param0) {
    }

    public long getLogoId() {
        return this.mockObject.getLogoId();
    }

    public void setLogoId(long param0) {
    }

    public boolean getSystem() {
        return this.mockObject.getSystem();
    }

    public boolean isSystem() {
        return this.mockObject.isSystem();
    }

    public void setSystem(boolean param0) {
    }

    public int getMaxUsers() {
        return this.mockObject.getMaxUsers();
    }

    public void setMaxUsers(int param0) {
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
