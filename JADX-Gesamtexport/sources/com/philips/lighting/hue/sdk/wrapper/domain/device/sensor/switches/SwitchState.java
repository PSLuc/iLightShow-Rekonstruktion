package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class SwitchState extends SensorState {
    private SwitchButtonEvent switchButtonEvent;

    public SwitchState() {
        super(DomainType.SWITCH);
    }

    private int getSwitchButtonEventAsInt() {
        SwitchButtonEvent switchButtonEvent = this.switchButtonEvent;
        return switchButtonEvent != null ? switchButtonEvent.getValue() : SwitchButtonEvent.UNKNOWN.getValue();
    }

    private void setSwitchButtonEventFromInt(int i) {
        this.switchButtonEvent = SwitchButtonEvent.fromValue(i);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && this.switchButtonEvent == ((SwitchState) obj).switchButtonEvent;
    }

    public SwitchButtonEvent getSwitchButtonEvent() {
        return this.switchButtonEvent;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        SwitchButtonEvent switchButtonEvent = this.switchButtonEvent;
        return iHashCode + (switchButtonEvent == null ? 0 : switchButtonEvent.hashCode());
    }

    public void setSwitchButtonEvent(SwitchButtonEvent switchButtonEvent) {
        this.switchButtonEvent = switchButtonEvent;
    }

    public SwitchState(SwitchButtonEvent switchButtonEvent) {
        this();
        this.switchButtonEvent = switchButtonEvent;
    }
}
