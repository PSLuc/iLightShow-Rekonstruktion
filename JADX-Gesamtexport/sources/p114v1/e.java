package p114v1;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13210a;

    public e(String str) {
        this.f13210a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return k.a(this.f13210a, ((e) obj).f13210a);
    }

    public final int hashCode() {
        return this.f13210a.hashCode();
    }

    public final String toString() {
        return this.f13210a;
    }
}
