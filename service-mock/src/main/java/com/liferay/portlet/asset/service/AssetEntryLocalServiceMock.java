
package com.liferay.portlet.asset.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.persistence.AssetEntryQuery;
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
public class AssetEntryLocalServiceMock
    extends MockService<AssetEntryLocalService>
    implements AssetEntryLocalService
{

    private HashMap<Long, AssetEntry> _serviceObjects = new HashMap<Long, AssetEntry>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.asset.service.AssetEntryLocalService.class));
    }

    public Hits search(long param0, long[] param1, long param2, String param3, String param4, int param5, int param6, int param7)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public Hits search(long param0, long[] param1, long param2, String param3, String param4, String param5, String param6, String param7, String param8, boolean param9, int param10, int param11)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public Hits search(long param0, long[] param1, long param2, String param3, String param4, String param5, String param6, String param7, String param8, int param9, boolean param10, int param11, int param12)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
    }

    public Hits search(long param0, long[] param1, long param2, String param3, String param4, int param5, int param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
    }

    public Hits search(long param0, long[] param1, String param2, String param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5);
    }

    public AssetEntry getEntry(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0, param1);
    }

    public AssetEntry getEntry(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0, param1);
    }

    public AssetEntry getEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getEntry(param0);
    }

    public AssetEntry getNextEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getNextEntry(param0);
    }

    public List<AssetEntry> getEntries(AssetEntryQuery param0)
        throws SystemException
    {
        return this.mockObject.getEntries(param0);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void reindex(List<AssetEntry> param0)
        throws PortalException
    {
    }

    public int getEntriesCount(AssetEntryQuery param0)
        throws SystemException
    {
        return this.mockObject.getEntriesCount(param0);
    }

    public AssetEntry fetchEntry(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchEntry(param0, param1);
    }

    public AssetEntry fetchEntry(long param0)
        throws SystemException
    {
        return this.mockObject.fetchEntry(param0);
    }

    public AssetEntry fetchEntry(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchEntry(param0, param1);
    }

    public AssetEntry addAssetEntry(AssetEntry param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AssetEntry createAssetEntry(long param0) {
        return this.mockObject.createAssetEntry(param0);
    }

    public AssetEntry fetchAssetEntry(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AssetEntry> getAssetEntries(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAssetEntries(param0, param1);
    }

    public int getAssetEntriesCount()
        throws SystemException
    {
        return this.mockObject.getAssetEntriesCount();
    }

    public AssetEntry updateAssetEntry(AssetEntry param0)
        throws SystemException
    {
        return this.mockObject.updateAssetEntry(param0);
    }

    public void addAssetCategoryAssetEntry(long param0, long param1)
        throws SystemException
    {
    }

    public void addAssetCategoryAssetEntry(long param0, AssetEntry param1)
        throws SystemException
    {
    }

    public void addAssetCategoryAssetEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addAssetCategoryAssetEntries(long param0, List<AssetEntry> param1)
        throws SystemException
    {
    }

    public void clearAssetCategoryAssetEntries(long param0)
        throws SystemException
    {
    }

    public void deleteAssetCategoryAssetEntry(long param0, AssetEntry param1)
        throws SystemException
    {
    }

    public void deleteAssetCategoryAssetEntry(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteAssetCategoryAssetEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public void deleteAssetCategoryAssetEntries(long param0, List<AssetEntry> param1)
        throws SystemException
    {
    }

    public List<AssetEntry> getAssetCategoryAssetEntries(long param0)
        throws SystemException
    {
        return this.mockObject.getAssetCategoryAssetEntries(param0);
    }

    public List<AssetEntry> getAssetCategoryAssetEntries(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getAssetCategoryAssetEntries(param0, param1, param2, param3);
    }

    public List<AssetEntry> getAssetCategoryAssetEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getAssetCategoryAssetEntries(param0, param1, param2);
    }

    public int getAssetCategoryAssetEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getAssetCategoryAssetEntriesCount(param0);
    }

    public boolean hasAssetCategoryAssetEntry(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasAssetCategoryAssetEntry(param0, param1);
    }

    public boolean hasAssetCategoryAssetEntries(long param0)
        throws SystemException
    {
        return this.mockObject.hasAssetCategoryAssetEntries(param0);
    }

    public void setAssetCategoryAssetEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addAssetTagAssetEntry(long param0, long param1)
        throws SystemException
    {
    }

    public void addAssetTagAssetEntry(long param0, AssetEntry param1)
        throws SystemException
    {
    }

    public void addAssetTagAssetEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public void addAssetTagAssetEntries(long param0, List<AssetEntry> param1)
        throws SystemException
    {
    }

    public void clearAssetTagAssetEntries(long param0)
        throws SystemException
    {
    }

    public void deleteAssetTagAssetEntry(long param0, AssetEntry param1)
        throws SystemException
    {
    }

    public void deleteAssetTagAssetEntry(long param0, long param1)
        throws SystemException
    {
    }

    public void deleteAssetTagAssetEntries(long param0, List<AssetEntry> param1)
        throws SystemException
    {
    }

    public void deleteAssetTagAssetEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<AssetEntry> getAssetTagAssetEntries(long param0)
        throws SystemException
    {
        return this.mockObject.getAssetTagAssetEntries(param0);
    }

    public List<AssetEntry> getAssetTagAssetEntries(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getAssetTagAssetEntries(param0, param1, param2, param3);
    }

    public List<AssetEntry> getAssetTagAssetEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getAssetTagAssetEntries(param0, param1, param2);
    }

    public int getAssetTagAssetEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getAssetTagAssetEntriesCount(param0);
    }

    public boolean hasAssetTagAssetEntry(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasAssetTagAssetEntry(param0, param1);
    }

    public boolean hasAssetTagAssetEntries(long param0)
        throws SystemException
    {
        return this.mockObject.hasAssetTagAssetEntries(param0);
    }

    public void setAssetTagAssetEntries(long param0, long[] param1)
        throws SystemException
    {
    }

    public List<AssetEntry> getAncestorEntries(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getAncestorEntries(param0);
    }

    public List<AssetEntry> getChildEntries(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getChildEntries(param0);
    }

    public List<AssetEntry> getCompanyEntries(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyEntries(param0, param1, param2);
    }

    public int getCompanyEntriesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyEntriesCount(param0);
    }

    public AssetEntry deleteAssetEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAssetEntry(param0);
    }

    public AssetEntry deleteAssetEntry(AssetEntry param0)
        throws SystemException
    {
        return this.mockObject.deleteAssetEntry(param0);
    }

    public AssetEntry getAssetEntry(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public void validate(long param0, String param1, long[] param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public AssetEntry updateEntry(long param0, long param1, String param2, long param3, long[] param4, String[] param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4, param5);
    }

    public AssetEntry updateEntry(long param0, long param1, String param2, long param3, String param4, long param5, long[] param6, String[] param7, boolean param8, Date param9, Date param10, Date param11, Date param12, String param13, String param14, String param15, String param16, String param17, String param18, int param19, int param20, Integer param21, boolean param22)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22);
    }

    public AssetEntry updateEntry(String param0, long param1, Date param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3);
    }

    public AssetEntry updateEntry(String param0, long param1, Date param2, Date param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4);
    }

    public AssetEntry updateEntry(long param0, long param1, Date param2, Date param3, String param4, long param5, String param6, long param7, long[] param8, String[] param9, boolean param10, Date param11, Date param12, Date param13, String param14, String param15, String param16, String param17, String param18, String param19, int param20, int param21, Integer param22, boolean param23)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23);
    }

    public AssetEntry updateEntry(long param0, long param1, String param2, long param3, String param4, long param5, long[] param6, String[] param7, boolean param8, Date param9, Date param10, Date param11, String param12, String param13, String param14, String param15, String param16, String param17, int param18, int param19, Integer param20, boolean param21)
        throws PortalException, SystemException
    {
        return this.mockObject.updateEntry(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21);
    }

    public AssetEntry getParentEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentEntry(param0);
    }

    public AssetEntry getPreviousEntry(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPreviousEntry(param0);
    }

    public List<AssetEntry> getTopViewedEntries(String param0, boolean param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getTopViewedEntries(param0, param1, param2, param3);
    }

    public List<AssetEntry> getTopViewedEntries(String[] param0, boolean param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getTopViewedEntries(param0, param1, param2, param3);
    }

    public AssetEntry incrementViewCounter(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.incrementViewCounter(param0, param1, param2);
    }

    public AssetEntry incrementViewCounter(long param0, String param1, long param2, int param3)
        throws SystemException
    {
        return this.mockObject.incrementViewCounter(param0, param1, param2, param3);
    }

    public AssetEntry updateVisible(String param0, long param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateVisible(param0, param1, param2);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public void deleteEntry(String param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteEntry(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteEntry(AssetEntry param0)
        throws PortalException, SystemException
    {
    }

}
