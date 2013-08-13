
package com.liferay.portlet.bookmarks.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.bookmarks.model.BookmarksEntry;

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
public class BookmarksEntryLocalServiceMock
    extends MockService<BookmarksEntryLocalService>
    implements BookmarksEntryLocalService
{

    private HashMap<Long, BookmarksEntry> _serviceObjects = new HashMap<Long, BookmarksEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.bookmarks.service.BookmarksEntryLocalService.class));
    }

    public BookmarksEntry addEntry(long param0, long param1, long param2, String param3, String param4, String param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addEntry(param0, param1, param2, param3, param4, param5, param6);
    }

    public BookmarksEntry getEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0);
    }

    public List<BookmarksEntry> getEntries(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2, param3);
    }

    public List<BookmarksEntry> getEntries(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2, param3, param4);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void deleteEntry(BookmarksEntry param0)
        throws PortalException, SystemException
    {
    }

    public void deleteEntry(long param0)
        throws PortalException, SystemException
    {
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

    public void updateAsset(long param0, BookmarksEntry param1, long[] param2, String[] param3, long[] param4)
        throws PortalException, SystemException
    {
    }

    public int getEntriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0, param1);
    }

    public BookmarksEntry updateEntry(long param0, long param1, long param2, long param3, String param4, String param5, String param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public void deleteEntries(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public List<BookmarksEntry> getGroupEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupEntries(param0, param1, param2);
    }

    public List<BookmarksEntry> getGroupEntries(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getGroupEntries(param0, param1, param2, param3);
    }

    public int getGroupEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupEntriesCount(param0);
    }

    public int getGroupEntriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getGroupEntriesCount(param0, param1);
    }

    public List<BookmarksEntry> getNoAssetEntries()
        throws SystemException
    {
        return this.mockObject.getNoAssetEntries();
    }

    public BookmarksEntry addBookmarksEntry(BookmarksEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public BookmarksEntry createBookmarksEntry(long param0) {
        return this.mockObject.createBookmarksEntry(param0);
    }

    public BookmarksEntry deleteBookmarksEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteBookmarksEntry(param0);
    }

    public BookmarksEntry deleteBookmarksEntry(BookmarksEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteBookmarksEntry(param0);
    }

    public BookmarksEntry fetchBookmarksEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BookmarksEntry getBookmarksEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BookmarksEntry getBookmarksEntryByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getBookmarksEntryByUuidAndGroupId(param0, param1);
    }

    public List<BookmarksEntry> getBookmarksEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBookmarksEntries(param0, param1);
    }

    public int getBookmarksEntriesCount()
        throws SystemException
    {
        return this.mockObject.getBookmarksEntriesCount();
    }

    public BookmarksEntry updateBookmarksEntry(BookmarksEntry param0)
        throws SystemException
    {
        return this.mockObject.updateBookmarksEntry(param0);
    }

    public BookmarksEntry updateBookmarksEntry(BookmarksEntry param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateBookmarksEntry(param0, param1);
    }

    public int getFoldersEntriesCount(long param0, List<Long> param1)
        throws SystemException
    {
        return this.mockObject.getFoldersEntriesCount(param0, param1);
    }

    public BookmarksEntry openEntry(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.openEntry(param0, param1);
    }

}
