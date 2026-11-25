package com.philips.lighting.hue.sdk.wrapper.bridgediscovery;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery;
import com.philips.lighting.hue.sdk.wrapper.utilities.CancelableOperation;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
final class BridgeDiscoveryServiceImpl extends WrapperObject implements BridgeDiscoveryService {
    private BridgeDiscoveryServiceImpl(WrapperObject.Scope scope) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoveryService
    public native CancelableOperation connect(String str, BridgeDiscoverySink bridgeDiscoverySink);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoveryService
    public native CancelableOperation find(BridgeDiscoverySink bridgeDiscoverySink);

    @Override // com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoveryService
    public native CancelableOperation find(String str, EnumSet<BridgeDiscovery.Option> enumSet, BridgeDiscoverySink bridgeDiscoverySink);

    @Override // com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoveryService
    public native CancelableOperation find(Collection<String> collection, EnumSet<BridgeDiscovery.Option> enumSet, BridgeDiscoverySink bridgeDiscoverySink);
}
