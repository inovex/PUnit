
package com.liferay.portlet.expando.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.expando.model.ExpandoRow;

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
public class ExpandoRowLocalServiceMock
    extends MockService<ExpandoRowLocalService>
    implements ExpandoRowLocalService
{

    private HashMap<Long, ExpandoRow> _serviceObjects = new HashMap<Long, ExpandoRow>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.expando.service.ExpandoRowLocalService.class));
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

    public ExpandoRow addExpandoRow(ExpandoRow param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ExpandoRow createExpandoRow(long param0) {
        return this.mockObject.createExpandoRow(param0);
    }

    public ExpandoRow deleteExpandoRow(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteExpandoRow(param0);
    }

    public ExpandoRow deleteExpandoRow(ExpandoRow param0)
        throws SystemException
    {
        return this.mockObject.deleteExpandoRow(param0);
    }

    public ExpandoRow fetchExpandoRow(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ExpandoRow getExpandoRow(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ExpandoRow> getExpandoRows(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getExpandoRows(param0, param1);
    }

    public int getExpandoRowsCount()
        throws SystemException
    {
        return this.mockObject.getExpandoRowsCount();
    }

    public ExpandoRow updateExpandoRow(ExpandoRow param0)
        throws SystemException
    {
        return this.mockObject.updateExpandoRow(param0);
    }

    public ExpandoRow updateExpandoRow(ExpandoRow param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateExpandoRow(param0, param1);
    }

    public ExpandoRow addRow(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addRow(param0, param1);
    }

    public void deleteRow(ExpandoRow param0)
        throws SystemException
    {
    }

    public void deleteRow(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteRow(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteRow(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
    }

    public void deleteRow(long param0, String param1, String param2, long param3)
        throws PortalException, SystemException
    {
    }

    public List<ExpandoRow> getDefaultTableRows(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getDefaultTableRows(param0, param1, param2, param3);
    }

    public List<ExpandoRow> getDefaultTableRows(long param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getDefaultTableRows(param0, param1, param2, param3);
    }

    public int getDefaultTableRowsCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getDefaultTableRowsCount(param0, param1);
    }

    public int getDefaultTableRowsCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getDefaultTableRowsCount(param0, param1);
    }

    public ExpandoRow getRow(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRow(param0);
    }

    public ExpandoRow getRow(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getRow(param0, param1);
    }

    public ExpandoRow getRow(long param0, long param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getRow(param0, param1, param2, param3);
    }

    public ExpandoRow getRow(long param0, String param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getRow(param0, param1, param2, param3);
    }

    public List<ExpandoRow> getRows(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRows(param0, param1, param2);
    }

    public List<ExpandoRow> getRows(long param0, long param1, String param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getRows(param0, param1, param2, param3, param4);
    }

    public List<ExpandoRow> getRows(long param0, String param1, String param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getRows(param0, param1, param2, param3, param4);
    }

    public List<ExpandoRow> getRows(String param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getRows(param0, param1, param2, param3);
    }

    public int getRowsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRowsCount(param0);
    }

    public int getRowsCount(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getRowsCount(param0, param1, param2);
    }

    public int getRowsCount(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getRowsCount(param0, param1, param2);
    }

    public int getRowsCount(String param0, String param1)
        throws SystemException
    {
        return this.mockObject.getRowsCount(param0, param1);
    }

}
