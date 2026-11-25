package p107u;

import E4.k;
import N.C0208d;
import N.C0217h0;
import N.U;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0217h0 f12638a = C0208d.K(i.f12636a, U.f3673m);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return k.a((k) ((l) obj).f12638a.getValue(), (k) this.f12638a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((k) this.f12638a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((k) this.f12638a.getValue()) + ')';
    }
}
