package p040h0;

import p035g0.H;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i3, long j4, String str) {
        super(i, str, j4);
        this.f9255d = i3;
    }

    @Override // p040h0.c
    public final float a(int i) {
        switch (this.f9255d) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // p040h0.c
    public final float b(int i) {
        switch (this.f9255d) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p040h0.c
    public final long d(float f6, float f7, float f8) {
        switch (this.f9255d) {
            case 0:
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f7 < -128.0f) {
                    f7 = -128.0f;
                }
                if (f7 > 128.0f) {
                    f7 = 128.0f;
                }
                float f9 = (f6 + 16.0f) / 116.0f;
                float f10 = (f7 * 0.002f) + f9;
                float f11 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
                float f12 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
                float[] fArr = j.f9254e;
                return (((long) Float.floatToRawIntBits(f11 * fArr[0])) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f12 * fArr[1])));
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7 <= 2.0f ? f7 : 2.0f)) & 4294967295L);
        }
    }

    @Override // p040h0.c
    public final float e(float f6, float f7, float f8) {
        switch (this.f9255d) {
            case 0:
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f6 > 100.0f) {
                    f6 = 100.0f;
                }
                if (f8 < -128.0f) {
                    f8 = -128.0f;
                }
                if (f8 > 128.0f) {
                    f8 = 128.0f;
                }
                float f9 = ((f6 + 16.0f) / 116.0f) - (f8 * 0.005f);
                return (f9 > 0.20689656f ? f9 * f9 * f9 : 0.12841855f * (f9 - 0.13793103f)) * j.f9254e[2];
            default:
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 > 2.0f) {
                    return 2.0f;
                }
                return f8;
        }
    }

    @Override // p040h0.c
    public final long f(float f6, float f7, float f8, float f9, c cVar) {
        switch (this.f9255d) {
            case 0:
                float[] fArr = j.f9254e;
                float f10 = f6 / fArr[0];
                float f11 = f7 / fArr[1];
                float f12 = f8 / fArr[2];
                float fCbrt = f10 > 0.008856452f ? (float) Math.cbrt(f10) : (f10 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
                float fCbrt3 = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
                float f13 = (116.0f * fCbrt2) - 16.0f;
                float f14 = (fCbrt - fCbrt2) * 500.0f;
                float f15 = (fCbrt2 - fCbrt3) * 200.0f;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 100.0f) {
                    f13 = 100.0f;
                }
                if (f14 < -128.0f) {
                    f14 = -128.0f;
                }
                if (f14 > 128.0f) {
                    f14 = 128.0f;
                }
                if (f15 < -128.0f) {
                    f15 = -128.0f;
                }
                return H.b(f13, f14, f15 <= 128.0f ? f15 : 128.0f, f9, cVar);
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    f6 = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                return H.b(f6, f7, f8 <= 2.0f ? f8 : 2.0f, f9, cVar);
        }
    }
}
