
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
import com.liferay.portal.model.PortletItem;
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
public class PortletItemLocalServiceMock
    extends MockService<PortletItemLocalService>
    implements PortletItemLocalService
{

    private HashMap<Long, PortletItem> _serviceObjects = new HashMap<Long, PortletItem>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PortletItemLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public PortletItem fetchPortletItem(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PortletItem getPortletItem(long param0, String param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getPortletItem(param0, param1, param2, param3);
    }

    public PortletItem getPortletItem(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<PortletItem> getPortletItems(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPortletItems(param0, param1);
    }

    public List<PortletItem> getPortletItems(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getPortletItems(param0, param1);
    }

    public List<PortletItem> getPortletItems(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getPortletItems(param0, param1, param2);
    }

    public int getPortletItemsCount()
        throws SystemException
    {
        return this.mockObject.getPortletItemsCount();
    }

    public PortletItem addPortletItem(PortletItem param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public PortletItem addPortletItem(long param0, long param1, String param2, String param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addPortletItem(param0, param1, param2, param3, param4);
    }

    public PortletItem createPortletItem(long param0) {
        return this.mockObject.createPortletItem(param0);
    }

    public PortletItem deletePortletItem(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePortletItem(param0);
    }

    public PortletItem deletePortletItem(PortletItem param0)
        throws SystemException
    {
        return this.mockObject.deletePortletItem(param0);
    }

    public PortletItem updatePortletItem(PortletItem param0)
        throws SystemException
    {
        return this.mockObject.updatePortletItem(param0);
    }

    public PortletItem updatePortletItem(long param0, long param1, String param2, String param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePortletItem(param0, param1, param2, param3, param4);
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

}
