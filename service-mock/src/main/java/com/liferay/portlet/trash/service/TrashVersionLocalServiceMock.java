
package com.liferay.portlet.trash.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.trash.model.TrashVersion;
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
public class TrashVersionLocalServiceMock
    extends MockService<TrashVersionLocalService>
    implements TrashVersionLocalService
{

    private HashMap<Long, TrashVersion> _serviceObjects = new HashMap<Long, TrashVersion>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.trash.service.TrashVersionLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public TrashVersion createTrashVersion(long param0) {
        return this.mockObject.createTrashVersion(param0);
    }

    public TrashVersion deleteTrashVersion(TrashVersion param0)
        throws SystemException
    {
        return this.mockObject.deleteTrashVersion(param0);
    }

    public TrashVersion deleteTrashVersion(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.deleteTrashVersion(param0, param1, param2);
    }

    public TrashVersion deleteTrashVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteTrashVersion(param0);
    }

    public TrashVersion fetchTrashVersion(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public TrashVersion getTrashVersion(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<TrashVersion> getTrashVersions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getTrashVersions(param0, param1);
    }

    public int getTrashVersionsCount()
        throws SystemException
    {
        return this.mockObject.getTrashVersionsCount();
    }

    public TrashVersion updateTrashVersion(TrashVersion param0)
        throws SystemException
    {
        return this.mockObject.updateTrashVersion(param0);
    }

    public TrashVersion fetchVersion(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.fetchVersion(param0, param1, param2);
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

    public void addTrashVersion(long param0, String param1, long param2, int param3, UnicodeProperties param4)
        throws SystemException
    {
    }

    public TrashVersion addTrashVersion(TrashVersion param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public List<TrashVersion> getVersions(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getVersions(param0, param1);
    }

    public List<TrashVersion> getVersions(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getVersions(param0, param1);
    }

    public List<TrashVersion> getVersions(long param0)
        throws SystemException
    {
        return this.mockObject.getVersions(param0);
    }

}
