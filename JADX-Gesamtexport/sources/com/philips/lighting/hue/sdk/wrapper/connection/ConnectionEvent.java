package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public enum ConnectionEvent {
    NO_VALUE(-1),
    NONE(0),
    COULD_NOT_CONNECT(1),
    CONNECTED(2),
    NOT_AUTHENTICATED(3),
    CONNECTION_LOST(4),
    CONNECTION_RESTORED(5),
    DISCONNECTED(6),
    AUTHENTICATED(7),
    LINK_BUTTON_NOT_PRESSED(8),
    LOGIN_REQUIRED(9),
    TOKEN_EXPIRED(10),
    NO_BRIDGE_FOR_PORTAL_ACCOUNT(11),
    BRIDGE_UNIQUE_ID_MISMATCH(12),
    RATE_LIMIT_QUOTA_VIOLATION(13),
    TOKEN_UNKNOWN(14),
    TOKEN_BRIDGE_MISMATCH(15),
    LOGIN_INVALIDATED(16);

    private int eventCode;

    ConnectionEvent(int i) {
        this.eventCode = i;
    }

    public static ConnectionEvent fromValue(int i) {
        for (ConnectionEvent connectionEvent : values()) {
            if (connectionEvent.getValue() == i) {
                return connectionEvent;
            }
        }
        return NO_VALUE;
    }

    public int getValue() {
        return this.eventCode;
    }
}
