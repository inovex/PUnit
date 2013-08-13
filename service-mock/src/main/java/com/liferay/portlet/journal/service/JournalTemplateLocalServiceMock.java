
package com.liferay.portlet.journal.service;

import java.io.File;
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
import com.liferay.portlet.journal.model.JournalTemplate;

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
public class JournalTemplateLocalServiceMock
    extends MockService<JournalTemplateLocalService>
    implements JournalTemplateLocalService
{

    private HashMap<Long, JournalTemplate> _serviceObjects = new HashMap<Long, JournalTemplate>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalTemplateLocalService.class));
    }

    public List<JournalTemplate> search(long param0, long[] param1, String param2, String param3, String param4, int param5, int param6, OrderByComparator param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<JournalTemplate> search(long param0, long[] param1, String param2, String param3, String param4, String param5, String param6, boolean param7, int param8, int param9, OrderByComparator param10)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
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

    public int searchCount(long param0, long[] param1, String param2, String param3, String param4)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4);
    }

    public int searchCount(long param0, long[] param1, String param2, String param3, String param4, String param5, String param6, boolean param7)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public List<JournalTemplate> getTemplates()
        throws SystemException
    {
        return this.mockObject.getTemplates();
    }

    public List<JournalTemplate> getTemplates(long param0)
        throws SystemException
    {
        return this.mockObject.getTemplates(param0);
    }

    public List<JournalTemplate> getTemplates(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getTemplates(param0, param1, param2);
    }

    public JournalTemplate addTemplate(long param0, long param1, String param2, boolean param3, String param4, Map<Locale, String> param5, Map<Locale, String> param6, String param7, boolean param8, String param9, boolean param10, boolean param11, String param12, File param13, ServiceContext param14)
        throws PortalException, SystemException
    {
        return this.mockObject.addTemplate(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
    }

    public void addTemplateResources(JournalTemplate param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addTemplateResources(JournalTemplate param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addTemplateResources(long param0, String param1, boolean param2, boolean param3)
        throws PortalException, SystemException
    {
    }

    public void addTemplateResources(long param0, String param1, String[] param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public void deleteTemplate(JournalTemplate param0)
        throws PortalException, SystemException
    {
    }

    public void deleteTemplate(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void deleteTemplates(long param0)
        throws PortalException, SystemException
    {
    }

    public JournalTemplate getTemplate(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTemplate(param0);
    }

    public JournalTemplate getTemplate(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTemplate(param0, param1);
    }

    public JournalTemplate getTemplate(long param0, String param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getTemplate(param0, param1, param2);
    }

    public JournalTemplate updateTemplate(long param0, String param1, String param2, Map<Locale, String> param3, Map<Locale, String> param4, String param5, boolean param6, String param7, boolean param8, boolean param9, String param10, File param11, ServiceContext param12)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTemplate(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
    }

    public void checkNewLine(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public JournalTemplate addJournalTemplate(JournalTemplate param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalTemplate createJournalTemplate(long param0) {
        return this.mockObject.createJournalTemplate(param0);
    }

    public JournalTemplate deleteJournalTemplate(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalTemplate(param0);
    }

    public JournalTemplate deleteJournalTemplate(JournalTemplate param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalTemplate(param0);
    }

    public JournalTemplate fetchJournalTemplate(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalTemplate getJournalTemplate(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalTemplate getJournalTemplateByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalTemplateByUuidAndGroupId(param0, param1);
    }

    public List<JournalTemplate> getJournalTemplates(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalTemplates(param0, param1);
    }

    public int getJournalTemplatesCount()
        throws SystemException
    {
        return this.mockObject.getJournalTemplatesCount();
    }

    public JournalTemplate updateJournalTemplate(JournalTemplate param0)
        throws SystemException
    {
        return this.mockObject.updateJournalTemplate(param0);
    }

    public JournalTemplate updateJournalTemplate(JournalTemplate param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateJournalTemplate(param0, param1);
    }

    public JournalTemplate copyTemplate(long param0, long param1, String param2, String param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.copyTemplate(param0, param1, param2, param3, param4);
    }

    public List<JournalTemplate> getStructureTemplates(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getStructureTemplates(param0, param1);
    }

    public List<JournalTemplate> getStructureTemplates(long param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getStructureTemplates(param0, param1, param2, param3);
    }

    public int getStructureTemplatesCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getStructureTemplatesCount(param0, param1);
    }

    public JournalTemplate getTemplateBySmallImageId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTemplateBySmallImageId(param0);
    }

    public int getTemplatesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getTemplatesCount(param0);
    }

    public boolean hasTemplate(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.hasTemplate(param0, param1);
    }

}
