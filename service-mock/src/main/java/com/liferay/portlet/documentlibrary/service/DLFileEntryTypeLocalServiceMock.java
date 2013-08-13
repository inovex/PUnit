
package com.liferay.portlet.documentlibrary.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileEntryType;
import com.liferay.portlet.documentlibrary.model.DLFolder;

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
public class DLFileEntryTypeLocalServiceMock
    extends MockService<DLFileEntryTypeLocalService>
    implements DLFileEntryTypeLocalService
{

    private HashMap<Long, DLFileEntryType> _serviceObjects = new HashMap<Long, DLFileEntryType>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalService.class));
    }

    public List<DLFileEntryType> search(long param0, long[] param1, String param2, boolean param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
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

    public int searchCount(long param0, long[] param1, String param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public long getDefaultFileEntryTypeId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultFileEntryTypeId(param0);
    }

    public DLFileEntryType getFileEntryType(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileEntryType(param0);
    }

    public DLFileEntryType getFileEntryType(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileEntryType(param0, param1);
    }

    public DLFileEntryType addDLFileEntryType(DLFileEntryType param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DLFileEntryType createDLFileEntryType(long param0) {
        return this.mockObject.createDLFileEntryType(param0);
    }

    public DLFileEntryType deleteDLFileEntryType(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLFileEntryType(param0);
    }

    public DLFileEntryType deleteDLFileEntryType(DLFileEntryType param0)
        throws SystemException
    {
        return this.mockObject.deleteDLFileEntryType(param0);
    }

    public DLFileEntryType fetchDLFileEntryType(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileEntryType getDLFileEntryType(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileEntryType getDLFileEntryTypeByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFileEntryTypeByUuidAndGroupId(param0, param1);
    }

    public List<DLFileEntryType> getDLFileEntryTypes(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLFileEntryTypes(param0, param1);
    }

    public int getDLFileEntryTypesCount()
        throws SystemException
    {
        return this.mockObject.getDLFileEntryTypesCount();
    }

    public DLFileEntryType updateDLFileEntryType(DLFileEntryType param0)
        throws SystemException
    {
        return this.mockObject.updateDLFileEntryType(param0);
    }

    public DLFileEntryType updateDLFileEntryType(DLFileEntryType param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDLFileEntryType(param0, param1);
    }

    public DLFileEntryType addFileEntryType(long param0, long param1, String param2, String param3, long[] param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addFileEntryType(param0, param1, param2, param3, param4, param5);
    }

    public void cascadeFileEntryTypes(long param0, DLFolder param1)
        throws PortalException, SystemException
    {
    }

    public void deleteFileEntryType(DLFileEntryType param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFileEntryType(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFileEntryTypes(long param0)
        throws PortalException, SystemException
    {
    }

    public DLFileEntryType fetchFileEntryType(long param0)
        throws SystemException
    {
        return this.mockObject.fetchFileEntryType(param0);
    }

    public List<DLFileEntryType> getFileEntryTypes(long[] param0)
        throws SystemException
    {
        return this.mockObject.getFileEntryTypes(param0);
    }

    public List<DLFileEntryType> getFolderFileEntryTypes(long[] param0, long param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFolderFileEntryTypes(param0, param1, param2);
    }

    public void unsetFolderFileEntryTypes(long param0)
        throws SystemException
    {
    }

    public DLFileEntry updateFileEntryFileEntryType(DLFileEntry param0, ServiceContext param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFileEntryFileEntryType(param0, param1);
    }

    public void updateFileEntryType(long param0, long param1, String param2, String param3, long[] param4, ServiceContext param5)
        throws PortalException, SystemException
    {
    }

    public void updateFolderFileEntryTypes(DLFolder param0, List<Long> param1, long param2, ServiceContext param3)
        throws PortalException, SystemException
    {
    }

}
