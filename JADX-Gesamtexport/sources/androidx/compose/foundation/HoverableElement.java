package androidx.compose.foundation;

import E4.k;
import Z.n;
import p101t.U;
import p117w.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6577a;

    public HoverableElement(m mVar) {
        this.f6577a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && k.a(((HoverableElement) obj).f6577a, this.f6577a);
    }

    public final int hashCode() {
        return this.f6577a.hashCode() * 31;
    }

    @Override // p124x0.Q
    public final n l() {
        U u6 = new U();
        u6.f12274u = this.f6577a;
        return u6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        U u6 = (U) nVar;
        m mVar = u6.f12274u;
        m mVar2 = this.f6577a;
        if (k.a(mVar, mVar2)) {
            return;
        }
        u6.A0();
        u6.f12274u = mVar2;
    }
}
