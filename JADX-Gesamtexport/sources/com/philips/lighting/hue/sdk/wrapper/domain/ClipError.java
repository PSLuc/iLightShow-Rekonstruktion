package com.philips.lighting.hue.sdk.wrapper.domain;

import B.AbstractC0013g0;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class ClipError extends HueError {
    private byte[] address;
    private byte[] description;
    private ErrorType errorType;
    private byte[] identifier;

    public ClipError(String str, ErrorType errorType, String str2, String str3) {
        this.identifier = NativeTools.StringToBytes(str);
        this.errorType = errorType;
        this.address = NativeTools.StringToBytes(str2);
        this.description = NativeTools.StringToBytes(str3);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClipError clipError = (ClipError) obj;
        return Arrays.equals(this.address, clipError.address) && Arrays.equals(this.description, clipError.description) && this.errorType == clipError.errorType && Arrays.equals(this.identifier, clipError.identifier);
    }

    public String getAddress() {
        return NativeTools.BytesToString(this.address);
    }

    public String getDescription() {
        return NativeTools.BytesToString(this.description);
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public int hashCode() {
        int iN = k.n(this.description, k.n(this.address, 31, 31), 31);
        ErrorType errorType = this.errorType;
        return Arrays.hashCode(this.identifier) + ((iN + (errorType == null ? 0 : errorType.hashCode())) * 31);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.HueError
    public String toString() {
        ErrorType errorType = ErrorType.UNKNOWN;
        String identifier = getIdentifier() != null ? getIdentifier() : "<unknown>";
        if (getErrorType() != null) {
            errorType = getErrorType();
        }
        String address = getAddress() != null ? getAddress() : "<unknown>";
        String description = getDescription() != null ? getDescription() : "<unknown>";
        StringBuilder sbO = AbstractC0013g0.o("Clip Error: ", address, " - ID ", identifier, " - type ");
        sbO.append(errorType);
        sbO.append(", ");
        sbO.append(description);
        return sbO.toString();
    }

    public ClipError(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this.identifier = bArr;
        this.errorType = ErrorType.fromValue(i);
        this.address = bArr2;
        this.description = bArr3;
    }
}
