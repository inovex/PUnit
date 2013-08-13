
package com.liferay.portlet.social.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.social.model.SocialRelation;

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
public class SocialRelationLocalServiceMock
    extends MockService<SocialRelationLocalService>
    implements SocialRelationLocalService
{

    private HashMap<Long, SocialRelation> _serviceObjects = new HashMap<Long, SocialRelation>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.social.service.SocialRelationLocalService.class));
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

    public SocialRelation addSocialRelation(SocialRelation param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public SocialRelation createSocialRelation(long param0) {
        return this.mockObject.createSocialRelation(param0);
    }

    public SocialRelation deleteSocialRelation(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteSocialRelation(param0);
    }

    public SocialRelation deleteSocialRelation(SocialRelation param0)
        throws SystemException
    {
        return this.mockObject.deleteSocialRelation(param0);
    }

    public SocialRelation fetchSocialRelation(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public SocialRelation getSocialRelation(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<SocialRelation> getSocialRelations(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getSocialRelations(param0, param1);
    }

    public int getSocialRelationsCount()
        throws SystemException
    {
        return this.mockObject.getSocialRelationsCount();
    }

    public SocialRelation updateSocialRelation(SocialRelation param0)
        throws SystemException
    {
        return this.mockObject.updateSocialRelation(param0);
    }

    public SocialRelation updateSocialRelation(SocialRelation param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateSocialRelation(param0, param1);
    }

    public SocialRelation addRelation(long param0, long param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.addRelation(param0, param1, param2);
    }

    public void deleteRelation(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteRelation(long param0, long param1, int param2)
        throws PortalException, SystemException
    {
    }

    public void deleteRelation(SocialRelation param0)
        throws PortalException, SystemException
    {
    }

    public void deleteRelations(long param0)
        throws SystemException
    {
    }

    public void deleteRelations(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public List<SocialRelation> getInverseRelations(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getInverseRelations(param0, param1, param2, param3);
    }

    public int getInverseRelationsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getInverseRelationsCount(param0, param1);
    }

    public SocialRelation getRelation(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRelation(param0);
    }

    public SocialRelation getRelation(long param0, long param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getRelation(param0, param1, param2);
    }

    public List<SocialRelation> getRelations(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getRelations(param0, param1, param2, param3);
    }

    public List<SocialRelation> getRelations(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getRelations(param0, param1, param2, param3);
    }

    public int getRelationsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getRelationsCount(param0, param1);
    }

    public int getRelationsCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getRelationsCount(param0, param1);
    }

    public boolean hasRelation(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.hasRelation(param0, param1, param2);
    }

    public boolean isRelatable(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.isRelatable(param0, param1, param2);
    }

}
