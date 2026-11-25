package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum Effect {
    NO_VALUE(-1),
    NONE(0),
    COLORLOOP(1);

    private int value;

    Effect(int i) {
        this.value = i;
    }

    public static Effect fromValue(int i) {
        for (Effect effect : values()) {
            if (effect.getValue() == i) {
                return effect;
            }
        }
        return NO_VALUE;
    }

    public int getValue() {
        return this.value;
    }
}
