
package com.liferay.portlet.journal.service;

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
import com.liferay.portlet.journal.model.JournalFolder;
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
public class JournalFolderLocalServiceMock
    extends MockService<JournalFolderLocalService>
    implements JournalFolderLocalService
{

    private HashMap<Long, JournalFolder> _serviceObjects = new HashMap<Long, JournalFolder>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalFolderLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public JournalFolder fetchFolder(long param0)
        throws SystemException
    {
        return this.mockObject.fetchFolder(param0);
    }

    public JournalFolder fetchFolder(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchFolder(param0, param1);
    }

    public JournalFolder fetchFolder(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchFolder(param0, param1, param2);
    }

    public int getFoldersCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFoldersCount(param0, param1);
    }

    public int getFoldersCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFoldersCount(param0, param1, param2);
    }

    public void getSubfolderIds(List<Long> param0, long param1, long param2)
        throws SystemException
    {
    }

    public JournalFolder deleteFolder(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0, param1);
    }

    public JournalFolder deleteFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0);
    }

    public JournalFolder deleteFolder(JournalFolder param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0, param1);
    }

    public JournalFolder deleteFolder(JournalFolder param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0);
    }

    public JournalFolder getFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFolder(param0);
    }

    public JournalFolder moveFolder(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFolder(param0, param1, param2);
    }

    public JournalFolder updateFolder(long param0, long param1, long param2, String param3, String param4, boolean param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFolder(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<JournalFolder> getNoAssetFolders()
        throws SystemException
    {
        return this.mockObject.getNoAssetFolders();
    }

    public JournalFolder moveFolderFromTrash(long param0, long param1, long param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFolderFromTrash(param0, param1, param2, param3);
    }

    public void rebuildTree(long param0)
        throws SystemException
    {
    }

    public void deleteFolders(long param0)
        throws PortalException, SystemException
    {
    }

    public List<JournalFolder> getCompanyFolders(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyFolders(param0, param1, param2);
    }

    public int getCompanyFoldersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyFoldersCount(param0);
    }

    public JournalFolder moveFolderToTrash(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFolderToTrash(param0, param1);
    }

    public void restoreFolderFromTrash(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public JournalFolder createJournalFolder(long param0) {
        return this.mockObject.createJournalFolder(param0);
    }

    public JournalFolder addFolder(long param0, long param1, long param2, String param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addFolder(param0, param1, param2, param3, param4, param5);
    }

    public JournalFolder getJournalFolderByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalFolderByUuidAndCompanyId(param0, param1);
    }

    public JournalFolder getJournalFolderByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalFolderByUuidAndGroupId(param0, param1);
    }

    public List<JournalFolder> getJournalFolders(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalFolders(param0, param1);
    }

    public int getJournalFoldersCount()
        throws SystemException
    {
        return this.mockObject.getJournalFoldersCount();
    }

    public JournalFolder updateJournalFolder(JournalFolder param0)
        throws SystemException
    {
        return this.mockObject.updateJournalFolder(param0);
    }

    public List<Object> getFoldersAndArticles(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFoldersAndArticles(param0, param1);
    }

    public List<Object> getFoldersAndArticles(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getFoldersAndArticles(param0, param1, param2, param3, param4);
    }

    public List<Object> getFoldersAndArticles(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFoldersAndArticles(param0, param1, param2);
    }

    public int getFoldersAndArticlesCount(long param0, List<Long> param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFoldersAndArticlesCount(param0, param1, param2);
    }

    public int getFoldersAndArticlesCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFoldersAndArticlesCount(param0, param1, param2);
    }

    public int getFoldersAndArticlesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFoldersAndArticlesCount(param0, param1);
    }

    public List<JournalFolder> getFolders(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2, param3);
    }

    public List<JournalFolder> getFolders(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2, param3, param4);
    }

    public List<JournalFolder> getFolders(long param0)
        throws SystemException
    {
        return this.mockObject.getFolders(param0);
    }

    public List<JournalFolder> getFolders(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2);
    }

    public List<JournalFolder> getFolders(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1);
    }

    public JournalFolder addJournalFolder(JournalFolder param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalFolder deleteJournalFolder(JournalFolder param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalFolder(param0);
    }

    public JournalFolder deleteJournalFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalFolder(param0);
    }

    public JournalFolder fetchJournalFolder(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalFolder fetchJournalFolderByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchJournalFolderByUuidAndCompanyId(param0, param1);
    }

    public JournalFolder fetchJournalFolderByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchJournalFolderByUuidAndGroupId(param0, param1);
    }

    public JournalFolder getJournalFolder(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public void updateAsset(long param0, JournalFolder param1, long[] param2, String[] param3, long[] param4)
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

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public JournalFolder updateStatus(long param0, JournalFolder param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2);
    }

}
