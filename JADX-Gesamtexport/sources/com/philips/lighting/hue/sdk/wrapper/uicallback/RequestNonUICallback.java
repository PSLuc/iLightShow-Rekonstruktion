package com.philips.lighting.hue.sdk.wrapper.uicallback;

import com.philips.lighting.hue.sdk.wrapper.connection.RequestCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class RequestNonUICallback extends RequestCallback {
    public RequestNonUICallback(RequestCallback requestCallback) {
        this.runOnUI = false;
    }
}
