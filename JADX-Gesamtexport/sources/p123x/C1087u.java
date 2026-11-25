package p123x;

import E4.k;
import S0.a;
import p113v0.Y;

/* JADX INFO: renamed from: x.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1087u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f13809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13810b;

    public C1087u(Y y2, long j4) {
        this.f13809a = y2;
        this.f13810b = j4;
    }

    public final float a() {
        long j4 = this.f13810b;
        if (!a.d(j4)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f13809a.i0(a.h(j4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1087u)) {
            return false;
        }
        C1087u c1087u = (C1087u) obj;
        return k.a(this.f13809a, c1087u.f13809a) && a.b(this.f13810b, c1087u.f13810b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f13810b) + (this.f13809a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f13809a + ", constraints=" + ((Object) a.k(this.f13810b)) + ')';
    }
}
