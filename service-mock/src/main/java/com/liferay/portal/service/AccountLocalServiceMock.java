
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Account;
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
public class AccountLocalServiceMock
    extends MockService<AccountLocalService>
    implements AccountLocalService
{

    private HashMap<Long, Account> _serviceObjects = new HashMap<Long, Account>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.AccountLocalService.class));
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

    public Account addAccount(Account param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Account createAccount(long param0) {
        return this.mockObject.createAccount(param0);
    }

    public Account deleteAccount(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAccount(param0);
    }

    public Account deleteAccount(Account param0)
        throws SystemException
    {
        return this.mockObject.deleteAccount(param0);
    }

    public Account fetchAccount(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Account getAccount(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Account getAccount(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getAccount(param0, param1);
    }

    public List<Account> getAccounts(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAccounts(param0, param1);
    }

    public int getAccountsCount()
        throws SystemException
    {
        return this.mockObject.getAccountsCount();
    }

    public Account updateAccount(Account param0)
        throws SystemException
    {
        return this.mockObject.updateAccount(param0);
    }

    public Account updateAccount(Account param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateAccount(param0, param1);
    }

}
