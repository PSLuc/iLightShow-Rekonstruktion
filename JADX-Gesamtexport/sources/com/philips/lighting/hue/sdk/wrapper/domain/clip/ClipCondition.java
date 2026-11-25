package com.philips.lighting.hue.sdk.wrapper.domain.clip;

import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class ClipCondition {
    private byte[] address;
    private ClipConditionAttribute attribute;
    private Device device;
    private ClipConditionOperator operator;
    private BridgeResource resource;
    private byte[] value;

    public ClipCondition() {
        this.address = null;
        this.value = null;
        this.operator = ClipConditionOperator.NONE;
    }

    private int getOperatorAsInt() {
        ClipConditionOperator clipConditionOperator = this.operator;
        return clipConditionOperator != null ? clipConditionOperator.getValue() : ClipConditionOperator.UNKNOWN.getValue();
    }

    private void setOperatorFromInt(int i) {
        this.operator = ClipConditionOperator.fromValue(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClipCondition clipCondition = (ClipCondition) obj;
        if (!Arrays.equals(this.address, clipCondition.address)) {
            return false;
        }
        ClipConditionAttribute clipConditionAttribute = this.attribute;
        if (clipConditionAttribute == null) {
            if (clipCondition.attribute != null) {
                return false;
            }
        } else if (!clipConditionAttribute.equals(clipCondition.attribute)) {
            return false;
        }
        Device device = this.device;
        if (device == null) {
            if (clipCondition.device != null) {
                return false;
            }
        } else if (!device.equals(clipCondition.device)) {
            return false;
        }
        if (this.operator != clipCondition.operator) {
            return false;
        }
        BridgeResource bridgeResource = this.resource;
        if (bridgeResource == null) {
            if (clipCondition.resource != null) {
                return false;
            }
        } else if (!bridgeResource.equals(clipCondition.resource)) {
            return false;
        }
        return Arrays.equals(this.value, clipCondition.value);
    }

    public String getAddress() {
        return NativeTools.BytesToString(this.address);
    }

    public ClipConditionAttribute getAttribute() {
        return this.attribute;
    }

    public Device getDevice() {
        return this.device;
    }

    public ClipConditionOperator getOperator() {
        return this.operator;
    }

    public BridgeResource getResource() {
        return this.resource;
    }

    public String getValue() {
        return NativeTools.BytesToString(this.value);
    }

    public int hashCode() {
        int iN = k.n(this.address, 31, 31);
        ClipConditionAttribute clipConditionAttribute = this.attribute;
        int iHashCode = (iN + (clipConditionAttribute == null ? 0 : clipConditionAttribute.hashCode())) * 31;
        Device device = this.device;
        int iHashCode2 = (iHashCode + (device == null ? 0 : device.hashCode())) * 31;
        ClipConditionOperator clipConditionOperator = this.operator;
        int iHashCode3 = (iHashCode2 + (clipConditionOperator == null ? 0 : clipConditionOperator.hashCode())) * 31;
        BridgeResource bridgeResource = this.resource;
        return Arrays.hashCode(this.value) + ((iHashCode3 + (bridgeResource != null ? bridgeResource.hashCode() : 0)) * 31);
    }

    public void setAddress(String str) {
        this.address = NativeTools.StringToBytes(str);
    }

    public void setOperator(ClipConditionOperator clipConditionOperator) {
        this.operator = clipConditionOperator;
    }

    public void setValue(String str) {
        this.value = NativeTools.StringToBytes(str);
    }

    public ClipCondition(String str, ClipConditionOperator clipConditionOperator, String str2) {
        this.address = null;
        this.value = null;
        this.operator = ClipConditionOperator.NONE;
        setAddress(str);
        setValue(str2);
        this.operator = clipConditionOperator;
    }

    public ClipCondition(byte[] bArr, ClipConditionOperator clipConditionOperator, byte[] bArr2) {
        this.address = null;
        this.value = null;
        ClipConditionOperator clipConditionOperator2 = ClipConditionOperator.UNKNOWN;
        this.address = bArr;
        this.value = bArr2;
        this.operator = clipConditionOperator;
    }
}
