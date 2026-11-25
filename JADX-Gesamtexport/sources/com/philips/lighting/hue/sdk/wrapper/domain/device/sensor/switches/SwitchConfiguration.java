package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class SwitchConfiguration extends SensorConfiguration {
    public SwitchConfiguration() {
        super(DomainType.SWITCH);
    }

    public SwitchConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.SWITCH, sensorConfiguration);
    }
}
