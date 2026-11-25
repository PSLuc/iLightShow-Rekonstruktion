package p101t;

import E4.k;
import p035g0.H;
import p035g0.r;
import p123x.O;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f12370b;

    public k0() {
        long jD = H.d(4284900966L);
        float f6 = 0;
        O o6 = new O(f6, f6, f6, f6);
        this.f12369a = jD;
        this.f12370b = o6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.d("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration", obj);
        k0 k0Var = (k0) obj;
        return r.c(this.f12369a, k0Var.f12369a) && k.a(this.f12370b, k0Var.f12370b);
    }

    public final int hashCode() {
        int i = r.f9086m;
        return this.f12370b.hashCode() + (Long.hashCode(this.f12369a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        p012c.k.z(this.f12369a, sb, ", drawPadding=");
        sb.append(this.f12370b);
        sb.append(')');
        return sb.toString();
    }
}
