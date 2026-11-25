package N;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3633b;

    public N(Integer num, Object obj) {
        this.f3632a = num;
        this.f3633b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return this.f3632a.equals(n6.f3632a) && E4.k.a(this.f3633b, n6.f3633b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f3632a.hashCode() * 31;
        Object obj = this.f3633b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f3632a + ", right=" + this.f3633b + ')';
    }
}
