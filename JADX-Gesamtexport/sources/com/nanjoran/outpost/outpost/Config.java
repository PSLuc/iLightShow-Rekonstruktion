package com.nanjoran.outpost.outpost;

import go.Seq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Config implements Seq.Proxy {
    private final int refnum;

    static {
        Outpost.touch();
    }

    public Config(String str, String str2) {
        int i__NewConfig = __NewConfig(str, str2);
        this.refnum = i__NewConfig;
        Seq.trackGoRef(i__NewConfig, this);
    }

    private static native int __NewConfig(String str, String str2);

    public native void clearReportedInfo();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Config)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native void putReportedInfo(String str, String str2);

    public native void removeReportedInfo(String str);

    public native void setAllowInsecureCertificates(boolean z5);

    public native void setAppBuild(String str);

    public native void setAppID(String str);

    public native void setAppVersion(String str);

    public native void setBootstrapSecret(String str);

    public native void setEnableDebugLogging(boolean z5);

    public native void setMaxConcurrentStreams(long j4);

    public native void setPinnedLeafCertificateDERBase64(String str);

    public native void setReconnectDelaySeconds(long j4);

    public native void setReportedCountryCode(String str);

    public native void setReportedDeviceType(String str);

    public native void setReportedOS(String str);

    public native void setServerURL(String str);

    public native void setStorageDir(String str);

    public String toString() {
        return "Config{}";
    }

    public Config(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
