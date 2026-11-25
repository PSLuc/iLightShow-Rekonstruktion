package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.HueError;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipResponse;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface BridgeResponseInternalCallback {
    void handleInternalCallback(Bridge bridge, ReturnCode returnCode, List<ClipResponse> list, List<HueError> list2);
}
