package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class LightLevelSensorConfiguration extends SensorConfiguration {
    private Integer thresholdDark;
    private Integer thresholdOffset;

    public LightLevelSensorConfiguration() {
        super(DomainType.LIGHT_LEVEL_SENSOR);
        this.thresholdDark = null;
        this.thresholdOffset = null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        LightLevelSensorConfiguration lightLevelSensorConfiguration = (LightLevelSensorConfiguration) obj;
        Integer num = this.thresholdDark;
        if (num == null) {
            if (lightLevelSensorConfiguration.thresholdDark != null) {
                return false;
            }
        } else if (!num.equals(lightLevelSensorConfiguration.thresholdDark)) {
            return false;
        }
        Integer num2 = this.thresholdOffset;
        if (num2 == null) {
            if (lightLevelSensorConfiguration.thresholdOffset != null) {
                return false;
            }
        } else if (!num2.equals(lightLevelSensorConfiguration.thresholdOffset)) {
            return false;
        }
        return true;
    }

    public Integer getThresholdDark() {
        return this.thresholdDark;
    }

    public Integer getThresholdOffset() {
        return this.thresholdOffset;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.thresholdDark;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.thresholdOffset;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public void setThresholdDark(Integer num) {
        this.thresholdDark = num;
    }

    public void setThresholdOffset(Integer num) {
        this.thresholdOffset = num;
    }

    public LightLevelSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.LIGHT_LEVEL_SENSOR, sensorConfiguration);
        this.thresholdDark = null;
        this.thresholdOffset = null;
    }

    public LightLevelSensorConfiguration(Integer num, Integer num2) {
        this();
        this.thresholdDark = num;
        this.thresholdOffset = num2;
    }
}
