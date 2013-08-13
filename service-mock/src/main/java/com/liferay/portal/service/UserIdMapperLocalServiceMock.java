
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.UserIdMapper;

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
public class UserIdMapperLocalServiceMock
    extends MockService<UserIdMapperLocalService>
    implements UserIdMapperLocalService
{

    private HashMap<Long, UserIdMapper> _serviceObjects = new HashMap<Long, UserIdMapper>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.UserIdMapperLocalService.class));
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

    public UserIdMapper addUserIdMapper(UserIdMapper param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public UserIdMapper createUserIdMapper(long param0) {
        return this.mockObject.createUserIdMapper(param0);
    }

    public UserIdMapper deleteUserIdMapper(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteUserIdMapper(param0);
    }

    public UserIdMapper deleteUserIdMapper(UserIdMapper param0)
        throws SystemException
    {
        return this.mockObject.deleteUserIdMapper(param0);
    }

    public UserIdMapper fetchUserIdMapper(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserIdMapper getUserIdMapper(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public UserIdMapper getUserIdMapper(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserIdMapper(param0, param1);
    }

    public List<UserIdMapper> getUserIdMappers(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getUserIdMappers(param0, param1);
    }

    public List<UserIdMapper> getUserIdMappers(long param0)
        throws SystemException
    {
        return this.mockObject.getUserIdMappers(param0);
    }

    public int getUserIdMappersCount()
        throws SystemException
    {
        return this.mockObject.getUserIdMappersCount();
    }

    public UserIdMapper updateUserIdMapper(UserIdMapper param0)
        throws SystemException
    {
        return this.mockObject.updateUserIdMapper(param0);
    }

    public UserIdMapper updateUserIdMapper(UserIdMapper param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateUserIdMapper(param0, param1);
    }

    public UserIdMapper updateUserIdMapper(long param0, String param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.updateUserIdMapper(param0, param1, param2, param3);
    }

    public void deleteUserIdMappers(long param0)
        throws SystemException
    {
    }

    public UserIdMapper getUserIdMapperByExternalUserId(String param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserIdMapperByExternalUserId(param0, param1);
    }

}
