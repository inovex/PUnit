
package com.liferay.portlet.messageboards.service;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.messageboards.model.MBDiscussion;
import com.liferay.portlet.messageboards.model.MBMessage;
import com.liferay.portlet.messageboards.model.MBMessageDisplay;

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
public class MBMessageLocalServiceMock
    extends MockService<MBMessageLocalService>
    implements MBMessageLocalService
{

    private HashMap<Long, MBMessage> _serviceObjects = new HashMap<Long, MBMessage>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.messageboards.service.MBMessageLocalService.class));
    }

    public MBMessage getMessage(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getMessage(param0);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<MBMessage> getMessages(String param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getMessages(param0, param1, param2);
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

    public void updateAsset(long param0, MBMessage param1, long[] param2, String[] param3, long[] param4)
        throws PortalException, SystemException
    {
    }

    public MBMessage updateStatus(long param0, long param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

    public MBMessage addMBMessage(MBMessage param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public MBMessage createMBMessage(long param0) {
        return this.mockObject.createMBMessage(param0);
    }

    public MBMessage deleteMBMessage(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteMBMessage(param0);
    }

    public MBMessage deleteMBMessage(MBMessage param0)
        throws SystemException
    {
        return this.mockObject.deleteMBMessage(param0);
    }

    public MBMessage fetchMBMessage(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBMessage getMBMessage(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public MBMessage getMBMessageByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getMBMessageByUuidAndGroupId(param0, param1);
    }

    public List<MBMessage> getMBMessages(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getMBMessages(param0, param1);
    }

    public int getMBMessagesCount()
        throws SystemException
    {
        return this.mockObject.getMBMessagesCount();
    }

    public MBMessage updateMBMessage(MBMessage param0)
        throws SystemException
    {
        return this.mockObject.updateMBMessage(param0);
    }

    public MBMessage updateMBMessage(MBMessage param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateMBMessage(param0, param1);
    }

    public MBMessage addDiscussionMessage(long param0, String param1, long param2, String param3, long param4, int param5)
        throws PortalException, SystemException
    {
        return this.mockObject.addDiscussionMessage(param0, param1, param2, param3, param4, param5);
    }

    public MBMessage addDiscussionMessage(long param0, String param1, long param2, String param3, long param4, long param5, long param6, String param7, String param8, ServiceContext param9)
        throws PortalException, SystemException
    {
        return this.mockObject.addDiscussionMessage(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public MBMessage addMessage(long param0, String param1, long param2, long param3, long param4, long param5, String param6, String param7, String param8, List<ObjectValuePair<String, InputStream>> param9, boolean param10, double param11, boolean param12, ServiceContext param13)
        throws PortalException, SystemException
    {
        return this.mockObject.addMessage(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
    }

    public MBMessage addMessage(long param0, String param1, long param2, long param3, String param4, String param5, String param6, List<ObjectValuePair<String, InputStream>> param7, boolean param8, double param9, boolean param10, ServiceContext param11)
        throws PortalException, SystemException
    {
        return this.mockObject.addMessage(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public void addMessageResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addMessageResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addMessageResources(MBMessage param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addMessageResources(MBMessage param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void deleteDiscussionMessage(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteDiscussionMessages(String param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void deleteMessage(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteMessage(MBMessage param0)
        throws PortalException, SystemException
    {
    }

    public List<MBMessage> getCategoryMessages(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getCategoryMessages(param0, param1, param2, param3, param4);
    }

    public List<MBMessage> getCategoryMessages(long param0, long param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getCategoryMessages(param0, param1, param2, param3, param4, param5);
    }

    public int getCategoryMessagesCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCategoryMessagesCount(param0, param1, param2);
    }

    public List<MBMessage> getCompanyMessages(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getCompanyMessages(param0, param1, param2, param3);
    }

    public List<MBMessage> getCompanyMessages(long param0, int param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getCompanyMessages(param0, param1, param2, param3, param4);
    }

    public int getCompanyMessagesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getCompanyMessagesCount(param0, param1);
    }

    public MBMessageDisplay getDiscussionMessageDisplay(long param0, long param1, String param2, long param3, int param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getDiscussionMessageDisplay(param0, param1, param2, param3, param4);
    }

    public MBMessageDisplay getDiscussionMessageDisplay(long param0, long param1, String param2, long param3, int param4, String param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getDiscussionMessageDisplay(param0, param1, param2, param3, param4, param5);
    }

    public int getDiscussionMessagesCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getDiscussionMessagesCount(param0, param1, param2);
    }

    public int getDiscussionMessagesCount(String param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getDiscussionMessagesCount(param0, param1, param2);
    }

    public List<MBDiscussion> getDiscussions(String param0)
        throws SystemException
    {
        return this.mockObject.getDiscussions(param0);
    }

    public List<MBMessage> getGroupMessages(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getGroupMessages(param0, param1, param2, param3);
    }

    public List<MBMessage> getGroupMessages(long param0, int param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getGroupMessages(param0, param1, param2, param3, param4);
    }

    public List<MBMessage> getGroupMessages(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getGroupMessages(param0, param1, param2, param3, param4);
    }

    public List<MBMessage> getGroupMessages(long param0, long param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getGroupMessages(param0, param1, param2, param3, param4, param5);
    }

    public int getGroupMessagesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getGroupMessagesCount(param0, param1);
    }

    public int getGroupMessagesCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getGroupMessagesCount(param0, param1, param2);
    }

    public MBMessageDisplay getMessageDisplay(long param0, long param1, int param2, String param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getMessageDisplay(param0, param1, param2, param3, param4);
    }

    public MBMessageDisplay getMessageDisplay(long param0, MBMessage param1, int param2, String param3, boolean param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getMessageDisplay(param0, param1, param2, param3, param4);
    }

    public List<MBMessage> getNoAssetMessages()
        throws SystemException
    {
        return this.mockObject.getNoAssetMessages();
    }

    public int getPositionInThread(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPositionInThread(param0);
    }

    public List<MBMessage> getThreadMessages(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getThreadMessages(param0, param1);
    }

    public List<MBMessage> getThreadMessages(long param0, int param1, Comparator<MBMessage> param2)
        throws SystemException
    {
        return this.mockObject.getThreadMessages(param0, param1, param2);
    }

    public List<MBMessage> getThreadMessages(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getThreadMessages(param0, param1, param2, param3);
    }

    public int getThreadMessagesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getThreadMessagesCount(param0, param1);
    }

    public List<MBMessage> getThreadRepliesMessages(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getThreadRepliesMessages(param0, param1, param2, param3);
    }

    public List<MBMessage> getUserDiscussionMessages(long param0, long param1, long param2, int param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.getUserDiscussionMessages(param0, param1, param2, param3, param4, param5, param6);
    }

    public List<MBMessage> getUserDiscussionMessages(long param0, long[] param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getUserDiscussionMessages(param0, param1, param2, param3, param4, param5);
    }

    public List<MBMessage> getUserDiscussionMessages(long param0, String param1, long param2, int param3, int param4, int param5, OrderByComparator param6)
        throws SystemException
    {
        return this.mockObject.getUserDiscussionMessages(param0, param1, param2, param3, param4, param5, param6);
    }

    public int getUserDiscussionMessagesCount(long param0, long param1, long param2, int param3)
        throws SystemException
    {
        return this.mockObject.getUserDiscussionMessagesCount(param0, param1, param2, param3);
    }

    public int getUserDiscussionMessagesCount(long param0, long[] param1, int param2)
        throws SystemException
    {
        return this.mockObject.getUserDiscussionMessagesCount(param0, param1, param2);
    }

    public int getUserDiscussionMessagesCount(long param0, String param1, long param2, int param3)
        throws SystemException
    {
        return this.mockObject.getUserDiscussionMessagesCount(param0, param1, param2, param3);
    }

    public void subscribeMessage(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void unsubscribeMessage(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void updateAnswer(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void updateAnswer(MBMessage param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public MBMessage updateDiscussionMessage(long param0, long param1, String param2, long param3, String param4, String param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateDiscussionMessage(param0, param1, param2, param3, param4, param5, param6);
    }

    public MBMessage updateMessage(long param0, long param1, String param2, String param3, List<ObjectValuePair<String, InputStream>> param4, List<String> param5, double param6, boolean param7, ServiceContext param8)
        throws PortalException, SystemException
    {
        return this.mockObject.updateMessage(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public MBMessage updateMessage(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateMessage(param0, param1);
    }

    public void updateUserName(long param0, String param1)
        throws SystemException
    {
    }

}
