package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class LightLevelSensorState extends SensorState {
    private Boolean dark;
    private Boolean daylight;
    private Integer lightLevel;

    public LightLevelSensorState() {
        super(DomainType.LIGHT_LEVEL_SENSOR);
        this.daylight = null;
        this.dark = null;
        this.lightLevel = null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        LightLevelSensorState lightLevelSensorState = (LightLevelSensorState) obj;
        Boolean bool = this.dark;
        if (bool == null) {
            if (lightLevelSensorState.dark != null) {
                return false;
            }
        } else if (!bool.equals(lightLevelSensorState.dark)) {
            return false;
        }
        Boolean bool2 = this.daylight;
        if (bool2 == null) {
            if (lightLevelSensorState.daylight != null) {
                return false;
            }
        } else if (!bool2.equals(lightLevelSensorState.daylight)) {
            return false;
        }
        Integer num = this.lightLevel;
        if (num == null) {
            if (lightLevelSensorState.lightLevel != null) {
                return false;
            }
        } else if (!num.equals(lightLevelSensorState.lightLevel)) {
            return false;
        }
        return true;
    }

    public Boolean getDark() {
        return this.dark;
    }

    public Boolean getDaylight() {
        return this.daylight;
    }

    public Integer getLightLevel() {
        return this.lightLevel;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Boolean bool = this.dark;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.daylight;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.lightLevel;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public void setLightLevel(Integer num) {
        this.lightLevel = num;
    }

    public void setLightLevel(int i) {
        this.lightLevel = new Integer(i);
    }

    public LightLevelSensorState(Integer num) {
        this();
        this.lightLevel = num;
    }
}
