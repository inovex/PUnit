
package com.liferay.portlet.social.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.social.model.SocialActivityLimit;

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
public class SocialActivityLimitLocalServiceMock
    extends MockService<SocialActivityLimitLocalService>
    implements SocialActivityLimitLocalService
{

    private HashMap<Long, SocialActivityLimit> _serviceObjects = new HashMap<Long, SocialActivityLimit>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.service.SocialActivityLimitLocalService.class));
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

    public SocialActivityLimit addSocialActivityLimit(SocialActivityLimit param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SocialActivityLimit createSocialActivityLimit(long param0) {
        return this.mockObject.createSocialActivityLimit(param0);
    }

    public SocialActivityLimit deleteSocialActivityLimit(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSocialActivityLimit(param0);
    }

    public SocialActivityLimit deleteSocialActivityLimit(SocialActivityLimit param0)
        throws SystemException
    {
        return this.mockObject.deleteSocialActivityLimit(param0);
    }

    public SocialActivityLimit fetchSocialActivityLimit(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SocialActivityLimit getSocialActivityLimit(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SocialActivityLimit> getSocialActivityLimits(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSocialActivityLimits(param0, param1);
    }

    public int getSocialActivityLimitsCount()
        throws SystemException
    {
        return this.mockObject.getSocialActivityLimitsCount();
    }

    public SocialActivityLimit updateSocialActivityLimit(SocialActivityLimit param0)
        throws SystemException
    {
        return this.mockObject.updateSocialActivityLimit(param0);
    }

    public SocialActivityLimit updateSocialActivityLimit(SocialActivityLimit param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateSocialActivityLimit(param0, param1);
    }

    public SocialActivityLimit addActivityLimit(long param0, long param1, long param2, long param3, int param4, String param5, int param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addActivityLimit(param0, param1, param2, param3, param4, param5, param6);
    }

}
