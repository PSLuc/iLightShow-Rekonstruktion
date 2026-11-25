package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum ClipActionType {
    UNKNOWN(0),
    UPDATE_DEVICE_STATE(1),
    UPDATE_DEVICE_CONFIGURATION(2),
    DELETE_DEVICE(3),
    SET_GROUP_STATE(4),
    RECALL_RESOURCE(5),
    CREATE_RESOURCE(6),
    DELETE_RESOURCE(7),
    UPDATE_RESOURCE(8);

    private int value;

    ClipActionType(int i) {
        this.value = i;
    }

    public static ClipActionType fromValue(int i) {
        for (ClipActionType clipActionType : values()) {
            if (clipActionType.getValue() == i) {
                return clipActionType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
