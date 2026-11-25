package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class PortalConnectionOptions {
    private byte[] accountGUID;
    private byte[] appId;
    private byte[] appName;
    private byte[] callbackUrl;
    private byte[] clientId;
    private byte[] clientSecret;
    private byte[] deviceId;
    private byte[] deviceName;
    private boolean fastConnectionMode;
    private Integer connectTimeout = null;
    private Integer receiveTimeout = null;
    private Integer requestTimeout = null;
    private Integer maxRetryCount = null;
    private byte[] fastConnectionModeBridgeId = null;

    public PortalConnectionOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        setCallbackUrl(str2);
        setAppId(str3);
        setAppName(str4);
        setDeviceId(str5);
        setDeviceName(str6);
        setClientId(str7);
        setClientSecret(str8);
        setAccountGUID(str);
    }

    public void disableFastConnectionMode() {
        this.fastConnectionMode = false;
    }

    public void enableFastConnectionMode(String str) {
        this.fastConnectionMode = true;
        this.fastConnectionModeBridgeId = NativeTools.StringToBytes(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortalConnectionOptions portalConnectionOptions = (PortalConnectionOptions) obj;
        if (!Arrays.equals(this.accountGUID, portalConnectionOptions.accountGUID) || !Arrays.equals(this.appId, portalConnectionOptions.appId) || !Arrays.equals(this.appName, portalConnectionOptions.appName) || !Arrays.equals(this.callbackUrl, portalConnectionOptions.callbackUrl) || !Arrays.equals(this.clientId, portalConnectionOptions.clientId) || !Arrays.equals(this.clientSecret, portalConnectionOptions.clientSecret)) {
            return false;
        }
        Integer num = this.connectTimeout;
        if (num == null) {
            if (portalConnectionOptions.connectTimeout != null) {
                return false;
            }
        } else if (!num.equals(portalConnectionOptions.connectTimeout)) {
            return false;
        }
        if (!Arrays.equals(this.deviceId, portalConnectionOptions.deviceId) || !Arrays.equals(this.deviceName, portalConnectionOptions.deviceName) || this.fastConnectionMode != portalConnectionOptions.fastConnectionMode || !Arrays.equals(this.fastConnectionModeBridgeId, portalConnectionOptions.fastConnectionModeBridgeId)) {
            return false;
        }
        Integer num2 = this.maxRetryCount;
        if (num2 == null) {
            if (portalConnectionOptions.maxRetryCount != null) {
                return false;
            }
        } else if (!num2.equals(portalConnectionOptions.maxRetryCount)) {
            return false;
        }
        Integer num3 = this.receiveTimeout;
        if (num3 == null) {
            if (portalConnectionOptions.receiveTimeout != null) {
                return false;
            }
        } else if (!num3.equals(portalConnectionOptions.receiveTimeout)) {
            return false;
        }
        Integer num4 = this.requestTimeout;
        if (num4 == null) {
            if (portalConnectionOptions.requestTimeout != null) {
                return false;
            }
        } else if (!num4.equals(portalConnectionOptions.requestTimeout)) {
            return false;
        }
        return true;
    }

    public String getAccountGUID() {
        return NativeTools.BytesToString(this.accountGUID);
    }

    public String getAppId() {
        return NativeTools.BytesToString(this.appId);
    }

    public String getAppName() {
        return NativeTools.BytesToString(this.appName);
    }

    public String getCallbackUrl() {
        return NativeTools.BytesToString(this.callbackUrl);
    }

    public String getClientId() {
        return NativeTools.BytesToString(this.clientId);
    }

    public String getClientSecret() {
        return NativeTools.BytesToString(this.clientSecret);
    }

    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    public String getDeviceId() {
        return NativeTools.BytesToString(this.deviceId);
    }

    public String getDeviceName() {
        return NativeTools.BytesToString(this.deviceName);
    }

    public boolean getFastConnectionMode() {
        return this.fastConnectionMode;
    }

    public String getFastConnectionUniqueId() {
        return NativeTools.BytesToString(this.fastConnectionModeBridgeId);
    }

    public Integer getMaxRetryCount() {
        return this.maxRetryCount;
    }

    public Integer getReceiveTimeout() {
        return this.receiveTimeout;
    }

    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public int hashCode() {
        int iN = k.n(this.clientSecret, k.n(this.clientId, k.n(this.callbackUrl, k.n(this.appName, k.n(this.appId, k.n(this.accountGUID, 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.connectTimeout;
        int iN2 = k.n(this.fastConnectionModeBridgeId, (k.n(this.deviceName, k.n(this.deviceId, (iN + (num == null ? 0 : num.hashCode())) * 31, 31), 31) + (this.fastConnectionMode ? 1231 : 1237)) * 31, 31);
        Integer num2 = this.maxRetryCount;
        int iHashCode = (iN2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.receiveTimeout;
        int iHashCode2 = (iHashCode + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.requestTimeout;
        return iHashCode2 + (num4 != null ? num4.hashCode() : 0);
    }

    public void setAccountGUID(String str) {
        this.accountGUID = NativeTools.StringToBytes(str);
    }

    public void setAppId(String str) {
        this.appId = NativeTools.StringToBytes(str);
    }

    public void setAppName(String str) {
        this.appName = NativeTools.StringToBytes(str);
    }

    public void setCallbackUrl(String str) {
        this.callbackUrl = NativeTools.StringToBytes(str);
    }

    public void setClientId(String str) {
        this.clientId = NativeTools.StringToBytes(str);
    }

    public void setClientSecret(String str) {
        this.clientSecret = NativeTools.StringToBytes(str);
    }

    public void setConnectTimeout(Integer num) {
        this.connectTimeout = num;
    }

    public void setDeviceId(String str) {
        this.deviceId = NativeTools.StringToBytes(str);
    }

    public void setDeviceName(String str) {
        this.deviceName = NativeTools.StringToBytes(str);
    }

    public void setMaxRetryCount(Integer num) {
        this.maxRetryCount = num;
    }

    public void setReceiveTimeout(Integer num) {
        this.receiveTimeout = num;
    }

    public void setRequestTimeout(Integer num) {
        this.requestTimeout = num;
    }
}
