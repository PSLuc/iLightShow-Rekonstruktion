package L0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3023a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3023a == ((i) obj).f3023a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3023a);
    }

    public final String toString() {
        int i = this.f3023a;
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}
