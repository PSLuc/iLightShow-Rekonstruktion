package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class TemperatureSensor extends Sensor {
    public TemperatureSensor(long j4) {
        super(DomainType.TEMPERATURE_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public TemperatureSensorConfiguration getConfiguration() {
        return (TemperatureSensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public TemperatureSensorState getState() {
        return (TemperatureSensorState) this.sensorState;
    }

    public TemperatureSensor() {
        super(DomainType.TEMPERATURE_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new TemperatureSensorState();
        this.sensorConfiguration = new TemperatureSensorConfiguration();
    }
}
