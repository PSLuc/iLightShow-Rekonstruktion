package androidx.compose.foundation.layout;

import Z.e;
import Z.n;
import p123x.E;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6612a;

    public HorizontalAlignElement(e eVar) {
        this.f6612a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f6612a.equals(horizontalAlignElement.f6612a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6612a.f5948a);
    }

    @Override // p124x0.Q
    public final n l() {
        E e6 = new E();
        e6.f13679u = this.f6612a;
        return e6;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        ((E) nVar).f13679u = this.f6612a;
    }
}
