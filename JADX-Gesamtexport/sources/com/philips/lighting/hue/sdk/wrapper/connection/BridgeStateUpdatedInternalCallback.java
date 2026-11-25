package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;

/* JADX INFO: loaded from: classes.dex */
interface BridgeStateUpdatedInternalCallback {
    void onInternalBridgeStateUpdated(Bridge bridge, BridgeStateUpdatedEvent bridgeStateUpdatedEvent);
}
