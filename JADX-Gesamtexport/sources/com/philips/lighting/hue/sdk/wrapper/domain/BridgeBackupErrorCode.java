package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public enum BridgeBackupErrorCode {
    NONE(0),
    IMPORT_FAILED(1),
    EXPORT_FAILED(2);

    private int value;

    BridgeBackupErrorCode(int i) {
        this.value = i;
    }

    public static BridgeBackupErrorCode fromValue(int i) {
        for (BridgeBackupErrorCode bridgeBackupErrorCode : values()) {
            if (bridgeBackupErrorCode.getValue() == i) {
                return bridgeBackupErrorCode;
            }
        }
        return NONE;
    }

    public int getValue() {
        return this.value;
    }
}
