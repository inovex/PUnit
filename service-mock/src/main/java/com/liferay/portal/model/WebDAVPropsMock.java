
package com.liferay.portal.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.xml.QName;
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
public class WebDAVPropsMock
    extends MockService<WebDAVProps>
    implements WebDAVProps
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.model.WebDAVProps.class));
    }

    public void store()
        throws Exception
    {
    }

    public String getText(String param0, String param1, String param2)
        throws Exception
    {
        return this.mockObject.getText(param0, param1, param2);
    }

    public void addProp(String param0, String param1, String param2)
        throws Exception
    {
    }

    public void addProp(String param0, String param1, String param2, String param3)
        throws Exception
    {
    }

    public String getProps() {
        return this.mockObject.getProps();
    }

    public Set<QName> getPropsSet()
        throws Exception
    {
        return this.mockObject.getPropsSet();
    }

    public void removeProp(String param0, String param1, String param2)
        throws Exception
    {
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

    public int compareTo(WebDAVProps param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getClassName() {
        return this.mockObject.getClassName();
    }

    public long getPrimaryKey() {
        return this.mockObject.getPrimaryKey();
    }

    public void setPrimaryKey(long param0) {
    }

    public boolean isNew() {
        return this.mockObject.isNew();
    }

    public void setNew(boolean param0) {
    }

    public boolean isCachedModel() {
        return this.mockObject.isCachedModel();
    }

    public void setCachedModel(boolean param0) {
    }

    public boolean isEscapedModel() {
        return this.mockObject.isEscapedModel();
    }

    public Serializable getPrimaryKeyObj() {
        return this.mockObject.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(Serializable param0) {
    }

    public ExpandoBridge getExpandoBridge() {
        return this.mockObject.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(ServiceContext param0) {
    }

    public CacheModel<WebDAVProps> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public WebDAVProps toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public long getClassPK() {
        return this.mockObject.getClassPK();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
    }

    public void setClassName(String param0) {
    }

    public void setClassPK(long param0) {
    }

    public void setCompanyId(long param0) {
    }

    public Date getCreateDate() {
        return this.mockObject.getCreateDate();
    }

    public void setCreateDate(Date param0) {
    }

    public Date getModifiedDate() {
        return this.mockObject.getModifiedDate();
    }

    public void setModifiedDate(Date param0) {
    }

    public long getClassNameId() {
        return this.mockObject.getClassNameId();
    }

    public void setClassNameId(long param0) {
    }

    public long getWebDavPropsId() {
        return this.mockObject.getWebDavPropsId();
    }

    public void setWebDavPropsId(long param0) {
    }

    public void setProps(String param0) {
    }

    public Map<String, Object> getModelAttributes() {
        return this.mockObject.getModelAttributes();
    }

    public void resetOriginalValues() {
    }

    public void setModelAttributes(Map<String, Object> param0) {
    }

    public Class<?> getModelClass() {
        return this.mockObject.getModelClass();
    }

    public String getModelClassName() {
        return this.mockObject.getModelClassName();
    }

    public void persist()
        throws SystemException
    {
    }

}
