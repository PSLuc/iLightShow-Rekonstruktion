package p075o0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10615a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f10615a == ((a) obj).f10615a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10615a);
    }

    public final String toString() {
        int i = this.f10615a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
