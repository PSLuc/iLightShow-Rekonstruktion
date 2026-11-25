package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public interface Color {
    public static final double MAX_BRIGHTNESS = 255.0d;
    public static final double MAX_COLOR_TEMPERATURE = 500.0d;
    public static final double MAX_HUE = 65535.0d;
    public static final double MAX_RGB = 255.0d;
    public static final double MAX_SATURATION = 255.0d;

    public static final class HSL {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f8523h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f8524l;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public double f8525s;

        public HSL() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && HSL.class == obj.getClass()) {
                HSL hsl = (HSL) obj;
                if (Double.valueOf(this.f8523h).equals(Double.valueOf(hsl.f8523h)) && Double.valueOf(this.f8525s).equals(Double.valueOf(hsl.f8525s)) && Double.valueOf(this.f8524l).equals(Double.valueOf(hsl.f8524l))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Double.valueOf(this.f8523h), Double.valueOf(this.f8525s), Double.valueOf(this.f8524l));
        }

        @Nonnull
        public String toString() {
            if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
                return super.toString();
            }
            u jsonMapper = JsonMapperProvider.getJsonMapper();
            r rVarK = jsonMapper.k();
            try {
                Double dValueOf = Double.valueOf(this.f8523h);
                try {
                    rVarK.t("h", JsonLoader.fromString(dValueOf.toString()));
                } catch (IOException unused) {
                    rVarK.q("h", dValueOf.toString());
                }
                Double dValueOf2 = Double.valueOf(this.f8525s);
                try {
                    rVarK.t("s", JsonLoader.fromString(dValueOf2.toString()));
                } catch (IOException unused2) {
                    rVarK.q("s", dValueOf2.toString());
                }
                Double dValueOf3 = Double.valueOf(this.f8524l);
                try {
                    rVarK.t("l", JsonLoader.fromString(dValueOf3.toString()));
                } catch (IOException unused3) {
                    rVarK.q("l", dValueOf3.toString());
                }
                return jsonMapper.n().d(rVarK);
            } catch (Exception e6) {
                return e6.toString();
            }
        }

        public HSL(double d6, double d7, double d8) {
            this.f8523h = d6;
            this.f8525s = d7;
            this.f8524l = d8;
        }
    }

    public static final class HSV {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f8526h;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public double f8527s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public double f8528v;

        public HSV() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && HSV.class == obj.getClass()) {
                HSV hsv = (HSV) obj;
                if (Double.valueOf(this.f8526h).equals(Double.valueOf(hsv.f8526h)) && Double.valueOf(this.f8527s).equals(Double.valueOf(hsv.f8527s)) && Double.valueOf(this.f8528v).equals(Double.valueOf(hsv.f8528v))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Double.valueOf(this.f8526h), Double.valueOf(this.f8527s), Double.valueOf(this.f8528v));
        }

        @Nonnull
        public String toString() {
            if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
                return super.toString();
            }
            u jsonMapper = JsonMapperProvider.getJsonMapper();
            r rVarK = jsonMapper.k();
            try {
                Double dValueOf = Double.valueOf(this.f8526h);
                try {
                    rVarK.t("h", JsonLoader.fromString(dValueOf.toString()));
                } catch (IOException unused) {
                    rVarK.q("h", dValueOf.toString());
                }
                Double dValueOf2 = Double.valueOf(this.f8527s);
                try {
                    rVarK.t("s", JsonLoader.fromString(dValueOf2.toString()));
                } catch (IOException unused2) {
                    rVarK.q("s", dValueOf2.toString());
                }
                Double dValueOf3 = Double.valueOf(this.f8528v);
                try {
                    rVarK.t("v", JsonLoader.fromString(dValueOf3.toString()));
                } catch (IOException unused3) {
                    rVarK.q("v", dValueOf3.toString());
                }
                return jsonMapper.n().d(rVarK);
            } catch (Exception e6) {
                return e6.toString();
            }
        }

        public HSV(double d6, double d7, double d8) {
            this.f8526h = d6;
            this.f8527s = d7;
            this.f8528v = d8;
        }
    }

    public static final class RGB {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8529b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8530g;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f8531r;

        public RGB() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && RGB.class == obj.getClass()) {
                RGB rgb = (RGB) obj;
                if (Integer.valueOf(this.f8531r).equals(Integer.valueOf(rgb.f8531r)) && Integer.valueOf(this.f8530g).equals(Integer.valueOf(rgb.f8530g)) && Integer.valueOf(this.f8529b).equals(Integer.valueOf(rgb.f8529b))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f8531r), Integer.valueOf(this.f8530g), Integer.valueOf(this.f8529b));
        }

        @Nonnull
        public String toString() {
            if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
                return super.toString();
            }
            u jsonMapper = JsonMapperProvider.getJsonMapper();
            r rVarK = jsonMapper.k();
            try {
                Integer numValueOf = Integer.valueOf(this.f8531r);
                try {
                    rVarK.t("r", JsonLoader.fromString(numValueOf.toString()));
                } catch (IOException unused) {
                    rVarK.q("r", numValueOf.toString());
                }
                Integer numValueOf2 = Integer.valueOf(this.f8530g);
                try {
                    rVarK.t("g", JsonLoader.fromString(numValueOf2.toString()));
                } catch (IOException unused2) {
                    rVarK.q("g", numValueOf2.toString());
                }
                Integer numValueOf3 = Integer.valueOf(this.f8529b);
                try {
                    rVarK.t("b", JsonLoader.fromString(numValueOf3.toString()));
                } catch (IOException unused3) {
                    rVarK.q("b", numValueOf3.toString());
                }
                return jsonMapper.n().d(rVarK);
            } catch (Exception e6) {
                return e6.toString();
            }
        }

        public RGB(int i, int i3, int i6) {
            this.f8531r = i;
            this.f8530g = i3;
            this.f8529b = i6;
        }
    }

    public static final class XY {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public double f8532x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public double f8533y;

        public XY() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && XY.class == obj.getClass()) {
                XY xy = (XY) obj;
                if (Double.valueOf(this.f8532x).equals(Double.valueOf(xy.f8532x)) && Double.valueOf(this.f8533y).equals(Double.valueOf(xy.f8533y))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Double.valueOf(this.f8532x), Double.valueOf(this.f8533y));
        }

        @Nonnull
        public String toString() {
            if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
                return super.toString();
            }
            u jsonMapper = JsonMapperProvider.getJsonMapper();
            r rVarK = jsonMapper.k();
            try {
                Double dValueOf = Double.valueOf(this.f8532x);
                try {
                    rVarK.t("x", JsonLoader.fromString(dValueOf.toString()));
                } catch (IOException unused) {
                    rVarK.q("x", dValueOf.toString());
                }
                Double dValueOf2 = Double.valueOf(this.f8533y);
                try {
                    rVarK.t("y", JsonLoader.fromString(dValueOf2.toString()));
                } catch (IOException unused2) {
                    rVarK.q("y", dValueOf2.toString());
                }
                return jsonMapper.n().d(rVarK);
            } catch (Exception e6) {
                return e6.toString();
            }
        }

        public XY(double d6, double d7) {
            this.f8532x = d6;
            this.f8533y = d7;
        }
    }

    void configureModel(String str, String str2);

    @Deprecated
    void configureModelAndSwVersion(String str, String str2);

    double getBrightness();

    @Deprecated
    double getCTKelvin();

    @Deprecated
    int getCTMired();

    double getCtKelvin();

    int getCtMired();

    @Deprecated
    HSL getHSL();

    @Deprecated
    HSV getHSV();

    @Nonnull
    HSL getHsl();

    @Nonnull
    HSV getHsv();

    @Deprecated
    RGB getRGB();

    @Nonnull
    RGB getRgb();

    @Deprecated
    XY getXY();

    @Nonnull
    XY getXy();

    void setBrightness(double d6);

    @Deprecated
    void setBrightness(Double d6);

    @Deprecated
    void setCTBKelvin(Double d6, Double d7);

    @Deprecated
    void setCTBMired(Integer num, Double d6);

    @Deprecated
    void setCTKelvin(Double d6);

    @Deprecated
    void setCTMired(Integer num);

    void setCtKelvin(double d6);

    void setCtMired(int i);

    void setCtbKelvin(double d6, double d7);

    void setCtbMired(int i, double d6);

    @Deprecated
    void setHSL(HSL hsl);

    @Deprecated
    void setHSV(HSV hsv);

    void setHsl(@Nonnull HSL hsl);

    void setHsv(@Nonnull HSV hsv);

    @Deprecated
    void setRGB(RGB rgb);

    void setRgb(@Nonnull RGB rgb);

    @Deprecated
    void setXY(XY xy);

    @Deprecated
    void setXYB(XY xy, Double d6);

    void setXy(@Nonnull XY xy);

    void setXyb(@Nonnull XY xy, double d6);
}
