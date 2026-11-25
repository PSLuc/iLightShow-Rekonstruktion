package com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;

/* JADX INFO: loaded from: classes.dex */
public class TimePatternFactory {
    public static TimePattern fromString(String str) {
        if (str != null) {
            return fromStringNative(NativeTools.StringToBytes(str));
        }
        return null;
    }

    public static native TimePattern fromStringNative(byte[] bArr);
}
