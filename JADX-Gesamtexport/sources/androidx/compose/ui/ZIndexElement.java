package androidx.compose.ui;

import Z.n;
import Z.s;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexElement extends Q {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZIndexElement)) {
            return false;
        }
        ((ZIndexElement) obj).getClass();
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    @Override // p124x0.Q
    public final n l() {
        s sVar = new s();
        sVar.f5977u = 1.0f;
        return sVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((s) nVar).f5977u = 1.0f;
    }

    public final String toString() {
        return "ZIndexElement(zIndex=1.0)";
    }
}
