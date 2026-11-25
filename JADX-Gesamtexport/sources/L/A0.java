package L;

import B.C0039u;
import N.C0208d;
import N.C0209d0;
import N.C0211e0;
import N.C0217h0;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0039u f2145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J4.a f2146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0209d0 f2147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0209d0 f2148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D4.c f2149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f2150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0209d0 f2151h;
    public final C0209d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0211e0 f2152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0209d0 f2153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0209d0 f2154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0217h0 f2155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A2.e f2156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0209d0 f2157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0209d0 f2158p;

    public A0(float f6, float f7, int i, C0039u c0039u, J4.a aVar) {
        float[] fArr;
        this.f2144a = i;
        this.f2145b = c0039u;
        this.f2146c = aVar;
        this.f2147d = C0208d.I(f6);
        this.f2148e = C0208d.I(f7);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i3 = i + 2;
            float[] fArr2 = new float[i3];
            for (int i6 = 0; i6 < i3; i6++) {
                fArr2[i6] = i6 / (i + 1);
            }
            fArr = fArr2;
        }
        this.f2150g = fArr;
        this.f2151h = C0208d.I(0.0f);
        this.i = C0208d.I(0.0f);
        this.f2152j = C0208d.J(0);
        this.f2153k = C0208d.I(0.0f);
        this.f2154l = C0208d.I(0.0f);
        this.f2155m = C0208d.K(Boolean.FALSE, N.U.f3673m);
        this.f2156n = new A2.e(12, this);
        this.f2157o = C0208d.I(0.0f);
        this.f2158p = C0208d.I(0.0f);
    }

    public final float a() {
        J4.a aVar = this.f2146c;
        return AbstractC0176s1.l(aVar.f1939a, aVar.f1940b, this.f2148e.h());
    }

    public final float b() {
        J4.a aVar = this.f2146c;
        return AbstractC0176s1.l(aVar.f1939a, aVar.f1940b, this.f2147d.h());
    }

    public final int c() {
        return (int) Math.floor((1.0f - b()) * this.f2144a);
    }

    public final int d() {
        return (int) Math.floor(a() * this.f2144a);
    }

    public final void e(float f6, boolean z5) {
        long jI;
        C0209d0 c0209d0 = this.f2147d;
        C0209d0 c0209d1 = this.f2148e;
        C0209d0 c0209d2 = this.f2154l;
        C0209d0 c0209d3 = this.f2153k;
        C0209d0 c0209d4 = this.f2157o;
        C0209d0 c0209d5 = this.f2158p;
        float[] fArr = this.f2150g;
        if (z5) {
            c0209d3.j(c0209d3.h() + f6);
            c0209d2.j(f(c0209d5.h(), c0209d4.h(), c0209d1.h()));
            float fH = c0209d2.h();
            jI = AbstractC0176s1.i(AbstractC0176s1.k(p081p0.c.N(c0209d3.h(), c0209d5.h(), fH), fArr, c0209d5.h(), c0209d4.h()), fH);
        } else {
            c0209d2.j(c0209d2.h() + f6);
            c0209d3.j(f(c0209d5.h(), c0209d4.h(), c0209d0.h()));
            float fH2 = c0209d3.h();
            jI = AbstractC0176s1.i(fH2, AbstractC0176s1.k(p081p0.c.N(c0209d2.h(), fH2, c0209d4.h()), fArr, c0209d5.h(), c0209d4.h()));
        }
        float fH3 = c0209d5.h();
        float fH4 = c0209d4.h();
        J4.a aVar = this.f2146c;
        float fB = C0179t1.b(jI);
        float f7 = aVar.f1939a;
        float f8 = aVar.f1940b;
        long jI2 = AbstractC0176s1.i(AbstractC0176s1.m(fH3, fH4, fB, f7, f8), AbstractC0176s1.m(fH3, fH4, C0179t1.a(jI), f7, f8));
        if (jI2 == AbstractC0176s1.i(c0209d0.h(), c0209d1.h())) {
            return;
        }
        D4.c cVar = this.f2149f;
        if (cVar != null) {
            cVar.invoke(new C0179t1(jI2));
        } else {
            h(C0179t1.b(jI2));
            g(C0179t1.a(jI2));
        }
    }

    public final float f(float f6, float f7, float f8) {
        J4.a aVar = this.f2146c;
        return AbstractC0176s1.m(Float.valueOf(aVar.f1939a).floatValue(), Float.valueOf(aVar.f1940b).floatValue(), f8, f6, f7);
    }

    public final void g(float f6) {
        float fH = this.f2147d.h();
        J4.a aVar = this.f2146c;
        float f7 = aVar.f1940b;
        this.f2148e.j(AbstractC0176s1.k(p081p0.c.N(f6, fH, f7), this.f2150g, aVar.f1939a, f7));
    }

    public final void h(float f6) {
        J4.a aVar = this.f2146c;
        float fH = this.f2148e.h();
        float f7 = aVar.f1939a;
        this.f2147d.j(AbstractC0176s1.k(p081p0.c.N(f6, f7, fH), this.f2150g, f7, aVar.f1940b));
    }
}
