package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public class BridgeBackup {
    private BridgeBackupErrorCode errorCode;
    private BridgeBackupStatus status;

    private BridgeBackup() {
        this.status = null;
        this.errorCode = null;
    }

    private int getStatusValue() {
        BridgeBackupStatus bridgeBackupStatus = this.status;
        if (bridgeBackupStatus != null) {
            return bridgeBackupStatus.getValue();
        }
        return 0;
    }

    private void setErrorCodeFromInt(int i) {
        this.errorCode = BridgeBackupErrorCode.fromValue(i);
    }

    private void setStatusFromInt(int i) {
        this.status = BridgeBackupStatus.fromValue(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeBackup bridgeBackup = (BridgeBackup) obj;
        return this.errorCode == bridgeBackup.errorCode && this.status == bridgeBackup.status;
    }

    public BridgeBackupErrorCode getErrorCode() {
        return this.errorCode;
    }

    public BridgeBackupStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        BridgeBackupErrorCode bridgeBackupErrorCode = this.errorCode;
        int iHashCode = ((bridgeBackupErrorCode == null ? 0 : bridgeBackupErrorCode.hashCode()) + 31) * 31;
        BridgeBackupStatus bridgeBackupStatus = this.status;
        return iHashCode + (bridgeBackupStatus != null ? bridgeBackupStatus.hashCode() : 0);
    }

    public void setStatus(BridgeBackupStatus bridgeBackupStatus) {
        this.status = bridgeBackupStatus;
    }

    public BridgeBackup(BridgeBackupStatus bridgeBackupStatus) {
        this.errorCode = null;
        this.status = bridgeBackupStatus;
    }
}
