
package com.liferay.portal.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.MissingReferences;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutReference;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.User;
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
public class LayoutLocalServiceMock
    extends MockService<LayoutLocalService>
    implements LayoutLocalService
{

    private HashMap<Long, Layout> _serviceObjects = new HashMap<Long, Layout>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.LayoutLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Layout fetchFirstLayout(long param0, boolean param1, long param2)
        throws SystemException
    {
        return this.mockObject.fetchFirstLayout(param0, param1, param2);
    }

    public Layout fetchLayoutByFriendlyURL(long param0, boolean param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchLayoutByFriendlyURL(param0, param1, param2);
    }

    public long getDefaultPlid(long param0)
        throws SystemException
    {
        return this.mockObject.getDefaultPlid(param0);
    }

    public long getDefaultPlid(long param0, boolean param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getDefaultPlid(param0, param1, param2);
    }

    public long getDefaultPlid(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getDefaultPlid(param0, param1);
    }

    public Layout getFriendlyURLLayout(long param0, boolean param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFriendlyURLLayout(param0, param1, param2);
    }

    public Layout getLayoutByIconImageId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutByIconImageId(param0);
    }

    public List<Layout> getLayoutsByLayoutPrototypeUuid(String param0)
        throws SystemException
    {
        return this.mockObject.getLayoutsByLayoutPrototypeUuid(param0);
    }

    public int getLayoutsByLayoutPrototypeUuidCount(String param0)
        throws SystemException
    {
        return this.mockObject.getLayoutsByLayoutPrototypeUuidCount(param0);
    }

    public long getNextLayoutId(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getNextLayoutId(param0, param1);
    }

    public List<Layout> getNoPermissionLayouts(long param0)
        throws SystemException
    {
        return this.mockObject.getNoPermissionLayouts(param0);
    }

    public List<Layout> getNullFriendlyURLLayouts()
        throws SystemException
    {
        return this.mockObject.getNullFriendlyURLLayouts();
    }

    public Layout getParentLayout(Layout param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getParentLayout(param0);
    }

    public List<Layout> getScopeGroupLayouts(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getScopeGroupLayouts(param0, param1);
    }

    public boolean hasLayouts(User param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.hasLayouts(param0, param1);
    }

    public boolean hasLayouts(long param0, boolean param1, long param2)
        throws SystemException
    {
        return this.mockObject.hasLayouts(param0, param1, param2);
    }

    public boolean hasLayouts(Group param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.hasLayouts(param0, param1, param2);
    }

    public boolean hasLayouts(Group param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.hasLayouts(param0, param1);
    }

    public boolean hasLayouts(User param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.hasLayouts(param0, param1, param2);
    }

    public boolean hasLayoutSetPrototypeLayout(String param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.hasLayoutSetPrototypeLayout(param0, param1, param2);
    }

    public boolean hasLayoutSetPrototypeLayout(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.hasLayoutSetPrototypeLayout(param0, param1);
    }

    public void importLayouts(long param0, long param1, boolean param2, Map<String, String[]> param3, File param4)
        throws PortalException, SystemException
    {
    }

    public void importLayouts(long param0, long param1, boolean param2, Map<String, String[]> param3, InputStream param4)
        throws PortalException, SystemException
    {
    }

    public void importLayouts(long param0, long param1, boolean param2, Map<String, String[]> param3, byte[] param4)
        throws PortalException, SystemException
    {
    }

    public long importLayoutsInBackground(long param0, String param1, long param2, boolean param3, Map<String, String[]> param4, InputStream param5)
        throws PortalException, SystemException
    {
        return this.mockObject.importLayoutsInBackground(param0, param1, param2, param3, param4, param5);
    }

    public long importLayoutsInBackground(long param0, String param1, long param2, boolean param3, Map<String, String[]> param4, File param5)
        throws PortalException, SystemException
    {
        return this.mockObject.importLayoutsInBackground(param0, param1, param2, param3, param4, param5);
    }

    public void importPortletInfo(long param0, String param1, Map<String, String[]> param2, InputStream param3)
        throws PortalException, SystemException
    {
    }

    public void importPortletInfo(long param0, String param1, Map<String, String[]> param2, File param3)
        throws PortalException, SystemException
    {
    }

    public void importPortletInfo(long param0, long param1, long param2, String param3, Map<String, String[]> param4, InputStream param5)
        throws PortalException, SystemException
    {
    }

    public void importPortletInfo(long param0, long param1, long param2, String param3, Map<String, String[]> param4, File param5)
        throws PortalException, SystemException
    {
    }

    public long importPortletInfoInBackground(long param0, String param1, String param2, Map<String, String[]> param3, InputStream param4)
        throws PortalException, SystemException
    {
        return this.mockObject.importPortletInfoInBackground(param0, param1, param2, param3, param4);
    }

    public long importPortletInfoInBackground(long param0, String param1, String param2, Map<String, String[]> param3, File param4)
        throws PortalException, SystemException
    {
        return this.mockObject.importPortletInfoInBackground(param0, param1, param2, param3, param4);
    }

    public long importPortletInfoInBackground(long param0, String param1, long param2, long param3, String param4, Map<String, String[]> param5, File param6)
        throws PortalException, SystemException
    {
        return this.mockObject.importPortletInfoInBackground(param0, param1, param2, param3, param4, param5, param6);
    }

    public long importPortletInfoInBackground(long param0, String param1, long param2, long param3, String param4, Map<String, String[]> param5, InputStream param6)
        throws PortalException, SystemException
    {
        return this.mockObject.importPortletInfoInBackground(param0, param1, param2, param3, param4, param5, param6);
    }

    public Layout updateLookAndFeel(long param0, boolean param1, long param2, String param3, String param4, String param5, boolean param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLookAndFeel(param0, param1, param2, param3, param4, param5, param6);
    }

    public Layout updateName(long param0, boolean param1, long param2, String param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateName(param0, param1, param2, param3, param4);
    }

    public Layout updateName(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateName(param0, param1, param2);
    }

    public Layout updateName(Layout param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateName(param0, param1, param2);
    }

    public Layout updateParentLayoutId(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateParentLayoutId(param0, param1);
    }

    public Layout updateParentLayoutId(long param0, boolean param1, long param2, long param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateParentLayoutId(param0, param1, param2, param3);
    }

    public void updatePriorities(long param0, boolean param1)
        throws PortalException, SystemException
    {
    }

    public Layout updatePriority(long param0, boolean param1, long param2, long param3, long param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePriority(param0, param1, param2, param3, param4);
    }

    public Layout updatePriority(long param0, boolean param1, long param2, int param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePriority(param0, param1, param2, param3);
    }

    public Layout updatePriority(Layout param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePriority(param0, param1);
    }

    public Layout updatePriority(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePriority(param0, param1);
    }

    public void updateScopedPortletNames(long param0, boolean param1, long param2, Map<Locale, String> param3, List<Locale> param4)
        throws PortalException, SystemException
    {
    }

    public void updateScopedPortletNames(long param0, boolean param1, long param2, String param3, String param4)
        throws PortalException, SystemException
    {
    }

    public MissingReferences validateImportLayoutsFile(long param0, long param1, boolean param2, Map<String, String[]> param3, File param4)
        throws PortalException, SystemException
    {
        return this.mockObject.validateImportLayoutsFile(param0, param1, param2, param3, param4);
    }

    public MissingReferences validateImportLayoutsFile(long param0, long param1, boolean param2, Map<String, String[]> param3, InputStream param4)
        throws PortalException, SystemException
    {
        return this.mockObject.validateImportLayoutsFile(param0, param1, param2, param3, param4);
    }

    public MissingReferences validateImportPortletInfo(long param0, long param1, long param2, String param3, Map<String, String[]> param4, InputStream param5)
        throws PortalException, SystemException
    {
        return this.mockObject.validateImportPortletInfo(param0, param1, param2, param3, param4, param5);
    }

    public MissingReferences validateImportPortletInfo(long param0, long param1, long param2, String param3, Map<String, String[]> param4, File param5)
        throws PortalException, SystemException
    {
        return this.mockObject.validateImportPortletInfo(param0, param1, param2, param3, param4, param5);
    }

    public Layout updateFriendlyURL(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateFriendlyURL(param0, param1, param2);
    }

    public Layout createLayout(long param0) {
        return this.mockObject.createLayout(param0);
    }

    public Layout deleteLayout(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayout(param0);
    }

    public Layout deleteLayout(Layout param0)
        throws SystemException
    {
        return this.mockObject.deleteLayout(param0);
    }

    public void deleteLayout(long param0, ServiceContext param1)
        throws PortalException, SystemException
    {
    }

    public void deleteLayout(Layout param0, boolean param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public void deleteLayout(long param0, boolean param1, long param2, ServiceContext param3)
        throws PortalException, SystemException
    {
    }

    public Layout fetchLayout(long param0, boolean param1, long param2)
        throws SystemException
    {
        return this.mockObject.fetchLayout(param0, param1, param2);
    }

    public Layout fetchLayout(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Layout addLayout(long param0, long param1, boolean param2, long param3, String param4, String param5, String param6, String param7, boolean param8, String param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayout(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public Layout addLayout(long param0, long param1, boolean param2, long param3, Map<Locale, String> param4, Map<Locale, String> param5, Map<Locale, String> param6, Map<Locale, String> param7, Map<Locale, String> param8, String param9, boolean param10, String param11, ServiceContext param12)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayout(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
    }

    public Layout addLayout(Layout param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Layout addLayout(long param0, long param1, boolean param2, long param3, Map<Locale, String> param4, Map<Locale, String> param5, Map<Locale, String> param6, Map<Locale, String> param7, Map<Locale, String> param8, String param9, String param10, boolean param11, Map<Locale, String> param12, ServiceContext param13)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayout(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public Layout fetchLayoutByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchLayoutByUuidAndCompanyId(param0, param1);
    }

    public File exportLayoutsAsFile(long param0, boolean param1, long[] param2, Map<String, String[]> param3, Date param4, Date param5)
        throws PortalException, SystemException
    {
        return this.mockObject.exportLayoutsAsFile(param0, param1, param2, param3, param4, param5);
    }

    public long exportLayoutsAsFileInBackground(long param0, String param1, long param2, boolean param3, long[] param4, Map<String, String[]> param5, Date param6, Date param7, String param8)
        throws PortalException, SystemException
    {
        return this.mockObject.exportLayoutsAsFileInBackground(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public byte[] exportPortletInfo(long param0, String param1, Map<String, String[]> param2, Date param3, Date param4)
        throws PortalException, SystemException
    {
        return this.mockObject.exportPortletInfo(param0, param1, param2, param3, param4);
    }

    public byte[] exportPortletInfo(long param0, long param1, String param2, Map<String, String[]> param3, Date param4, Date param5)
        throws PortalException, SystemException
    {
        return this.mockObject.exportPortletInfo(param0, param1, param2, param3, param4, param5);
    }

    public File exportPortletInfoAsFile(long param0, long param1, String param2, Map<String, String[]> param3, Date param4, Date param5)
        throws PortalException, SystemException
    {
        return this.mockObject.exportPortletInfoAsFile(param0, param1, param2, param3, param4, param5);
    }

    public File exportPortletInfoAsFile(long param0, String param1, Map<String, String[]> param2, Date param3, Date param4)
        throws PortalException, SystemException
    {
        return this.mockObject.exportPortletInfoAsFile(param0, param1, param2, param3, param4);
    }

    public long exportPortletInfoAsFileInBackground(long param0, String param1, String param2, Map<String, String[]> param3, Date param4, Date param5, String param6)
        throws PortalException, SystemException
    {
        return this.mockObject.exportPortletInfoAsFileInBackground(param0, param1, param2, param3, param4, param5, param6);
    }

    public long exportPortletInfoAsFileInBackground(long param0, String param1, long param2, long param3, String param4, Map<String, String[]> param5, Date param6, Date param7, String param8)
        throws PortalException, SystemException
    {
        return this.mockObject.exportPortletInfoAsFileInBackground(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public Layout fetchLayoutByUuidAndGroupId(String param0, long param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.fetchLayoutByUuidAndGroupId(param0, param1, param2);
    }

    public Layout getLayoutByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutByUuidAndCompanyId(param0, param1);
    }

    public Layout getLayoutByUuidAndGroupId(String param0, long param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutByUuidAndGroupId(param0, param1, param2);
    }

    public int getLayoutsCount()
        throws SystemException
    {
        return this.mockObject.getLayoutsCount();
    }

    public int getLayoutsCount(User param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutsCount(param0, param1, param2);
    }

    public int getLayoutsCount(Group param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutsCount(param0, param1);
    }

    public int getLayoutsCount(Group param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutsCount(param0, param1, param2);
    }

    public int getLayoutsCount(User param0, boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutsCount(param0, param1);
    }

    public Layout updateLayout(long param0, boolean param1, long param2, long param3, Map<Locale, String> param4, Map<Locale, String> param5, Map<Locale, String> param6, Map<Locale, String> param7, Map<Locale, String> param8, String param9, boolean param10, Map<Locale, String> param11, Boolean param12, byte[] param13, ServiceContext param14)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayout(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
    }

    public Layout updateLayout(long param0, boolean param1, long param2, long param3, Map<Locale, String> param4, Map<Locale, String> param5, Map<Locale, String> param6, Map<Locale, String> param7, Map<Locale, String> param8, String param9, boolean param10, String param11, Boolean param12, byte[] param13, ServiceContext param14)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayout(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
    }

    public Layout updateLayout(long param0, boolean param1, long param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayout(param0, param1, param2, param3);
    }

    public Layout updateLayout(Layout param0)
        throws SystemException
    {
        return this.mockObject.updateLayout(param0);
    }

    public void deleteLayouts(long param0, boolean param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public byte[] exportLayouts(long param0, boolean param1, Map<String, String[]> param2, Date param3, Date param4)
        throws PortalException, SystemException
    {
        return this.mockObject.exportLayouts(param0, param1, param2, param3, param4);
    }

    public byte[] exportLayouts(long param0, boolean param1, long[] param2, Map<String, String[]> param3, Date param4, Date param5)
        throws PortalException, SystemException
    {
        return this.mockObject.exportLayouts(param0, param1, param2, param3, param4, param5);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
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

    public Layout getLayout(long param0, boolean param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayout(param0, param1, param2);
    }

    public Layout getLayout(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutReference[] getLayouts(long param0, String param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.getLayouts(param0, param1, param2, param3);
    }

    public List<Layout> getLayouts(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getLayouts(param0, param1);
    }

    public List<Layout> getLayouts(long param0, boolean param1, long param2)
        throws SystemException
    {
        return this.mockObject.getLayouts(param0, param1, param2);
    }

    public List<Layout> getLayouts(long param0, boolean param1, long param2, boolean param3, int param4, int param5)
        throws SystemException
    {
        return this.mockObject.getLayouts(param0, param1, param2, param3, param4, param5);
    }

    public List<Layout> getLayouts(long param0, boolean param1, String param2)
        throws SystemException
    {
        return this.mockObject.getLayouts(param0, param1, param2);
    }

    public List<Layout> getLayouts(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLayouts(param0, param1);
    }

    public List<Layout> getLayouts(long param0, boolean param1, long[] param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayouts(param0, param1, param2);
    }

    public void setLayouts(long param0, boolean param1, long param2, long[] param3, ServiceContext param4)
        throws PortalException, SystemException
    {
    }

}
