
package com.liferay.portlet.dynamicdatamapping.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;

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
public class DDMTemplateLocalServiceMock
    extends MockService<DDMTemplateLocalService>
    implements DDMTemplateLocalService
{

    private HashMap<Long, DDMTemplate> _serviceObjects = new HashMap<Long, DDMTemplate>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalService.class));
    }

    public List<DDMTemplate> search(long param0, long param1, long param2, String param3, String param4, String param5, int param6, int param7, OrderByComparator param8)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public List<DDMTemplate> search(long param0, long param1, long param2, String param3, String param4, String param5, String param6, String param7, boolean param8, int param9, int param10, OrderByComparator param11)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
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

    public int searchCount(long param0, long param1, long param2, String param3, String param4, String param5)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5);
    }

    public int searchCount(long param0, long param1, long param2, String param3, String param4, String param5, String param6, String param7, boolean param8)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public List<DDMTemplate> getTemplates(long param0)
        throws SystemException
    {
        return this.mockObject.getTemplates(param0);
    }

    public List<DDMTemplate> getTemplates(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getTemplates(param0, param1);
    }

    public List<DDMTemplate> getTemplates(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getTemplates(param0, param1, param2);
    }

    public DDMTemplate addDDMTemplate(DDMTemplate param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DDMTemplate createDDMTemplate(long param0) {
        return this.mockObject.createDDMTemplate(param0);
    }

    public DDMTemplate deleteDDMTemplate(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDDMTemplate(param0);
    }

    public DDMTemplate deleteDDMTemplate(DDMTemplate param0)
        throws SystemException
    {
        return this.mockObject.deleteDDMTemplate(param0);
    }

    public DDMTemplate fetchDDMTemplate(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDMTemplate getDDMTemplate(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DDMTemplate getDDMTemplateByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDDMTemplateByUuidAndGroupId(param0, param1);
    }

    public List<DDMTemplate> getDDMTemplates(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDDMTemplates(param0, param1);
    }

    public int getDDMTemplatesCount()
        throws SystemException
    {
        return this.mockObject.getDDMTemplatesCount();
    }

    public DDMTemplate updateDDMTemplate(DDMTemplate param0)
        throws SystemException
    {
        return this.mockObject.updateDDMTemplate(param0);
    }

    public DDMTemplate updateDDMTemplate(DDMTemplate param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDDMTemplate(param0, param1);
    }

    public DDMTemplate addTemplate(long param0, long param1, long param2, Map<Locale, String> param3, Map<Locale, String> param4, String param5, String param6, String param7, String param8, ServiceContext param9)
        throws PortalException, SystemException
    {
        return this.mockObject.addTemplate(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public void addTemplateResources(DDMTemplate param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addTemplateResources(DDMTemplate param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public List<DDMTemplate> copyTemplates(long param0, long param1, long param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.copyTemplates(param0, param1, param2, param3, param4);
    }

    public void deleteTemplate(DDMTemplate param0)
        throws PortalException, SystemException
    {
    }

    public void deleteTemplate(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteTemplates(long param0)
        throws PortalException, SystemException
    {
    }

    public DDMTemplate getTemplate(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTemplate(param0);
    }

    public DDMTemplate updateTemplate(long param0, Map<Locale, String> param1, Map<Locale, String> param2, String param3, String param4, String param5, String param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTemplate(param0, param1, param2, param3, param4, param5, param6, param7);
    }

}
