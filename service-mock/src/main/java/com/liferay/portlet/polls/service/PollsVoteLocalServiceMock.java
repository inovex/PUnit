
package com.liferay.portlet.polls.service;

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
import com.liferay.portlet.polls.model.PollsVote;
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
public class PollsVoteLocalServiceMock
    extends MockService<PollsVoteLocalService>
    implements PollsVoteLocalService
{

    private HashMap<Long, PollsVote> _serviceObjects = new HashMap<Long, PollsVote>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.polls.service.PollsVoteLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public PollsVote deletePollsVote(PollsVote param0)
        throws SystemException
    {
        return this.mockObject.deletePollsVote(param0);
    }

    public PollsVote deletePollsVote(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePollsVote(param0);
    }

    public PollsVote fetchPollsVote(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PollsVote fetchPollsVoteByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchPollsVoteByUuidAndCompanyId(param0, param1);
    }

    public PollsVote getPollsVote(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PollsVote fetchPollsVoteByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchPollsVoteByUuidAndGroupId(param0, param1);
    }

    public PollsVote getPollsVoteByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPollsVoteByUuidAndCompanyId(param0, param1);
    }

    public PollsVote getPollsVoteByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPollsVoteByUuidAndGroupId(param0, param1);
    }

    public List<PollsVote> getPollsVotes(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPollsVotes(param0, param1);
    }

    public int getPollsVotesCount()
        throws SystemException
    {
        return this.mockObject.getPollsVotesCount();
    }

    public PollsVote updatePollsVote(PollsVote param0)
        throws SystemException
    {
        return this.mockObject.updatePollsVote(param0);
    }

    public PollsVote addVote(long param0, long param1, long param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addVote(param0, param1, param2, param3);
    }

    public PollsVote getVote(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getVote(param0, param1);
    }

    public PollsVote addPollsVote(PollsVote param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public PollsVote createPollsVote(long param0) {
        return this.mockObject.createPollsVote(param0);
    }

    public List<PollsVote> getChoiceVotes(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getChoiceVotes(param0, param1, param2);
    }

    public int getChoiceVotesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getChoiceVotesCount(param0);
    }

    public List<PollsVote> getQuestionVotes(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getQuestionVotes(param0, param1, param2);
    }

    public int getQuestionVotesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getQuestionVotesCount(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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
