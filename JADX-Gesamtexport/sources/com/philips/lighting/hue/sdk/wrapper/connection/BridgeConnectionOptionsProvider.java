package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public class BridgeConnectionOptionsProvider {
    public static LocalBridgeConnectionOptions provideLocalConnectionOptions(String str, String str2, String str3, BridgeConnectionProtocol bridgeConnectionProtocol) {
        return new LocalBridgeConnectionOptions(str, str2, str3, bridgeConnectionProtocol);
    }

    public static LocalBridgeConnectionOptions provideLocalConnectionOptions(String str, String str2, String str3) {
        return new LocalBridgeConnectionOptions(str, str2, str3, BridgeConnectionProtocol.HTTP);
    }
}
