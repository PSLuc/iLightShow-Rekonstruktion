package com.philips.lighting.hue.sdk.wrapper.domain.device.sensor;

/* JADX INFO: loaded from: classes.dex */
public enum SensorSubType {
    UNKNOWN(-1),
    CLIP(0),
    ZLL(1),
    ZGP(2);

    private int value;

    SensorSubType(int i) {
        this.value = i;
    }

    public static SensorSubType fromValue(int i) {
        for (SensorSubType sensorSubType : values()) {
            if (sensorSubType.getValue() == i) {
                return sensorSubType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
