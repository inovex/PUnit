
package com.liferay.portal.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PasswordPolicyRel;
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
public class PasswordPolicyRelLocalServiceMock
    extends MockService<PasswordPolicyRelLocalService>
    implements PasswordPolicyRelLocalService
{

    private HashMap<Long, PasswordPolicyRel> _serviceObjects = new HashMap<Long, PasswordPolicyRel>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.PasswordPolicyRelLocalService.class));
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

    public PasswordPolicyRel addPasswordPolicyRel(PasswordPolicyRel param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public PasswordPolicyRel addPasswordPolicyRel(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.addPasswordPolicyRel(param0, param1, param2);
    }

    public PasswordPolicyRel createPasswordPolicyRel(long param0) {
        return this.mockObject.createPasswordPolicyRel(param0);
    }

    public PasswordPolicyRel deletePasswordPolicyRel(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deletePasswordPolicyRel(param0);
    }

    public PasswordPolicyRel deletePasswordPolicyRel(PasswordPolicyRel param0)
        throws SystemException
    {
        return this.mockObject.deletePasswordPolicyRel(param0);
    }

    public void deletePasswordPolicyRel(long param0, String param1, long param2)
        throws SystemException
    {
    }

    public void deletePasswordPolicyRel(String param0, long param1)
        throws SystemException
    {
    }

    public PasswordPolicyRel fetchPasswordPolicyRel(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PasswordPolicyRel fetchPasswordPolicyRel(String param0, long param1)
        throws SystemException
    {
        return this.mockObject.fetchPasswordPolicyRel(param0, param1);
    }

    public PasswordPolicyRel getPasswordPolicyRel(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public PasswordPolicyRel getPasswordPolicyRel(long param0, String param1, long param2)
        throws PortalException, SystemException
    {
        return this.mockObject.getPasswordPolicyRel(param0, param1, param2);
    }

    public PasswordPolicyRel getPasswordPolicyRel(String param0, long param1)
        throws PortalException, SystemException
    {
        return this.mockObject.getPasswordPolicyRel(param0, param1);
    }

    public List<PasswordPolicyRel> getPasswordPolicyRels(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getPasswordPolicyRels(param0, param1);
    }

    public int getPasswordPolicyRelsCount()
        throws SystemException
    {
        return this.mockObject.getPasswordPolicyRelsCount();
    }

    public PasswordPolicyRel updatePasswordPolicyRel(PasswordPolicyRel param0)
        throws SystemException
    {
        return this.mockObject.updatePasswordPolicyRel(param0);
    }

    public PasswordPolicyRel updatePasswordPolicyRel(PasswordPolicyRel param0, boolean param1)
        throws SystemException
    {
        return this.mockObject.updatePasswordPolicyRel(param0, param1);
    }

    public void addPasswordPolicyRels(long param0, String param1, long[] param2)
        throws SystemException
    {
    }

    public void deletePasswordPolicyRels(long param0)
        throws SystemException
    {
    }

    public void deletePasswordPolicyRels(long param0, String param1, long[] param2)
        throws SystemException
    {
    }

    public boolean hasPasswordPolicyRel(long param0, String param1, long param2)
        throws SystemException
    {
        return this.mockObject.hasPasswordPolicyRel(param0, param1, param2);
    }

}
