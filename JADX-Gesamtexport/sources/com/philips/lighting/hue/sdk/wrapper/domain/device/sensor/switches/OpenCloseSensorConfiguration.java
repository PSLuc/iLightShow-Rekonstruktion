package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class OpenCloseSensorConfiguration extends SensorConfiguration {
    public OpenCloseSensorConfiguration() {
        super(DomainType.OPEN_CLOSE_SENSOR);
    }

    public OpenCloseSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.OPEN_CLOSE_SENSOR, sensorConfiguration);
    }
}
