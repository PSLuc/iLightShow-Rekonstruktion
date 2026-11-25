package p068n;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10501h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f10502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f10503k;

    public c(Object obj, Object obj2) {
        this.f10501h = obj;
        this.i = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10501h.equals(cVar.f10501h) && this.i.equals(cVar.i);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10501h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.i.hashCode() ^ this.f10501h.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f10501h + "=" + this.i;
    }
}
