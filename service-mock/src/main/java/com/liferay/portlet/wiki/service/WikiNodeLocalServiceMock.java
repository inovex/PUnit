
package com.liferay.portlet.wiki.service;

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
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.wiki.model.WikiNode;
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
public class WikiNodeLocalServiceMock
    extends MockService<WikiNodeLocalService>
    implements WikiNodeLocalService
{

    private HashMap<Long, WikiNode> _serviceObjects = new HashMap<Long, WikiNode>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.wiki.service.WikiNodeLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public WikiNode deleteWikiNode(WikiNode param0)
        throws SystemException
    {
        return this.mockObject.deleteWikiNode(param0);
    }

    public WikiNode deleteWikiNode(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWikiNode(param0);
    }

    public WikiNode fetchWikiNode(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public WikiNode getWikiNodeByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getWikiNodeByUuidAndGroupId(param0, param1);
    }

    public int getWikiNodesCount()
        throws SystemException
    {
        return this.mockObject.getWikiNodesCount();
    }

    public WikiNode updateWikiNode(WikiNode param0)
        throws SystemException
    {
        return this.mockObject.updateWikiNode(param0);
    }

    public WikiNode addDefaultNode(long param0, ServiceContext param1)
        throws PortalException, SystemException
    {
        return this.mockObject.addDefaultNode(param0, param1);
    }

    public void addNodeResources(WikiNode param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addNodeResources(WikiNode param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addNodeResources(long param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addNodeResources(long param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void deleteNode(WikiNode param0)
        throws PortalException, SystemException
    {
    }

    public void deleteNode(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteNodes(long param0)
        throws PortalException, SystemException
    {
    }

    public WikiNode fetchNode(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.fetchNode(param0, param1);
    }

    public WikiNode fetchNodeByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchNodeByUuidAndGroupId(param0, param1);
    }

    public List<WikiNode> getCompanyNodes(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getCompanyNodes(param0, param1, param2, param3);
    }

    public List<WikiNode> getCompanyNodes(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getCompanyNodes(param0, param1, param2);
    }

    public int getCompanyNodesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getCompanyNodesCount(param0, param1);
    }

    public int getCompanyNodesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getCompanyNodesCount(param0);
    }

    public List<WikiNode> getNodes(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getNodes(param0, param1);
    }

    public List<WikiNode> getNodes(long param0, int param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getNodes(param0, param1, param2);
    }

    public List<WikiNode> getNodes(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getNodes(param0);
    }

    public List<WikiNode> getNodes(long param0, int param1, int param2, int param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getNodes(param0, param1, param2, param3);
    }

    public WikiNode getNode(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getNode(param0);
    }

    public WikiNode getNode(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getNode(param0, param1);
    }

    public WikiNode addNode(long param0, String param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.addNode(param0, param1, param2, param3);
    }

    public WikiNode addWikiNode(WikiNode param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
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

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public WikiNode updateStatus(long param0, WikiNode param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

    public List<WikiNode> getWikiNodes(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getWikiNodes(param0, param1);
    }

    public WikiNode createWikiNode(long param0) {
        return this.mockObject.createWikiNode(param0);
    }

    public WikiNode fetchWikiNodeByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchWikiNodeByUuidAndCompanyId(param0, param1);
    }

    public WikiNode fetchWikiNodeByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchWikiNodeByUuidAndGroupId(param0, param1);
    }

    public WikiNode getWikiNodeByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getWikiNodeByUuidAndCompanyId(param0, param1);
    }

    public int getNodesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getNodesCount(param0, param1);
    }

    public int getNodesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getNodesCount(param0);
    }

    public void importPages(long param0, long param1, String param2, InputStream[] param3, Map<String, String[]> param4)
        throws PortalException, SystemException
    {
    }

    public WikiNode moveNodeToTrash(long param0, WikiNode param1)
        throws PortalException, SystemException
    {
        return this.mockObject.moveNodeToTrash(param0, param1);
    }

    public WikiNode moveNodeToTrash(long param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.moveNodeToTrash(param0, param1);
    }

    public void restoreNodeFromTrash(long param0, WikiNode param1)
        throws PortalException, SystemException
    {
    }

    public void subscribeNode(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void unsubscribeNode(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public WikiNode updateNode(long param0, String param1, String param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateNode(param0, param1, param2, param3);
    }

    public WikiNode getWikiNode(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

}
