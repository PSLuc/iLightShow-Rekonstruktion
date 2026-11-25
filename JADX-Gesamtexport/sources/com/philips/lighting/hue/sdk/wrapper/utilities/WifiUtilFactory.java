package com.philips.lighting.hue.sdk.wrapper.utilities;

/* JADX INFO: loaded from: classes.dex */
public class WifiUtilFactory {
    private static WifiUtil getWifiUtil() {
        return new WifiUtil(InitSdk.getApplicationContext());
    }
}
