
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
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
public class PasswordPolicyMock
    extends MockService<PasswordPolicy>
    implements PasswordPolicy
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.PasswordPolicy.class));
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

    public int compareTo(PasswordPolicy param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public String getDescription() {
        return this.mockObject.getDescription();
    }

    public boolean isCachedModel() {
        return this.mockObject.isCachedModel();
    }

    public void setCachedModel(boolean param0) {
    }

    public boolean isEscapedModel() {
        return this.mockObject.isEscapedModel();
    }

    public void setPrimaryKey(long param0) {
    }

    public ExpandoBridge getExpandoBridge() {
        return this.mockObject.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public PasswordPolicy toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public Serializable getPrimaryKeyObj() {
        return this.mockObject.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(Serializable param0) {
    }

    public boolean isNew() {
        return this.mockObject.isNew();
    }

    public void setNew(boolean param0) {
    }

    public CacheModel<PasswordPolicy> toCacheModel() {
        return this.mockObject.toCacheModel();
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

    public boolean getDefaultPolicy() {
        return this.mockObject.getDefaultPolicy();
    }

    public boolean isDefaultPolicy() {
        return this.mockObject.isDefaultPolicy();
    }

    public void setDefaultPolicy(boolean param0) {
    }

    public boolean getChangeable() {
        return this.mockObject.getChangeable();
    }

    public boolean isChangeable() {
        return this.mockObject.isChangeable();
    }

    public void setChangeable(boolean param0) {
    }

    public boolean getChangeRequired() {
        return this.mockObject.getChangeRequired();
    }

    public boolean isChangeRequired() {
        return this.mockObject.isChangeRequired();
    }

    public void setChangeRequired(boolean param0) {
    }

    public void setMinAge(long param0) {
    }

    public boolean getCheckSyntax() {
        return this.mockObject.getCheckSyntax();
    }

    public boolean isCheckSyntax() {
        return this.mockObject.isCheckSyntax();
    }

    public void setCheckSyntax(boolean param0) {
    }

    public boolean getAllowDictionaryWords() {
        return this.mockObject.getAllowDictionaryWords();
    }

    public boolean isAllowDictionaryWords() {
        return this.mockObject.isAllowDictionaryWords();
    }

    public void setAllowDictionaryWords(boolean param0) {
    }

    public int getMinAlphanumeric() {
        return this.mockObject.getMinAlphanumeric();
    }

    public void setMinAlphanumeric(int param0) {
    }

    public int getMinLength() {
        return this.mockObject.getMinLength();
    }

    public void setMinLength(int param0) {
    }

    public String getUserName() {
        return this.mockObject.getUserName();
    }

    public String getUserUuid()
        throws SystemException
    {
        return this.mockObject.getUserUuid();
    }

    public void setUserUuid(String param0) {
    }

    public void setUserName(String param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public boolean getLockout() {
        return this.mockObject.getLockout();
    }

    public boolean isLockout() {
        return this.mockObject.isLockout();
    }

    public void setLockout(boolean param0) {
    }

    public long getPasswordPolicyId() {
        return this.mockObject.getPasswordPolicyId();
    }

    public int getMinLowerCase() {
        return this.mockObject.getMinLowerCase();
    }

    public void setMinLowerCase(int param0) {
    }

    public int getMinNumbers() {
        return this.mockObject.getMinNumbers();
    }

    public void setMinNumbers(int param0) {
    }

    public int getMinSymbols() {
        return this.mockObject.getMinSymbols();
    }

    public void setMinSymbols(int param0) {
    }

    public int getMinUpperCase() {
        return this.mockObject.getMinUpperCase();
    }

    public void setMinUpperCase(int param0) {
    }

    public String getRegex() {
        return this.mockObject.getRegex();
    }

    public void setRegex(String param0) {
    }

    public boolean getHistory() {
        return this.mockObject.getHistory();
    }

    public boolean isHistory() {
        return this.mockObject.isHistory();
    }

    public void setHistory(boolean param0) {
    }

    public int getHistoryCount() {
        return this.mockObject.getHistoryCount();
    }

    public void setHistoryCount(int param0) {
    }

    public boolean getExpireable() {
        return this.mockObject.getExpireable();
    }

    public boolean isExpireable() {
        return this.mockObject.isExpireable();
    }

    public void setExpireable(boolean param0) {
    }

    public long getMaxAge() {
        return this.mockObject.getMaxAge();
    }

    public void setMaxAge(long param0) {
    }

    public long getWarningTime() {
        return this.mockObject.getWarningTime();
    }

    public void setWarningTime(long param0) {
    }

    public int getGraceLimit() {
        return this.mockObject.getGraceLimit();
    }

    public void setGraceLimit(int param0) {
    }

    public int getMaxFailure() {
        return this.mockObject.getMaxFailure();
    }

    public void setMaxFailure(int param0) {
    }

    public long getLockoutDuration() {
        return this.mockObject.getLockoutDuration();
    }

    public void setLockoutDuration(long param0) {
    }

    public boolean getRequireUnlock() {
        return this.mockObject.getRequireUnlock();
    }

    public boolean isRequireUnlock() {
        return this.mockObject.isRequireUnlock();
    }

    public void setRequireUnlock(boolean param0) {
    }

    public long getResetFailureCount() {
        return this.mockObject.getResetFailureCount();
    }

    public void setResetFailureCount(long param0) {
    }

    public long getResetTicketMaxAge() {
        return this.mockObject.getResetTicketMaxAge();
    }

    public void setResetTicketMaxAge(long param0) {
    }

    public void setPasswordPolicyId(long param0) {
    }

    public long getMinAge() {
        return this.mockObject.getMinAge();
    }

    public PasswordPolicy toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setCompanyId(long param0) {
    }

    public void setDescription(String param0) {
    }

    public void resetOriginalValues() {
    }

    public Map<String, Object> getModelAttributes() {
        return this.mockObject.getModelAttributes();
    }

    public void setModelAttributes(Map<String, Object> param0) {
    }

    public Class<?> getModelClass() {
        return this.mockObject.getModelClass();
    }

    public String getModelClassName() {
        return this.mockObject.getModelClassName();
    }

    public StagedModelType getStagedModelType() {
        return this.mockObject.getStagedModelType();
    }

    public void persist()
        throws SystemException
    {
    }

}
