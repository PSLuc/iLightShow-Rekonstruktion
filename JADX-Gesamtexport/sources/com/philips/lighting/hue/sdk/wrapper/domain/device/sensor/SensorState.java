package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class SensorState extends SDKSerializable implements DeviceState {
    protected Date lastUpdated;
    protected DomainType sensorType;

    public SensorState() {
        this.sensorType = DomainType.SENSOR;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SensorState sensorState = (SensorState) obj;
        Date date = this.lastUpdated;
        if (date == null) {
            if (sensorState.lastUpdated != null) {
                return false;
            }
        } else if (!date.equals(sensorState.lastUpdated)) {
            return false;
        }
        return this.sensorType == sensorState.sensorType;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState
    public DomainType getType() {
        return this.sensorType;
    }

    public int getTypeAsInt() {
        DomainType domainType = this.sensorType;
        return domainType != null ? domainType.getValue() : DomainType.UNKNOWN.getValue();
    }

    public int hashCode() {
        Date date = this.lastUpdated;
        int iHashCode = ((date == null ? 0 : date.hashCode()) + 31) * 31;
        DomainType domainType = this.sensorType;
        return iHashCode + (domainType != null ? domainType.hashCode() : 0);
    }

    public boolean isOfType(DomainType domainType) {
        return domainType == getType() || domainType == DomainType.SENSOR_STATE;
    }

    public void setLastUpdated(Date date) {
        this.lastUpdated = date;
    }

    public SensorState(DomainType domainType) {
        this.sensorType = domainType;
    }
}
