
package com.liferay.portlet.blogs.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.blogs.model.BlogsStatsUser;
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
public class BlogsStatsUserLocalServiceMock
    extends MockService<BlogsStatsUserLocalService>
    implements BlogsStatsUserLocalService
{

    private HashMap<Long, BlogsStatsUser> _serviceObjects = new HashMap<Long, BlogsStatsUser>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.blogs.service.BlogsStatsUserLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public BlogsStatsUser getStatsUser(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getStatsUser(param0, param1);
    }

    public BlogsStatsUser createBlogsStatsUser(long param0) {
        return this.mockObject.createBlogsStatsUser(param0);
    }

    public BlogsStatsUser deleteBlogsStatsUser(BlogsStatsUser param0)
        throws SystemException
    {
        return this.mockObject.deleteBlogsStatsUser(param0);
    }

    public BlogsStatsUser deleteBlogsStatsUser(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteBlogsStatsUser(param0);
    }

    public BlogsStatsUser fetchBlogsStatsUser(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BlogsStatsUser getBlogsStatsUser(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<BlogsStatsUser> getBlogsStatsUsers(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBlogsStatsUsers(param0, param1);
    }

    public int getBlogsStatsUsersCount()
        throws SystemException
    {
        return this.mockObject.getBlogsStatsUsersCount();
    }

    public BlogsStatsUser updateBlogsStatsUser(BlogsStatsUser param0)
        throws SystemException
    {
        return this.mockObject.updateBlogsStatsUser(param0);
    }

    public void deleteStatsUser(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteStatsUser(BlogsStatsUser param0)
        throws SystemException
    {
    }

    public void deleteStatsUserByGroupId(long param0)
        throws SystemException
    {
    }

    public void deleteStatsUserByUserId(long param0)
        throws SystemException
    {
    }

    public List<BlogsStatsUser> getCompanyStatsUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyStatsUsers(param0, param1, param2);
    }

    public List<BlogsStatsUser> getCompanyStatsUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getCompanyStatsUsers(param0, param1, param2, param3);
    }

    public int getCompanyStatsUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyStatsUsersCount(param0);
    }

    public List<BlogsStatsUser> getGroupsStatsUsers(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getGroupsStatsUsers(param0, param1, param2, param3);
    }

    public List<BlogsStatsUser> getGroupStatsUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupStatsUsers(param0, param1, param2);
    }

    public List<BlogsStatsUser> getGroupStatsUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getGroupStatsUsers(param0, param1, param2, param3);
    }

    public int getGroupStatsUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupStatsUsersCount(param0);
    }

    public List<BlogsStatsUser> getOrganizationStatsUsers(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getOrganizationStatsUsers(param0, param1, param2, param3);
    }

    public List<BlogsStatsUser> getOrganizationStatsUsers(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getOrganizationStatsUsers(param0, param1, param2);
    }

    public int getOrganizationStatsUsersCount(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationStatsUsersCount(param0);
    }

    public void updateStatsUser(long param0, long param1, Date param2)
        throws PortalException, SystemException
    {
    }

    public void updateStatsUser(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public BlogsStatsUser addBlogsStatsUser(BlogsStatsUser param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
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

}
