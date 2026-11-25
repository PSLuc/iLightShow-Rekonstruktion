package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.HueError;
import com.philips.lighting.hue.sdk.wrapper.uicallback.CallbackWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class RequestCallback extends CallbackWrapper implements RequestInternalCallback {
    public abstract void onCallback(List<HueError> list, HueHTTPResponse hueHTTPResponse);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.RequestInternalCallback
    public final void onInternalCallback(final List<HueError> list, final HueHTTPResponse hueHTTPResponse) {
        post(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.connection.RequestCallback.1
            @Override // java.lang.Runnable
            public void run() {
                RequestCallback.this.onCallback(list, hueHTTPResponse);
            }
        });
    }
}
