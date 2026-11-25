package androidx.compose.foundation;

import E4.k;
import Z.n;
import p101t.A;
import p117w.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D4.a f6575b;

    public CombinedClickableElement(m mVar, D4.a aVar) {
        this.f6574a = mVar;
        this.f6575b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return k.a(this.f6574a, combinedClickableElement.f6574a) && this.f6575b == combinedClickableElement.f6575b;
    }

    public final int hashCode() {
        m mVar = this.f6574a;
        return (this.f6575b.hashCode() + p012c.k.m(true, (mVar != null ? mVar.hashCode() : 0) * 961, 29791)) * 29791;
    }

    @Override // p124x0.Q
    public final n l() {
        return new A(this.f6574a, null, true, null, null, this.f6575b);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        p091r0.A a6;
        A a7 = (A) nVar;
        a7.getClass();
        boolean z5 = !a7.f12348A;
        a7.F0(this.f6574a, null, true, null, null, this.f6575b);
        if (!z5 || (a6 = a7.f12352E) == null) {
            return;
        }
        a6.A0();
    }
}
