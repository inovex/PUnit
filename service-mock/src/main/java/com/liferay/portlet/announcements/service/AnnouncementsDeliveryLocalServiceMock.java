
package com.liferay.portlet.announcements.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.announcements.model.AnnouncementsDelivery;

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
public class AnnouncementsDeliveryLocalServiceMock
    extends MockService<AnnouncementsDeliveryLocalService>
    implements AnnouncementsDeliveryLocalService
{

    private HashMap<Long, AnnouncementsDelivery> _serviceObjects = new HashMap<Long, AnnouncementsDelivery>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.announcements.service.AnnouncementsDeliveryLocalService.class));
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

    public AnnouncementsDelivery addAnnouncementsDelivery(AnnouncementsDelivery param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AnnouncementsDelivery createAnnouncementsDelivery(long param0) {
        return this.mockObject.createAnnouncementsDelivery(param0);
    }

    public AnnouncementsDelivery deleteAnnouncementsDelivery(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAnnouncementsDelivery(param0);
    }

    public AnnouncementsDelivery deleteAnnouncementsDelivery(AnnouncementsDelivery param0)
        throws SystemException
    {
        return this.mockObject.deleteAnnouncementsDelivery(param0);
    }

    public AnnouncementsDelivery fetchAnnouncementsDelivery(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AnnouncementsDelivery getAnnouncementsDelivery(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AnnouncementsDelivery> getAnnouncementsDeliveries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAnnouncementsDeliveries(param0, param1);
    }

    public int getAnnouncementsDeliveriesCount()
        throws SystemException
    {
        return this.mockObject.getAnnouncementsDeliveriesCount();
    }

    public AnnouncementsDelivery updateAnnouncementsDelivery(AnnouncementsDelivery param0)
        throws SystemException
    {
        return this.mockObject.updateAnnouncementsDelivery(param0);
    }

    public AnnouncementsDelivery updateAnnouncementsDelivery(AnnouncementsDelivery param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateAnnouncementsDelivery(param0, param1);
    }

    public AnnouncementsDelivery addUserDelivery(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addUserDelivery(param0, param1);
    }

    public void deleteDeliveries(long param0)
        throws SystemException
    {
    }

    public void deleteDelivery(AnnouncementsDelivery param0)
        throws SystemException
    {
    }

    public void deleteDelivery(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteDelivery(long param0, String param1)
        throws SystemException
    {
    }

    public AnnouncementsDelivery getDelivery(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDelivery(param0);
    }

    public List<AnnouncementsDelivery> getUserDeliveries(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserDeliveries(param0);
    }

    public AnnouncementsDelivery getUserDelivery(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserDelivery(param0, param1);
    }

    public AnnouncementsDelivery updateDelivery(long param0, String param1, boolean param2, boolean param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateDelivery(param0, param1, param2, param3, param4);
    }

}
