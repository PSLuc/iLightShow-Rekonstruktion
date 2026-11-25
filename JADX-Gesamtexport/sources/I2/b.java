package I2;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1853a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f1853a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f1853a.equals(((b) obj).f1853a);
    }

    public final int hashCode() {
        return this.f1853a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return k.u(new StringBuilder("Encoding{name=\""), this.f1853a, "\"}");
    }
}
