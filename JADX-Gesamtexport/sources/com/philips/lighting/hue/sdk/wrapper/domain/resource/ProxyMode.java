package com.philips.lighting.hue.sdk.wrapper.domain.resource;

/* JADX INFO: loaded from: classes.dex */
public enum ProxyMode {
    UNKNOWN(-1),
    NONE(0),
    AUTO(1),
    MANUAL(2);

    private int value;

    ProxyMode(int i) {
        this.value = i;
    }

    public static ProxyMode fromValue(int i) {
        for (ProxyMode proxyMode : values()) {
            if (proxyMode.getValue() == i) {
                return proxyMode;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
