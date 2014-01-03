
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.portlet.PortletPreferences;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.expando.model.ExpandoBridge;
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
public class OrganizationMock
    extends MockService<Organization>
    implements Organization
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.Organization.class));
    }

    public Address getAddress() {
        return this.mockObject.getAddress();
    }

    public List<Organization> getAncestors()
        throws PortalException, SystemException
    {
        return this.mockObject.getAncestors();
    }

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public Group getGroup() {
        return this.mockObject.getGroup();
    }

    public List<Address> getAddresses()
        throws SystemException
    {
        return this.mockObject.getAddresses();
    }

    public boolean hasPublicLayouts() {
        return this.mockObject.hasPublicLayouts();
    }

    public long getLogoId() {
        return this.mockObject.getLogoId();
    }

    public int getTypeOrder() {
        return this.mockObject.getTypeOrder();
    }

    public String[] getChildrenTypes() {
        return this.mockObject.getChildrenTypes();
    }

    public List<Organization> getDescendants()
        throws SystemException
    {
        return this.mockObject.getDescendants();
    }

    public PortletPreferences getPreferences()
        throws SystemException
    {
        return this.mockObject.getPreferences();
    }

    public Organization getParentOrganization()
        throws PortalException, SystemException
    {
        return this.mockObject.getParentOrganization();
    }

    public List<Organization> getSuborganizations()
        throws SystemException
    {
        return this.mockObject.getSuborganizations();
    }

    public int getSuborganizationsSize()
        throws SystemException
    {
        return this.mockObject.getSuborganizationsSize();
    }

    public boolean hasSuborganizations()
        throws SystemException
    {
        return this.mockObject.hasSuborganizations();
    }

    public boolean isParentable() {
        return this.mockObject.isParentable();
    }

    public int getPrivateLayoutsPageCount() {
        return this.mockObject.getPrivateLayoutsPageCount();
    }

    public int getPublicLayoutsPageCount() {
        return this.mockObject.getPublicLayoutsPageCount();
    }

    public boolean hasPrivateLayouts() {
        return this.mockObject.hasPrivateLayouts();
    }

    public Set<String> getReminderQueryQuestions(String param0)
        throws SystemException
    {
        return this.mockObject.getReminderQueryQuestions(param0);
    }

    public Set<String> getReminderQueryQuestions(Locale param0)
        throws SystemException
    {
        return this.mockObject.getReminderQueryQuestions(param0);
    }

    public boolean isRoot() {
        return this.mockObject.isRoot();
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

    public int compareTo(Organization param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getName() {
        return this.mockObject.getName();
    }

    public void setName(String param0) {
    }

    public String getType() {
        return this.mockObject.getType();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
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

    public void setExpandoBridgeAttributes(BaseModel<?> param0) {
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public void setExpandoBridgeAttributes(ExpandoBridge param0) {
    }

    public Organization toEscapedModel() {
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

    public CacheModel<Organization> toCacheModel() {
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

    public void setType(String param0) {
    }

    public long getRegionId() {
        return this.mockObject.getRegionId();
    }

    public void setRegionId(long param0) {
    }

    public long getCountryId() {
        return this.mockObject.getCountryId();
    }

    public void setCountryId(long param0) {
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public long getOrganizationId() {
        return this.mockObject.getOrganizationId();
    }

    public String getComments() {
        return this.mockObject.getComments();
    }

    public void setComments(String param0) {
    }

    public void setOrganizationId(long param0) {
    }

    public long getParentOrganizationId() {
        return this.mockObject.getParentOrganizationId();
    }

    public void setParentOrganizationId(long param0) {
    }

    public Organization toUnescapedModel() {
        return this.mockObject.toUnescapedModel();
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public boolean getRecursable() {
        return this.mockObject.getRecursable();
    }

    public boolean isRecursable() {
        return this.mockObject.isRecursable();
    }

    public void setRecursable(boolean param0) {
    }

    public int getStatusId() {
        return this.mockObject.getStatusId();
    }

    public void setStatusId(int param0) {
    }

    public void setCompanyId(long param0) {
    }

    public void setTreePath(String param0) {
    }

    public String getTreePath() {
        return this.mockObject.getTreePath();
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

    public String buildTreePath()
        throws PortalException, SystemException
    {
        return this.mockObject.buildTreePath();
    }

    public void updateTreePath(String param0)
        throws SystemException
    {
    }

}
