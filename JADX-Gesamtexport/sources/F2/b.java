package F2;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1404a;

    public b(Object obj) {
        this.f1404a = obj;
    }

    @Override // F2.c
    public final Object a() {
        return this.f1404a;
    }

    @Override // F2.c
    public final Object c() {
        return this.f1404a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return k.a(this.f1404a, ((b) obj).f1404a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1404a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "[Success: " + this.f1404a + ']';
    }
}
