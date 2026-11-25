package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.generic;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class GenericStatusSensor extends Sensor {
    public GenericStatusSensor(long j4) {
        super(DomainType.GENERIC_STATUS_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public GenericStatusSensorConfiguration getConfiguration() {
        return (GenericStatusSensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public GenericStatusSensorState getState() {
        return (GenericStatusSensorState) this.sensorState;
    }

    public GenericStatusSensor() {
        super(DomainType.GENERIC_STATUS_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new GenericStatusSensorState();
        this.sensorConfiguration = new GenericStatusSensorConfiguration();
    }
}
