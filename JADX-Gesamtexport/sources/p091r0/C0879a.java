package p091r0;

import B.AbstractC0013g0;
import E4.k;

/* JADX INFO: renamed from: r0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0879a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11469b;

    public C0879a(int i) {
        this.f11469b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0879a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType", obj);
        return this.f11469b == ((C0879a) obj).f11469b;
    }

    public final int hashCode() {
        return this.f11469b;
    }

    public final String toString() {
        return AbstractC0013g0.k(new StringBuilder("AndroidPointerIcon(type="), this.f11469b, ')');
    }
}
