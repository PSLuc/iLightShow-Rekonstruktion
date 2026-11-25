package K2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2101a;

    public j(h hVar) {
        this.f2101a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        Object obj2 = q.f2124h;
        ((j) rVar).getClass();
        return obj2.equals(obj2) && this.f2101a.equals(((j) rVar).f2101a);
    }

    public final int hashCode() {
        return this.f2101a.hashCode() ^ ((q.f2124h.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + q.f2124h + ", androidClientInfo=" + this.f2101a + "}";
    }
}
