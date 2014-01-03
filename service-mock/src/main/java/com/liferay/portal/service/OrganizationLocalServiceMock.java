
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Organization;
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
public class OrganizationLocalServiceMock
    extends MockService<OrganizationLocalService>
    implements OrganizationLocalService
{

    private HashMap<Long, Organization> _serviceObjects = new HashMap<Long, Organization>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.OrganizationLocalService.class));
    }

    public List<Organization> search(long param0, long param1, String param2, String param3, String param4, String param5, String param6, Long param7, Long param8, LinkedHashMap<String, Object> param9, boolean param10, int param11, int param12, OrderByComparator param13)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public Hits search(long param0, long param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, LinkedHashMap<String, Object> param9, boolean param10, int param11, int param12, Sort param13)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public List<Organization> search(long param0, long param1, String param2, String param3, String param4, String param5, String param6, Long param7, Long param8, LinkedHashMap<String, Object> param9, boolean param10, int param11, int param12)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
    }

    public List<Organization> search(long param0, long param1, String param2, String param3, Long param4, Long param5, LinkedHashMap<String, Object> param6, int param7, int param8, OrderByComparator param9)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public Hits search(long param0, long param1, String param2, LinkedHashMap<String, Object> param3, int param4, int param5, Sort param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<Organization> search(long param0, long param1, String param2, String param3, Long param4, Long param5, LinkedHashMap<String, Object> param6, int param7, int param8)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void rebuildTree(long param0)
        throws PortalException, SystemException
    {
    }

    public int searchCount(long param0, long param1, String param2, String param3, Long param4, Long param5, LinkedHashMap<String, Object> param6)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6);
    }

    public int searchCount(long param0, long param1, String param2, String param3, String param4, String param5, String param6, Long param7, Long param8, LinkedHashMap<String, Object> param9, boolean param10)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public Organization getOrganizationByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizationByUuidAndCompanyId(param0, param1);
    }

    public int getOrganizationsCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getOrganizationsCount(param0, param1);
    }

    public int getOrganizationsCount()
        throws SystemException
    {
        return this.mockObject.getOrganizationsCount();
    }

    public Organization updateOrganization(Organization param0)
        throws SystemException
    {
        return this.mockObject.updateOrganization(param0);
    }

    public Organization updateOrganization(long param0, long param1, long param2, String param3, String param4, long param5, long param6, int param7, String param8, boolean param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.updateOrganization(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public Organization updateOrganization(long param0, long param1, long param2, String param3, String param4, boolean param5, long param6, long param7, int param8, String param9, boolean param10, ServiceContext param11)
        throws PortalException, SystemException
    {
        return this.mockObject.updateOrganization(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public void addGroupOrganization(long param0, Organization param1)
        throws SystemException
    {
    }

    public void addGroupOrganization(long param0, long param1)
        throws SystemException
    {
    }

    public void addGroupOrganizations(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void addGroupOrganizations(long param0, List<Organization> param1)
        throws PortalException, SystemException
    {
    }

    public void clearGroupOrganizations(long param0)
        throws SystemException
    {
    }

    public void deleteGroupOrganization(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteGroupOrganization(long param0, Organization param1)
        throws SystemException
    {
    }

    public void deleteGroupOrganizations(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteGroupOrganizations(long param0, List<Organization> param1)
        throws SystemException
    {
    }

    public List<Organization> getGroupOrganizations(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getGroupOrganizations(param0, param1, param2, param3);
    }

    public List<Organization> getGroupOrganizations(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupOrganizations(param0, param1, param2);
    }

    public List<Organization> getGroupOrganizations(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupOrganizations(param0);
    }

    public int getGroupOrganizationsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupOrganizationsCount(param0);
    }

    public boolean hasGroupOrganization(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasGroupOrganization(param0, param1);
    }

    public boolean hasGroupOrganizations(long param0)
        throws SystemException
    {
        return this.mockObject.hasGroupOrganizations(param0);
    }

    public void setGroupOrganizations(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void addUserOrganization(long param0, long param1)
        throws SystemException
    {
    }

    public void addUserOrganization(long param0, Organization param1)
        throws SystemException
    {
    }

    public void addUserOrganizations(long param0, List<Organization> param1)
        throws SystemException
    {
    }

    public void addUserOrganizations(long param0, long[] param1)
        throws SystemException
    {
    }

    public void clearUserOrganizations(long param0)
        throws SystemException
    {
    }

    public void deleteUserOrganization(long param0, Organization param1)
        throws SystemException
    {
    }

    public void deleteUserOrganization(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteUserOrganizations(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteUserOrganizations(long param0, List<Organization> param1)
        throws SystemException
    {
    }

    public List<Organization> getUserOrganizations(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserOrganizations(param0, param1, param2);
    }

    public List<Organization> getUserOrganizations(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getUserOrganizations(param0, param1, param2, param3);
    }

    public List<Organization> getUserOrganizations(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getUserOrganizations(param0, param1);
    }

    public List<Organization> getUserOrganizations(long param0)
        throws SystemException
    {
        return this.mockObject.getUserOrganizations(param0);
    }

    public int getUserOrganizationsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserOrganizationsCount(param0);
    }

    public boolean hasUserOrganization(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasUserOrganization(param0, param1);
    }

    public boolean hasUserOrganization(long param0, long param1, boolean param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasUserOrganization(param0, param1, param2, param3);
    }

    public boolean hasUserOrganizations(long param0)
        throws SystemException
    {
        return this.mockObject.hasUserOrganizations(param0);
    }

    public void setUserOrganizations(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addOrganizationResources(long param0, Organization param1)
        throws PortalException, SystemException
    {
    }

    public void addPasswordPolicyOrganizations(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<Organization> getNoAssetOrganizations()
        throws SystemException
    {
        return this.mockObject.getNoAssetOrganizations();
    }

    public List<Organization> getParentOrganizations(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentOrganizations(param0);
    }

    public int getSuborganizationsCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getSuborganizationsCount(param0, param1);
    }

    public List<Organization> getSubsetOrganizations(List<Organization> param0, List<Organization> param1) {
        return this.mockObject.getSubsetOrganizations(param0, param1);
    }

    public boolean hasPasswordPolicyOrganization(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasPasswordPolicyOrganization(param0, param1);
    }

    public void deleteLogo(long param0)
        throws PortalException, SystemException
    {
    }

    public long getOrganizationId(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getOrganizationId(param0, param1);
    }

    public void unsetGroupOrganizations(long param0, long[] param1)
        throws PortalException, SystemException
    {
    }

    public void unsetPasswordPolicyOrganizations(long param0, long[] param1)
        throws SystemException
    {
    }

    public void updateAsset(long param0, Organization param1, long[] param2, String[] param3)
        throws PortalException, SystemException
    {
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

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
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

    public Organization createOrganization(long param0) {
        return this.mockObject.createOrganization(param0);
    }

    public Organization deleteOrganization(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteOrganization(param0);
    }

    public Organization deleteOrganization(Organization param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteOrganization(param0);
    }

    public Organization fetchOrganization(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Organization fetchOrganization(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchOrganization(param0, param1);
    }

    public Organization fetchOrganizationByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchOrganizationByUuidAndCompanyId(param0, param1);
    }

    public Organization getOrganization(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Organization getOrganization(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganization(param0, param1);
    }

    public Organization addOrganization(long param0, long param1, String param2, String param3, long param4, long param5, int param6, String param7, boolean param8, ServiceContext param9)
        throws PortalException, SystemException
    {
        return this.mockObject.addOrganization(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public Organization addOrganization(long param0, long param1, String param2, String param3, boolean param4, long param5, long param6, int param7, String param8, boolean param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.addOrganization(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public Organization addOrganization(long param0, long param1, String param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addOrganization(param0, param1, param2, param3);
    }

    public Organization addOrganization(Organization param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public List<Organization> getSuborganizations(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getSuborganizations(param0, param1);
    }

    public List<Organization> getSuborganizations(List<Organization> param0)
        throws SystemException
    {
        return this.mockObject.getSuborganizations(param0);
    }

    public List<Organization> getOrganizations(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getOrganizations(param0, param1);
    }

    public List<Organization> getOrganizations(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getOrganizations(param0, param1);
    }

    public List<Organization> getOrganizations(long param0, int param1, int param2, OrderByComparator param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizations(param0, param1, param2, param3);
    }

    public List<Organization> getOrganizations(long[] param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrganizations(param0);
    }

    public List<Organization> getOrganizations(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getOrganizations(param0, param1, param2, param3);
    }

}
