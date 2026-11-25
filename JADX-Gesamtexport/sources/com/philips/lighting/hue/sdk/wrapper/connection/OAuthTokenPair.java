package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class OAuthTokenPair {
    private byte[] accessToken = null;
    private byte[] refreshToken = null;

    public OAuthTokenPair() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuthTokenPair oAuthTokenPair = (OAuthTokenPair) obj;
        return Arrays.equals(this.accessToken, oAuthTokenPair.accessToken) && Arrays.equals(this.refreshToken, oAuthTokenPair.refreshToken);
    }

    public String getAccessToken() {
        return NativeTools.BytesToString(this.accessToken);
    }

    public String getRefreshToken() {
        return NativeTools.BytesToString(this.refreshToken);
    }

    public boolean hasAccessToken() {
        return this.accessToken != null;
    }

    public boolean hasRefreshToken() {
        return this.refreshToken != null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.refreshToken) + k.n(this.accessToken, 31, 31);
    }

    public void setAccessToken(String str) {
        this.accessToken = NativeTools.StringToBytes(str);
    }

    public void setRefreshToken(String str) {
        this.refreshToken = NativeTools.StringToBytes(str);
    }

    public OAuthTokenPair(String str, String str2) {
        setAccessToken(str);
        setRefreshToken(str2);
    }
}
