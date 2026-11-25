package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class DaylightSensorState extends SensorState {
    private Boolean daylight;

    public DaylightSensorState() {
        super(DomainType.DAYLIGHT_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        DaylightSensorState daylightSensorState = (DaylightSensorState) obj;
        Boolean bool = this.daylight;
        if (bool == null) {
            if (daylightSensorState.daylight != null) {
                return false;
            }
        } else if (!bool.equals(daylightSensorState.daylight)) {
            return false;
        }
        return true;
    }

    public Boolean getDaylight() {
        return this.daylight;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Boolean bool = this.daylight;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public void setDaylight(Boolean bool) {
        this.daylight = bool;
    }
}
