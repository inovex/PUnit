
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Phone;

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
public class PhoneLocalServiceMock
    extends MockService<PhoneLocalService>
    implements PhoneLocalService
{

    private HashMap<Long, Phone> _serviceObjects = new HashMap<Long, Phone>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PhoneLocalService.class));
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

    public List<Phone> getPhones(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPhones(param0, param1);
    }

    public List<Phone> getPhones()
        throws SystemException
    {
        return this.mockObject.getPhones();
    }

    public List<Phone> getPhones(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getPhones(param0, param1, param2);
    }

    public Phone addPhone(Phone param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Phone addPhone(long param0, String param1, long param2, String param3, String param4, int param5, boolean param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addPhone(param0, param1, param2, param3, param4, param5, param6);
    }

    public Phone createPhone(long param0) {
        return this.mockObject.createPhone(param0);
    }

    public Phone deletePhone(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePhone(param0);
    }

    public Phone deletePhone(Phone param0)
        throws SystemException
    {
        return this.mockObject.deletePhone(param0);
    }

    public Phone fetchPhone(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Phone getPhone(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int getPhonesCount()
        throws SystemException
    {
        return this.mockObject.getPhonesCount();
    }

    public Phone updatePhone(Phone param0)
        throws SystemException
    {
        return this.mockObject.updatePhone(param0);
    }

    public Phone updatePhone(Phone param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updatePhone(param0, param1);
    }

    public Phone updatePhone(long param0, String param1, String param2, int param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePhone(param0, param1, param2, param3, param4);
    }

    public void deletePhones(long param0, String param1, long param2)
        throws SystemException
    {
    }

}
