package com.nanjoran.ilightshow.Services.lights.storage;

import B.AbstractC0013g0;
import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class SharedDeviceCredentialsLocal {
    public static final int $stable = 8;
    private String authToken;
    private String clientKey;
    private String token;

    public SharedDeviceCredentialsLocal() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SharedDeviceCredentialsLocal copy$default(SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedDeviceCredentialsLocal.token;
        }
        if ((i & 2) != 0) {
            str2 = sharedDeviceCredentialsLocal.clientKey;
        }
        if ((i & 4) != 0) {
            str3 = sharedDeviceCredentialsLocal.authToken;
        }
        return sharedDeviceCredentialsLocal.copy(str, str2, str3);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.clientKey;
    }

    public final String component3() {
        return this.authToken;
    }

    public final SharedDeviceCredentialsLocal copy(String str, String str2, String str3) {
        return new SharedDeviceCredentialsLocal(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedDeviceCredentialsLocal)) {
            return false;
        }
        SharedDeviceCredentialsLocal sharedDeviceCredentialsLocal = (SharedDeviceCredentialsLocal) obj;
        return k.a(this.token, sharedDeviceCredentialsLocal.token) && k.a(this.clientKey, sharedDeviceCredentialsLocal.clientKey) && k.a(this.authToken, sharedDeviceCredentialsLocal.authToken);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authToken;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAuthToken(String str) {
        this.authToken = str;
    }

    public final void setClientKey(String str) {
        this.clientKey = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        String str = this.token;
        String str2 = this.clientKey;
        return p012c.k.u(AbstractC0013g0.o("SharedDeviceCredentialsLocal(token=", str, ", clientKey=", str2, ", authToken="), this.authToken, ")");
    }

    public SharedDeviceCredentialsLocal(String str, String str2, String str3) {
        this.token = str;
        this.clientKey = str2;
        this.authToken = str3;
    }

    public /* synthetic */ SharedDeviceCredentialsLocal(String str, String str2, String str3, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
