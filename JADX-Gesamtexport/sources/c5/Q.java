package c5;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Map.Entry, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7411h;
    public final Object i;

    public Q(Object obj, Object obj2) {
        this.f7411h = obj;
        this.i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q6 = (Q) obj;
        return E4.k.a(this.f7411h, q6.f7411h) && E4.k.a(this.i, q6.i);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7411h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f7411h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f7411h + ", value=" + this.i + ')';
    }
}
