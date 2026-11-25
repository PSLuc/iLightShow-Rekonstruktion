package p091r0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11533a;

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f11533a == ((t) obj).f11533a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11533a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f11533a + ')';
    }
}
