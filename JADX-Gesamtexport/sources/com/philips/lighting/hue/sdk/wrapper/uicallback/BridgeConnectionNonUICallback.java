package com.philips.lighting.hue.sdk.wrapper.uicallback;

import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class BridgeConnectionNonUICallback extends BridgeConnectionCallback {
    public BridgeConnectionNonUICallback() {
        this.runOnUI = false;
    }
}
