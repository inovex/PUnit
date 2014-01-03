
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Contact;
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
public class ContactLocalServiceMock
    extends MockService<ContactLocalService>
    implements ContactLocalService
{

    private HashMap<Long, Contact> _serviceObjects = new HashMap<Long, Contact>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ContactLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Contact addContact(Contact param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Contact addContact(long param0, String param1, long param2, String param3, String param4, String param5, String param6, int param7, int param8, boolean param9, int param10, int param11, int param12, String param13, String param14, String param15, String param16, String param17, String param18, String param19, String param20, String param21, String param22, String param23)
        throws PortalException, SystemException
    {
        return this.mockObject.addContact(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23);
    }

    public Contact fetchContact(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Contact createContact(long param0) {
        return this.mockObject.createContact(param0);
    }

    public Contact deleteContact(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteContact(param0);
    }

    public Contact deleteContact(Contact param0)
        throws SystemException
    {
        return this.mockObject.deleteContact(param0);
    }

    public List<Contact> getContacts(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getContacts(param0, param1);
    }

    public List<Contact> getContacts(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getContacts(param0, param1, param2, param3, param4);
    }

    public int getContactsCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getContactsCount(param0, param1);
    }

    public int getContactsCount()
        throws SystemException
    {
        return this.mockObject.getContactsCount();
    }

    public Contact updateContact(Contact param0)
        throws SystemException
    {
        return this.mockObject.updateContact(param0);
    }

    public Contact updateContact(long param0, String param1, String param2, String param3, String param4, int param5, int param6, boolean param7, int param8, int param9, int param10, String param11, String param12, String param13, String param14, String param15, String param16, String param17, String param18, String param19, String param20, String param21)
        throws PortalException, SystemException
    {
        return this.mockObject.updateContact(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21);
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public Contact getContact(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

}
