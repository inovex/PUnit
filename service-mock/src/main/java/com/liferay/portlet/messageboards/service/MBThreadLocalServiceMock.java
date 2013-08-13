
package com.liferay.portlet.messageboards.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.messageboards.model.MBMessage;
import com.liferay.portlet.messageboards.model.MBThread;

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
public class MBThreadLocalServiceMock
    extends MockService<MBThreadLocalService>
    implements MBThreadLocalService
{

    private HashMap<Long, MBThread> _serviceObjects = new HashMap<Long, MBThread>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.service.MBThreadLocalService.class));
    }

    public List<MBThread> getThreads(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getThreads(param0, param1, param2, param3, param4);
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

    public MBThread incrementViewCounter(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.incrementViewCounter(param0, param1);
    }

    public MBThread getThread(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getThread(param0);
    }

    public MBThread addMBThread(MBThread param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MBThread createMBThread(long param0) {
        return this.mockObject.createMBThread(param0);
    }

    public MBThread deleteMBThread(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMBThread(param0);
    }

    public MBThread deleteMBThread(MBThread param0)
        throws SystemException
    {
        return this.mockObject.deleteMBThread(param0);
    }

    public MBThread fetchMBThread(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBThread getMBThread(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<MBThread> getMBThreads(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMBThreads(param0, param1);
    }

    public int getMBThreadsCount()
        throws SystemException
    {
        return this.mockObject.getMBThreadsCount();
    }

    public MBThread updateMBThread(MBThread param0)
        throws SystemException
    {
        return this.mockObject.updateMBThread(param0);
    }

    public MBThread updateMBThread(MBThread param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateMBThread(param0, param1);
    }

    public MBThread addThread(long param0, MBMessage param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addThread(param0, param1);
    }

    public void deleteThread(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteThread(MBThread param0)
        throws PortalException, SystemException
    {
    }

    public void deleteThreads(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public MBThread fetchThread(long param0)
        throws SystemException
    {
        return this.mockObject.fetchThread(param0);
    }

    public int getCategoryThreadsCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCategoryThreadsCount(param0, param1, param2);
    }

    public List<MBThread> getGroupThreads(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getGroupThreads(param0, param1, param2, param3);
    }

    public List<MBThread> getGroupThreads(long param0, long param1, int param2, boolean param3, boolean param4, int param5, int param6)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupThreads(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<MBThread> getGroupThreads(long param0, long param1, int param2, boolean param3, int param4, int param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupThreads(param0, param1, param2, param3, param4, param5);
    }

    public List<MBThread> getGroupThreads(long param0, long param1, int param2, int param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getGroupThreads(param0, param1, param2, param3, param4);
    }

    public int getGroupThreadsCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getGroupThreadsCount(param0, param1);
    }

    public int getGroupThreadsCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupThreadsCount(param0, param1, param2);
    }

    public int getGroupThreadsCount(long param0, long param1, int param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.getGroupThreadsCount(param0, param1, param2, param3);
    }

    public int getGroupThreadsCount(long param0, long param1, int param2, boolean param3, boolean param4)
        throws SystemException
    {
        return this.mockObject.getGroupThreadsCount(param0, param1, param2, param3, param4);
    }

    public List<MBThread> getNoAssetThreads()
        throws SystemException
    {
        return this.mockObject.getNoAssetThreads();
    }

    public List<MBThread> getPriorityThreads(long param0, double param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPriorityThreads(param0, param1);
    }

    public List<MBThread> getPriorityThreads(long param0, double param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getPriorityThreads(param0, param1, param2);
    }

    public int getThreadsCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getThreadsCount(param0, param1, param2);
    }

    public boolean hasAnswerMessage(long param0)
        throws SystemException
    {
        return this.mockObject.hasAnswerMessage(param0);
    }

    public MBThread moveThread(long param0, long param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.moveThread(param0, param1, param2);
    }

    public MBThread splitThread(long param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
        return this.mockObject.splitThread(param0, param1, param2);
    }

    public void updateQuestion(long param0, boolean param1)
        throws PortalException, SystemException
    {
    }

    public MBThread updateThread(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateThread(param0, param1);
    }

}
