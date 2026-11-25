package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class TemperatureSensorState extends SensorState {
    private Integer temperature;

    public TemperatureSensorState() {
        super(DomainType.TEMPERATURE_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        TemperatureSensorState temperatureSensorState = (TemperatureSensorState) obj;
        Integer num = this.temperature;
        if (num == null) {
            if (temperatureSensorState.temperature != null) {
                return false;
            }
        } else if (!num.equals(temperatureSensorState.temperature)) {
            return false;
        }
        return true;
    }

    public Integer getTemperature() {
        return this.temperature;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.temperature;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public void setTemperature(Integer num) {
        this.temperature = num;
    }

    public TemperatureSensorState(Integer num) {
        this();
        this.temperature = num;
    }
}
