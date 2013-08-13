
package com.liferay.portlet.shopping.model;

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
public class ShoppingCartItemMock
    extends MockService<ShoppingCartItem>
    implements ShoppingCartItem
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.shopping.model.ShoppingCartItem.class));
    }

    public String getFields() {
        return this.mockObject.getFields();
    }

    public ShoppingItem getItem() {
        return this.mockObject.getItem();
    }

    public String getCartItemId() {
        return this.mockObject.getCartItemId();
    }

    public String[] getFieldsArray() {
        return this.mockObject.getFieldsArray();
    }

    public int compareTo(ShoppingCartItem param0) {
        return this.mockObject.compareTo(param0);
    }

}
