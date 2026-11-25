package com.philips.lighting.hue.sdk.wrapper.domain.clip;

import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightState;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.SensorState;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.Scene;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class ClipAction {
    private byte[] address;
    private byte[] body;
    private byte[] method;
    private byte[] username = null;
    private ClipActionType actionType = ClipActionType.UNKNOWN;
    private Device device = null;
    private BridgeResource resource = null;
    private Object bodyObject = null;
    private DomainType bodyObjectType = DomainType.UNKNOWN;

    public ClipAction() {
    }

    private void setActionTypeFromInt(int i) {
        this.actionType = ClipActionType.fromValue(i);
    }

    private void setBodyObjectTypeFromInt(int i) {
        this.bodyObjectType = DomainType.fromValue(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClipAction clipAction = (ClipAction) obj;
        if (this.actionType != clipAction.actionType || !Arrays.equals(this.address, clipAction.address) || !Arrays.equals(this.body, clipAction.body)) {
            return false;
        }
        Object obj2 = this.bodyObject;
        if (obj2 == null) {
            if (clipAction.bodyObject != null) {
                return false;
            }
        } else if (!obj2.equals(clipAction.bodyObject)) {
            return false;
        }
        if (this.bodyObjectType != clipAction.bodyObjectType) {
            return false;
        }
        Device device = this.device;
        if (device == null) {
            if (clipAction.device != null) {
                return false;
            }
        } else if (!device.equals(clipAction.device)) {
            return false;
        }
        if (!Arrays.equals(this.method, clipAction.method)) {
            return false;
        }
        BridgeResource bridgeResource = this.resource;
        if (bridgeResource == null) {
            if (clipAction.resource != null) {
                return false;
            }
        } else if (!bridgeResource.equals(clipAction.resource)) {
            return false;
        }
        return Arrays.equals(this.username, clipAction.username);
    }

    public ClipActionType getActionType() {
        return this.actionType;
    }

    public String getAddress() {
        return NativeTools.BytesToString(this.address);
    }

    public String getBody() {
        return NativeTools.BytesToString(this.body);
    }

    public LightState getBodyObjectAsLightState() {
        if (this.bodyObjectType == DomainType.LIGHT_STATE) {
            return (LightState) this.bodyObject;
        }
        return null;
    }

    public Scene getBodyObjectAsScene() {
        if (this.bodyObjectType == DomainType.SCENE) {
            return (Scene) this.bodyObject;
        }
        return null;
    }

    public SensorState getBodyObjectAsSensorState() {
        if (this.bodyObjectType == DomainType.SENSOR_STATE) {
            return (SensorState) this.bodyObject;
        }
        return null;
    }

    public Device getDevice() {
        return this.device;
    }

    public String getMethod() {
        return NativeTools.BytesToString(this.method);
    }

    public BridgeResource getResource() {
        return this.resource;
    }

    public String getUsername() {
        return NativeTools.BytesToString(this.username);
    }

    public int hashCode() {
        ClipActionType clipActionType = this.actionType;
        int iN = k.n(this.body, k.n(this.address, ((clipActionType == null ? 0 : clipActionType.hashCode()) + 31) * 31, 31), 31);
        Object obj = this.bodyObject;
        int iHashCode = (iN + (obj == null ? 0 : obj.hashCode())) * 31;
        DomainType domainType = this.bodyObjectType;
        int iHashCode2 = (iHashCode + (domainType == null ? 0 : domainType.hashCode())) * 31;
        Device device = this.device;
        int iN2 = k.n(this.method, (iHashCode2 + (device == null ? 0 : device.hashCode())) * 31, 31);
        BridgeResource bridgeResource = this.resource;
        return Arrays.hashCode(this.username) + ((iN2 + (bridgeResource != null ? bridgeResource.hashCode() : 0)) * 31);
    }

    public void setAddress(String str) {
        this.address = NativeTools.StringToBytes(str);
    }

    public void setBody(String str) {
        this.body = NativeTools.StringToBytes(str);
    }

    public void setMethod(String str) {
        this.method = NativeTools.StringToBytes(str);
    }

    public ClipAction(String str, String str2, String str3) {
        setAddress(str);
        setMethod(str2);
        setBody(str3);
    }
}
