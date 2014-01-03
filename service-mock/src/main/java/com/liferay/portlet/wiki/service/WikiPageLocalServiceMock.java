
package com.liferay.portlet.wiki.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import javax.portlet.PortletURL;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.wiki.model.WikiPage;
import com.liferay.portlet.wiki.model.WikiPageDisplay;
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
public class WikiPageLocalServiceMock
    extends MockService<WikiPageLocalService>
    implements WikiPageLocalService
{

    private HashMap<Long, WikiPage> _serviceObjects = new HashMap<Long, WikiPage>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.wiki.service.WikiPageLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<WikiPage> getIncomingLinks(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getIncomingLinks(param0, param1);
    }

    public WikiPage getLatestPage(long param0, int param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestPage(param0, param1, param2);
    }

    public WikiPage getLatestPage(long param0, long param1, int param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestPage(param0, param1, param2, param3);
    }

    public WikiPage getLatestPage(long param0, String param1, int param2, boolean param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestPage(param0, param1, param2, param3);
    }

    public List<WikiPage> getNoAssetPages()
        throws SystemException
    {
        return this.mockObject.getNoAssetPages();
    }

    public List<WikiPage> getOrphans(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getOrphans(param0);
    }

    public List<WikiPage> getOutgoingLinks(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getOutgoingLinks(param0, param1);
    }

    public WikiPage getPage(long param0, Boolean param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPage(param0, param1);
    }

    public WikiPage getPage(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPage(param0, param1);
    }

    public WikiPage getPage(long param0, String param1, Boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getPage(param0, param1, param2);
    }

    public WikiPage getPage(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPage(param0);
    }

    public WikiPage getPage(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getPage(param0, param1, param2);
    }

    public WikiPage getPageByPageId(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPageByPageId(param0);
    }

    public WikiPageDisplay getPageDisplay(WikiPage param0, PortletURL param1, PortletURL param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.getPageDisplay(param0, param1, param2, param3);
    }

    public WikiPageDisplay getPageDisplay(long param0, String param1, PortletURL param2, PortletURL param3, String param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getPageDisplay(param0, param1, param2, param3, param4);
    }

    public List<WikiPage> getPages(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2);
    }

    public List<WikiPage> getPages(long param0, long param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3, param4);
    }

    public List<WikiPage> getPages(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3);
    }

    public List<WikiPage> getPages(long param0, String param1, boolean param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3, param4);
    }

    public List<WikiPage> getPages(long param0, String param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3, param4);
    }

    public List<WikiPage> getPages(String param0)
        throws SystemException
    {
        return this.mockObject.getPages(param0);
    }

    public List<WikiPage> getPages(long param0, String param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3);
    }

    public List<WikiPage> getPages(long param0, boolean param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3);
    }

    public List<WikiPage> getPages(long param0, boolean param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3, param4);
    }

    public List<WikiPage> getPages(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2);
    }

    public List<WikiPage> getPages(long param0, boolean param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3, param4);
    }

    public List<WikiPage> getPages(long param0, boolean param1, int param2, int param3, int param4, OrderByComparator param5)
        throws SystemException
    {
        return this.mockObject.getPages(param0, param1, param2, param3, param4, param5);
    }

    public int getPagesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0);
    }

    public int getPagesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0, param1);
    }

    public int getPagesCount(long param0, long param1, int param2)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0, param1, param2);
    }

    public int getPagesCount(long param0, String param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0, param1, param2);
    }

    public int getPagesCount(String param0)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0);
    }

    public int getPagesCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0, param1);
    }

    public int getPagesCount(long param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0, param1);
    }

    public int getPagesCount(long param0, boolean param1, int param2)
        throws SystemException
    {
        return this.mockObject.getPagesCount(param0, param1, param2);
    }

    public List<WikiPage> getRecentChanges(long param0, int param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecentChanges(param0, param1, param2);
    }

    public List<WikiPage> getRecentChanges(long param0, long param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getRecentChanges(param0, param1, param2, param3);
    }

    public int getRecentChangesCount(long param0, long param1)
        throws SystemException
    {
        return this.mockObject.getRecentChangesCount(param0, param1);
    }

    public int getRecentChangesCount(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getRecentChangesCount(param0);
    }

    public String[] getTempPageAttachmentNames(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getTempPageAttachmentNames(param0, param1, param2);
    }

    public boolean hasDraftPage(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.hasDraftPage(param0, param1);
    }

    public void movePage(long param0, long param1, String param2, String param3, boolean param4, ServiceContext param5)
        throws PortalException, SystemException
    {
    }

    public void movePage(long param0, long param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
    }

    public FileEntry movePageAttachmentToTrash(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.movePageAttachmentToTrash(param0, param1, param2, param3);
    }

    public WikiPage movePageToTrash(long param0, long param1, String param2, double param3)
        throws PortalException, SystemException
    {
        return this.mockObject.movePageToTrash(param0, param1, param2, param3);
    }

    public WikiPage movePageToTrash(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
        return this.mockObject.movePageToTrash(param0, param1, param2);
    }

    public WikiPage movePageToTrash(long param0, WikiPage param1)
        throws PortalException, SystemException
    {
        return this.mockObject.movePageToTrash(param0, param1);
    }

    public void restorePageAttachmentFromTrash(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
    }

    public void restorePageFromTrash(long param0, WikiPage param1)
        throws PortalException, SystemException
    {
    }

    public WikiPage revertPage(long param0, long param1, String param2, double param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.revertPage(param0, param1, param2, param3, param4);
    }

    public void subscribePage(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void unsubscribePage(long param0, long param1, String param2)
        throws PortalException, SystemException
    {
    }

    public WikiPage updatePage(long param0, long param1, String param2, double param3, String param4, String param5, boolean param6, String param7, String param8, String param9, ServiceContext param10)
        throws PortalException, SystemException
    {
        return this.mockObject.updatePage(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
    }

    public void validateTitle(String param0)
        throws PortalException
    {
    }

    public WikiPage createWikiPage(long param0) {
        return this.mockObject.createWikiPage(param0);
    }

    public WikiPage fetchWikiPageByUuidAndCompanyId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchWikiPageByUuidAndCompanyId(param0, param1);
    }

    public WikiPage getWikiPage(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<WikiPage> getWikiPages(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getWikiPages(param0, param1);
    }

    public int getWikiPagesCount()
        throws SystemException
    {
        return this.mockObject.getWikiPagesCount();
    }

    public WikiPage updateWikiPage(WikiPage param0)
        throws SystemException
    {
        return this.mockObject.updateWikiPage(param0);
    }

    public WikiPage addPage(long param0, long param1, String param2, String param3, String param4, boolean param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.addPage(param0, param1, param2, param3, param4, param5, param6);
    }

    public WikiPage addPage(long param0, long param1, String param2, double param3, String param4, String param5, boolean param6, String param7, boolean param8, String param9, String param10, ServiceContext param11)
        throws PortalException, SystemException
    {
        return this.mockObject.addPage(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public WikiPage fetchWikiPageByUuidAndGroupId(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchWikiPageByUuidAndGroupId(param0, param1);
    }

    public WikiPage getWikiPageByUuidAndCompanyId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getWikiPageByUuidAndCompanyId(param0, param1);
    }

    public WikiPage getWikiPageByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getWikiPageByUuidAndGroupId(param0, param1);
    }

    public void addPageAttachment(long param0, long param1, String param2, String param3, InputStream param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void addPageAttachment(long param0, long param1, String param2, String param3, File param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void addPageAttachments(long param0, long param1, String param2, List<ObjectValuePair<String, InputStream>> param3)
        throws PortalException, SystemException
    {
    }

    public void addPageResources(WikiPage param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addPageResources(WikiPage param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addPageResources(long param0, String param1, String[] param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public void addPageResources(long param0, String param1, boolean param2, boolean param3)
        throws PortalException, SystemException
    {
    }

    public void addTempPageAttachment(long param0, long param1, String param2, String param3, InputStream param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void changeParent(long param0, long param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
    }

    public void copyPageAttachments(long param0, long param1, String param2, long param3, String param4)
        throws PortalException, SystemException
    {
    }

    public void deletePage(WikiPage param0)
        throws PortalException, SystemException
    {
    }

    public void deletePage(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
    }

    public void deletePage(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void deletePageAttachment(long param0, String param1, String param2)
        throws PortalException, SystemException
    {
    }

    public void deletePageAttachments(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void deletePages(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteTempPageAttachment(long param0, long param1, String param2, String param3)
        throws PortalException, SystemException
    {
    }

    public void deleteTrashPageAttachments(long param0, String param1)
        throws PortalException, SystemException
    {
    }

    public void discardDraft(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
    }

    public WikiPage fetchLatestPage(long param0, String param1, int param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.fetchLatestPage(param0, param1, param2, param3);
    }

    public WikiPage fetchLatestPage(long param0, long param1, int param2, boolean param3)
        throws SystemException
    {
        return this.mockObject.fetchLatestPage(param0, param1, param2, param3);
    }

    public WikiPage fetchLatestPage(long param0, int param1, boolean param2)
        throws SystemException
    {
        return this.mockObject.fetchLatestPage(param0, param1, param2);
    }

    public WikiPage fetchPage(long param0, String param1, double param2)
        throws SystemException
    {
        return this.mockObject.fetchPage(param0, param1, param2);
    }

    public WikiPage getDraftPage(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDraftPage(param0, param1);
    }

    public void updateAsset(long param0, WikiPage param1, long[] param2, String[] param3, long[] param4)
        throws PortalException, SystemException
    {
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

    public WikiPage updateStatus(long param0, WikiPage param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

    public WikiPage updateStatus(long param0, long param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

    public WikiPage addWikiPage(WikiPage param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public WikiPage deleteWikiPage(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteWikiPage(param0);
    }

    public WikiPage deleteWikiPage(WikiPage param0)
        throws SystemException
    {
        return this.mockObject.deleteWikiPage(param0);
    }

    public WikiPage fetchWikiPage(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<WikiPage> getChildren(long param0, boolean param1, String param2)
        throws SystemException
    {
        return this.mockObject.getChildren(param0, param1, param2);
    }

}
