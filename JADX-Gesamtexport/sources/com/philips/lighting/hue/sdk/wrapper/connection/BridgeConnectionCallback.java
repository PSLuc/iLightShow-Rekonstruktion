package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.HueError;
import com.philips.lighting.hue.sdk.wrapper.uicallback.CallbackWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BridgeConnectionCallback extends CallbackWrapper implements BridgeConnectionInternalCallback {
    public abstract void onConnectionError(BridgeConnection bridgeConnection, List<HueError> list);

    public abstract void onConnectionEvent(BridgeConnection bridgeConnection, ConnectionEvent connectionEvent);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionInternalCallback
    public final void onInternalConnectionError(final BridgeConnection bridgeConnection, final List<HueError> list) {
        post(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionCallback.2
            @Override // java.lang.Runnable
            public void run() {
                BridgeConnectionCallback.this.onConnectionError(bridgeConnection, list);
            }
        });
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionInternalCallback
    public final void onInternalConnectionEvent(final BridgeConnection bridgeConnection, final ConnectionEvent connectionEvent) {
        post(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionCallback.1
            @Override // java.lang.Runnable
            public void run() {
                BridgeConnectionCallback.this.onConnectionEvent(bridgeConnection, connectionEvent);
            }
        });
    }
}
