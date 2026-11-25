package p058l0;

import B.C0031p0;
import N.C0208d;
import N.C0211e0;
import N.C0217h0;
import N.U;
import S0.k;
import p030f0.f;
import p035g0.C0709j;
import p035g0.C0715p;
import p053k0.b;
import p124x0.F;

/* JADX INFO: loaded from: classes.dex */
public final class J extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217h0 f10219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0217h0 f10220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final E f10221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0211e0 f10222h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0709j f10223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10224k;

    public J(C0820c c0820c) {
        f fVar = new f(0L);
        U u6 = U.f3673m;
        this.f10219e = C0208d.K(fVar, u6);
        this.f10220f = C0208d.K(Boolean.FALSE, u6);
        E e6 = new E(c0820c);
        e6.f10201f = new I(0, this);
        this.f10221g = e6;
        this.f10222h = C0208d.J(0);
        this.i = 1.0f;
        this.f10224k = -1;
    }

    @Override // p053k0.b
    public final void a(float f6) {
        this.i = f6;
    }

    @Override // p053k0.b
    public final void b(C0709j c0709j) {
        this.f10223j = c0709j;
    }

    @Override // p053k0.b
    public final long d() {
        return ((f) this.f10219e.getValue()).f8851a;
    }

    @Override // p053k0.b
    public final void e(F f6) {
        C0709j c0709j = this.f10223j;
        E e6 = this.f10221g;
        if (c0709j == null) {
            c0709j = (C0709j) e6.f10202g.getValue();
        }
        if (((Boolean) this.f10220f.getValue()).booleanValue() && f6.getLayoutDirection() == k.i) {
            p044i0.b bVar = f6.f13862h;
            long jN = bVar.N();
            C0031p0 c0031p0 = bVar.i;
            long jL = c0031p0.l();
            c0031p0.f().l();
            try {
                ((C0715p) c0031p0.i).y(-1.0f, 1.0f, jN);
                e6.e(f6, this.i, c0709j);
                c0031p0.f().i();
                c0031p0.x(jL);
            } catch (Throwable th) {
                c0031p0.f().i();
                c0031p0.x(jL);
                throw th;
            }
        } else {
            e6.e(f6, this.i, c0709j);
        }
        this.f10224k = this.f10222h.h();
    }
}
