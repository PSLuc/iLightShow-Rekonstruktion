package c5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f7402a;

    public K(K k3) {
        E4.k.f("origin", k3);
        this.f7402a = k3;
    }

    public final List a() {
        return this.f7402a.a();
    }

    public final K4.b b() {
        return this.f7402a.b();
    }

    public final boolean c() {
        return this.f7402a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z5 = obj instanceof K;
        K k3 = z5 ? (K) obj : null;
        K k6 = k3 != null ? k3.f7402a : null;
        K k7 = this.f7402a;
        if (!E4.k.a(k7, k6)) {
            return false;
        }
        K4.b bVarB = k7.b();
        if (bVarB instanceof K4.b) {
            K k8 = z5 ? (K) obj : null;
            K4.b bVarB2 = k8 != null ? k8.f7402a.b() : null;
            if (bVarB2 != null && (bVarB2 instanceof K4.b)) {
                return p020d2.n.s(bVarB).equals(p020d2.n.s(bVarB2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7402a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f7402a;
    }
}
