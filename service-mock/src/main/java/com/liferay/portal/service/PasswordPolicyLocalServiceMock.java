
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PasswordPolicy;
import com.liferay.portal.model.PersistedModel;

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
public class PasswordPolicyLocalServiceMock
    extends MockService<PasswordPolicyLocalService>
    implements PasswordPolicyLocalService
{

    private HashMap<Long, PasswordPolicy> _serviceObjects = new HashMap<Long, PasswordPolicy>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PasswordPolicyLocalService.class));
    }

    public List<PasswordPolicy> search(long param0, String param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4);
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

    public PasswordPolicy getPasswordPolicy(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PasswordPolicy getPasswordPolicy(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getPasswordPolicy(param0, param1, param2);
    }

    public PasswordPolicy getPasswordPolicy(long param0, long[] param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPasswordPolicy(param0, param1);
    }

    public int searchCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1);
    }

    public PasswordPolicy addPasswordPolicy(PasswordPolicy param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public PasswordPolicy addPasswordPolicy(long param0, boolean param1, String param2, String param3, boolean param4, boolean param5, long param6, boolean param7, boolean param8, int param9, int param10, int param11, int param12, int param13, int param14, boolean param15, int param16, boolean param17, long param18, long param19, int param20, boolean param21, int param22, long param23, long param24, long param25)
        throws PortalException, SystemException
    {
        return this.mockObject.addPasswordPolicy(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25);
    }

    public PasswordPolicy createPasswordPolicy(long param0) {
        return this.mockObject.createPasswordPolicy(param0);
    }

    public PasswordPolicy deletePasswordPolicy(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePasswordPolicy(param0);
    }

    public PasswordPolicy deletePasswordPolicy(PasswordPolicy param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePasswordPolicy(param0);
    }

    public PasswordPolicy fetchPasswordPolicy(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<PasswordPolicy> getPasswordPolicies(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPasswordPolicies(param0, param1);
    }

    public int getPasswordPoliciesCount()
        throws SystemException
    {
        return this.mockObject.getPasswordPoliciesCount();
    }

    public PasswordPolicy updatePasswordPolicy(PasswordPolicy param0)
        throws SystemException
    {
        return this.mockObject.updatePasswordPolicy(param0);
    }

    public PasswordPolicy updatePasswordPolicy(PasswordPolicy param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updatePasswordPolicy(param0, param1);
    }

    public PasswordPolicy updatePasswordPolicy(long param0, String param1, String param2, boolean param3, boolean param4, long param5, boolean param6, boolean param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, int param15, boolean param16, long param17, long param18, int param19, boolean param20, int param21, long param22, long param23, long param24)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePasswordPolicy(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24);
    }

    public void checkDefaultPasswordPolicy(long param0)
        throws PortalException, SystemException
    {
    }

    public PasswordPolicy getDefaultPasswordPolicy(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultPasswordPolicy(param0);
    }

    public PasswordPolicy getPasswordPolicyByUserId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPasswordPolicyByUserId(param0);
    }

}
