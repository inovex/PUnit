
package com.liferay.portlet.documentlibrary.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileRank;
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
public class DLFileRankLocalServiceMock
    extends MockService<DLFileRankLocalService>
    implements DLFileRankLocalService
{

    private HashMap<Long, DLFileRank> _serviceObjects = new HashMap<Long, DLFileRank>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLFileRankLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public DLFileRank addDLFileRank(DLFileRank param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DLFileRank addFileRank(long param0, long param1, long param2, long param3, ServiceContext param4)
        throws SystemException
    {
        return this.mockObject.addFileRank(param0, param1, param2, param3, param4);
    }

    public List<DLFileRank> getFileRanks(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getFileRanks(param0, param1);
    }

    public void checkFileRanks()
        throws SystemException
    {
    }

    public void deleteFileRank(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFileRank(DLFileRank param0)
        throws SystemException
    {
    }

    public DLFileRank createDLFileRank(long param0) {
        return this.mockObject.createDLFileRank(param0);
    }

    public DLFileRank deleteDLFileRank(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLFileRank(param0);
    }

    public DLFileRank deleteDLFileRank(DLFileRank param0)
        throws SystemException
    {
        return this.mockObject.deleteDLFileRank(param0);
    }

    public DLFileRank fetchDLFileRank(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLFileRank getDLFileRank(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<DLFileRank> getDLFileRanks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLFileRanks(param0, param1);
    }

    public int getDLFileRanksCount()
        throws SystemException
    {
        return this.mockObject.getDLFileRanksCount();
    }

    public DLFileRank updateDLFileRank(DLFileRank param0)
        throws SystemException
    {
        return this.mockObject.updateDLFileRank(param0);
    }

    public void deleteFileRanksByFileEntryId(long param0)
        throws SystemException
    {
    }

    public void deleteFileRanksByUserId(long param0)
        throws SystemException
    {
    }

    public void disableFileRanks(long param0)
        throws SystemException
    {
    }

    public void disableFileRanksByFolderId(long param0)
        throws PortalException, SystemException
    {
    }

    public void enableFileRanks(long param0)
        throws SystemException
    {
    }

    public void enableFileRanksByFolderId(long param0)
        throws PortalException, SystemException
    {
    }

    public DLFileRank updateFileRank(long param0, long param1, long param2, long param3, ServiceContext param4)
        throws SystemException
    {
        return this.mockObject.updateFileRank(param0, param1, param2, param3, param4);
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
