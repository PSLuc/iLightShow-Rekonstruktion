package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipAction;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Timer extends Schedule {
    private Date startTime;

    public Timer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        Timer timer = (Timer) obj;
        Date date = this.startTime;
        if (date == null) {
            if (timer.startTime != null) {
                return false;
            }
        } else if (!date.equals(timer.startTime)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.TIMER;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule, com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Date date = this.startTime;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public void setStartTime(Date date) {
        this.startTime = date;
    }

    private Timer(Schedule schedule) {
        super(schedule);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.Schedule, com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.Timer.1
                @Override // java.lang.Runnable
                public void run() {
                    Timer.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    public Timer(String str, String str2, TimePattern timePattern, TimePattern timePattern2, Boolean bool, ScheduleStatus scheduleStatus, ClipAction clipAction, Boolean bool2) {
        super(str, str2, timePattern, timePattern2, bool, scheduleStatus, clipAction, bool2);
    }
}
