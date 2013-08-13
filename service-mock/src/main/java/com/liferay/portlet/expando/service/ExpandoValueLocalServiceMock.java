
package com.liferay.portlet.expando.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.model.ExpandoValue;

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
public class ExpandoValueLocalServiceMock
    extends MockService<ExpandoValueLocalService>
    implements ExpandoValueLocalService
{

    private HashMap<Long, ExpandoValue> _serviceObjects = new HashMap<Long, ExpandoValue>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.expando.service.ExpandoValueLocalService.class));
    }

    public ExpandoValue getValue(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getValue(param0);
    }

    public ExpandoValue getValue(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getValue(param0, param1);
    }

    public ExpandoValue getValue(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getValue(param0, param1, param2);
    }

    public ExpandoValue getValue(long param0, long param1, String param2, String param3, long param4)
        throws SystemException
    {
        return this.mockObject.getValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue getValue(long param0, String param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getValue(param0, param1, param2, param3);
    }

    public ExpandoValue getValue(long param0, String param1, String param2, String param3, long param4)
        throws SystemException
    {
        return this.mockObject.getValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue getValue(String param0, String param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getValue(param0, param1, param2, param3);
    }

    public Map<String, Serializable> getData(long param0, String param1, String param2, Collection<String> param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public Serializable getData(long param0, String param1, String param2, String param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public boolean getData(long param0, String param1, String param2, String param3, long param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public boolean[] getData(long param0, String param1, String param2, String param3, long param4, boolean[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public Date getData(long param0, String param1, String param2, String param3, long param4, Date param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public Date[] getData(long param0, String param1, String param2, String param3, long param4, Date[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public double getData(long param0, String param1, String param2, String param3, long param4, double param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public double[] getData(long param0, String param1, String param2, String param3, long param4, double[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public float getData(long param0, String param1, String param2, String param3, long param4, float param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public float[] getData(long param0, String param1, String param2, String param3, long param4, float[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public int getData(long param0, String param1, String param2, String param3, long param4, int param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public int[] getData(long param0, String param1, String param2, String param3, long param4, int[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public long getData(long param0, String param1, String param2, String param3, long param4, long param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public long[] getData(long param0, String param1, String param2, String param3, long param4, long[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public Number getData(long param0, String param1, String param2, String param3, long param4, Number param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public Number[] getData(long param0, String param1, String param2, String param3, long param4, Number[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public short getData(long param0, String param1, String param2, String param3, long param4, short param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public short[] getData(long param0, String param1, String param2, String param3, long param4, short[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public String getData(long param0, String param1, String param2, String param3, long param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public String[] getData(long param0, String param1, String param2, String param3, long param4, String[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4, param5);
    }

    public Serializable getData(String param0, String param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3);
    }

    public boolean getData(String param0, String param1, String param2, long param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public boolean[] getData(String param0, String param1, String param2, long param3, boolean[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public Date getData(String param0, String param1, String param2, long param3, Date param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public Date[] getData(String param0, String param1, String param2, long param3, Date[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public double getData(String param0, String param1, String param2, long param3, double param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public double[] getData(String param0, String param1, String param2, long param3, double[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public float getData(String param0, String param1, String param2, long param3, float param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public float[] getData(String param0, String param1, String param2, long param3, float[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public int getData(String param0, String param1, String param2, long param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public int[] getData(String param0, String param1, String param2, long param3, int[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public long getData(String param0, String param1, String param2, long param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public long[] getData(String param0, String param1, String param2, long param3, long[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public short getData(String param0, String param1, String param2, long param3, short param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public short[] getData(String param0, String param1, String param2, long param3, short[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public String getData(String param0, String param1, String param2, long param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
    }

    public String[] getData(String param0, String param1, String param2, long param3, String[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getData(param0, param1, param2, param3, param4);
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

    public ExpandoValue getExpandoValue(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ExpandoValue addExpandoValue(ExpandoValue param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ExpandoValue createExpandoValue(long param0) {
        return this.mockObject.createExpandoValue(param0);
    }

    public ExpandoValue deleteExpandoValue(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteExpandoValue(param0);
    }

    public ExpandoValue deleteExpandoValue(ExpandoValue param0)
        throws SystemException
    {
        return this.mockObject.deleteExpandoValue(param0);
    }

    public ExpandoValue fetchExpandoValue(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ExpandoValue> getExpandoValues(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getExpandoValues(param0, param1);
    }

    public int getExpandoValuesCount()
        throws SystemException
    {
        return this.mockObject.getExpandoValuesCount();
    }

    public ExpandoValue updateExpandoValue(ExpandoValue param0)
        throws SystemException
    {
        return this.mockObject.updateExpandoValue(param0);
    }

    public ExpandoValue updateExpandoValue(ExpandoValue param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateExpandoValue(param0, param1);
    }

    public ExpandoValue addValue(long param0, long param1, long param2, long param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, boolean[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, Date param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, Date[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, double param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, double[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, float param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, float[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, int param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, int[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, long param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, long[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, Number param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, Number[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, Object param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, short param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, short[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(long param0, String param1, String param2, String param3, long param4, String[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4, param5);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, boolean[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, Date param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, Date[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, double param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, double[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, float param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, float[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, int[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, long[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, Object param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, short param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, short[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public ExpandoValue addValue(String param0, String param1, String param2, long param3, String[] param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addValue(param0, param1, param2, param3, param4);
    }

    public void addValues(long param0, long param1, List<ExpandoColumn> param2, long param3, Map<String, String> param4)
        throws PortalException, SystemException
    {
    }

    public void addValues(long param0, long param1, String param2, long param3, Map<String, Serializable> param4)
        throws PortalException, SystemException
    {
    }

    public void addValues(long param0, String param1, String param2, long param3, Map<String, Serializable> param4)
        throws PortalException, SystemException
    {
    }

    public void deleteColumnValues(long param0)
        throws SystemException
    {
    }

    public void deleteRowValues(long param0)
        throws SystemException
    {
    }

    public void deleteTableValues(long param0)
        throws SystemException
    {
    }

    public void deleteValue(ExpandoValue param0)
        throws SystemException
    {
    }

    public void deleteValue(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteValue(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteValue(long param0, long param1, String param2, String param3, long param4)
        throws PortalException, SystemException
    {
    }

    public void deleteValue(long param0, String param1, String param2, String param3, long param4)
        throws PortalException, SystemException
    {
    }

    public void deleteValues(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteValues(String param0, long param1)
        throws SystemException
    {
    }

    public List<ExpandoValue> getColumnValues(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getColumnValues(param0, param1, param2);
    }

    public List<ExpandoValue> getColumnValues(long param0, long param1, String param2, String param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getColumnValues(param0, param1, param2, param3, param4, param5);
    }

    public List<ExpandoValue> getColumnValues(long param0, long param1, String param2, String param3, String param4, int param5, int param6)
        throws SystemException
    {
        return this.mockObject.getColumnValues(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<ExpandoValue> getColumnValues(long param0, String param1, String param2, String param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getColumnValues(param0, param1, param2, param3, param4, param5);
    }

    public List<ExpandoValue> getColumnValues(long param0, String param1, String param2, String param3, String param4, int param5, int param6)
        throws SystemException
    {
        return this.mockObject.getColumnValues(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<ExpandoValue> getColumnValues(String param0, String param1, String param2, String param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getColumnValues(param0, param1, param2, param3, param4, param5);
    }

    public int getColumnValuesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getColumnValuesCount(param0);
    }

    public int getColumnValuesCount(long param0, long param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.getColumnValuesCount(param0, param1, param2, param3);
    }

    public int getColumnValuesCount(long param0, long param1, String param2, String param3, String param4)
        throws SystemException
    {
        return this.mockObject.getColumnValuesCount(param0, param1, param2, param3, param4);
    }

    public int getColumnValuesCount(long param0, String param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.getColumnValuesCount(param0, param1, param2, param3);
    }

    public int getColumnValuesCount(long param0, String param1, String param2, String param3, String param4)
        throws SystemException
    {
        return this.mockObject.getColumnValuesCount(param0, param1, param2, param3, param4);
    }

    public int getColumnValuesCount(String param0, String param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.getColumnValuesCount(param0, param1, param2, param3);
    }

    public List<ExpandoValue> getDefaultTableColumnValues(long param0, long param1, String param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumnValues(param0, param1, param2, param3, param4);
    }

    public List<ExpandoValue> getDefaultTableColumnValues(long param0, String param1, String param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumnValues(param0, param1, param2, param3, param4);
    }

    public int getDefaultTableColumnValuesCount(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumnValuesCount(param0, param1, param2);
    }

    public int getDefaultTableColumnValuesCount(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getDefaultTableColumnValuesCount(param0, param1, param2);
    }

    public List<ExpandoValue> getRowValues(long param0)
        throws SystemException
    {
        return this.mockObject.getRowValues(param0);
    }

    public List<ExpandoValue> getRowValues(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRowValues(param0, param1, param2);
    }

    public List<ExpandoValue> getRowValues(long param0, long param1, String param2, long param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getRowValues(param0, param1, param2, param3, param4, param5);
    }

    public List<ExpandoValue> getRowValues(long param0, String param1, String param2, long param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getRowValues(param0, param1, param2, param3, param4, param5);
    }

    public int getRowValuesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRowValuesCount(param0);
    }

    public int getRowValuesCount(long param0, long param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getRowValuesCount(param0, param1, param2, param3);
    }

    public int getRowValuesCount(long param0, String param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getRowValuesCount(param0, param1, param2, param3);
    }

}
