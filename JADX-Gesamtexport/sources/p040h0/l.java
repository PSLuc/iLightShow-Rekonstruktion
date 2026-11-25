package p040h0;

import S1.V;
import p035g0.H;

/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f9256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f9257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f9258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f9259g;

    static {
        float[] fArrH = j.h(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f9212b.f9213a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f9256d = fArrH;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f9257e = fArr;
        f9258f = j.g(fArrH);
        f9259g = j.g(fArr);
    }

    @Override // p040h0.c
    public final float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p040h0.c
    public final float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // p040h0.c
    public final long d(float f6, float f7, float f8) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f9 = f8 <= 0.5f ? f8 : 0.5f;
        float[] fArr = f9259g;
        float f10 = (fArr[6] * f9) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f9) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f9) + (fArr[5] * f7) + (fArr[2] * f6);
        float f13 = f10 * f10 * f10;
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float[] fArr2 = f9258f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f15) + ((fArr2[3] * f14) + (fArr2[0] * f13)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f15) + (fArr2[4] * f14) + (fArr2[1] * f13))));
    }

    @Override // p040h0.c
    public final float e(float f6, float f7, float f8) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        if (f7 > 0.5f) {
            f7 = 0.5f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f9 = f8 <= 0.5f ? f8 : 0.5f;
        float[] fArr = f9259g;
        float f10 = (fArr[6] * f9) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f9) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f9) + (fArr[5] * f7) + (fArr[2] * f6);
        float f13 = f10 * f10 * f10;
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float[] fArr2 = f9258f;
        return (fArr2[8] * f15) + (fArr2[5] * f14) + (fArr2[2] * f13);
    }

    @Override // p040h0.c
    public final long f(float f6, float f7, float f8, float f9, c cVar) {
        float[] fArr = f9256d;
        float f10 = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f6);
        float fY = V.y(f10);
        float fY2 = V.y(f11);
        float fY3 = V.y(f12);
        float[] fArr2 = f9257e;
        return H.b((fArr2[6] * fY3) + (fArr2[3] * fY2) + (fArr2[0] * fY), (fArr2[7] * fY3) + (fArr2[4] * fY2) + (fArr2[1] * fY), (fArr2[8] * fY3) + (fArr2[5] * fY2) + (fArr2[2] * fY), f9, cVar);
    }
}
