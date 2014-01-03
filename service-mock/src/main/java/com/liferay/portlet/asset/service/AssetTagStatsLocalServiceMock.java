
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
import com.liferay.portlet.asset.model.AssetTagStats;
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
public class AssetTagStatsLocalServiceMock
    extends MockService<AssetTagStatsLocalService>
    implements AssetTagStatsLocalService
{

    private HashMap<Long, AssetTagStats> _serviceObjects = new HashMap<Long, AssetTagStats>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetTagStatsLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public AssetTagStats getTagStats(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getTagStats(param0, param1);
    }

    public List<AssetTagStats> getTagStats(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getTagStats(param0, param1, param2);
    }

    public AssetTagStats addTagStats(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.addTagStats(param0, param1);
    }

    public AssetTagStats addAssetTagStats(AssetTagStats param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetTagStats createAssetTagStats(long param0) {
        return this.mockObject.createAssetTagStats(param0);
    }

    public AssetTagStats deleteAssetTagStats(AssetTagStats param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetTagStats(param0);
    }

    public AssetTagStats deleteAssetTagStats(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetTagStats(param0);
    }

    public AssetTagStats fetchAssetTagStats(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetTagStats getAssetTagStats(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AssetTagStats> getAssetTagStatses(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetTagStatses(param0, param1);
    }

    public int getAssetTagStatsesCount()
        throws SystemException
    {
        return this.mockObject.getAssetTagStatsesCount();
    }

    public AssetTagStats updateAssetTagStats(AssetTagStats param0)
        throws SystemException
    {
        return this.mockObject.updateAssetTagStats(param0);
    }

    public void deleteTagStats(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteTagStats(AssetTagStats param0)
        throws SystemException
    {
    }

    public void deleteTagStatsByClassNameId(long param0)
        throws SystemException
    {
    }

    public void deleteTagStatsByTagId(long param0)
        throws SystemException
    {
    }

    public AssetTagStats updateTagStats(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTagStats(param0, param1);
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

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
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
