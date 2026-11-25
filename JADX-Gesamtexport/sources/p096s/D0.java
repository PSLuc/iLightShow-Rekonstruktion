package p096s;

import E4.k;
import F.C0074p;
import p035g0.C0715p;
import p080p.p;
import p080p.q;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements z0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f11821h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0074p f11823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f11824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f11825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AbstractC0924q f11826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0924q f11827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC0924q f11828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC0924q f11829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float[] f11830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float[] f11831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0715p f11832t;

    public D0(p pVar, q qVar, int i, C0074p c0074p) {
        this.f11821h = pVar;
        this.i = qVar;
        this.f11822j = i;
        this.f11823k = c0074p;
    }

    public final int c(int i) {
        int i3;
        p pVar = this.f11821h;
        int i6 = pVar.f10759b;
        if (i6 < 0) {
            throw new IllegalArgumentException("fromIndex(0) > toIndex(" + i6 + ')');
        }
        int i7 = i6 - 1;
        int i8 = 0;
        while (true) {
            if (i8 <= i7) {
                i3 = (i8 + i7) >>> 1;
                int iC = pVar.c(i3);
                if (iC >= i) {
                    if (iC <= i) {
                        break;
                    }
                    i7 = i3 - 1;
                } else {
                    i8 = i3 + 1;
                }
            } else {
                i3 = -(i8 + 1);
                break;
            }
        }
        return i3 < -1 ? -(i3 + 2) : i3;
    }

    public final float d(boolean z5, int i, int i3) {
        InterfaceC0930x interfaceC0930x;
        float f6;
        p pVar = this.f11821h;
        if (i >= pVar.f10759b - 1) {
            f6 = i3;
        } else {
            int iC = pVar.c(i);
            int iC2 = pVar.c(i + 1);
            if (i3 != iC) {
                int i6 = iC2 - iC;
                C0 c6 = (C0) this.i.f(iC);
                if (c6 == null || (interfaceC0930x = c6.f11818b) == null) {
                    interfaceC0930x = this.f11823k;
                }
                float f7 = i6;
                float fA = interfaceC0930x.a((i3 - iC) / f7);
                return z5 ? fA : ((f7 * fA) + iC) / 1000;
            }
            f6 = iC;
        }
        return f6 / 1000;
    }

    public final void e(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        float[] fArr;
        float[] fArr2;
        boolean z5 = this.f11832t != null;
        AbstractC0924q abstractC0924q4 = this.f11826n;
        q qVar = this.i;
        p pVar = this.f11821h;
        if (abstractC0924q4 == null) {
            this.f11826n = abstractC0924q.c();
            this.f11827o = abstractC0924q3.c();
            int i = pVar.f10759b;
            float[] fArr3 = new float[i];
            for (int i3 = 0; i3 < i; i3++) {
                fArr3[i3] = pVar.c(i3) / 1000;
            }
            this.f11825m = fArr3;
            int i6 = pVar.f10759b;
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = 0;
            }
            this.f11824l = iArr;
        }
        if (z5) {
            if (this.f11832t != null) {
                AbstractC0924q abstractC0924q5 = this.f11828p;
                if (abstractC0924q5 == null) {
                    k.m("lastInitialValue");
                    throw null;
                }
                if (abstractC0924q5.equals(abstractC0924q)) {
                    AbstractC0924q abstractC0924q6 = this.f11829q;
                    if (abstractC0924q6 == null) {
                        k.m("lastTargetValue");
                        throw null;
                    }
                    if (abstractC0924q6.equals(abstractC0924q2)) {
                        return;
                    }
                }
            }
            this.f11828p = abstractC0924q;
            this.f11829q = abstractC0924q2;
            int iB = abstractC0924q.b() + (abstractC0924q.b() % 2);
            this.f11830r = new float[iB];
            this.f11831s = new float[iB];
            int i8 = pVar.f10759b;
            float[][] fArr4 = new float[i8][];
            for (int i9 = 0; i9 < i8; i9++) {
                int iC = pVar.c(i9);
                if (iC != 0) {
                    if (iC != this.f11822j) {
                        fArr = new float[iB];
                        Object objF = qVar.f(iC);
                        k.c(objF);
                        C0 c6 = (C0) objF;
                        for (int i10 = 0; i10 < iB; i10++) {
                            fArr[i10] = c6.f11817a.a(i10);
                        }
                    } else if (qVar.b(iC)) {
                        fArr = new float[iB];
                        Object objF2 = qVar.f(iC);
                        k.c(objF2);
                        C0 c7 = (C0) objF2;
                        for (int i11 = 0; i11 < iB; i11++) {
                            fArr[i11] = c7.f11817a.a(i11);
                        }
                    } else {
                        fArr2 = new float[iB];
                        for (int i12 = 0; i12 < iB; i12++) {
                            fArr2[i12] = abstractC0924q2.a(i12);
                        }
                    }
                    fArr2 = fArr;
                } else if (qVar.b(iC)) {
                    fArr = new float[iB];
                    Object objF3 = qVar.f(iC);
                    k.c(objF3);
                    C0 c8 = (C0) objF3;
                    for (int i13 = 0; i13 < iB; i13++) {
                        fArr[i13] = c8.f11817a.a(i13);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[iB];
                    for (int i14 = 0; i14 < iB; i14++) {
                        fArr2[i14] = abstractC0924q.a(i14);
                    }
                }
                fArr4[i9] = fArr2;
            }
            int[] iArr2 = this.f11824l;
            if (iArr2 == null) {
                k.m("modes");
                throw null;
            }
            float[] fArr5 = this.f11825m;
            if (fArr5 == null) {
                k.m("times");
                throw null;
            }
            this.f11832t = new C0715p(iArr2, fArr5, fArr4);
        }
    }

    @Override // p096s.y0
    public final AbstractC0924q f(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) throws Throwable {
        int i;
        Throwable th;
        int length;
        AbstractC0924q abstractC0924q4 = abstractC0924q;
        AbstractC0924q abstractC0924q5 = abstractC0924q2;
        boolean z5 = true;
        int i3 = 0;
        int i6 = this.f11822j;
        int iP = (int) c.P((j4 / 1000000) - ((long) 0), 0L, i6);
        q qVar = this.i;
        if (qVar.b(iP)) {
            Object objF = qVar.f(iP);
            k.c(objF);
            return ((C0) objF).f11817a;
        }
        if (iP >= i6) {
            return abstractC0924q5;
        }
        if (iP <= 0) {
            return abstractC0924q4;
        }
        e(abstractC0924q4, abstractC0924q5, abstractC0924q3);
        if (this.f11832t == null) {
            int iC = c(iP);
            float fD = d(true, iC, iP);
            p pVar = this.f11821h;
            int iC2 = pVar.c(iC);
            if (qVar.b(iC2)) {
                Object objF2 = qVar.f(iC2);
                k.c(objF2);
                abstractC0924q4 = ((C0) objF2).f11817a;
            }
            int iC3 = pVar.c(iC + 1);
            if (qVar.b(iC3)) {
                Object objF3 = qVar.f(iC3);
                k.c(objF3);
                abstractC0924q5 = ((C0) objF3).f11817a;
            }
            AbstractC0924q abstractC0924q6 = this.f11826n;
            if (abstractC0924q6 == null) {
                k.m("valueVector");
                throw null;
            }
            int iB = abstractC0924q6.b();
            for (int i7 = 0; i7 < iB; i7++) {
                AbstractC0924q abstractC0924q7 = this.f11826n;
                if (abstractC0924q7 == null) {
                    k.m("valueVector");
                    throw null;
                }
                float fA = abstractC0924q4.a(i7);
                float fA2 = abstractC0924q5.a(i7);
                w0 w0Var = x0.f12138a;
                abstractC0924q7.e(i7, (fA2 * fD) + ((1 - fD) * fA));
            }
            AbstractC0924q abstractC0924q8 = this.f11826n;
            if (abstractC0924q8 != null) {
                return abstractC0924q8;
            }
            k.m("valueVector");
            throw null;
        }
        float fD2 = d(false, c(iP), iP);
        C0715p c0715p = this.f11832t;
        if (c0715p == null) {
            k.m("arcSpline");
            throw null;
        }
        float[] fArr = this.f11830r;
        if (fArr == null) {
            k.m("posArray");
            throw null;
        }
        C0925s[][] c0925sArr = (C0925s[][]) c0715p.i;
        float f6 = c0925sArr[0][0].f12097a;
        if (fD2 >= f6 && fD2 <= c0925sArr[c0925sArr.length - 1][0].f12098b) {
            int length2 = c0925sArr.length;
            int i8 = 0;
            boolean z6 = false;
            while (true) {
                if (i8 >= length2) {
                    i = i3;
                    th = null;
                    break;
                }
                int i9 = i3;
                int i10 = i9;
                while (i9 < fArr.length) {
                    C0925s c0925s = c0925sArr[i8][i10];
                    if (fD2 <= c0925s.f12098b) {
                        if (c0925s.f12113r) {
                            float f7 = c0925s.f12097a;
                            float f8 = c0925s.f12106k;
                            float f9 = c0925s.f12101e;
                            float f10 = c0925s.f12099c;
                            fArr[i9] = ((f9 - f10) * (fD2 - f7) * f8) + f10;
                            float f11 = (fD2 - f7) * f8;
                            float f12 = c0925s.f12102f;
                            float f13 = c0925s.f12100d;
                            fArr[i9 + 1] = ((f12 - f13) * f11) + f13;
                        } else {
                            c0925s.c(fD2);
                            C0925s c0925s2 = c0925sArr[i8][i10];
                            fArr[i9] = (c0925s2.f12107l * c0925s2.f12104h) + c0925s2.f12109n;
                            fArr[i9 + 1] = (c0925s2.f12108m * c0925s2.i) + c0925s2.f12110o;
                        }
                        z6 = z5;
                    } else {
                        z5 = z5;
                        i3 = i3;
                    }
                    i9 += 2;
                    i10++;
                    i3 = i3;
                    z5 = z5;
                }
                boolean z7 = z5;
                i = i3;
                th = null;
                if (z6) {
                    break;
                }
                i8++;
                i3 = i;
                z5 = z7;
            }
        } else {
            i = 0;
            th = null;
            if (fD2 > c0925sArr[c0925sArr.length - 1][0].f12098b) {
                length = c0925sArr.length - 1;
                f6 = c0925sArr[c0925sArr.length - 1][0].f12098b;
            } else {
                length = 0;
            }
            float f14 = fD2 - f6;
            int i11 = 0;
            int i12 = 0;
            while (i11 < fArr.length) {
                C0925s c0925s3 = c0925sArr[length][i12];
                if (c0925s3.f12113r) {
                    float f15 = c0925s3.f12097a;
                    float f16 = c0925s3.f12106k;
                    float f17 = c0925s3.f12101e;
                    float f18 = c0925s3.f12099c;
                    fArr[i11] = (c0925s3.f12109n * f14) + ((f17 - f18) * (f6 - f15) * f16) + f18;
                    float f19 = (f6 - f15) * f16;
                    float f20 = c0925s3.f12102f;
                    float f21 = c0925s3.f12100d;
                    fArr[i11 + 1] = (c0925s3.f12110o * f14) + ((f20 - f21) * f19) + f21;
                } else {
                    c0925s3.c(f6);
                    C0925s c0925s4 = c0925sArr[length][i12];
                    fArr[i11] = (c0925s4.a() * f14) + (c0925s4.f12107l * c0925s4.f12104h) + c0925s4.f12109n;
                    C0925s c0925s5 = c0925sArr[length][i12];
                    fArr[i11 + 1] = (c0925s5.b() * f14) + (c0925s5.f12108m * c0925s5.i) + c0925s5.f12110o;
                }
                i11 += 2;
                i12++;
            }
        }
        float[] fArr2 = this.f11830r;
        if (fArr2 == null) {
            k.m("posArray");
            throw th;
        }
        int length3 = fArr2.length;
        for (int i13 = i; i13 < length3; i13++) {
            AbstractC0924q abstractC0924q9 = this.f11826n;
            if (abstractC0924q9 == null) {
                k.m("valueVector");
                throw th;
            }
            float[] fArr3 = this.f11830r;
            if (fArr3 == null) {
                k.m("posArray");
                throw th;
            }
            abstractC0924q9.e(i13, fArr3[i13]);
        }
        AbstractC0924q abstractC0924q10 = this.f11826n;
        if (abstractC0924q10 != null) {
            return abstractC0924q10;
        }
        k.m("valueVector");
        throw th;
    }

    @Override // p096s.z0
    public final int g() {
        return 0;
    }

    @Override // p096s.z0
    public final int j() {
        return this.f11822j;
    }

    @Override // p096s.y0
    public final AbstractC0924q k(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) throws Throwable {
        int i = 0;
        long jP = c.P((j4 / 1000000) - ((long) 0), 0L, this.f11822j);
        if (jP < 0) {
            return abstractC0924q3;
        }
        e(abstractC0924q, abstractC0924q2, abstractC0924q3);
        if (this.f11832t == null) {
            AbstractC0924q abstractC0924qF = f((jP - 1) * 1000000, abstractC0924q, abstractC0924q2, abstractC0924q3);
            AbstractC0924q abstractC0924qF2 = f(jP * 1000000, abstractC0924q, abstractC0924q2, abstractC0924q3);
            int iB = abstractC0924qF.b();
            while (i < iB) {
                AbstractC0924q abstractC0924q4 = this.f11827o;
                if (abstractC0924q4 == null) {
                    k.m("velocityVector");
                    throw null;
                }
                abstractC0924q4.e(i, (abstractC0924qF.a(i) - abstractC0924qF2.a(i)) * 1000.0f);
                i++;
            }
            AbstractC0924q abstractC0924q5 = this.f11827o;
            if (abstractC0924q5 != null) {
                return abstractC0924q5;
            }
            k.m("velocityVector");
            throw null;
        }
        int i3 = (int) jP;
        float fD = d(false, c(i3), i3);
        C0715p c0715p = this.f11832t;
        if (c0715p == null) {
            k.m("arcSpline");
            throw null;
        }
        float[] fArr = this.f11831s;
        if (fArr == null) {
            k.m("slopeArray");
            throw null;
        }
        C0925s[][] c0925sArr = (C0925s[][]) c0715p.i;
        float f6 = c0925sArr[0][0].f12097a;
        if (fD < f6) {
            fD = f6;
        } else if (fD > c0925sArr[c0925sArr.length - 1][0].f12098b) {
            fD = c0925sArr[c0925sArr.length - 1][0].f12098b;
        }
        int length = c0925sArr.length;
        boolean z5 = false;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < fArr.length) {
                C0925s c0925s = c0925sArr[i6][i8];
                if (fD <= c0925s.f12098b) {
                    if (c0925s.f12113r) {
                        fArr[i7] = c0925s.f12109n;
                        fArr[i7 + 1] = c0925s.f12110o;
                    } else {
                        c0925s.c(fD);
                        fArr[i7] = c0925sArr[i6][i8].a();
                        fArr[i7 + 1] = c0925sArr[i6][i8].b();
                    }
                    z5 = true;
                }
                i7 += 2;
                i8++;
            }
            if (z5) {
                break;
            }
        }
        float[] fArr2 = this.f11831s;
        if (fArr2 == null) {
            k.m("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i < length2) {
            AbstractC0924q abstractC0924q6 = this.f11827o;
            if (abstractC0924q6 == null) {
                k.m("velocityVector");
                throw null;
            }
            float[] fArr3 = this.f11831s;
            if (fArr3 == null) {
                k.m("slopeArray");
                throw null;
            }
            abstractC0924q6.e(i, fArr3[i]);
            i++;
        }
        AbstractC0924q abstractC0924q7 = this.f11827o;
        if (abstractC0924q7 != null) {
            return abstractC0924q7;
        }
        k.m("velocityVector");
        throw null;
    }
}
