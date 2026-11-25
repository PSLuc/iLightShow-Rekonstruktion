package com.nanjoran.outpost.outpost;

import go.Seq;

/* JADX INFO: loaded from: classes.dex */
public abstract class Outpost {
    public static final String StateAuthenticating = "authenticating";
    public static final String StateAwaitingChallenge = "awaitingChallenge";
    public static final String StateConnected = "connected";
    public static final String StateConnecting = "connecting";
    public static final String StateDisconnected = "disconnected";
    public static final String StateFailed = "failed";
    public static final String StateIdle = "idle";

    public static final class proxyListener implements Seq.Proxy, Listener {
        private final int refnum;

        public proxyListener(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // com.nanjoran.outpost.outpost.Listener
        public native void onActiveStreamsChanged(long j4);

        @Override // com.nanjoran.outpost.outpost.Listener
        public native void onDeviceIDAssigned(String str);

        @Override // com.nanjoran.outpost.outpost.Listener
        public native void onError(String str);

        @Override // com.nanjoran.outpost.outpost.Listener
        public native void onFingerprintUpdated(String str);

        @Override // com.nanjoran.outpost.outpost.Listener
        public native void onReportedCountryCodeUpdated(String str);

        @Override // com.nanjoran.outpost.outpost.Listener
        public native void onStateChanged(String str);
    }

    static {
        Seq.touch();
        _init();
    }

    private Outpost() {
    }

    private static native void _init();

    public static native Client newClient(Config config);

    public static native Config newConfig(String str, String str2);

    public static void touch() {
    }
}
