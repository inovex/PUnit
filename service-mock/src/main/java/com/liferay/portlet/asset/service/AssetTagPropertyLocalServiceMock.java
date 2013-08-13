
package com.liferay.portlet.asset.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.asset.model.AssetTagProperty;

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
public class AssetTagPropertyLocalServiceMock
    extends MockService<AssetTagPropertyLocalService>
    implements AssetTagPropertyLocalService
{

    private HashMap<Long, AssetTagProperty> _serviceObjects = new HashMap<Long, AssetTagProperty>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetTagPropertyLocalService.class));
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

    public AssetTagProperty addAssetTagProperty(AssetTagProperty param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetTagProperty createAssetTagProperty(long param0) {
        return this.mockObject.createAssetTagProperty(param0);
    }

    public AssetTagProperty deleteAssetTagProperty(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetTagProperty(param0);
    }

    public AssetTagProperty deleteAssetTagProperty(AssetTagProperty param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetTagProperty(param0);
    }

    public AssetTagProperty fetchAssetTagProperty(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetTagProperty getAssetTagProperty(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AssetTagProperty> getAssetTagProperties(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetTagProperties(param0, param1);
    }

    public int getAssetTagPropertiesCount()
        throws SystemException
    {
        return this.mockObject.getAssetTagPropertiesCount();
    }

    public AssetTagProperty updateAssetTagProperty(AssetTagProperty param0)
        throws SystemException
    {
        return this.mockObject.updateAssetTagProperty(param0);
    }

    public AssetTagProperty updateAssetTagProperty(AssetTagProperty param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateAssetTagProperty(param0, param1);
    }

    public AssetTagProperty addTagProperty(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addTagProperty(param0, param1, param2, param3);
    }

    public void deleteTagProperties(long param0)
        throws SystemException
    {
    }

    public void deleteTagProperty(AssetTagProperty param0)
        throws SystemException
    {
    }

    public void deleteTagProperty(long param0)
        throws PortalException, SystemException
    {
    }

    public List<AssetTagProperty> getTagProperties()
        throws SystemException
    {
        return this.mockObject.getTagProperties();
    }

    public List<AssetTagProperty> getTagProperties(long param0)
        throws SystemException
    {
        return this.mockObject.getTagProperties(param0);
    }

    public AssetTagProperty getTagProperty(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTagProperty(param0);
    }

    public AssetTagProperty getTagProperty(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTagProperty(param0, param1);
    }

    public String[] getTagPropertyKeys(long param0)
        throws SystemException
    {
        return this.mockObject.getTagPropertyKeys(param0);
    }

    public List<AssetTagProperty> getTagPropertyValues(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getTagPropertyValues(param0, param1);
    }

    public AssetTagProperty updateTagProperty(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTagProperty(param0, param1, param2);
    }

}
