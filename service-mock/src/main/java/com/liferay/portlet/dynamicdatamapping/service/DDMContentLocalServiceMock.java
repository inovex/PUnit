
package com.liferay.portlet.dynamicdatamapping.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatamapping.model.DDMContent;

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
public class DDMContentLocalServiceMock
    extends MockService<DDMContentLocalService>
    implements DDMContentLocalService
{

    private HashMap<Long, DDMContent> _serviceObjects = new HashMap<Long, DDMContent>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatamapping.service.DDMContentLocalService.class));
    }

    public DDMContent getContent(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getContent(param0);
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

    public List<DDMContent> getContents()
        throws SystemException
    {
        return this.mockObject.getContents();
    }

    public List<DDMContent> getContents(long param0)
        throws SystemException
    {
        return this.mockObject.getContents(param0);
    }

    public List<DDMContent> getContents(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getContents(param0, param1, param2);
    }

    public DDMContent addContent(long param0, long param1, String param2, String param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addContent(param0, param1, param2, param3, param4, param5);
    }

    public void deleteContent(DDMContent param0)
        throws SystemException
    {
    }

    public void deleteContents(long param0)
        throws SystemException
    {
    }

    public DDMContent addDDMContent(DDMContent param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DDMContent createDDMContent(long param0) {
        return this.mockObject.createDDMContent(param0);
    }

    public DDMContent deleteDDMContent(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDDMContent(param0);
    }

    public DDMContent deleteDDMContent(DDMContent param0)
        throws SystemException
    {
        return this.mockObject.deleteDDMContent(param0);
    }

    public DDMContent fetchDDMContent(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDMContent getDDMContent(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDMContent getDDMContentByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDDMContentByUuidAndGroupId(param0, param1);
    }

    public List<DDMContent> getDDMContents(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDDMContents(param0, param1);
    }

    public int getDDMContentsCount()
        throws SystemException
    {
        return this.mockObject.getDDMContentsCount();
    }

    public DDMContent updateDDMContent(DDMContent param0)
        throws SystemException
    {
        return this.mockObject.updateDDMContent(param0);
    }

    public DDMContent updateDDMContent(DDMContent param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDDMContent(param0, param1);
    }

    public int getContentsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getContentsCount(param0);
    }

    public DDMContent updateContent(long param0, String param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateContent(param0, param1, param2, param3, param4);
    }

}
