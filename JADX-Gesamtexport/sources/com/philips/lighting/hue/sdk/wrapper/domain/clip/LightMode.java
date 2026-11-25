package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum LightMode {
    NO_VALUE(-1),
    HOMEAUTOMATION(1),
    STREAMING(2);

    private int value;

    LightMode(int i) {
        this.value = i;
    }

    public static LightMode fromValue(int i) {
        for (LightMode lightMode : values()) {
            if (lightMode.getValue() == i) {
                return lightMode;
            }
        }
        return NO_VALUE;
    }

    public int getValue() {
        return this.value;
    }
}
