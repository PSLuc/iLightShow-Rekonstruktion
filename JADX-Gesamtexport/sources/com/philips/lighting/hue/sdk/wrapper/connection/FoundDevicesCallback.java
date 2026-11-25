package com.philips.lighting.hue.sdk.wrapper.connection;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.HueError;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.uicallback.CallbackWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class FoundDevicesCallback extends CallbackWrapper implements FoundDevicesInternalCallback {
    private ReturnCode status = ReturnCode.SUCCESS;

    public ReturnCode getStatus() {
        return this.status;
    }

    public abstract void onDeviceSearchFinished(Bridge bridge, List<HueError> list);

    public abstract void onDevicesFound(Bridge bridge, List<Device> list, List<HueError> list2);

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.FoundDevicesInternalCallback
    public final void onInternalDeviceSearchFinished(final Bridge bridge, final List<HueError> list) {
        if (!list.isEmpty()) {
            this.status = ReturnCode.ERROR;
        }
        post(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.connection.FoundDevicesCallback.2
            @Override // java.lang.Runnable
            public void run() {
                FoundDevicesCallback.this.onDeviceSearchFinished(bridge, list);
            }
        });
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.connection.FoundDevicesInternalCallback
    public final void onInternalDevicesFound(final Bridge bridge, final List<Device> list, final List<HueError> list2) {
        post(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.connection.FoundDevicesCallback.1
            @Override // java.lang.Runnable
            public void run() {
                FoundDevicesCallback.this.onDevicesFound(bridge, list, list2);
            }
        });
    }
}
