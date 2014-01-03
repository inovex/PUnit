
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
import com.liferay.portlet.messageboards.model.MBDiscussion;
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
public class MBDiscussionLocalServiceMock
    extends MockService<MBDiscussionLocalService>
    implements MBDiscussionLocalService
{

    private HashMap<Long, MBDiscussion> _serviceObjects = new HashMap<Long, MBDiscussion>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.service.MBDiscussionLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public int getMBDiscussionsCount()
        throws SystemException
    {
        return this.mockObject.getMBDiscussionsCount();
    }

    public MBDiscussion updateMBDiscussion(MBDiscussion param0)
        throws SystemException
    {
        return this.mockObject.updateMBDiscussion(param0);
    }

    public MBDiscussion addDiscussion(long param0, long param1, long param2, long param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addDiscussion(param0, param1, param2, param3, param4);
    }

    public MBDiscussion fetchDiscussion(long param0)
        throws SystemException
    {
        return this.mockObject.fetchDiscussion(param0);
    }

    public MBDiscussion fetchDiscussion(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchDiscussion(param0, param1);
    }

    public MBDiscussion getDiscussion(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDiscussion(param0, param1);
    }

    public MBDiscussion getDiscussion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getDiscussion(param0);
    }

    public MBDiscussion getThreadDiscussion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getThreadDiscussion(param0);
    }

    public MBDiscussion addMBDiscussion(MBDiscussion param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MBDiscussion deleteMBDiscussion(MBDiscussion param0)
        throws SystemException
    {
        return this.mockObject.deleteMBDiscussion(param0);
    }

    public MBDiscussion deleteMBDiscussion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMBDiscussion(param0);
    }

    public MBDiscussion fetchMBDiscussion(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBDiscussion fetchMBDiscussionByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMBDiscussionByUuidAndCompanyId(param0, param1);
    }

    public MBDiscussion fetchMBDiscussionByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMBDiscussionByUuidAndGroupId(param0, param1);
    }

    public MBDiscussion getMBDiscussion(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBDiscussion getMBDiscussionByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBDiscussionByUuidAndCompanyId(param0, param1);
    }

    public MBDiscussion getMBDiscussionByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBDiscussionByUuidAndGroupId(param0, param1);
    }

    public List<MBDiscussion> getMBDiscussions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMBDiscussions(param0, param1);
    }

    public MBDiscussion createMBDiscussion(long param0) {
        return this.mockObject.createMBDiscussion(param0);
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
