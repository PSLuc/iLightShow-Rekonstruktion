package G0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1475a;

    public K(String str) {
        this.f1475a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            return E4.k.a(this.f1475a, ((K) obj).f1475a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1475a.hashCode();
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("UrlAnnotation(url="), this.f1475a, ')');
    }
}
