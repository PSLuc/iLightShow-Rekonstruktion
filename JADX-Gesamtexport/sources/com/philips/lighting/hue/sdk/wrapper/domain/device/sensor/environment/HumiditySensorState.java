package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.environment;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;

/* JADX INFO: loaded from: classes.dex */
public class HumiditySensorState extends SensorState {
    private Integer humidity;

    public HumiditySensorState() {
        super(DomainType.HUMIDITY_SENSOR);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        HumiditySensorState humiditySensorState = (HumiditySensorState) obj;
        Integer num = this.humidity;
        if (num == null) {
            if (humiditySensorState.humidity != null) {
                return false;
            }
        } else if (!num.equals(humiditySensorState.humidity)) {
            return false;
        }
        return true;
    }

    public Integer getHumidity() {
        return this.humidity;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Integer num = this.humidity;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public void setHumidity(Integer num) {
        this.humidity = num;
    }

    public HumiditySensorState(Integer num) {
        this();
        this.humidity = num;
    }
}
