package com.philips.lighting.hue.sdk.wrapper.domain.clip;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;

/* JADX INFO: loaded from: classes.dex */
public class ClipConditionAttribute {
    private byte[] clipAttribute;
    private ClipDataType dataType;

    private ClipConditionAttribute(byte[] bArr, int i) {
        this.clipAttribute = bArr;
        this.dataType = ClipDataType.fromValue(i);
    }

    private void setDataTypeFromInt(int i) {
        this.dataType = ClipDataType.fromValue(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClipConditionAttribute clipConditionAttribute = (ClipConditionAttribute) obj;
        byte[] bArr = this.clipAttribute;
        if (bArr == null) {
            if (clipConditionAttribute.clipAttribute != null) {
                return false;
            }
        } else if (!bArr.equals(clipConditionAttribute.clipAttribute)) {
            return false;
        }
        return this.dataType == clipConditionAttribute.dataType;
    }

    public String getClipAttribute() {
        return NativeTools.BytesToString(this.clipAttribute);
    }

    public ClipDataType getDataType() {
        return this.dataType;
    }

    public int hashCode() {
        byte[] bArr = this.clipAttribute;
        int iHashCode = ((bArr == null ? 0 : bArr.hashCode()) + 31) * 31;
        ClipDataType clipDataType = this.dataType;
        return iHashCode + (clipDataType != null ? clipDataType.hashCode() : 0);
    }
}
