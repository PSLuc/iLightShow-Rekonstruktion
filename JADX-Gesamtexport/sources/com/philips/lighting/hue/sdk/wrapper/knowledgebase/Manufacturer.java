package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;

/* JADX INFO: loaded from: classes.dex */
public class Manufacturer extends SDKSerializable {
    private byte[] identifier;
    private byte[] manufacturer;

    private Manufacturer(byte[] bArr, byte[] bArr2) {
        this.identifier = bArr;
        this.manufacturer = bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Manufacturer manufacturer = (Manufacturer) obj;
        byte[] bArr = this.identifier;
        if (bArr == null) {
            if (manufacturer.identifier != null) {
                return false;
            }
        } else if (!bArr.equals(manufacturer.identifier)) {
            return false;
        }
        byte[] bArr2 = this.manufacturer;
        if (bArr2 == null) {
            if (manufacturer.manufacturer != null) {
                return false;
            }
        } else if (!bArr2.equals(manufacturer.manufacturer)) {
            return false;
        }
        return true;
    }

    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public String getManufacturer() {
        return NativeTools.BytesToString(this.manufacturer);
    }

    public int hashCode() {
        byte[] bArr = this.identifier;
        int iHashCode = ((bArr == null ? 0 : bArr.hashCode()) + 31) * 31;
        byte[] bArr2 = this.manufacturer;
        return iHashCode + (bArr2 != null ? bArr2.hashCode() : 0);
    }
}
