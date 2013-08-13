
package com.liferay.portlet.messageboards.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.messageboards.model.MBCategory;

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
public class MBCategoryLocalServiceMock
    extends MockService<MBCategoryLocalService>
    implements MBCategoryLocalService
{

    private HashMap<Long, MBCategory> _serviceObjects = new HashMap<Long, MBCategory>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.service.MBCategoryLocalService.class));
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

    public MBCategory addCategory(long param0, long param1, String param2, String param3, String param4, String param5, String param6, String param7, int param8, boolean param9, String param10, String param11, int param12, String param13, boolean param14, String param15, int param16, boolean param17, String param18, String param19, boolean param20, boolean param21, ServiceContext param22)
        throws PortalException, SystemException
    {
        return this.mockObject.addCategory(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22);
    }

    public List<MBCategory> getCategories(long param0)
        throws SystemException
    {
        return this.mockObject.getCategories(param0);
    }

    public List<MBCategory> getCategories(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getCategories(param0, param1, param2, param3);
    }

    public List<MBCategory> getCategories(long param0, long[] param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getCategories(param0, param1, param2, param3);
    }

    public MBCategory getCategory(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCategory(param0);
    }

    public void addCategoryResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addCategoryResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addCategoryResources(MBCategory param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addCategoryResources(MBCategory param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteCategory(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteCategory(MBCategory param0)
        throws PortalException, SystemException
    {
    }

    public MBCategory updateCategory(long param0, long param1, String param2, String param3, String param4, String param5, String param6, String param7, int param8, boolean param9, String param10, String param11, int param12, String param13, boolean param14, String param15, int param16, boolean param17, String param18, String param19, boolean param20, boolean param21, boolean param22, ServiceContext param23)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCategory(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23);
    }

    public MBCategory addMBCategory(MBCategory param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MBCategory createMBCategory(long param0) {
        return this.mockObject.createMBCategory(param0);
    }

    public MBCategory deleteMBCategory(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMBCategory(param0);
    }

    public MBCategory deleteMBCategory(MBCategory param0)
        throws SystemException
    {
        return this.mockObject.deleteMBCategory(param0);
    }

    public MBCategory fetchMBCategory(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBCategory getMBCategory(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBCategory getMBCategoryByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBCategoryByUuidAndGroupId(param0, param1);
    }

    public List<MBCategory> getMBCategories(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMBCategories(param0, param1);
    }

    public int getMBCategoriesCount()
        throws SystemException
    {
        return this.mockObject.getMBCategoriesCount();
    }

    public MBCategory updateMBCategory(MBCategory param0)
        throws SystemException
    {
        return this.mockObject.updateMBCategory(param0);
    }

    public MBCategory updateMBCategory(MBCategory param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateMBCategory(param0, param1);
    }

    public void deleteCategories(long param0)
        throws PortalException, SystemException
    {
    }

    public int getCategoriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCategoriesCount(param0);
    }

    public int getCategoriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCategoriesCount(param0, param1);
    }

    public int getCategoriesCount(long param0, long[] param1)
        throws SystemException
    {
        return this.mockObject.getCategoriesCount(param0, param1);
    }

    public List<MBCategory> getCompanyCategories(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyCategories(param0, param1, param2);
    }

    public int getCompanyCategoriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyCategoriesCount(param0);
    }

    public List<Long> getSubcategoryIds(List<Long> param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getSubcategoryIds(param0, param1, param2);
    }

    public List<MBCategory> getSubscribedCategories(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getSubscribedCategories(param0, param1, param2, param3);
    }

    public int getSubscribedCategoriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getSubscribedCategoriesCount(param0, param1);
    }

    public void subscribeCategory(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void unsubscribeCategory(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
    }

}
