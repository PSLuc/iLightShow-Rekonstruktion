package com.philips.lighting.hue.sdk.wrapper.bridgediscovery;

import com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscovery;
import com.philips.lighting.hue.sdk.wrapper.utilities.CancelableOperation;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public interface BridgeDiscoveryService {
    CancelableOperation connect(String str, BridgeDiscoverySink bridgeDiscoverySink);

    CancelableOperation find(BridgeDiscoverySink bridgeDiscoverySink);

    CancelableOperation find(String str, EnumSet<BridgeDiscovery.Option> enumSet, BridgeDiscoverySink bridgeDiscoverySink);

    CancelableOperation find(Collection<String> collection, EnumSet<BridgeDiscovery.Option> enumSet, BridgeDiscoverySink bridgeDiscoverySink);
}
