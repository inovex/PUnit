
package com.liferay.portlet.journal.service;

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
import com.liferay.portlet.journal.model.JournalStructure;

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
public class JournalStructureLocalServiceMock
    extends MockService<JournalStructureLocalService>
    implements JournalStructureLocalService
{

    private HashMap<Long, JournalStructure> _serviceObjects = new HashMap<Long, JournalStructure>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalStructureLocalService.class));
    }

    public List<JournalStructure> search(long param0, long[] param1, String param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public List<JournalStructure> search(long param0, long[] param1, String param2, String param3, String param4, boolean param5, int param6, int param7, OrderByComparator param8)
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

    public int searchCount(long param0, long[] param1, String param2)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2);
    }

    public int searchCount(long param0, long[] param1, String param2, String param3, String param4, boolean param5)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5);
    }

    public JournalStructure getStructure(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getStructure(param0);
    }

    public JournalStructure getStructure(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getStructure(param0, param1);
    }

    public JournalStructure getStructure(long param0, String param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getStructure(param0, param1, param2);
    }

    public JournalStructure addStructure(long param0, long param1, String param2, boolean param3, String param4, Map<Locale, String> param5, Map<Locale, String> param6, String param7, ServiceContext param8)
        throws PortalException, SystemException
    {
        return this.mockObject.addStructure(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public void addStructureResources(JournalStructure param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addStructureResources(JournalStructure param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addStructureResources(long param0, String param1, boolean param2, boolean param3)
        throws PortalException, SystemException
    {
    }

    public void addStructureResources(long param0, String param1, String[] param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public JournalStructure copyStructure(long param0, long param1, String param2, String param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.copyStructure(param0, param1, param2, param3, param4);
    }

    public void deleteStructure(JournalStructure param0)
        throws PortalException, SystemException
    {
    }

    public void deleteStructure(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void deleteStructures(long param0)
        throws PortalException, SystemException
    {
    }

    public List<JournalStructure> getStructures()
        throws SystemException
    {
        return this.mockObject.getStructures();
    }

    public List<JournalStructure> getStructures(long param0)
        throws SystemException
    {
        return this.mockObject.getStructures(param0);
    }

    public List<JournalStructure> getStructures(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getStructures(param0, param1, param2);
    }

    public int getStructuresCount(long param0)
        throws SystemException
    {
        return this.mockObject.getStructuresCount(param0);
    }

    public JournalStructure updateStructure(long param0, String param1, String param2, Map<Locale, String> param3, Map<Locale, String> param4, String param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStructure(param0, param1, param2, param3, param4, param5, param6);
    }

    public void checkNewLine(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public JournalStructure addJournalStructure(JournalStructure param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalStructure createJournalStructure(long param0) {
        return this.mockObject.createJournalStructure(param0);
    }

    public JournalStructure deleteJournalStructure(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalStructure(param0);
    }

    public JournalStructure deleteJournalStructure(JournalStructure param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalStructure(param0);
    }

    public JournalStructure fetchJournalStructure(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalStructure getJournalStructure(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalStructure getJournalStructureByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalStructureByUuidAndGroupId(param0, param1);
    }

    public List<JournalStructure> getJournalStructures(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalStructures(param0, param1);
    }

    public int getJournalStructuresCount()
        throws SystemException
    {
        return this.mockObject.getJournalStructuresCount();
    }

    public JournalStructure updateJournalStructure(JournalStructure param0)
        throws SystemException
    {
        return this.mockObject.updateJournalStructure(param0);
    }

    public JournalStructure updateJournalStructure(JournalStructure param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateJournalStructure(param0, param1);
    }

}
