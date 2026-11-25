package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.generic;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class GenericStatusSensorConfiguration extends SensorConfiguration {
    public GenericStatusSensorConfiguration() {
        super(DomainType.GENERIC_STATUS_SENSOR);
    }

    public GenericStatusSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.GENERIC_STATUS_SENSOR, sensorConfiguration);
    }
}
