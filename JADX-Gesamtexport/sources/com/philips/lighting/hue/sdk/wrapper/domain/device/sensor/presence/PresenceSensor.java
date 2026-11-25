package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.presence;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class PresenceSensor extends Sensor {
    public PresenceSensor(long j4) {
        super(DomainType.PRESENCE_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public PresenceSensorConfiguration getConfiguration() {
        return (PresenceSensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public PresenceSensorState getState() {
        return (PresenceSensorState) this.sensorState;
    }

    public PresenceSensor() {
        super(DomainType.PRESENCE_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new PresenceSensorState();
        this.sensorConfiguration = new PresenceSensorConfiguration();
    }
}
