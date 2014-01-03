
package com.liferay.portlet.documentlibrary.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.documentlibrary.model.DLFileVersion;
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
public class DLFileVersionLocalServiceMock
    extends MockService<DLFileVersionLocalService>
    implements DLFileVersionLocalService
{

    private HashMap<Long, DLFileVersion> _serviceObjects = new HashMap<Long, DLFileVersion>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLFileVersionLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public DLFileVersion getFileVersion(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileVersion(param0, param1);
    }

    public DLFileVersion getFileVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileVersion(param0);
    }

    public void rebuildTree(long param0)
        throws SystemException
    {
    }

    public List<DLFileVersion> getFileVersions(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getFileVersions(param0, param1);
    }

    public int getFileVersionsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getFileVersionsCount(param0, param1);
    }

    public DLFileVersion getLatestFileVersion(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestFileVersion(param0, param1);
    }

    public DLFileVersion getLatestFileVersion(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestFileVersion(param0, param1);
    }

    public DLFileVersion addDLFileVersion(DLFileVersion param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DLFileVersion createDLFileVersion(long param0) {
        return this.mockObject.createDLFileVersion(param0);
    }

    public DLFileVersion deleteDLFileVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLFileVersion(param0);
    }

    public DLFileVersion deleteDLFileVersion(DLFileVersion param0)
        throws SystemException
    {
        return this.mockObject.deleteDLFileVersion(param0);
    }

    public DLFileVersion fetchDLFileVersion(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileVersion fetchDLFileVersionByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDLFileVersionByUuidAndCompanyId(param0, param1);
    }

    public DLFileVersion fetchDLFileVersionByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDLFileVersionByUuidAndGroupId(param0, param1);
    }

    public DLFileVersion getDLFileVersion(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileVersion getDLFileVersionByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFileVersionByUuidAndCompanyId(param0, param1);
    }

    public DLFileVersion getDLFileVersionByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFileVersionByUuidAndGroupId(param0, param1);
    }

    public List<DLFileVersion> getDLFileVersions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLFileVersions(param0, param1);
    }

    public int getDLFileVersionsCount()
        throws SystemException
    {
        return this.mockObject.getDLFileVersionsCount();
    }

    public DLFileVersion updateDLFileVersion(DLFileVersion param0)
        throws SystemException
    {
        return this.mockObject.updateDLFileVersion(param0);
    }

    public DLFileVersion getFileVersionByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFileVersionByUuidAndGroupId(param0, param1);
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

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public long dynamicQueryCount(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0);
    }

    public long dynamicQueryCount(DynamicQuery param0, Projection param1)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0, param1);
    }

    public String getBeanIdentifier() {
        return this.mockObject.getBeanIdentifier();
    }

    public void setBeanIdentifier(String param0) {
    }

}
