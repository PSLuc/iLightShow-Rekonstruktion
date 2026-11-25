package p123x;

import E4.k;
import p118w0.c;
import p118w0.f;

/* JADX INFO: renamed from: x.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1092z implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.c f13819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f13820b;

    public C1092z(D4.c cVar) {
        this.f13819a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1092z) && ((C1092z) obj).f13819a == this.f13819a;
    }

    @Override // p118w0.c
    public final void g(f fVar) {
        a0 a0Var = (a0) fVar.g(d0.f13765a);
        if (k.a(a0Var, this.f13820b)) {
            return;
        }
        this.f13820b = a0Var;
        this.f13819a.invoke(a0Var);
    }

    public final int hashCode() {
        return this.f13819a.hashCode();
    }
}
