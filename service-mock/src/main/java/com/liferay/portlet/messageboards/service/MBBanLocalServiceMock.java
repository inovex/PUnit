
package com.liferay.portlet.messageboards.service;

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
import com.liferay.portlet.messageboards.model.MBBan;
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
public class MBBanLocalServiceMock
    extends MockService<MBBanLocalService>
    implements MBBanLocalService
{

    private HashMap<Long, MBBan> _serviceObjects = new HashMap<Long, MBBan>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.service.MBBanLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public MBBan fetchMBBanByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMBBanByUuidAndCompanyId(param0, param1);
    }

    public MBBan deleteMBBan(MBBan param0)
        throws SystemException
    {
        return this.mockObject.deleteMBBan(param0);
    }

    public MBBan deleteMBBan(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMBBan(param0);
    }

    public MBBan addMBBan(MBBan param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MBBan getMBBan(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBBan fetchMBBan(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<MBBan> getMBBans(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMBBans(param0, param1);
    }

    public MBBan fetchMBBanByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMBBanByUuidAndGroupId(param0, param1);
    }

    public MBBan getMBBanByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBBanByUuidAndCompanyId(param0, param1);
    }

    public MBBan getMBBanByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBBanByUuidAndGroupId(param0, param1);
    }

    public int getMBBansCount()
        throws SystemException
    {
        return this.mockObject.getMBBansCount();
    }

    public MBBan updateMBBan(MBBan param0)
        throws SystemException
    {
        return this.mockObject.updateMBBan(param0);
    }

    public MBBan addBan(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.addBan(param0, param1, param2);
    }

    public void checkBan(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteBan(long param0, ServiceContext param1)
        throws SystemException
    {
    }

    public void deleteBan(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteBan(MBBan param0)
        throws SystemException
    {
    }

    public void deleteBansByBanUserId(long param0)
        throws SystemException
    {
    }

    public void deleteBansByGroupId(long param0)
        throws SystemException
    {
    }

    public void expireBans()
        throws SystemException
    {
    }

    public List<MBBan> getBans(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getBans(param0, param1, param2);
    }

    public int getBansCount(long param0)
        throws SystemException
    {
        return this.mockObject.getBansCount(param0);
    }

    public boolean hasBan(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasBan(param0, param1);
    }

    public MBBan createMBBan(long param0) {
        return this.mockObject.createMBBan(param0);
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

}
