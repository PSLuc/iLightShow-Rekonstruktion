package androidx.compose.foundation.relocation;

import E4.k;
import Z.n;
import p124x0.Q;
import p129y.c;
import p129y.d;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6640a;

    public BringIntoViewRequesterElement(c cVar) {
        this.f6640a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return k.a(this.f6640a, ((BringIntoViewRequesterElement) obj).f6640a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6640a.hashCode();
    }

    @Override // p124x0.Q
    public final n l() {
        d dVar = new d();
        dVar.f14155u = this.f6640a;
        return dVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        d dVar = (d) nVar;
        c cVar = dVar.f14155u;
        if (cVar != null) {
            cVar.f14154a.o(dVar);
        }
        c cVar2 = this.f6640a;
        if (cVar2 != null) {
            cVar2.f14154a.c(dVar);
        }
        dVar.f14155u = cVar2;
    }
}
