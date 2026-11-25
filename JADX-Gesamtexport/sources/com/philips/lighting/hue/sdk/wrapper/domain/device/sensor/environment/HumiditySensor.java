package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class HumiditySensor extends Sensor {
    public HumiditySensor(long j4) {
        super(DomainType.HUMIDITY_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public HumiditySensorConfiguration getConfiguration() {
        return (HumiditySensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public HumiditySensorState getState() {
        return (HumiditySensorState) this.sensorState;
    }

    public HumiditySensor() {
        super(DomainType.HUMIDITY_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new HumiditySensorState();
        this.sensorConfiguration = new HumiditySensorConfiguration();
    }
}
