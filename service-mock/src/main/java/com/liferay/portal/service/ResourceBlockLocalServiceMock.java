
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PermissionedModel;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.ResourceBlock;
import com.liferay.portal.model.ResourceBlockPermissionsContainer;
import com.liferay.portal.security.permission.ResourceBlockIdsBag;
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
public class ResourceBlockLocalServiceMock
    extends MockService<ResourceBlockLocalService>
    implements ResourceBlockLocalService
{

    private HashMap<Long, ResourceBlock> _serviceObjects = new HashMap<Long, ResourceBlock>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ResourceBlockLocalService.class));
    }

    public List<String> getPermissions(ResourceBlock param0, long param1)
        throws SystemException
    {
        return this.mockObject.getPermissions(param0, param1);
    }

    public boolean isSupported(String param0) {
        return this.mockObject.isSupported(param0);
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public List<String> getActionIds(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.getActionIds(param0, param1);
    }

    public long getActionIds(String param0, List<String> param1)
        throws PortalException
    {
        return this.mockObject.getActionIds(param0, param1);
    }

    public ResourceBlock createResourceBlock(long param0) {
        return this.mockObject.createResourceBlock(param0);
    }

    public ResourceBlock deleteResourceBlock(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteResourceBlock(param0);
    }

    public ResourceBlock deleteResourceBlock(ResourceBlock param0)
        throws SystemException
    {
        return this.mockObject.deleteResourceBlock(param0);
    }

    public ResourceBlock fetchResourceBlock(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ResourceBlock getResourceBlock(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public ResourceBlock getResourceBlock(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getResourceBlock(param0, param1);
    }

    public long getActionId(String param0, String param1)
        throws PortalException
    {
        return this.mockObject.getActionId(param0, param1);
    }

    public ResourceBlock addResourceBlock(long param0, long param1, String param2, String param3, ResourceBlockPermissionsContainer param4)
        throws SystemException
    {
        return this.mockObject.addResourceBlock(param0, param1, param2, param3, param4);
    }

    public ResourceBlock addResourceBlock(ResourceBlock param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public List<ResourceBlock> getResourceBlocks(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getResourceBlocks(param0, param1);
    }

    public int getResourceBlocksCount()
        throws SystemException
    {
        return this.mockObject.getResourceBlocksCount();
    }

    public ResourceBlock updateResourceBlock(ResourceBlock param0)
        throws SystemException
    {
        return this.mockObject.updateResourceBlock(param0);
    }

    public void addCompanyScopePermission(long param0, String param1, long param2, String param3)
        throws PortalException, SystemException
    {
    }

    public void addCompanyScopePermissions(long param0, String param1, long param2, long param3)
        throws SystemException
    {
    }

    public void addGroupScopePermission(long param0, long param1, String param2, long param3, String param4)
        throws PortalException, SystemException
    {
    }

    public void addGroupScopePermissions(long param0, long param1, String param2, long param3, long param4)
        throws SystemException
    {
    }

    public void addIndividualScopePermission(long param0, long param1, String param2, PermissionedModel param3, long param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void addIndividualScopePermission(long param0, long param1, String param2, long param3, long param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void addIndividualScopePermissions(long param0, long param1, String param2, PermissionedModel param3, long param4, long param5)
        throws SystemException
    {
    }

    public void addIndividualScopePermissions(long param0, long param1, String param2, long param3, long param4, long param5)
        throws PortalException, SystemException
    {
    }

    public void releasePermissionedModelResourceBlock(String param0, long param1)
        throws PortalException, SystemException
    {
    }

    public void releasePermissionedModelResourceBlock(PermissionedModel param0)
        throws SystemException
    {
    }

    public void setIndividualScopePermissions(long param0, long param1, String param2, long param3, long param4, List<String> param5)
        throws PortalException, SystemException
    {
    }

    public void setIndividualScopePermissions(long param0, long param1, String param2, long param3, long param4, long param5)
        throws PortalException, SystemException
    {
    }

    public void setIndividualScopePermissions(long param0, long param1, String param2, long param3, Map<Long, String[]> param4)
        throws PortalException, SystemException
    {
    }

    public void setIndividualScopePermissions(long param0, long param1, String param2, PermissionedModel param3, long param4, long param5)
        throws SystemException
    {
    }

    public void setIndividualScopePermissions(long param0, long param1, String param2, PermissionedModel param3, long param4, List<String> param5)
        throws PortalException, SystemException
    {
    }

    public void updateCompanyScopePermissions(long param0, String param1, long param2, long param3, int param4)
        throws SystemException
    {
    }

    public void updateGroupScopePermissions(long param0, long param1, String param2, long param3, long param4, int param5)
        throws SystemException
    {
    }

    public void updateIndividualScopePermissions(long param0, long param1, String param2, PermissionedModel param3, long param4, long param5, int param6)
        throws SystemException
    {
    }

    public ResourceBlock updateResourceBlockId(long param0, long param1, String param2, PermissionedModel param3, String param4, ResourceBlockPermissionsContainer param5)
        throws SystemException
    {
        return this.mockObject.updateResourceBlockId(param0, param1, param2, param3, param4, param5);
    }

    public void verifyResourceBlockId(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
    }

    public List<String> getCompanyScopePermissions(ResourceBlock param0, long param1)
        throws SystemException
    {
        return this.mockObject.getCompanyScopePermissions(param0, param1);
    }

    public List<String> getGroupScopePermissions(ResourceBlock param0, long param1)
        throws SystemException
    {
        return this.mockObject.getGroupScopePermissions(param0, param1);
    }

    public PermissionedModel getPermissionedModel(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPermissionedModel(param0, param1);
    }

    public ResourceBlockIdsBag getResourceBlockIdsBag(long param0, long param1, String param2, long[] param3)
        throws SystemException
    {
        return this.mockObject.getResourceBlockIdsBag(param0, param1, param2, param3);
    }

    public void releaseResourceBlock(ResourceBlock param0)
        throws SystemException
    {
    }

    public void releaseResourceBlock(long param0)
        throws SystemException
    {
    }

    public void removeAllGroupScopePermissions(long param0, String param1, long param2, String param3)
        throws PortalException, SystemException
    {
    }

    public void removeAllGroupScopePermissions(long param0, String param1, long param2, long param3)
        throws SystemException
    {
    }

    public void removeCompanyScopePermission(long param0, String param1, long param2, String param3)
        throws PortalException, SystemException
    {
    }

    public void removeCompanyScopePermissions(long param0, String param1, long param2, long param3)
        throws SystemException
    {
    }

    public void removeGroupScopePermission(long param0, long param1, String param2, long param3, String param4)
        throws PortalException, SystemException
    {
    }

    public void removeGroupScopePermissions(long param0, long param1, String param2, long param3, long param4)
        throws SystemException
    {
    }

    public void removeIndividualScopePermission(long param0, long param1, String param2, long param3, long param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void removeIndividualScopePermission(long param0, long param1, String param2, PermissionedModel param3, long param4, String param5)
        throws PortalException, SystemException
    {
    }

    public void removeIndividualScopePermissions(long param0, long param1, String param2, PermissionedModel param3, long param4, long param5)
        throws SystemException
    {
    }

    public void removeIndividualScopePermissions(long param0, long param1, String param2, long param3, long param4, long param5)
        throws PortalException, SystemException
    {
    }

    public void setCompanyScopePermissions(long param0, String param1, long param2, List<String> param3)
        throws PortalException, SystemException
    {
    }

    public void setCompanyScopePermissions(long param0, String param1, long param2, long param3)
        throws SystemException
    {
    }

    public void setGroupScopePermissions(long param0, long param1, String param2, long param3, List<String> param4)
        throws PortalException, SystemException
    {
    }

    public void setGroupScopePermissions(long param0, long param1, String param2, long param3, long param4)
        throws SystemException
    {
    }

    public List<Long> getResourceBlockIds(ResourceBlockIdsBag param0, String param1, String param2)
        throws PortalException
    {
        return this.mockObject.getResourceBlockIds(param0, param1, param2);
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

    public boolean hasPermission(String param0, PermissionedModel param1, String param2, ResourceBlockIdsBag param3)
        throws PortalException
    {
        return this.mockObject.hasPermission(param0, param1, param2, param3);
    }

    public boolean hasPermission(String param0, long param1, String param2, ResourceBlockIdsBag param3)
        throws PortalException, SystemException
    {
        return this.mockObject.hasPermission(param0, param1, param2, param3);
    }

}
