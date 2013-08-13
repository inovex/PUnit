
package com.liferay.portlet.announcements.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.announcements.model.AnnouncementsEntry;

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
public class AnnouncementsEntryLocalServiceMock
    extends MockService<AnnouncementsEntryLocalService>
    implements AnnouncementsEntryLocalService
{

    private HashMap<Long, AnnouncementsEntry> _serviceObjects = new HashMap<Long, AnnouncementsEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.announcements.service.AnnouncementsEntryLocalService.class));
    }

    public AnnouncementsEntry addEntry(long param0, long param1, long param2, String param3, String param4, String param5, String param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, boolean param18)
        throws PortalException, SystemException
    {
        return this.mockObject.addEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18);
    }

    public AnnouncementsEntry getEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0);
    }

    public List<AnnouncementsEntry> getEntries(long param0, LinkedHashMap<Long, long[]> param1, boolean param2, int param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2, param3, param4, param5);
    }

    public List<AnnouncementsEntry> getEntries(long param0, LinkedHashMap<Long, long[]> param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12, int param13, int param14, int param15)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15);
    }

    public List<AnnouncementsEntry> getEntries(long param0, long param1, boolean param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2, param3, param4);
    }

    public List<AnnouncementsEntry> getEntries(long param0, long param1, long[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void deleteEntry(AnnouncementsEntry param0)
        throws PortalException, SystemException
    {
    }

    public void deleteEntry(long param0)
        throws PortalException, SystemException
    {
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

    public AnnouncementsEntry addAnnouncementsEntry(AnnouncementsEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AnnouncementsEntry createAnnouncementsEntry(long param0) {
        return this.mockObject.createAnnouncementsEntry(param0);
    }

    public AnnouncementsEntry deleteAnnouncementsEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAnnouncementsEntry(param0);
    }

    public AnnouncementsEntry deleteAnnouncementsEntry(AnnouncementsEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteAnnouncementsEntry(param0);
    }

    public AnnouncementsEntry fetchAnnouncementsEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AnnouncementsEntry getAnnouncementsEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AnnouncementsEntry> getAnnouncementsEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAnnouncementsEntries(param0, param1);
    }

    public int getAnnouncementsEntriesCount()
        throws SystemException
    {
        return this.mockObject.getAnnouncementsEntriesCount();
    }

    public AnnouncementsEntry updateAnnouncementsEntry(AnnouncementsEntry param0)
        throws SystemException
    {
        return this.mockObject.updateAnnouncementsEntry(param0);
    }

    public AnnouncementsEntry updateAnnouncementsEntry(AnnouncementsEntry param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateAnnouncementsEntry(param0, param1);
    }

    public void checkEntries()
        throws PortalException, SystemException
    {
    }

    public int getEntriesCount(long param0, LinkedHashMap<Long, long[]> param1, boolean param2, int param3)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0, param1, param2, param3);
    }

    public int getEntriesCount(long param0, LinkedHashMap<Long, long[]> param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12, int param13)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public int getEntriesCount(long param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0, param1, param2);
    }

    public int getEntriesCount(long param0, long param1, long[] param2, boolean param3, int param4)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0, param1, param2, param3, param4);
    }

    public int getEntriesCount(long param0, long param1, long[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
    }

    public List<AnnouncementsEntry> getUserEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserEntries(param0, param1, param2);
    }

    public int getUserEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserEntriesCount(param0);
    }

    public AnnouncementsEntry updateEntry(long param0, long param1, String param2, String param3, String param4, String param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
    }

}
