package E4;

/* JADX INFO: loaded from: classes.dex */
public final class p implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1068a;

    public p(Class cls) {
        this.f1068a = cls;
    }

    @Override // E4.e
    public final Class a() {
        return this.f1068a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return k.a(this.f1068a, ((p) obj).f1068a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1068a.hashCode();
    }

    public final String toString() {
        return this.f1068a.toString() + " (Kotlin reflection is not available)";
    }
}
