package com.philips.lighting.hue.sdk.wrapper;

/* JADX INFO: loaded from: classes.dex */
public class CrashReporter {
    private static CrashReporterCallback callbackInstance;

    public static native void deinit();

    public static native String getLatestDumpFilePath();

    public static void init(CrashReporterCallback crashReporterCallback, String str) {
        callbackInstance = crashReporterCallback;
        initNative(crashReporterCallback, str);
    }

    private static native void initNative(CrashReporterCallback crashReporterCallback, String str);
}
