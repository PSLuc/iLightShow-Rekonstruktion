package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class Switch extends Sensor {
    public Switch(long j4) {
        super(DomainType.SWITCH, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public SwitchConfiguration getConfiguration() {
        return (SwitchConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public SwitchState getState() {
        return (SwitchState) this.sensorState;
    }

    public Switch() {
        super(DomainType.SWITCH);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new SwitchState();
        this.sensorConfiguration = new SwitchConfiguration();
    }
}
