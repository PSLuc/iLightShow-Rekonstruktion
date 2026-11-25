package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class RemoteBridgeConnectionOptions implements BridgeConnectionOptions {
    private byte[] accountGUID;
    private byte[] appId;
    private byte[] appName;
    private byte[] bridgeId;
    private byte[] callbackUrl;
    private byte[] clientId;
    private byte[] clientSecret;
    private byte[] deviceId;
    private byte[] deviceName;
    private boolean queueEnabled;
    private byte[] userName;
    private Integer connectTimeout = null;
    private Integer receiveTimeout = null;
    private Integer requestTimeout = null;
    private Integer maxRetryCount = null;
    private boolean fastConnectionMode = false;
    private byte[] fastConnectionModeBridgeId = null;

    private RemoteBridgeConnectionOptions() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void disableFastConnectionMode() {
        this.fastConnectionMode = false;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void enableFastConnectionMode(String str) {
        this.fastConnectionMode = true;
        this.fastConnectionModeBridgeId = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void enableQueue(boolean z5) {
        this.queueEnabled = z5;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoteBridgeConnectionOptions remoteBridgeConnectionOptions = (RemoteBridgeConnectionOptions) obj;
        if (!Arrays.equals(this.accountGUID, remoteBridgeConnectionOptions.accountGUID) || !Arrays.equals(this.appId, remoteBridgeConnectionOptions.appId) || !Arrays.equals(this.appName, remoteBridgeConnectionOptions.appName) || !Arrays.equals(this.bridgeId, remoteBridgeConnectionOptions.bridgeId) || !Arrays.equals(this.callbackUrl, remoteBridgeConnectionOptions.callbackUrl) || !Arrays.equals(this.clientId, remoteBridgeConnectionOptions.clientId) || !Arrays.equals(this.clientSecret, remoteBridgeConnectionOptions.clientSecret)) {
            return false;
        }
        Integer num = this.connectTimeout;
        if (num == null) {
            if (remoteBridgeConnectionOptions.connectTimeout != null) {
                return false;
            }
        } else if (!num.equals(remoteBridgeConnectionOptions.connectTimeout)) {
            return false;
        }
        if (!Arrays.equals(this.deviceId, remoteBridgeConnectionOptions.deviceId) || !Arrays.equals(this.deviceName, remoteBridgeConnectionOptions.deviceName) || this.fastConnectionMode != remoteBridgeConnectionOptions.fastConnectionMode || !Arrays.equals(this.fastConnectionModeBridgeId, remoteBridgeConnectionOptions.fastConnectionModeBridgeId)) {
            return false;
        }
        Integer num2 = this.maxRetryCount;
        if (num2 == null) {
            if (remoteBridgeConnectionOptions.maxRetryCount != null) {
                return false;
            }
        } else if (!num2.equals(remoteBridgeConnectionOptions.maxRetryCount)) {
            return false;
        }
        if (this.queueEnabled != remoteBridgeConnectionOptions.queueEnabled) {
            return false;
        }
        Integer num3 = this.receiveTimeout;
        if (num3 == null) {
            if (remoteBridgeConnectionOptions.receiveTimeout != null) {
                return false;
            }
        } else if (!num3.equals(remoteBridgeConnectionOptions.receiveTimeout)) {
            return false;
        }
        Integer num4 = this.requestTimeout;
        if (num4 == null) {
            if (remoteBridgeConnectionOptions.requestTimeout != null) {
                return false;
            }
        } else if (!num4.equals(remoteBridgeConnectionOptions.requestTimeout)) {
            return false;
        }
        return Arrays.equals(this.userName, remoteBridgeConnectionOptions.userName);
    }

    public String getAccountGUID() {
        return NativeTools.BytesToString(this.accountGUID);
    }

    public String getAppId() {
        return NativeTools.BytesToString(this.appId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
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

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public BridgeConnectionType getConnectionType() {
        return BridgeConnectionType.REMOTE;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public int getConnectionTypeAsInt() {
        return getConnectionType().getValue();
    }

    public String getDeviceId() {
        return NativeTools.BytesToString(this.deviceId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public String getDeviceName() {
        return NativeTools.BytesToString(this.deviceName);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public boolean getFastConnectionMode() {
        return this.fastConnectionMode;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public String getFastConnectionUniqueId() {
        return NativeTools.BytesToString(this.fastConnectionModeBridgeId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public Integer getMaxRetryCount() {
        return this.maxRetryCount;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public Integer getReceiveTimeout() {
        return this.receiveTimeout;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public String getUniqueId() {
        return NativeTools.BytesToString(this.bridgeId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public String getUserName() {
        return NativeTools.BytesToString(this.userName);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public int hashCode() {
        int iN = k.n(this.clientSecret, k.n(this.clientId, k.n(this.callbackUrl, k.n(this.bridgeId, k.n(this.appName, k.n(this.appId, k.n(this.accountGUID, 31, 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.connectTimeout;
        int iN2 = k.n(this.fastConnectionModeBridgeId, (k.n(this.deviceName, k.n(this.deviceId, (iN + (num == null ? 0 : num.hashCode())) * 31, 31), 31) + (this.fastConnectionMode ? 1231 : 1237)) * 31, 31);
        Integer num2 = this.maxRetryCount;
        int iHashCode = (((iN2 + (num2 == null ? 0 : num2.hashCode())) * 31) + (this.queueEnabled ? 1231 : 1237)) * 31;
        Integer num3 = this.receiveTimeout;
        int iHashCode2 = (iHashCode + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.requestTimeout;
        return Arrays.hashCode(this.userName) + ((iHashCode2 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public boolean isQueueEnabled() {
        return this.queueEnabled;
    }

    public void setAccountGUID(String str) {
        this.accountGUID = NativeTools.StringToBytes(str);
    }

    public void setAppId(String str) {
        this.appId = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
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

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setConnectTimeout(Integer num) {
        this.connectTimeout = num;
    }

    public void setDeviceId(String str) {
        this.deviceId = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setDeviceName(String str) {
        this.deviceName = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setMaxRetryCount(Integer num) {
        this.maxRetryCount = num;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setReceiveTimeout(Integer num) {
        this.receiveTimeout = num;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setRequestTimeout(Integer num) {
        this.requestTimeout = num;
    }

    public void setUniqueId(String str) {
        this.bridgeId = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setUserName(String str) {
        this.userName = NativeTools.StringToBytes(str);
    }

    public RemoteBridgeConnectionOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        setAccountGUID(str2);
        setUniqueId(str);
        setCallbackUrl(str3);
        setUserName(str4);
        setAppId(str9);
        setAppName(str7);
        setDeviceId(str10);
        setDeviceName(str8);
        setClientId(str5);
        setClientSecret(str6);
    }

    public RemoteBridgeConnectionOptions(String str, PortalConnectionOptions portalConnectionOptions) {
        setUniqueId(str);
        setAccountGUID(portalConnectionOptions.getAccountGUID());
        setCallbackUrl(portalConnectionOptions.getCallbackUrl());
        setAppId(portalConnectionOptions.getAppId());
        setAppName(portalConnectionOptions.getAppName());
        setDeviceId(portalConnectionOptions.getDeviceId());
        setDeviceName(portalConnectionOptions.getDeviceName());
        setClientId(portalConnectionOptions.getClientId());
        setClientSecret(portalConnectionOptions.getClientSecret());
    }
}
