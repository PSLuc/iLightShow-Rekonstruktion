package com.philips.lighting.hue.sdk.wrapper;

import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;

/* JADX INFO: loaded from: classes.dex */
public class Persistence {
    public static native String getStorageLocation();

    public static ReturnCode setStorageLocation(String str, String str2) {
        return ReturnCode.fromValue(setStorageLocationNative(str, str2));
    }

    private static native int setStorageLocationNative(String str, String str2);
}
