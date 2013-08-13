
package com.liferay.portlet.dynamicdatamapping.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink;

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
public class DDMStructureLinkLocalServiceMock
    extends MockService<DDMStructureLinkLocalService>
    implements DDMStructureLinkLocalService
{

    private HashMap<Long, DDMStructureLink> _serviceObjects = new HashMap<Long, DDMStructureLink>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatamapping.service.DDMStructureLinkLocalService.class));
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

    public DDMStructureLink addDDMStructureLink(DDMStructureLink param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DDMStructureLink createDDMStructureLink(long param0) {
        return this.mockObject.createDDMStructureLink(param0);
    }

    public DDMStructureLink deleteDDMStructureLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDDMStructureLink(param0);
    }

    public DDMStructureLink deleteDDMStructureLink(DDMStructureLink param0)
        throws SystemException
    {
        return this.mockObject.deleteDDMStructureLink(param0);
    }

    public DDMStructureLink fetchDDMStructureLink(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDMStructureLink getDDMStructureLink(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<DDMStructureLink> getDDMStructureLinks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDDMStructureLinks(param0, param1);
    }

    public int getDDMStructureLinksCount()
        throws SystemException
    {
        return this.mockObject.getDDMStructureLinksCount();
    }

    public DDMStructureLink updateDDMStructureLink(DDMStructureLink param0)
        throws SystemException
    {
        return this.mockObject.updateDDMStructureLink(param0);
    }

    public DDMStructureLink updateDDMStructureLink(DDMStructureLink param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDDMStructureLink(param0, param1);
    }

    public DDMStructureLink addStructureLink(long param0, long param1, long param2, ServiceContext param3)
        throws SystemException
    {
        return this.mockObject.addStructureLink(param0, param1, param2, param3);
    }

    public void deleteClassStructureLink(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteStructureLink(DDMStructureLink param0)
        throws SystemException
    {
    }

    public void deleteStructureLink(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteStructureStructureLinks(long param0)
        throws SystemException
    {
    }

    public DDMStructureLink getClassStructureLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getClassStructureLink(param0);
    }

    public List<DDMStructureLink> getClassStructureLinks(long param0)
        throws SystemException
    {
        return this.mockObject.getClassStructureLinks(param0);
    }

    public DDMStructureLink getStructureLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getStructureLink(param0);
    }

    public List<DDMStructureLink> getStructureLinks(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getStructureLinks(param0, param1, param2);
    }

    public DDMStructureLink updateStructureLink(long param0, long param1, long param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStructureLink(param0, param1, param2, param3);
    }

}
