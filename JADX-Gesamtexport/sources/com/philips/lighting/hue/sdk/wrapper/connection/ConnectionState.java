package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public enum ConnectionState {
    NO_VALUE(-1),
    DISCONNECTED(0),
    CONNECTING(1),
    DISCONNECTING(2),
    AUTHENTICATING(3),
    AUTHENTICATED(4),
    WAITING_FOR_AUTHENTICATION(5),
    RESTORING_CONNECTION(6);

    private int stateCode;

    ConnectionState(int i) {
        this.stateCode = i;
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
        return this.stateCode;
    }
}
