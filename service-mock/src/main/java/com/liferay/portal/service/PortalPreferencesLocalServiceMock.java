
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import javax.portlet.PortletPreferences;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
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
public class PortalPreferencesLocalServiceMock
    extends MockService<PortalPreferencesLocalService>
    implements PortalPreferencesLocalService
{

    private HashMap<Long, com.liferay.portal.model.PortalPreferences> _serviceObjects = new HashMap<Long, com.liferay.portal.model.PortalPreferences>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PortalPreferencesLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public com.liferay.portal.model.PortalPreferences addPortalPreferences(long param0, int param1, String param2)
        throws SystemException
    {
        return this.mockObject.addPortalPreferences(param0, param1, param2);
    }

    public com.liferay.portal.model.PortalPreferences addPortalPreferences(com.liferay.portal.model.PortalPreferences param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public com.liferay.portal.model.PortalPreferences addPortalPreferences(long param0, long param1, int param2, String param3)
        throws SystemException
    {
        return this.mockObject.addPortalPreferences(param0, param1, param2, param3);
    }

    public com.liferay.portal.model.PortalPreferences updatePortalPreferences(com.liferay.portal.model.PortalPreferences param0)
        throws SystemException
    {
        return this.mockObject.updatePortalPreferences(param0);
    }

    public com.liferay.portal.model.PortalPreferences deletePortalPreferences(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePortalPreferences(param0);
    }

    public com.liferay.portal.model.PortalPreferences deletePortalPreferences(com.liferay.portal.model.PortalPreferences param0)
        throws SystemException
    {
        return this.mockObject.deletePortalPreferences(param0);
    }

    public com.liferay.portal.model.PortalPreferences fetchPortalPreferences(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public com.liferay.portal.model.PortalPreferences getPortalPreferences(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<com.liferay.portal.model.PortalPreferences> getPortalPreferenceses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPortalPreferenceses(param0, param1);
    }

    public int getPortalPreferencesesCount()
        throws SystemException
    {
        return this.mockObject.getPortalPreferencesesCount();
    }

    public com.liferay.portal.model.PortalPreferences createPortalPreferences(long param0) {
        return this.mockObject.createPortalPreferences(param0);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
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

    public PortletPreferences getPreferences(long param0, long param1, int param2, String param3)
        throws SystemException
    {
        return this.mockObject.getPreferences(param0, param1, param2, param3);
    }

    public PortletPreferences getPreferences(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getPreferences(param0, param1, param2);
    }

    public PortletPreferences getPreferences(long param0, int param1, String param2)
        throws SystemException
    {
        return this.mockObject.getPreferences(param0, param1, param2);
    }

    public PortletPreferences getPreferences(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPreferences(param0, param1);
    }

    public com.liferay.portal.model.PortalPreferences updatePreferences(long param0, int param1, String param2)
        throws SystemException
    {
        return this.mockObject.updatePreferences(param0, param1, param2);
    }

    public com.liferay.portal.model.PortalPreferences updatePreferences(long param0, int param1, com.liferay.portlet.PortalPreferences param2)
        throws SystemException
    {
        return this.mockObject.updatePreferences(param0, param1, param2);
    }

}
