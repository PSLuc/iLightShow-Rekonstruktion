package B;

import p096s.AbstractC0916i;

/* JADX INFO: renamed from: B.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0019j0 implements p113v0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W0 f340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0.C f342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4.a f343d;

    public C0019j0(W0 w6, int i, M0.C c6, D4.a aVar) {
        this.f340a = w6;
        this.f341b = i;
        this.f342c = c6;
        this.f343d = aVar;
    }

    @Override // p113v0.r
    public final p113v0.G e(p113v0.H h6, p113v0.E e6, long j4) {
        long j6;
        if (e6.Y(S0.a.g(j4)) < S0.a.h(j4)) {
            j6 = j4;
        } else {
            j6 = j4;
            j4 = S0.a.a(j6, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        p113v0.N nC = e6.c(j4);
        int iMin = Math.min(nC.f13137h, S0.a.h(j6));
        return h6.u(iMin, nC.i, p089q4.v.f11238h, new C0017i0(h6, this, nC, iMin, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0019j0)) {
            return false;
        }
        C0019j0 c0019j0 = (C0019j0) obj;
        return E4.k.a(this.f340a, c0019j0.f340a) && this.f341b == c0019j0.f341b && E4.k.a(this.f342c, c0019j0.f342c) && E4.k.a(this.f343d, c0019j0.f343d);
    }

    public final int hashCode() {
        return this.f343d.hashCode() + ((this.f342c.hashCode() + AbstractC0916i.c(this.f341b, this.f340a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f340a + ", cursorOffset=" + this.f341b + ", transformedText=" + this.f342c + ", textLayoutResultProvider=" + this.f343d + ')';
    }
}
