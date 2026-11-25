package p035g0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9093a;

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f9093a == ((y) obj).f9093a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9093a);
    }

    public final String toString() {
        int i = this.f9093a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : "Unknown";
    }
}
