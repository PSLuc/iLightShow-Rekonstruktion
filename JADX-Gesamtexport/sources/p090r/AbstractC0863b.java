package p090r;

import p081p0.c;

/* JADX INFO: renamed from: r.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f11397a;

    static {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float[] fArr = new float[101];
        f11397a = fArr;
        float[] fArr2 = new float[101];
        float f15 = 0.0f;
        int i = 0;
        float f16 = 0.0f;
        while (true) {
            float f17 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f18 = i / 100;
            float f19 = 1.0f;
            while (true) {
                f6 = ((f19 - f15) / 2.0f) + f15;
                f7 = f17 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f20 = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
                f10 = f17;
                if (Math.abs(f20 - f18) < 1.0E-5d) {
                    break;
                }
                if (f20 > f18) {
                    f19 = f6;
                } else {
                    f15 = f6;
                }
                f17 = f10;
            }
            float f21 = 0.5f;
            fArr[i] = (((f7 * 0.5f) + f6) * f8) + f9;
            float f22 = f10;
            while (true) {
                f11 = ((f22 - f16) / 2.0f) + f16;
                f12 = f10 - f11;
                f13 = f11 * 3.0f * f12;
                f14 = f11 * f11 * f11;
                float f23 = (((f12 * f21) + f11) * f13) + f14;
                float f24 = f22;
                if (Math.abs(f23 - f18) >= 1.0E-5d) {
                    if (f23 > f18) {
                        f22 = f11;
                    } else {
                        f16 = f11;
                        f22 = f24;
                    }
                    f21 = 0.5f;
                }
            }
            fArr2[i] = (((f11 * 0.35000002f) + (f12 * 0.175f)) * f13) + f14;
            i++;
        }
    }

    public static C0862a a(float f6) {
        float f7 = 0.0f;
        float f8 = 1.0f;
        float fN = c.N(f6, 0.0f, 1.0f);
        float f9 = 100;
        int i = (int) (f9 * fN);
        if (i < 100) {
            float f10 = i / f9;
            int i3 = i + 1;
            float f11 = i3 / f9;
            float[] fArr = f11397a;
            float f12 = fArr[i];
            float f13 = (fArr[i3] - f12) / (f11 - f10);
            float f14 = ((fN - f10) * f13) + f12;
            f7 = f13;
            f8 = f14;
        }
        return new C0862a(f8, f7);
    }
}
