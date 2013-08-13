
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.WorkflowDefinitionLink;

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
public class WorkflowDefinitionLinkLocalServiceMock
    extends MockService<WorkflowDefinitionLinkLocalService>
    implements WorkflowDefinitionLinkLocalService
{

    private HashMap<Long, WorkflowDefinitionLink> _serviceObjects = new HashMap<Long, WorkflowDefinitionLink>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.WorkflowDefinitionLinkLocalService.class));
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

    public WorkflowDefinitionLink addWorkflowDefinitionLink(WorkflowDefinitionLink param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public WorkflowDefinitionLink addWorkflowDefinitionLink(long param0, long param1, long param2, String param3, long param4, long param5, String param6, int param7)
        throws PortalException, SystemException
    {
        return this.mockObject.addWorkflowDefinitionLink(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public WorkflowDefinitionLink createWorkflowDefinitionLink(long param0) {
        return this.mockObject.createWorkflowDefinitionLink(param0);
    }

    public WorkflowDefinitionLink deleteWorkflowDefinitionLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWorkflowDefinitionLink(param0);
    }

    public WorkflowDefinitionLink deleteWorkflowDefinitionLink(WorkflowDefinitionLink param0)
        throws SystemException
    {
        return this.mockObject.deleteWorkflowDefinitionLink(param0);
    }

    public void deleteWorkflowDefinitionLink(long param0, long param1, String param2, long param3, long param4)
        throws PortalException, SystemException
    {
    }

    public WorkflowDefinitionLink fetchWorkflowDefinitionLink(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public WorkflowDefinitionLink getWorkflowDefinitionLink(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public WorkflowDefinitionLink getWorkflowDefinitionLink(long param0, long param1, String param2, long param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getWorkflowDefinitionLink(param0, param1, param2, param3, param4);
    }

    public WorkflowDefinitionLink getWorkflowDefinitionLink(long param0, long param1, String param2, long param3, long param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getWorkflowDefinitionLink(param0, param1, param2, param3, param4, param5);
    }

    public List<WorkflowDefinitionLink> getWorkflowDefinitionLinks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getWorkflowDefinitionLinks(param0, param1);
    }

    public int getWorkflowDefinitionLinksCount()
        throws SystemException
    {
        return this.mockObject.getWorkflowDefinitionLinksCount();
    }

    public int getWorkflowDefinitionLinksCount(long param0, String param1, int param2)
        throws SystemException
    {
        return this.mockObject.getWorkflowDefinitionLinksCount(param0, param1, param2);
    }

    public WorkflowDefinitionLink updateWorkflowDefinitionLink(WorkflowDefinitionLink param0)
        throws SystemException
    {
        return this.mockObject.updateWorkflowDefinitionLink(param0);
    }

    public WorkflowDefinitionLink updateWorkflowDefinitionLink(WorkflowDefinitionLink param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateWorkflowDefinitionLink(param0, param1);
    }

    public void updateWorkflowDefinitionLink(long param0, long param1, long param2, String param3, long param4, long param5, String param6)
        throws PortalException, SystemException
    {
    }

    public WorkflowDefinitionLink updateWorkflowDefinitionLink(long param0, long param1, long param2, String param3, long param4, long param5, String param6, int param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateWorkflowDefinitionLink(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public WorkflowDefinitionLink getDefaultWorkflowDefinitionLink(long param0, String param1, long param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultWorkflowDefinitionLink(param0, param1, param2, param3);
    }

    public boolean hasWorkflowDefinitionLink(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.hasWorkflowDefinitionLink(param0, param1, param2);
    }

    public boolean hasWorkflowDefinitionLink(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasWorkflowDefinitionLink(param0, param1, param2, param3);
    }

    public boolean hasWorkflowDefinitionLink(long param0, long param1, String param2, long param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.hasWorkflowDefinitionLink(param0, param1, param2, param3, param4);
    }

    public void updateWorkflowDefinitionLinks(long param0, long param1, long param2, String param3, long param4, List<ObjectValuePair<Long, String>> param5)
        throws PortalException, SystemException
    {
    }

}
