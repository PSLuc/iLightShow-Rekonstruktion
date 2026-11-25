package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparable f6835h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X f6836j;

    public Y(X x6, Comparable comparable, Object obj) {
        this.f6836j = x6;
        this.f6835h = comparable;
        this.i = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6835h.compareTo(((Y) obj).f6835h);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f6835h;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.i;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6835h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6835h;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.i;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6836j.b();
        Object obj2 = this.i;
        this.i = obj;
        return obj2;
    }

    public final String toString() {
        return this.f6835h + "=" + this.i;
    }
}
