package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public enum BridgeStateCacheType {
    UNKNOWN(-1),
    FULL_CONFIG(0),
    BRIDGE_CONFIG(1),
    LIGHTS_AND_GROUPS(2),
    SCENES(3),
    SENSORS_AND_SWITCHES(4),
    RULES(5),
    SCHEDULES_AND_TIMERS(6),
    RESOURCE_LINKS(7),
    DEVICE_SEARCH_STATUS(8);

    private int value;

    BridgeStateCacheType(int i) {
        this.value = i;
    }

    public static BridgeStateCacheType fromValue(int i) {
        for (BridgeStateCacheType bridgeStateCacheType : values()) {
            if (bridgeStateCacheType.getValue() == i) {
                return bridgeStateCacheType;
            }
        }
        return UNKNOWN;
    }

    public BridgeStateUpdatedEvent getMatchingEvent() {
        if (getValue() < 0) {
            return null;
        }
        return BridgeStateUpdatedEvent.fromValue(getValue() + 1);
    }

    public int getValue() {
        return this.value;
    }
}
