package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class HumiditySensorConfiguration extends SensorConfiguration {
    public HumiditySensorConfiguration() {
        super(DomainType.HUMIDITY_SENSOR);
    }

    public HumiditySensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.HUMIDITY_SENSOR, sensorConfiguration);
    }
}
