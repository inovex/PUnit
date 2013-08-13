
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.LayoutPrototype;
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
public class LayoutPrototypeLocalServiceMock
    extends MockService<LayoutPrototypeLocalService>
    implements LayoutPrototypeLocalService
{

    private HashMap<Long, LayoutPrototype> _serviceObjects = new HashMap<Long, LayoutPrototype>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.LayoutPrototypeLocalService.class));
    }

    public List<LayoutPrototype> search(long param0, Boolean param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4);
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

    public int searchCount(long param0, Boolean param1)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1);
    }

    public LayoutPrototype addLayoutPrototype(LayoutPrototype param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public LayoutPrototype addLayoutPrototype(long param0, long param1, Map<Locale, String> param2, String param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayoutPrototype(param0, param1, param2, param3, param4);
    }

    public LayoutPrototype createLayoutPrototype(long param0) {
        return this.mockObject.createLayoutPrototype(param0);
    }

    public LayoutPrototype deleteLayoutPrototype(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutPrototype(param0);
    }

    public LayoutPrototype deleteLayoutPrototype(LayoutPrototype param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutPrototype(param0);
    }

    public LayoutPrototype fetchLayoutPrototype(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutPrototype getLayoutPrototype(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<LayoutPrototype> getLayoutPrototypes(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLayoutPrototypes(param0, param1);
    }

    public int getLayoutPrototypesCount()
        throws SystemException
    {
        return this.mockObject.getLayoutPrototypesCount();
    }

    public LayoutPrototype updateLayoutPrototype(LayoutPrototype param0)
        throws SystemException
    {
        return this.mockObject.updateLayoutPrototype(param0);
    }

    public LayoutPrototype updateLayoutPrototype(LayoutPrototype param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateLayoutPrototype(param0, param1);
    }

    public LayoutPrototype updateLayoutPrototype(long param0, Map<Locale, String> param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayoutPrototype(param0, param1, param2, param3);
    }

    public LayoutPrototype getLayoutPrototypeByUuid(String param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutPrototypeByUuid(param0);
    }

}
