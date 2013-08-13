
package com.liferay.portlet.social.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.social.model.SocialAchievement;
import com.liferay.portlet.social.model.SocialActivityAchievement;

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
public class SocialActivityAchievementLocalServiceMock
    extends MockService<SocialActivityAchievementLocalService>
    implements SocialActivityAchievementLocalService
{

    private HashMap<Long, SocialActivityAchievement> _serviceObjects = new HashMap<Long, SocialActivityAchievement>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.service.SocialActivityAchievementLocalService.class));
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

    public SocialActivityAchievement addSocialActivityAchievement(SocialActivityAchievement param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SocialActivityAchievement createSocialActivityAchievement(long param0) {
        return this.mockObject.createSocialActivityAchievement(param0);
    }

    public SocialActivityAchievement deleteSocialActivityAchievement(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSocialActivityAchievement(param0);
    }

    public SocialActivityAchievement deleteSocialActivityAchievement(SocialActivityAchievement param0)
        throws SystemException
    {
        return this.mockObject.deleteSocialActivityAchievement(param0);
    }

    public SocialActivityAchievement fetchSocialActivityAchievement(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SocialActivityAchievement getSocialActivityAchievement(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SocialActivityAchievement> getSocialActivityAchievements(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSocialActivityAchievements(param0, param1);
    }

    public int getSocialActivityAchievementsCount()
        throws SystemException
    {
        return this.mockObject.getSocialActivityAchievementsCount();
    }

    public SocialActivityAchievement updateSocialActivityAchievement(SocialActivityAchievement param0)
        throws SystemException
    {
        return this.mockObject.updateSocialActivityAchievement(param0);
    }

    public SocialActivityAchievement updateSocialActivityAchievement(SocialActivityAchievement param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateSocialActivityAchievement(param0, param1);
    }

    public void addActivityAchievement(long param0, long param1, SocialAchievement param2)
        throws PortalException, SystemException
    {
    }

    public SocialActivityAchievement fetchUserAchievement(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.fetchUserAchievement(param0, param1, param2);
    }

    public List<SocialActivityAchievement> getGroupAchievements(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupAchievements(param0);
    }

    public List<SocialActivityAchievement> getGroupAchievements(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getGroupAchievements(param0, param1);
    }

    public int getGroupAchievementsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupAchievementsCount(param0);
    }

    public int getGroupAchievementsCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getGroupAchievementsCount(param0, param1);
    }

    public List<SocialActivityAchievement> getGroupFirstAchievements(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupFirstAchievements(param0);
    }

    public int getGroupFirstAchievementsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupFirstAchievementsCount(param0);
    }

    public int getUserAchievementCount(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getUserAchievementCount(param0, param1, param2);
    }

    public List<SocialActivityAchievement> getUserAchievements(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getUserAchievements(param0, param1, param2);
    }

}
