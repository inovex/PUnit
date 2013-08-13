
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.LayoutRevision;
import com.liferay.portal.model.PersistedModel;

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
public class LayoutRevisionLocalServiceMock
    extends MockService<LayoutRevisionLocalService>
    implements LayoutRevisionLocalService
{

    private HashMap<Long, LayoutRevision> _serviceObjects = new HashMap<Long, LayoutRevision>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.LayoutRevisionLocalService.class));
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

    public LayoutRevision addLayoutRevision(LayoutRevision param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public LayoutRevision addLayoutRevision(long param0, long param1, long param2, long param3, boolean param4, long param5, long param6, boolean param7, String param8, String param9, String param10, String param11, String param12, String param13, boolean param14, long param15, String param16, String param17, String param18, String param19, String param20, ServiceContext param21)
        throws PortalException, SystemException
    {
        return this.mockObject.addLayoutRevision(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21);
    }

    public LayoutRevision createLayoutRevision(long param0) {
        return this.mockObject.createLayoutRevision(param0);
    }

    public LayoutRevision deleteLayoutRevision(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutRevision(param0);
    }

    public LayoutRevision deleteLayoutRevision(LayoutRevision param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteLayoutRevision(param0);
    }

    public LayoutRevision fetchLayoutRevision(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutRevision getLayoutRevision(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public LayoutRevision getLayoutRevision(long param0, long param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutRevision(param0, param1, param2);
    }

    public LayoutRevision getLayoutRevision(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLayoutRevision(param0, param1, param2);
    }

    public List<LayoutRevision> getLayoutRevisions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisions(param0, param1);
    }

    public List<LayoutRevision> getLayoutRevisions(long param0)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisions(param0);
    }

    public List<LayoutRevision> getLayoutRevisions(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisions(param0, param1);
    }

    public List<LayoutRevision> getLayoutRevisions(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisions(param0, param1);
    }

    public List<LayoutRevision> getLayoutRevisions(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisions(param0, param1);
    }

    public List<LayoutRevision> getLayoutRevisions(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisions(param0, param1, param2);
    }

    public List<LayoutRevision> getLayoutRevisions(long param0, long param1, long param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisions(param0, param1, param2, param3, param4, param5);
    }

    public int getLayoutRevisionsCount()
        throws SystemException
    {
        return this.mockObject.getLayoutRevisionsCount();
    }

    public int getLayoutRevisionsCount(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getLayoutRevisionsCount(param0, param1, param2);
    }

    public LayoutRevision updateLayoutRevision(LayoutRevision param0)
        throws SystemException
    {
        return this.mockObject.updateLayoutRevision(param0);
    }

    public LayoutRevision updateLayoutRevision(LayoutRevision param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateLayoutRevision(param0, param1);
    }

    public LayoutRevision updateLayoutRevision(long param0, long param1, long param2, String param3, String param4, String param5, String param6, String param7, String param8, boolean param9, long param10, String param11, String param12, String param13, String param14, String param15, ServiceContext param16)
        throws PortalException, SystemException
    {
        return this.mockObject.updateLayoutRevision(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
    }

    public void deleteLayoutLayoutRevisions(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteLayoutRevisions(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteLayoutRevisions(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
    }

    public void deleteLayoutSetBranchLayoutRevisions(long param0)
        throws PortalException, SystemException
    {
    }

    public LayoutRevision fetchLastLayoutRevision(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.fetchLastLayoutRevision(param0, param1);
    }

    public List<LayoutRevision> getChildLayoutRevisions(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getChildLayoutRevisions(param0, param1, param2);
    }

    public List<LayoutRevision> getChildLayoutRevisions(long param0, long param1, long param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getChildLayoutRevisions(param0, param1, param2, param3, param4, param5);
    }

    public int getChildLayoutRevisionsCount(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getChildLayoutRevisionsCount(param0, param1, param2);
    }

    public LayoutRevision updateStatus(long param0, long param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

}
