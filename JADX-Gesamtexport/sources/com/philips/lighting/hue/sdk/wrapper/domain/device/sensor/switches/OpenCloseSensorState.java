package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class OpenCloseSensorState extends SensorState {
    private Boolean open;

    public OpenCloseSensorState() {
        super(DomainType.OPEN_CLOSE_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        OpenCloseSensorState openCloseSensorState = (OpenCloseSensorState) obj;
        Boolean bool = this.open;
        if (bool == null) {
            if (openCloseSensorState.open != null) {
                return false;
            }
        } else if (!bool.equals(openCloseSensorState.open)) {
            return false;
        }
        return true;
    }

    public Boolean getOpen() {
        return this.open;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Boolean bool = this.open;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public void setOpen(Boolean bool) {
        this.open = bool;
    }

    public OpenCloseSensorState(Boolean bool) {
        this();
        this.open = bool;
    }
}
