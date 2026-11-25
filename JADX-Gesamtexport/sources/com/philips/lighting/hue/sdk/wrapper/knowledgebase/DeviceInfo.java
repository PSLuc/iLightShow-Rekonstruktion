package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class DeviceInfo extends SDKSerializable {
    private byte[] friendlyName;
    private Manufacturer manufacturer;
    private byte[] productName;
    private boolean certified = false;
    private List<String> supportedFeatures = new ArrayList();

    private void setSupportedFeatures(String[] strArr) {
        this.supportedFeatures = new ArrayList(Arrays.asList(strArr));
    }

    public boolean equals(Object obj) {
        Manufacturer manufacturer;
        Manufacturer manufacturer2;
        List<String> list;
        List<String> list2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Arrays.equals(this.friendlyName, deviceInfo.friendlyName) && Arrays.equals(this.productName, deviceInfo.productName) && ((manufacturer = this.manufacturer) == (manufacturer2 = deviceInfo.manufacturer) || (manufacturer != null && manufacturer.equals(manufacturer2))) && (((list = this.supportedFeatures) == (list2 = deviceInfo.supportedFeatures) || (list != null && list.equals(list2))) && this.certified == deviceInfo.certified);
    }

    public boolean getCertified() {
        return this.certified;
    }

    public String getFriendlyName() {
        return NativeTools.BytesToString(this.friendlyName);
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public String getProductName() {
        return NativeTools.BytesToString(this.productName);
    }

    public List<String> getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public int hashCode() {
        int iN = k.n(this.productName, k.n(this.friendlyName, 31, 31), 31);
        Manufacturer manufacturer = this.manufacturer;
        int iHashCode = (iN + (manufacturer == null ? 0 : manufacturer.hashCode())) * 31;
        List<String> list = this.supportedFeatures;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + (this.certified ? 1 : 0);
    }
}
