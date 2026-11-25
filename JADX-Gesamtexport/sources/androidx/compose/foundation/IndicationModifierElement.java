package androidx.compose.foundation;

import E4.k;
import Z.n;
import p101t.C;
import p101t.D;
import p101t.b0;
import p117w.m;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f6579b;

    public IndicationModifierElement(m mVar, D d6) {
        this.f6578a = mVar;
        this.f6579b = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return k.a(this.f6578a, indicationModifierElement.f6578a) && k.a(this.f6579b, indicationModifierElement.f6579b);
    }

    public final int hashCode() {
        int iHashCode = this.f6578a.hashCode() * 31;
        this.f6579b.getClass();
        return iHashCode - 1;
    }

    @Override // p124x0.Q
    public final n l() {
        this.f6579b.getClass();
        C c6 = new C(this.f6578a);
        b0 b0Var = new b0();
        b0Var.f12294w = c6;
        b0Var.y0(c6);
        return b0Var;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        b0 b0Var = (b0) nVar;
        this.f6579b.getClass();
        C c6 = new C(this.f6578a);
        b0Var.z0(b0Var.f12294w);
        b0Var.f12294w = c6;
        b0Var.y0(c6);
    }
}
