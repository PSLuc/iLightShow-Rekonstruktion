package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class DaylightSensorConfiguration extends SensorConfiguration {
    private Boolean configured;
    private byte[] latitude;
    private byte[] longitude;
    private Integer sunriseOffset;
    private Integer sunsetOffset;

    public DaylightSensorConfiguration() {
        super(DomainType.DAYLIGHT_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            DaylightSensorConfiguration daylightSensorConfiguration = (DaylightSensorConfiguration) obj;
            if (Arrays.equals(this.latitude, daylightSensorConfiguration.latitude) && Arrays.equals(this.longitude, daylightSensorConfiguration.longitude)) {
                Integer num = this.sunriseOffset;
                if (num == null) {
                    if (daylightSensorConfiguration.sunriseOffset != null) {
                        return false;
                    }
                } else if (!num.equals(daylightSensorConfiguration.sunriseOffset)) {
                    return false;
                }
                Integer num2 = this.sunsetOffset;
                if (num2 == null) {
                    if (daylightSensorConfiguration.sunsetOffset != null) {
                        return false;
                    }
                } else if (!num2.equals(daylightSensorConfiguration.sunsetOffset)) {
                    return false;
                }
                Boolean bool = this.configured;
                if (bool == null) {
                    if (daylightSensorConfiguration.configured != null) {
                        return false;
                    }
                } else if (!bool.equals(daylightSensorConfiguration.configured)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public Integer getSunriseOffset() {
        return this.sunriseOffset;
    }

    public Integer getSunsetOffset() {
        return this.sunsetOffset;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public int hashCode() {
        int iN = k.n(this.longitude, k.n(this.latitude, super.hashCode() * 31, 31), 31);
        Integer num = this.sunriseOffset;
        int iHashCode = (iN + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sunsetOffset;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public Boolean isConfigured() {
        return this.configured;
    }

    public void setLatitude(String str) {
        this.latitude = NativeTools.StringToBytes(str);
    }

    public void setLongitude(String str) {
        this.longitude = NativeTools.StringToBytes(str);
    }

    public void setSunriseOffset(Integer num) {
        this.sunriseOffset = num;
    }

    public void setSunsetOffset(Integer num) {
        this.sunsetOffset = num;
    }

    public DaylightSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.DAYLIGHT_SENSOR, sensorConfiguration);
    }

    public DaylightSensorConfiguration(String str, String str2, Integer num, Integer num2) {
        this();
        setLatitude(str);
        setLongitude(str2);
        this.sunriseOffset = num;
        this.sunsetOffset = num2;
    }
}
