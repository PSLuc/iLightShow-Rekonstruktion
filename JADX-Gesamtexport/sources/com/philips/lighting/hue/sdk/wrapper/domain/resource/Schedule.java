package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipAction;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import java.util.Date;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class Schedule extends SessionObject implements BridgeResource {
    private Boolean autoDelete;
    private ClipAction clipAction;
    private Date creationTime;
    private byte[] description;
    private byte[] identifier;
    private TimePattern localTime;
    private byte[] name;
    private Boolean recycle;
    private ScheduleStatus status;
    private TimePattern utcTime;

    public Schedule(long j4) {
        super(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        Schedule schedule = (Schedule) obj;
        Boolean bool = this.autoDelete;
        if (bool == null) {
            if (schedule.autoDelete != null) {
                return false;
            }
        } else if (!bool.equals(schedule.autoDelete)) {
            return false;
        }
        ClipAction clipAction = this.clipAction;
        if (clipAction == null) {
            if (schedule.clipAction != null) {
                return false;
            }
        } else if (!clipAction.equals(schedule.clipAction)) {
            return false;
        }
        Date date = this.creationTime;
        if (date == null) {
            if (schedule.creationTime != null) {
                return false;
            }
        } else if (!date.equals(schedule.creationTime)) {
            return false;
        }
        if (!Arrays.equals(this.description, schedule.description) || !Arrays.equals(this.identifier, schedule.identifier)) {
            return false;
        }
        TimePattern timePattern = this.localTime;
        if (timePattern == null) {
            if (schedule.localTime != null) {
                return false;
            }
        } else if (!timePattern.equals(schedule.localTime)) {
            return false;
        }
        if (!Arrays.equals(this.name, schedule.name)) {
            return false;
        }
        Boolean bool2 = this.recycle;
        if (bool2 == null) {
            if (schedule.recycle != null) {
                return false;
            }
        } else if (!bool2.equals(schedule.recycle)) {
            return false;
        }
        if (this.status != schedule.status) {
            return false;
        }
        TimePattern timePattern2 = this.utcTime;
        if (timePattern2 == null) {
            if (schedule.utcTime != null) {
                return false;
            }
        } else if (!timePattern2.equals(schedule.utcTime)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    public Boolean getAutoDelete() {
        return this.autoDelete;
    }

    public ClipAction getClipAction() {
        return this.clipAction;
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public String getDescription() {
        return NativeTools.BytesToString(this.description);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public TimePattern getLocalTime() {
        return this.localTime;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    public Boolean getRecycle() {
        return this.recycle;
    }

    public ScheduleStatus getStatus() {
        return this.status;
    }

    public int getStatusAsInt() {
        return this.status.getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.SCHEDULE;
    }

    public TimePattern getUtcTime() {
        return this.utcTime;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Boolean bool = this.autoDelete;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ClipAction clipAction = this.clipAction;
        int iHashCode3 = (iHashCode2 + (clipAction == null ? 0 : clipAction.hashCode())) * 31;
        Date date = this.creationTime;
        int iN = k.n(this.identifier, k.n(this.description, (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31, 31), 31);
        TimePattern timePattern = this.localTime;
        int iN2 = k.n(this.name, (iN + (timePattern == null ? 0 : timePattern.hashCode())) * 31, 31);
        Boolean bool2 = this.recycle;
        int iHashCode4 = (iN2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ScheduleStatus scheduleStatus = this.status;
        int iHashCode5 = (iHashCode4 + (scheduleStatus == null ? 0 : scheduleStatus.hashCode())) * 31;
        TimePattern timePattern2 = this.utcTime;
        return iHashCode5 + (timePattern2 != null ? timePattern2.hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return domainType == DomainType.RESOURCE || getType() == domainType;
    }

    public void setAutoDelete(Boolean bool) {
        this.autoDelete = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
        setSessionKey(((SessionObject) bridge).getSessionKey());
    }

    public void setClipAction(ClipAction clipAction) {
        this.clipAction = clipAction;
    }

    public void setCreationTime(Date date) {
        this.creationTime = date;
    }

    public void setDescription(String str) {
        this.description = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        this.identifier = NativeTools.StringToBytes(str);
    }

    public void setLocalTime(TimePattern timePattern) {
        this.localTime = timePattern;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    public void setRecycle(Boolean bool) {
        this.recycle = bool;
    }

    public void setStatus(ScheduleStatus scheduleStatus) {
        this.status = scheduleStatus;
    }

    public void setStatusFromInt(int i) {
        this.status = ScheduleStatus.fromValue(i);
    }

    public void setUtcTime(TimePattern timePattern) {
        this.utcTime = timePattern;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    public Schedule() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule.1
                @Override // java.lang.Runnable
                public void run() {
                    Schedule.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    public void setRecycle(boolean z5) {
        this.recycle = new Boolean(z5);
    }

    public Schedule(Schedule schedule) {
        super(schedule.getSessionKey());
        this.identifier = schedule.identifier;
        this.name = schedule.name;
        this.description = schedule.description;
        this.utcTime = schedule.utcTime;
        this.localTime = schedule.localTime;
        this.creationTime = schedule.creationTime;
        this.autoDelete = schedule.autoDelete;
        this.status = schedule.status;
        this.clipAction = schedule.clipAction;
        this.recycle = schedule.recycle;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    public Schedule(String str, String str2, TimePattern timePattern, TimePattern timePattern2, Boolean bool, ScheduleStatus scheduleStatus, ClipAction clipAction) {
        setName(str);
        setDescription(str2);
        this.utcTime = timePattern;
        this.localTime = timePattern2;
        this.autoDelete = bool;
        this.status = scheduleStatus;
        this.clipAction = clipAction;
        this.recycle = null;
    }

    public Schedule(String str, String str2, TimePattern timePattern, TimePattern timePattern2, Boolean bool, ScheduleStatus scheduleStatus, ClipAction clipAction, Boolean bool2) {
        setName(str);
        setDescription(str2);
        this.utcTime = timePattern;
        this.localTime = timePattern2;
        this.autoDelete = bool;
        this.status = scheduleStatus;
        this.clipAction = clipAction;
        this.recycle = bool2;
    }
}
