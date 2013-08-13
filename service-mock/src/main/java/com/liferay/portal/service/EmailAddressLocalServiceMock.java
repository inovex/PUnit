
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.EmailAddress;
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
public class EmailAddressLocalServiceMock
    extends MockService<EmailAddressLocalService>
    implements EmailAddressLocalService
{

    private HashMap<Long, EmailAddress> _serviceObjects = new HashMap<Long, EmailAddress>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.EmailAddressLocalService.class));
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

    public EmailAddress getEmailAddress(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<EmailAddress> getEmailAddresses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getEmailAddresses(param0, param1);
    }

    public List<EmailAddress> getEmailAddresses()
        throws SystemException
    {
        return this.mockObject.getEmailAddresses();
    }

    public List<EmailAddress> getEmailAddresses(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getEmailAddresses(param0, param1, param2);
    }

    public EmailAddress addEmailAddress(EmailAddress param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public EmailAddress addEmailAddress(long param0, String param1, long param2, String param3, int param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addEmailAddress(param0, param1, param2, param3, param4, param5);
    }

    public EmailAddress createEmailAddress(long param0) {
        return this.mockObject.createEmailAddress(param0);
    }

    public EmailAddress deleteEmailAddress(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteEmailAddress(param0);
    }

    public EmailAddress deleteEmailAddress(EmailAddress param0)
        throws SystemException
    {
        return this.mockObject.deleteEmailAddress(param0);
    }

    public EmailAddress fetchEmailAddress(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public int getEmailAddressesCount()
        throws SystemException
    {
        return this.mockObject.getEmailAddressesCount();
    }

    public EmailAddress updateEmailAddress(EmailAddress param0)
        throws SystemException
    {
        return this.mockObject.updateEmailAddress(param0);
    }

    public EmailAddress updateEmailAddress(EmailAddress param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateEmailAddress(param0, param1);
    }

    public EmailAddress updateEmailAddress(long param0, String param1, int param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEmailAddress(param0, param1, param2, param3);
    }

    public void deleteEmailAddresses(long param0, String param1, long param2)
        throws SystemException
    {
    }

}
