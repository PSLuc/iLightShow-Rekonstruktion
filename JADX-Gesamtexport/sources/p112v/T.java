package p112v;

import D4.f;
import E4.k;
import L.C0182u1;
import L.C0188w1;
import P4.AbstractC0336x;
import p084p4.x;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class T extends M {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0188w1 f12894E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public W f12895F;
    public boolean G;
    public N H;
    public f I;
    public boolean J;

    @Override // p112v.M
    public final Object F0(K k3, L l6) throws Throwable {
        C0188w1 c0188w1 = this.f12894E;
        P p6 = new P(k3, this, null);
        c0188w1.getClass();
        Object objD = AbstractC0336x.d(new C0182u1(c0188w1, p6, null), l6);
        if (objD != a.f13292h) {
            objD = x.f10867a;
        }
        return objD == a.f13292h ? objD : x.f10867a;
    }

    @Override // p112v.M
    public final void G0(long j4) {
        if (!this.f5969t || k.a(this.H, O.f12871a)) {
            return;
        }
        AbstractC0336x.o(n0(), null, new Q(this, j4, null), 3);
    }

    @Override // p112v.M
    public final void H0(long j4) {
        if (!this.f5969t || k.a(this.I, O.f12872b)) {
            return;
        }
        AbstractC0336x.o(n0(), null, new S(this, j4, null), 3);
    }

    @Override // p112v.M
    public final boolean I0() {
        return this.G;
    }
}
