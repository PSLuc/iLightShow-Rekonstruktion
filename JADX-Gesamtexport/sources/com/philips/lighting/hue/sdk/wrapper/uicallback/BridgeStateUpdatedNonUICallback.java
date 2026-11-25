package com.philips.lighting.hue.sdk.wrapper.uicallback;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class BridgeStateUpdatedNonUICallback extends BridgeStateUpdatedCallback {
    public BridgeStateUpdatedNonUICallback(BridgeStateUpdatedCallback bridgeStateUpdatedCallback) {
        this.runOnUI = false;
    }
}
