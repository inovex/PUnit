
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletContext;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.ServiceComponent;

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
public class ServiceComponentLocalServiceMock
    extends MockService<ServiceComponentLocalService>
    implements ServiceComponentLocalService
{

    private HashMap<Long, ServiceComponent> _serviceObjects = new HashMap<Long, ServiceComponent>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ServiceComponentLocalService.class));
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

    public ServiceComponent addServiceComponent(ServiceComponent param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ServiceComponent createServiceComponent(long param0) {
        return this.mockObject.createServiceComponent(param0);
    }

    public ServiceComponent deleteServiceComponent(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteServiceComponent(param0);
    }

    public ServiceComponent deleteServiceComponent(ServiceComponent param0)
        throws SystemException
    {
        return this.mockObject.deleteServiceComponent(param0);
    }

    public ServiceComponent fetchServiceComponent(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ServiceComponent getServiceComponent(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<ServiceComponent> getServiceComponents(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getServiceComponents(param0, param1);
    }

    public int getServiceComponentsCount()
        throws SystemException
    {
        return this.mockObject.getServiceComponentsCount();
    }

    public ServiceComponent updateServiceComponent(ServiceComponent param0)
        throws SystemException
    {
        return this.mockObject.updateServiceComponent(param0);
    }

    public ServiceComponent updateServiceComponent(ServiceComponent param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateServiceComponent(param0, param1);
    }

    public void destroyServiceComponent(ServletContext param0, ClassLoader param1)
        throws SystemException
    {
    }

    public ServiceComponent initServiceComponent(ServletContext param0, ClassLoader param1, String param2, long param3, long param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.initServiceComponent(param0, param1, param2, param3, param4, param5);
    }

    public void upgradeDB(ClassLoader param0, String param1, long param2, boolean param3, ServiceComponent param4, String param5, String param6, String param7)
        throws Exception
    {
    }

    public void verifyDB()
        throws SystemException
    {
    }

}
