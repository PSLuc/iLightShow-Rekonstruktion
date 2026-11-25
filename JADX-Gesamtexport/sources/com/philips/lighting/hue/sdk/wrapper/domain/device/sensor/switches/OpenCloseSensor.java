package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class OpenCloseSensor extends Sensor {
    public OpenCloseSensor(long j4) {
        super(DomainType.OPEN_CLOSE_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public OpenCloseSensorConfiguration getConfiguration() {
        return (OpenCloseSensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public OpenCloseSensorState getState() {
        return (OpenCloseSensorState) this.sensorState;
    }

    public OpenCloseSensor() {
        super(DomainType.OPEN_CLOSE_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new OpenCloseSensorState();
        this.sensorConfiguration = new OpenCloseSensorConfiguration();
    }
}
