package com.philips.lighting.hue.sdk.wrapper.domain.resource.builder;

import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipAction;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.ScheduleStatus;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern;

/* JADX INFO: loaded from: classes.dex */
public class ScheduleBuilder {
    private String identifier = null;
    private String name = null;
    private String description = null;
    private ScheduleStatus status = null;
    private Boolean autoDelete = null;
    private TimePattern utcTime = null;
    private TimePattern localTime = null;
    private ClipAction action = null;
    private Boolean recycle = null;

    public Schedule build() {
        Schedule schedule = new Schedule(this.name, this.description, this.utcTime, this.localTime, this.autoDelete, this.status, this.action, this.recycle);
        schedule.setIdentifier(this.identifier);
        return schedule;
    }

    public ScheduleBuilder setAction(ClipAction clipAction) {
        this.action = clipAction;
        return this;
    }

    public ScheduleBuilder setAutoDelete(Boolean bool) {
        this.autoDelete = bool;
        return this;
    }

    public ScheduleBuilder setDescription(String str) {
        this.description = str;
        return this;
    }

    public ScheduleBuilder setIdentifier(String str) {
        if (str != null) {
            this.identifier = str;
            return this;
        }
        this.identifier = null;
        return this;
    }

    public ScheduleBuilder setName(String str) {
        this.name = str;
        return this;
    }

    public ScheduleBuilder setRecycle(Boolean bool) {
        this.recycle = bool;
        return this;
    }

    public ScheduleBuilder setStatus(ScheduleStatus scheduleStatus) {
        this.status = scheduleStatus;
        return this;
    }

    public ScheduleBuilder setTriggerTime(TimePattern timePattern, boolean z5) {
        if (z5) {
            this.utcTime = timePattern;
            return this;
        }
        this.localTime = timePattern;
        return this;
    }

    public ScheduleBuilder setAutoDelete(boolean z5) {
        return setAutoDelete(new Boolean(z5));
    }

    public ScheduleBuilder setRecycle(boolean z5) {
        return setRecycle(new Boolean(z5));
    }
}
