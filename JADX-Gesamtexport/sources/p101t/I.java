package p101t;

import P4.AbstractC0336x;
import P4.C0332t;
import P4.T;
import U4.d;
import Z.n;
import p090r.C0870i;
import p117w.e;
import p117w.l;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public final class I extends n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f12246u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f12247v;

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    public final void y0(m mVar, l lVar) {
        if (!this.f5969t) {
            mVar.b(lVar);
            return;
        }
        T t6 = (T) ((d) n0()).f5349h.J(C0332t.i);
        AbstractC0336x.o(n0(), null, new H(mVar, lVar, t6 != null ? t6.Q(new C0870i(mVar, 9, lVar)) : null, null), 3);
    }
}
