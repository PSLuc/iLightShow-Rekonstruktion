package p095r4;

import E4.k;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Map.Entry, F4.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f11785h;
    public final int i;

    public d(f fVar, int i) {
        k.f("map", fVar);
        this.f11785h = fVar;
        this.i = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return k.a(entry.getKey(), getKey()) && k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11785h.f11790h[this.i];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f11785h.i;
        k.c(objArr);
        return objArr[this.i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        f fVar = this.f11785h;
        fVar.b();
        Object[] objArr = fVar.i;
        if (objArr == null) {
            int length = fVar.f11790h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.i = objArr;
        }
        int i = this.i;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
