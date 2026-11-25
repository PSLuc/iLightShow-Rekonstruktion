package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.generic;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class GenericFlagSensorConfiguration extends SensorConfiguration {
    public GenericFlagSensorConfiguration() {
        super(DomainType.GENERIC_FLAG_SENSOR);
    }

    public GenericFlagSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.GENERIC_FLAG_SENSOR, sensorConfiguration);
    }
}
