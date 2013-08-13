
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
import com.liferay.portlet.shopping.model.ShoppingCart;
import com.liferay.portlet.shopping.model.ShoppingOrder;

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
public class ShoppingOrderLocalServiceMock
    extends MockService<ShoppingOrderLocalService>
    implements ShoppingOrderLocalService
{

    private HashMap<Long, ShoppingOrder> _serviceObjects = new HashMap<Long, ShoppingOrder>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.service.ShoppingOrderLocalService.class));
    }

    public List<ShoppingOrder> search(long param0, long param1, long param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, boolean param11, int param12, int param13)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
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

    public int searchCount(long param0, long param1, long param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, boolean param11)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public ShoppingOrder addShoppingOrder(ShoppingOrder param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ShoppingOrder createShoppingOrder(long param0) {
        return this.mockObject.createShoppingOrder(param0);
    }

    public ShoppingOrder deleteShoppingOrder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteShoppingOrder(param0);
    }

    public ShoppingOrder deleteShoppingOrder(ShoppingOrder param0)
        throws SystemException
    {
        return this.mockObject.deleteShoppingOrder(param0);
    }

    public ShoppingOrder fetchShoppingOrder(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ShoppingOrder getShoppingOrder(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ShoppingOrder> getShoppingOrders(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getShoppingOrders(param0, param1);
    }

    public int getShoppingOrdersCount()
        throws SystemException
    {
        return this.mockObject.getShoppingOrdersCount();
    }

    public ShoppingOrder updateShoppingOrder(ShoppingOrder param0)
        throws SystemException
    {
        return this.mockObject.updateShoppingOrder(param0);
    }

    public ShoppingOrder updateShoppingOrder(ShoppingOrder param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateShoppingOrder(param0, param1);
    }

    public ShoppingOrder addLatestOrder(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addLatestOrder(param0, param1);
    }

    public void completeOrder(String param0, String param1, String param2, double param3, String param4, String param5, boolean param6, ServiceContext param7)
        throws PortalException, SystemException
    {
    }

    public void deleteOrder(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteOrder(ShoppingOrder param0)
        throws PortalException, SystemException
    {
    }

    public void deleteOrders(long param0)
        throws PortalException, SystemException
    {
    }

    public ShoppingOrder getLatestOrder(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestOrder(param0, param1);
    }

    public ShoppingOrder getOrder(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrder(param0);
    }

    public ShoppingOrder getOrder(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrder(param0);
    }

    public ShoppingOrder getPayPalTxnIdOrder(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPayPalTxnIdOrder(param0);
    }

    public ShoppingOrder saveLatestOrder(ShoppingCart param0)
        throws PortalException, SystemException
    {
        return this.mockObject.saveLatestOrder(param0);
    }

    public void sendEmail(long param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public void sendEmail(ShoppingOrder param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public ShoppingOrder updateLatestOrder(long param0, long param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, String param11, boolean param12, String param13, String param14, String param15, String param16, String param17, String param18, String param19, String param20, String param21, String param22, String param23, String param24, String param25, int param26, int param27, String param28, String param29)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLatestOrder(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26, param27, param28, param29);
    }

    public ShoppingOrder updateOrder(long param0, String param1, String param2, double param3, String param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateOrder(param0, param1, param2, param3, param4, param5);
    }

    public ShoppingOrder updateOrder(long param0, String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, boolean param11, String param12, String param13, String param14, String param15, String param16, String param17, String param18, String param19, String param20, String param21, String param22, String param23, String param24, int param25, int param26, String param27, String param28)
        throws PortalException, SystemException
    {
        return this.mockObject.updateOrder(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26, param27, param28);
    }

}
