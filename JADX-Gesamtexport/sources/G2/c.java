package G2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1682a;

    public c(boolean z5) {
        this.f1682a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f1682a == ((c) obj).f1682a;
    }

    public final int hashCode() {
        boolean z5 = this.f1682a;
        if (z5) {
            return 1;
        }
        return z5 ? 1 : 0;
    }

    public final String toString() {
        return "Denied(shouldShowRationale=" + this.f1682a + ')';
    }
}
