
package com.liferay.portlet.messageboards.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.messageboards.model.MBThread;
import com.liferay.portlet.messageboards.model.MBThreadFlag;

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
public class MBThreadFlagLocalServiceMock
    extends MockService<MBThreadFlagLocalService>
    implements MBThreadFlagLocalService
{

    private HashMap<Long, MBThreadFlag> _serviceObjects = new HashMap<Long, MBThreadFlag>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.service.MBThreadFlagLocalService.class));
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

    public MBThreadFlag addMBThreadFlag(MBThreadFlag param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MBThreadFlag createMBThreadFlag(long param0) {
        return this.mockObject.createMBThreadFlag(param0);
    }

    public MBThreadFlag deleteMBThreadFlag(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMBThreadFlag(param0);
    }

    public MBThreadFlag deleteMBThreadFlag(MBThreadFlag param0)
        throws SystemException
    {
        return this.mockObject.deleteMBThreadFlag(param0);
    }

    public MBThreadFlag fetchMBThreadFlag(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBThreadFlag getMBThreadFlag(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<MBThreadFlag> getMBThreadFlags(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMBThreadFlags(param0, param1);
    }

    public int getMBThreadFlagsCount()
        throws SystemException
    {
        return this.mockObject.getMBThreadFlagsCount();
    }

    public MBThreadFlag updateMBThreadFlag(MBThreadFlag param0)
        throws SystemException
    {
        return this.mockObject.updateMBThreadFlag(param0);
    }

    public MBThreadFlag updateMBThreadFlag(MBThreadFlag param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateMBThreadFlag(param0, param1);
    }

    public void addThreadFlag(long param0, MBThread param1)
        throws PortalException, SystemException
    {
    }

    public void deleteThreadFlag(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteThreadFlag(MBThreadFlag param0)
        throws SystemException
    {
    }

    public void deleteThreadFlagsByThreadId(long param0)
        throws SystemException
    {
    }

    public void deleteThreadFlagsByUserId(long param0)
        throws SystemException
    {
    }

    public MBThreadFlag getThreadFlag(long param0, MBThread param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getThreadFlag(param0, param1);
    }

    public boolean hasThreadFlag(long param0, MBThread param1)
        throws PortalException, SystemException
    {
        return this.mockObject.hasThreadFlag(param0, param1);
    }

}
