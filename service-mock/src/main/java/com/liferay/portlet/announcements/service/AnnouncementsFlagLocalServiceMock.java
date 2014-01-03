
package com.liferay.portlet.announcements.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.announcements.model.AnnouncementsFlag;
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
public class AnnouncementsFlagLocalServiceMock
    extends MockService<AnnouncementsFlagLocalService>
    implements AnnouncementsFlagLocalService
{

    private HashMap<Long, AnnouncementsFlag> _serviceObjects = new HashMap<Long, AnnouncementsFlag>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.announcements.service.AnnouncementsFlagLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public AnnouncementsFlag addFlag(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.addFlag(param0, param1, param2);
    }

    public void deleteFlag(AnnouncementsFlag param0)
        throws SystemException
    {
    }

    public void deleteFlag(long param0)
        throws PortalException, SystemException
    {
    }

    public AnnouncementsFlag createAnnouncementsFlag(long param0) {
        return this.mockObject.createAnnouncementsFlag(param0);
    }

    public void deleteFlags(long param0)
        throws SystemException
    {
    }

    public AnnouncementsFlag addAnnouncementsFlag(AnnouncementsFlag param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public AnnouncementsFlag getFlag(long param0, long param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getFlag(param0, param1, param2);
    }

    public AnnouncementsFlag deleteAnnouncementsFlag(AnnouncementsFlag param0)
        throws SystemException
    {
        return this.mockObject.deleteAnnouncementsFlag(param0);
    }

    public AnnouncementsFlag deleteAnnouncementsFlag(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteAnnouncementsFlag(param0);
    }

    public AnnouncementsFlag fetchAnnouncementsFlag(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public AnnouncementsFlag getAnnouncementsFlag(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<AnnouncementsFlag> getAnnouncementsFlags(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getAnnouncementsFlags(param0, param1);
    }

    public int getAnnouncementsFlagsCount()
        throws SystemException
    {
        return this.mockObject.getAnnouncementsFlagsCount();
    }

    public AnnouncementsFlag updateAnnouncementsFlag(AnnouncementsFlag param0)
        throws SystemException
    {
        return this.mockObject.updateAnnouncementsFlag(param0);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
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

}
