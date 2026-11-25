package com.philips.lighting.hue.sdk.wrapper.domain.resource.builder;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.domain.BridgeVersion;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipAction;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Group;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Scene;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ClipActionBuilder extends SessionObject {
    private static final String TAG = "ClipActionBuilder";

    public ClipActionBuilder() {
        constructNative();
    }

    private native void constructNative();

    private native void destroyNative();

    public native List<ClipAction> build(BridgeVersion bridgeVersion);

    public ClipAction buildSingle(BridgeVersion bridgeVersion) {
        List<ClipAction> listBuild = build(bridgeVersion);
        if (listBuild == null || listBuild.size() <= 0) {
            return null;
        }
        return listBuild.get(0);
    }

    public native ClipActionBuilder createResource(BridgeResource bridgeResource);

    public native ClipActionBuilder deleteDevice(Device device);

    public native ClipActionBuilder deleteResource(BridgeResource bridgeResource);

    public void finalize() throws Throwable {
        destroyNative();
        super.finalize();
    }

    public ClipActionBuilder recallScene(Scene scene) {
        if (scene != null) {
            return recallScene(scene.getIdentifier());
        }
        HueLog.e(TAG, "Scene is null, cannot build action");
        return this;
    }

    public native ClipActionBuilder recallSceneNative(byte[] bArr, byte[] bArr2);

    public ClipActionBuilder setGroupLightState(String str, LightState lightState) {
        return setGroupLightStateNative(NativeTools.StringToBytes(str), lightState);
    }

    public native ClipActionBuilder setGroupLightStateNative(byte[] bArr, LightState lightState);

    public ClipActionBuilder setUsername(String str) {
        return setUsernameNative(NativeTools.StringToBytes(str));
    }

    public native ClipActionBuilder setUsernameNative(byte[] bArr);

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    public native ClipActionBuilder updateDeviceConfiguration(Device device, DeviceConfiguration deviceConfiguration);

    public native ClipActionBuilder updateDeviceState(Device device, DeviceState deviceState);

    public native ClipActionBuilder updateResource(BridgeResource bridgeResource);

    public ClipActionBuilder setGroupLightState(Group group, LightState lightState) {
        return group != null ? setGroupLightState(group.getIdentifier(), lightState) : this;
    }

    public ClipActionBuilder recallScene(Scene scene, Group group) {
        String identifier;
        if (scene != null) {
            if (group != null) {
                identifier = group.getIdentifier();
            } else {
                HueLog.w(TAG, "Group was null. Will use group zero to build action");
                identifier = null;
            }
            return recallScene(scene.getIdentifier(), identifier);
        }
        HueLog.e(TAG, "Scene is null, cannot build action");
        return this;
    }

    public ClipActionBuilder recallScene(Scene scene, String str) {
        return recallScene(scene.getIdentifier(), str);
    }

    public ClipActionBuilder recallScene(String str, Group group) {
        return recallScene(str, group.getIdentifier());
    }

    public ClipActionBuilder recallScene(String str) {
        return recallScene(str, (String) null);
    }

    public ClipActionBuilder recallScene(String str, String str2) {
        return recallSceneNative(NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }
}
