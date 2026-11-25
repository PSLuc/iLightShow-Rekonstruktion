package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class HueHTTPResponse {
    private byte[] body;
    private int statusCode;

    public HueHTTPResponse(int i, String str) {
        this.statusCode = i;
        setBody(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HueHTTPResponse hueHTTPResponse = (HueHTTPResponse) obj;
        return Arrays.equals(this.body, hueHTTPResponse.body) && this.statusCode == hueHTTPResponse.statusCode;
    }

    public String getBody() {
        return NativeTools.BytesToString(this.body);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return k.n(this.body, 31, 31) + this.statusCode;
    }

    public void setBody(String str) {
        this.body = NativeTools.StringToBytes(str);
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public HueHTTPResponse(int i, byte[] bArr) {
        this.statusCode = i;
        this.body = bArr;
    }
}
