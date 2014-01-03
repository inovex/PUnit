
package com.liferay.portlet.asset.service;

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
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetVocabulary;
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
public class AssetVocabularyLocalServiceMock
    extends MockService<AssetVocabularyLocalService>
    implements AssetVocabularyLocalService
{

    private HashMap<Long, AssetVocabulary> _serviceObjects = new HashMap<Long, AssetVocabulary>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetVocabularyLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void addVocabularyResources(AssetVocabulary param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addVocabularyResources(AssetVocabulary param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void deleteVocabularies(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteVocabulary(AssetVocabulary param0)
        throws PortalException, SystemException
    {
    }

    public void deleteVocabulary(long param0)
        throws PortalException, SystemException
    {
    }

    public List<AssetVocabulary> getCompanyVocabularies(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyVocabularies(param0);
    }

    public List<AssetVocabulary> getGroupsVocabularies(long[] param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupsVocabularies(param0);
    }

    public List<AssetVocabulary> getGroupsVocabularies(long[] param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupsVocabularies(param0, param1);
    }

    public List<AssetVocabulary> getGroupVocabularies(long param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupVocabularies(param0, param1);
    }

    public List<AssetVocabulary> getGroupVocabularies(long param0, String param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getGroupVocabularies(param0, param1, param2, param3, param4);
    }

    public List<AssetVocabulary> getGroupVocabularies(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupVocabularies(param0);
    }

    public AssetVocabulary getGroupVocabulary(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupVocabulary(param0, param1);
    }

    public List<AssetVocabulary> getVocabularies(long[] param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getVocabularies(param0);
    }

    public AssetVocabulary getVocabulary(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getVocabulary(param0);
    }

    public AssetVocabulary updateVocabulary(long param0, String param1, Map<Locale, String> param2, Map<Locale, String> param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateVocabulary(param0, param1, param2, param3, param4, param5);
    }

    public AssetVocabulary updateVocabulary(long param0, Map<Locale, String> param1, Map<Locale, String> param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateVocabulary(param0, param1, param2, param3, param4);
    }

    public AssetVocabulary createAssetVocabulary(long param0) {
        return this.mockObject.createAssetVocabulary(param0);
    }

    public AssetVocabulary deleteAssetVocabulary(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetVocabulary(param0);
    }

    public AssetVocabulary deleteAssetVocabulary(AssetVocabulary param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetVocabulary(param0);
    }

    public AssetVocabulary addAssetVocabulary(AssetVocabulary param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetVocabulary fetchAssetVocabulary(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetVocabulary fetchAssetVocabularyByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchAssetVocabularyByUuidAndCompanyId(param0, param1);
    }

    public AssetVocabulary fetchAssetVocabularyByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchAssetVocabularyByUuidAndGroupId(param0, param1);
    }

    public AssetVocabulary getAssetVocabulary(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetVocabulary getAssetVocabularyByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getAssetVocabularyByUuidAndCompanyId(param0, param1);
    }

    public AssetVocabulary getAssetVocabularyByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getAssetVocabularyByUuidAndGroupId(param0, param1);
    }

    public List<AssetVocabulary> getAssetVocabularies(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetVocabularies(param0, param1);
    }

    public int getAssetVocabulariesCount()
        throws SystemException
    {
        return this.mockObject.getAssetVocabulariesCount();
    }

    public AssetVocabulary updateAssetVocabulary(AssetVocabulary param0)
        throws SystemException
    {
        return this.mockObject.updateAssetVocabulary(param0);
    }

    public AssetVocabulary addDefaultVocabulary(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.addDefaultVocabulary(param0);
    }

    public AssetVocabulary addVocabulary(long param0, Map<Locale, String> param1, Map<Locale, String> param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addVocabulary(param0, param1, param2, param3, param4);
    }

    public AssetVocabulary addVocabulary(long param0, String param1, Map<Locale, String> param2, Map<Locale, String> param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addVocabulary(param0, param1, param2, param3, param4, param5);
    }

    public AssetVocabulary addVocabulary(long param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.addVocabulary(param0, param1, param2);
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

}
