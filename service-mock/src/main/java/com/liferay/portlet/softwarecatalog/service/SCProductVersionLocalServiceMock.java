
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
import com.liferay.portlet.softwarecatalog.model.SCProductVersion;
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
public class SCProductVersionLocalServiceMock
    extends MockService<SCProductVersionLocalService>
    implements SCProductVersionLocalService
{

    private HashMap<Long, SCProductVersion> _serviceObjects = new HashMap<Long, SCProductVersion>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.softwarecatalog.service.SCProductVersionLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public SCProductVersion addSCProductVersion(SCProductVersion param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SCProductVersion createSCProductVersion(long param0) {
        return this.mockObject.createSCProductVersion(param0);
    }

    public SCProductVersion deleteSCProductVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSCProductVersion(param0);
    }

    public SCProductVersion deleteSCProductVersion(SCProductVersion param0)
        throws SystemException
    {
        return this.mockObject.deleteSCProductVersion(param0);
    }

    public void addSCFrameworkVersionSCProductVersion(long param0, SCProductVersion param1)
        throws SystemException
    {
    }

    public void addSCFrameworkVersionSCProductVersion(long param0, long param1)
        throws SystemException
    {
    }

    public void addSCFrameworkVersionSCProductVersions(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addSCFrameworkVersionSCProductVersions(long param0, List<SCProductVersion> param1)
        throws SystemException
    {
    }

    public void clearSCFrameworkVersionSCProductVersions(long param0)
        throws SystemException
    {
    }

    public void deleteSCFrameworkVersionSCProductVersion(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteSCFrameworkVersionSCProductVersion(long param0, SCProductVersion param1)
        throws SystemException
    {
    }

    public void deleteSCFrameworkVersionSCProductVersions(long param0, List<SCProductVersion> param1)
        throws SystemException
    {
    }

    public void deleteSCFrameworkVersionSCProductVersions(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<SCProductVersion> getSCFrameworkVersionSCProductVersions(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getSCFrameworkVersionSCProductVersions(param0, param1, param2, param3);
    }

    public List<SCProductVersion> getSCFrameworkVersionSCProductVersions(long param0)
        throws SystemException
    {
        return this.mockObject.getSCFrameworkVersionSCProductVersions(param0);
    }

    public List<SCProductVersion> getSCFrameworkVersionSCProductVersions(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getSCFrameworkVersionSCProductVersions(param0, param1, param2);
    }

    public int getSCFrameworkVersionSCProductVersionsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getSCFrameworkVersionSCProductVersionsCount(param0);
    }

    public boolean hasSCFrameworkVersionSCProductVersion(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasSCFrameworkVersionSCProductVersion(param0, param1);
    }

    public boolean hasSCFrameworkVersionSCProductVersions(long param0)
        throws SystemException
    {
        return this.mockObject.hasSCFrameworkVersionSCProductVersions(param0);
    }

    public void setSCFrameworkVersionSCProductVersions(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteProductVersion(SCProductVersion param0)
        throws SystemException
    {
    }

    public void deleteProductVersion(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteProductVersions(long param0)
        throws SystemException
    {
    }

    public SCProductVersion getProductVersion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getProductVersion(param0);
    }

    public SCProductVersion getProductVersionByDirectDownloadURL(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getProductVersionByDirectDownloadURL(param0);
    }

    public List<SCProductVersion> getProductVersions(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getProductVersions(param0, param1, param2);
    }

    public int getProductVersionsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getProductVersionsCount(param0);
    }

    public SCProductVersion updateProductVersion(long param0, String param1, String param2, String param3, String param4, boolean param5, boolean param6, long[] param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateProductVersion(param0, param1, param2, param3, param4, param5, param6, param7);
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

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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

    public SCProductVersion fetchSCProductVersion(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SCProductVersion getSCProductVersion(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SCProductVersion> getSCProductVersions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSCProductVersions(param0, param1);
    }

    public int getSCProductVersionsCount()
        throws SystemException
    {
        return this.mockObject.getSCProductVersionsCount();
    }

    public SCProductVersion updateSCProductVersion(SCProductVersion param0)
        throws SystemException
    {
        return this.mockObject.updateSCProductVersion(param0);
    }

    public SCProductVersion addProductVersion(long param0, long param1, String param2, String param3, String param4, String param5, boolean param6, boolean param7, long[] param8, ServiceContext param9)
        throws PortalException, SystemException
    {
        return this.mockObject.addProductVersion(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

}
