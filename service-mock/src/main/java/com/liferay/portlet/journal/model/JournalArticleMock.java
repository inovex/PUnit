
package com.liferay.portlet.journal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;
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
public class JournalArticleMock
    extends MockService<JournalArticle>
    implements JournalArticle
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.journal.model.JournalArticle.class));
    }

    public String[] getAvailableLocales() {
        return this.mockObject.getAvailableLocales();
    }

    public JournalFolder getFolder()
        throws PortalException, SystemException
    {
        return this.mockObject.getFolder();
    }

    public String getSmallImageType()
        throws PortalException, SystemException
    {
        return this.mockObject.getSmallImageType();
    }

    public void setSmallImageType(String param0) {
    }

    public boolean hasApprovedVersion()
        throws SystemException
    {
        return this.mockObject.hasApprovedVersion();
    }

    public boolean isTemplateDriven() {
        return this.mockObject.isTemplateDriven();
    }

    public String getDefaultLocale() {
        return this.mockObject.getDefaultLocale();
    }

    public String getArticleImageURL(ThemeDisplay param0) {
        return this.mockObject.getArticleImageURL(param0);
    }

    public JournalArticleResource getArticleResource()
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleResource();
    }

    public String getArticleResourceUuid()
        throws PortalException, SystemException
    {
        return this.mockObject.getArticleResourceUuid();
    }

    public String getContentByLocale(String param0) {
        return this.mockObject.getContentByLocale(param0);
    }

    public String buildTreePath()
        throws PortalException, SystemException
    {
        return this.mockObject.buildTreePath();
    }

    public String toString() {
        return this.mockObject.toString();
    }

    public int hashCode() {
        return this.mockObject.hashCode();
    }

    public Object clone() {
        return this.mockObject.clone();
    }

    public int compareTo(JournalArticle param0) {
        return this.mockObject.compareTo(param0);
    }

    public long getId() {
        return this.mockObject.getId();
    }

    public String getType() {
        return this.mockObject.getType();
    }

    public String getClassName() {
        return this.mockObject.getClassName();
    }

    public String getContent() {
        return this.mockObject.getContent();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public String getDescription(Locale param0, boolean param1) {
        return this.mockObject.getDescription(param0, param1);
    }

    public String getDescription(Locale param0) {
        return this.mockObject.getDescription(param0);
    }

    public String getDescription() {
        return this.mockObject.getDescription();
    }

    public String getDescription(String param0, boolean param1) {
        return this.mockObject.getDescription(param0, param1);
    }

    public String getDescription(String param0) {
        return this.mockObject.getDescription(param0);
    }

    public void setGroupId(long param0) {
    }

    public long getFolderId() {
        return this.mockObject.getFolderId();
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public int getStatus() {
        return this.mockObject.getStatus();
    }

    public void setStatus(int param0) {
    }

    public boolean isCachedModel() {
        return this.mockObject.isCachedModel();
    }

    public void setCachedModel(boolean param0) {
    }

    public boolean isEscapedModel() {
        return this.mockObject.isEscapedModel();
    }

    public void setPrimaryKey(long param0) {
    }

    public ExpandoBridge getExpandoBridge() {
        return this.mockObject.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public JournalArticle toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public Serializable getPrimaryKeyObj() {
        return this.mockObject.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(Serializable param0) {
    }

    public boolean isNew() {
        return this.mockObject.isNew();
    }

    public void setNew(boolean param0) {
    }

    public CacheModel<JournalArticle> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public Date getModifiedDate() {
        return this.mockObject.getModifiedDate();
    }

    public void setModifiedDate(Date param0) {
    }

    public long getUserId() {
        return this.mockObject.getUserId();
    }

    public void setUserId(long param0) {
    }

    public String getUuid() {
        return this.mockObject.getUuid();
    }

    public void setUuid(String param0) {
    }

    public long getClassPK() {
        return this.mockObject.getClassPK();
    }

    public void setContent(String param0) {
    }

    public Date getDisplayDate() {
        return this.mockObject.getDisplayDate();
    }

    public void setDisplayDate(Date param0) {
    }

    public String getUrlTitle() {
        return this.mockObject.getUrlTitle();
    }

    public String getStructureId() {
        return this.mockObject.getStructureId();
    }

    public void setStructureId(String param0) {
    }

    public String getTemplateId() {
        return this.mockObject.getTemplateId();
    }

    public void setTemplateId(String param0) {
    }

    public String getUserName() {
        return this.mockObject.getUserName();
    }

    public String getUserUuid()
        throws SystemException
    {
        return this.mockObject.getUserUuid();
    }

    public void setUserUuid(String param0) {
    }

    public void setUserName(String param0) {
    }

    public void setUrlTitle(String param0) {
    }

    public boolean getSmallImage() {
        return this.mockObject.getSmallImage();
    }

    public boolean isSmallImage() {
        return this.mockObject.isSmallImage();
    }

    public void setSmallImage(boolean param0) {
    }

    public long getSmallImageId() {
        return this.mockObject.getSmallImageId();
    }

    public void setSmallImageId(long param0) {
    }

    public String getSmallImageURL() {
        return this.mockObject.getSmallImageURL();
    }

    public void setSmallImageURL(String param0) {
    }

    public TrashEntry getTrashEntry()
        throws PortalException, SystemException
    {
        return this.mockObject.getTrashEntry();
    }

    public long getTrashEntryClassPK() {
        return this.mockObject.getTrashEntryClassPK();
    }

    public TrashHandler getTrashHandler() {
        return this.mockObject.getTrashHandler();
    }

    public boolean isInTrash() {
        return this.mockObject.isInTrash();
    }

    public boolean isInTrashContainer() {
        return this.mockObject.isInTrashContainer();
    }

    public boolean getIndexable() {
        return this.mockObject.getIndexable();
    }

    public void setResourcePrimKey(long param0) {
    }

    public boolean isResourceMain() {
        return this.mockObject.isResourceMain();
    }

    public Date getReviewDate() {
        return this.mockObject.getReviewDate();
    }

    public void setReviewDate(Date param0) {
    }

    public void setIndexable(boolean param0) {
    }

    public void setFolderId(long param0) {
    }

    public String getArticleId() {
        return this.mockObject.getArticleId();
    }

    public void setArticleId(String param0) {
    }

    public long getResourcePrimKey() {
        return this.mockObject.getResourcePrimKey();
    }

    public boolean isIndexable() {
        return this.mockObject.isIndexable();
    }

    public void setVersion(double param0) {
    }

    public void setType(String param0) {
    }

    public void setId(long param0) {
    }

    public String getLayoutUuid() {
        return this.mockObject.getLayoutUuid();
    }

    public void setLayoutUuid(String param0) {
    }

    public double getVersion() {
        return this.mockObject.getVersion();
    }

    public Date getExpirationDate() {
        return this.mockObject.getExpirationDate();
    }

    public void setExpirationDate(Date param0) {
    }

    public void setClassNameId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public String getTitle(String param0) {
        return this.mockObject.getTitle(param0);
    }

    public String getTitle(String param0, boolean param1) {
        return this.mockObject.getTitle(param0, param1);
    }

    public String getTitle(Locale param0, boolean param1) {
        return this.mockObject.getTitle(param0, param1);
    }

    public String getTitle() {
        return this.mockObject.getTitle();
    }

    public String getTitle(Locale param0) {
        return this.mockObject.getTitle(param0);
    }

    public String getTitleCurrentLanguageId() {
        return this.mockObject.getTitleCurrentLanguageId();
    }

    public String getTitleCurrentValue() {
        return this.mockObject.getTitleCurrentValue();
    }

    public Map<Locale, String> getTitleMap() {
        return this.mockObject.getTitleMap();
    }

    public void setTitle(String param0, Locale param1, Locale param2) {
    }

    public void setTitle(String param0) {
    }

    public void setTitle(String param0, Locale param1) {
    }

    public void setTitleCurrentLanguageId(String param0) {
    }

    public void setTitleMap(Map<Locale, String> param0) {
    }

    public void setTitleMap(Map<Locale, String> param0, Locale param1) {
    }

    public String getDescriptionCurrentLanguageId() {
        return this.mockObject.getDescriptionCurrentLanguageId();
    }

    public String getDescriptionCurrentValue() {
        return this.mockObject.getDescriptionCurrentValue();
    }

    public Map<Locale, String> getDescriptionMap() {
        return this.mockObject.getDescriptionMap();
    }

    public void setDescriptionCurrentLanguageId(String param0) {
    }

    public void setDescriptionMap(Map<Locale, String> param0) {
    }

    public void setDescriptionMap(Map<Locale, String> param0, Locale param1) {
    }

    public String[] getAvailableLanguageIds() {
        return this.mockObject.getAvailableLanguageIds();
    }

    public String getDefaultLanguageId() {
        return this.mockObject.getDefaultLanguageId();
    }

    public void prepareLocalizedFieldsForImport(Locale param0)
        throws LocaleException
    {
    }

    public void prepareLocalizedFieldsForImport()
        throws LocaleException
    {
    }

    public JournalArticle toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public long getStatusByUserId() {
        return this.mockObject.getStatusByUserId();
    }

    public void setStatusByUserId(long param0) {
    }

    public String getStatusByUserUuid()
        throws SystemException
    {
        return this.mockObject.getStatusByUserUuid();
    }

    public void setStatusByUserUuid(String param0) {
    }

    public String getStatusByUserName() {
        return this.mockObject.getStatusByUserName();
    }

    public void setStatusByUserName(String param0) {
    }

    public Date getStatusDate() {
        return this.mockObject.getStatusDate();
    }

    public void setStatusDate(Date param0) {
    }

    public boolean getApproved() {
        return this.mockObject.getApproved();
    }

    public boolean isApproved() {
        return this.mockObject.isApproved();
    }

    public boolean isDenied() {
        return this.mockObject.isDenied();
    }

    public boolean isDraft() {
        return this.mockObject.isDraft();
    }

    public boolean isExpired() {
        return this.mockObject.isExpired();
    }

    public boolean isInactive() {
        return this.mockObject.isInactive();
    }

    public boolean isIncomplete() {
        return this.mockObject.isIncomplete();
    }

    public boolean isPending() {
        return this.mockObject.isPending();
    }

    public boolean isScheduled() {
        return this.mockObject.isScheduled();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public void setClassName(String param0) {
    }

    public void setClassPK(long param0) {
    }

    public void setCompanyId(long param0) {
    }

    public void setTreePath(String param0) {
    }

    public void setDescription(String param0) {
    }

    public void setDescription(String param0, Locale param1, Locale param2) {
    }

    public void setDescription(String param0, Locale param1) {
    }

    public String getTreePath() {
        return this.mockObject.getTreePath();
    }

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public void resetOriginalValues() {
    }

    public Map<String, Object> getModelAttributes() {
        return this.mockObject.getModelAttributes();
    }

    public void setModelAttributes(Map<String, Object> param0) {
    }

    public Class<?> getModelClass() {
        return this.mockObject.getModelClass();
    }

    public String getModelClassName() {
        return this.mockObject.getModelClassName();
    }

    public StagedModelType getStagedModelType() {
        return this.mockObject.getStagedModelType();
    }

    public void persist()
        throws SystemException
    {
    }

    public void updateTreePath(String param0)
        throws SystemException
    {
    }

}
