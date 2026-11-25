package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.generic;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class GenericFlagSensorState extends SensorState {
    private Boolean flag;

    public GenericFlagSensorState() {
        super(DomainType.GENERIC_FLAG_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        GenericFlagSensorState genericFlagSensorState = (GenericFlagSensorState) obj;
        Boolean bool = this.flag;
        if (bool == null) {
            if (genericFlagSensorState.flag != null) {
                return false;
            }
        } else if (!bool.equals(genericFlagSensorState.flag)) {
            return false;
        }
        return true;
    }

    public Boolean getFlag() {
        return this.flag;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Boolean bool = this.flag;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public void setFlag(Boolean bool) {
        this.flag = bool;
    }

    public GenericFlagSensorState(Boolean bool) {
        this();
        this.flag = bool;
    }
}
