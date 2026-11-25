package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public class SDKError extends HueError {
    private ReturnCode code;
    private String message;

    public SDKError(int i, String str) {
        this.code = ReturnCode.fromValue(i);
        this.message = str;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SDKError sDKError = (SDKError) obj;
        if (this.code != sDKError.code) {
            return false;
        }
        String str = this.message;
        if (str == null) {
            if (sDKError.message != null) {
                return false;
            }
        } else if (!str.equals(sDKError.message)) {
            return false;
        }
        return true;
    }

    public ReturnCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public int hashCode() {
        ReturnCode returnCode = this.code;
        int iHashCode = ((returnCode == null ? 0 : returnCode.hashCode()) + 31) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public String toString() {
        return "SDK Error: code " + this.code + ", " + (this.message != null ? getMessage() : "<unknown>");
    }
}
