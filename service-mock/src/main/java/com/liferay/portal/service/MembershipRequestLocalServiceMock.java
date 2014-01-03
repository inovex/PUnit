
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.MembershipRequest;
import com.liferay.portal.model.PersistedModel;
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
public class MembershipRequestLocalServiceMock
    extends MockService<MembershipRequestLocalService>
    implements MembershipRequestLocalService
{

    private HashMap<Long, MembershipRequest> _serviceObjects = new HashMap<Long, MembershipRequest>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.MembershipRequestLocalService.class));
    }

    public List<MembershipRequest> search(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public int searchCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1);
    }

    public MembershipRequest updateMembershipRequest(MembershipRequest param0)
        throws SystemException
    {
        return this.mockObject.updateMembershipRequest(param0);
    }

    public MembershipRequest deleteMembershipRequest(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMembershipRequest(param0);
    }

    public MembershipRequest deleteMembershipRequest(MembershipRequest param0)
        throws SystemException
    {
        return this.mockObject.deleteMembershipRequest(param0);
    }

    public MembershipRequest fetchMembershipRequest(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MembershipRequest getMembershipRequest(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<MembershipRequest> getMembershipRequests(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMembershipRequests(param0, param1);
    }

    public List<MembershipRequest> getMembershipRequests(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getMembershipRequests(param0, param1, param2);
    }

    public int getMembershipRequestsCount()
        throws SystemException
    {
        return this.mockObject.getMembershipRequestsCount();
    }

    public MembershipRequest addMembershipRequest(MembershipRequest param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MembershipRequest addMembershipRequest(long param0, long param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addMembershipRequest(param0, param1, param2, param3);
    }

    public MembershipRequest createMembershipRequest(long param0) {
        return this.mockObject.createMembershipRequest(param0);
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

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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

    public void deleteMembershipRequests(long param0, int param1)
        throws SystemException
    {
    }

    public void deleteMembershipRequests(long param0)
        throws SystemException
    {
    }

    public void deleteMembershipRequestsByUserId(long param0)
        throws SystemException
    {
    }

    public boolean hasMembershipRequest(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.hasMembershipRequest(param0, param1, param2);
    }

    public void updateStatus(long param0, long param1, String param2, int param3, boolean param4, ServiceContext param5)
        throws PortalException, SystemException
    {
    }

}
