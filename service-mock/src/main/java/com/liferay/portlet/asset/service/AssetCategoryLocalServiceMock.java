
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
import com.liferay.portlet.asset.model.AssetCategory;
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
public class AssetCategoryLocalServiceMock
    extends MockService<AssetCategoryLocalService>
    implements AssetCategoryLocalService
{

    private HashMap<Long, AssetCategory> _serviceObjects = new HashMap<Long, AssetCategory>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetCategoryLocalService.class));
    }

    public List<AssetCategory> search(long param0, String param1, String[] param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<Long> getSubcategoryIds(long param0)
        throws SystemException
    {
        return this.mockObject.getSubcategoryIds(param0);
    }

    public List<AssetCategory> getVocabularyCategories(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getVocabularyCategories(param0, param1, param2, param3);
    }

    public List<AssetCategory> getVocabularyCategories(long param0, long param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getVocabularyCategories(param0, param1, param2, param3, param4);
    }

    public int getVocabularyCategoriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getVocabularyCategoriesCount(param0);
    }

    public List<AssetCategory> getVocabularyRootCategories(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getVocabularyRootCategories(param0, param1, param2, param3);
    }

    public int getVocabularyRootCategoriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getVocabularyRootCategoriesCount(param0);
    }

    public void mergeCategories(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public AssetCategory updateCategory(long param0, long param1, long param2, Map<Locale, String> param3, Map<Locale, String> param4, long param5, String[] param6, ServiceContext param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCategory(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public AssetCategory deleteAssetCategory(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetCategory(param0);
    }

    public AssetCategory deleteAssetCategory(AssetCategory param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetCategory(param0);
    }

    public AssetCategory fetchAssetCategory(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetCategory fetchAssetCategoryByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchAssetCategoryByUuidAndCompanyId(param0, param1);
    }

    public AssetCategory fetchAssetCategoryByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchAssetCategoryByUuidAndGroupId(param0, param1);
    }

    public AssetCategory addAssetCategory(AssetCategory param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetCategory createAssetCategory(long param0) {
        return this.mockObject.createAssetCategory(param0);
    }

    public AssetCategory getAssetCategory(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetCategory getAssetCategoryByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getAssetCategoryByUuidAndCompanyId(param0, param1);
    }

    public AssetCategory getAssetCategoryByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getAssetCategoryByUuidAndGroupId(param0, param1);
    }

    public List<AssetCategory> getAssetCategories(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetCategories(param0, param1);
    }

    public int getAssetCategoriesCount()
        throws SystemException
    {
        return this.mockObject.getAssetCategoriesCount();
    }

    public AssetCategory updateAssetCategory(AssetCategory param0)
        throws SystemException
    {
        return this.mockObject.updateAssetCategory(param0);
    }

    public void addAssetEntryAssetCategory(long param0, long param1)
        throws SystemException
    {
    }

    public void addAssetEntryAssetCategory(long param0, AssetCategory param1)
        throws SystemException
    {
    }

    public void addAssetEntryAssetCategories(long param0, List<AssetCategory> param1)
        throws SystemException
    {
    }

    public void addAssetEntryAssetCategories(long param0, long[] param1)
        throws SystemException
    {
    }

    public void clearAssetEntryAssetCategories(long param0)
        throws SystemException
    {
    }

    public void deleteAssetEntryAssetCategory(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteAssetEntryAssetCategory(long param0, AssetCategory param1)
        throws SystemException
    {
    }

    public void deleteAssetEntryAssetCategories(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteAssetEntryAssetCategories(long param0, List<AssetCategory> param1)
        throws SystemException
    {
    }

    public List<AssetCategory> getAssetEntryAssetCategories(long param0)
        throws SystemException
    {
        return this.mockObject.getAssetEntryAssetCategories(param0);
    }

    public List<AssetCategory> getAssetEntryAssetCategories(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getAssetEntryAssetCategories(param0, param1, param2, param3);
    }

    public List<AssetCategory> getAssetEntryAssetCategories(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getAssetEntryAssetCategories(param0, param1, param2);
    }

    public int getAssetEntryAssetCategoriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getAssetEntryAssetCategoriesCount(param0);
    }

    public boolean hasAssetEntryAssetCategory(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasAssetEntryAssetCategory(param0, param1);
    }

    public boolean hasAssetEntryAssetCategories(long param0)
        throws SystemException
    {
        return this.mockObject.hasAssetEntryAssetCategories(param0);
    }

    public AssetCategory moveCategory(long param0, long param1, long param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.moveCategory(param0, param1, param2, param3);
    }

    public void setAssetEntryAssetCategories(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addCategoryResources(AssetCategory param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addCategoryResources(AssetCategory param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteCategory(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteCategory(AssetCategory param0)
        throws PortalException, SystemException
    {
    }

    public void deleteVocabularyCategories(long param0)
        throws PortalException, SystemException
    {
    }

    public AssetCategory fetchCategory(long param0)
        throws SystemException
    {
        return this.mockObject.fetchCategory(param0);
    }

    public long[] getCategoryIds(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCategoryIds(param0, param1);
    }

    public String[] getCategoryNames()
        throws SystemException
    {
        return this.mockObject.getCategoryNames();
    }

    public String[] getCategoryNames(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCategoryNames(param0, param1);
    }

    public String[] getCategoryNames(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCategoryNames(param0, param1);
    }

    public List<AssetCategory> getChildCategories(long param0)
        throws SystemException
    {
        return this.mockObject.getChildCategories(param0);
    }

    public List<AssetCategory> getChildCategories(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getChildCategories(param0, param1, param2, param3);
    }

    public int getChildCategoriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getChildCategoriesCount(param0);
    }

    public List<AssetCategory> getEntryCategories(long param0)
        throws SystemException
    {
        return this.mockObject.getEntryCategories(param0);
    }

    public void rebuildTree(long param0, boolean param1)
        throws SystemException
    {
    }

    public AssetCategory addCategory(long param0, long param1, Map<Locale, String> param2, Map<Locale, String> param3, long param4, String[] param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addCategory(param0, param1, param2, param3, param4, param5, param6);
    }

    public AssetCategory addCategory(long param0, String param1, long param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addCategory(param0, param1, param2, param3);
    }

    public List<AssetCategory> getCategories(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCategories(param0, param1);
    }

    public List<AssetCategory> getCategories(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCategories(param0, param1);
    }

    public List<AssetCategory> getCategories()
        throws SystemException
    {
        return this.mockObject.getCategories();
    }

    public AssetCategory getCategory(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getCategory(param0, param1);
    }

    public AssetCategory getCategory(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCategory(param0);
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
