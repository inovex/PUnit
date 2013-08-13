
package com.liferay.portlet.mobiledevicerules.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance;

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
public class MDRRuleGroupInstanceLocalServiceMock
    extends MockService<MDRRuleGroupInstanceLocalService>
    implements MDRRuleGroupInstanceLocalService
{

    private HashMap<Long, MDRRuleGroupInstance> _serviceObjects = new HashMap<Long, MDRRuleGroupInstance>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupInstanceLocalService.class));
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

    public MDRRuleGroupInstance getMDRRuleGroupInstance(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MDRRuleGroupInstance addMDRRuleGroupInstance(MDRRuleGroupInstance param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MDRRuleGroupInstance createMDRRuleGroupInstance(long param0) {
        return this.mockObject.createMDRRuleGroupInstance(param0);
    }

    public MDRRuleGroupInstance deleteMDRRuleGroupInstance(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMDRRuleGroupInstance(param0);
    }

    public MDRRuleGroupInstance deleteMDRRuleGroupInstance(MDRRuleGroupInstance param0)
        throws SystemException
    {
        return this.mockObject.deleteMDRRuleGroupInstance(param0);
    }

    public MDRRuleGroupInstance fetchMDRRuleGroupInstance(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MDRRuleGroupInstance getMDRRuleGroupInstanceByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMDRRuleGroupInstanceByUuidAndGroupId(param0, param1);
    }

    public List<MDRRuleGroupInstance> getMDRRuleGroupInstances(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMDRRuleGroupInstances(param0, param1);
    }

    public int getMDRRuleGroupInstancesCount()
        throws SystemException
    {
        return this.mockObject.getMDRRuleGroupInstancesCount();
    }

    public MDRRuleGroupInstance updateMDRRuleGroupInstance(MDRRuleGroupInstance param0)
        throws SystemException
    {
        return this.mockObject.updateMDRRuleGroupInstance(param0);
    }

    public MDRRuleGroupInstance updateMDRRuleGroupInstance(MDRRuleGroupInstance param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateMDRRuleGroupInstance(param0, param1);
    }

    public MDRRuleGroupInstance addRuleGroupInstance(long param0, String param1, long param2, long param3, int param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addRuleGroupInstance(param0, param1, param2, param3, param4, param5);
    }

    public MDRRuleGroupInstance addRuleGroupInstance(long param0, String param1, long param2, long param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addRuleGroupInstance(param0, param1, param2, param3, param4);
    }

    public void deleteGroupRuleGroupInstances(long param0)
        throws SystemException
    {
    }

    public void deleteRuleGroupInstance(long param0)
        throws SystemException
    {
    }

    public void deleteRuleGroupInstance(MDRRuleGroupInstance param0)
        throws SystemException
    {
    }

    public void deleteRuleGroupInstances(long param0)
        throws SystemException
    {
    }

    public MDRRuleGroupInstance fetchRuleGroupInstance(long param0)
        throws SystemException
    {
        return this.mockObject.fetchRuleGroupInstance(param0);
    }

    public MDRRuleGroupInstance fetchRuleGroupInstance(String param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.fetchRuleGroupInstance(param0, param1, param2);
    }

    public MDRRuleGroupInstance getRuleGroupInstance(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRuleGroupInstance(param0);
    }

    public MDRRuleGroupInstance getRuleGroupInstance(String param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getRuleGroupInstance(param0, param1, param2);
    }

    public List<MDRRuleGroupInstance> getRuleGroupInstances(long param0)
        throws SystemException
    {
        return this.mockObject.getRuleGroupInstances(param0);
    }

    public List<MDRRuleGroupInstance> getRuleGroupInstances(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRuleGroupInstances(param0, param1, param2);
    }

    public List<MDRRuleGroupInstance> getRuleGroupInstances(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getRuleGroupInstances(param0, param1);
    }

    public List<MDRRuleGroupInstance> getRuleGroupInstances(String param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getRuleGroupInstances(param0, param1, param2, param3, param4);
    }

    public int getRuleGroupInstancesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRuleGroupInstancesCount(param0);
    }

    public int getRuleGroupInstancesCount(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getRuleGroupInstancesCount(param0, param1);
    }

    public MDRRuleGroupInstance updateRuleGroupInstance(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRuleGroupInstance(param0, param1);
    }

}
