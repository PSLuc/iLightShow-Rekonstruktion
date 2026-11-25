package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;

/* JADX INFO: loaded from: classes.dex */
public class LocalBridgeConnection extends SessionObject implements BridgeConnection {
    private BridgeConnectionOptions bridgeConnectionOptions;
    private HeartbeatManager heartbeatManager;

    /* JADX INFO: renamed from: com.philips.lighting.hue.sdk.wrapper.connection.LocalBridgeConnection$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType;

        static {
            int[] iArr = new int[BridgeConnectionType.values().length];
            $SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType = iArr;
            try {
                iArr[BridgeConnectionType.REMOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private LocalBridgeConnection(long j4) {
        super(j4);
    }

    private native int connectNative();

    private native int getStateNative();

    private void setHeartbeatManager(HeartbeatManager heartbeatManager) {
        this.heartbeatManager = heartbeatManager;
    }

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
        return BridgeConnectionType.LOCAL;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public HeartbeatManager getHeartbeatManager() {
        return this.heartbeatManager;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public ConnectionState getState() {
        return ConnectionState.fromValue(getStateNative());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native boolean isAuthenticated();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native boolean isConnected();

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public boolean matchesConnectionType(BridgeConnectionType bridgeConnectionType) {
        return AnonymousClass1.$SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType[bridgeConnectionType.ordinal()] != 1;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public native void setBridgeConnectionCallback(BridgeConnectionCallback bridgeConnectionCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection
    public void setConnectionOptions(BridgeConnectionOptions bridgeConnectionOptions) {
        this.bridgeConnectionOptions = (LocalBridgeConnectionOptions) bridgeConnectionOptions;
        setConnectionOptionsNative();
    }

    public native void setConnectionOptionsNative();

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public native void syncNative();

    public LocalBridgeConnection(LocalBridgeConnectionOptions localBridgeConnectionOptions) {
        this.bridgeConnectionOptions = localBridgeConnectionOptions;
    }
}
