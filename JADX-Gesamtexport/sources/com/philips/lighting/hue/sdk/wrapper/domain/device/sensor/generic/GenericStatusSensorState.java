package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.generic;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class GenericStatusSensorState extends SensorState {
    private Integer status;

    public GenericStatusSensorState() {
        super(DomainType.GENERIC_STATUS_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        GenericStatusSensorState genericStatusSensorState = (GenericStatusSensorState) obj;
        Integer num = this.status;
        if (num == null) {
            if (genericStatusSensorState.status != null) {
                return false;
            }
        } else if (!num.equals(genericStatusSensorState.status)) {
            return false;
        }
        return true;
    }

    public Integer getStatus() {
        return this.status;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.status;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public GenericStatusSensorState(Integer num) {
        this();
        this.status = num;
    }
}
