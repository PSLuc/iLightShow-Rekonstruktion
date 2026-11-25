package androidx.compose.foundation.gestures;

import E4.k;
import Z.n;
import p101t.m0;
import p112v.C0975e;
import p112v.C0987k;
import p112v.C1001r0;
import p112v.C1017z0;
import p112v.InterfaceC1003s0;
import p112v.W;
import p117w.m;
import p124x0.AbstractC1098f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1003s0 f6599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f6600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f6601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f6604f;

    public ScrollableElement(m0 m0Var, W w6, InterfaceC1003s0 interfaceC1003s0, m mVar, boolean z5, boolean z6) {
        this.f6599a = interfaceC1003s0;
        this.f6600b = w6;
        this.f6601c = m0Var;
        this.f6602d = z5;
        this.f6603e = z6;
        this.f6604f = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return k.a(this.f6599a, scrollableElement.f6599a) && this.f6600b == scrollableElement.f6600b && k.a(this.f6601c, scrollableElement.f6601c) && this.f6602d == scrollableElement.f6602d && this.f6603e == scrollableElement.f6603e && k.a(this.f6604f, scrollableElement.f6604f);
    }

    public final int hashCode() {
        int iHashCode = (this.f6600b.hashCode() + (this.f6599a.hashCode() * 31)) * 31;
        m0 m0Var = this.f6601c;
        int iM = p012c.k.m(this.f6603e, p012c.k.m(this.f6602d, (iHashCode + (m0Var != null ? m0Var.hashCode() : 0)) * 31, 31), 961);
        m mVar = this.f6604f;
        return (iM + (mVar != null ? mVar.hashCode() : 0)) * 31;
    }

    @Override // p124x0.Q
    public final n l() {
        W w6 = this.f6600b;
        m mVar = this.f6604f;
        return new C1001r0(this.f6601c, w6, this.f6599a, mVar, this.f6602d, this.f6603e);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        boolean z5;
        C1001r0 c1001r0 = (C1001r0) nVar;
        boolean z6 = c1001r0.f12865y;
        boolean z7 = this.f6602d;
        boolean z8 = true;
        boolean z9 = false;
        if (z6 != z7) {
            c1001r0.J.f4438a = z7;
            c1001r0.G.f12966u = z7;
            z5 = true;
        } else {
            z5 = false;
        }
        C1017z0 c1017z0 = c1001r0.I;
        InterfaceC1003s0 interfaceC1003s0 = c1017z0.f13104a;
        InterfaceC1003s0 interfaceC1003s1 = this.f6599a;
        if (!k.a(interfaceC1003s0, interfaceC1003s1)) {
            c1017z0.f13104a = interfaceC1003s1;
            z9 = true;
        }
        m0 m0Var = this.f6601c;
        c1017z0.f13105b = m0Var;
        W w6 = c1017z0.f13107d;
        W w7 = this.f6600b;
        if (w6 != w7) {
            c1017z0.f13107d = w7;
            z9 = true;
        }
        boolean z10 = c1017z0.f13108e;
        boolean z11 = this.f6603e;
        if (z10 != z11) {
            c1017z0.f13108e = z11;
        } else {
            z8 = z9;
        }
        c1017z0.f13106c = c1001r0.H;
        c1017z0.f13109f = c1001r0.f13057F;
        C0987k c0987k = c1001r0.f13058K;
        c0987k.f13007u = w7;
        c0987k.f13009w = z11;
        c1001r0.f13056E = m0Var;
        boolean z12 = z8;
        C0975e c0975e = C0975e.f12969k;
        W w8 = c1017z0.f13107d;
        W w9 = W.f12920h;
        if (w8 != w9) {
            w9 = W.i;
        }
        c1001r0.J0(c0975e, z7, this.f6604f, w9, z12);
        if (z5) {
            c1001r0.f13060M = null;
            c1001r0.f13061N = null;
            AbstractC1098f.n(c1001r0);
        }
    }
}
