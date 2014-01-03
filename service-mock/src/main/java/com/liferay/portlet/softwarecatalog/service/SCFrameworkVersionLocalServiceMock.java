
package com.liferay.portlet.softwarecatalog.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion;
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
public class SCFrameworkVersionLocalServiceMock
    extends MockService<SCFrameworkVersionLocalService>
    implements SCFrameworkVersionLocalService
{

    private HashMap<Long, SCFrameworkVersion> _serviceObjects = new HashMap<Long, SCFrameworkVersion>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.softwarecatalog.service.SCFrameworkVersionLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public SCFrameworkVersion createSCFrameworkVersion(long param0) {
        return this.mockObject.createSCFrameworkVersion(param0);
    }

    public void deleteFrameworkVersion(SCFrameworkVersion param0)
        throws SystemException
    {
    }

    public void deleteFrameworkVersion(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteFrameworkVersions(long param0)
        throws SystemException
    {
    }

    public SCFrameworkVersion getFrameworkVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getFrameworkVersion(param0);
    }

    public List<SCFrameworkVersion> getFrameworkVersions(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getFrameworkVersions(param0, param1);
    }

    public List<SCFrameworkVersion> getFrameworkVersions(long param0, boolean param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getFrameworkVersions(param0, param1, param2, param3);
    }

    public List<SCFrameworkVersion> getFrameworkVersions(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getFrameworkVersions(param0, param1, param2);
    }

    public int getFrameworkVersionsCount(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getFrameworkVersionsCount(param0, param1);
    }

    public int getFrameworkVersionsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getFrameworkVersionsCount(param0);
    }

    public List<SCFrameworkVersion> getProductVersionFrameworkVersions(long param0)
        throws SystemException
    {
        return this.mockObject.getProductVersionFrameworkVersions(param0);
    }

    public SCFrameworkVersion updateFrameworkVersion(long param0, String param1, String param2, boolean param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFrameworkVersion(param0, param1, param2, param3, param4);
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

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public long dynamicQueryCount(DynamicQuery param0, Projection param1)
        throws SystemException
    {
        return this.mockObject.dynamicQueryCount(param0, param1);
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

    public void addSCProductVersionSCFrameworkVersion(long param0, long param1)
        throws SystemException
    {
    }

    public void addSCProductVersionSCFrameworkVersion(long param0, SCFrameworkVersion param1)
        throws SystemException
    {
    }

    public void addSCProductVersionSCFrameworkVersions(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addSCProductVersionSCFrameworkVersions(long param0, List<SCFrameworkVersion> param1)
        throws SystemException
    {
    }

    public void clearSCProductVersionSCFrameworkVersions(long param0)
        throws SystemException
    {
    }

    public void deleteSCProductVersionSCFrameworkVersion(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteSCProductVersionSCFrameworkVersion(long param0, SCFrameworkVersion param1)
        throws SystemException
    {
    }

    public void deleteSCProductVersionSCFrameworkVersions(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteSCProductVersionSCFrameworkVersions(long param0, List<SCFrameworkVersion> param1)
        throws SystemException
    {
    }

    public List<SCFrameworkVersion> getSCProductVersionSCFrameworkVersions(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getSCProductVersionSCFrameworkVersions(param0, param1, param2, param3);
    }

    public List<SCFrameworkVersion> getSCProductVersionSCFrameworkVersions(long param0)
        throws SystemException
    {
        return this.mockObject.getSCProductVersionSCFrameworkVersions(param0);
    }

    public List<SCFrameworkVersion> getSCProductVersionSCFrameworkVersions(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getSCProductVersionSCFrameworkVersions(param0, param1, param2);
    }

    public int getSCProductVersionSCFrameworkVersionsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getSCProductVersionSCFrameworkVersionsCount(param0);
    }

    public boolean hasSCProductVersionSCFrameworkVersion(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasSCProductVersionSCFrameworkVersion(param0, param1);
    }

    public boolean hasSCProductVersionSCFrameworkVersions(long param0)
        throws SystemException
    {
        return this.mockObject.hasSCProductVersionSCFrameworkVersions(param0);
    }

    public void setSCProductVersionSCFrameworkVersions(long param0, long[] param1)
        throws SystemException
    {
    }

    public SCFrameworkVersion addFrameworkVersion(long param0, String param1, String param2, boolean param3, int param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addFrameworkVersion(param0, param1, param2, param3, param4, param5);
    }

    public void addFrameworkVersionResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addFrameworkVersionResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addFrameworkVersionResources(SCFrameworkVersion param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addFrameworkVersionResources(SCFrameworkVersion param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public SCFrameworkVersion fetchSCFrameworkVersion(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SCFrameworkVersion getSCFrameworkVersion(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SCFrameworkVersion> getSCFrameworkVersions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSCFrameworkVersions(param0, param1);
    }

    public int getSCFrameworkVersionsCount()
        throws SystemException
    {
        return this.mockObject.getSCFrameworkVersionsCount();
    }

    public SCFrameworkVersion updateSCFrameworkVersion(SCFrameworkVersion param0)
        throws SystemException
    {
        return this.mockObject.updateSCFrameworkVersion(param0);
    }

    public SCFrameworkVersion deleteSCFrameworkVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSCFrameworkVersion(param0);
    }

    public SCFrameworkVersion deleteSCFrameworkVersion(SCFrameworkVersion param0)
        throws SystemException
    {
        return this.mockObject.deleteSCFrameworkVersion(param0);
    }

    public SCFrameworkVersion addSCFrameworkVersion(SCFrameworkVersion param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

}
