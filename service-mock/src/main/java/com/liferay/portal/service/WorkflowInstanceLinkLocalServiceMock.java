
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.WorkflowInstanceLink;
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
public class WorkflowInstanceLinkLocalServiceMock
    extends MockService<WorkflowInstanceLinkLocalService>
    implements WorkflowInstanceLinkLocalService
{

    private HashMap<Long, WorkflowInstanceLink> _serviceObjects = new HashMap<Long, WorkflowInstanceLink>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.WorkflowInstanceLinkLocalService.class));
    }

    public String getState(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getState(param0, param1, param2, param3);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<WorkflowInstanceLink> getWorkflowInstanceLinks(long param0, long param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.getWorkflowInstanceLinks(param0, param1, param2, param3);
    }

    public List<WorkflowInstanceLink> getWorkflowInstanceLinks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getWorkflowInstanceLinks(param0, param1);
    }

    public WorkflowInstanceLink addWorkflowInstanceLink(WorkflowInstanceLink param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public WorkflowInstanceLink addWorkflowInstanceLink(long param0, long param1, long param2, String param3, long param4, long param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addWorkflowInstanceLink(param0, param1, param2, param3, param4, param5);
    }

    public int getWorkflowInstanceLinksCount()
        throws SystemException
    {
        return this.mockObject.getWorkflowInstanceLinksCount();
    }

    public WorkflowInstanceLink updateWorkflowInstanceLink(WorkflowInstanceLink param0)
        throws SystemException
    {
        return this.mockObject.updateWorkflowInstanceLink(param0);
    }

    public void deleteWorkflowInstanceLinks(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
    }

    public boolean hasWorkflowInstanceLink(long param0, long param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.hasWorkflowInstanceLink(param0, param1, param2, param3);
    }

    public boolean isEnded(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.isEnded(param0, param1, param2, param3);
    }

    public void startWorkflowInstance(long param0, long param1, long param2, String param3, long param4, Map<String, Serializable> param5)
        throws PortalException, SystemException
    {
    }

    public void updateClassPK(long param0, long param1, String param2, long param3, long param4)
        throws PortalException, SystemException
    {
    }

    public WorkflowInstanceLink deleteWorkflowInstanceLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWorkflowInstanceLink(param0);
    }

    public WorkflowInstanceLink deleteWorkflowInstanceLink(WorkflowInstanceLink param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWorkflowInstanceLink(param0);
    }

    public WorkflowInstanceLink deleteWorkflowInstanceLink(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWorkflowInstanceLink(param0, param1, param2, param3);
    }

    public WorkflowInstanceLink fetchWorkflowInstanceLink(long param0, long param1, String param2, long param3)
        throws SystemException
    {
        return this.mockObject.fetchWorkflowInstanceLink(param0, param1, param2, param3);
    }

    public WorkflowInstanceLink fetchWorkflowInstanceLink(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public WorkflowInstanceLink getWorkflowInstanceLink(long param0, long param1, String param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getWorkflowInstanceLink(param0, param1, param2, param3);
    }

    public WorkflowInstanceLink getWorkflowInstanceLink(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public WorkflowInstanceLink createWorkflowInstanceLink(long param0) {
        return this.mockObject.createWorkflowInstanceLink(param0);
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
