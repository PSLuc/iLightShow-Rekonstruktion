package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class LightLevelSensor extends Sensor {
    public LightLevelSensor(long j4) {
        super(DomainType.LIGHT_LEVEL_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public LightLevelSensorConfiguration getConfiguration() {
        return (LightLevelSensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public LightLevelSensorState getState() {
        return (LightLevelSensorState) this.sensorState;
    }

    public LightLevelSensor() {
        super(DomainType.LIGHT_LEVEL_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new LightLevelSensorState();
        this.sensorConfiguration = new LightLevelSensorConfiguration();
    }
}
