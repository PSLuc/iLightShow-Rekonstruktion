package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum ColorMode {
    NO_VALUE(-1),
    HUE_SATURATION(1),
    XY(2),
    COLOR_TEMPERATURE(3);

    private int value;

    ColorMode(int i) {
        this.value = i;
    }

    public static ColorMode fromValue(int i) {
        for (ColorMode colorMode : values()) {
            if (colorMode.getValue() == i) {
                return colorMode;
            }
        }
        return NO_VALUE;
    }

    public int getValue() {
        return this.value;
    }
}
