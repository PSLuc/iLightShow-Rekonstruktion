package com.nanjoran.outpost.outpost;

import go.Seq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Client implements Seq.Proxy {
    private final int refnum;

    static {
        Outpost.touch();
    }

    public Client(Config config) {
        int i__NewClient = __NewClient(config);
        this.refnum = i__NewClient;
        Seq.trackGoRef(i__NewClient, this);
    }

    private static native int __NewClient(Config config);

    public native long activeStreamCount();

    public native String deviceID();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Client)) {
            return false;
        }
        return true;
    }

    public native String fingerprint();

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native String reportedCountryCode();

    public native void setListener(Listener listener);

    public native void start();

    public native String state();

    public native void stop();

    public String toString() {
        return "Client{}";
    }

    public Client(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
