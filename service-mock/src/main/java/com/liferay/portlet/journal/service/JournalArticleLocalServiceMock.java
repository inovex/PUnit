
package com.liferay.portlet.journal.service;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.model.JournalArticleDisplay;

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
public class JournalArticleLocalServiceMock
    extends MockService<JournalArticleLocalService>
    implements JournalArticleLocalService
{

    private HashMap<Long, JournalArticle> _serviceObjects = new HashMap<Long, JournalArticle>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.service.JournalArticleLocalService.class));
    }

    public List<JournalArticle> search(long param0, long param1, long param2, String param3, Double param4, String param5, String param6, String param7, Date param8, Date param9, int param10, Date param11, int param12, int param13, OrderByComparator param14)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
    }

    public List<JournalArticle> search(long param0, long param1, long param2, String param3, Double param4, String param5, String param6, String param7, String param8, String param9, String param10, Date param11, Date param12, int param13, Date param14, boolean param15, int param16, int param17, OrderByComparator param18)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18);
    }

    public List<JournalArticle> search(long param0, long param1, long param2, String param3, Double param4, String param5, String param6, String param7, String param8, String[] param9, String[] param10, Date param11, Date param12, int param13, Date param14, boolean param15, int param16, int param17, OrderByComparator param18)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18);
    }

    public Hits search(long param0, long param1, long param2, String param3, String param4, String param5, LinkedHashMap<String, Object> param6, int param7, int param8, Sort param9)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    public Hits search(long param0, long param1, long param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, LinkedHashMap<String, Object> param11, boolean param12, int param13, int param14, Sort param15)
        throws SystemException
    {
        return this.mockObject.search(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15);
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

    public int searchCount(long param0, long param1, long param2, String param3, Double param4, String param5, String param6, String param7, Date param8, Date param9, int param10, Date param11)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
    }

    public int searchCount(long param0, long param1, long param2, String param3, Double param4, String param5, String param6, String param7, String param8, String param9, String param10, Date param11, Date param12, int param13, Date param14, boolean param15)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15);
    }

    public int searchCount(long param0, long param1, long param2, String param3, Double param4, String param5, String param6, String param7, String param8, String[] param9, String[] param10, Date param11, Date param12, int param13, Date param14, boolean param15)
        throws SystemException
    {
        return this.mockObject.searchCount(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15);
    }

    public void updateAsset(long param0, JournalArticle param1, long[] param2, String[] param3, long[] param4)
        throws PortalException, SystemException
    {
    }

    public JournalArticle updateStatus(long param0, JournalArticle param1, int param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3, param4);
    }

    public JournalArticle updateStatus(long param0, long param1, int param2, ServiceContext param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3);
    }

    public JournalArticle updateStatus(long param0, long param1, String param2, double param3, int param4, String param5, ServiceContext param6)
        throws PortalException, SystemException
    {
        return this.mockObject.updateStatus(param0, param1, param2, param3, param4, param5, param6);
    }

    public void subscribe(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void unsubscribe(long param0, long param1)
        throws PortalException, SystemException
    {
    }

    public JournalArticle updateContent(long param0, String param1, double param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.updateContent(param0, param1, param2, param3);
    }

    public JournalArticle addJournalArticle(JournalArticle param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public JournalArticle createJournalArticle(long param0) {
        return this.mockObject.createJournalArticle(param0);
    }

    public JournalArticle deleteJournalArticle(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteJournalArticle(param0);
    }

    public JournalArticle deleteJournalArticle(JournalArticle param0)
        throws SystemException
    {
        return this.mockObject.deleteJournalArticle(param0);
    }

    public JournalArticle fetchJournalArticle(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalArticle getJournalArticle(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public JournalArticle getJournalArticleByUuidAndGroupId(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getJournalArticleByUuidAndGroupId(param0, param1);
    }

    public List<JournalArticle> getJournalArticles(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getJournalArticles(param0, param1);
    }

    public int getJournalArticlesCount()
        throws SystemException
    {
        return this.mockObject.getJournalArticlesCount();
    }

    public JournalArticle updateJournalArticle(JournalArticle param0)
        throws SystemException
    {
        return this.mockObject.updateJournalArticle(param0);
    }

    public JournalArticle updateJournalArticle(JournalArticle param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updateJournalArticle(param0, param1);
    }

    public JournalArticle addArticle(long param0, long param1, long param2, long param3, String param4, boolean param5, double param6, Map<Locale, String> param7, Map<Locale, String> param8, String param9, String param10, String param11, String param12, String param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20, int param21, int param22, int param23, boolean param24, int param25, int param26, int param27, int param28, int param29, boolean param30, boolean param31, boolean param32, String param33, File param34, Map<String, byte[]> param35, String param36, ServiceContext param37)
        throws PortalException, SystemException
    {
        return this.mockObject.addArticle(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26, param27, param28, param29, param30, param31, param32, param33, param34, param35, param36, param37);
    }

    public void addArticleResources(JournalArticle param0, boolean param1, boolean param2)
        throws PortalException, SystemException
    {
    }

    public void addArticleResources(JournalArticle param0, String[] param1, String[] param2)
        throws PortalException, SystemException
    {
    }

    public void addArticleResources(long param0, String param1, boolean param2, boolean param3)
        throws PortalException, SystemException
    {
    }

    public void addArticleResources(long param0, String param1, String[] param2, String[] param3)
        throws PortalException, SystemException
    {
    }

    public JournalArticle checkArticleResourcePrimKey(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
        return this.mockObject.checkArticleResourcePrimKey(param0, param1, param2);
    }

    public void checkArticles()
        throws PortalException, SystemException
    {
    }

    public void checkNewLine(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
    }

    public void checkStructure(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
    }

    public JournalArticle copyArticle(long param0, long param1, String param2, String param3, boolean param4, double param5)
        throws PortalException, SystemException
    {
        return this.mockObject.copyArticle(param0, param1, param2, param3, param4, param5);
    }

    public void deleteArticle(JournalArticle param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public void deleteArticle(long param0, String param1, double param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
    }

    public void deleteArticle(long param0, String param1, ServiceContext param2)
        throws PortalException, SystemException
    {
    }

    public void deleteArticles(long param0)
        throws PortalException, SystemException
    {
    }

    public void deleteLayoutArticleReferences(long param0, String param1)
        throws SystemException
    {
    }

    public JournalArticle expireArticle(long param0, long param1, String param2, double param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.expireArticle(param0, param1, param2, param3, param4, param5);
    }

    public void expireArticle(long param0, long param1, String param2, String param3, ServiceContext param4)
        throws PortalException, SystemException
    {
    }

    public JournalArticle getArticle(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticle(param0);
    }

    public JournalArticle getArticle(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticle(param0, param1);
    }

    public JournalArticle getArticle(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticle(param0, param1, param2);
    }

    public JournalArticle getArticle(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticle(param0, param1, param2);
    }

    public JournalArticle getArticleByUrlTitle(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleByUrlTitle(param0, param1);
    }

    public String getArticleContent(JournalArticle param0, String param1, String param2, String param3, ThemeDisplay param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleContent(param0, param1, param2, param3, param4);
    }

    public String getArticleContent(long param0, String param1, double param2, String param3, String param4, String param5, ThemeDisplay param6)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleContent(param0, param1, param2, param3, param4, param5, param6);
    }

    public String getArticleContent(long param0, String param1, double param2, String param3, String param4, ThemeDisplay param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleContent(param0, param1, param2, param3, param4, param5);
    }

    public String getArticleContent(long param0, String param1, String param2, String param3, String param4, ThemeDisplay param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleContent(param0, param1, param2, param3, param4, param5);
    }

    public String getArticleContent(long param0, String param1, String param2, String param3, ThemeDisplay param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleContent(param0, param1, param2, param3, param4);
    }

    public JournalArticleDisplay getArticleDisplay(JournalArticle param0, String param1, String param2, String param3, int param4, String param5, ThemeDisplay param6)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleDisplay(param0, param1, param2, param3, param4, param5, param6);
    }

    public JournalArticleDisplay getArticleDisplay(long param0, String param1, double param2, String param3, String param4, String param5, int param6, String param7, ThemeDisplay param8)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleDisplay(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public JournalArticleDisplay getArticleDisplay(long param0, String param1, double param2, String param3, String param4, String param5, ThemeDisplay param6)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleDisplay(param0, param1, param2, param3, param4, param5, param6);
    }

    public JournalArticleDisplay getArticleDisplay(long param0, String param1, String param2, String param3, int param4, String param5, ThemeDisplay param6)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleDisplay(param0, param1, param2, param3, param4, param5, param6);
    }

    public JournalArticleDisplay getArticleDisplay(long param0, String param1, String param2, String param3, String param4, int param5, String param6, ThemeDisplay param7)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleDisplay(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public JournalArticleDisplay getArticleDisplay(long param0, String param1, String param2, String param3, String param4, ThemeDisplay param5)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleDisplay(param0, param1, param2, param3, param4, param5);
    }

    public JournalArticleDisplay getArticleDisplay(long param0, String param1, String param2, String param3, ThemeDisplay param4)
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleDisplay(param0, param1, param2, param3, param4);
    }

    public List<JournalArticle> getArticles()
        throws SystemException
    {
        return this.mockObject.getArticles();
    }

    public List<JournalArticle> getArticles(long param0)
        throws SystemException
    {
        return this.mockObject.getArticles(param0);
    }

    public List<JournalArticle> getArticles(long param0, int param1, int param2)
        throws SystemException
    {
        return this.mockObject.getArticles(param0, param1, param2);
    }

    public List<JournalArticle> getArticles(long param0, int param1, int param2, OrderByComparator param3)
        throws SystemException
    {
        return this.mockObject.getArticles(param0, param1, param2, param3);
    }

    public List<JournalArticle> getArticles(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getArticles(param0, param1);
    }

    public List<JournalArticle> getArticlesBySmallImageId(long param0)
        throws SystemException
    {
        return this.mockObject.getArticlesBySmallImageId(param0);
    }

    public int getArticlesCount(long param0)
        throws SystemException
    {
        return this.mockObject.getArticlesCount(param0);
    }

    public List<JournalArticle> getCompanyArticles(long param0, double param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getCompanyArticles(param0, param1, param2, param3, param4);
    }

    public List<JournalArticle> getCompanyArticles(long param0, int param1, int param2, int param3)
        throws SystemException
    {
        return this.mockObject.getCompanyArticles(param0, param1, param2, param3);
    }

    public int getCompanyArticlesCount(long param0, double param1, int param2, int param3, int param4)
        throws SystemException
    {
        return this.mockObject.getCompanyArticlesCount(param0, param1, param2, param3, param4);
    }

    public int getCompanyArticlesCount(long param0, int param1)
        throws SystemException
    {
        return this.mockObject.getCompanyArticlesCount(param0, param1);
    }

    public JournalArticle getDisplayArticle(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDisplayArticle(param0, param1);
    }

    public JournalArticle getDisplayArticleByUrlTitle(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getDisplayArticleByUrlTitle(param0, param1);
    }

    public JournalArticle getLatestArticle(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestArticle(param0);
    }

    public JournalArticle getLatestArticle(long param0, int param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestArticle(param0, param1);
    }

    public JournalArticle getLatestArticle(long param0, int param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestArticle(param0, param1, param2);
    }

    public JournalArticle getLatestArticle(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestArticle(param0, param1);
    }

    public JournalArticle getLatestArticle(long param0, String param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestArticle(param0, param1, param2);
    }

    public JournalArticle getLatestArticle(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestArticle(param0, param1, param2);
    }

    public JournalArticle getLatestArticleByUrlTitle(long param0, String param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestArticleByUrlTitle(param0, param1, param2);
    }

    public double getLatestVersion(long param0, String param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestVersion(param0, param1);
    }

    public double getLatestVersion(long param0, String param1, int param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getLatestVersion(param0, param1, param2);
    }

    public List<JournalArticle> getStructureArticles(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getStructureArticles(param0, param1);
    }

    public List<JournalArticle> getStructureArticles(long param0, String param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getStructureArticles(param0, param1, param2, param3, param4);
    }

    public int getStructureArticlesCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getStructureArticlesCount(param0, param1);
    }

    public List<JournalArticle> getTemplateArticles(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getTemplateArticles(param0, param1);
    }

    public List<JournalArticle> getTemplateArticles(long param0, String param1, int param2, int param3, OrderByComparator param4)
        throws SystemException
    {
        return this.mockObject.getTemplateArticles(param0, param1, param2, param3, param4);
    }

    public int getTemplateArticlesCount(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.getTemplateArticlesCount(param0, param1);
    }

    public boolean hasArticle(long param0, String param1)
        throws SystemException
    {
        return this.mockObject.hasArticle(param0, param1);
    }

    public boolean isLatestVersion(long param0, String param1, double param2)
        throws PortalException, SystemException
    {
        return this.mockObject.isLatestVersion(param0, param1, param2);
    }

    public boolean isLatestVersion(long param0, String param1, double param2, int param3)
        throws PortalException, SystemException
    {
        return this.mockObject.isLatestVersion(param0, param1, param2, param3);
    }

    public JournalArticle removeArticleLocale(long param0, String param1, double param2, String param3)
        throws PortalException, SystemException
    {
        return this.mockObject.removeArticleLocale(param0, param1, param2, param3);
    }

    public JournalArticle updateArticle(long param0, long param1, String param2, double param3, Map<Locale, String> param4, Map<Locale, String> param5, String param6, String param7, ServiceContext param8)
        throws PortalException, SystemException
    {
        return this.mockObject.updateArticle(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public JournalArticle updateArticle(long param0, long param1, String param2, double param3, Map<Locale, String> param4, Map<Locale, String> param5, String param6, String param7, String param8, String param9, String param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20, boolean param21, int param22, int param23, int param24, int param25, int param26, boolean param27, boolean param28, boolean param29, String param30, File param31, Map<String, byte[]> param32, String param33, ServiceContext param34)
        throws PortalException, SystemException
    {
        return this.mockObject.updateArticle(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19, param20, param21, param22, param23, param24, param25, param26, param27, param28, param29, param30, param31, param32, param33, param34);
    }

    public JournalArticle updateArticle(long param0, long param1, String param2, double param3, String param4, ServiceContext param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateArticle(param0, param1, param2, param3, param4, param5);
    }

    public JournalArticle updateArticleTranslation(long param0, String param1, double param2, Locale param3, String param4, String param5, String param6, Map<String, byte[]> param7)
        throws PortalException, SystemException
    {
        return this.mockObject.updateArticleTranslation(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    public JournalArticle updateArticleTranslation(long param0, String param1, double param2, Locale param3, String param4, String param5, String param6, Map<String, byte[]> param7, ServiceContext param8)
        throws PortalException, SystemException
    {
        return this.mockObject.updateArticleTranslation(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    public void updateTemplateId(long param0, long param1, String param2, String param3)
        throws SystemException
    {
    }

}
