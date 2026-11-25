package S;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4853h;
    public final Object i;

    public a(Object obj, Object obj2) {
        this.f4853h = obj;
        this.i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && E4.k.a(entry.getKey(), this.f4853h) && E4.k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4853h;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f4853h;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4853h);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
