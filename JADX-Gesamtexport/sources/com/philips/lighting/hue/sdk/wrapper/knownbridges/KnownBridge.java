package com.philips.lighting.hue.sdk.wrapper.knownbridges;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class KnownBridge {
    private Date firstConnected;
    private String ipAddress;
    private Date lastConnected;
    private String name;
    private String uniqueId;

    public KnownBridge(byte[] bArr, byte[] bArr2, byte[] bArr3, long j4, long j6) {
        this.uniqueId = NativeTools.BytesToString(bArr);
        this.ipAddress = NativeTools.BytesToString(bArr2);
        this.name = NativeTools.BytesToString(bArr3);
        this.firstConnected = new Date(j4);
        this.lastConnected = new Date(j6);
    }

    public Date getFirstConnected() {
        return this.firstConnected;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public Date getLastConnected() {
        return this.lastConnected;
    }

    public String getName() {
        return this.name;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }
}
