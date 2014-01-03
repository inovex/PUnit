
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
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
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
public class DLFileShortcutLocalServiceMock
    extends MockService<DLFileShortcutLocalService>
    implements DLFileShortcutLocalService
{

    private HashMap<Long, DLFileShortcut> _serviceObjects = new HashMap<Long, DLFileShortcut>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLFileShortcutLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void rebuildTree(long param0)
        throws SystemException
    {
    }

    public DLFileShortcut addFileShortcut(long param0, long param1, long param2, long param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addFileShortcut(param0, param1, param2, param3, param4);
    }

    public void addFileShortcutResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addFileShortcutResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addFileShortcutResources(DLFileShortcut param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addFileShortcutResources(DLFileShortcut param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteFileShortcut(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFileShortcut(DLFileShortcut param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFileShortcuts(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteFileShortcuts(long param0, long param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void deleteFileShortcuts(long param0)
        throws PortalException, SystemException
    {
    }

    public void disableFileShortcuts(long param0)
        throws SystemException
    {
    }

    public void enableFileShortcuts(long param0)
        throws SystemException
    {
    }

    public DLFileShortcut getFileShortcut(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileShortcut(param0);
    }

    public List<DLFileShortcut> getFileShortcuts(long param0, long param1, boolean param2, int param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getFileShortcuts(param0, param1, param2, param3, param4, param5);
    }

    public int getFileShortcutsCount(long param0, long param1, boolean param2, int param3)
        throws SystemException
    {
        return this.mockObject.getFileShortcutsCount(param0, param1, param2, param3);
    }

    public DLFileShortcut updateFileShortcut(long param0, long param1, long param2, long param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFileShortcut(param0, param1, param2, param3, param4);
    }

    public void updateFileShortcuts(long param0, long param1)
        throws SystemException
    {
    }

    public DLFileShortcut fetchDLFileShortcut(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileShortcut fetchDLFileShortcutByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDLFileShortcutByUuidAndCompanyId(param0, param1);
    }

    public DLFileShortcut fetchDLFileShortcutByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDLFileShortcutByUuidAndGroupId(param0, param1);
    }

    public DLFileShortcut getDLFileShortcut(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileShortcut getDLFileShortcutByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFileShortcutByUuidAndCompanyId(param0, param1);
    }

    public DLFileShortcut getDLFileShortcutByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFileShortcutByUuidAndGroupId(param0, param1);
    }

    public List<DLFileShortcut> getDLFileShortcuts(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLFileShortcuts(param0, param1);
    }

    public int getDLFileShortcutsCount()
        throws SystemException
    {
        return this.mockObject.getDLFileShortcutsCount();
    }

    public DLFileShortcut updateDLFileShortcut(DLFileShortcut param0)
        throws SystemException
    {
        return this.mockObject.updateDLFileShortcut(param0);
    }

    public DLFileShortcut createDLFileShortcut(long param0) {
        return this.mockObject.createDLFileShortcut(param0);
    }

    public DLFileShortcut deleteDLFileShortcut(DLFileShortcut param0)
        throws SystemException
    {
        return this.mockObject.deleteDLFileShortcut(param0);
    }

    public DLFileShortcut deleteDLFileShortcut(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLFileShortcut(param0);
    }

    public DLFileShortcut addDLFileShortcut(DLFileShortcut param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public void updateAsset(long param0, DLFileShortcut param1, long[] param2, String[] param3)
        throws PortalException, SystemException
    {
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

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
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

    public void updateStatus(long param0, long param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
    }

}
