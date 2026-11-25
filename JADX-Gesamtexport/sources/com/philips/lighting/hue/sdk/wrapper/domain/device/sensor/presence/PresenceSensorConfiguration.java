package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.presence;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class PresenceSensorConfiguration extends SensorConfiguration {
    private Integer maximumSensitivity;
    private Integer sensitivity;

    public PresenceSensorConfiguration() {
        super(DomainType.PRESENCE_SENSOR);
        this.sensitivity = null;
        this.maximumSensitivity = null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        PresenceSensorConfiguration presenceSensorConfiguration = (PresenceSensorConfiguration) obj;
        Integer num = this.maximumSensitivity;
        if (num == null) {
            if (presenceSensorConfiguration.maximumSensitivity != null) {
                return false;
            }
        } else if (!num.equals(presenceSensorConfiguration.maximumSensitivity)) {
            return false;
        }
        Integer num2 = this.sensitivity;
        if (num2 == null) {
            if (presenceSensorConfiguration.sensitivity != null) {
                return false;
            }
        } else if (!num2.equals(presenceSensorConfiguration.sensitivity)) {
            return false;
        }
        return true;
    }

    public Integer getMaximumSensitivity() {
        return this.maximumSensitivity;
    }

    public Integer getSensitivity() {
        return this.sensitivity;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorConfiguration
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.maximumSensitivity;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sensitivity;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public void setSensitivity(Integer num) {
        this.sensitivity = num;
    }

    public void setSensitivity(int i) {
        this.sensitivity = new Integer(i);
    }

    public PresenceSensorConfiguration(SensorConfiguration sensorConfiguration) {
        super(DomainType.PRESENCE_SENSOR, sensorConfiguration);
        this.sensitivity = null;
        this.maximumSensitivity = null;
    }

    public PresenceSensorConfiguration(Integer num) {
        this();
        this.sensitivity = num;
    }

    public PresenceSensorConfiguration(int i) {
        this();
        this.sensitivity = new Integer(i);
    }
}
