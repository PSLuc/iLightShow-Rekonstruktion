package p124x0;

import E4.k;
import S0.a;
import p113v0.C1029l;
import p113v0.N;

/* JADX INFO: renamed from: x0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1115x extends N {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1116y f14067y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115x(C1116y c1116y) {
        super(c1116y);
        this.f14067y = c1116y;
    }

    @Override // p113v0.E
    public final int U(int i) {
        C1116y c1116y = this.f14067y;
        InterfaceC1114w interfaceC1114w = c1116y.f14069Q;
        Y y2 = c1116y.f13990t;
        k.c(y2);
        N nK0 = y2.K0();
        k.c(nK0);
        return interfaceC1114w.d(this, nK0, i);
    }

    @Override // p113v0.E
    public final int Y(int i) {
        C1116y c1116y = this.f14067y;
        InterfaceC1114w interfaceC1114w = c1116y.f14069Q;
        Y y2 = c1116y.f13990t;
        k.c(y2);
        N nK0 = y2.K0();
        k.c(nK0);
        return interfaceC1114w.h(this, nK0, i);
    }

    @Override // p113v0.E
    public final int Z(int i) {
        C1116y c1116y = this.f14067y;
        InterfaceC1114w interfaceC1114w = c1116y.f14069Q;
        Y y2 = c1116y.f13990t;
        k.c(y2);
        N nK0 = y2.K0();
        k.c(nK0);
        return interfaceC1114w.c(this, nK0, i);
    }

    @Override // p113v0.E
    public final N c(long j4) {
        o0(j4);
        new a(j4);
        C1116y c1116y = this.f14067y;
        c1116y.getClass();
        InterfaceC1114w interfaceC1114w = c1116y.f14069Q;
        Y y2 = c1116y.f13990t;
        k.c(y2);
        N nK0 = y2.K0();
        k.c(nK0);
        N.A0(this, interfaceC1114w.e(this, nK0, j4));
        return this;
    }

    @Override // p113v0.E
    public final int d(int i) {
        C1116y c1116y = this.f14067y;
        InterfaceC1114w interfaceC1114w = c1116y.f14069Q;
        Y y2 = c1116y.f13990t;
        k.c(y2);
        N nK0 = y2.K0();
        k.c(nK0);
        return interfaceC1114w.i(this, nK0, i);
    }

    @Override // p124x0.M
    public final int p0(C1029l c1029l) {
        int iC = AbstractC1098f.c(this, c1029l);
        this.f13944x.put(c1029l, Integer.valueOf(iC));
        return iC;
    }
}
