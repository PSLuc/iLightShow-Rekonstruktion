package L0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3024a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3024a == ((j) obj).f3024a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3024a);
    }

    public final String toString() {
        int i = this.f3024a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        return i == 3 ? "Style" : "Invalid";
    }
}
