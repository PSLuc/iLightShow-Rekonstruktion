package R0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4734a;

    public static String a(int i) {
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f4734a == ((d) obj).f4734a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4734a);
    }

    public final String toString() {
        return a(this.f4734a);
    }
}
