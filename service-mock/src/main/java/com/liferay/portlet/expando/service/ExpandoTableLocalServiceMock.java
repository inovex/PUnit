
package com.liferay.portlet.expando.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.expando.model.ExpandoTable;

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
public class ExpandoTableLocalServiceMock
    extends MockService<ExpandoTableLocalService>
    implements ExpandoTableLocalService
{

    private HashMap<Long, ExpandoTable> _serviceObjects = new HashMap<Long, ExpandoTable>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.expando.service.ExpandoTableLocalService.class));
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

    public ExpandoTable addExpandoTable(ExpandoTable param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ExpandoTable createExpandoTable(long param0) {
        return this.mockObject.createExpandoTable(param0);
    }

    public ExpandoTable deleteExpandoTable(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteExpandoTable(param0);
    }

    public ExpandoTable deleteExpandoTable(ExpandoTable param0)
        throws SystemException
    {
        return this.mockObject.deleteExpandoTable(param0);
    }

    public ExpandoTable fetchExpandoTable(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ExpandoTable getExpandoTable(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ExpandoTable> getExpandoTables(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getExpandoTables(param0, param1);
    }

    public int getExpandoTablesCount()
        throws SystemException
    {
        return this.mockObject.getExpandoTablesCount();
    }

    public ExpandoTable updateExpandoTable(ExpandoTable param0)
        throws SystemException
    {
        return this.mockObject.updateExpandoTable(param0);
    }

    public ExpandoTable updateExpandoTable(ExpandoTable param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateExpandoTable(param0, param1);
    }

    public ExpandoTable addDefaultTable(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addDefaultTable(param0, param1);
    }

    public ExpandoTable addDefaultTable(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addDefaultTable(param0, param1);
    }

    public ExpandoTable addTable(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.addTable(param0, param1, param2);
    }

    public ExpandoTable addTable(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addTable(param0, param1);
    }

    public ExpandoTable addTable(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.addTable(param0, param1, param2);
    }

    public ExpandoTable addTable(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addTable(param0, param1);
    }

    public void deleteTable(ExpandoTable param0)
        throws SystemException
    {
    }

    public void deleteTable(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteTable(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void deleteTable(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void deleteTables(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteTables(long param0, String param1)
        throws SystemException
    {
    }

    public ExpandoTable fetchDefaultTable(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDefaultTable(param0, param1);
    }

    public ExpandoTable fetchDefaultTable(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchDefaultTable(param0, param1);
    }

    public ExpandoTable fetchTable(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchTable(param0, param1, param2);
    }

    public ExpandoTable getDefaultTable(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultTable(param0, param1);
    }

    public ExpandoTable getDefaultTable(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultTable(param0, param1);
    }

    public ExpandoTable getTable(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTable(param0);
    }

    public ExpandoTable getTable(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getTable(param0, param1, param2);
    }

    public ExpandoTable getTable(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTable(param0, param1);
    }

    public ExpandoTable getTable(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getTable(param0, param1, param2);
    }

    public ExpandoTable getTable(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTable(param0, param1);
    }

    public List<ExpandoTable> getTables(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getTables(param0, param1);
    }

    public List<ExpandoTable> getTables(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getTables(param0, param1);
    }

    public ExpandoTable updateTable(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTable(param0, param1);
    }

}
