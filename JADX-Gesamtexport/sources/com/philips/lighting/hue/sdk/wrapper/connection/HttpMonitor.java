package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public class HttpMonitor {
    public static native long registerCallback(HttpMonitorCallback httpMonitorCallback);

    public static native void unregisterCallback(long j4);
}
