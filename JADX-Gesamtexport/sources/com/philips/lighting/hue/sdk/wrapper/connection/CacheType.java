package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public enum CacheType {
    NORMAL(1),
    DIRECT(2);

    private int value;

    CacheType(int i) {
        this.value = i;
    }

    public static CacheType fromValue(int i) {
        for (CacheType cacheType : values()) {
            if (cacheType.getValue() == i) {
                return cacheType;
            }
        }
        return NORMAL;
    }

    public int getValue() {
        return this.value;
    }
}
