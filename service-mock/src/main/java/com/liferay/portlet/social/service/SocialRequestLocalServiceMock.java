
package com.liferay.portlet.social.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.social.model.SocialRequest;

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
public class SocialRequestLocalServiceMock
    extends MockService<SocialRequestLocalService>
    implements SocialRequestLocalService
{

    private HashMap<Long, SocialRequest> _serviceObjects = new HashMap<Long, SocialRequest>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.service.SocialRequestLocalService.class));
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

    public SocialRequest addSocialRequest(SocialRequest param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SocialRequest createSocialRequest(long param0) {
        return this.mockObject.createSocialRequest(param0);
    }

    public SocialRequest deleteSocialRequest(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSocialRequest(param0);
    }

    public SocialRequest deleteSocialRequest(SocialRequest param0)
        throws SystemException
    {
        return this.mockObject.deleteSocialRequest(param0);
    }

    public SocialRequest fetchSocialRequest(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SocialRequest getSocialRequest(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SocialRequest getSocialRequestByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getSocialRequestByUuidAndGroupId(param0, param1);
    }

    public List<SocialRequest> getSocialRequests(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSocialRequests(param0, param1);
    }

    public int getSocialRequestsCount()
        throws SystemException
    {
        return this.mockObject.getSocialRequestsCount();
    }

    public SocialRequest updateSocialRequest(SocialRequest param0)
        throws SystemException
    {
        return this.mockObject.updateSocialRequest(param0);
    }

    public SocialRequest updateSocialRequest(SocialRequest param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateSocialRequest(param0, param1);
    }

    public SocialRequest addRequest(long param0, long param1, String param2, long param3, int param4, String param5, long param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addRequest(param0, param1, param2, param3, param4, param5, param6);
    }

    public void deleteReceiverUserRequests(long param0)
        throws SystemException
    {
    }

    public void deleteRequest(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteRequest(SocialRequest param0)
        throws SystemException
    {
    }

    public void deleteUserRequests(long param0)
        throws SystemException
    {
    }

    public List<SocialRequest> getReceiverUserRequests(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getReceiverUserRequests(param0, param1, param2);
    }

    public List<SocialRequest> getReceiverUserRequests(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getReceiverUserRequests(param0, param1, param2, param3);
    }

    public int getReceiverUserRequestsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getReceiverUserRequestsCount(param0);
    }

    public int getReceiverUserRequestsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getReceiverUserRequestsCount(param0, param1);
    }

    public List<SocialRequest> getUserRequests(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserRequests(param0, param1, param2);
    }

    public List<SocialRequest> getUserRequests(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getUserRequests(param0, param1, param2, param3);
    }

    public int getUserRequestsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserRequestsCount(param0);
    }

    public int getUserRequestsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUserRequestsCount(param0, param1);
    }

    public boolean hasRequest(long param0, String param1, long param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.hasRequest(param0, param1, param2, param3, param4);
    }

    public boolean hasRequest(long param0, String param1, long param2, int param3, long param4, int param5)
        throws SystemException
    {
        return this.mockObject.hasRequest(param0, param1, param2, param3, param4, param5);
    }

    public SocialRequest updateRequest(long param0, int param1, ThemeDisplay param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRequest(param0, param1, param2);
    }

}
