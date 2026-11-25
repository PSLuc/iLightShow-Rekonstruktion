package com.philips.lighting.hue.sdk.wrapper.bridgediscovery;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
public final class BridgeDiscoveryServiceFactory extends WrapperObject {
    public BridgeDiscoveryServiceFactory() {
        init();
    }

    private final native void init();

    public final native BridgeDiscoveryService create(String str, String str2);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    private BridgeDiscoveryServiceFactory(WrapperObject.Scope scope) {
        this();
    }
}
