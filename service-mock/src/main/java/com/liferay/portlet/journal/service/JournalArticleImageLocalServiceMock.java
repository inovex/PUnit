
package com.liferay.portlet.journal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.journal.model.JournalArticleImage;
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
public class JournalArticleImageLocalServiceMock
    extends MockService<JournalArticleImageLocalService>
    implements JournalArticleImageLocalService
{

    private HashMap<Long, JournalArticleImage> _serviceObjects = new HashMap<Long, JournalArticleImage>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalArticleImageLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public void addArticleImageId(long param0, long param1, String param2, double param3, String param4, String param5, String param6)
        throws PortalException, SystemException
    {
    }

    public void deleteArticleImage(long param0)
        throws SystemException
    {
    }

    public void deleteArticleImage(long param0, String param1, double param2, String param3, String param4, String param5)
        throws SystemException
    {
    }

    public void deleteArticleImage(JournalArticleImage param0)
        throws SystemException
    {
    }

    public void deleteImages(long param0, String param1, double param2)
        throws SystemException
    {
    }

    public JournalArticleImage getArticleImage(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleImage(param0);
    }

    public long getArticleImageId(long param0, String param1, double param2, String param3, String param4, String param5, boolean param6)
        throws SystemException
    {
        return this.mockObject.getArticleImageId(param0, param1, param2, param3, param4, param5, param6);
    }

    public long getArticleImageId(long param0, String param1, double param2, String param3, String param4, String param5)
        throws SystemException
    {
        return this.mockObject.getArticleImageId(param0, param1, param2, param3, param4, param5);
    }

    public List<JournalArticleImage> getArticleImages(long param0, String param1, double param2)
        throws SystemException
    {
        return this.mockObject.getArticleImages(param0, param1, param2);
    }

    public List<JournalArticleImage> getArticleImages(long param0)
        throws SystemException
    {
        return this.mockObject.getArticleImages(param0);
    }

    public JournalArticleImage createJournalArticleImage(long param0) {
        return this.mockObject.createJournalArticleImage(param0);
    }

    public JournalArticleImage addJournalArticleImage(JournalArticleImage param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalArticleImage getJournalArticleImage(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<JournalArticleImage> getJournalArticleImages(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalArticleImages(param0, param1);
    }

    public int getJournalArticleImagesCount()
        throws SystemException
    {
        return this.mockObject.getJournalArticleImagesCount();
    }

    public JournalArticleImage updateJournalArticleImage(JournalArticleImage param0)
        throws SystemException
    {
        return this.mockObject.updateJournalArticleImage(param0);
    }

    public JournalArticleImage deleteJournalArticleImage(JournalArticleImage param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalArticleImage(param0);
    }

    public JournalArticleImage deleteJournalArticleImage(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalArticleImage(param0);
    }

    public JournalArticleImage fetchJournalArticleImage(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2, param3);
    }

    public List dynamicQuery(DynamicQuery param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0, param1, param2);
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
