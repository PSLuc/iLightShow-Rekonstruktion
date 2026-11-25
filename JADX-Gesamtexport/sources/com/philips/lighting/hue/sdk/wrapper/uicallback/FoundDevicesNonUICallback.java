package com.philips.lighting.hue.sdk.wrapper.uicallback;

import com.philips.lighting.hue.sdk.wrapper.connection.FoundDevicesCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class FoundDevicesNonUICallback extends FoundDevicesCallback {
    public FoundDevicesNonUICallback(FoundDevicesCallback foundDevicesCallback) {
        this.runOnUI = false;
    }
}
