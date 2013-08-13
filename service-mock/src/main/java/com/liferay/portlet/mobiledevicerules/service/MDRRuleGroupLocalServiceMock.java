
package com.liferay.portlet.mobiledevicerules.service;

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
import com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup;

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
public class MDRRuleGroupLocalServiceMock
    extends MockService<MDRRuleGroupLocalService>
    implements MDRRuleGroupLocalService
{

    private HashMap<Long, MDRRuleGroup> _serviceObjects = new HashMap<Long, MDRRuleGroup>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupLocalService.class));
    }

    public List<MDRRuleGroup> search(long param0, String param1, boolean param2, int param3, int param4)
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

    public int searchCount(long param0, String param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2);
    }

    public MDRRuleGroup getRuleGroup(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRuleGroup(param0);
    }

    public MDRRuleGroup addMDRRuleGroup(MDRRuleGroup param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MDRRuleGroup createMDRRuleGroup(long param0) {
        return this.mockObject.createMDRRuleGroup(param0);
    }

    public MDRRuleGroup deleteMDRRuleGroup(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMDRRuleGroup(param0);
    }

    public MDRRuleGroup deleteMDRRuleGroup(MDRRuleGroup param0)
        throws SystemException
    {
        return this.mockObject.deleteMDRRuleGroup(param0);
    }

    public MDRRuleGroup fetchMDRRuleGroup(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MDRRuleGroup getMDRRuleGroup(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MDRRuleGroup getMDRRuleGroupByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMDRRuleGroupByUuidAndGroupId(param0, param1);
    }

    public List<MDRRuleGroup> getMDRRuleGroups(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMDRRuleGroups(param0, param1);
    }

    public int getMDRRuleGroupsCount()
        throws SystemException
    {
        return this.mockObject.getMDRRuleGroupsCount();
    }

    public MDRRuleGroup updateMDRRuleGroup(MDRRuleGroup param0)
        throws SystemException
    {
        return this.mockObject.updateMDRRuleGroup(param0);
    }

    public MDRRuleGroup updateMDRRuleGroup(MDRRuleGroup param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateMDRRuleGroup(param0, param1);
    }

    public MDRRuleGroup addRuleGroup(long param0, Map<Locale, String> param1, Map<Locale, String> param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addRuleGroup(param0, param1, param2, param3);
    }

    public MDRRuleGroup copyRuleGroup(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.copyRuleGroup(param0, param1, param2);
    }

    public MDRRuleGroup copyRuleGroup(MDRRuleGroup param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.copyRuleGroup(param0, param1, param2);
    }

    public void deleteRuleGroup(long param0)
        throws SystemException
    {
    }

    public void deleteRuleGroup(MDRRuleGroup param0)
        throws SystemException
    {
    }

    public void deleteRuleGroups(long param0)
        throws SystemException
    {
    }

    public MDRRuleGroup fetchRuleGroup(long param0)
        throws SystemException
    {
        return this.mockObject.fetchRuleGroup(param0);
    }

    public List<MDRRuleGroup> getRuleGroups(long param0)
        throws SystemException
    {
        return this.mockObject.getRuleGroups(param0);
    }

    public List<MDRRuleGroup> getRuleGroups(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRuleGroups(param0, param1, param2);
    }

    public int getRuleGroupsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRuleGroupsCount(param0);
    }

    public List<MDRRuleGroup> searchByKeywords(long param0, String param1, boolean param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.searchByKeywords(param0, param1, param2, param3, param4);
    }

    public int searchByKeywordsCount(long param0, String param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.searchByKeywordsCount(param0, param1, param2);
    }

    public MDRRuleGroup updateRuleGroup(long param0, Map<Locale, String> param1, Map<Locale, String> param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRuleGroup(param0, param1, param2, param3);
    }

}
