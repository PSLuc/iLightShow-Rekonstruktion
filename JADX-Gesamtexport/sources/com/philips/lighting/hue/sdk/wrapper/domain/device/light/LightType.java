package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

/* JADX INFO: loaded from: classes.dex */
public enum LightType {
    UNKNOWN(-1),
    ON_OFF(1),
    DIMMABLE(2),
    COLOR(3),
    COLOR_TEMPERATURE(4),
    EXTENDED_COLOR(5);

    private int value;

    LightType(int i) {
        this.value = i;
    }

    public static LightType fromValue(int i) {
        for (LightType lightType : values()) {
            if (lightType.getValue() == i) {
                return lightType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
