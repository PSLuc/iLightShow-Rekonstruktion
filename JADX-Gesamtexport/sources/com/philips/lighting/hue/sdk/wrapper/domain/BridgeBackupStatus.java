package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public enum BridgeBackupStatus {
    IDLE(0),
    START_MIGRATION(1),
    FILEREADY_DISABLED(2),
    PREPARE_RESTORE(3),
    RESTORING(4);

    private int value;

    BridgeBackupStatus(int i) {
        this.value = i;
    }

    public static BridgeBackupStatus fromValue(int i) {
        for (BridgeBackupStatus bridgeBackupStatus : values()) {
            if (bridgeBackupStatus.getValue() == i) {
                return bridgeBackupStatus;
            }
        }
        return IDLE;
    }

    public int getValue() {
        return this.value;
    }
}
