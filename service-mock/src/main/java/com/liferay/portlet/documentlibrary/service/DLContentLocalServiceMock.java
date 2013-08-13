
package com.liferay.portlet.documentlibrary.service;

import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portlet.documentlibrary.NoSuchContentException;
import com.liferay.portlet.documentlibrary.model.DLContent;
import com.liferay.portlet.documentlibrary.model.DLContentDataBlobModel;

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
public class DLContentLocalServiceMock
    extends MockService<DLContentLocalService>
    implements DLContentLocalService
{

    private HashMap<Long, DLContent> _serviceObjects = new HashMap<Long, DLContent>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.documentlibrary.service.DLContentLocalService.class));
    }

    public DLContent getContent(long param0, long param1, String param2)
        throws SystemException, NoSuchContentException
    {
        return this.mockObject.getContent(param0, param1, param2);
    }

    public DLContent getContent(long param0, long param1, String param2, String param3)
        throws SystemException, NoSuchContentException
    {
        return this.mockObject.getContent(param0, param1, param2, param3);
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

    public List<DLContent> getContents(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getContents(param0, param1);
    }

    public List<DLContent> getContents(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getContents(param0, param1, param2);
    }

    public DLContent addDLContent(DLContent param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public DLContent createDLContent(long param0) {
        return this.mockObject.createDLContent(param0);
    }

    public DLContent deleteDLContent(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteDLContent(param0);
    }

    public DLContent deleteDLContent(DLContent param0)
        throws SystemException
    {
        return this.mockObject.deleteDLContent(param0);
    }

    public DLContent fetchDLContent(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public DLContent getDLContent(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<DLContent> getDLContents(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getDLContents(param0, param1);
    }

    public int getDLContentsCount()
        throws SystemException
    {
        return this.mockObject.getDLContentsCount();
    }

    public DLContent updateDLContent(DLContent param0)
        throws SystemException
    {
        return this.mockObject.updateDLContent(param0);
    }

    public DLContent updateDLContent(DLContent param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateDLContent(param0, param1);
    }

    public void updateDLContent(long param0, long param1, long param2, String param3, String param4)
        throws SystemException
    {
    }

    public DLContentDataBlobModel getDataBlobModel(Serializable param0)
        throws SystemException
    {
        return this.mockObject.getDataBlobModel(param0);
    }

    public DLContent addContent(long param0, long param1, String param2, String param3, byte[] param4)
        throws SystemException
    {
        return this.mockObject.addContent(param0, param1, param2, param3, param4);
    }

    public DLContent addContent(long param0, long param1, String param2, String param3, InputStream param4, long param5)
        throws SystemException
    {
        return this.mockObject.addContent(param0, param1, param2, param3, param4, param5);
    }

    public void deleteContent(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
    }

    public void deleteContents(long param0, long param1, String param2)
        throws SystemException
    {
    }

    public void deleteContentsByDirectory(long param0, long param1, String param2)
        throws SystemException
    {
    }

    public List<DLContent> getContentsByDirectory(long param0, long param1, String param2)
        throws SystemException
    {
        return this.mockObject.getContentsByDirectory(param0, param1, param2);
    }

    public boolean hasContent(long param0, long param1, String param2, String param3)
        throws SystemException
    {
        return this.mockObject.hasContent(param0, param1, param2, param3);
    }

}
