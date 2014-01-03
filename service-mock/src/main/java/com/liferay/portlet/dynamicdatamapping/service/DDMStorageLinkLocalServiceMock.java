
package com.liferay.portlet.dynamicdatamapping.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink;
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
public class DDMStorageLinkLocalServiceMock
    extends MockService<DDMStorageLinkLocalService>
    implements DDMStorageLinkLocalService
{

    private HashMap<Long, DDMStorageLink> _serviceObjects = new HashMap<Long, DDMStorageLink>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public DDMStorageLink getDDMStorageLink(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<DDMStorageLink> getDDMStorageLinks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDDMStorageLinks(param0, param1);
    }

    public void deleteStructureStorageLinks(long param0)
        throws SystemException
    {
    }

    public DDMStorageLink getClassStorageLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getClassStorageLink(param0);
    }

    public DDMStorageLink getStorageLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getStorageLink(param0);
    }

    public List<DDMStorageLink> getStructureStorageLinks(long param0)
        throws SystemException
    {
        return this.mockObject.getStructureStorageLinks(param0);
    }

    public int getStructureStorageLinksCount(long param0)
        throws SystemException
    {
        return this.mockObject.getStructureStorageLinksCount(param0);
    }

    public DDMStorageLink updateStorageLink(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStorageLink(param0, param1, param2);
    }

    public DDMStorageLink createDDMStorageLink(long param0) {
        return this.mockObject.createDDMStorageLink(param0);
    }

    public DDMStorageLink deleteDDMStorageLink(DDMStorageLink param0)
        throws SystemException
    {
        return this.mockObject.deleteDDMStorageLink(param0);
    }

    public DDMStorageLink deleteDDMStorageLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDDMStorageLink(param0);
    }

    public DDMStorageLink addDDMStorageLink(DDMStorageLink param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DDMStorageLink fetchDDMStorageLink(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int getDDMStorageLinksCount()
        throws SystemException
    {
        return this.mockObject.getDDMStorageLinksCount();
    }

    public DDMStorageLink updateDDMStorageLink(DDMStorageLink param0)
        throws SystemException
    {
        return this.mockObject.updateDDMStorageLink(param0);
    }

    public DDMStorageLink addStorageLink(long param0, long param1, long param2, ServiceContext param3)
        throws SystemException
    {
        return this.mockObject.addStorageLink(param0, param1, param2, param3);
    }

    public void deleteClassStorageLink(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteStorageLink(DDMStorageLink param0)
        throws SystemException
    {
    }

    public void deleteStorageLink(long param0)
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

}
