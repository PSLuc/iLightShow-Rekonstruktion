package com.philips.lighting.hue.sdk.wrapper.domain.clip;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DoublePair extends SDKSerializable {
    private double[] value;

    private DoublePair(double[] dArr, boolean z5) {
        this.value = dArr;
    }

    public boolean equals(Object obj) {
        if (this == obj || super.equals(obj)) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            double[] dArr = this.value;
            int length = dArr.length;
            double[] dArr2 = ((DoublePair) obj).value;
            if (length == dArr2.length && dArr[0] == dArr2[0] && dArr[1] == dArr2[1]) {
                return true;
            }
        } else if (obj.getClass() == Double[].class) {
            Double[] dArr3 = (Double[]) obj;
            if (dArr3.length == 2 && dArr3[0].doubleValue() == this.value[0] && dArr3[1].doubleValue() == this.value[1]) {
                return true;
            }
        } else if (obj.getClass() == double[].class) {
            double[] dArr4 = (double[]) obj;
            if (dArr4.length != 2) {
                return false;
            }
            double d6 = dArr4[0];
            double[] dArr5 = this.value;
            if (d6 == dArr5[0] && dArr4[1] == dArr5[1]) {
                return true;
            }
        }
        return false;
    }

    public double[] getValue() {
        return this.value;
    }

    public double getValue1() {
        return this.value[0];
    }

    public double getValue2() {
        return this.value[1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + (super.hashCode() * 31);
    }

    public void setValue(double d6, double d7) {
        this.value = new double[]{d6, d7};
    }

    public void setValues(double[] dArr) {
        if (dArr.length == 2) {
            this.value = dArr;
        }
    }

    public DoublePair(double d6, double d7) {
        this(new double[]{d6, d7}, false);
    }

    public DoublePair() {
        this(new double[2], true);
    }
}
