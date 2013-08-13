
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.LocalRepository;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.UnicodeProperties;
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
public class RepositoryLocalServiceMock
    extends MockService<RepositoryLocalService>
    implements RepositoryLocalService
{

    private HashMap<Long, com.liferay.portal.model.Repository> _serviceObjects = new HashMap<Long, com.liferay.portal.model.Repository>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.RepositoryLocalService.class));
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

    public UnicodeProperties getTypeSettingsProperties(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTypeSettingsProperties(param0);
    }

    public com.liferay.portal.model.Repository getRepository(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public com.liferay.portal.model.Repository addRepository(com.liferay.portal.model.Repository param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public long addRepository(long param0, long param1, long param2, long param3, String param4, String param5, String param6, UnicodeProperties param7, ServiceContext param8)
        throws PortalException, SystemException
    {
        return this.mockObject.addRepository(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public com.liferay.portal.model.Repository createRepository(long param0) {
        return this.mockObject.createRepository(param0);
    }

    public com.liferay.portal.model.Repository deleteRepository(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteRepository(param0);
    }

    public com.liferay.portal.model.Repository deleteRepository(com.liferay.portal.model.Repository param0)
        throws SystemException
    {
        return this.mockObject.deleteRepository(param0);
    }

    public com.liferay.portal.model.Repository fetchRepository(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public com.liferay.portal.model.Repository getRepositoryByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getRepositoryByUuidAndGroupId(param0, param1);
    }

    public List<com.liferay.portal.model.Repository> getRepositories(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRepositories(param0, param1);
    }

    public int getRepositoriesCount()
        throws SystemException
    {
        return this.mockObject.getRepositoriesCount();
    }

    public com.liferay.portal.model.Repository updateRepository(com.liferay.portal.model.Repository param0)
        throws SystemException
    {
        return this.mockObject.updateRepository(param0);
    }

    public com.liferay.portal.model.Repository updateRepository(com.liferay.portal.model.Repository param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateRepository(param0, param1);
    }

    public void updateRepository(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void checkRepository(long param0)
        throws SystemException
    {
    }

    public void deleteRepositories(long param0)
        throws PortalException, SystemException
    {
    }

    public LocalRepository getLocalRepositoryImpl(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLocalRepositoryImpl(param0);
    }

    public LocalRepository getLocalRepositoryImpl(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLocalRepositoryImpl(param0, param1, param2);
    }

    public com.liferay.portal.kernel.repository.Repository getRepositoryImpl(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRepositoryImpl(param0);
    }

    public com.liferay.portal.kernel.repository.Repository getRepositoryImpl(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getRepositoryImpl(param0, param1, param2);
    }

}
