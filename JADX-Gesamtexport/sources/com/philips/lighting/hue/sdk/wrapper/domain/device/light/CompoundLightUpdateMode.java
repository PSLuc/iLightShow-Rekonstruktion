package com.philips.lighting.hue.sdk.wrapper.domain.device.light;

/* JADX INFO: loaded from: classes.dex */
public enum CompoundLightUpdateMode {
    STREAMING(0),
    UNICAST(1);

    private int value;

    CompoundLightUpdateMode() {
        this.value = 0;
    }

    public static CompoundLightUpdateMode fromValue(int i) {
        for (CompoundLightUpdateMode compoundLightUpdateMode : values()) {
            if (compoundLightUpdateMode.getValue() == i) {
                return compoundLightUpdateMode;
            }
        }
        return STREAMING;
    }

    public int getValue() {
        return this.value;
    }

    CompoundLightUpdateMode(int i) {
        this.value = i;
    }
}
