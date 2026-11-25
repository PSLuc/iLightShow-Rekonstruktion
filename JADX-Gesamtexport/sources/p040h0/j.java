package p040h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f9250a = new s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f9251b = new s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f9252c = new s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f9253d = new s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f9254e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        s sVar = f9251b;
        a aVar = a.f9212b;
        if (b.a(cVar.f9220b, b.f9214a)) {
            q qVar = (q) cVar;
            s sVar2 = qVar.f9265d;
            if (!d(sVar2, sVar)) {
                return new q(qVar.f9219a, qVar.f9269h, sVar, h(c(aVar.f9213a, sVar2.a(), sVar.a()), qVar.i), qVar.f9271k, qVar.f9274n, qVar.f9266e, qVar.f9267f, qVar.f9268g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = (((((f8 * f11) + ((f7 * f10) + (f6 * f9))) - (f9 * f10)) - (f7 * f8)) - (f6 * f11)) * 0.5f;
        return f12 < 0.0f ? -f12 : f12;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        i(fArr, fArr2);
        i(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrG = g(fArr);
        float f6 = fArr4[0];
        float f7 = fArr[0] * f6;
        float f8 = fArr4[1];
        float f9 = fArr[1] * f8;
        float f10 = fArr4[2];
        return h(fArrG, new float[]{f7, f9, fArr[2] * f10, fArr[3] * f6, fArr[4] * f8, fArr[5] * f10, f6 * fArr[6], f8 * fArr[7], f10 * fArr[8]});
    }

    public static final boolean d(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        return Math.abs(sVar.f9285a - sVar2.f9285a) < 0.001f && Math.abs(sVar.f9286b - sVar2.f9286b) < 0.001f;
    }

    public static final g e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new e(cVar, cVar, 1);
        }
        long j4 = b.f9214a;
        return (b.a(cVar.f9220b, j4) && b.a(cVar2.f9220b, j4)) ? new f((q) cVar, (q) cVar2) : new g(cVar, cVar2, 0);
    }

    public static float f(float f6, float f7, float f8, float f9) {
        return (f6 * f9) - (f7 * f8);
    }

    public static final float[] g(float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[3];
        float f8 = fArr[6];
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f10 * f14) - (f11 * f13);
        float f16 = (f11 * f12) - (f9 * f14);
        float f17 = (f9 * f13) - (f10 * f12);
        float f18 = (f8 * f17) + (f7 * f16) + (f6 * f15);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f15 / f18;
        fArr2[1] = f16 / f18;
        fArr2[2] = f17 / f18;
        fArr2[3] = ((f8 * f13) - (f7 * f14)) / f18;
        fArr2[4] = ((f14 * f6) - (f8 * f12)) / f18;
        fArr2[5] = ((f12 * f7) - (f13 * f6)) / f18;
        fArr2[6] = ((f7 * f11) - (f8 * f10)) / f18;
        fArr2[7] = ((f8 * f9) - (f11 * f6)) / f18;
        fArr2[8] = ((f6 * f10) - (f7 * f9)) / f18;
        return fArr2;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        float f6 = fArr[0];
        float f7 = fArr2[0];
        float f8 = fArr[3];
        float f9 = fArr2[1];
        float f10 = fArr[6];
        float f11 = fArr2[2];
        float f12 = (f10 * f11) + (f8 * f9) + (f6 * f7);
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = (f15 * f11) + (f14 * f9) + (f13 * f7);
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[8];
        float f20 = (f11 * f19) + (f9 * f18) + (f7 * f17);
        float f21 = fArr2[3];
        float f22 = fArr2[4];
        float f23 = fArr2[5];
        float f24 = (f10 * f23) + (f8 * f22) + (f6 * f21);
        float f25 = (f15 * f23) + (f14 * f22) + (f13 * f21);
        float f26 = (f23 * f19) + (f22 * f18) + (f21 * f17);
        float f27 = fArr2[6];
        float f28 = fArr2[7];
        float f29 = (f8 * f28) + (f6 * f27);
        float f30 = fArr2[8];
        return new float[]{f12, f16, f20, f24, f25, f26, (f10 * f30) + f29, (f15 * f30) + (f14 * f28) + (f13 * f27), (f19 * f30) + (f18 * f28) + (f17 * f27)};
    }

    public static final void i(float[] fArr, float[] fArr2) {
        float f6 = fArr2[0];
        float f7 = fArr2[1];
        float f8 = fArr2[2];
        fArr2[0] = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f6);
        fArr2[1] = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f6);
        fArr2[2] = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f6);
    }
}
