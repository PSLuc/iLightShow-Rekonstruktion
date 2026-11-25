package androidx.compose.foundation;

import E4.k;
import Z.n;
import p101t.K;
import p117w.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6576a;

    public FocusableElement(m mVar) {
        this.f6576a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return k.a(this.f6576a, ((FocusableElement) obj).f6576a);
        }
        return false;
    }

    public final int hashCode() {
        m mVar = this.f6576a;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    @Override // p124x0.Q
    public final n l() {
        return new K(this.f6576a);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((K) nVar).B0(this.f6576a);
    }
}
