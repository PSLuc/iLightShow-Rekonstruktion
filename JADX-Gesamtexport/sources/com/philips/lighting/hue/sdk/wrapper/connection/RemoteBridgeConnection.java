package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;

/* JADX INFO: loaded from: classes.dex */
public class RemoteBridgeConnection extends SessionObject implements BridgeConnection {
    private BridgeConnectionOptions bridgeConnectionOptions;
    private HeartbeatManager heartbeatManager;
    private OAuthTokenPair tokenPair;

    /* JADX INFO: renamed from: com.philips.lighting.hue.sdk.wrapper.connection.RemoteBridgeConnection$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType;

        static {
            int[] iArr = new int[BridgeConnectionType.values().length];
            $SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType = iArr;
            try {
                iArr[BridgeConnectionType.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private RemoteBridgeConnection(long j4) {
        super(j4);
    }

    private native int connectNative();

    private native int getStateNative();

    private native int invalidateAuthorizationNative();

    private native void setAccessTokensNative(String str, String str2);

    private native int setAuthorizationUrlNative(String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public ReturnCode connect() {
        return ReturnCode.fromValue(connectNative());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native void disconnect();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native HueHTTPRequest doDelete(String str, RequestCallback requestCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native HueHTTPRequest doGet(String str, RequestCallback requestCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native HueHTTPRequest doPost(String str, String str2, RequestCallback requestCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native HueHTTPRequest doPut(String str, String str2, RequestCallback requestCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native Bridge getBridge();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public BridgeConnectionOptions getConnectionOptions() {
        getConnectionOptionsNative();
        return this.bridgeConnectionOptions;
    }

    public native void getConnectionOptionsNative();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public BridgeConnectionType getConnectionType() {
        return BridgeConnectionType.REMOTE;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public HeartbeatManager getHeartbeatManager() {
        return this.heartbeatManager;
    }

    public native String getLoginURL();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public ConnectionState getState() {
        return ConnectionState.fromValue(getStateNative());
    }

    public ReturnCode invalidateAuthorization() {
        return ReturnCode.fromValue(invalidateAuthorizationNative());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native boolean isAuthenticated();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native boolean isConnected();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public boolean matchesConnectionType(BridgeConnectionType bridgeConnectionType) {
        return AnonymousClass1.$SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType[bridgeConnectionType.ordinal()] != 1;
    }

    @Deprecated
    public void setAccessTokens(OAuthTokenPair oAuthTokenPair) {
        this.tokenPair = oAuthTokenPair;
        setAccessTokensNative(oAuthTokenPair.getAccessToken(), this.tokenPair.getRefreshToken());
    }

    public ReturnCode setAuthorizationUrl(String str) {
        return ReturnCode.fromValue(setAuthorizationUrlNative(str));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native void setBridgeConnectionCallback(BridgeConnectionCallback bridgeConnectionCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public void setConnectionOptions(BridgeConnectionOptions bridgeConnectionOptions) {
        this.bridgeConnectionOptions = (RemoteBridgeConnectionOptions) bridgeConnectionOptions;
        setConnectionOptionsNative();
    }

    public native void setConnectionOptionsNative();

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public native void syncNative();

    public RemoteBridgeConnection(RemoteBridgeConnectionOptions remoteBridgeConnectionOptions) {
        this.bridgeConnectionOptions = remoteBridgeConnectionOptions;
    }
}
