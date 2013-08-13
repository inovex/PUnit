
package com.liferay.portlet.calendar.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import com.liferay.portal.kernel.cal.TZSRecurrence;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.CacheModel;
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
public class CalEventMock
    extends MockService<CalEvent>
    implements CalEvent
{


    public void initMockObject() {
        this.setMockObject(org.mockito.Mockito.mock(com.liferay.portlet.calendar.model.CalEvent.class));
    }

    public TZSRecurrence getRecurrenceObj() {
        return this.mockObject.getRecurrenceObj();
    }

    public void setRecurrence(String param0) {
    }

    public void setRecurrenceObj(TZSRecurrence param0) {
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

    public int compareTo(CalEvent param0) {
        return this.mockObject.compareTo(param0);
    }

    public String getLocation() {
        return this.mockObject.getLocation();
    }

    public String getType() {
        return this.mockObject.getType();
    }

    public String getDescription() {
        return this.mockObject.getDescription();
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

    public CacheModel<CalEvent> toCacheModel() {
        return this.mockObject.toCacheModel();
    }

    public CalEvent toEscapedModel() {
        return this.mockObject.toEscapedModel();
    }

    public String toXmlString() {
        return this.mockObject.toXmlString();
    }

    public long getCompanyId() {
        return this.mockObject.getCompanyId();
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

    public long getGroupId() {
        return this.mockObject.getGroupId();
    }

    public void setGroupId(long param0) {
    }

    public void setDescription(String param0) {
    }

    public String getTitle() {
        return this.mockObject.getTitle();
    }

    public void setTitle(String param0) {
    }

    public Date getStartDate() {
        return this.mockObject.getStartDate();
    }

    public void setStartDate(Date param0) {
    }

    public Date getEndDate() {
        return this.mockObject.getEndDate();
    }

    public void setEndDate(Date param0) {
    }

    public long getEventId() {
        return this.mockObject.getEventId();
    }

    public void setEventId(long param0) {
    }

    public void setLocation(String param0) {
    }

    public int getDurationHour() {
        return this.mockObject.getDurationHour();
    }

    public void setDurationHour(int param0) {
    }

    public int getDurationMinute() {
        return this.mockObject.getDurationMinute();
    }

    public void setDurationMinute(int param0) {
    }

    public boolean getAllDay() {
        return this.mockObject.getAllDay();
    }

    public boolean isAllDay() {
        return this.mockObject.isAllDay();
    }

    public void setAllDay(boolean param0) {
    }

    public boolean getTimeZoneSensitive() {
        return this.mockObject.getTimeZoneSensitive();
    }

    public boolean isTimeZoneSensitive() {
        return this.mockObject.isTimeZoneSensitive();
    }

    public void setTimeZoneSensitive(boolean param0) {
    }

    public boolean getRepeating() {
        return this.mockObject.getRepeating();
    }

    public boolean isRepeating() {
        return this.mockObject.isRepeating();
    }

    public void setRepeating(boolean param0) {
    }

    public String getRecurrence() {
        return this.mockObject.getRecurrence();
    }

    public int getRemindBy() {
        return this.mockObject.getRemindBy();
    }

    public void setRemindBy(int param0) {
    }

    public int getFirstReminder() {
        return this.mockObject.getFirstReminder();
    }

    public void setFirstReminder(int param0) {
    }

    public int getSecondReminder() {
        return this.mockObject.getSecondReminder();
    }

    public void setSecondReminder(int param0) {
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
