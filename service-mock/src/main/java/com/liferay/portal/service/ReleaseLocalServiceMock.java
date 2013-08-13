
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Release;

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
public class ReleaseLocalServiceMock
    extends MockService<ReleaseLocalService>
    implements ReleaseLocalService
{

    private HashMap<Long, Release> _serviceObjects = new HashMap<Long, Release>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ReleaseLocalService.class));
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

    public Release addRelease(Release param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Release addRelease(String param0, int param1)
        throws SystemException
    {
        return this.mockObject.addRelease(param0, param1);
    }

    public Release createRelease(long param0) {
        return this.mockObject.createRelease(param0);
    }

    public Release deleteRelease(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteRelease(param0);
    }

    public Release deleteRelease(Release param0)
        throws SystemException
    {
        return this.mockObject.deleteRelease(param0);
    }

    public Release fetchRelease(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Release getRelease(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Release getRelease(String param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getRelease(param0, param1);
    }

    public List<Release> getReleases(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getReleases(param0, param1);
    }

    public int getReleasesCount()
        throws SystemException
    {
        return this.mockObject.getReleasesCount();
    }

    public Release updateRelease(Release param0)
        throws SystemException
    {
        return this.mockObject.updateRelease(param0);
    }

    public Release updateRelease(Release param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateRelease(param0, param1);
    }

    public Release updateRelease(long param0, int param1, Date param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRelease(param0, param1, param2, param3);
    }

    public void createTablesAndPopulate()
        throws SystemException
    {
    }

    public int getBuildNumberOrCreate()
        throws PortalException, SystemException
    {
        return this.mockObject.getBuildNumberOrCreate();
    }

}
