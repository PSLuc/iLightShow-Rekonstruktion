package p035g0;

import E4.k;
import p030f0.d;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f9010a;

    public C(d dVar) {
        this.f9010a = dVar;
    }

    @Override // p035g0.E
    public final d a() {
        return this.f9010a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            return k.a(this.f9010a, ((C) obj).f9010a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9010a.hashCode();
    }
}
