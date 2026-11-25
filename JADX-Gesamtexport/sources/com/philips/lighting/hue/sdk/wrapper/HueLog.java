package com.philips.lighting.hue.sdk.wrapper;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;

/* JADX INFO: loaded from: classes.dex */
public class HueLog {

    public class LogComponent {
        public static final int ALL = 2047;
        public static final int APPCORE = 512;
        public static final int CLIENT = 32;
        public static final int COLORCONVERSION = 64;
        public static final int CORE = 2;
        public static final int NETWORK = 8;
        public static final int STREAM = 128;
        public static final int STREAMDTLS = 256;
        public static final int SUPPORT = 4;
        public static final int UNKNOWN = 1;
        public static final int WRAPPER = 16;

        public LogComponent() {
        }
    }

    public enum LogLevel {
        OFF(0),
        ERROR(1),
        WARN(2),
        INFO(3),
        DEBUG(4);

        private int value;

        LogLevel(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static void d(String str, String str2) {
        logNative(LogLevel.DEBUG.getValue(), NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public static void e(String str, String str2) {
        logNative(LogLevel.ERROR.getValue(), NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public static void i(String str, String str2) {
        logNative(LogLevel.INFO.getValue(), NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    private static native void logNative(int i, byte[] bArr, byte[] bArr2);

    public static void setConsoleLogLevel(LogLevel logLevel) {
        setConsoleLogNative(logLevel.getValue(), LogComponent.ALL);
    }

    private static native void setConsoleLogNative(int i, int i3);

    public static void setFileLogLevel(LogLevel logLevel, int i) {
        setFileLogNative(logLevel.getValue(), i);
    }

    private static native void setFileLogNative(int i, int i3);

    public static void w(String str, String str2) {
        logNative(LogLevel.WARN.getValue(), NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public static void setConsoleLogLevel(LogLevel logLevel, int i) {
        setConsoleLogNative(logLevel.getValue(), i);
    }
}
