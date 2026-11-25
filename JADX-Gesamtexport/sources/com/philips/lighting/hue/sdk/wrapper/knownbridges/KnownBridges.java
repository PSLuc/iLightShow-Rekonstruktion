package com.philips.lighting.hue.sdk.wrapper.knownbridges;

import com.philips.lighting.hue.sdk.wrapper.domain.BridgeState;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class KnownBridges {
    public static ReturnCode forgetAllBridges() {
        return ReturnCode.fromValue(forgetAllBridgesNative());
    }

    public static native int forgetAllBridgesNative();

    public static ReturnCode forgetBridge(String str) {
        return ReturnCode.fromValue(forgetBridgeNative(str));
    }

    public static native int forgetBridgeNative(String str);

    public static native List<KnownBridge> getAll();

    public static ReturnCode removeBridgeState(String str) {
        return ReturnCode.fromValue(removeBridgeStateNative(str));
    }

    private static native int removeBridgeStateNative(String str);

    public static ReturnCode removeWhitelistEntry(String str) {
        return ReturnCode.fromValue(removeWhitelistEntryNative(str));
    }

    private static native int removeWhitelistEntryNative(String str);

    public static native BridgeState retrieveBridgeState(String str);

    public static native String retrieveWhitelistEntry(String str);
}
