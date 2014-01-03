
package com.liferay.portlet.trash.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.trash.model.TrashEntry;
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
public class TrashEntryLocalServiceMock
    extends MockService<TrashEntryLocalService>
    implements TrashEntryLocalService
{

    private HashMap<Long, TrashEntry> _serviceObjects = new HashMap<Long, TrashEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.trash.service.TrashEntryLocalService.class));
    }

    public Hits search(long param0, long param1, long param2, String param3, int param4, int param5, Sort param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public TrashEntry getEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0);
    }

    public TrashEntry getEntry(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0, param1);
    }

    public List<TrashEntry> getEntries(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2, param3);
    }

    public List<TrashEntry> getEntries(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1);
    }

    public List<TrashEntry> getEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getEntries(param0, param1, param2);
    }

    public List<TrashEntry> getEntries(long param0)
        throws SystemException
    {
        return this.mockObject.getEntries(param0);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public int getEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0);
    }

    public TrashEntry fetchEntry(long param0)
        throws SystemException
    {
        return this.mockObject.fetchEntry(param0);
    }

    public TrashEntry fetchEntry(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchEntry(param0, param1);
    }

    public void checkEntries()
        throws PortalException, SystemException
    {
    }

    public TrashEntry deleteTrashEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteTrashEntry(param0);
    }

    public TrashEntry deleteTrashEntry(TrashEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteTrashEntry(param0);
    }

    public TrashEntry getTrashEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public TrashEntry addTrashEntry(TrashEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public TrashEntry addTrashEntry(long param0, long param1, String param2, long param3, String param4, String param5, int param6, List<ObjectValuePair<Long, Integer>> param7, UnicodeProperties param8)
        throws PortalException, SystemException
    {
        return this.mockObject.addTrashEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public List<TrashEntry> getTrashEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getTrashEntries(param0, param1);
    }

    public TrashEntry createTrashEntry(long param0) {
        return this.mockObject.createTrashEntry(param0);
    }

    public TrashEntry fetchTrashEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
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

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public long dynamicQueryCount(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0);
    }

    public long dynamicQueryCount(DynamicQuery param0, Projection param1)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0, param1);
    }

    public String getBeanIdentifier() {
        return this.mockObject.getBeanIdentifier();
    }

    public void setBeanIdentifier(String param0) {
    }

    public int getTrashEntriesCount()
        throws SystemException
    {
        return this.mockObject.getTrashEntriesCount();
    }

    public TrashEntry updateTrashEntry(TrashEntry param0)
        throws SystemException
    {
        return this.mockObject.updateTrashEntry(param0);
    }

    public TrashEntry deleteEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteEntry(param0);
    }

    public TrashEntry deleteEntry(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteEntry(param0, param1);
    }

    public TrashEntry deleteEntry(TrashEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteEntry(param0);
    }

}
