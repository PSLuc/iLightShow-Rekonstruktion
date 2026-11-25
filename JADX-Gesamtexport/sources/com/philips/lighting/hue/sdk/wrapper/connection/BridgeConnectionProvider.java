package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;

/* JADX INFO: loaded from: classes.dex */
public class BridgeConnectionProvider {

    /* JADX INFO: renamed from: com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType;

        static {
            int[] iArr = new int[BridgeConnectionType.values().length];
            $SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType = iArr;
            try {
                iArr[BridgeConnectionType.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType[BridgeConnectionType.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static BridgeConnection getBridgeConnection(BridgeConnectionOptions bridgeConnectionOptions, Bridge bridge) {
        BridgeConnection localBridgeConnection;
        BridgeConnection bridgeConnection;
        int i = AnonymousClass1.$SwitchMap$com$philips$lighting$hue$sdk$wrapper$connection$BridgeConnectionType[bridgeConnectionOptions.getConnectionType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                bridgeConnection = null;
            } else {
                localBridgeConnection = new RemoteBridgeConnection((RemoteBridgeConnectionOptions) bridgeConnectionOptions);
            }
            bridge.addBridgeConnection(bridgeConnection);
            return bridgeConnection;
        }
        localBridgeConnection = new LocalBridgeConnection((LocalBridgeConnectionOptions) bridgeConnectionOptions);
        bridgeConnection = localBridgeConnection;
        bridge.addBridgeConnection(bridgeConnection);
        return bridgeConnection;
    }
}
