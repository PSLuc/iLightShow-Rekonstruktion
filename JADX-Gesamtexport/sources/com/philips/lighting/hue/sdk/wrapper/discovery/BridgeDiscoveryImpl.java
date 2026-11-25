package com.philips.lighting.hue.sdk.wrapper.discovery;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import java.util.EnumSet;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public final class BridgeDiscoveryImpl extends WrapperObject implements BridgeDiscovery {
    public BridgeDiscoveryImpl() {
        create();
    }

    public native void create();

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery
    public final native boolean isSearching();

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery
    public final native void search(BridgeDiscovery.Callback callback);

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery
    @Deprecated
    public void search(BridgeDiscovery.Option option, BridgeDiscovery.Callback callback) {
        search(EnumSet.of(option), callback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery
    public final native void search(@Nonnull EnumSet<BridgeDiscovery.Option> enumSet, BridgeDiscovery.Callback callback);

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery
    public final native void stop();

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery
    @Deprecated
    public void search(int i, BridgeDiscovery.Callback callback) {
        search(BridgeDiscovery.Option.enumSetFromValue(i), callback);
    }

    public BridgeDiscoveryImpl(WrapperObject.Scope scope) {
    }
}
