package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum ClipDataType {
    UNDEFINED(0),
    BOOLEAN(1),
    INTEGER(2),
    TIMEPATTERN(3);

    private int value;

    ClipDataType(int i) {
        this.value = i;
    }

    public static ClipDataType fromValue(int i) {
        for (ClipDataType clipDataType : values()) {
            if (clipDataType.getValue() == i) {
                return clipDataType;
            }
        }
        return UNDEFINED;
    }

    public int getValue() {
        return this.value;
    }
}
