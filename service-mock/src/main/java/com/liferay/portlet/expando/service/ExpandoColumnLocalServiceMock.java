
package com.liferay.portlet.expando.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.expando.model.ExpandoColumn;
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
public class ExpandoColumnLocalServiceMock
    extends MockService<ExpandoColumnLocalService>
    implements ExpandoColumnLocalService
{

    private HashMap<Long, ExpandoColumn> _serviceObjects = new HashMap<Long, ExpandoColumn>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.expando.service.ExpandoColumnLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public ExpandoColumn updateExpandoColumn(ExpandoColumn param0)
        throws SystemException
    {
        return this.mockObject.updateExpandoColumn(param0);
    }

    public void deleteColumns(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void deleteColumns(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void deleteColumns(long param0)
        throws SystemException
    {
    }

    public ExpandoColumn getColumn(long param0, String param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.getColumn(param0, param1, param2, param3);
    }

    public ExpandoColumn getColumn(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getColumn(param0, param1);
    }

    public ExpandoColumn getColumn(long param0, long param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.getColumn(param0, param1, param2, param3);
    }

    public ExpandoColumn getColumn(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getColumn(param0);
    }

    public List<ExpandoColumn> getColumns(long param0)
        throws SystemException
    {
        return this.mockObject.getColumns(param0);
    }

    public List<ExpandoColumn> getColumns(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getColumns(param0, param1, param2);
    }

    public List<ExpandoColumn> getColumns(long param0, Collection<String> param1)
        throws SystemException
    {
        return this.mockObject.getColumns(param0, param1);
    }

    public List<ExpandoColumn> getColumns(long param0, long param1, String param2, Collection<String> param3)
        throws SystemException
    {
        return this.mockObject.getColumns(param0, param1, param2, param3);
    }

    public List<ExpandoColumn> getColumns(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getColumns(param0, param1, param2);
    }

    public List<ExpandoColumn> getColumns(long param0, String param1, String param2, Collection<String> param3)
        throws SystemException
    {
        return this.mockObject.getColumns(param0, param1, param2, param3);
    }

    public int getColumnsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getColumnsCount(param0);
    }

    public int getColumnsCount(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getColumnsCount(param0, param1, param2);
    }

    public int getColumnsCount(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getColumnsCount(param0, param1, param2);
    }

    public ExpandoColumn getDefaultTableColumn(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumn(param0, param1, param2);
    }

    public ExpandoColumn getDefaultTableColumn(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumn(param0, param1, param2);
    }

    public List<ExpandoColumn> getDefaultTableColumns(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumns(param0, param1);
    }

    public List<ExpandoColumn> getDefaultTableColumns(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumns(param0, param1);
    }

    public int getDefaultTableColumnsCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumnsCount(param0, param1);
    }

    public int getDefaultTableColumnsCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumnsCount(param0, param1);
    }

    public ExpandoColumn updateColumn(long param0, String param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateColumn(param0, param1, param2);
    }

    public ExpandoColumn updateColumn(long param0, String param1, int param2, Object param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateColumn(param0, param1, param2, param3);
    }

    public ExpandoColumn updateTypeSettings(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTypeSettings(param0, param1);
    }

    public ExpandoColumn addColumn(long param0, String param1, int param2, Object param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addColumn(param0, param1, param2, param3);
    }

    public ExpandoColumn addColumn(long param0, String param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.addColumn(param0, param1, param2);
    }

    public ExpandoColumn addExpandoColumn(ExpandoColumn param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ExpandoColumn createExpandoColumn(long param0) {
        return this.mockObject.createExpandoColumn(param0);
    }

    public ExpandoColumn deleteExpandoColumn(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteExpandoColumn(param0);
    }

    public ExpandoColumn deleteExpandoColumn(ExpandoColumn param0)
        throws SystemException
    {
        return this.mockObject.deleteExpandoColumn(param0);
    }

    public ExpandoColumn fetchExpandoColumn(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ExpandoColumn getExpandoColumn(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ExpandoColumn> getExpandoColumns(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getExpandoColumns(param0, param1);
    }

    public int getExpandoColumnsCount()
        throws SystemException
    {
        return this.mockObject.getExpandoColumnsCount();
    }

    public void deleteColumn(long param0, String param1, String param2, String param3)
        throws PortalException, SystemException
    {
    }

    public void deleteColumn(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteColumn(long param0, String param1)
        throws SystemException
    {
    }

    public void deleteColumn(ExpandoColumn param0)
        throws SystemException
    {
    }

    public void deleteColumn(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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
