package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum ConnectionState {
    NO_VALUE(-1),
    DISCONNECTED(0),
    CONNECTED(1);

    private int value;

    ConnectionState(int i) {
        this.value = i;
    }

    public static ConnectionState fromValue(int i) {
        for (ConnectionState connectionState : values()) {
            if (connectionState.getValue() == i) {
                return connectionState;
            }
        }
        return NO_VALUE;
    }

    public int getValue() {
        return this.value;
    }
}
