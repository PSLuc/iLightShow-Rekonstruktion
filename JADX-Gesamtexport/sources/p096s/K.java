package p096s;

import C1.b;
import N.C0208d;
import N.C0217h0;
import N.U;

/* JADX INFO: loaded from: classes.dex */
public final class K extends b {
    public final C0217h0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0217h0 f11855j;

    public K(Enum r6) {
        super(3);
        U u6 = U.f3673m;
        this.i = C0208d.K(r6, u6);
        this.f11855j = C0208d.K(r6, u6);
    }

    @Override // C1.b
    public final Object j() {
        return this.i.getValue();
    }

    @Override // C1.b
    public final Object k() {
        return this.f11855j.getValue();
    }

    @Override // C1.b
    public final void m(Object obj) {
        this.i.setValue(obj);
    }

    @Override // C1.b
    public final void n(o0 o0Var) {
    }

    @Override // C1.b
    public final void o() {
    }
}
