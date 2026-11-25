package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.uicallback.CallbackWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class BridgeStateUpdatedCallback extends CallbackWrapper implements BridgeStateUpdatedInternalCallback {
    public abstract void onBridgeStateUpdated(Bridge bridge, BridgeStateUpdatedEvent bridgeStateUpdatedEvent);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedInternalCallback
    public final void onInternalBridgeStateUpdated(final Bridge bridge, final BridgeStateUpdatedEvent bridgeStateUpdatedEvent) {
        post(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedCallback.1
            @Override // java.lang.Runnable
            public void run() {
                BridgeStateUpdatedCallback.this.onBridgeStateUpdated(bridge, bridgeStateUpdatedEvent);
            }
        });
    }
}
