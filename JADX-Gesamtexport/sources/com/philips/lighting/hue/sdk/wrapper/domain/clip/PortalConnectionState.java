package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum PortalConnectionState {
    NONE(0),
    DISCONNECTED(1),
    CONNECTING(2),
    CONNECTED(3);

    private int value;

    PortalConnectionState(int i) {
        this.value = i;
    }

    public static PortalConnectionState fromValue(int i) {
        for (PortalConnectionState portalConnectionState : values()) {
            if (portalConnectionState.getValue() == i) {
                return portalConnectionState;
            }
        }
        return NONE;
    }

    public int getValue() {
        return this.value;
    }
}
