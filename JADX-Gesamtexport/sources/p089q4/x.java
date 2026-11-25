package p089q4;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11241b;

    public x(int i, Object obj) {
        this.f11240a = i;
        this.f11241b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f11240a == xVar.f11240a && k.a(this.f11241b, xVar.f11241b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f11240a) * 31;
        Object obj = this.f11241b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f11240a + ", value=" + this.f11241b + ')';
    }
}
