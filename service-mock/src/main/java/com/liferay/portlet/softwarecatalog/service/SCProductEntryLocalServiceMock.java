
package com.liferay.portlet.softwarecatalog.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.softwarecatalog.model.SCProductEntry;
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
public class SCProductEntryLocalServiceMock
    extends MockService<SCProductEntryLocalService>
    implements SCProductEntryLocalService
{

    private HashMap<Long, SCProductEntry> _serviceObjects = new HashMap<Long, SCProductEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.softwarecatalog.service.SCProductEntryLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public SCProductEntry addSCProductEntry(SCProductEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public List<SCProductEntry> getSCProductEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSCProductEntries(param0, param1);
    }

    public int getSCProductEntriesCount()
        throws SystemException
    {
        return this.mockObject.getSCProductEntriesCount();
    }

    public SCProductEntry updateSCProductEntry(SCProductEntry param0)
        throws SystemException
    {
        return this.mockObject.updateSCProductEntry(param0);
    }

    public void addSCLicenseSCProductEntry(long param0, long param1)
        throws SystemException
    {
    }

    public void addSCLicenseSCProductEntry(long param0, SCProductEntry param1)
        throws SystemException
    {
    }

    public void addSCLicenseSCProductEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addSCLicenseSCProductEntries(long param0, List<SCProductEntry> param1)
        throws SystemException
    {
    }

    public void clearSCLicenseSCProductEntries(long param0)
        throws SystemException
    {
    }

    public void deleteSCLicenseSCProductEntry(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteSCLicenseSCProductEntry(long param0, SCProductEntry param1)
        throws SystemException
    {
    }

    public void deleteSCLicenseSCProductEntries(long param0, List<SCProductEntry> param1)
        throws SystemException
    {
    }

    public void deleteSCLicenseSCProductEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<SCProductEntry> getSCLicenseSCProductEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getSCLicenseSCProductEntries(param0, param1, param2);
    }

    public List<SCProductEntry> getSCLicenseSCProductEntries(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getSCLicenseSCProductEntries(param0, param1, param2, param3);
    }

    public List<SCProductEntry> getSCLicenseSCProductEntries(long param0)
        throws SystemException
    {
        return this.mockObject.getSCLicenseSCProductEntries(param0);
    }

    public int getSCLicenseSCProductEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getSCLicenseSCProductEntriesCount(param0);
    }

    public boolean hasSCLicenseSCProductEntry(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasSCLicenseSCProductEntry(param0, param1);
    }

    public boolean hasSCLicenseSCProductEntries(long param0)
        throws SystemException
    {
        return this.mockObject.hasSCLicenseSCProductEntries(param0);
    }

    public void setSCLicenseSCProductEntries(long param0, long[] param1)
        throws SystemException
    {
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

    public SCProductEntry addProductEntry(long param0, String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, long[] param10, List<byte[]> param11, List<byte[]> param12, ServiceContext param13)
        throws PortalException, SystemException
    {
        return this.mockObject.addProductEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public void addProductEntryResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addProductEntryResources(SCProductEntry param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addProductEntryResources(SCProductEntry param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addProductEntryResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void deleteProductEntries(long param0)
        throws PortalException, SystemException
    {
    }

    public SCProductEntry deleteProductEntry(SCProductEntry param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteProductEntry(param0);
    }

    public SCProductEntry deleteProductEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteProductEntry(param0);
    }

    public List<SCProductEntry> getCompanyProductEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyProductEntries(param0, param1, param2);
    }

    public int getCompanyProductEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyProductEntriesCount(param0);
    }

    public List<SCProductEntry> getProductEntries(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getProductEntries(param0, param1, param2, param3, param4);
    }

    public List<SCProductEntry> getProductEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getProductEntries(param0, param1, param2);
    }

    public List<SCProductEntry> getProductEntries(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getProductEntries(param0, param1, param2, param3);
    }

    public List<SCProductEntry> getProductEntries(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getProductEntries(param0, param1, param2, param3);
    }

    public int getProductEntriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getProductEntriesCount(param0, param1);
    }

    public int getProductEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getProductEntriesCount(param0);
    }

    public SCProductEntry getProductEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getProductEntry(param0);
    }

    public String getRepositoryXML(long param0, String param1, String param2, Date param3, int param4, Properties param5)
        throws SystemException
    {
        return this.mockObject.getRepositoryXML(param0, param1, param2, param3, param4, param5);
    }

    public String getRepositoryXML(long param0, String param1, Date param2, int param3, Properties param4)
        throws SystemException
    {
        return this.mockObject.getRepositoryXML(param0, param1, param2, param3, param4);
    }

    public SCProductEntry updateProductEntry(long param0, String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, long[] param10, List<byte[]> param11, List<byte[]> param12)
        throws PortalException, SystemException
    {
        return this.mockObject.updateProductEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
    }

    public SCProductEntry createSCProductEntry(long param0) {
        return this.mockObject.createSCProductEntry(param0);
    }

    public SCProductEntry deleteSCProductEntry(SCProductEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteSCProductEntry(param0);
    }

    public SCProductEntry deleteSCProductEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSCProductEntry(param0);
    }

    public SCProductEntry fetchSCProductEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SCProductEntry getSCProductEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

}
