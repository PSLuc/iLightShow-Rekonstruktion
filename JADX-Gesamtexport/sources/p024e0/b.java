package p024e0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8640a;

    public static String a(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        return i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f8640a == ((b) obj).f8640a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8640a);
    }

    public final String toString() {
        return a(this.f8640a);
    }
}
