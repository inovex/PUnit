
package com.liferay.portlet.mobiledevicerules.service;

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
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.mobiledevicerules.model.MDRRule;
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
public class MDRRuleLocalServiceMock
    extends MockService<MDRRuleLocalService>
    implements MDRRuleLocalService
{

    private HashMap<Long, MDRRule> _serviceObjects = new HashMap<Long, MDRRule>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.mobiledevicerules.service.MDRRuleLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<MDRRule> getRules(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRules(param0, param1, param2);
    }

    public List<MDRRule> getRules(long param0)
        throws SystemException
    {
        return this.mockObject.getRules(param0);
    }

    public MDRRule createMDRRule(long param0) {
        return this.mockObject.createMDRRule(param0);
    }

    public MDRRule deleteMDRRule(MDRRule param0)
        throws SystemException
    {
        return this.mockObject.deleteMDRRule(param0);
    }

    public MDRRule deleteMDRRule(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMDRRule(param0);
    }

    public MDRRule fetchMDRRule(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MDRRule fetchMDRRuleByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMDRRuleByUuidAndCompanyId(param0, param1);
    }

    public MDRRule fetchMDRRuleByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMDRRuleByUuidAndGroupId(param0, param1);
    }

    public MDRRule getMDRRule(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MDRRule getMDRRuleByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMDRRuleByUuidAndCompanyId(param0, param1);
    }

    public MDRRule getMDRRuleByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMDRRuleByUuidAndGroupId(param0, param1);
    }

    public List<MDRRule> getMDRRules(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMDRRules(param0, param1);
    }

    public int getMDRRulesCount()
        throws SystemException
    {
        return this.mockObject.getMDRRulesCount();
    }

    public MDRRule updateMDRRule(MDRRule param0)
        throws SystemException
    {
        return this.mockObject.updateMDRRule(param0);
    }

    public MDRRule addRule(long param0, Map<Locale, String> param1, Map<Locale, String> param2, String param3, UnicodeProperties param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addRule(param0, param1, param2, param3, param4, param5);
    }

    public MDRRule addRule(long param0, Map<Locale, String> param1, Map<Locale, String> param2, String param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addRule(param0, param1, param2, param3, param4, param5);
    }

    public MDRRule copyRule(MDRRule param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.copyRule(param0, param1, param2);
    }

    public MDRRule copyRule(long param0, long param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.copyRule(param0, param1, param2);
    }

    public void deleteRule(long param0)
        throws SystemException
    {
    }

    public void deleteRule(MDRRule param0)
        throws SystemException
    {
    }

    public void deleteRules(long param0)
        throws SystemException
    {
    }

    public MDRRule fetchRule(long param0)
        throws SystemException
    {
        return this.mockObject.fetchRule(param0);
    }

    public MDRRule getRule(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRule(param0);
    }

    public int getRulesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRulesCount(param0);
    }

    public MDRRule updateRule(long param0, Map<Locale, String> param1, Map<Locale, String> param2, String param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRule(param0, param1, param2, param3, param4, param5);
    }

    public MDRRule updateRule(long param0, Map<Locale, String> param1, Map<Locale, String> param2, String param3, UnicodeProperties param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateRule(param0, param1, param2, param3, param4, param5);
    }

    public MDRRule addMDRRule(MDRRule param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
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

}
