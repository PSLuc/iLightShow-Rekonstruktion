package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class LocalBridgeConnectionOptions implements BridgeConnectionOptions {
    private byte[] appName;
    private BridgeConnectionProtocol bridgeConnectionProtocol;
    private Integer connectTimeout;
    private byte[] connectionIp;
    private byte[] deviceName;
    private boolean fastConnectionMode;
    private byte[] fastConnectionModeBridgeId;
    private Integer maxRetryCount;
    private boolean queueEnabled;
    private Integer receiveTimeout;
    private Integer requestTimeout;
    private byte[] userName;

    private LocalBridgeConnectionOptions() {
        this.connectTimeout = null;
        this.receiveTimeout = null;
        this.requestTimeout = null;
        this.maxRetryCount = null;
        this.fastConnectionMode = false;
        this.fastConnectionModeBridgeId = null;
        this.bridgeConnectionProtocol = BridgeConnectionProtocol.PREFER_HTTPS;
    }

    private static String buildConnectionString(String str, String str2, Integer num, String str3, String... strArr) {
        String str4 = num == null ? str + "://" + str2 + "/api" : String.format("%s://%s:%i/api", str, str2, num);
        if (str3 != null) {
            str4 = str4 + "/" + str3;
        }
        if (strArr != null && strArr.length != 0) {
            for (String str5 : strArr) {
                if (str5 != null) {
                    str4 = str4 + "/" + str5;
                }
            }
        }
        return str4;
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
        LocalBridgeConnectionOptions localBridgeConnectionOptions = (LocalBridgeConnectionOptions) obj;
        if (!Arrays.equals(this.appName, localBridgeConnectionOptions.appName)) {
            return false;
        }
        Integer num = this.connectTimeout;
        if (num == null) {
            if (localBridgeConnectionOptions.connectTimeout != null) {
                return false;
            }
        } else if (!num.equals(localBridgeConnectionOptions.connectTimeout)) {
            return false;
        }
        if (!Arrays.equals(this.connectionIp, localBridgeConnectionOptions.connectionIp) || !Arrays.equals(this.deviceName, localBridgeConnectionOptions.deviceName) || this.fastConnectionMode != localBridgeConnectionOptions.fastConnectionMode || !Arrays.equals(this.fastConnectionModeBridgeId, localBridgeConnectionOptions.fastConnectionModeBridgeId)) {
            return false;
        }
        Integer num2 = this.maxRetryCount;
        if (num2 == null) {
            if (localBridgeConnectionOptions.maxRetryCount != null) {
                return false;
            }
        } else if (!num2.equals(localBridgeConnectionOptions.maxRetryCount)) {
            return false;
        }
        if (this.queueEnabled != localBridgeConnectionOptions.queueEnabled) {
            return false;
        }
        Integer num3 = this.receiveTimeout;
        if (num3 == null) {
            if (localBridgeConnectionOptions.receiveTimeout != null) {
                return false;
            }
        } else if (!num3.equals(localBridgeConnectionOptions.receiveTimeout)) {
            return false;
        }
        Integer num4 = this.requestTimeout;
        if (num4 == null) {
            if (localBridgeConnectionOptions.requestTimeout != null) {
                return false;
            }
        } else if (!num4.equals(localBridgeConnectionOptions.requestTimeout)) {
            return false;
        }
        return Arrays.equals(this.userName, localBridgeConnectionOptions.userName) && this.bridgeConnectionProtocol == localBridgeConnectionOptions.bridgeConnectionProtocol;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public String getAppName() {
        return NativeTools.BytesToString(this.appName);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    public String getConnectionIp() {
        return NativeTools.BytesToString(this.connectionIp);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public BridgeConnectionType getConnectionType() {
        return BridgeConnectionType.LOCAL;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public int getConnectionTypeAsInt() {
        return getConnectionType().getValue();
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

    public BridgeConnectionProtocol getProtocol() {
        return this.bridgeConnectionProtocol;
    }

    public String getPushlinkConnectionString() {
        return buildConnectionString(this.bridgeConnectionProtocol.toString(), getConnectionIp(), null, null, new String[0]);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public Integer getReceiveTimeout() {
        return this.receiveTimeout;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public String getUserName() {
        return NativeTools.BytesToString(this.userName);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public int hashCode() {
        int iN = k.n(this.appName, 31, 31);
        Integer num = this.connectTimeout;
        int i = 1237;
        int iN2 = k.n(this.fastConnectionModeBridgeId, (k.n(this.deviceName, k.n(this.connectionIp, (iN + (num == null ? 0 : num.hashCode())) * 31, 31), 31) + (this.fastConnectionMode ? 1231 : 1237)) * 31, 31);
        Integer num2 = this.maxRetryCount;
        int iHashCode = (((iN2 + (num2 == null ? 0 : num2.hashCode())) * 31) + (this.queueEnabled ? 1231 : 1237)) * 31;
        Integer num3 = this.receiveTimeout;
        int iHashCode2 = (iHashCode + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.requestTimeout;
        int iN3 = k.n(this.userName, (iHashCode2 + (num4 != null ? num4.hashCode() : 0)) * 31, 31);
        BridgeConnectionProtocol bridgeConnectionProtocol = this.bridgeConnectionProtocol;
        if (bridgeConnectionProtocol == BridgeConnectionProtocol.HTTPS) {
            i = 1231;
        } else if (bridgeConnectionProtocol != BridgeConnectionProtocol.PREFER_HTTPS) {
            i = 1249;
        }
        return iN3 + i;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public boolean isQueueEnabled() {
        return this.queueEnabled;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setAppName(String str) {
        this.appName = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setConnectTimeout(Integer num) {
        this.connectTimeout = num;
    }

    public void setConnectionIp(String str) {
        this.connectionIp = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setDeviceName(String str) {
        this.deviceName = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setMaxRetryCount(Integer num) {
        this.maxRetryCount = num;
    }

    public void setProtocol(BridgeConnectionProtocol bridgeConnectionProtocol) {
        this.bridgeConnectionProtocol = bridgeConnectionProtocol;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setReceiveTimeout(Integer num) {
        this.receiveTimeout = num;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setRequestTimeout(Integer num) {
        this.requestTimeout = num;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionOptions
    public void setUserName(String str) {
        this.userName = NativeTools.StringToBytes(str);
    }

    public LocalBridgeConnectionOptions(String str, String str2, String str3) {
        this(str, str2, str3, BridgeConnectionProtocol.PREFER_HTTPS);
    }

    public LocalBridgeConnectionOptions(String str, String str2, String str3, BridgeConnectionProtocol bridgeConnectionProtocol) {
        this.connectTimeout = null;
        this.receiveTimeout = null;
        this.requestTimeout = null;
        this.maxRetryCount = null;
        this.fastConnectionMode = false;
        this.fastConnectionModeBridgeId = null;
        this.bridgeConnectionProtocol = BridgeConnectionProtocol.PREFER_HTTPS;
        setConnectionIp(str);
        setUserName(null);
        setAppName(str2);
        setDeviceName(str3);
        this.bridgeConnectionProtocol = bridgeConnectionProtocol;
    }

    public LocalBridgeConnectionOptions(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, BridgeConnectionProtocol.PREFER_HTTPS);
    }

    public LocalBridgeConnectionOptions(String str, String str2, String str3, String str4, BridgeConnectionProtocol bridgeConnectionProtocol) {
        this.connectTimeout = null;
        this.receiveTimeout = null;
        this.requestTimeout = null;
        this.maxRetryCount = null;
        this.fastConnectionMode = false;
        this.fastConnectionModeBridgeId = null;
        this.bridgeConnectionProtocol = BridgeConnectionProtocol.PREFER_HTTPS;
        setConnectionIp(str);
        setUserName(str4);
        setAppName(str2);
        setDeviceName(str3);
        this.bridgeConnectionProtocol = bridgeConnectionProtocol;
    }
}
