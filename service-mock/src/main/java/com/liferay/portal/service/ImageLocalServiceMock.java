
package com.liferay.portal.service;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.Image;
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
public class ImageLocalServiceMock
    extends MockService<ImageLocalService>
    implements ImageLocalService
{

    private HashMap<Long, Image> _serviceObjects = new HashMap<Long, Image>();

    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portal.service.ImageLocalService.class));
    }

    public PersistedModel getPersistedModel(Serializable param0)
        throws PortalException, SystemException
    {
        return this.mockObject.getPersistedModel(param0);
    }

    public Image createImage(long param0) {
        return this.mockObject.createImage(param0);
    }

    public Image deleteImage(Image param0)
        throws SystemException
    {
        return this.mockObject.deleteImage(param0);
    }

    public Image deleteImage(long param0)
        throws PortalException, SystemException
    {
        return this.mockObject.deleteImage(param0);
    }

    public Image addImage(Image param0)
        throws SystemException
    {
        _serviceObjects.put(param0.getPrimaryKey(), param0);
        return param0;
    }

    public Image fetchImage(long param0)
        throws SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public Image getImage(long param0)
        throws PortalException, SystemException
    {
        return (_serviceObjects.get(param0));
    }

    public List<Image> getImages()
        throws SystemException
    {
        return this.mockObject.getImages();
    }

    public List<Image> getImages(int param0, int param1)
        throws SystemException
    {
        return this.mockObject.getImages(param0, param1);
    }

    public int getImagesCount()
        throws SystemException
    {
        return this.mockObject.getImagesCount();
    }

    public Image updateImage(long param0, byte[] param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateImage(param0, param1);
    }

    public Image updateImage(Image param0)
        throws SystemException
    {
        return this.mockObject.updateImage(param0);
    }

    public Image updateImage(long param0, File param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateImage(param0, param1);
    }

    public Image updateImage(long param0, byte[] param1, String param2, int param3, int param4, int param5)
        throws PortalException, SystemException
    {
        return this.mockObject.updateImage(param0, param1, param2, param3, param4, param5);
    }

    public Image updateImage(long param0, InputStream param1)
        throws PortalException, SystemException
    {
        return this.mockObject.updateImage(param0, param1);
    }

    public Image updateImage(long param0, InputStream param1, boolean param2)
        throws PortalException, SystemException
    {
        return this.mockObject.updateImage(param0, param1, param2);
    }

    public Image getImageOrDefault(long param0) {
        return this.mockObject.getImageOrDefault(param0);
    }

    public List<Image> getImagesBySize(int param0)
        throws SystemException
    {
        return this.mockObject.getImagesBySize(param0);
    }

    public List dynamicQuery(DynamicQuery param0)
        throws SystemException
    {
        return this.mockObject.dynamicQuery(param0);
    }

    public DynamicQuery dynamicQuery() {
        return this.mockObject.dynamicQuery();
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

    public Image getCompanyLogo(long param0) {
        return this.mockObject.getCompanyLogo(param0);
    }

}
