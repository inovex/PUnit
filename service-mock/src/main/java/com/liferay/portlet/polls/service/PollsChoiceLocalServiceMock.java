
package com.liferay.portlet.polls.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.polls.model.PollsChoice;

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
public class PollsChoiceLocalServiceMock
    extends MockService<PollsChoiceLocalService>
    implements PollsChoiceLocalService
{

    private HashMap<Long, PollsChoice> _serviceObjects = new HashMap<Long, PollsChoice>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.polls.service.PollsChoiceLocalService.class));
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

    public PollsChoice addPollsChoice(PollsChoice param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public PollsChoice createPollsChoice(long param0) {
        return this.mockObject.createPollsChoice(param0);
    }

    public PollsChoice deletePollsChoice(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePollsChoice(param0);
    }

    public PollsChoice deletePollsChoice(PollsChoice param0)
        throws SystemException
    {
        return this.mockObject.deletePollsChoice(param0);
    }

    public PollsChoice fetchPollsChoice(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PollsChoice getPollsChoice(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<PollsChoice> getPollsChoices(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPollsChoices(param0, param1);
    }

    public int getPollsChoicesCount()
        throws SystemException
    {
        return this.mockObject.getPollsChoicesCount();
    }

    public PollsChoice updatePollsChoice(PollsChoice param0)
        throws SystemException
    {
        return this.mockObject.updatePollsChoice(param0);
    }

    public PollsChoice updatePollsChoice(PollsChoice param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updatePollsChoice(param0, param1);
    }

    public PollsChoice addChoice(long param0, String param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addChoice(param0, param1, param2, param3);
    }

    public PollsChoice getChoice(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getChoice(param0);
    }

    public List<PollsChoice> getChoices(long param0)
        throws SystemException
    {
        return this.mockObject.getChoices(param0);
    }

    public int getChoicesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getChoicesCount(param0);
    }

    public PollsChoice updateChoice(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateChoice(param0, param1, param2, param3);
    }

}
