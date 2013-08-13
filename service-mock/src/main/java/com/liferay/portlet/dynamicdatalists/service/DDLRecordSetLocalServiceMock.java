
package com.liferay.portlet.dynamicdatalists.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatalists.model.DDLRecordSet;

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
public class DDLRecordSetLocalServiceMock
    extends MockService<DDLRecordSetLocalService>
    implements DDLRecordSetLocalService
{

    private HashMap<Long, DDLRecordSet> _serviceObjects = new HashMap<Long, DDLRecordSet>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalService.class));
    }

    public List<DDLRecordSet> search(long param0, long param1, String param2, int param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<DDLRecordSet> search(long param0, long param1, String param2, String param3, int param4, boolean param5, int param6, int param7, OrderByComparator param8)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8);
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

    public int searchCount(long param0, long param1, String param2, int param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public int searchCount(long param0, long param1, String param2, String param3, int param4, boolean param5)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5);
    }

    public DDLRecordSet getRecordSet(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecordSet(param0);
    }

    public DDLRecordSet getRecordSet(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecordSet(param0, param1);
    }

    public DDLRecordSet addDDLRecordSet(DDLRecordSet param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DDLRecordSet createDDLRecordSet(long param0) {
        return this.mockObject.createDDLRecordSet(param0);
    }

    public DDLRecordSet deleteDDLRecordSet(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDDLRecordSet(param0);
    }

    public DDLRecordSet deleteDDLRecordSet(DDLRecordSet param0)
        throws SystemException
    {
        return this.mockObject.deleteDDLRecordSet(param0);
    }

    public DDLRecordSet fetchDDLRecordSet(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDLRecordSet getDDLRecordSet(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDLRecordSet getDDLRecordSetByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDDLRecordSetByUuidAndGroupId(param0, param1);
    }

    public List<DDLRecordSet> getDDLRecordSets(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDDLRecordSets(param0, param1);
    }

    public int getDDLRecordSetsCount()
        throws SystemException
    {
        return this.mockObject.getDDLRecordSetsCount();
    }

    public DDLRecordSet updateDDLRecordSet(DDLRecordSet param0)
        throws SystemException
    {
        return this.mockObject.updateDDLRecordSet(param0);
    }

    public DDLRecordSet updateDDLRecordSet(DDLRecordSet param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDDLRecordSet(param0, param1);
    }

    public DDLRecordSet addRecordSet(long param0, long param1, long param2, String param3, Map<Locale, String> param4, Map<Locale, String> param5, int param6, int param7, ServiceContext param8)
        throws PortalException, SystemException
    {
        return this.mockObject.addRecordSet(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public void addRecordSetResources(DDLRecordSet param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addRecordSetResources(DDLRecordSet param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteRecordSet(DDLRecordSet param0)
        throws PortalException, SystemException
    {
    }

    public void deleteRecordSet(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteRecordSet(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void deleteRecordSets(long param0)
        throws PortalException, SystemException
    {
    }

    public DDLRecordSet fetchRecordSet(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchRecordSet(param0, param1);
    }

    public List<DDLRecordSet> getRecordSets(long param0)
        throws SystemException
    {
        return this.mockObject.getRecordSets(param0);
    }

    public int getRecordSetsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRecordSetsCount(param0);
    }

    public DDLRecordSet updateMinDisplayRows(long param0, int param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateMinDisplayRows(param0, param1, param2);
    }

    public DDLRecordSet updateRecordSet(long param0, long param1, Map<Locale, String> param2, Map<Locale, String> param3, int param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRecordSet(param0, param1, param2, param3, param4, param5);
    }

    public DDLRecordSet updateRecordSet(long param0, long param1, String param2, Map<Locale, String> param3, Map<Locale, String> param4, int param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRecordSet(param0, param1, param2, param3, param4, param5, param6);
    }

}
