
package com.liferay.portlet.asset.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.asset.model.AssetCategoryProperty;
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
public class AssetCategoryPropertyLocalServiceMock
    extends MockService<AssetCategoryPropertyLocalService>
    implements AssetCategoryPropertyLocalService
{

    private HashMap<Long, AssetCategoryProperty> _serviceObjects = new HashMap<Long, AssetCategoryProperty>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetCategoryPropertyLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<AssetCategoryProperty> getAssetCategoryProperties(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetCategoryProperties(param0, param1);
    }

    public int getAssetCategoryPropertiesCount()
        throws SystemException
    {
        return this.mockObject.getAssetCategoryPropertiesCount();
    }

    public AssetCategoryProperty updateAssetCategoryProperty(AssetCategoryProperty param0)
        throws SystemException
    {
        return this.mockObject.updateAssetCategoryProperty(param0);
    }

    public AssetCategoryProperty addCategoryProperty(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addCategoryProperty(param0, param1, param2, param3);
    }

    public void deleteCategoryProperties(long param0)
        throws SystemException
    {
    }

    public void deleteCategoryProperty(AssetCategoryProperty param0)
        throws SystemException
    {
    }

    public void deleteCategoryProperty(long param0)
        throws PortalException, SystemException
    {
    }

    public List<AssetCategoryProperty> getCategoryProperties()
        throws SystemException
    {
        return this.mockObject.getCategoryProperties();
    }

    public List<AssetCategoryProperty> getCategoryProperties(long param0)
        throws SystemException
    {
        return this.mockObject.getCategoryProperties(param0);
    }

    public AssetCategoryProperty createAssetCategoryProperty(long param0) {
        return this.mockObject.createAssetCategoryProperty(param0);
    }

    public AssetCategoryProperty deleteAssetCategoryProperty(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetCategoryProperty(param0);
    }

    public AssetCategoryProperty deleteAssetCategoryProperty(AssetCategoryProperty param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetCategoryProperty(param0);
    }

    public AssetCategoryProperty fetchAssetCategoryProperty(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetCategoryProperty getAssetCategoryProperty(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetCategoryProperty addAssetCategoryProperty(AssetCategoryProperty param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetCategoryProperty getCategoryProperty(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getCategoryProperty(param0);
    }

    public AssetCategoryProperty getCategoryProperty(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getCategoryProperty(param0, param1);
    }

    public List<AssetCategoryProperty> getCategoryPropertyValues(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getCategoryPropertyValues(param0, param1);
    }

    public AssetCategoryProperty updateCategoryProperty(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateCategoryProperty(param0, param1, param2);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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
