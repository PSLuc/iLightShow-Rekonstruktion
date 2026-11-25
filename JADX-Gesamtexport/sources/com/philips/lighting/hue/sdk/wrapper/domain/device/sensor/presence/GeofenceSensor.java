package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.presence;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorSubType;

/* JADX INFO: loaded from: classes.dex */
public class GeofenceSensor extends Sensor {
    public GeofenceSensor(long j4) {
        super(DomainType.GEOFENCE_SENSOR, j4);
        this.sensorSubType = SensorSubType.CLIP;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public GeofenceSensorConfiguration getConfiguration() {
        return (GeofenceSensorConfiguration) this.sensorConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.Sensor, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public GeofenceSensorState getState() {
        return (GeofenceSensorState) this.sensorState;
    }

    public GeofenceSensor() {
        super(DomainType.GEOFENCE_SENSOR);
        this.sensorSubType = SensorSubType.CLIP;
        this.sensorState = new GeofenceSensorState();
        this.sensorConfiguration = new GeofenceSensorConfiguration();
    }
}
