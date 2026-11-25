package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.HueError;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipResponse;
import com.philips.lighting.hue.sdk.wrapper.uicallback.CallbackWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BridgeResponseCallback extends CallbackWrapper implements BridgeResponseInternalCallback {
    public abstract void handleCallback(Bridge bridge, ReturnCode returnCode, List<ClipResponse> list, List<HueError> list2);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseInternalCallback
    public final void handleInternalCallback(final Bridge bridge, final ReturnCode returnCode, final List<ClipResponse> list, final List<HueError> list2) {
        post(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback.1
            @Override // java.lang.Runnable
            public void run() {
                BridgeResponseCallback.this.handleCallback(bridge, returnCode, list, list2);
            }
        });
    }
}
