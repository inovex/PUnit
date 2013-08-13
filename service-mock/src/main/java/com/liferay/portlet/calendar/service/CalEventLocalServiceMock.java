
package com.liferay.portlet.calendar.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.cal.TZSRecurrence;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.calendar.model.CalEvent;

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
public class CalEventLocalServiceMock
    extends MockService<CalEventLocalService>
    implements CalEventLocalService
{

    private HashMap<Long, CalEvent> _serviceObjects = new HashMap<Long, CalEvent>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.calendar.service.CalEventLocalService.class));
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

    public void updateAsset(long param0, CalEvent param1, long[] param2, String[] param3, long[] param4)
        throws PortalException, SystemException
    {
    }

    public CalEvent addCalEvent(CalEvent param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public CalEvent createCalEvent(long param0) {
        return this.mockObject.createCalEvent(param0);
    }

    public CalEvent deleteCalEvent(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteCalEvent(param0);
    }

    public CalEvent deleteCalEvent(CalEvent param0)
        throws SystemException
    {
        return this.mockObject.deleteCalEvent(param0);
    }

    public CalEvent fetchCalEvent(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public CalEvent getCalEvent(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public CalEvent getCalEventByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getCalEventByUuidAndGroupId(param0, param1);
    }

    public List<CalEvent> getCalEvents(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getCalEvents(param0, param1);
    }

    public int getCalEventsCount()
        throws SystemException
    {
        return this.mockObject.getCalEventsCount();
    }

    public CalEvent updateCalEvent(CalEvent param0)
        throws SystemException
    {
        return this.mockObject.updateCalEvent(param0);
    }

    public CalEvent updateCalEvent(CalEvent param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateCalEvent(param0, param1);
    }

    public CalEvent addEvent(long param0, String param1, String param2, String param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, boolean param15, String param16, boolean param17, TZSRecurrence param18, int param19, int param20, int param21, ServiceContext param22)
        throws PortalException, SystemException
    {
        return this.mockObject.addEvent(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22);
    }

    public void addEventResources(CalEvent param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addEventResources(CalEvent param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addEventResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addEventResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void checkEvents()
        throws PortalException, SystemException
    {
    }

    public void deleteEvent(CalEvent param0)
        throws PortalException, SystemException
    {
    }

    public void deleteEvent(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteEvents(long param0)
        throws PortalException, SystemException
    {
    }

    public File exportEvent(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.exportEvent(param0, param1);
    }

    public File exportGroupEvents(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.exportGroupEvents(param0, param1, param2);
    }

    public List<CalEvent> getCompanyEvents(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyEvents(param0, param1, param2);
    }

    public int getCompanyEventsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyEventsCount(param0);
    }

    public CalEvent getEvent(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getEvent(param0);
    }

    public List<CalEvent> getEvents(long param0, Calendar param1)
        throws SystemException
    {
        return this.mockObject.getEvents(param0, param1);
    }

    public List<CalEvent> getEvents(long param0, Calendar param1, String param2)
        throws SystemException
    {
        return this.mockObject.getEvents(param0, param1, param2);
    }

    public List<CalEvent> getEvents(long param0, Calendar param1, String[] param2)
        throws SystemException
    {
        return this.mockObject.getEvents(param0, param1, param2);
    }

    public List<CalEvent> getEvents(long param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getEvents(param0, param1, param2, param3);
    }

    public List<CalEvent> getEvents(long param0, String[] param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getEvents(param0, param1, param2, param3);
    }

    public int getEventsCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getEventsCount(param0, param1);
    }

    public int getEventsCount(long param0, String[] param1)
        throws SystemException
    {
        return this.mockObject.getEventsCount(param0, param1);
    }

    public List<CalEvent> getNoAssetEvents()
        throws SystemException
    {
        return this.mockObject.getNoAssetEvents();
    }

    public List<CalEvent> getRepeatingEvents(long param0)
        throws SystemException
    {
        return this.mockObject.getRepeatingEvents(param0);
    }

    public List<CalEvent> getRepeatingEvents(long param0, Calendar param1, String[] param2)
        throws SystemException
    {
        return this.mockObject.getRepeatingEvents(param0, param1, param2);
    }

    public boolean hasEvents(long param0, Calendar param1)
        throws SystemException
    {
        return this.mockObject.hasEvents(param0, param1);
    }

    public boolean hasEvents(long param0, Calendar param1, String param2)
        throws SystemException
    {
        return this.mockObject.hasEvents(param0, param1, param2);
    }

    public boolean hasEvents(long param0, Calendar param1, String[] param2)
        throws SystemException
    {
        return this.mockObject.hasEvents(param0, param1, param2);
    }

    public void importICal4j(long param0, long param1, InputStream param2)
        throws PortalException, SystemException
    {
    }

    public CalEvent updateEvent(long param0, long param1, String param2, String param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, boolean param15, boolean param16, String param17, boolean param18, TZSRecurrence param19, int param20, int param21, int param22, ServiceContext param23)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEvent(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23);
    }

}
