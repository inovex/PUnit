
package com.liferay.portlet.documentlibrary.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
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
public class DLFolderLocalServiceMock
    extends MockService<DLFolderLocalService>
    implements DLFolderLocalService
{

    private HashMap<Long, DLFolder> _serviceObjects = new HashMap<Long, DLFolder>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLFolderLocalService.class));
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

    public DLFolder addFolder(long param0, long param1, long param2, boolean param3, long param4, String param5, String param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.addFolder(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public void deleteAll(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFolder(long param0)
        throws PortalException, SystemException
    {
    }

    public List<Object> getFileEntriesAndFileShortcuts(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getFileEntriesAndFileShortcuts(param0, param1, param2, param3, param4);
    }

    public int getFileEntriesAndFileShortcutsCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFileEntriesAndFileShortcutsCount(param0, param1, param2);
    }

    public DLFolder getFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFolder(param0);
    }

    public DLFolder getFolder(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFolder(param0, param1, param2);
    }

    public List<DLFolder> getFolders(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1);
    }

    public List<DLFolder> getFolders(long param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2);
    }

    public List<DLFolder> getFolders(long param0, long param1, boolean param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2, param3, param4, param5);
    }

    public List<DLFolder> getFolders(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2, param3, param4);
    }

    public List<Object> getFoldersAndFileEntriesAndFileShortcuts(long param0, long param1, int param2, boolean param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.getFoldersAndFileEntriesAndFileShortcuts(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Object> getFoldersAndFileEntriesAndFileShortcuts(long param0, long param1, int param2, String[] param3, boolean param4, int param5, int param6, OrderByComparator param7)
        throws SystemException
    {
        return this.mockObject.getFoldersAndFileEntriesAndFileShortcuts(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public int getFoldersAndFileEntriesAndFileShortcutsCount(long param0, long param1, int param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.getFoldersAndFileEntriesAndFileShortcutsCount(param0, param1, param2, param3);
    }

    public int getFoldersAndFileEntriesAndFileShortcutsCount(long param0, long param1, int param2, String[] param3, boolean param4)
        throws SystemException
    {
        return this.mockObject.getFoldersAndFileEntriesAndFileShortcutsCount(param0, param1, param2, param3, param4);
    }

    public int getFoldersCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFoldersCount(param0, param1);
    }

    public int getFoldersCount(long param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getFoldersCount(param0, param1, param2);
    }

    public int getFoldersFileEntriesCount(long param0, List<Long> param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFoldersFileEntriesCount(param0, param1, param2);
    }

    public List<DLFolder> getMountFolders(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getMountFolders(param0, param1, param2, param3, param4);
    }

    public int getMountFoldersCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getMountFoldersCount(param0, param1);
    }

    public DLFolder updateFolder(long param0, long param1, String param2, String param3, long param4, List<Long> param5, boolean param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFolder(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public DLFolder updateFolder(long param0, String param1, String param2, long param3, List<Long> param4, boolean param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFolder(param0, param1, param2, param3, param4, param5, param6);
    }

    public void getSubfolderIds(List<Long> param0, long param1, long param2)
        throws SystemException
    {
    }

    public DLFolder moveFolder(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFolder(param0, param1, param2);
    }

    public long getFolderId(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFolderId(param0, param1);
    }

    public List<DLFolder> getCompanyFolders(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyFolders(param0, param1, param2);
    }

    public int getCompanyFoldersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyFoldersCount(param0);
    }

    public DLFolder addDLFolder(DLFolder param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DLFolder createDLFolder(long param0) {
        return this.mockObject.createDLFolder(param0);
    }

    public DLFolder deleteDLFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLFolder(param0);
    }

    public DLFolder deleteDLFolder(DLFolder param0)
        throws SystemException
    {
        return this.mockObject.deleteDLFolder(param0);
    }

    public DLFolder fetchDLFolder(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFolder getDLFolder(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFolder getDLFolderByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFolderByUuidAndGroupId(param0, param1);
    }

    public List<DLFolder> getDLFolders(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLFolders(param0, param1);
    }

    public int getDLFoldersCount()
        throws SystemException
    {
        return this.mockObject.getDLFoldersCount();
    }

    public DLFolder updateDLFolder(DLFolder param0)
        throws SystemException
    {
        return this.mockObject.updateDLFolder(param0);
    }

    public DLFolder updateDLFolder(DLFolder param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDLFolder(param0, param1);
    }

    public DLFolder getMountFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getMountFolder(param0);
    }

    public DLFolder updateFolderAndFileEntryTypes(long param0, long param1, String param2, String param3, long param4, List<Long> param5, boolean param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFolderAndFileEntryTypes(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public void updateLastPostDate(long param0, Date param1)
        throws PortalException, SystemException
    {
    }

}
