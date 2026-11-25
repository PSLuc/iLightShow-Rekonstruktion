package com.philips.lighting.hue.sdk.wrapper.bridgediscovery;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface BridgeDiscoverySink {
    void onBridgeInitialized(Bridge bridge);

    void onBridgesDiscovered(Collection<String> collection, Collection<String> collection2);

    void onDone(BridgeDiscoveryStatus bridgeDiscoveryStatus);
}
