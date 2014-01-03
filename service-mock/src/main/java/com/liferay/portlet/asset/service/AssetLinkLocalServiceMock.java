
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
import com.liferay.portlet.asset.model.AssetLink;
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
public class AssetLinkLocalServiceMock
    extends MockService<AssetLinkLocalService>
    implements AssetLinkLocalService
{

    private HashMap<Long, AssetLink> _serviceObjects = new HashMap<Long, AssetLink>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetLinkLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public AssetLink deleteAssetLink(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetLink(param0);
    }

    public AssetLink deleteAssetLink(AssetLink param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetLink(param0);
    }

    public AssetLink fetchAssetLink(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetLink getAssetLink(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AssetLink> getAssetLinks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetLinks(param0, param1);
    }

    public int getAssetLinksCount()
        throws SystemException
    {
        return this.mockObject.getAssetLinksCount();
    }

    public AssetLink updateAssetLink(AssetLink param0)
        throws SystemException
    {
        return this.mockObject.updateAssetLink(param0);
    }

    public AssetLink addLink(long param0, long param1, long param2, int param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.addLink(param0, param1, param2, param3, param4);
    }

    public void deleteLink(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteLink(AssetLink param0)
        throws SystemException
    {
    }

    public void deleteLinks(long param0)
        throws SystemException
    {
    }

    public void deleteLinks(long param0, long param1)
        throws SystemException
    {
    }

    public List<AssetLink> getDirectLinks(long param0)
        throws SystemException
    {
        return this.mockObject.getDirectLinks(param0);
    }

    public List<AssetLink> getDirectLinks(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDirectLinks(param0, param1);
    }

    public List<AssetLink> getLinks(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLinks(param0, param1);
    }

    public List<AssetLink> getLinks(long param0)
        throws SystemException
    {
        return this.mockObject.getLinks(param0);
    }

    public List<AssetLink> getReverseLinks(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getReverseLinks(param0, param1);
    }

    public AssetLink updateLink(long param0, long param1, long param2, int param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLink(param0, param1, param2, param3, param4);
    }

    public void updateLinks(long param0, long param1, long[] param2, int param3)
        throws PortalException, SystemException
    {
    }

    public AssetLink addAssetLink(AssetLink param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetLink createAssetLink(long param0) {
        return this.mockObject.createAssetLink(param0);
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
