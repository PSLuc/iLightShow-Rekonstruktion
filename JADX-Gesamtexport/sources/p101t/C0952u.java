package p101t;

import S0.e;
import p035g0.O;

/* JADX INFO: renamed from: t.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f12433b;

    public C0952u(float f6, O o6) {
        this.f12432a = f6;
        this.f12433b = o6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0952u)) {
            return false;
        }
        C0952u c0952u = (C0952u) obj;
        return e.a(this.f12432a, c0952u.f12432a) && this.f12433b.equals(c0952u.f12433b);
    }

    public final int hashCode() {
        return this.f12433b.hashCode() + (Float.hashCode(this.f12432a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) e.b(this.f12432a)) + ", brush=" + this.f12433b + ')';
    }
}
