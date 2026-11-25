package androidx.compose.ui.input.rotary;

import Z.n;
import p124x0.Q;
import p130y0.C1141l;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends Q {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C1141l.f14407k;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C1141l.f14407k.hashCode() * 31;
    }

    @Override // p124x0.Q
    public final n l() {
        p102t0.a aVar = new p102t0.a();
        aVar.f12443u = C1141l.f14407k;
        return aVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((p102t0.a) nVar).f12443u = C1141l.f14407k;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C1141l.f14407k + ", onPreRotaryScrollEvent=null)";
    }
}
