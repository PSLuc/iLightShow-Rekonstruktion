package B;

import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements p113v0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W0 f365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0.C f367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4.a f368d;

    public l1(W0 w6, int i, M0.C c6, D4.a aVar) {
        this.f365a = w6;
        this.f366b = i;
        this.f367c = c6;
        this.f368d = aVar;
    }

    @Override // p113v0.r
    public final p113v0.G e(p113v0.H h6, p113v0.E e6, long j4) {
        p113v0.N nC = e6.c(S0.a.a(j4, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(nC.i, S0.a.g(j4));
        return h6.u(nC.f13137h, iMin, p089q4.v.f11238h, new C0017i0(h6, this, nC, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return E4.k.a(this.f365a, l1Var.f365a) && this.f366b == l1Var.f366b && E4.k.a(this.f367c, l1Var.f367c) && E4.k.a(this.f368d, l1Var.f368d);
    }

    public final int hashCode() {
        return this.f368d.hashCode() + ((this.f367c.hashCode() + AbstractC0916i.c(this.f366b, this.f365a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f365a + ", cursorOffset=" + this.f366b + ", transformedText=" + this.f367c + ", textLayoutResultProvider=" + this.f368d + ')';
    }
}
