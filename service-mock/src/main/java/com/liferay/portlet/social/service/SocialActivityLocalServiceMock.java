
package com.liferay.portlet.social.service;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.social.model.SocialActivity;
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
public class SocialActivityLocalServiceMock
    extends MockService<SocialActivityLocalService>
    implements SocialActivityLocalService
{

    private HashMap<Long, SocialActivity> _serviceObjects = new HashMap<Long, SocialActivity>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.service.SocialActivityLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public SocialActivity getSocialActivity(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SocialActivity> getSocialActivities(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSocialActivities(param0, param1);
    }

    public int getSocialActivitiesCount()
        throws SystemException
    {
        return this.mockObject.getSocialActivitiesCount();
    }

    public SocialActivity updateSocialActivity(SocialActivity param0)
        throws SystemException
    {
        return this.mockObject.updateSocialActivity(param0);
    }

    public void addActivity(SocialActivity param0, SocialActivity param1)
        throws PortalException, SystemException
    {
    }

    public void addActivity(long param0, long param1, Date param2, String param3, long param4, int param5, String param6, long param7)
        throws PortalException, SystemException
    {
    }

    public void addActivity(long param0, long param1, String param2, long param3, int param4, String param5, long param6)
        throws PortalException, SystemException
    {
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

    public int getActivitiesCount(String param0)
        throws SystemException
    {
        return this.mockObject.getActivitiesCount(param0);
    }

    public int getActivitiesCount(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.getActivitiesCount(param0, param1, param2);
    }

    public int getActivitiesCount(long param0, long param1, long param2)
        throws SystemException
    {
        return this.mockObject.getActivitiesCount(param0, param1, param2);
    }

    public int getActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getActivitiesCount(param0);
    }

    public List<SocialActivity> getActivitySetActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getActivitySetActivities(param0, param1, param2);
    }

    public List<SocialActivity> getGroupActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupActivities(param0, param1, param2);
    }

    public int getGroupActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupActivitiesCount(param0);
    }

    public List<SocialActivity> getGroupUsersActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupUsersActivities(param0, param1, param2);
    }

    public int getGroupUsersActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupUsersActivitiesCount(param0);
    }

    public SocialActivity getMirrorActivity(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getMirrorActivity(param0);
    }

    public List<SocialActivity> getOrganizationActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getOrganizationActivities(param0, param1, param2);
    }

    public int getOrganizationActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationActivitiesCount(param0);
    }

    public List<SocialActivity> getOrganizationUsersActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getOrganizationUsersActivities(param0, param1, param2);
    }

    public int getOrganizationUsersActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getOrganizationUsersActivitiesCount(param0);
    }

    public List<SocialActivity> getRelationActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getRelationActivities(param0, param1, param2);
    }

    public List<SocialActivity> getRelationActivities(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getRelationActivities(param0, param1, param2, param3);
    }

    public int getRelationActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getRelationActivitiesCount(param0);
    }

    public int getRelationActivitiesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRelationActivitiesCount(param0, param1);
    }

    public List<SocialActivity> getUserActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserActivities(param0, param1, param2);
    }

    public int getUserActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserActivitiesCount(param0);
    }

    public List<SocialActivity> getUserGroupsActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserGroupsActivities(param0, param1, param2);
    }

    public int getUserGroupsActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupsActivitiesCount(param0);
    }

    public List<SocialActivity> getUserGroupsAndOrganizationsActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserGroupsAndOrganizationsActivities(param0, param1, param2);
    }

    public int getUserGroupsAndOrganizationsActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserGroupsAndOrganizationsActivitiesCount(param0);
    }

    public List<SocialActivity> getUserOrganizationsActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserOrganizationsActivities(param0, param1, param2);
    }

    public int getUserOrganizationsActivitiesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getUserOrganizationsActivitiesCount(param0);
    }

    public SocialActivity createSocialActivity(long param0) {
        return this.mockObject.createSocialActivity(param0);
    }

    public SocialActivity deleteSocialActivity(SocialActivity param0)
        throws SystemException
    {
        return this.mockObject.deleteSocialActivity(param0);
    }

    public SocialActivity deleteSocialActivity(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSocialActivity(param0);
    }

    public SocialActivity fetchSocialActivity(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SocialActivity addSocialActivity(SocialActivity param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public void addUniqueActivity(long param0, long param1, String param2, long param3, int param4, String param5, long param6)
        throws PortalException, SystemException
    {
    }

    public void addUniqueActivity(long param0, long param1, Date param2, String param3, long param4, int param5, String param6, long param7)
        throws PortalException, SystemException
    {
    }

    public void deleteActivities(long param0)
        throws SystemException
    {
    }

    public void deleteActivities(AssetEntry param0)
        throws PortalException, SystemException
    {
    }

    public void deleteActivities(String param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteActivity(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteActivity(SocialActivity param0)
        throws PortalException, SystemException
    {
    }

    public void deleteUserActivities(long param0)
        throws PortalException, SystemException
    {
    }

    public SocialActivity fetchFirstActivity(String param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.fetchFirstActivity(param0, param1, param2);
    }

    public List<SocialActivity> getActivities(String param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getActivities(param0, param1, param2);
    }

    public List<SocialActivity> getActivities(long param0, String param1, long param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getActivities(param0, param1, param2, param3, param4);
    }

    public List<SocialActivity> getActivities(long param0, long param1, long param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getActivities(param0, param1, param2, param3, param4);
    }

    public List<SocialActivity> getActivities(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getActivities(param0, param1, param2);
    }

    public SocialActivity getActivity(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getActivity(param0);
    }

}
