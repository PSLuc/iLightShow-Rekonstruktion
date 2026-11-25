package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import java.io.IOException;
import javax.annotation.Nonnull;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class ColorImpl extends WrapperObject implements Color {
    public ColorImpl(@Nonnull Color.RGB rgb, String str, String str2) {
        create(rgb, str, str2);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void configureModel(String str, String str2);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void configureModelAndSwVersion(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        configureModel(str, str2);
    }

    public native void create(double d6, double d7, String str, String str2);

    public native void create(int i, double d6, String str, String str2);

    public native void create(@Nonnull Color.HSL hsl, String str, String str2);

    public native void create(@Nonnull Color.HSV hsv, String str, String str2);

    public native void create(@Nonnull Color.RGB rgb, String str, String str2);

    public native void create(@Nonnull Color.XY xy, double d6, String str, String str2);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorImpl.class != obj.getClass()) {
            return false;
        }
        Color color = (Color) obj;
        Color.XY xy = getXy();
        Color.XY xy2 = color.getXy();
        return xy.f8532x == xy2.f8532x && xy.f8533y == xy2.f8533y && getBrightness() == color.getBrightness();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native double getBrightness();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public double getCTKelvin() {
        return getCtKelvin();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public int getCTMired() {
        return getCtMired();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native double getCtKelvin();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native int getCtMired();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public Color.HSL getHSL() {
        return getHsl();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public Color.HSV getHSV() {
        return getHsv();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Nonnull
    public final native Color.HSL getHsl();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Nonnull
    public final native Color.HSV getHsv();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public Color.RGB getRGB() {
        return getRgb();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Nonnull
    public final native Color.RGB getRgb();

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public Color.XY getXY() {
        return getXy();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Nonnull
    public final native Color.XY getXy();

    public int hashCode() {
        Color.XY xy = getXy();
        return Double.valueOf(getBrightness()).hashCode() + ((Double.valueOf(xy.f8533y).hashCode() + ((Double.valueOf(xy.f8532x).hashCode() + 31) * 31)) * 31);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setBrightness(double d6);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setBrightness(Double d6) {
        if (d6 != null) {
            setBrightness(d6.doubleValue());
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setCTBKelvin(Double d6, Double d7) {
        setCTKelvin(d6);
        setBrightness(d7);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setCTBMired(Integer num, Double d6) {
        setCTMired(num);
        setBrightness(d6);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setCTKelvin(Double d6) {
        if (d6 != null) {
            setCtKelvin(d6.doubleValue());
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setCTMired(Integer num) {
        if (num != null) {
            setCtMired(num.intValue());
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setCtKelvin(double d6);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setCtMired(int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setCtbKelvin(double d6, double d7);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setCtbMired(int i, double d6);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setHSL(Color.HSL hsl) {
        if (hsl != null) {
            setHsl(hsl);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setHSV(Color.HSV hsv) {
        if (hsv != null) {
            setHsv(hsv);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setHsl(@Nonnull Color.HSL hsl);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setHsv(@Nonnull Color.HSV hsv);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setRGB(Color.RGB rgb) {
        if (rgb != null) {
            setRgb(rgb);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setRgb(@Nonnull Color.RGB rgb);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setXY(Color.XY xy) {
        if (xy != null) {
            setXy(xy);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    @Deprecated
    public void setXYB(Color.XY xy, Double d6) {
        setXY(xy);
        setBrightness(d6);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setXy(@Nonnull Color.XY xy);

    @Override // com.philips.lighting.hue.sdk.wrapper.utilities.Color
    public final native void setXyb(@Nonnull Color.XY xy, double d6);

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            Color.RGB rgb = getRgb();
            if (rgb != null) {
                try {
                    rVarK.t("rgb", JsonLoader.fromString(rgb.toString()));
                } catch (IOException unused) {
                    rVarK.q("rgb", rgb.toString());
                }
            } else {
                rVarK.s("rgb");
            }
            Color.HSV hsv = getHsv();
            if (hsv != null) {
                try {
                    rVarK.t("hsv", JsonLoader.fromString(hsv.toString()));
                } catch (IOException unused2) {
                    rVarK.q("hsv", hsv.toString());
                }
            } else {
                rVarK.s("hsv");
            }
            Color.HSL hsl = getHsl();
            if (hsl != null) {
                try {
                    rVarK.t("hsl", JsonLoader.fromString(hsl.toString()));
                } catch (IOException unused3) {
                    rVarK.q("hsl", hsl.toString());
                }
            } else {
                rVarK.s("hsl");
            }
            Color.XY xy = getXy();
            if (xy != null) {
                try {
                    rVarK.t("xy", JsonLoader.fromString(xy.toString()));
                } catch (IOException unused4) {
                    rVarK.q("xy", xy.toString());
                }
            } else {
                rVarK.s("xy");
            }
            Double dValueOf = Double.valueOf(getCtKelvin());
            try {
                rVarK.t("ctKelvin", JsonLoader.fromString(dValueOf.toString()));
            } catch (IOException unused5) {
                rVarK.q("ctKelvin", dValueOf.toString());
            }
            Integer numValueOf = Integer.valueOf(getCtMired());
            try {
                rVarK.t("ctMired", JsonLoader.fromString(numValueOf.toString()));
            } catch (IOException unused6) {
                rVarK.q("ctMired", numValueOf.toString());
            }
            Double dValueOf2 = Double.valueOf(getBrightness());
            try {
                rVarK.t("brightness", JsonLoader.fromString(dValueOf2.toString()));
            } catch (IOException unused7) {
                rVarK.q("brightness", dValueOf2.toString());
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public ColorImpl(@Nonnull Color.HSV hsv, String str, String str2) {
        create(hsv, str, str2);
    }

    public ColorImpl(@Nonnull Color.HSL hsl, String str, String str2) {
        create(hsl, str, str2);
    }

    public ColorImpl(@Nonnull Color.XY xy, double d6, String str, String str2) {
        create(xy, d6, str, str2);
    }

    public ColorImpl(double d6, double d7, String str, String str2) {
        create(d6, d7, str, str2);
    }

    public ColorImpl(int i, double d6, String str, String str2) {
        create(i, d6, str, str2);
    }

    public ColorImpl(WrapperObject.Scope scope) {
    }
}
