package L;

import B.C0039u;
import B.C0043w;
import N.C0208d;
import N.C0209d0;
import N.C0211e0;
import N.C0217h0;

/* JADX INFO: renamed from: L.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0039u f2954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J4.a f2955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0209d0 f2956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D4.c f2957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f2958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0211e0 f2959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2960h;
    public final C0209d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0217h0 f2961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0043w f2962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0209d0 f2963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0209d0 f2964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0185v1 f2965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p101t.i0 f2966o;

    public C0188w1(float f6, int i, C0039u c0039u, J4.a aVar) {
        float[] fArr;
        this.f2953a = i;
        this.f2954b = c0039u;
        this.f2955c = aVar;
        this.f2956d = C0208d.I(f6);
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
        this.f2958f = fArr;
        this.f2959g = C0208d.J(0);
        this.i = C0208d.I(0.0f);
        this.f2961j = C0208d.K(Boolean.FALSE, N.U.f3673m);
        this.f2962k = new C0043w(17, this);
        this.f2963l = C0208d.I(AbstractC0176s1.m(aVar.f1939a, aVar.f1940b, f6, 0.0f, 0.0f));
        this.f2964m = C0208d.I(0.0f);
        this.f2965n = new C0185v1(this);
        this.f2966o = new p101t.i0();
    }

    public final void a(float f6) {
        float fH = this.f2959g.h();
        C0209d0 c0209d0 = this.i;
        float f7 = 2;
        float fMax = Math.max(fH - (c0209d0.h() / f7), 0.0f);
        float fMin = Math.min(c0209d0.h() / f7, fMax);
        C0209d0 c0209d1 = this.f2963l;
        float fH2 = c0209d1.h() + f6;
        C0209d0 c0209d2 = this.f2964m;
        c0209d1.j(c0209d2.h() + fH2);
        c0209d2.j(0.0f);
        float fK = AbstractC0176s1.k(c0209d1.h(), this.f2958f, fMin, fMax);
        J4.a aVar = this.f2955c;
        float fM = AbstractC0176s1.m(fMin, fMax, fK, aVar.f1939a, aVar.f1940b);
        if (fM == this.f2956d.h()) {
            return;
        }
        D4.c cVar = this.f2957e;
        if (cVar != null) {
            cVar.invoke(Float.valueOf(fM));
        } else {
            c(fM);
        }
    }

    public final float b() {
        J4.a aVar = this.f2955c;
        float fH = this.f2956d.h();
        float f6 = aVar.f1939a;
        float f7 = aVar.f1940b;
        return AbstractC0176s1.l(f6, f7, p081p0.c.N(fH, f6, f7));
    }

    public final void c(float f6) {
        J4.a aVar = this.f2955c;
        float f7 = aVar.f1939a;
        float f8 = aVar.f1940b;
        this.f2956d.j(AbstractC0176s1.k(p081p0.c.N(f6, f7, f8), this.f2958f, f7, f8));
    }
}
