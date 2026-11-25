package com.nanjoran.ilightshow.Services.lights.storage;

import B.AbstractC0013g0;
import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class SharedHueDeviceFields {
    public static final int $stable = 8;
    private String bridgeId;
    private String clientKey;
    private Boolean legacyOnly;
    private String mac;
    private String username;

    public SharedHueDeviceFields() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SharedHueDeviceFields copy$default(SharedHueDeviceFields sharedHueDeviceFields, String str, String str2, Boolean bool, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedHueDeviceFields.bridgeId;
        }
        if ((i & 2) != 0) {
            str2 = sharedHueDeviceFields.mac;
        }
        if ((i & 4) != 0) {
            bool = sharedHueDeviceFields.legacyOnly;
        }
        if ((i & 8) != 0) {
            str3 = sharedHueDeviceFields.username;
        }
        if ((i & 16) != 0) {
            str4 = sharedHueDeviceFields.clientKey;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        return sharedHueDeviceFields.copy(str, str2, bool2, str3, str5);
    }

    public final String component1() {
        return this.bridgeId;
    }

    public final String component2() {
        return this.mac;
    }

    public final Boolean component3() {
        return this.legacyOnly;
    }

    public final String component4() {
        return this.username;
    }

    public final String component5() {
        return this.clientKey;
    }

    public final SharedHueDeviceFields copy(String str, String str2, Boolean bool, String str3, String str4) {
        return new SharedHueDeviceFields(str, str2, bool, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedHueDeviceFields)) {
            return false;
        }
        SharedHueDeviceFields sharedHueDeviceFields = (SharedHueDeviceFields) obj;
        return k.a(this.bridgeId, sharedHueDeviceFields.bridgeId) && k.a(this.mac, sharedHueDeviceFields.mac) && k.a(this.legacyOnly, sharedHueDeviceFields.legacyOnly) && k.a(this.username, sharedHueDeviceFields.username) && k.a(this.clientKey, sharedHueDeviceFields.clientKey);
    }

    public final String getBridgeId() {
        return this.bridgeId;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final Boolean getLegacyOnly() {
        return this.legacyOnly;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.bridgeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mac;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.legacyOnly;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.username;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientKey;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBridgeId(String str) {
        this.bridgeId = str;
    }

    public final void setClientKey(String str) {
        this.clientKey = str;
    }

    public final void setLegacyOnly(Boolean bool) {
        this.legacyOnly = bool;
    }

    public final void setMac(String str) {
        this.mac = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        String str = this.bridgeId;
        String str2 = this.mac;
        Boolean bool = this.legacyOnly;
        String str3 = this.username;
        String str4 = this.clientKey;
        StringBuilder sbO = AbstractC0013g0.o("SharedHueDeviceFields(bridgeId=", str, ", mac=", str2, ", legacyOnly=");
        sbO.append(bool);
        sbO.append(", username=");
        sbO.append(str3);
        sbO.append(", clientKey=");
        return p012c.k.u(sbO, str4, ")");
    }

    public SharedHueDeviceFields(String str, String str2, Boolean bool, String str3, String str4) {
        this.bridgeId = str;
        this.mac = str2;
        this.legacyOnly = bool;
        this.username = str3;
        this.clientKey = str4;
    }

    public /* synthetic */ SharedHueDeviceFields(String str, String str2, Boolean bool, String str3, String str4, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
