
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.PersistedModel;
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
public class AddressLocalServiceMock
    extends MockService<AddressLocalService>
    implements AddressLocalService
{

    private HashMap<Long, Address> _serviceObjects = new HashMap<Long, Address>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.AddressLocalService.class));
    }

    public Address getAddress(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Address addAddress(long param0, String param1, long param2, String param3, String param4, String param5, String param6, String param7, long param8, long param9, int param10, boolean param11, boolean param12, ServiceContext param13)
        throws PortalException, SystemException
    {
        return this.mockObject.addAddress(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public Address addAddress(Address param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Address addAddress(long param0, String param1, long param2, String param3, String param4, String param5, String param6, String param7, long param8, long param9, int param10, boolean param11, boolean param12)
        throws PortalException, SystemException
    {
        return this.mockObject.addAddress(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
    }

    public Address fetchAddress(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Address deleteAddress(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAddress(param0);
    }

    public Address deleteAddress(Address param0)
        throws SystemException
    {
        return this.mockObject.deleteAddress(param0);
    }

    public List<Address> getAddresses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAddresses(param0, param1);
    }

    public List<Address> getAddresses(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getAddresses(param0, param1, param2);
    }

    public List<Address> getAddresses()
        throws SystemException
    {
        return this.mockObject.getAddresses();
    }

    public Address fetchAddressByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchAddressByUuidAndCompanyId(param0, param1);
    }

    public Address getAddressByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getAddressByUuidAndCompanyId(param0, param1);
    }

    public int getAddressesCount()
        throws SystemException
    {
        return this.mockObject.getAddressesCount();
    }

    public Address updateAddress(long param0, String param1, String param2, String param3, String param4, String param5, long param6, long param7, int param8, boolean param9, boolean param10)
        throws PortalException, SystemException
    {
        return this.mockObject.updateAddress(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public Address updateAddress(Address param0)
        throws SystemException
    {
        return this.mockObject.updateAddress(param0);
    }

    public void deleteAddresses(long param0, String param1, long param2)
        throws SystemException
    {
    }

    public Address createAddress(long param0) {
        return this.mockObject.createAddress(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

}
