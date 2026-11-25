package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;

/* JADX INFO: loaded from: classes.dex */
public class HueHTTPRequest extends SessionObject {
    private byte[] body;
    private String method;
    private String url;

    public HueHTTPRequest(String str, String str2, byte[] bArr) {
        this.url = str;
        this.method = str2;
        this.body = bArr;
    }

    public native void cancel();

    public byte[] getBody() {
        return this.body;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    private HueHTTPRequest() {
    }

    private HueHTTPRequest(long j4) {
        super(j4);
    }
}
