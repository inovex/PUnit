
package com.liferay.portal.service;

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
import com.liferay.portal.model.Ticket;
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
public class TicketLocalServiceMock
    extends MockService<TicketLocalService>
    implements TicketLocalService
{

    private HashMap<Long, Ticket> _serviceObjects = new HashMap<Long, Ticket>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.TicketLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Ticket fetchTicket(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Ticket fetchTicket(String param0)
        throws SystemException
    {
        return this.mockObject.fetchTicket(param0);
    }

    public Ticket getTicket(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Ticket getTicket(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTicket(param0);
    }

    public List<Ticket> getTickets(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getTickets(param0, param1);
    }

    public int getTicketsCount()
        throws SystemException
    {
        return this.mockObject.getTicketsCount();
    }

    public Ticket addTicket(long param0, String param1, long param2, int param3, String param4, Date param5, ServiceContext param6)
        throws SystemException
    {
        return this.mockObject.addTicket(param0, param1, param2, param3, param4, param5, param6);
    }

    public Ticket addTicket(Ticket param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Ticket createTicket(long param0) {
        return this.mockObject.createTicket(param0);
    }

    public Ticket deleteTicket(Ticket param0)
        throws SystemException
    {
        return this.mockObject.deleteTicket(param0);
    }

    public Ticket deleteTicket(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteTicket(param0);
    }

    public Ticket updateTicket(Ticket param0)
        throws SystemException
    {
        return this.mockObject.updateTicket(param0);
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

}
