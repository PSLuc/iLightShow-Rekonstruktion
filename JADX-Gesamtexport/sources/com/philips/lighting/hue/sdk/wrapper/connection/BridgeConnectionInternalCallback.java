package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.HueError;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface BridgeConnectionInternalCallback {
    void onInternalConnectionError(BridgeConnection bridgeConnection, List<HueError> list);

    void onInternalConnectionEvent(BridgeConnection bridgeConnection, ConnectionEvent connectionEvent);
}
