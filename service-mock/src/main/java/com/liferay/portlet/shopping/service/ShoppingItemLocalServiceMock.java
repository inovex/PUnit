
package com.liferay.portlet.shopping.service;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.shopping.model.ShoppingItem;
import com.liferay.portlet.shopping.model.ShoppingItemField;
import com.liferay.portlet.shopping.model.ShoppingItemPrice;

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
public class ShoppingItemLocalServiceMock
    extends MockService<ShoppingItemLocalService>
    implements ShoppingItemLocalService
{

    private HashMap<Long, ShoppingItem> _serviceObjects = new HashMap<Long, ShoppingItem>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.service.ShoppingItemLocalService.class));
    }

    public List<ShoppingItem> search(long param0, long[] param1, String param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public ShoppingItem getItem(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getItem(param0);
    }

    public ShoppingItem getItem(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getItem(param0, param1);
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

    public int searchCount(long param0, long[] param1, String param2)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2);
    }

    public List<ShoppingItem> getItems(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getItems(param0, param1);
    }

    public List<ShoppingItem> getItems(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getItems(param0, param1, param2, param3, param4);
    }

    public ShoppingItem addShoppingItem(ShoppingItem param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ShoppingItem createShoppingItem(long param0) {
        return this.mockObject.createShoppingItem(param0);
    }

    public ShoppingItem deleteShoppingItem(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteShoppingItem(param0);
    }

    public ShoppingItem deleteShoppingItem(ShoppingItem param0)
        throws SystemException
    {
        return this.mockObject.deleteShoppingItem(param0);
    }

    public ShoppingItem fetchShoppingItem(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ShoppingItem getShoppingItem(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ShoppingItem> getShoppingItems(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getShoppingItems(param0, param1);
    }

    public int getShoppingItemsCount()
        throws SystemException
    {
        return this.mockObject.getShoppingItemsCount();
    }

    public ShoppingItem updateShoppingItem(ShoppingItem param0)
        throws SystemException
    {
        return this.mockObject.updateShoppingItem(param0);
    }

    public ShoppingItem updateShoppingItem(ShoppingItem param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateShoppingItem(param0, param1);
    }

    public void addBookItems(long param0, long param1, long param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public ShoppingItem addItem(long param0, long param1, long param2, String param3, String param4, String param5, String param6, String param7, boolean param8, int param9, boolean param10, Boolean param11, boolean param12, String param13, File param14, boolean param15, String param16, File param17, boolean param18, String param19, File param20, List<ShoppingItemField> param21, List<ShoppingItemPrice> param22, ServiceContext param23)
        throws PortalException, SystemException
    {
        return this.mockObject.addItem(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23);
    }

    public void addItemResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addItemResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addItemResources(ShoppingItem param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addItemResources(ShoppingItem param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteItem(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteItem(ShoppingItem param0)
        throws PortalException, SystemException
    {
    }

    public void deleteItems(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public int getCategoriesItemsCount(long param0, List<Long> param1)
        throws SystemException
    {
        return this.mockObject.getCategoriesItemsCount(param0, param1);
    }

    public List<ShoppingItem> getFeaturedItems(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFeaturedItems(param0, param1, param2);
    }

    public ShoppingItem getItemByLargeImageId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getItemByLargeImageId(param0);
    }

    public ShoppingItem getItemByMediumImageId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getItemByMediumImageId(param0);
    }

    public ShoppingItem getItemBySmallImageId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getItemBySmallImageId(param0);
    }

    public int getItemsCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getItemsCount(param0, param1);
    }

    public ShoppingItem[] getItemsPrevAndNext(long param0, OrderByComparator param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getItemsPrevAndNext(param0, param1);
    }

    public List<ShoppingItem> getSaleItems(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getSaleItems(param0, param1, param2);
    }

    public ShoppingItem updateItem(long param0, long param1, long param2, long param3, String param4, String param5, String param6, String param7, String param8, boolean param9, int param10, boolean param11, Boolean param12, boolean param13, String param14, File param15, boolean param16, String param17, File param18, boolean param19, String param20, File param21, List<ShoppingItemField> param22, List<ShoppingItemPrice> param23, ServiceContext param24)
        throws PortalException, SystemException
    {
        return this.mockObject.updateItem(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24);
    }

}
