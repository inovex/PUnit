
package com.liferay.portlet.social.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.social.model.SocialActivitySet;
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
public class SocialActivitySetLocalServiceMock
    extends MockService<SocialActivitySetLocalService>
    implements SocialActivitySetLocalService
{

    private HashMap<Long, SocialActivitySet> _serviceObjects = new HashMap<Long, SocialActivitySet>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.service.SocialActivitySetLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void decrementActivityCount(long param0)
        throws PortalException, SystemException
    {
    }

    public void decrementActivityCount(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public SocialActivitySet getClassActivitySet(long param0, long param1, long param2, int param3)
        throws SystemException
    {
        return this.mockObject.getClassActivitySet(param0, param1, param2, param3);
    }

    public SocialActivitySet getClassActivitySet(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getClassActivitySet(param0, param1, param2);
    }

    public List<SocialActivitySet> getGroupActivitySets(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupActivitySets(param0, param1, param2);
    }

    public int getGroupActivitySetsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupActivitySetsCount(param0);
    }

    public List<SocialActivitySet> getRelationActivitySets(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getRelationActivitySets(param0, param1, param2, param3);
    }

    public List<SocialActivitySet> getRelationActivitySets(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRelationActivitySets(param0, param1, param2);
    }

    public int getRelationActivitySetsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRelationActivitySetsCount(param0);
    }

    public int getRelationActivitySetsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRelationActivitySetsCount(param0, param1);
    }

    public SocialActivitySet getUserActivitySet(long param0, long param1, long param2, int param3)
        throws SystemException
    {
        return this.mockObject.getUserActivitySet(param0, param1, param2, param3);
    }

    public SocialActivitySet getUserActivitySet(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserActivitySet(param0, param1, param2);
    }

    public List<SocialActivitySet> getUserActivitySets(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserActivitySets(param0, param1, param2);
    }

    public int getUserActivitySetsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserActivitySetsCount(param0);
    }

    public List<SocialActivitySet> getUserGroupsActivitySets(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserGroupsActivitySets(param0, param1, param2);
    }

    public int getUserGroupsActivitySetsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupsActivitySetsCount(param0);
    }

    public List<SocialActivitySet> getUserViewableActivitySets(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserViewableActivitySets(param0, param1, param2);
    }

    public int getUserViewableActivitySetsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserViewableActivitySetsCount(param0);
    }

    public void incrementActivityCount(long param0, long param1)
        throws PortalException, SystemException
    {
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

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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

    public SocialActivitySet createSocialActivitySet(long param0) {
        return this.mockObject.createSocialActivitySet(param0);
    }

    public SocialActivitySet deleteSocialActivitySet(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSocialActivitySet(param0);
    }

    public SocialActivitySet deleteSocialActivitySet(SocialActivitySet param0)
        throws SystemException
    {
        return this.mockObject.deleteSocialActivitySet(param0);
    }

    public SocialActivitySet fetchSocialActivitySet(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SocialActivitySet getSocialActivitySet(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SocialActivitySet> getSocialActivitySets(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSocialActivitySets(param0, param1);
    }

    public int getSocialActivitySetsCount()
        throws SystemException
    {
        return this.mockObject.getSocialActivitySetsCount();
    }

    public SocialActivitySet updateSocialActivitySet(SocialActivitySet param0)
        throws SystemException
    {
        return this.mockObject.updateSocialActivitySet(param0);
    }

    public SocialActivitySet addActivitySet(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.addActivitySet(param0);
    }

    public SocialActivitySet addSocialActivitySet(SocialActivitySet param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

}
