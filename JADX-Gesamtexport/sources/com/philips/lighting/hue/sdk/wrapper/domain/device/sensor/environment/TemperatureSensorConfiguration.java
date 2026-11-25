package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class TemperatureSensorConfiguration extends SensorConfiguration {
    public TemperatureSensorConfiguration() {
        super(DomainType.TEMPERATURE_SENSOR);
    }

    public TemperatureSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.TEMPERATURE_SENSOR, sensorConfiguration);
    }
}
