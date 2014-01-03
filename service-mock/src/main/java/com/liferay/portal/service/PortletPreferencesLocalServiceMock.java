
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.model.PortletPreferencesIds;
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
public class PortletPreferencesLocalServiceMock
    extends MockService<PortletPreferencesLocalService>
    implements PortletPreferencesLocalService
{

    private HashMap<Long, com.liferay.portal.model.PortletPreferences> _serviceObjects = new HashMap<Long, com.liferay.portal.model.PortletPreferences>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PortletPreferencesLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public com.liferay.portal.model.PortletPreferences createPortletPreferences(long param0) {
        return this.mockObject.createPortletPreferences(param0);
    }

    public com.liferay.portal.model.PortletPreferences deletePortletPreferences(com.liferay.portal.model.PortletPreferences param0)
        throws SystemException
    {
        return this.mockObject.deletePortletPreferences(param0);
    }

    public void deletePortletPreferences(long param0, int param1, long param2)
        throws SystemException
    {
    }

    public com.liferay.portal.model.PortletPreferences deletePortletPreferences(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePortletPreferences(param0);
    }

    public void deletePortletPreferences(long param0, int param1, long param2, String param3)
        throws PortalException, SystemException
    {
    }

    public com.liferay.portal.model.PortletPreferences fetchPortletPreferences(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public com.liferay.portal.model.PortletPreferences getPortletPreferences(long param0, int param1, long param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getPortletPreferences(param0, param1, param2, param3);
    }

    public com.liferay.portal.model.PortletPreferences getPortletPreferences(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(long param0, long param1, long param2, int param3, String param4, boolean param5)
        throws SystemException
    {
        return this.mockObject.getPortletPreferences(param0, param1, param2, param3, param4, param5);
    }

    public List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getPortletPreferences(param0, param1);
    }

    public List<com.liferay.portal.model.PortletPreferences> getPortletPreferences()
        throws SystemException
    {
        return this.mockObject.getPortletPreferences();
    }

    public List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(int param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getPortletPreferences(param0, param1, param2);
    }

    public List<com.liferay.portal.model.PortletPreferences> getPortletPreferences(long param0, int param1, long param2)
        throws SystemException
    {
        return this.mockObject.getPortletPreferences(param0, param1, param2);
    }

    public List<com.liferay.portal.model.PortletPreferences> getPortletPreferenceses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPortletPreferenceses(param0, param1);
    }

    public com.liferay.portal.model.PortletPreferences addPortletPreferences(long param0, long param1, int param2, long param3, String param4, Portlet param5, String param6)
        throws SystemException
    {
        return this.mockObject.addPortletPreferences(param0, param1, param2, param3, param4, param5, param6);
    }

    public com.liferay.portal.model.PortletPreferences addPortletPreferences(com.liferay.portal.model.PortletPreferences param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public javax.portlet.PortletPreferences getDefaultPreferences(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getDefaultPreferences(param0, param1);
    }

    public int getPortletPreferencesesCount()
        throws SystemException
    {
        return this.mockObject.getPortletPreferencesesCount();
    }

    public com.liferay.portal.model.PortletPreferences updatePortletPreferences(com.liferay.portal.model.PortletPreferences param0)
        throws SystemException
    {
        return this.mockObject.updatePortletPreferences(param0);
    }

    public void deletePortletPreferencesByPlid(long param0)
        throws SystemException
    {
    }

    public javax.portlet.PortletPreferences fetchPreferences(PortletPreferencesIds param0)
        throws SystemException
    {
        return this.mockObject.fetchPreferences(param0);
    }

    public javax.portlet.PortletPreferences fetchPreferences(long param0, long param1, int param2, long param3, String param4)
        throws SystemException
    {
        return this.mockObject.fetchPreferences(param0, param1, param2, param3, param4);
    }

    public List<com.liferay.portal.model.PortletPreferences> getPortletPreferencesByPlid(long param0)
        throws SystemException
    {
        return this.mockObject.getPortletPreferencesByPlid(param0);
    }

    public long getPortletPreferencesCount(int param0, String param1)
        throws SystemException
    {
        return this.mockObject.getPortletPreferencesCount(param0, param1);
    }

    public long getPortletPreferencesCount(long param0, int param1, long param2, Portlet param3, boolean param4)
        throws SystemException
    {
        return this.mockObject.getPortletPreferencesCount(param0, param1, param2, param3, param4);
    }

    public long getPortletPreferencesCount(int param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getPortletPreferencesCount(param0, param1, param2);
    }

    public long getPortletPreferencesCount(long param0, int param1, String param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.getPortletPreferencesCount(param0, param1, param2, param3);
    }

    public javax.portlet.PortletPreferences getStrictPreferences(PortletPreferencesIds param0)
        throws SystemException
    {
        return this.mockObject.getStrictPreferences(param0);
    }

    public javax.portlet.PortletPreferences getStrictPreferences(long param0, long param1, int param2, long param3, String param4)
        throws SystemException
    {
        return this.mockObject.getStrictPreferences(param0, param1, param2, param3, param4);
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

    public javax.portlet.PortletPreferences getPreferences(long param0, long param1, int param2, long param3, String param4, String param5)
        throws SystemException
    {
        return this.mockObject.getPreferences(param0, param1, param2, param3, param4, param5);
    }

    public javax.portlet.PortletPreferences getPreferences(long param0, long param1, int param2, long param3, String param4)
        throws SystemException
    {
        return this.mockObject.getPreferences(param0, param1, param2, param3, param4);
    }

    public javax.portlet.PortletPreferences getPreferences(PortletPreferencesIds param0)
        throws SystemException
    {
        return this.mockObject.getPreferences(param0);
    }

    public com.liferay.portal.model.PortletPreferences updatePreferences(long param0, int param1, long param2, String param3, javax.portlet.PortletPreferences param4)
        throws SystemException
    {
        return this.mockObject.updatePreferences(param0, param1, param2, param3, param4);
    }

    public com.liferay.portal.model.PortletPreferences updatePreferences(long param0, int param1, long param2, String param3, String param4)
        throws SystemException
    {
        return this.mockObject.updatePreferences(param0, param1, param2, param3, param4);
    }

}
