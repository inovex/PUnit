
package com.liferay.portal.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.LayoutSet;
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
public class LayoutSetLocalServiceMock
    extends MockService<LayoutSetLocalService>
    implements LayoutSetLocalService
{

    private HashMap<Long, LayoutSet> _serviceObjects = new HashMap<Long, LayoutSet>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.LayoutSetLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public LayoutSet updateLogo(long param0, boolean param1, boolean param2, InputStream param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLogo(param0, param1, param2, param3);
    }

    public LayoutSet updateLogo(long param0, boolean param1, boolean param2, InputStream param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLogo(param0, param1, param2, param3, param4);
    }

    public LayoutSet updateLogo(long param0, boolean param1, boolean param2, byte[] param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLogo(param0, param1, param2, param3);
    }

    public LayoutSet updateLogo(long param0, boolean param1, boolean param2, File param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLogo(param0, param1, param2, param3);
    }

    public LayoutSet updateLookAndFeel(long param0, boolean param1, String param2, String param3, String param4, boolean param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLookAndFeel(param0, param1, param2, param3, param4, param5);
    }

    public void updateLookAndFeel(long param0, String param1, String param2, String param3, boolean param4)
        throws PortalException, SystemException
    {
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

    public int getLayoutSetsCount()
        throws SystemException
    {
        return this.mockObject.getLayoutSetsCount();
    }

    public LayoutSet updateLayoutSet(LayoutSet param0)
        throws SystemException
    {
        return this.mockObject.updateLayoutSet(param0);
    }

    public List<LayoutSet> getLayoutSetsByLayoutSetPrototypeUuid(String param0)
        throws SystemException
    {
        return this.mockObject.getLayoutSetsByLayoutSetPrototypeUuid(param0);
    }

    public void updateLayoutSetPrototypeLinkEnabled(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void updateLayoutSetPrototypeLinkEnabled(long param0, boolean param1, boolean param2, String param3)
        throws PortalException, SystemException
    {
    }

    public LayoutSet updatePageCount(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePageCount(param0, param1);
    }

    public LayoutSet createLayoutSet(long param0) {
        return this.mockObject.createLayoutSet(param0);
    }

    public void deleteLayoutSet(long param0, boolean param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public LayoutSet deleteLayoutSet(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutSet(param0);
    }

    public LayoutSet deleteLayoutSet(LayoutSet param0)
        throws SystemException
    {
        return this.mockObject.deleteLayoutSet(param0);
    }

    public LayoutSet fetchLayoutSet(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutSet fetchLayoutSet(String param0)
        throws SystemException
    {
        return this.mockObject.fetchLayoutSet(param0);
    }

    public List<LayoutSet> getLayoutSets(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLayoutSets(param0, param1);
    }

    public LayoutSet updateSettings(long param0, boolean param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateSettings(param0, param1, param2);
    }

    public LayoutSet updateVirtualHost(long param0, boolean param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateVirtualHost(param0, param1, param2);
    }

    public LayoutSet addLayoutSet(LayoutSet param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public LayoutSet addLayoutSet(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayoutSet(param0, param1);
    }

    public LayoutSet getLayoutSet(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutSet(param0, param1);
    }

    public LayoutSet getLayoutSet(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutSet getLayoutSet(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutSet(param0);
    }

}
