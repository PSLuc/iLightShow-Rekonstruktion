package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.presence;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class GeofenceSensorState extends SensorState {
    private Boolean presence;

    public GeofenceSensorState() {
        super(DomainType.GEOFENCE_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        GeofenceSensorState geofenceSensorState = (GeofenceSensorState) obj;
        Boolean bool = this.presence;
        if (bool == null) {
            if (geofenceSensorState.presence != null) {
                return false;
            }
        } else if (!bool.equals(geofenceSensorState.presence)) {
            return false;
        }
        return true;
    }

    public Boolean getPresence() {
        return this.presence;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Boolean bool = this.presence;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public void setPresence(Boolean bool) {
        this.presence = bool;
    }

    public GeofenceSensorState(Boolean bool) {
        this();
        this.presence = bool;
    }
}
