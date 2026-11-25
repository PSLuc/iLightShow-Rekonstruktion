package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.generic;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class GenericFlagSensor extends Sensor {
    public GenericFlagSensor(long j4) {
        super(DomainType.GENERIC_FLAG_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public GenericFlagSensorConfiguration getConfiguration() {
        return (GenericFlagSensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public GenericFlagSensorState getState() {
        return (GenericFlagSensorState) this.sensorState;
    }

    public GenericFlagSensor() {
        super(DomainType.GENERIC_FLAG_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new GenericFlagSensorState();
        this.sensorConfiguration = new GenericFlagSensorConfiguration();
    }
}
