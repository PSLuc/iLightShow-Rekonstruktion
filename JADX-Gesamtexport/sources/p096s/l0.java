package p096s;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12031b;

    public l0(Object obj, Object obj2) {
        this.f12030a = obj;
        this.f12031b = obj2;
    }

    @Override // p096s.k0
    public final Object b() {
        return this.f12030a;
    }

    @Override // p096s.k0
    public final Object c() {
        return this.f12031b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (k.a(this.f12030a, k0Var.b())) {
            return k.a(this.f12031b, k0Var.c());
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f12030a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f12031b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
