package androidx.compose.foundation;

import E4.k;
import Z.n;
import p035g0.M;
import p035g0.O;
import p101t.C0951t;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f6566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f6567c;

    public BorderModifierNodeElement(float f6, O o6, M m6) {
        this.f6565a = f6;
        this.f6566b = o6;
        this.f6567c = m6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return S0.e.a(this.f6565a, borderModifierNodeElement.f6565a) && this.f6566b.equals(borderModifierNodeElement.f6566b) && k.a(this.f6567c, borderModifierNodeElement.f6567c);
    }

    public final int hashCode() {
        return this.f6567c.hashCode() + ((this.f6566b.hashCode() + (Float.hashCode(this.f6565a) * 31)) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        return new C0951t(this.f6565a, this.f6566b, this.f6567c);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        C0951t c0951t = (C0951t) nVar;
        float f6 = c0951t.f12427x;
        float f7 = this.f6565a;
        boolean zA = S0.e.a(f6, f7);
        p019d0.b bVar = c0951t.f12425A;
        if (!zA) {
            c0951t.f12427x = f7;
            bVar.y0();
        }
        O o6 = c0951t.f12428y;
        O o7 = this.f6566b;
        if (!k.a(o6, o7)) {
            c0951t.f12428y = o7;
            bVar.y0();
        }
        M m6 = c0951t.f12429z;
        M m7 = this.f6567c;
        if (k.a(m6, m7)) {
            return;
        }
        c0951t.f12429z = m7;
        bVar.y0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) S0.e.b(this.f6565a)) + ", brush=" + this.f6566b + ", shape=" + this.f6567c + ')';
    }
}
