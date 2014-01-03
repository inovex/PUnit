
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.ResourceAction;
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
public class ResourceActionLocalServiceMock
    extends MockService<ResourceActionLocalService>
    implements ResourceActionLocalService
{

    private HashMap<Long, ResourceAction> _serviceObjects = new HashMap<Long, ResourceAction>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ResourceActionLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public ResourceAction addResourceAction(ResourceAction param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public ResourceAction createResourceAction(long param0) {
        return this.mockObject.createResourceAction(param0);
    }

    public ResourceAction deleteResourceAction(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteResourceAction(param0);
    }

    public ResourceAction deleteResourceAction(ResourceAction param0)
        throws SystemException
    {
        return this.mockObject.deleteResourceAction(param0);
    }

    public ResourceAction fetchResourceAction(String param0, String param1) {
        return this.mockObject.fetchResourceAction(param0, param1);
    }

    public ResourceAction fetchResourceAction(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ResourceAction getResourceAction(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ResourceAction getResourceAction(String param0, String param1)
        throws PortalException
    {
        return this.mockObject.getResourceAction(param0, param1);
    }

    public List<ResourceAction> getResourceActions(String param0)
        throws SystemException
    {
        return this.mockObject.getResourceActions(param0);
    }

    public List<ResourceAction> getResourceActions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getResourceActions(param0, param1);
    }

    public int getResourceActionsCount()
        throws SystemException
    {
        return this.mockObject.getResourceActionsCount();
    }

    public ResourceAction updateResourceAction(ResourceAction param0)
        throws SystemException
    {
        return this.mockObject.updateResourceAction(param0);
    }

    public void checkResourceActions(String param0, List<String> param1)
        throws SystemException
    {
    }

    public void checkResourceActions(String param0, List<String> param1, boolean param2)
        throws SystemException
    {
    }

    public void checkResourceActions()
        throws SystemException
    {
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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
