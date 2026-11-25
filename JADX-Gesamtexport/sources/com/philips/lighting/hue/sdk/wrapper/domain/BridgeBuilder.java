package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionProtocol;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BridgeBuilder extends WrapperObject {
    private BridgeConnectionCallback _bridgeConnectionCallback = null;
    private List<BridgeStateUpdatedCallback> _bridgeStateUpdatedCallbacks;

    public BridgeBuilder(String str, String str2) {
        create(str, str2);
        this._bridgeStateUpdatedCallbacks = new ArrayList();
    }

    private native Bridge buildNative();

    @Deprecated
    public BridgeBuilder addBridgeStateUpdatedCallback(BridgeStateUpdatedCallback bridgeStateUpdatedCallback) {
        this._bridgeStateUpdatedCallbacks.add(bridgeStateUpdatedCallback);
        return this;
    }

    public Bridge build() {
        Bridge bridgeBuildNative = buildNative();
        bridgeBuildNative.setBridgeConnectionCallback(this._bridgeConnectionCallback);
        Iterator<BridgeStateUpdatedCallback> it = this._bridgeStateUpdatedCallbacks.iterator();
        while (it.hasNext()) {
            bridgeBuildNative.addBridgeStateUpdatedCallback(it.next());
        }
        return bridgeBuildNative;
    }

    public native void create(String str, String str2);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Deprecated
    public BridgeBuilder setBridgeConnectionCallback(BridgeConnectionCallback bridgeConnectionCallback) {
        this._bridgeConnectionCallback = bridgeConnectionCallback;
        return this;
    }

    public native BridgeBuilder setBridgeConnectionProtocol(BridgeConnectionProtocol bridgeConnectionProtocol);

    public native BridgeBuilder setBridgeId(String str);

    public native BridgeBuilder setClientKey(String str);

    public native BridgeBuilder setConnectionType(BridgeConnectionType bridgeConnectionType);

    public native BridgeBuilder setFastConnectionMode(boolean z5);

    public native BridgeBuilder setForbidLoadPersistence(boolean z5);

    public native BridgeBuilder setForbidStorePersistence(boolean z5);

    public native BridgeBuilder setIpAddress(String str);

    public native BridgeBuilder setUserName(String str);

    public native BridgeBuilder setupRemote(String str, String str2, String str3, String str4, String str5, String str6);

    public BridgeBuilder(WrapperObject.Scope scope) {
    }
}
