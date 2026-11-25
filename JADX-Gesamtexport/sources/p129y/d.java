package p129y;

import E4.k;
import Z.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f14155u;

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    @Override // Z.n
    public final void r0() {
        c cVar = this.f14155u;
        if (cVar != null) {
            cVar.f14154a.o(this);
        }
        if (cVar != null) {
            cVar.f14154a.c(this);
        }
        this.f14155u = cVar;
    }

    @Override // Z.n
    public final void s0() {
        c cVar = this.f14155u;
        if (cVar != null) {
            k.d("null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", cVar);
            cVar.f14154a.o(this);
        }
    }
}
