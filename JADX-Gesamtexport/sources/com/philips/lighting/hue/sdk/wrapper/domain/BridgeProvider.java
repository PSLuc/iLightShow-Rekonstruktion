package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public class BridgeProvider {
    public static Bridge getBridge() {
        return new BridgeImpl();
    }

    public static Bridge getBridge(String str) {
        return new BridgeImpl(str);
    }
}
