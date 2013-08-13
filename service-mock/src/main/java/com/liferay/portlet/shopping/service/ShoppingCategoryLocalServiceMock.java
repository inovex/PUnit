
package com.liferay.portlet.shopping.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.shopping.model.ShoppingCategory;

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
public class ShoppingCategoryLocalServiceMock
    extends MockService<ShoppingCategoryLocalService>
    implements ShoppingCategoryLocalService
{

    private HashMap<Long, ShoppingCategory> _serviceObjects = new HashMap<Long, ShoppingCategory>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.service.ShoppingCategoryLocalService.class));
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

    public ShoppingCategory addCategory(long param0, long param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addCategory(param0, param1, param2, param3, param4);
    }

    public List<ShoppingCategory> getCategories(long param0)
        throws SystemException
    {
        return this.mockObject.getCategories(param0);
    }

    public List<ShoppingCategory> getCategories(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getCategories(param0, param1, param2, param3);
    }

    public ShoppingCategory getCategory(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCategory(param0);
    }

    public ShoppingCategory getParentCategory(ShoppingCategory param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentCategory(param0);
    }

    public void addCategoryResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addCategoryResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addCategoryResources(ShoppingCategory param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addCategoryResources(ShoppingCategory param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteCategory(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteCategory(ShoppingCategory param0)
        throws PortalException, SystemException
    {
    }

    public ShoppingCategory updateCategory(long param0, long param1, String param2, String param3, boolean param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCategory(param0, param1, param2, param3, param4, param5);
    }

    public void deleteCategories(long param0)
        throws PortalException, SystemException
    {
    }

    public int getCategoriesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCategoriesCount(param0, param1);
    }

    public void getSubcategoryIds(List<Long> param0, long param1, long param2)
        throws SystemException
    {
    }

    public ShoppingCategory addShoppingCategory(ShoppingCategory param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ShoppingCategory createShoppingCategory(long param0) {
        return this.mockObject.createShoppingCategory(param0);
    }

    public ShoppingCategory deleteShoppingCategory(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteShoppingCategory(param0);
    }

    public ShoppingCategory deleteShoppingCategory(ShoppingCategory param0)
        throws SystemException
    {
        return this.mockObject.deleteShoppingCategory(param0);
    }

    public ShoppingCategory fetchShoppingCategory(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ShoppingCategory getShoppingCategory(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ShoppingCategory> getShoppingCategories(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getShoppingCategories(param0, param1);
    }

    public int getShoppingCategoriesCount()
        throws SystemException
    {
        return this.mockObject.getShoppingCategoriesCount();
    }

    public ShoppingCategory updateShoppingCategory(ShoppingCategory param0)
        throws SystemException
    {
        return this.mockObject.updateShoppingCategory(param0);
    }

    public ShoppingCategory updateShoppingCategory(ShoppingCategory param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateShoppingCategory(param0, param1);
    }

    public List<ShoppingCategory> getParentCategories(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentCategories(param0);
    }

    public List<ShoppingCategory> getParentCategories(ShoppingCategory param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentCategories(param0);
    }

}
