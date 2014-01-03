
package com.liferay.portlet.dynamicdatamapping.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
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
public class DDMStructureLocalServiceMock
    extends MockService<DDMStructureLocalService>
    implements DDMStructureLocalService
{

    private HashMap<Long, DDMStructure> _serviceObjects = new HashMap<Long, DDMStructure>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalService.class));
    }

    public List<DDMStructure> search(long param0, long[] param1, long[] param2, String param3, String param4, String param5, int param6, boolean param7, int param8, int param9, OrderByComparator param10)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public List<DDMStructure> search(long param0, long[] param1, long[] param2, String param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<DDMStructure> getDDMStructures(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDDMStructures(param0, param1);
    }

    public DDMStructure getDDMStructure(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int searchCount(long param0, long[] param1, long[] param2, String param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public int searchCount(long param0, long[] param1, long[] param2, String param3, String param4, String param5, int param6, boolean param7)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public DDMStructure updateXSD(long param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateXSD(param0, param1, param2);
    }

    public DDMStructure getStructure(long param0, long param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getStructure(param0, param1, param2, param3);
    }

    public DDMStructure getStructure(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getStructure(param0);
    }

    public List<DDMStructure> getStructure(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getStructure(param0, param1, param2);
    }

    public DDMStructure getStructure(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getStructure(param0, param1, param2);
    }

    public DDMStructure deleteDDMStructure(DDMStructure param0)
        throws SystemException
    {
        return this.mockObject.deleteDDMStructure(param0);
    }

    public DDMStructure deleteDDMStructure(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDDMStructure(param0);
    }

    public DDMStructure fetchDDMStructure(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDMStructure fetchDDMStructureByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDDMStructureByUuidAndCompanyId(param0, param1);
    }

    public DDMStructure addDDMStructure(DDMStructure param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DDMStructure createDDMStructure(long param0) {
        return this.mockObject.createDDMStructure(param0);
    }

    public DDMStructure fetchDDMStructureByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDDMStructureByUuidAndGroupId(param0, param1);
    }

    public DDMStructure getDDMStructureByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDDMStructureByUuidAndCompanyId(param0, param1);
    }

    public DDMStructure getDDMStructureByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDDMStructureByUuidAndGroupId(param0, param1);
    }

    public int getDDMStructuresCount()
        throws SystemException
    {
        return this.mockObject.getDDMStructuresCount();
    }

    public DDMStructure updateDDMStructure(DDMStructure param0)
        throws SystemException
    {
        return this.mockObject.updateDDMStructure(param0);
    }

    public void addDLFileEntryTypeDDMStructure(long param0, DDMStructure param1)
        throws SystemException
    {
    }

    public void addDLFileEntryTypeDDMStructure(long param0, long param1)
        throws SystemException
    {
    }

    public void addDLFileEntryTypeDDMStructures(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addDLFileEntryTypeDDMStructures(long param0, List<DDMStructure> param1)
        throws SystemException
    {
    }

    public void clearDLFileEntryTypeDDMStructures(long param0)
        throws SystemException
    {
    }

    public void deleteDLFileEntryTypeDDMStructure(long param0, DDMStructure param1)
        throws SystemException
    {
    }

    public void deleteDLFileEntryTypeDDMStructure(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteDLFileEntryTypeDDMStructures(long param0, List<DDMStructure> param1)
        throws SystemException
    {
    }

    public void deleteDLFileEntryTypeDDMStructures(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<DDMStructure> getDLFileEntryTypeDDMStructures(long param0)
        throws SystemException
    {
        return this.mockObject.getDLFileEntryTypeDDMStructures(param0);
    }

    public List<DDMStructure> getDLFileEntryTypeDDMStructures(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getDLFileEntryTypeDDMStructures(param0, param1, param2, param3);
    }

    public List<DDMStructure> getDLFileEntryTypeDDMStructures(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getDLFileEntryTypeDDMStructures(param0, param1, param2);
    }

    public int getDLFileEntryTypeDDMStructuresCount(long param0)
        throws SystemException
    {
        return this.mockObject.getDLFileEntryTypeDDMStructuresCount(param0);
    }

    public boolean hasDLFileEntryTypeDDMStructure(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasDLFileEntryTypeDDMStructure(param0, param1);
    }

    public boolean hasDLFileEntryTypeDDMStructures(long param0)
        throws SystemException
    {
        return this.mockObject.hasDLFileEntryTypeDDMStructures(param0);
    }

    public void setDLFileEntryTypeDDMStructures(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addStructureResources(DDMStructure param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addStructureResources(DDMStructure param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public DDMStructure copyStructure(long param0, long param1, Map<Locale, String> param2, Map<Locale, String> param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.copyStructure(param0, param1, param2, param3, param4);
    }

    public DDMStructure copyStructure(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.copyStructure(param0, param1, param2);
    }

    public void deleteStructure(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteStructure(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void deleteStructure(DDMStructure param0)
        throws PortalException, SystemException
    {
    }

    public void deleteStructures(long param0)
        throws PortalException, SystemException
    {
    }

    public DDMStructure addStructure(long param0, long param1, long param2, long param3, String param4, Map<Locale, String> param5, Map<Locale, String> param6, String param7, String param8, int param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.addStructure(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public DDMStructure addStructure(long param0, long param1, long param2, Map<Locale, String> param3, Map<Locale, String> param4, String param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addStructure(param0, param1, param2, param3, param4, param5, param6);
    }

    public DDMStructure addStructure(long param0, long param1, String param2, long param3, String param4, Map<Locale, String> param5, Map<Locale, String> param6, String param7, String param8, int param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.addStructure(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public DDMStructure updateStructure(long param0, long param1, long param2, String param3, Map<Locale, String> param4, Map<Locale, String> param5, String param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStructure(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public DDMStructure updateStructure(long param0, long param1, Map<Locale, String> param2, Map<Locale, String> param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStructure(param0, param1, param2, param3, param4, param5);
    }

    public DDMStructure fetchStructure(long param0, long param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.fetchStructure(param0, param1, param2, param3);
    }

    public DDMStructure fetchStructure(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchStructure(param0, param1, param2);
    }

    public DDMStructure fetchStructure(long param0)
        throws SystemException
    {
        return this.mockObject.fetchStructure(param0);
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

    public List<DDMStructure> getClassStructures(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getClassStructures(param0, param1, param2);
    }

    public List<DDMStructure> getClassStructures(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getClassStructures(param0, param1);
    }

    public List<DDMStructure> getClassStructures(long param0)
        throws SystemException
    {
        return this.mockObject.getClassStructures(param0);
    }

    public List<DDMStructure> getClassStructures(long param0, long param1, OrderByComparator param2)
        throws SystemException
    {
        return this.mockObject.getClassStructures(param0, param1, param2);
    }

    public List<DDMStructure> getClassStructures(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getClassStructures(param0, param1, param2, param3);
    }

    public List<DDMStructure> getClassStructures(long param0, OrderByComparator param1)
        throws SystemException
    {
        return this.mockObject.getClassStructures(param0, param1);
    }

    public List<DDMStructure> getDLFileEntryTypeStructures(long param0)
        throws SystemException
    {
        return this.mockObject.getDLFileEntryTypeStructures(param0);
    }

    public List<DDMStructure> getStructureEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getStructureEntries(param0, param1, param2);
    }

    public List<DDMStructure> getStructureEntries(long param0)
        throws SystemException
    {
        return this.mockObject.getStructureEntries(param0);
    }

    public List<DDMStructure> getStructureEntries()
        throws SystemException
    {
        return this.mockObject.getStructureEntries();
    }

    public List<DDMStructure> getStructures(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1, param2);
    }

    public List<DDMStructure> getStructures(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1);
    }

    public List<DDMStructure> getStructures()
        throws SystemException
    {
        return this.mockObject.getStructures();
    }

    public List<DDMStructure> getStructures(long param0)
        throws SystemException
    {
        return this.mockObject.getStructures(param0);
    }

    public List<DDMStructure> getStructures(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1, param2, param3, param4);
    }

    public List<DDMStructure> getStructures(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1, param2);
    }

    public List<DDMStructure> getStructures(long[] param0)
        throws SystemException
    {
        return this.mockObject.getStructures(param0);
    }

    public List<DDMStructure> getStructures(long[] param0, long param1)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1);
    }

    public List<DDMStructure> getStructures(long[] param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1, param2, param3);
    }

    public List<DDMStructure> getStructures(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1, param2, param3);
    }

    public int getStructuresCount(long param0)
        throws SystemException
    {
        return this.mockObject.getStructuresCount(param0);
    }

    public int getStructuresCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getStructuresCount(param0, param1);
    }

    public int getStructuresCount(long[] param0, long param1)
        throws SystemException
    {
        return this.mockObject.getStructuresCount(param0, param1);
    }

    public void updateXSDFieldMetadata(long param0, String param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
    }

}
