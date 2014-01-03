
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.OrgLabor;
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
public class OrgLaborLocalServiceMock
    extends MockService<OrgLaborLocalService>
    implements OrgLaborLocalService
{

    private HashMap<Long, OrgLabor> _serviceObjects = new HashMap<Long, OrgLabor>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.OrgLaborLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public OrgLabor fetchOrgLabor(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<OrgLabor> getOrgLabors(long param0)
        throws SystemException
    {
        return this.mockObject.getOrgLabors(param0);
    }

    public List<OrgLabor> getOrgLabors(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getOrgLabors(param0, param1);
    }

    public int getOrgLaborsCount()
        throws SystemException
    {
        return this.mockObject.getOrgLaborsCount();
    }

    public OrgLabor updateOrgLabor(OrgLabor param0)
        throws SystemException
    {
        return this.mockObject.updateOrgLabor(param0);
    }

    public OrgLabor updateOrgLabor(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15)
        throws PortalException, SystemException
    {
        return this.mockObject.updateOrgLabor(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15);
    }

    public OrgLabor addOrgLabor(OrgLabor param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public OrgLabor addOrgLabor(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15)
        throws PortalException, SystemException
    {
        return this.mockObject.addOrgLabor(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15);
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

    public OrgLabor createOrgLabor(long param0) {
        return this.mockObject.createOrgLabor(param0);
    }

    public OrgLabor deleteOrgLabor(OrgLabor param0)
        throws SystemException
    {
        return this.mockObject.deleteOrgLabor(param0);
    }

    public OrgLabor deleteOrgLabor(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteOrgLabor(param0);
    }

    public OrgLabor getOrgLabor(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

}
