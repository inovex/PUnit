
package com.liferay.portal.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.BackgroundTask;
import com.liferay.portal.model.PersistedModel;
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
public class BackgroundTaskLocalServiceMock
    extends MockService<BackgroundTaskLocalService>
    implements BackgroundTaskLocalService
{

    private HashMap<Long, BackgroundTask> _serviceObjects = new HashMap<Long, BackgroundTask>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.BackgroundTaskLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public String getBackgroundTaskStatusJSON(long param0) {
        return this.mockObject.getBackgroundTaskStatusJSON(param0);
    }

    public void resumeBackgroundTask(long param0)
        throws SystemException
    {
    }

    public void triggerBackgroundTask(long param0) {
    }

    public BackgroundTask addBackgroundTask(long param0, long param1, String param2, String[] param3, Class<?> param4, Map<String, Serializable> param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addBackgroundTask(param0, param1, param2, param3, param4, param5, param6);
    }

    public BackgroundTask addBackgroundTask(BackgroundTask param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
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

    public BackgroundTask createBackgroundTask(long param0) {
        return this.mockObject.createBackgroundTask(param0);
    }

    public BackgroundTask deleteBackgroundTask(BackgroundTask param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteBackgroundTask(param0);
    }

    public BackgroundTask deleteBackgroundTask(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteBackgroundTask(param0);
    }

    public BackgroundTask fetchBackgroundTask(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public BackgroundTask getBackgroundTask(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, String[] param1, int param2)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1, param2);
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, String[] param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1, param2, param3, param4);
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, String param1, String param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1, param2, param3, param4, param5);
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1);
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, String[] param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1);
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, String param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1, param2, param3, param4);
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, String param1, int param2)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1, param2);
    }

    public List<BackgroundTask> getBackgroundTasks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1);
    }

    public List<BackgroundTask> getBackgroundTasks(String[] param0, int param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1, param2, param3, param4);
    }

    public List<BackgroundTask> getBackgroundTasks(String[] param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1);
    }

    public List<BackgroundTask> getBackgroundTasks(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1);
    }

    public List<BackgroundTask> getBackgroundTasks(String param0, int param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1);
    }

    public List<BackgroundTask> getBackgroundTasks(String param0, int param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasks(param0, param1, param2, param3, param4);
    }

    public int getBackgroundTasksCount(long param0, String param1, String param2)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasksCount(param0, param1, param2);
    }

    public int getBackgroundTasksCount(long param0, String param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasksCount(param0, param1, param2);
    }

    public int getBackgroundTasksCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasksCount(param0, param1);
    }

    public int getBackgroundTasksCount()
        throws SystemException
    {
        return this.mockObject.getBackgroundTasksCount();
    }

    public int getBackgroundTasksCount(long param0, String[] param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasksCount(param0, param1, param2);
    }

    public int getBackgroundTasksCount(long param0, String[] param1)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasksCount(param0, param1);
    }

    public int getBackgroundTasksCount(long param0, String param1, String param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.getBackgroundTasksCount(param0, param1, param2, param3);
    }

    public BackgroundTask updateBackgroundTask(BackgroundTask param0)
        throws SystemException
    {
        return this.mockObject.updateBackgroundTask(param0);
    }

    public void addBackgroundTaskAttachment(long param0, long param1, String param2, File param3)
        throws PortalException, SystemException
    {
    }

    public void addBackgroundTaskAttachment(long param0, long param1, String param2, InputStream param3)
        throws PortalException, SystemException
    {
    }

    public BackgroundTask amendBackgroundTask(long param0, Map<String, Serializable> param1, int param2, String param3, ServiceContext param4)
        throws SystemException
    {
        return this.mockObject.amendBackgroundTask(param0, param1, param2, param3, param4);
    }

    public BackgroundTask amendBackgroundTask(long param0, Map<String, Serializable> param1, int param2, ServiceContext param3)
        throws SystemException
    {
        return this.mockObject.amendBackgroundTask(param0, param1, param2, param3);
    }

    public void cleanUpBackgroundTask(BackgroundTask param0, int param1) {
    }

    public void cleanUpBackgroundTasks()
        throws SystemException
    {
    }

    public void deleteCompanyBackgroundTasks(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteGroupBackgroundTasks(long param0)
        throws PortalException, SystemException
    {
    }

    public BackgroundTask fetchFirstBackgroundTask(String param0, int param1)
        throws SystemException
    {
        return this.mockObject.fetchFirstBackgroundTask(param0, param1);
    }

    public BackgroundTask fetchFirstBackgroundTask(long param0, String param1, boolean param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.fetchFirstBackgroundTask(param0, param1, param2, param3);
    }

    public BackgroundTask fetchFirstBackgroundTask(String param0, int param1, OrderByComparator param2)
        throws SystemException
    {
        return this.mockObject.fetchFirstBackgroundTask(param0, param1, param2);
    }

}
