package K2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2100a;

    public i(ArrayList arrayList) {
        this.f2100a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f2100a.equals(((i) ((p) obj)).f2100a);
    }

    public final int hashCode() {
        return this.f2100a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f2100a + "}";
    }
}
