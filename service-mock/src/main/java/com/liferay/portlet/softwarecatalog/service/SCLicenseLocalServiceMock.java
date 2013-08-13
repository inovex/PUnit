
package com.liferay.portlet.softwarecatalog.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.softwarecatalog.model.SCLicense;

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
public class SCLicenseLocalServiceMock
    extends MockService<SCLicenseLocalService>
    implements SCLicenseLocalService
{

    private HashMap<Long, SCLicense> _serviceObjects = new HashMap<Long, SCLicense>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.softwarecatalog.service.SCLicenseLocalService.class));
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

    public List<SCLicense> getLicenses()
        throws SystemException
    {
        return this.mockObject.getLicenses();
    }

    public List<SCLicense> getLicenses(boolean param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getLicenses(param0, param1);
    }

    public List<SCLicense> getLicenses(boolean param0, boolean param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getLicenses(param0, param1, param2, param3);
    }

    public List<SCLicense> getLicenses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLicenses(param0, param1);
    }

    public SCLicense addSCLicense(SCLicense param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SCLicense createSCLicense(long param0) {
        return this.mockObject.createSCLicense(param0);
    }

    public SCLicense deleteSCLicense(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSCLicense(param0);
    }

    public SCLicense deleteSCLicense(SCLicense param0)
        throws SystemException
    {
        return this.mockObject.deleteSCLicense(param0);
    }

    public SCLicense fetchSCLicense(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SCLicense getSCLicense(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SCLicense> getSCLicenses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSCLicenses(param0, param1);
    }

    public int getSCLicensesCount()
        throws SystemException
    {
        return this.mockObject.getSCLicensesCount();
    }

    public SCLicense updateSCLicense(SCLicense param0)
        throws SystemException
    {
        return this.mockObject.updateSCLicense(param0);
    }

    public SCLicense updateSCLicense(SCLicense param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateSCLicense(param0, param1);
    }

    public SCLicense addLicense(String param0, String param1, boolean param2, boolean param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addLicense(param0, param1, param2, param3, param4);
    }

    public void deleteLicense(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteLicense(SCLicense param0)
        throws SystemException
    {
    }

    public SCLicense getLicense(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLicense(param0);
    }

    public int getLicensesCount()
        throws SystemException
    {
        return this.mockObject.getLicensesCount();
    }

    public int getLicensesCount(boolean param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getLicensesCount(param0, param1);
    }

    public List<SCLicense> getProductEntryLicenses(long param0)
        throws SystemException
    {
        return this.mockObject.getProductEntryLicenses(param0);
    }

    public SCLicense updateLicense(long param0, String param1, String param2, boolean param3, boolean param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLicense(param0, param1, param2, param3, param4, param5);
    }

}
