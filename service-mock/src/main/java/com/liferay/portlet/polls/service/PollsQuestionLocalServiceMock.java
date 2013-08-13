
package com.liferay.portlet.polls.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.polls.model.PollsChoice;
import com.liferay.portlet.polls.model.PollsQuestion;

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
public class PollsQuestionLocalServiceMock
    extends MockService<PollsQuestionLocalService>
    implements PollsQuestionLocalService
{

    private HashMap<Long, PollsQuestion> _serviceObjects = new HashMap<Long, PollsQuestion>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.polls.service.PollsQuestionLocalService.class));
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

    public PollsQuestion getQuestion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getQuestion(param0);
    }

    public PollsQuestion updateQuestion(long param0, long param1, Map<Locale, String> param2, Map<Locale, String> param3, int param4, int param5, int param6, int param7, int param8, boolean param9, List<PollsChoice> param10, ServiceContext param11)
        throws PortalException, SystemException
    {
        return this.mockObject.updateQuestion(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public PollsQuestion addPollsQuestion(PollsQuestion param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public PollsQuestion createPollsQuestion(long param0) {
        return this.mockObject.createPollsQuestion(param0);
    }

    public PollsQuestion deletePollsQuestion(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePollsQuestion(param0);
    }

    public PollsQuestion deletePollsQuestion(PollsQuestion param0)
        throws SystemException
    {
        return this.mockObject.deletePollsQuestion(param0);
    }

    public PollsQuestion fetchPollsQuestion(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PollsQuestion getPollsQuestion(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PollsQuestion getPollsQuestionByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPollsQuestionByUuidAndGroupId(param0, param1);
    }

    public List<PollsQuestion> getPollsQuestions(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPollsQuestions(param0, param1);
    }

    public int getPollsQuestionsCount()
        throws SystemException
    {
        return this.mockObject.getPollsQuestionsCount();
    }

    public PollsQuestion updatePollsQuestion(PollsQuestion param0)
        throws SystemException
    {
        return this.mockObject.updatePollsQuestion(param0);
    }

    public PollsQuestion updatePollsQuestion(PollsQuestion param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updatePollsQuestion(param0, param1);
    }

    public PollsQuestion addQuestion(long param0, Map<Locale, String> param1, Map<Locale, String> param2, int param3, int param4, int param5, int param6, int param7, boolean param8, List<PollsChoice> param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.addQuestion(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public void addQuestionResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addQuestionResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addQuestionResources(PollsQuestion param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addQuestionResources(PollsQuestion param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteQuestion(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteQuestion(PollsQuestion param0)
        throws PortalException, SystemException
    {
    }

    public void deleteQuestions(long param0)
        throws PortalException, SystemException
    {
    }

    public List<PollsQuestion> getQuestions(long param0)
        throws SystemException
    {
        return this.mockObject.getQuestions(param0);
    }

    public List<PollsQuestion> getQuestions(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getQuestions(param0, param1, param2);
    }

    public int getQuestionsCount(long param0)
        throws SystemException
    {
        return this.mockObject.getQuestionsCount(param0);
    }

}
