package com.philips.lighting.hue.sdk.wrapper.bridgediscovery;

import D4.c;
import D4.e;
import E4.k;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class BridgeDiscoverySinkBuilder {
    private c onBridgeInitializedHandler;
    private e onBridgesDiscoveredHandler;
    private c onDiscoveryDoneHandler;

    public final BridgeDiscoverySink build() {
        return new BridgeDiscoverySink() { // from class: com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoverySinkBuilder.build.1
            @Override // com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoverySink
            public void onBridgeInitialized(Bridge bridge) {
                k.g("bridge", bridge);
                c cVar = BridgeDiscoverySinkBuilder.this.onBridgeInitializedHandler;
                if (cVar != null) {
                }
            }

            @Override // com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoverySink
            public void onBridgesDiscovered(Collection<String> collection, Collection<String> collection2) {
                k.g("foundBridges", collection);
                k.g("ignoredBridges", collection2);
                e eVar = BridgeDiscoverySinkBuilder.this.onBridgesDiscoveredHandler;
                if (eVar != null) {
                }
            }

            @Override // com.philips.lighting.hue.sdk.wrapper.bridgediscovery.BridgeDiscoverySink
            public void onDone(BridgeDiscoveryStatus bridgeDiscoveryStatus) {
                k.g(ClipAttribute.Sensor.State.Status, bridgeDiscoveryStatus);
                c cVar = BridgeDiscoverySinkBuilder.this.onDiscoveryDoneHandler;
                if (cVar != null) {
                }
            }
        };
    }

    public final BridgeDiscoverySinkBuilder onBridgeInitialized(c cVar) {
        k.g("handler", cVar);
        this.onBridgeInitializedHandler = cVar;
        return this;
    }

    public final BridgeDiscoverySinkBuilder onBridgesDiscovered(e eVar) {
        k.g("handler", eVar);
        this.onBridgesDiscoveredHandler = eVar;
        return this;
    }

    public final BridgeDiscoverySinkBuilder onDone(c cVar) {
        k.g("handler", cVar);
        this.onDiscoveryDoneHandler = cVar;
        return this;
    }
}
