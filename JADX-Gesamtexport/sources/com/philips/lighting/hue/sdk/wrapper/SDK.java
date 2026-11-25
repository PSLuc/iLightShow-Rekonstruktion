package com.philips.lighting.hue.sdk.wrapper;

import com.philips.lighting.hue.sdk.wrapper.domain.BridgeConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;

/* JADX INFO: loaded from: classes.dex */
public abstract class SDK {
    public static native void clearProxySettings();

    public static native String getBridgeDiscoveryURL();

    public static native BridgeConfiguration getBridgeInformation(String str);

    public static native String getProxyAddress();

    public static native int getProxyPort();

    public static native String getRemoteAPIURL();

    public static native String getVersion();

    public static native boolean isProxySet();

    public static ReturnCode setBridgeDiscoveryURL(String str) {
        return ReturnCode.fromValue(setBridgeDiscoveryURLNative(str));
    }

    private static native int setBridgeDiscoveryURLNative(String str);

    public static ReturnCode setProxy(String str, int i) {
        return ReturnCode.fromValue(setProxyNative(str, i));
    }

    private static native int setProxyNative(String str, int i);

    public static ReturnCode setRemoteAPIURL(String str) {
        return ReturnCode.fromValue(setRemoteAPIURLNative(str));
    }

    private static native int setRemoteAPIURLNative(String str);
}
