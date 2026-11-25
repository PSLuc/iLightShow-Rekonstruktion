package B;

import G0.AbstractC0111g;
import G0.C0110f;
import N.C0208d;
import N.C0217h0;
import N.C0235q0;
import p113v0.InterfaceC1033p;

/* JADX INFO: renamed from: B.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0036s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0 f416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0235q0 f417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p130y0.C0 f418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D.x f419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public M0.B f420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0217h0 f421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0217h0 f422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1033p f423h;
    public final C0217h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0110f f424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0217h0 f425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0217h0 f426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0217h0 f427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0217h0 f428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0217h0 f429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0217h0 f431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0031p0 f432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D4.c f433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J f434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final J f435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final O1.u f436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0217h0 f438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0217h0 f439y;

    public C0036s0(C0 c6, C0235q0 c0235q0, p130y0.C0 c7) {
        this.f416a = c6;
        this.f417b = c0235q0;
        this.f418c = c7;
        D.x xVar = new D.x(9, false);
        C0110f c0110f = AbstractC0111g.f1497a;
        long j4 = G0.I.f1468b;
        M0.w wVar = new M0.w(c0110f, j4, (G0.I) null);
        xVar.i = wVar;
        xVar.f707j = new M0.j(c0110f, wVar.f3454b);
        this.f419d = xVar;
        Boolean bool = Boolean.FALSE;
        N.U u6 = N.U.f3673m;
        this.f421f = C0208d.K(bool, u6);
        this.f422g = C0208d.K(new S0.e(0), u6);
        this.i = C0208d.K(null, u6);
        this.f425k = C0208d.K(EnumC0011f0.f312h, u6);
        this.f426l = C0208d.K(bool, u6);
        this.f427m = C0208d.K(bool, u6);
        this.f428n = C0208d.K(bool, u6);
        this.f429o = C0208d.K(bool, u6);
        this.f430p = true;
        this.f431q = C0208d.K(Boolean.TRUE, u6);
        this.f432r = new C0031p0(c7);
        this.f433s = C0022l.f355l;
        this.f434t = new J(this, 5);
        this.f435u = new J(this, 4);
        this.f436v = p035g0.H.g();
        this.f437w = p035g0.r.f9085l;
        this.f438x = C0208d.K(new G0.I(j4), u6);
        this.f439y = C0208d.K(new G0.I(j4), u6);
    }

    public final EnumC0011f0 a() {
        return (EnumC0011f0) this.f425k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f421f.getValue()).booleanValue();
    }

    public final InterfaceC1033p c() {
        InterfaceC1033p interfaceC1033p = this.f423h;
        if (interfaceC1033p == null || !interfaceC1033p.K()) {
            return null;
        }
        return interfaceC1033p;
    }

    public final a1 d() {
        return (a1) this.i.getValue();
    }

    public final void e(long j4) {
        this.f439y.setValue(new G0.I(j4));
    }

    public final void f(long j4) {
        this.f438x.setValue(new G0.I(j4));
    }
}
