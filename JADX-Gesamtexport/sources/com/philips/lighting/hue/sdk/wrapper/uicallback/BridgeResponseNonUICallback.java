package com.philips.lighting.hue.sdk.wrapper.uicallback;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class BridgeResponseNonUICallback extends BridgeResponseCallback {
    public BridgeResponseNonUICallback(BridgeResponseCallback bridgeResponseCallback) {
        this.runOnUI = false;
    }
}
