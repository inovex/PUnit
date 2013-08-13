
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.LayoutSetBranch;
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
public class LayoutSetBranchLocalServiceMock
    extends MockService<LayoutSetBranchLocalService>
    implements LayoutSetBranchLocalService
{

    private HashMap<Long, LayoutSetBranch> _serviceObjects = new HashMap<Long, LayoutSetBranch>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.LayoutSetBranchLocalService.class));
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

    public LayoutSetBranch addLayoutSetBranch(LayoutSetBranch param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public LayoutSetBranch addLayoutSetBranch(long param0, long param1, boolean param2, String param3, String param4, boolean param5, long param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayoutSetBranch(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public LayoutSetBranch createLayoutSetBranch(long param0) {
        return this.mockObject.createLayoutSetBranch(param0);
    }

    public LayoutSetBranch deleteLayoutSetBranch(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutSetBranch(param0);
    }

    public LayoutSetBranch deleteLayoutSetBranch(LayoutSetBranch param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutSetBranch(param0);
    }

    public LayoutSetBranch deleteLayoutSetBranch(LayoutSetBranch param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutSetBranch(param0, param1);
    }

    public LayoutSetBranch fetchLayoutSetBranch(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutSetBranch getLayoutSetBranch(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutSetBranch getLayoutSetBranch(long param0, boolean param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutSetBranch(param0, param1, param2);
    }

    public List<LayoutSetBranch> getLayoutSetBranchs(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLayoutSetBranchs(param0, param1);
    }

    public int getLayoutSetBranchsCount()
        throws SystemException
    {
        return this.mockObject.getLayoutSetBranchsCount();
    }

    public LayoutSetBranch updateLayoutSetBranch(LayoutSetBranch param0)
        throws SystemException
    {
        return this.mockObject.updateLayoutSetBranch(param0);
    }

    public LayoutSetBranch updateLayoutSetBranch(LayoutSetBranch param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateLayoutSetBranch(param0, param1);
    }

    public LayoutSetBranch updateLayoutSetBranch(long param0, String param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayoutSetBranch(param0, param1, param2, param3);
    }

    public void deleteLayoutSetBranches(long param0, boolean param1)
        throws PortalException, SystemException
    {
    }

    public void deleteLayoutSetBranches(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public List<LayoutSetBranch> getLayoutSetBranches(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getLayoutSetBranches(param0, param1);
    }

    public LayoutSetBranch getMasterLayoutSetBranch(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMasterLayoutSetBranch(param0, param1);
    }

    public LayoutSetBranch getUserLayoutSetBranch(long param0, long param1, boolean param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserLayoutSetBranch(param0, param1, param2, param3);
    }

    public LayoutSetBranch getUserLayoutSetBranch(long param0, long param1, boolean param2, long param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserLayoutSetBranch(param0, param1, param2, param3, param4);
    }

    public LayoutSetBranch mergeLayoutSetBranch(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.mergeLayoutSetBranch(param0, param1, param2);
    }

}
