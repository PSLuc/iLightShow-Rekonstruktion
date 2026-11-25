package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.LightPoint;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class HueColor extends SessionObject {
    public static final double MAX_BRIGHTNESS = 255.0d;
    public static final double MAX_COLOR_TEMPERATURE = 500.0d;
    public static final double MAX_HUE = 65535.0d;
    public static final double MAX_RGB = 255.0d;
    public static final double MAX_SATURATION = 255.0d;

    public HueColor(RGB rgb, String str, String str2) {
        createRGBColorNative(rgb.f8542r, rgb.f8541g, rgb.f8540b, NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public static int[] bulkConvertToRGBColors(double[][] dArr, LightPoint lightPoint) {
        String swVersion;
        LightConfiguration lightConfiguration;
        String str = null;
        if (lightPoint == null || (lightConfiguration = lightPoint.getLightConfiguration()) == null) {
            swVersion = null;
        } else {
            String modelIdentifier = lightConfiguration.getModelIdentifier();
            if (modelIdentifier == null) {
                modelIdentifier = null;
            }
            swVersion = lightConfiguration.getSwVersion();
            if (swVersion == null) {
                swVersion = null;
            }
            str = modelIdentifier;
        }
        return bulkConvertToRGBColors(dArr, str, swVersion);
    }

    public static double[][] bulkConvertToXY(int[] iArr, LightPoint lightPoint) {
        String swVersion;
        LightConfiguration lightConfiguration;
        String str = null;
        if (lightPoint == null || (lightConfiguration = lightPoint.getLightConfiguration()) == null) {
            swVersion = null;
        } else {
            String modelIdentifier = lightConfiguration.getModelIdentifier();
            if (modelIdentifier == null) {
                modelIdentifier = null;
            }
            swVersion = lightConfiguration.getSwVersion();
            if (swVersion == null) {
                swVersion = null;
            }
            str = modelIdentifier;
        }
        return bulkConvertToXY(iArr, str, swVersion);
    }

    private native void configureModelAndVersionNative(byte[] bArr, byte[] bArr2);

    private static native int[] convertToRGBColorsNative(double[] dArr, String str, String str2);

    private static native double[] convertToXYNative(int[] iArr, String str, String str2);

    private native void createCTKelvinColorNative(double d6, double d7, byte[] bArr, byte[] bArr2);

    private native void createCTMiredColorNative(int i, double d6, byte[] bArr, byte[] bArr2);

    private native void createHSLColorNative(double d6, double d7, double d8, byte[] bArr, byte[] bArr2);

    private native void createHSVColorNative(double d6, double d7, double d8, byte[] bArr, byte[] bArr2);

    private native void createRGBColorNative(int i, int i3, int i6, byte[] bArr, byte[] bArr2);

    private native void createXYColorNative(double d6, double d7, double d8, byte[] bArr, byte[] bArr2);

    private native void destroyNative();

    private native void setBrightnessNative(double d6);

    private native void setCTKelvinNative(double d6);

    private native void setCTMiredNative(int i);

    private native void setHSLNative(double d6, double d7, double d8);

    private native void setHSVNative(double d6, double d7, double d8);

    private native void setRGBNative(int i, int i3, int i6);

    private native void setXYNative(double d6, double d7);

    public void configureModelAndSwVersion(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        configureModelAndVersionNative(NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HueColor hueColor = (HueColor) obj;
        XY xy = getXY();
        XY xy2 = hueColor.getXY();
        return xy.f8543x == xy2.f8543x && xy.f8544y == xy2.f8544y && getBrightness() == hueColor.getBrightness();
    }

    public void finalize() throws Throwable {
        destroyNative();
        super.finalize();
    }

    public native double getBrightness();

    public native double getCTKelvin();

    public native int getCTMired();

    public native HSL getHSL();

    public native HSV getHSV();

    public native RGB getRGB();

    public native XY getXY();

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        XY xy = getXY();
        return Double.valueOf(getBrightness()).hashCode() + ((Double.valueOf(xy.f8544y).hashCode() + ((Double.valueOf(xy.f8543x).hashCode() + 31) * 31)) * 31);
    }

    public void setBrightness(Double d6) {
        if (d6 != null) {
            setBrightnessNative(d6.doubleValue());
        }
    }

    public void setCTBKelvin(Double d6, Double d7) {
        setCTKelvin(d6);
        setBrightness(d7);
    }

    public void setCTBMired(Integer num, Double d6) {
        setCTMired(num);
        setBrightness(d6);
    }

    public void setCTKelvin(Double d6) {
        if (d6 != null) {
            setCTKelvinNative(d6.doubleValue());
        }
    }

    public void setCTMired(Integer num) {
        if (num != null) {
            setCTMiredNative(num.intValue());
        }
    }

    public void setHSL(HSL hsl) {
        if (hsl != null) {
            setHSLNative(hsl.f8534h, hsl.f8536s, hsl.f8535l);
        }
    }

    public void setHSV(HSV hsv) {
        if (hsv != null) {
            setHSVNative(hsv.f8537h, hsv.f8538s, hsv.f8539v);
        }
    }

    public void setRGB(RGB rgb) {
        if (rgb != null) {
            setRGBNative(rgb.f8542r, rgb.f8541g, rgb.f8540b);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void setSessionKey(long j4) {
    }

    public void setXY(XY xy) {
        if (xy != null) {
            setXYNative(xy.f8543x, xy.f8544y);
        }
    }

    public void setXYB(XY xy, Double d6) {
        setXY(xy);
        setBrightness(d6);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    public static class XY {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public double f8543x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public double f8544y;

        public XY(double d6, double d7) {
            this.f8543x = d6;
            this.f8544y = d7;
        }

        public XY(Double d6, Double d7) {
            this.f8543x = 0.0d;
            this.f8544y = 0.0d;
            this.f8543x = d6.doubleValue();
            this.f8544y = d7.doubleValue();
        }

        public XY() {
            this.f8543x = 0.0d;
            this.f8544y = 0.0d;
        }
    }

    public HueColor(HSV hsv, String str, String str2) {
        createHSVColorNative(hsv.f8537h, hsv.f8538s, hsv.f8539v, NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public static class HSL {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f8534h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f8535l;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public double f8536s;

        public HSL(double d6, double d7, double d8) {
            this.f8534h = d6;
            this.f8536s = d7;
            this.f8535l = d8;
        }

        public HSL(Double d6, Double d7, Double d8) {
            this.f8534h = 0.0d;
            this.f8536s = 0.0d;
            this.f8535l = 0.0d;
            this.f8534h = d6.doubleValue();
            this.f8536s = d7.doubleValue();
            this.f8535l = d8.doubleValue();
        }

        public HSL() {
            this.f8534h = 0.0d;
            this.f8536s = 0.0d;
            this.f8535l = 0.0d;
        }
    }

    public static class HSV {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f8537h;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public double f8538s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public double f8539v;

        public HSV(double d6, double d7, double d8) {
            this.f8537h = d6;
            this.f8538s = d7;
            this.f8539v = d8;
        }

        public HSV(Double d6, Double d7, Double d8) {
            this.f8537h = 0.0d;
            this.f8538s = 0.0d;
            this.f8539v = 0.0d;
            this.f8537h = d6.doubleValue();
            this.f8538s = d7.doubleValue();
            this.f8539v = d8.doubleValue();
        }

        public HSV() {
            this.f8537h = 0.0d;
            this.f8538s = 0.0d;
            this.f8539v = 0.0d;
        }
    }

    public static class RGB {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8540b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8541g;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f8542r;

        public RGB(int i, int i3, int i6) {
            this.f8542r = i;
            this.f8541g = i3;
            this.f8540b = i6;
        }

        public RGB(Integer num, Integer num2, Integer num3) {
            this.f8542r = 0;
            this.f8541g = 0;
            this.f8540b = 0;
            this.f8542r = num.intValue();
            this.f8541g = num2.intValue();
            this.f8540b = num3.intValue();
        }

        public RGB() {
            this.f8542r = 0;
            this.f8541g = 0;
            this.f8540b = 0;
        }
    }

    public HueColor(HSL hsl, String str, String str2) {
        createHSLColorNative(hsl.f8534h, hsl.f8536s, hsl.f8535l, NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public static int[] bulkConvertToRGBColors(double[][] dArr, String str, String str2) {
        double[] dArr2 = new double[dArr.length * 2];
        int i = 0;
        for (double[] dArr3 : dArr) {
            dArr2[i] = dArr3[0];
            dArr2[i + 1] = dArr3[1];
            i += 2;
        }
        return convertToRGBColorsNative(dArr2, str, str2);
    }

    public static double[][] bulkConvertToXY(int[] iArr, String str, String str2) {
        double[] dArrConvertToXYNative = convertToXYNative(iArr, str, str2);
        int i = 0;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArrConvertToXYNative.length / 2, 2);
        int i3 = 0;
        for (int i6 = 0; i6 < dArrConvertToXYNative.length; i6 += 2) {
            dArr[i3][0] = dArrConvertToXYNative[i6];
            i3++;
        }
        for (int i7 = 1; i7 < dArrConvertToXYNative.length; i7 += 2) {
            dArr[i][1] = dArrConvertToXYNative[i7];
            i++;
        }
        return dArr;
    }

    public HueColor(XY xy, double d6, String str, String str2) {
        createXYColorNative(xy.f8543x, xy.f8544y, d6, NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public HueColor(double d6, double d7, String str, String str2) {
        createCTKelvinColorNative(d6, d7, NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }

    public HueColor(int i, double d6, String str, String str2) {
        createCTMiredColorNative(i, d6, NativeTools.StringToBytes(str), NativeTools.StringToBytes(str2));
    }
}
