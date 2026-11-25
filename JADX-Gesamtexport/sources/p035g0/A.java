package p035g0;

import E4.k;
import M4.m;
import java.util.Arrays;
import p030f0.b;
import p030f0.c;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9008a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j4, float[] fArr) {
        float fD = c.d(j4);
        float fE = c.e(j4);
        float f6 = 1 / (((fArr[7] * fE) + (fArr[3] * fD)) + fArr[15]);
        if (Float.isInfinite(f6) || Float.isNaN(f6)) {
            f6 = 0.0f;
        }
        return p081p0.c.y(((fArr[4] * fE) + (fArr[0] * fD) + fArr[12]) * f6, ((fArr[5] * fE) + (fArr[1] * fD) + fArr[13]) * f6);
    }

    public static final void c(float[] fArr, b bVar) {
        long jB = b(p081p0.c.y(bVar.f8833a, bVar.f8834b), fArr);
        long jB2 = b(p081p0.c.y(bVar.f8833a, bVar.f8836d), fArr);
        long jB3 = b(p081p0.c.y(bVar.f8835c, bVar.f8834b), fArr);
        long jB4 = b(p081p0.c.y(bVar.f8835c, bVar.f8836d), fArr);
        bVar.f8833a = Math.min(Math.min(c.d(jB), c.d(jB2)), Math.min(c.d(jB3), c.d(jB4)));
        bVar.f8834b = Math.min(Math.min(c.e(jB), c.e(jB2)), Math.min(c.e(jB3), c.e(jB4)));
        bVar.f8835c = Math.max(Math.max(c.d(jB), c.d(jB2)), Math.max(c.d(jB3), c.d(jB4)));
        bVar.f8836d = Math.max(Math.max(c.e(jB), c.e(jB2)), Math.max(c.e(jB3), c.e(jB4)));
    }

    public static final void d(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i3 = 0;
            while (i3 < 4) {
                fArr[(i3 * 4) + i] = i == i3 ? 1.0f : 0.0f;
                i3++;
            }
            i++;
        }
    }

    public static final void e(float[] fArr, float f6) {
        double d6 = (((double) f6) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d6);
        float fSin = (float) Math.sin(d6);
        float f7 = fArr[0];
        float f8 = fArr[4];
        float f9 = (fSin * f8) + (fCos * f7);
        float f10 = -fSin;
        float f11 = (f8 * fCos) + (f7 * f10);
        float f12 = fArr[1];
        float f13 = fArr[5];
        float f14 = (fSin * f13) + (fCos * f12);
        float f15 = (f13 * fCos) + (f12 * f10);
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = (fSin * f17) + (fCos * f16);
        float f19 = (f17 * fCos) + (f16 * f10);
        float f20 = fArr[3];
        float f21 = fArr[7];
        float f22 = (fSin * f21) + (fCos * f20);
        fArr[0] = f9;
        fArr[1] = f14;
        fArr[2] = f18;
        fArr[3] = f22;
        fArr[4] = f11;
        fArr[5] = f15;
        fArr[6] = f19;
        fArr[7] = (fCos * f21) + (f10 * f20);
    }

    public static final void f(float[] fArr, float f6, float f7) {
        fArr[0] = fArr[0] * f6;
        fArr[1] = fArr[1] * f6;
        fArr[2] = fArr[2] * f6;
        fArr[3] = fArr[3] * f6;
        fArr[4] = fArr[4] * f7;
        fArr[5] = fArr[5] * f7;
        fArr[6] = fArr[6] * f7;
        fArr[7] = fArr[7] * f7;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float fJ = H.j(fArr, 0, fArr2, 0);
        float fJ2 = H.j(fArr, 0, fArr2, 1);
        float fJ3 = H.j(fArr, 0, fArr2, 2);
        float fJ4 = H.j(fArr, 0, fArr2, 3);
        float fJ5 = H.j(fArr, 1, fArr2, 0);
        float fJ6 = H.j(fArr, 1, fArr2, 1);
        float fJ7 = H.j(fArr, 1, fArr2, 2);
        float fJ8 = H.j(fArr, 1, fArr2, 3);
        float fJ9 = H.j(fArr, 2, fArr2, 0);
        float fJ10 = H.j(fArr, 2, fArr2, 1);
        float fJ11 = H.j(fArr, 2, fArr2, 2);
        float fJ12 = H.j(fArr, 2, fArr2, 3);
        float fJ13 = H.j(fArr, 3, fArr2, 0);
        float fJ14 = H.j(fArr, 3, fArr2, 1);
        float fJ15 = H.j(fArr, 3, fArr2, 2);
        float fJ16 = H.j(fArr, 3, fArr2, 3);
        fArr[0] = fJ;
        fArr[1] = fJ2;
        fArr[2] = fJ3;
        fArr[3] = fJ4;
        fArr[4] = fJ5;
        fArr[5] = fJ6;
        fArr[6] = fJ7;
        fArr[7] = fJ8;
        fArr[8] = fJ9;
        fArr[9] = fJ10;
        fArr[10] = fJ11;
        fArr[11] = fJ12;
        fArr[12] = fJ13;
        fArr[13] = fJ14;
        fArr[14] = fJ15;
        fArr[15] = fJ16;
    }

    public static final void h(float[] fArr, float f6, float f7) {
        float f8 = (fArr[8] * 0.0f) + (fArr[4] * f7) + (fArr[0] * f6) + fArr[12];
        float f9 = (fArr[9] * 0.0f) + (fArr[5] * f7) + (fArr[1] * f6) + fArr[13];
        float f10 = (fArr[10] * 0.0f) + (fArr[6] * f7) + (fArr[2] * f6) + fArr[14];
        float f11 = (fArr[11] * 0.0f) + (fArr[7] * f7) + (fArr[3] * f6) + fArr[15];
        fArr[12] = f8;
        fArr[13] = f9;
        fArr[14] = f10;
        fArr[15] = f11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return k.a(this.f9008a, ((A) obj).f9008a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9008a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f9008a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return m.N(sb.toString());
    }
}
