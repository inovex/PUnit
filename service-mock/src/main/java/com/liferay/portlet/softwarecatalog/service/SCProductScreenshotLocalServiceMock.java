
package com.liferay.portlet.softwarecatalog.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.softwarecatalog.model.SCProductScreenshot;

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
public class SCProductScreenshotLocalServiceMock
    extends MockService<SCProductScreenshotLocalService>
    implements SCProductScreenshotLocalService
{

    private HashMap<Long, SCProductScreenshot> _serviceObjects = new HashMap<Long, SCProductScreenshot>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.softwarecatalog.service.SCProductScreenshotLocalService.class));
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

    public SCProductScreenshot addSCProductScreenshot(SCProductScreenshot param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SCProductScreenshot createSCProductScreenshot(long param0) {
        return this.mockObject.createSCProductScreenshot(param0);
    }

    public SCProductScreenshot deleteSCProductScreenshot(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSCProductScreenshot(param0);
    }

    public SCProductScreenshot deleteSCProductScreenshot(SCProductScreenshot param0)
        throws SystemException
    {
        return this.mockObject.deleteSCProductScreenshot(param0);
    }

    public SCProductScreenshot fetchSCProductScreenshot(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SCProductScreenshot getSCProductScreenshot(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SCProductScreenshot> getSCProductScreenshots(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSCProductScreenshots(param0, param1);
    }

    public int getSCProductScreenshotsCount()
        throws SystemException
    {
        return this.mockObject.getSCProductScreenshotsCount();
    }

    public SCProductScreenshot updateSCProductScreenshot(SCProductScreenshot param0)
        throws SystemException
    {
        return this.mockObject.updateSCProductScreenshot(param0);
    }

    public SCProductScreenshot updateSCProductScreenshot(SCProductScreenshot param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateSCProductScreenshot(param0, param1);
    }

    public void deleteProductScreenshot(SCProductScreenshot param0)
        throws PortalException, SystemException
    {
    }

    public void deleteProductScreenshots(long param0)
        throws PortalException, SystemException
    {
    }

    public SCProductScreenshot getProductScreenshot(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getProductScreenshot(param0, param1);
    }

    public SCProductScreenshot getProductScreenshotByFullImageId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getProductScreenshotByFullImageId(param0);
    }

    public SCProductScreenshot getProductScreenshotByThumbnailId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getProductScreenshotByThumbnailId(param0);
    }

    public List<SCProductScreenshot> getProductScreenshots(long param0)
        throws SystemException
    {
        return this.mockObject.getProductScreenshots(param0);
    }

}
