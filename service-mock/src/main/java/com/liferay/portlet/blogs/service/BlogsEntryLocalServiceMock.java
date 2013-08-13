
package com.liferay.portlet.blogs.service;

import java.io.InputStream;
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
import com.liferay.portlet.blogs.model.BlogsEntry;

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
public class BlogsEntryLocalServiceMock
    extends MockService<BlogsEntryLocalService>
    implements BlogsEntryLocalService
{

    private HashMap<Long, BlogsEntry> _serviceObjects = new HashMap<Long, BlogsEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.blogs.service.BlogsEntryLocalService.class));
    }

    public BlogsEntry addEntry(long param0, String param1, String param2, String param3, int param4, int param5, int param6, int param7, int param8, boolean param9, boolean param10, String[] param11, boolean param12, String param13, String param14, InputStream param15, ServiceContext param16)
        throws PortalException, SystemException
    {
        return this.mockObject.addEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
    }

    public BlogsEntry getEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0);
    }

    public BlogsEntry getEntry(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0, param1);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void deleteEntry(BlogsEntry param0)
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

    public void updateAsset(long param0, BlogsEntry param1, long[] param2, String[] param3, long[] param4)
        throws PortalException, SystemException
    {
    }

    public BlogsEntry updateStatus(long param0, long param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

    public void checkEntries()
        throws PortalException, SystemException
    {
    }

    public BlogsEntry updateEntry(long param0, long param1, String param2, String param3, String param4, int param5, int param6, int param7, int param8, int param9, boolean param10, boolean param11, String[] param12, boolean param13, String param14, String param15, InputStream param16, ServiceContext param17)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17);
    }

    public List<BlogsEntry> getCompanyEntries(long param0, Date param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getCompanyEntries(param0, param1, param2, param3, param4);
    }

    public List<BlogsEntry> getCompanyEntries(long param0, Date param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getCompanyEntries(param0, param1, param2, param3, param4, param5);
    }

    public int getCompanyEntriesCount(long param0, Date param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyEntriesCount(param0, param1, param2);
    }

    public BlogsEntry addBlogsEntry(BlogsEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public BlogsEntry createBlogsEntry(long param0) {
        return this.mockObject.createBlogsEntry(param0);
    }

    public BlogsEntry deleteBlogsEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteBlogsEntry(param0);
    }

    public BlogsEntry deleteBlogsEntry(BlogsEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteBlogsEntry(param0);
    }

    public BlogsEntry fetchBlogsEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BlogsEntry getBlogsEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BlogsEntry getBlogsEntryByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getBlogsEntryByUuidAndGroupId(param0, param1);
    }

    public List<BlogsEntry> getBlogsEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBlogsEntries(param0, param1);
    }

    public int getBlogsEntriesCount()
        throws SystemException
    {
        return this.mockObject.getBlogsEntriesCount();
    }

    public BlogsEntry updateBlogsEntry(BlogsEntry param0)
        throws SystemException
    {
        return this.mockObject.updateBlogsEntry(param0);
    }

    public BlogsEntry updateBlogsEntry(BlogsEntry param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateBlogsEntry(param0, param1);
    }

    public void addEntryResources(BlogsEntry param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addEntryResources(BlogsEntry param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addEntryResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addEntryResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteEntries(long param0)
        throws PortalException, SystemException
    {
    }

    public BlogsEntry[] getEntriesPrevAndNext(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntriesPrevAndNext(param0);
    }

    public List<BlogsEntry> getGroupEntries(long param0, Date param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getGroupEntries(param0, param1, param2, param3, param4);
    }

    public List<BlogsEntry> getGroupEntries(long param0, Date param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getGroupEntries(param0, param1, param2, param3, param4, param5);
    }

    public List<BlogsEntry> getGroupEntries(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getGroupEntries(param0, param1, param2, param3);
    }

    public List<BlogsEntry> getGroupEntries(long param0, int param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getGroupEntries(param0, param1, param2, param3, param4);
    }

    public int getGroupEntriesCount(long param0, Date param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupEntriesCount(param0, param1, param2);
    }

    public int getGroupEntriesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getGroupEntriesCount(param0, param1);
    }

    public List<BlogsEntry> getGroupsEntries(long param0, long param1, Date param2, int param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getGroupsEntries(param0, param1, param2, param3, param4, param5);
    }

    public List<BlogsEntry> getGroupUserEntries(long param0, long param1, Date param2, int param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getGroupUserEntries(param0, param1, param2, param3, param4, param5);
    }

    public List<BlogsEntry> getGroupUserEntries(long param0, long param1, Date param2, int param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.getGroupUserEntries(param0, param1, param2, param3, param4, param5, param6);
    }

    public int getGroupUserEntriesCount(long param0, long param1, Date param2, int param3)
        throws SystemException
    {
        return this.mockObject.getGroupUserEntriesCount(param0, param1, param2, param3);
    }

    public List<BlogsEntry> getNoAssetEntries()
        throws SystemException
    {
        return this.mockObject.getNoAssetEntries();
    }

    public List<BlogsEntry> getOrganizationEntries(long param0, Date param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getOrganizationEntries(param0, param1, param2, param3, param4);
    }

    public List<BlogsEntry> getOrganizationEntries(long param0, Date param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getOrganizationEntries(param0, param1, param2, param3, param4, param5);
    }

    public int getOrganizationEntriesCount(long param0, Date param1, int param2)
        throws SystemException
    {
        return this.mockObject.getOrganizationEntriesCount(param0, param1, param2);
    }

    public void subscribe(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void unsubscribe(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void updateEntryResources(BlogsEntry param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

}
