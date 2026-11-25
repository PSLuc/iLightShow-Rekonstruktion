package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.presence;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class GeofenceSensorConfiguration extends SensorConfiguration {
    private byte[] device;
    private Integer radius;

    public GeofenceSensorConfiguration() {
        super(DomainType.GEOFENCE_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        GeofenceSensorConfiguration geofenceSensorConfiguration = (GeofenceSensorConfiguration) obj;
        if (!Arrays.equals(this.device, geofenceSensorConfiguration.device)) {
            return false;
        }
        Integer num = this.radius;
        if (num == null) {
            if (geofenceSensorConfiguration.radius != null) {
                return false;
            }
        } else if (!num.equals(geofenceSensorConfiguration.radius)) {
            return false;
        }
        return true;
    }

    public String getDevice() {
        return NativeTools.BytesToString(this.device);
    }

    public Integer getRadius() {
        return this.radius;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public int hashCode() {
        int iN = k.n(this.device, super.hashCode() * 31, 31);
        Integer num = this.radius;
        return iN + (num == null ? 0 : num.hashCode());
    }

    public void setDevice(String str) {
        this.device = NativeTools.StringToBytes(str);
    }

    public void setRadius(Integer num) {
        this.radius = num;
    }

    public GeofenceSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.GEOFENCE_SENSOR, sensorConfiguration);
    }

    public GeofenceSensorConfiguration(String str, Integer num) {
        this();
        setDevice(str);
        this.radius = num;
    }
}
