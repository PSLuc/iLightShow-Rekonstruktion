package p101t;

import D.x;
import N.C0208d;
import N.C0211e0;
import N.D;
import p090r.v;
import p112v.C0997p;
import p112v.C1015y0;
import p112v.InterfaceC1003s0;
import p117w.m;
import p122w4.c;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements InterfaceC1003s0 {
    public static final x i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0211e0 f12417a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12421e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0211e0 f12418b = C0208d.J(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f12419c = new m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0211e0 f12420d = C0208d.J(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0997p f12422f = new C0997p(new v(6, this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f12423g = C0208d.C(new r0(this, 1));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D f12424h = C0208d.C(new r0(this, 0));

    static {
        q0 q0Var = q0.f12403h;
        r rVar = r.f12407m;
        x xVar = W.m.f5538a;
        i = new x(q0Var, 19, rVar);
    }

    public s0(int i3) {
        this.f12417a = C0208d.J(i3);
    }

    @Override // p112v.InterfaceC1003s0
    public final boolean a() {
        return ((Boolean) this.f12424h.getValue()).booleanValue();
    }

    @Override // p112v.InterfaceC1003s0
    public final Object b(int i3, C1015y0 c1015y0, c cVar) {
        Object objB = this.f12422f.b(i3, c1015y0, cVar);
        return objB == a.f13292h ? objB : p084p4.x.f10867a;
    }

    @Override // p112v.InterfaceC1003s0
    public final boolean c() {
        return this.f12422f.c();
    }

    @Override // p112v.InterfaceC1003s0
    public final boolean d() {
        return ((Boolean) this.f12423g.getValue()).booleanValue();
    }

    @Override // p112v.InterfaceC1003s0
    public final float e(float f6) {
        return this.f12422f.e(f6);
    }
}
