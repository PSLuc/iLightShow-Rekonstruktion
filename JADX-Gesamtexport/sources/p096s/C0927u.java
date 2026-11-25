package p096s;

import S1.V;
import p012c.k;
import p035g0.H;

/* JADX INFO: renamed from: s.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0927u implements InterfaceC0930x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12119h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f12120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f12122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f12123m;

    public C0927u(float f6, float f7, float f8, float f9) {
        int iZ;
        this.f12119h = f6;
        this.i = f7;
        this.f12120j = f8;
        this.f12121k = f9;
        if (Float.isNaN(f6) || Float.isNaN(f7) || Float.isNaN(f8) || Float.isNaN(f9)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f6 + ", " + f7 + ", " + f8 + ", " + f9 + '.');
        }
        float[] fArr = new float[5];
        float f10 = (f7 - 0.0f) * 3.0f;
        float f11 = (f9 - f7) * 3.0f;
        float f12 = (1.0f - f9) * 3.0f;
        double d6 = f10;
        double d7 = f11;
        double d8 = f12;
        double d9 = d7 * 2.0d;
        double d10 = (d6 - d9) + d8;
        if (d10 == 0.0d) {
            iZ = d7 == d8 ? 0 : H.z((float) ((d9 - d8) / (d9 - (d8 * 2.0d))), fArr, 0);
        } else {
            double d11 = -Math.sqrt((d7 * d7) - (d8 * d6));
            double d12 = (-d6) + d7;
            int iZ2 = H.z((float) ((-(d11 + d12)) / d10), fArr, 0);
            iZ = H.z((float) ((d11 - d12) / d10), fArr, iZ2) + iZ2;
            if (iZ > 1) {
                float f13 = fArr[0];
                float f14 = fArr[1];
                if (f13 > f14) {
                    fArr[0] = f14;
                    fArr[1] = f13;
                } else if (f13 == f14) {
                    iZ--;
                }
            }
        }
        float f15 = (f11 - f10) * 2.0f;
        int iZ3 = H.z((-f15) / (((f12 - f11) * 2.0f) - f15), fArr, iZ) + iZ;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iZ3; i++) {
            float f16 = fArr[i];
            float f17 = (((((((((f7 - f9) * 3.0f) + 1.0f) - 0.0f) * f16) + (((f9 - (f7 * 2.0f)) + 0.0f) * 3.0f)) * f16) + f10) * f16) + 0.0f;
            fMin = Math.min(fMin, f17);
            fMax = Math.max(fMax, f17);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f12122l = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f12123m = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[PHI: r4
  0x00bc: PHI (r4v25 float) = (r4v15 float), (r4v20 float), (r4v33 float) binds: [B:67:0x014b, B:81:0x017a, B:35:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x013a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    @Override // p096s.InterfaceC0930x
    public final float a(float f6) {
        float fY;
        float fCos;
        if (f6 <= 0.0f || f6 >= 1.0f) {
            return f6;
        }
        float f7 = 0.0f - f6;
        float f8 = this.f12119h;
        float f9 = f8 - f6;
        float f10 = this.f12120j;
        float f11 = f10 - f6;
        double d6 = f7;
        double d7 = ((d6 - (((double) f9) * 2.0d)) + ((double) f11)) * 3.0d;
        double d8 = ((double) (f9 - f7)) * 3.0d;
        double d9 = (((double) (f9 - f11)) * 3.0d) + ((double) (-f7)) + ((double) (1.0f - f6));
        if (Math.abs(d9 - 0.0d) >= 1.0E-7d) {
            double d10 = d7 / d9;
            double d11 = d8 / d9;
            double d12 = d6 / d9;
            double d13 = ((d11 * 3.0d) - (d10 * d10)) / 9.0d;
            double d14 = ((d12 * 27.0d) + ((((2.0d * d10) * d10) * d10) - ((9.0d * d10) * d11))) / 54.0d;
            double d15 = d13 * d13 * d13;
            double d16 = (d14 * d14) + d15;
            double d17 = d10 / 3.0d;
            if (d16 < 0.0d) {
                double dSqrt = Math.sqrt(-d15);
                double d18 = (-d14) / dSqrt;
                if (d18 < -1.0d) {
                    d18 = -1.0d;
                }
                if (d18 > 1.0d) {
                    d18 = 1.0d;
                }
                double dAcos = Math.acos(d18);
                double dY = V.y((float) dSqrt) * 2.0f;
                fCos = (float) ((Math.cos(dAcos / 3.0d) * dY) - d17);
                if (fCos < 0.0f) {
                    if (fCos >= -8.34465E-7f) {
                        fCos = 0.0f;
                    } else {
                        fCos = Float.NaN;
                    }
                } else if (fCos > 1.0f) {
                    if (fCos <= 1.0000008f) {
                        fCos = 1.0f;
                    } else {
                        fCos = Float.NaN;
                    }
                }
                if (Float.isNaN(fCos)) {
                    fCos = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dY) - d17);
                    if (fCos < 0.0f) {
                        if (fCos >= -8.34465E-7f) {
                            fCos = 0.0f;
                        } else {
                            fCos = Float.NaN;
                        }
                    } else if (fCos > 1.0f) {
                        if (fCos <= 1.0000008f) {
                            fCos = 1.0f;
                        } else {
                            fCos = Float.NaN;
                        }
                    }
                    if (Float.isNaN(fCos)) {
                        fY = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dY) - d17);
                        if (fY < 0.0f) {
                            if (fY >= -8.34465E-7f) {
                                fY = 0.0f;
                            }
                        } else if (fY > 1.0f) {
                            if (fY <= 1.0000008f) {
                                fY = 1.0f;
                            }
                        }
                        fY = Float.NaN;
                    } else {
                        fY = fCos;
                    }
                } else {
                    fY = fCos;
                }
            } else if (d16 == 0.0d) {
                float f12 = -V.y((float) d14);
                float f13 = (float) d17;
                float f14 = (f12 * 2.0f) - f13;
                if (f14 < 0.0f) {
                    if (f14 >= -8.34465E-7f) {
                        f14 = 0.0f;
                    } else {
                        f14 = Float.NaN;
                    }
                } else if (f14 > 1.0f) {
                    if (f14 <= 1.0000008f) {
                        f14 = 1.0f;
                    } else {
                        f14 = Float.NaN;
                    }
                }
                if (Float.isNaN(f14)) {
                    fY = (-f12) - f13;
                    if (fY < 0.0f) {
                        if (fY >= -8.34465E-7f) {
                            fY = 0.0f;
                        }
                    } else if (fY > 1.0f) {
                        if (fY <= 1.0000008f) {
                            fY = 1.0f;
                        }
                    }
                    fY = Float.NaN;
                } else {
                    fY = f14;
                }
            } else {
                double dSqrt2 = Math.sqrt(d16);
                fY = (float) (((double) (V.y((float) ((-d14) + dSqrt2)) - V.y((float) (d14 + dSqrt2)))) - d17);
                if (fY < 0.0f) {
                    if (fY >= -8.34465E-7f) {
                        fY = 0.0f;
                    }
                } else if (fY > 1.0f) {
                    if (fY <= 1.0000008f) {
                        fY = 1.0f;
                    }
                }
                fY = Float.NaN;
            }
        } else if (Math.abs(d7 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d8 * d8) - ((4.0d * d7) * d6));
            double d19 = d7 * 2.0d;
            fCos = (float) ((dSqrt3 - d8) / d19);
            if (fCos < 0.0f) {
                if (fCos >= -8.34465E-7f) {
                    fCos = 0.0f;
                } else {
                    fCos = Float.NaN;
                }
            } else if (fCos > 1.0f) {
                if (fCos <= 1.0000008f) {
                    fCos = 1.0f;
                } else {
                    fCos = Float.NaN;
                }
            }
            if (Float.isNaN(fCos)) {
                fY = (float) (((-d8) - dSqrt3) / d19);
                if (fY < 0.0f) {
                    if (fY >= -8.34465E-7f) {
                        fY = 0.0f;
                    }
                } else if (fY > 1.0f) {
                    if (fY <= 1.0000008f) {
                        fY = 1.0f;
                    }
                }
                fY = Float.NaN;
            } else {
                fY = fCos;
            }
        } else if (Math.abs(d8 - 0.0d) < 1.0E-7d) {
            fY = Float.NaN;
        } else {
            fY = (float) ((-d6) / d8);
            if (fY < 0.0f) {
                if (fY >= -8.34465E-7f) {
                    fY = 0.0f;
                }
            } else if (fY > 1.0f) {
                if (fY <= 1.0000008f) {
                    fY = 1.0f;
                }
            }
            fY = Float.NaN;
        }
        boolean zIsNaN = Float.isNaN(fY);
        float f15 = this.f12121k;
        float f16 = this.i;
        if (!zIsNaN) {
            float f17 = ((((((f16 - f15) + 0.33333334f) * fY) + (f15 - (2.0f * f16))) * fY) + f16) * 3.0f * fY;
            float f18 = this.f12122l;
            if (f17 < f18) {
                f17 = f18;
            }
            float f19 = this.f12123m;
            return f17 > f19 ? f19 : f17;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f8 + ", " + f16 + ", " + f10 + ", " + f15 + ") has no solution at " + f6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0927u)) {
            return false;
        }
        C0927u c0927u = (C0927u) obj;
        return this.f12119h == c0927u.f12119h && this.i == c0927u.i && this.f12120j == c0927u.f12120j && this.f12121k == c0927u.f12121k;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12121k) + k.i(this.f12120j, k.i(this.i, Float.hashCode(this.f12119h) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f12119h);
        sb.append(", b=");
        sb.append(this.i);
        sb.append(", c=");
        sb.append(this.f12120j);
        sb.append(", d=");
        return k.t(sb, this.f12121k, ')');
    }
}
