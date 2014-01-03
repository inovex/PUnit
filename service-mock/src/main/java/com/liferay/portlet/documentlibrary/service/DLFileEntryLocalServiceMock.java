
package com.liferay.portlet.documentlibrary.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.dao.orm.QueryDefinition;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.util.DateRange;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Lock;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
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
public class DLFileEntryLocalServiceMock
    extends MockService<DLFileEntryLocalService>
    implements DLFileEntryLocalService
{

    private HashMap<Long, DLFileEntry> _serviceObjects = new HashMap<Long, DLFileEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLFileEntryLocalService.class));
    }

    public Hits search(long param0, long param1, long param2, int param3, int param4, int param5)
        throws PortalException, SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public Hits search(long param0, long param1, long param2, long param3, String[] param4, int param5, int param6, int param7)
        throws PortalException, SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public File getFile(long param0, long param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getFile(param0, param1, param2, param3);
    }

    public File getFile(long param0, long param1, String param2, boolean param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getFile(param0, param1, param2, param3, param4);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Lock lockFileEntry(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.lockFileEntry(param0, param1);
    }

    public DLFileEntry getFileEntry(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileEntry(param0, param1, param2);
    }

    public DLFileEntry getFileEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileEntry(param0);
    }

    public DLFileEntry moveFileEntry(long param0, long param1, long param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFileEntry(param0, param1, param2, param3);
    }

    public DLFileEntry updateFileEntry(long param0, long param1, String param2, String param3, String param4, String param5, String param6, boolean param7, long param8, Map<String, Fields> param9, File param10, InputStream param11, long param12, ServiceContext param13)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFileEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public void revertFileEntry(long param0, long param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
    }

    public boolean verifyFileEntryCheckOut(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.verifyFileEntryCheckOut(param0, param1);
    }

    public boolean verifyFileEntryLock(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.verifyFileEntryLock(param0, param1);
    }

    public DLFileEntry getDLFileEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileEntry getDLFileEntryByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFileEntryByUuidAndCompanyId(param0, param1);
    }

    public DLFileEntry getDLFileEntryByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDLFileEntryByUuidAndGroupId(param0, param1);
    }

    public List<DLFileEntry> getDLFileEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLFileEntries(param0, param1);
    }

    public int getDLFileEntriesCount()
        throws SystemException
    {
        return this.mockObject.getDLFileEntriesCount();
    }

    public DLFileEntry updateDLFileEntry(DLFileEntry param0)
        throws SystemException
    {
        return this.mockObject.updateDLFileEntry(param0);
    }

    public DLFileEntry createDLFileEntry(long param0) {
        return this.mockObject.createDLFileEntry(param0);
    }

    public void rebuildTree(long param0)
        throws SystemException
    {
    }

    public DLFileEntry getFileEntryByName(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileEntryByName(param0, param1, param2);
    }

    public DLFileEntry getFileEntryByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileEntryByUuidAndGroupId(param0, param1);
    }

    public List<DLFileEntry> getGroupFileEntries(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getGroupFileEntries(param0, param1, param2, param3);
    }

    public List<DLFileEntry> getGroupFileEntries(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getGroupFileEntries(param0, param1, param2, param3, param4);
    }

    public List<DLFileEntry> getGroupFileEntries(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getGroupFileEntries(param0, param1, param2, param3);
    }

    public List<DLFileEntry> getGroupFileEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupFileEntries(param0, param1, param2);
    }

    public int getGroupFileEntriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getGroupFileEntriesCount(param0, param1);
    }

    public int getGroupFileEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupFileEntriesCount(param0);
    }

    public List<DLFileEntry> getMisversionedFileEntries()
        throws SystemException
    {
        return this.mockObject.getMisversionedFileEntries();
    }

    public List<DLFileEntry> getNoAssetFileEntries()
        throws SystemException
    {
        return this.mockObject.getNoAssetFileEntries();
    }

    public List<DLFileEntry> getOrphanedFileEntries()
        throws SystemException
    {
        return this.mockObject.getOrphanedFileEntries();
    }

    public boolean hasExtraSettings()
        throws SystemException
    {
        return this.mockObject.hasExtraSettings();
    }

    public boolean hasFileEntryLock(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.hasFileEntryLock(param0, param1);
    }

    public boolean isFileEntryCheckedOut(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.isFileEntryCheckedOut(param0);
    }

    public void unlockFileEntry(long param0)
        throws SystemException
    {
    }

    public void updateSmallImage(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public DLFileEntry addDLFileEntry(DLFileEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public void incrementViewCounter(DLFileEntry param0, int param1)
        throws SystemException
    {
    }

    public DLFileEntry addFileEntry(long param0, long param1, long param2, long param3, String param4, String param5, String param6, String param7, String param8, long param9, Map<String, Fields> param10, File param11, InputStream param12, long param13, ServiceContext param14)
        throws PortalException, SystemException
    {
        return this.mockObject.addFileEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
    }

    public DLFileEntry deleteFileEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFileEntry(param0);
    }

    public DLFileEntry deleteFileEntry(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFileEntry(param0, param1);
    }

    public DLFileEntry deleteFileEntry(DLFileEntry param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFileEntry(param0);
    }

    public DLFileVersion cancelCheckOut(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.cancelCheckOut(param0, param1);
    }

    public void checkInFileEntry(long param0, long param1, boolean param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
    }

    public void checkInFileEntry(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void checkInFileEntry(long param0, long param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
    }

    public DLFileEntry checkOutFileEntry(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.checkOutFileEntry(param0, param1);
    }

    public DLFileEntry checkOutFileEntry(long param0, long param1, String param2, long param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.checkOutFileEntry(param0, param1, param2, param3, param4);
    }

    public DLFileEntry checkOutFileEntry(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.checkOutFileEntry(param0, param1, param2, param3);
    }

    public DLFileEntry checkOutFileEntry(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.checkOutFileEntry(param0, param1, param2);
    }

    public DLFileEntry deleteFileVersion(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFileVersion(param0, param1, param2);
    }

    public List<DLFileEntry> getFileEntries(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFileEntries(param0, param1);
    }

    public List<DLFileEntry> getFileEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getFileEntries(param0, param1);
    }

    public List<DLFileEntry> getFileEntries(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getFileEntries(param0, param1);
    }

    public List<DLFileEntry> getFileEntries(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getFileEntries(param0, param1, param2, param3, param4);
    }

    public List<DLFileEntry> getFileEntries(long param0, long param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getFileEntries(param0, param1, param2, param3, param4, param5);
    }

    public List<DLFileEntry> getFileEntries(long param0, long param1, List<Long> param2, String[] param3, QueryDefinition param4)
        throws Exception
    {
        return this.mockObject.getFileEntries(param0, param1, param2, param3, param4);
    }

    public int getFileEntriesCount(long param0, long param1, List<Long> param2, String[] param3, QueryDefinition param4)
        throws Exception
    {
        return this.mockObject.getFileEntriesCount(param0, param1, param2, param3, param4);
    }

    public int getFileEntriesCount()
        throws SystemException
    {
        return this.mockObject.getFileEntriesCount();
    }

    public int getFileEntriesCount(long param0, DateRange param1, long param2, QueryDefinition param3)
        throws SystemException
    {
        return this.mockObject.getFileEntriesCount(param0, param1, param2, param3);
    }

    public int getFileEntriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFileEntriesCount(param0, param1);
    }

    public int getFileEntriesCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFileEntriesCount(param0, param1, param2);
    }

    public DLFileEntry deleteDLFileEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLFileEntry(param0);
    }

    public DLFileEntry deleteDLFileEntry(DLFileEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteDLFileEntry(param0);
    }

    public DLFileEntry fetchDLFileEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileEntry fetchDLFileEntryByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDLFileEntryByUuidAndCompanyId(param0, param1);
    }

    public DLFileEntry fetchDLFileEntryByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDLFileEntryByUuidAndGroupId(param0, param1);
    }

    public void convertExtraSettings(String[] param0)
        throws PortalException, SystemException
    {
    }

    public void copyFileEntryMetadata(long param0, long param1, long param2, long param3, long param4, ServiceContext param5)
        throws PortalException, SystemException
    {
    }

    public void deleteFileEntries(long param0, long param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void deleteFileEntries(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public DLFileEntry fetchFileEntry(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchFileEntry(param0, param1, param2);
    }

    public DLFileEntry fetchFileEntryByAnyImageId(long param0)
        throws SystemException
    {
        return this.mockObject.fetchFileEntryByAnyImageId(param0);
    }

    public DLFileEntry fetchFileEntryByName(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchFileEntryByName(param0, param1, param2);
    }

    public List<DLFileEntry> getDDMStructureFileEntries(long[] param0)
        throws SystemException
    {
        return this.mockObject.getDDMStructureFileEntries(param0);
    }

    public List<DLFileEntry> getExtraSettingsFileEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getExtraSettingsFileEntries(param0, param1);
    }

    public int getExtraSettingsFileEntriesCount()
        throws SystemException
    {
        return this.mockObject.getExtraSettingsFileEntriesCount();
    }

    public InputStream getFileAsStream(long param0, long param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileAsStream(param0, param1, param2, param3);
    }

    public InputStream getFileAsStream(long param0, long param1, String param2, boolean param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileAsStream(param0, param1, param2, param3, param4);
    }

    public InputStream getFileAsStream(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFileAsStream(param0, param1, param2);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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

    public DLFileEntry updateStatus(long param0, long param1, int param2, Map<String, Serializable> param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3, param4);
    }

}
