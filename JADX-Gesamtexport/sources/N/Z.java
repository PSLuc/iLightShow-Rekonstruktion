package N;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p080p.x f3679a;

    public final boolean equals(Object obj) {
        if (obj instanceof Z) {
            return E4.k.a(this.f3679a, ((Z) obj).f3679a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3679a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f3679a + ')';
    }
}
