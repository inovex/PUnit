
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.Team;

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
public class TeamLocalServiceMock
    extends MockService<TeamLocalService>
    implements TeamLocalService
{

    private HashMap<Long, Team> _serviceObjects = new HashMap<Long, Team>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.TeamLocalService.class));
    }

    public List<Team> search(long param0, String param1, String param2, LinkedHashMap<String, Object> param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6);
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

    public List<Team> getTeams(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getTeams(param0, param1);
    }

    public int searchCount(long param0, String param1, String param2, LinkedHashMap<String, Object> param3)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3);
    }

    public Team addTeam(Team param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Team addTeam(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addTeam(param0, param1, param2, param3);
    }

    public Team createTeam(long param0) {
        return this.mockObject.createTeam(param0);
    }

    public Team deleteTeam(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteTeam(param0);
    }

    public Team deleteTeam(Team param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteTeam(param0);
    }

    public Team fetchTeam(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Team getTeam(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Team getTeam(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getTeam(param0, param1);
    }

    public int getTeamsCount()
        throws SystemException
    {
        return this.mockObject.getTeamsCount();
    }

    public Team updateTeam(Team param0)
        throws SystemException
    {
        return this.mockObject.updateTeam(param0);
    }

    public Team updateTeam(Team param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateTeam(param0, param1);
    }

    public Team updateTeam(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateTeam(param0, param1, param2);
    }

    public void deleteTeams(long param0)
        throws PortalException, SystemException
    {
    }

    public List<Team> getGroupTeams(long param0)
        throws SystemException
    {
        return this.mockObject.getGroupTeams(param0);
    }

    public List<Team> getUserTeams(long param0)
        throws SystemException
    {
        return this.mockObject.getUserTeams(param0);
    }

    public List<Team> getUserTeams(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getUserTeams(param0, param1);
    }

    public boolean hasUserTeam(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.hasUserTeam(param0, param1);
    }

}
