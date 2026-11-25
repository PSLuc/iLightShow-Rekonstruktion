package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class BridgeVersion {
    private byte[] clipVersion;
    private byte[] datastoreVersion;
    private byte[] firmwareVersion;

    public BridgeVersion(String str, String str2, String str3) {
        setFirmwareVersion(str);
        setCLIPVersion(str2);
        setDatastoreVersion(str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeVersion bridgeVersion = (BridgeVersion) obj;
        return Arrays.equals(this.clipVersion, bridgeVersion.clipVersion) && Arrays.equals(this.firmwareVersion, bridgeVersion.firmwareVersion) && Arrays.equals(this.datastoreVersion, bridgeVersion.datastoreVersion);
    }

    public String getCLIPVersion() {
        return NativeTools.BytesToString(this.clipVersion);
    }

    public String getDatastoreVersion() {
        return NativeTools.BytesToString(this.datastoreVersion);
    }

    public String getFirmwareVersion() {
        return NativeTools.BytesToString(this.firmwareVersion);
    }

    public int hashCode() {
        return Arrays.hashCode(this.datastoreVersion) + k.n(this.firmwareVersion, k.n(this.clipVersion, 31, 31), 31);
    }

    public void setCLIPVersion(String str) {
        this.clipVersion = NativeTools.StringToBytes(str);
    }

    public void setDatastoreVersion(String str) {
        this.datastoreVersion = NativeTools.StringToBytes(str);
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = NativeTools.StringToBytes(str);
    }

    public BridgeVersion(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.firmwareVersion = bArr;
        this.clipVersion = bArr2;
        this.datastoreVersion = bArr3;
    }
}
