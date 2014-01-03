
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.LayoutFriendlyURL;
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
public class LayoutFriendlyURLLocalServiceMock
    extends MockService<LayoutFriendlyURLLocalService>
    implements LayoutFriendlyURLLocalService
{

    private HashMap<Long, LayoutFriendlyURL> _serviceObjects = new HashMap<Long, LayoutFriendlyURL>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.LayoutFriendlyURLLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public LayoutFriendlyURL deleteLayoutFriendlyURL(LayoutFriendlyURL param0)
        throws SystemException
    {
        return this.mockObject.deleteLayoutFriendlyURL(param0);
    }

    public LayoutFriendlyURL deleteLayoutFriendlyURL(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutFriendlyURL(param0);
    }

    public void deleteLayoutFriendlyURL(long param0, String param1)
        throws SystemException
    {
    }

    public LayoutFriendlyURL fetchLayoutFriendlyURL(long param0, String param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.fetchLayoutFriendlyURL(param0, param1, param2);
    }

    public LayoutFriendlyURL fetchLayoutFriendlyURL(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchLayoutFriendlyURL(param0, param1);
    }

    public LayoutFriendlyURL fetchLayoutFriendlyURL(long param0, boolean param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.fetchLayoutFriendlyURL(param0, param1, param2, param3);
    }

    public LayoutFriendlyURL fetchLayoutFriendlyURL(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutFriendlyURL fetchLayoutFriendlyURLByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchLayoutFriendlyURLByUuidAndCompanyId(param0, param1);
    }

    public LayoutFriendlyURL fetchLayoutFriendlyURLByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchLayoutFriendlyURLByUuidAndGroupId(param0, param1);
    }

    public LayoutFriendlyURL addLayoutFriendlyURL(long param0, long param1, long param2, long param3, boolean param4, String param5, String param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayoutFriendlyURL(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public LayoutFriendlyURL addLayoutFriendlyURL(LayoutFriendlyURL param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public LayoutFriendlyURL createLayoutFriendlyURL(long param0) {
        return this.mockObject.createLayoutFriendlyURL(param0);
    }

    public LayoutFriendlyURL getLayoutFriendlyURLByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFriendlyURLByUuidAndCompanyId(param0, param1);
    }

    public LayoutFriendlyURL getLayoutFriendlyURLByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFriendlyURLByUuidAndGroupId(param0, param1);
    }

    public List<LayoutFriendlyURL> getLayoutFriendlyURLs(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLayoutFriendlyURLs(param0, param1);
    }

    public List<LayoutFriendlyURL> getLayoutFriendlyURLs(long param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getLayoutFriendlyURLs(param0, param1, param2, param3);
    }

    public List<LayoutFriendlyURL> getLayoutFriendlyURLs(long param0)
        throws SystemException
    {
        return this.mockObject.getLayoutFriendlyURLs(param0);
    }

    public int getLayoutFriendlyURLsCount()
        throws SystemException
    {
        return this.mockObject.getLayoutFriendlyURLsCount();
    }

    public LayoutFriendlyURL updateLayoutFriendlyURL(LayoutFriendlyURL param0)
        throws SystemException
    {
        return this.mockObject.updateLayoutFriendlyURL(param0);
    }

    public LayoutFriendlyURL updateLayoutFriendlyURL(long param0, long param1, long param2, long param3, boolean param4, String param5, String param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayoutFriendlyURL(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<LayoutFriendlyURL> addLayoutFriendlyURLs(long param0, long param1, long param2, long param3, boolean param4, Map<Locale, String> param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayoutFriendlyURLs(param0, param1, param2, param3, param4, param5, param6);
    }

    public void deleteLayoutFriendlyURLs(long param0)
        throws SystemException
    {
    }

    public LayoutFriendlyURL fetchFirstLayoutFriendlyURL(long param0, boolean param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchFirstLayoutFriendlyURL(param0, param1, param2);
    }

    public List<LayoutFriendlyURL> updateLayoutFriendlyURLs(long param0, long param1, long param2, long param3, boolean param4, Map<Locale, String> param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayoutFriendlyURLs(param0, param1, param2, param3, param4, param5, param6);
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

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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

    public LayoutFriendlyURL getLayoutFriendlyURL(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutFriendlyURL getLayoutFriendlyURL(long param0, String param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFriendlyURL(param0, param1, param2);
    }

    public LayoutFriendlyURL getLayoutFriendlyURL(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutFriendlyURL(param0, param1);
    }

}
