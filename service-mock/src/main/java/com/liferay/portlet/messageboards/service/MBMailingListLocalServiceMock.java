
package com.liferay.portlet.messageboards.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.messageboards.model.MBMailingList;
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
public class MBMailingListLocalServiceMock
    extends MockService<MBMailingListLocalService>
    implements MBMailingListLocalService
{

    private HashMap<Long, MBMailingList> _serviceObjects = new HashMap<Long, MBMailingList>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.service.MBMailingListLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public MBMailingList deleteMBMailingList(MBMailingList param0)
        throws SystemException
    {
        return this.mockObject.deleteMBMailingList(param0);
    }

    public MBMailingList deleteMBMailingList(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMBMailingList(param0);
    }

    public MBMailingList fetchMBMailingList(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBMailingList fetchMBMailingListByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMBMailingListByUuidAndCompanyId(param0, param1);
    }

    public MBMailingList fetchMBMailingListByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchMBMailingListByUuidAndGroupId(param0, param1);
    }

    public MBMailingList getMBMailingList(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBMailingList getMBMailingListByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBMailingListByUuidAndCompanyId(param0, param1);
    }

    public MBMailingList getMBMailingListByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBMailingListByUuidAndGroupId(param0, param1);
    }

    public List<MBMailingList> getMBMailingLists(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMBMailingLists(param0, param1);
    }

    public int getMBMailingListsCount()
        throws SystemException
    {
        return this.mockObject.getMBMailingListsCount();
    }

    public MBMailingList updateMBMailingList(MBMailingList param0)
        throws SystemException
    {
        return this.mockObject.updateMBMailingList(param0);
    }

    public MBMailingList addMailingList(long param0, long param1, long param2, String param3, String param4, String param5, int param6, boolean param7, String param8, String param9, int param10, String param11, boolean param12, String param13, int param14, boolean param15, String param16, String param17, boolean param18, boolean param19, ServiceContext param20)
        throws PortalException, SystemException
    {
        return this.mockObject.addMailingList(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20);
    }

    public void deleteCategoryMailingList(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteMailingList(MBMailingList param0)
        throws PortalException, SystemException
    {
    }

    public void deleteMailingList(long param0)
        throws PortalException, SystemException
    {
    }

    public MBMailingList addMBMailingList(MBMailingList param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MBMailingList createMBMailingList(long param0) {
        return this.mockObject.createMBMailingList(param0);
    }

    public MBMailingList getCategoryMailingList(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getCategoryMailingList(param0, param1);
    }

    public MBMailingList updateMailingList(long param0, String param1, String param2, String param3, int param4, boolean param5, String param6, String param7, int param8, String param9, boolean param10, String param11, int param12, boolean param13, String param14, String param15, boolean param16, boolean param17, ServiceContext param18)
        throws PortalException, SystemException
    {
        return this.mockObject.updateMailingList(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18);
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

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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
