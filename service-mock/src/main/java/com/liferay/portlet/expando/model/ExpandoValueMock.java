
package com.liferay.portlet.expando.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
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
public class ExpandoValueMock
    extends MockService<ExpandoValue>
    implements ExpandoValue
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.expando.model.ExpandoValue.class));
    }

    public boolean getBoolean()
        throws PortalException, SystemException
    {
        return this.mockObject.getBoolean();
    }

    public short getShort()
        throws PortalException, SystemException
    {
        return this.mockObject.getShort();
    }

    public long getLong()
        throws PortalException, SystemException
    {
        return this.mockObject.getLong();
    }

    public float getFloat()
        throws PortalException, SystemException
    {
        return this.mockObject.getFloat();
    }

    public double getDouble()
        throws PortalException, SystemException
    {
        return this.mockObject.getDouble();
    }

    public void setBoolean(boolean param0)
        throws PortalException, SystemException
    {
    }

    public void setDouble(double param0)
        throws PortalException, SystemException
    {
    }

    public void setFloat(float param0)
        throws PortalException, SystemException
    {
    }

    public void setLong(long param0)
        throws PortalException, SystemException
    {
    }

    public void setShort(short param0)
        throws PortalException, SystemException
    {
    }

    public int getInteger()
        throws PortalException, SystemException
    {
        return this.mockObject.getInteger();
    }

    public Number getNumber()
        throws PortalException, SystemException
    {
        return this.mockObject.getNumber();
    }

    public List<Locale> getAvailableLocales()
        throws PortalException, SystemException
    {
        return this.mockObject.getAvailableLocales();
    }

    public String getString(Locale param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getString(param0);
    }

    public String getString()
        throws PortalException, SystemException
    {
        return this.mockObject.getString();
    }

    public Date getDate()
        throws PortalException, SystemException
    {
        return this.mockObject.getDate();
    }

    public String[] getStringArray(Locale param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getStringArray(param0);
    }

    public String[] getStringArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getStringArray();
    }

    public ExpandoColumn getColumn()
        throws PortalException, SystemException
    {
        return this.mockObject.getColumn();
    }

    public Locale getDefaultLocale()
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultLocale();
    }

    public boolean[] getBooleanArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getBooleanArray();
    }

    public Date[] getDateArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getDateArray();
    }

    public double[] getDoubleArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getDoubleArray();
    }

    public float[] getFloatArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getFloatArray();
    }

    public int[] getIntegerArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getIntegerArray();
    }

    public long[] getLongArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getLongArray();
    }

    public Number[] getNumberArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getNumberArray();
    }

    public short[] getShortArray()
        throws PortalException, SystemException
    {
        return this.mockObject.getShortArray();
    }

    public Map<Locale, String[]> getStringArrayMap()
        throws PortalException, SystemException
    {
        return this.mockObject.getStringArrayMap();
    }

    public Map<Locale, String> getStringMap()
        throws PortalException, SystemException
    {
        return this.mockObject.getStringMap();
    }

    public void setBooleanArray(boolean[] param0)
        throws PortalException, SystemException
    {
    }

    public void setColumn(ExpandoColumn param0) {
    }

    public void setDateArray(Date[] param0)
        throws PortalException, SystemException
    {
    }

    public void setDoubleArray(double[] param0)
        throws PortalException, SystemException
    {
    }

    public void setFloatArray(float[] param0)
        throws PortalException, SystemException
    {
    }

    public void setInteger(int param0)
        throws PortalException, SystemException
    {
    }

    public void setIntegerArray(int[] param0)
        throws PortalException, SystemException
    {
    }

    public void setLongArray(long[] param0)
        throws PortalException, SystemException
    {
    }

    public void setNumberArray(Number[] param0)
        throws PortalException, SystemException
    {
    }

    public void setShortArray(short[] param0)
        throws PortalException, SystemException
    {
    }

    public void setString(String param0, Locale param1, Locale param2)
        throws PortalException, SystemException
    {
    }

    public void setString(String param0)
        throws PortalException, SystemException
    {
    }

    public void setStringArray(String[] param0, Locale param1, Locale param2)
        throws PortalException, SystemException
    {
    }

    public void setStringArray(String[] param0)
        throws PortalException, SystemException
    {
    }

    public void setStringArrayMap(Map<Locale, String[]> param0, Locale param1)
        throws PortalException, SystemException
    {
    }

    public void setStringMap(Map<Locale, String> param0, Locale param1)
        throws PortalException, SystemException
    {
    }

    public void setDate(Date param0)
        throws PortalException, SystemException
    {
    }

    public Serializable getSerializable()
        throws PortalException, SystemException
    {
        return this.mockObject.getSerializable();
    }

    public void setNumber(Number param0)
        throws PortalException, SystemException
    {
    }

    public String toString() {
        return this.mockObject.toString();
    }

    public int hashCode() {
        return this.mockObject.hashCode();
    }

    public Object clone() {
        return this.mockObject.clone();
    }

    public int compareTo(ExpandoValue param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getClassName() {
        return this.mockObject.getClassName();
    }

    public String getData() {
        return this.mockObject.getData();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public boolean isCachedModel() {
        return this.mockObject.isCachedModel();
    }

    public void setCachedModel(boolean param0) {
    }

    public boolean isEscapedModel() {
        return this.mockObject.isEscapedModel();
    }

    public void setPrimaryKey(long param0) {
    }

    public ExpandoBridge getExpandoBridge() {
        return this.mockObject.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public ExpandoValue toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public Serializable getPrimaryKeyObj() {
        return this.mockObject.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(Serializable param0) {
    }

    public boolean isNew() {
        return this.mockObject.isNew();
    }

    public void setNew(boolean param0) {
    }

    public CacheModel<ExpandoValue> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public long getClassPK() {
        return this.mockObject.getClassPK();
    }

    public void setTableId(long param0) {
    }

    public long getColumnId() {
        return this.mockObject.getColumnId();
    }

    public void setColumnId(long param0) {
    }

    public long getTableId() {
        return this.mockObject.getTableId();
    }

    public void setRowId(long param0) {
    }

    public long getRowId() {
        return this.mockObject.getRowId();
    }

    public void setValueId(long param0) {
    }

    public long getValueId() {
        return this.mockObject.getValueId();
    }

    public void setData(String param0) {
    }

    public void setClassNameId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public ExpandoValue toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public void setClassName(String param0) {
    }

    public void setClassPK(long param0) {
    }

    public void setCompanyId(long param0) {
    }

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public void resetOriginalValues() {
    }

    public Map<String, Object> getModelAttributes() {
        return this.mockObject.getModelAttributes();
    }

    public void setModelAttributes(Map<String, Object> param0) {
    }

    public Class<?> getModelClass() {
        return this.mockObject.getModelClass();
    }

    public String getModelClassName() {
        return this.mockObject.getModelClassName();
    }

    public void persist()
        throws SystemException
    {
    }

}
