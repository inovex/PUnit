
package com.liferay.portal.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.Company;
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
public class CompanyLocalServiceMock
    extends MockService<CompanyLocalService>
    implements CompanyLocalService
{

    private HashMap<Long, Company> _serviceObjects = new HashMap<Long, Company>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.CompanyLocalService.class));
    }

    public Hits search(long param0, long param1, String param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4);
    }

    public Hits search(long param0, long param1, String param2, long param3, String param4, String param5, int param6, int param7)
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

    public Company getCompany(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Company addCompany(Company param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Company addCompany(String param0, String param1, String param2, String param3, boolean param4, int param5, boolean param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addCompany(param0, param1, param2, param3, param4, param5, param6);
    }

    public Company createCompany(long param0) {
        return this.mockObject.createCompany(param0);
    }

    public Company deleteCompany(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteCompany(param0);
    }

    public Company deleteCompany(Company param0)
        throws SystemException
    {
        return this.mockObject.deleteCompany(param0);
    }

    public Company fetchCompany(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<Company> getCompanies(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getCompanies(param0, param1);
    }

    public List<Company> getCompanies()
        throws SystemException
    {
        return this.mockObject.getCompanies();
    }

    public List<Company> getCompanies(boolean param0)
        throws SystemException
    {
        return this.mockObject.getCompanies(param0);
    }

    public int getCompaniesCount()
        throws SystemException
    {
        return this.mockObject.getCompaniesCount();
    }

    public int getCompaniesCount(boolean param0)
        throws SystemException
    {
        return this.mockObject.getCompaniesCount(param0);
    }

    public Company updateCompany(Company param0)
        throws SystemException
    {
        return this.mockObject.updateCompany(param0);
    }

    public Company updateCompany(Company param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateCompany(param0, param1);
    }

    public Company updateCompany(long param0, String param1, String param2, int param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCompany(param0, param1, param2, param3, param4);
    }

    public Company updateCompany(long param0, String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, String param11, String param12)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCompany(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
    }

    public Company checkCompany(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.checkCompany(param0);
    }

    public Company checkCompany(String param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.checkCompany(param0, param1, param2);
    }

    public void checkCompanyKey(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteLogo(long param0)
        throws PortalException, SystemException
    {
    }

    public Company fetchCompanyById(long param0)
        throws SystemException
    {
        return this.mockObject.fetchCompanyById(param0);
    }

    public Company fetchCompanyByVirtualHost(String param0)
        throws SystemException
    {
        return this.mockObject.fetchCompanyByVirtualHost(param0);
    }

    public Company getCompanyById(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompanyById(param0);
    }

    public Company getCompanyByLogoId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompanyByLogoId(param0);
    }

    public Company getCompanyByMx(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompanyByMx(param0);
    }

    public Company getCompanyByVirtualHost(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompanyByVirtualHost(param0);
    }

    public Company getCompanyByWebId(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCompanyByWebId(param0);
    }

    public long getCompanyIdByUserId(long param0)
        throws Exception
    {
        return this.mockObject.getCompanyIdByUserId(param0);
    }

    public void removePreferences(long param0, String[] param1)
        throws SystemException
    {
    }

    public void updateDisplay(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
    }

    public Company updateLogo(long param0, byte[] param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLogo(param0, param1);
    }

    public Company updateLogo(long param0, File param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLogo(param0, param1);
    }

    public Company updateLogo(long param0, InputStream param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLogo(param0, param1);
    }

    public void updatePreferences(long param0, UnicodeProperties param1)
        throws PortalException, SystemException
    {
    }

    public void updateSecurity(long param0, String param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7)
        throws SystemException
    {
    }

}
