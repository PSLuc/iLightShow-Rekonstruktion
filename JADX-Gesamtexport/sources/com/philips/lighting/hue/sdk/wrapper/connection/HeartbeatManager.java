package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public class HeartbeatManager extends SessionObject {
    private BridgeConnection connection;

    private HeartbeatManager(long j4, BridgeConnection bridgeConnection) {
        super(j4);
        this.connection = bridgeConnection;
    }

    private native int performOneHeartbeatNative(int i);

    private native int startHeartbeatNative(int i, int i3);

    private native int stopAllHeartbeatsNative();

    private native int stopHeartbeatNative(int i);

    public ReturnCode performOneHeartbeat(BridgeStateCacheType bridgeStateCacheType) {
        return ReturnCode.fromValue(performOneHeartbeatNative(bridgeStateCacheType.getValue()));
    }

    public native void setShouldUpdateBridgeState(boolean z5);

    public ReturnCode startHeartbeat(BridgeStateCacheType bridgeStateCacheType, int i) {
        return ReturnCode.fromValue(startHeartbeatNative(bridgeStateCacheType.getValue(), i));
    }

    public ReturnCode stopAllHeartbeats() {
        return ReturnCode.fromValue(stopAllHeartbeatsNative());
    }

    public ReturnCode stopHeartbeat(BridgeStateCacheType bridgeStateCacheType) {
        return bridgeStateCacheType.equals(BridgeStateCacheType.UNKNOWN) ? ReturnCode.WRONG_PARAMETER : ReturnCode.fromValue(stopHeartbeatNative(bridgeStateCacheType.getValue()));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        return "HeartbeatManager";
    }
}
