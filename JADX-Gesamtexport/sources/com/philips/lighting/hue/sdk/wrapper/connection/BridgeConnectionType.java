package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public enum BridgeConnectionType {
    NONE(0),
    LOCAL(1),
    REMOTE(2),
    LOCAL_REMOTE(3),
    REMOTE_LOCAL(4);

    private int type;

    BridgeConnectionType(int i) {
        this.type = i;
    }

    public static BridgeConnectionType fromValue(int i) {
        for (BridgeConnectionType bridgeConnectionType : values()) {
            if (bridgeConnectionType.getValue() == i) {
                return bridgeConnectionType;
            }
        }
        return NONE;
    }

    public int getValue() {
        return this.type;
    }
}
