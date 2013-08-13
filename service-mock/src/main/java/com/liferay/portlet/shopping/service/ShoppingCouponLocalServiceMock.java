
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
import com.liferay.portlet.shopping.model.ShoppingCoupon;

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
public class ShoppingCouponLocalServiceMock
    extends MockService<ShoppingCouponLocalService>
    implements ShoppingCouponLocalService
{

    private HashMap<Long, ShoppingCoupon> _serviceObjects = new HashMap<Long, ShoppingCoupon>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.service.ShoppingCouponLocalService.class));
    }

    public List<ShoppingCoupon> search(long param0, long param1, String param2, boolean param3, String param4, boolean param5, int param6, int param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
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

    public int searchCount(long param0, long param1, String param2, boolean param3, String param4, boolean param5)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5);
    }

    public ShoppingCoupon getCoupon(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCoupon(param0);
    }

    public ShoppingCoupon getCoupon(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCoupon(param0);
    }

    public ShoppingCoupon addShoppingCoupon(ShoppingCoupon param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ShoppingCoupon createShoppingCoupon(long param0) {
        return this.mockObject.createShoppingCoupon(param0);
    }

    public ShoppingCoupon deleteShoppingCoupon(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteShoppingCoupon(param0);
    }

    public ShoppingCoupon deleteShoppingCoupon(ShoppingCoupon param0)
        throws SystemException
    {
        return this.mockObject.deleteShoppingCoupon(param0);
    }

    public ShoppingCoupon fetchShoppingCoupon(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ShoppingCoupon getShoppingCoupon(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ShoppingCoupon> getShoppingCoupons(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getShoppingCoupons(param0, param1);
    }

    public int getShoppingCouponsCount()
        throws SystemException
    {
        return this.mockObject.getShoppingCouponsCount();
    }

    public ShoppingCoupon updateShoppingCoupon(ShoppingCoupon param0)
        throws SystemException
    {
        return this.mockObject.updateShoppingCoupon(param0);
    }

    public ShoppingCoupon updateShoppingCoupon(ShoppingCoupon param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateShoppingCoupon(param0, param1);
    }

    public ShoppingCoupon addCoupon(long param0, String param1, boolean param2, String param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, boolean param15, boolean param16, String param17, String param18, double param19, double param20, String param21, ServiceContext param22)
        throws PortalException, SystemException
    {
        return this.mockObject.addCoupon(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22);
    }

    public void deleteCoupon(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteCoupon(ShoppingCoupon param0)
        throws SystemException
    {
    }

    public void deleteCoupons(long param0)
        throws SystemException
    {
    }

    public ShoppingCoupon updateCoupon(long param0, long param1, String param2, String param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, boolean param15, String param16, String param17, double param18, double param19, String param20, ServiceContext param21)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCoupon(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21);
    }

}
