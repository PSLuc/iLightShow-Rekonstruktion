package N;

import B.AbstractC0013g0;

/* JADX INFO: renamed from: N.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3684a;

    public C0205b0(String str) {
        this.f3684a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0205b0) && E4.k.a(this.f3684a, ((C0205b0) obj).f3684a);
    }

    public final int hashCode() {
        return this.f3684a.hashCode();
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("OpaqueKey(key="), this.f3684a, ')');
    }
}
