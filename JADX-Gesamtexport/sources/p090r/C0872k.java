package p090r;

import N.InterfaceC0203a0;
import S0.j;
import p015c2.AbstractC0473d;
import p089q4.v;
import p096s.i0;
import p096s.j0;
import p113v0.E;
import p113v0.G;
import p113v0.H;
import p113v0.N;
import p113v0.r;
import p124x0.M;

/* JADX INFO: renamed from: r.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0872k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f11409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0203a0 f11410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0873l f11411c;

    public C0872k(C0873l c0873l, j0 j0Var, InterfaceC0203a0 interfaceC0203a0) {
        this.f11411c = c0873l;
        this.f11409a = j0Var;
        this.f11410b = interfaceC0203a0;
    }

    @Override // p113v0.r
    public final int c(M m6, E e6, int i) {
        return e6.Z(i);
    }

    @Override // p113v0.r
    public final int d(M m6, E e6, int i) {
        return e6.U(i);
    }

    @Override // p113v0.r
    public final G e(H h6, E e6, long j4) {
        N nC = e6.c(j4);
        C0873l c0873l = this.f11411c;
        i0 i0VarA = this.f11409a.a(new C0870i(c0873l, 0, this), new C0871j(c0873l, 0));
        c0873l.f11417f = i0VarA;
        long jB = h6.s() ? AbstractC0473d.b(nC.f13137h, nC.i) : ((j) i0VarA.getValue()).f4896a;
        return h6.u((int) (jB >> 32), (int) (4294967295L & jB), v.f11238h, new C0869h(c0873l, nC, jB));
    }

    @Override // p113v0.r
    public final int h(M m6, E e6, int i) {
        return e6.Y(i);
    }

    @Override // p113v0.r
    public final int i(M m6, E e6, int i) {
        return e6.d(i);
    }
}
