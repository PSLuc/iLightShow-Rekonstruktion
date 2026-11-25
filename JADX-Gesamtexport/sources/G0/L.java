package G0;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1476a;

    public L(String str) {
        this.f1476a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L) {
            return E4.k.a(this.f1476a, ((L) obj).f1476a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1476a.hashCode();
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f1476a, ')');
    }
}
