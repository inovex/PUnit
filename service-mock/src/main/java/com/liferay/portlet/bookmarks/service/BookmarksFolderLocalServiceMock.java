
package com.liferay.portlet.bookmarks.service;

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
import com.liferay.portlet.bookmarks.model.BookmarksFolder;
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
public class BookmarksFolderLocalServiceMock
    extends MockService<BookmarksFolderLocalService>
    implements BookmarksFolderLocalService
{

    private HashMap<Long, BookmarksFolder> _serviceObjects = new HashMap<Long, BookmarksFolder>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.bookmarks.service.BookmarksFolderLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
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

    public BookmarksFolder deleteFolder(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0, param1);
    }

    public BookmarksFolder deleteFolder(BookmarksFolder param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0, param1);
    }

    public BookmarksFolder deleteFolder(BookmarksFolder param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0);
    }

    public BookmarksFolder deleteFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteFolder(param0);
    }

    public BookmarksFolder getFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFolder(param0);
    }

    public BookmarksFolder moveFolder(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFolder(param0, param1);
    }

    public BookmarksFolder updateFolder(long param0, long param1, long param2, String param3, String param4, boolean param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFolder(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Object> getFoldersAndEntries(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFoldersAndEntries(param0, param1);
    }

    public List<Object> getFoldersAndEntries(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getFoldersAndEntries(param0, param1, param2, param3, param4);
    }

    public List<Object> getFoldersAndEntries(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFoldersAndEntries(param0, param1, param2);
    }

    public int getFoldersAndEntriesCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFoldersAndEntriesCount(param0, param1, param2);
    }

    public List<BookmarksFolder> getNoAssetFolders()
        throws SystemException
    {
        return this.mockObject.getNoAssetFolders();
    }

    public BookmarksFolder moveFolderFromTrash(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFolderFromTrash(param0, param1, param2);
    }

    public void rebuildTree(long param0)
        throws SystemException
    {
    }

    public int getBookmarksFoldersCount()
        throws SystemException
    {
        return this.mockObject.getBookmarksFoldersCount();
    }

    public BookmarksFolder updateBookmarksFolder(BookmarksFolder param0)
        throws SystemException
    {
        return this.mockObject.updateBookmarksFolder(param0);
    }

    public void deleteFolders(long param0)
        throws PortalException, SystemException
    {
    }

    public List<BookmarksFolder> getCompanyFolders(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyFolders(param0, param1, param2);
    }

    public BookmarksFolder createBookmarksFolder(long param0) {
        return this.mockObject.createBookmarksFolder(param0);
    }

    public BookmarksFolder deleteBookmarksFolder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteBookmarksFolder(param0);
    }

    public BookmarksFolder deleteBookmarksFolder(BookmarksFolder param0)
        throws SystemException
    {
        return this.mockObject.deleteBookmarksFolder(param0);
    }

    public BookmarksFolder fetchBookmarksFolder(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BookmarksFolder fetchBookmarksFolderByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchBookmarksFolderByUuidAndCompanyId(param0, param1);
    }

    public BookmarksFolder fetchBookmarksFolderByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchBookmarksFolderByUuidAndGroupId(param0, param1);
    }

    public BookmarksFolder getBookmarksFolder(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BookmarksFolder getBookmarksFolderByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getBookmarksFolderByUuidAndCompanyId(param0, param1);
    }

    public BookmarksFolder getBookmarksFolderByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getBookmarksFolderByUuidAndGroupId(param0, param1);
    }

    public List<BookmarksFolder> getBookmarksFolders(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBookmarksFolders(param0, param1);
    }

    public int getCompanyFoldersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyFoldersCount(param0);
    }

    public BookmarksFolder addBookmarksFolder(BookmarksFolder param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public BookmarksFolder moveFolderToTrash(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.moveFolderToTrash(param0, param1);
    }

    public void restoreFolderFromTrash(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void subscribeFolder(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void unsubscribeFolder(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
    }

    public BookmarksFolder addFolder(long param0, long param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addFolder(param0, param1, param2, param3, param4);
    }

    public List<BookmarksFolder> getFolders(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2, param3);
    }

    public List<BookmarksFolder> getFolders(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1);
    }

    public List<BookmarksFolder> getFolders(long param0)
        throws SystemException
    {
        return this.mockObject.getFolders(param0);
    }

    public List<BookmarksFolder> getFolders(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getFolders(param0, param1, param2, param3, param4);
    }

    public void updateAsset(long param0, BookmarksFolder param1, long[] param2, String[] param3, long[] param4)
        throws PortalException, SystemException
    {
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public BookmarksFolder updateStatus(long param0, BookmarksFolder param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2);
    }

}
