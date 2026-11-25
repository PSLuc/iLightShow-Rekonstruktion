package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public interface HttpMonitorCallback {
    void onRequestPerformed(HueHTTPRequest hueHTTPRequest, int i);

    void onResponseReceived(HueHTTPResponse hueHTTPResponse);
}
