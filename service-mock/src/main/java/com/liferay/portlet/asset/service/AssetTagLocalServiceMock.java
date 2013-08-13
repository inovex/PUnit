
package com.liferay.portlet.asset.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetTag;

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
public class AssetTagLocalServiceMock
    extends MockService<AssetTagLocalService>
    implements AssetTagLocalService
{

    private HashMap<Long, AssetTag> _serviceObjects = new HashMap<Long, AssetTag>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetTagLocalService.class));
    }

    public List<AssetTag> search(long param0, String param1, String[] param2, int param3, int param4)
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

    public List<AssetTag> getTags()
        throws SystemException
    {
        return this.mockObject.getTags();
    }

    public List<AssetTag> getTags(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getTags(param0, param1);
    }

    public List<AssetTag> getTags(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getTags(param0, param1, param2);
    }

    public List<AssetTag> getTags(long param0, long param1, String param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getTags(param0, param1, param2, param3, param4);
    }

    public List<AssetTag> getTags(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getTags(param0, param1);
    }

    public String[] getTagNames()
        throws SystemException
    {
        return this.mockObject.getTagNames();
    }

    public String[] getTagNames(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getTagNames(param0, param1);
    }

    public String[] getTagNames(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getTagNames(param0, param1);
    }

    public long[] getTagIds(long param0, String[] param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTagIds(param0, param1);
    }

    public long[] getTagIds(long[] param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTagIds(param0, param1);
    }

    public long[] getTagIds(long[] param0, String[] param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTagIds(param0, param1);
    }

    public AssetTag addAssetTag(AssetTag param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetTag createAssetTag(long param0) {
        return this.mockObject.createAssetTag(param0);
    }

    public AssetTag deleteAssetTag(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetTag(param0);
    }

    public AssetTag deleteAssetTag(AssetTag param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetTag(param0);
    }

    public AssetTag fetchAssetTag(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AssetTag getAssetTag(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AssetTag> getAssetTags(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetTags(param0, param1);
    }

    public int getAssetTagsCount()
        throws SystemException
    {
        return this.mockObject.getAssetTagsCount();
    }

    public AssetTag updateAssetTag(AssetTag param0)
        throws SystemException
    {
        return this.mockObject.updateAssetTag(param0);
    }

    public AssetTag updateAssetTag(AssetTag param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateAssetTag(param0, param1);
    }

    public AssetTag addTag(long param0, String param1, String[] param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addTag(param0, param1, param2, param3);
    }

    public void addTagResources(AssetTag param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addTagResources(AssetTag param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void checkTags(long param0, long param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public AssetTag decrementAssetCount(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.decrementAssetCount(param0, param1);
    }

    public void deleteTag(AssetTag param0)
        throws PortalException, SystemException
    {
    }

    public void deleteTag(long param0)
        throws PortalException, SystemException
    {
    }

    public List<AssetTag> getEntryTags(long param0)
        throws SystemException
    {
        return this.mockObject.getEntryTags(param0);
    }

    public List<AssetTag> getGroupsTags(long[] param0)
        throws SystemException
    {
        return this.mockObject.getGroupsTags(param0);
    }

    public List<AssetTag> getGroupTags(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupTags(param0);
    }

    public List<AssetTag> getGroupTags(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupTags(param0, param1, param2);
    }

    public int getGroupTagsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupTagsCount(param0);
    }

    public List<AssetTag> getSocialActivityCounterOffsetTags(long param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getSocialActivityCounterOffsetTags(param0, param1, param2, param3);
    }

    public List<AssetTag> getSocialActivityCounterPeriodTags(long param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getSocialActivityCounterPeriodTags(param0, param1, param2, param3);
    }

    public AssetTag getTag(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getTag(param0);
    }

    public AssetTag getTag(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTag(param0, param1);
    }

    public int getTagsSize(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getTagsSize(param0, param1, param2);
    }

    public boolean hasTag(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.hasTag(param0, param1);
    }

    public AssetTag incrementAssetCount(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.incrementAssetCount(param0, param1);
    }

    public void mergeTags(long param0, long param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public AssetTag updateTag(long param0, long param1, String param2, String[] param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTag(param0, param1, param2, param3, param4);
    }

}
