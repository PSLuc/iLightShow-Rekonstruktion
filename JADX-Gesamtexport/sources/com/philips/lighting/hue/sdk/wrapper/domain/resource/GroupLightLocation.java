package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GroupLightLocation {
    private byte[] lightIdentifier;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Double f8518x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Double f8519y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Double f8520z;

    public GroupLightLocation() {
        this.lightIdentifier = null;
        this.f8518x = null;
        this.f8519y = null;
        this.f8520z = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GroupLightLocation groupLightLocation = (GroupLightLocation) obj;
        Double d6 = this.f8518x;
        if (d6 == null) {
            if (groupLightLocation.f8518x != null) {
                return false;
            }
        } else if (d6.compareTo(groupLightLocation.f8518x) != 0) {
            return false;
        }
        Double d7 = this.f8519y;
        if (d7 == null) {
            if (groupLightLocation.f8519y != null) {
                return false;
            }
        } else if (d7.compareTo(groupLightLocation.f8519y) != 0) {
            return false;
        }
        Double d8 = this.f8520z;
        if (d8 == null) {
            if (groupLightLocation.f8520z != null) {
                return false;
            }
        } else if (d8.compareTo(groupLightLocation.f8520z) != 0) {
            return false;
        }
        return Arrays.equals(groupLightLocation.lightIdentifier, this.lightIdentifier);
    }

    public String getLightIdentifier() {
        return NativeTools.BytesToString(this.lightIdentifier);
    }

    public Double getX() {
        return this.f8518x;
    }

    public Double getY() {
        return this.f8519y;
    }

    public Double getZ() {
        return this.f8520z;
    }

    public int hashCode() {
        Double d6 = this.f8518x;
        int iHashCode = ((d6 == null ? 0 : d6.hashCode()) + 31) * 31;
        Double d7 = this.f8519y;
        int iHashCode2 = (iHashCode + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.f8520z;
        int iHashCode3 = (iHashCode2 + (d8 == null ? 0 : d8.hashCode())) * 31;
        byte[] bArr = this.lightIdentifier;
        return iHashCode3 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public void setLightIdentifier(String str) {
        this.lightIdentifier = NativeTools.StringToBytes(str);
    }

    public void setX(Double d6) {
        this.f8518x = d6;
    }

    public void setY(Double d6) {
        this.f8519y = d6;
    }

    public void setZ(Double d6) {
        this.f8520z = d6;
    }

    public GroupLightLocation(String str, Double d6, Double d7, Double d8) {
        this.lightIdentifier = null;
        this.f8518x = null;
        this.f8519y = null;
        this.f8520z = null;
        setLightIdentifier(str);
        this.f8518x = d6;
        this.f8519y = d7;
        this.f8520z = d8;
    }
}
