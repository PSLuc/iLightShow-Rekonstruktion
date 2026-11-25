package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.SDKError;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BridgeResponseDispatcher {
    private static final String MSG_INVALID_METHOD_CALL = "Invalid method call!";

    public static void dispatch(BridgeResponseCallback bridgeResponseCallback, Bridge bridge, ReturnCode returnCode) {
        if (bridgeResponseCallback != null) {
            List<ClipResponse> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new SDKError(returnCode.getValue(), MSG_INVALID_METHOD_CALL));
            bridgeResponseCallback.handleCallback(bridge, returnCode, arrayList, arrayList2);
        }
    }
}
