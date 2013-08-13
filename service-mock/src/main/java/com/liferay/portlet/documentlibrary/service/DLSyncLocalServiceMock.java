
package com.liferay.portlet.documentlibrary.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.documentlibrary.model.DLSync;

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
public class DLSyncLocalServiceMock
    extends MockService<DLSyncLocalService>
    implements DLSyncLocalService
{

    private HashMap<Long, DLSync> _serviceObjects = new HashMap<Long, DLSync>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLSyncLocalService.class));
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

    public DLSync addDLSync(DLSync param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DLSync createDLSync(long param0) {
        return this.mockObject.createDLSync(param0);
    }

    public DLSync deleteDLSync(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLSync(param0);
    }

    public DLSync deleteDLSync(DLSync param0)
        throws SystemException
    {
        return this.mockObject.deleteDLSync(param0);
    }

    public DLSync fetchDLSync(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLSync getDLSync(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<DLSync> getDLSyncs(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLSyncs(param0, param1);
    }

    public int getDLSyncsCount()
        throws SystemException
    {
        return this.mockObject.getDLSyncsCount();
    }

    public DLSync updateDLSync(DLSync param0)
        throws SystemException
    {
        return this.mockObject.updateDLSync(param0);
    }

    public DLSync updateDLSync(DLSync param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDLSync(param0, param1);
    }

    public DLSync addSync(long param0, String param1, long param2, long param3, long param4, String param5, String param6, String param7)
        throws PortalException, SystemException
    {
        return this.mockObject.addSync(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public DLSync addSync(long param0, String param1, long param2, long param3, long param4, String param5, String param6, String param7, String param8)
        throws PortalException, SystemException
    {
        return this.mockObject.addSync(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public DLSync updateSync(long param0, long param1, String param2, String param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateSync(param0, param1, param2, param3, param4);
    }

    public DLSync updateSync(long param0, long param1, String param2, String param3, String param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateSync(param0, param1, param2, param3, param4, param5);
    }

}
