package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GamutColor extends SDKSerializable {

    @Deprecated
    private byte[] identifier;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private double f8521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private double f8522y;

    @Deprecated
    private GamutColor(byte[] bArr, double d6, double d7) {
        this.identifier = bArr;
        this.f8521x = d6;
        this.f8522y = d7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GamutColor gamutColor = (GamutColor) obj;
        return Double.doubleToLongBits(this.f8521x) == Double.doubleToLongBits(gamutColor.f8521x) && Double.doubleToLongBits(this.f8522y) == Double.doubleToLongBits(gamutColor.f8522y);
    }

    @Deprecated
    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public double getX() {
        return this.f8521x;
    }

    public double getY() {
        return this.f8522y;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.identifier) + 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f8521x);
        int i = (iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f8522y);
        return (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    private GamutColor(double d6, double d7) {
        this.identifier = NativeTools.StringToBytes("");
        this.f8521x = d6;
        this.f8522y = d7;
    }
}
