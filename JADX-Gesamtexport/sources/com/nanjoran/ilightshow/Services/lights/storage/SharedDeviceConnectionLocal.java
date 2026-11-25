package com.nanjoran.ilightshow.Services.lights.storage;

import E4.g;
import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class SharedDeviceConnectionLocal {
    public static final int $stable = 8;
    private String discoverySource;
    private String host;
    private String lastSeenAt;
    private Integer port;

    public SharedDeviceConnectionLocal() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SharedDeviceConnectionLocal copy$default(SharedDeviceConnectionLocal sharedDeviceConnectionLocal, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedDeviceConnectionLocal.host;
        }
        if ((i & 2) != 0) {
            num = sharedDeviceConnectionLocal.port;
        }
        if ((i & 4) != 0) {
            str2 = sharedDeviceConnectionLocal.lastSeenAt;
        }
        if ((i & 8) != 0) {
            str3 = sharedDeviceConnectionLocal.discoverySource;
        }
        return sharedDeviceConnectionLocal.copy(str, num, str2, str3);
    }

    public final String component1() {
        return this.host;
    }

    public final Integer component2() {
        return this.port;
    }

    public final String component3() {
        return this.lastSeenAt;
    }

    public final String component4() {
        return this.discoverySource;
    }

    public final SharedDeviceConnectionLocal copy(String str, Integer num, String str2, String str3) {
        return new SharedDeviceConnectionLocal(str, num, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedDeviceConnectionLocal)) {
            return false;
        }
        SharedDeviceConnectionLocal sharedDeviceConnectionLocal = (SharedDeviceConnectionLocal) obj;
        return k.a(this.host, sharedDeviceConnectionLocal.host) && k.a(this.port, sharedDeviceConnectionLocal.port) && k.a(this.lastSeenAt, sharedDeviceConnectionLocal.lastSeenAt) && k.a(this.discoverySource, sharedDeviceConnectionLocal.discoverySource);
    }

    public final String getDiscoverySource() {
        return this.discoverySource;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getLastSeenAt() {
        return this.lastSeenAt;
    }

    public final Integer getPort() {
        return this.port;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.port;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.lastSeenAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discoverySource;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDiscoverySource(String str) {
        this.discoverySource = str;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setLastSeenAt(String str) {
        this.lastSeenAt = str;
    }

    public final void setPort(Integer num) {
        this.port = num;
    }

    public String toString() {
        return "SharedDeviceConnectionLocal(host=" + this.host + ", port=" + this.port + ", lastSeenAt=" + this.lastSeenAt + ", discoverySource=" + this.discoverySource + ")";
    }

    public SharedDeviceConnectionLocal(String str, Integer num, String str2, String str3) {
        this.host = str;
        this.port = num;
        this.lastSeenAt = str2;
        this.discoverySource = str3;
    }

    public /* synthetic */ SharedDeviceConnectionLocal(String str, Integer num, String str2, String str3, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
