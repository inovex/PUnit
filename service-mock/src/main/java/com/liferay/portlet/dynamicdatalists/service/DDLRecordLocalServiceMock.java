
package com.liferay.portlet.dynamicdatalists.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordVersion;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
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
public class DDLRecordLocalServiceMock
    extends MockService<DDLRecordLocalService>
    implements DDLRecordLocalService
{

    private HashMap<Long, DDLRecord> _serviceObjects = new HashMap<Long, DDLRecord>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService.class));
    }

    public Hits search(SearchContext param0)
        throws SystemException
    {
        return this.mockObject.search(param0);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public DDLRecord getDDLRecord(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDLRecord createDDLRecord(long param0) {
        return this.mockObject.createDDLRecord(param0);
    }

    public DDLRecord deleteDDLRecord(DDLRecord param0)
        throws SystemException
    {
        return this.mockObject.deleteDDLRecord(param0);
    }

    public DDLRecord deleteDDLRecord(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDDLRecord(param0);
    }

    public DDLRecord fetchDDLRecord(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDLRecord addDDLRecord(DDLRecord param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public void deleteRecord(DDLRecord param0)
        throws PortalException, SystemException
    {
    }

    public void deleteRecord(long param0)
        throws PortalException, SystemException
    {
    }

    public DDLRecord fetchDDLRecordByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDDLRecordByUuidAndCompanyId(param0, param1);
    }

    public DDLRecord fetchDDLRecordByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDDLRecordByUuidAndGroupId(param0, param1);
    }

    public DDLRecord getDDLRecordByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDDLRecordByUuidAndCompanyId(param0, param1);
    }

    public DDLRecord getDDLRecordByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDDLRecordByUuidAndGroupId(param0, param1);
    }

    public List<DDLRecord> getDDLRecords(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDDLRecords(param0, param1);
    }

    public int getRecordVersionsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRecordVersionsCount(param0);
    }

    public void revertRecordVersion(long param0, long param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
    }

    public DDLRecord updateRecord(long param0, long param1, boolean param2, int param3, Fields param4, boolean param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRecord(param0, param1, param2, param3, param4, param5, param6);
    }

    public DDLRecord updateRecord(long param0, long param1, int param2, Map<String, Serializable> param3, boolean param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRecord(param0, param1, param2, param3, param4, param5);
    }

    public DDLRecord addRecord(long param0, long param1, long param2, int param3, Fields param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addRecord(param0, param1, param2, param3, param4, param5);
    }

    public DDLRecord addRecord(long param0, long param1, long param2, int param3, Map<String, Serializable> param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addRecord(param0, param1, param2, param3, param4, param5);
    }

    public int getDDLRecordsCount()
        throws SystemException
    {
        return this.mockObject.getDDLRecordsCount();
    }

    public DDLRecord updateDDLRecord(DDLRecord param0)
        throws SystemException
    {
        return this.mockObject.updateDDLRecord(param0);
    }

    public DDLRecord deleteRecordLocale(long param0, Locale param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteRecordLocale(param0, param1, param2);
    }

    public void deleteRecords(long param0)
        throws PortalException, SystemException
    {
    }

    public DDLRecord fetchRecord(long param0)
        throws SystemException
    {
        return this.mockObject.fetchRecord(param0);
    }

    public List<DDLRecord> getCompanyRecords(long param0, int param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getCompanyRecords(param0, param1, param2, param3, param4);
    }

    public List<DDLRecord> getCompanyRecords(long param0, int param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getCompanyRecords(param0, param1, param2, param3, param4, param5);
    }

    public int getCompanyRecordsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getCompanyRecordsCount(param0, param1);
    }

    public int getCompanyRecordsCount(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyRecordsCount(param0, param1, param2);
    }

    public DDLRecordVersion getLatestRecordVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestRecordVersion(param0);
    }

    public Long[] getMinAndMaxCompanyRecordIds(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getMinAndMaxCompanyRecordIds(param0, param1, param2);
    }

    public List<DDLRecord> getMinAndMaxCompanyRecords(long param0, int param1, int param2, long param3, long param4)
        throws SystemException
    {
        return this.mockObject.getMinAndMaxCompanyRecords(param0, param1, param2, param3, param4);
    }

    public DDLRecord getRecord(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecord(param0);
    }

    public List<DDLRecord> getRecords(long param0)
        throws SystemException
    {
        return this.mockObject.getRecords(param0);
    }

    public List<DDLRecord> getRecords(long param0, int param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getRecords(param0, param1, param2, param3, param4);
    }

    public List<DDLRecord> getRecords(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getRecords(param0, param1);
    }

    public int getRecordsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRecordsCount(param0, param1);
    }

    public DDLRecordVersion getRecordVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecordVersion(param0);
    }

    public DDLRecordVersion getRecordVersion(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecordVersion(param0, param1);
    }

    public List<DDLRecordVersion> getRecordVersions(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getRecordVersions(param0, param1, param2, param3);
    }

    public void updateAsset(long param0, DDLRecord param1, DDLRecordVersion param2, long[] param3, String[] param4, Locale param5)
        throws PortalException, SystemException
    {
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
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

    public DDLRecord updateStatus(long param0, long param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

}
