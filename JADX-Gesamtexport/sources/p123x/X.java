package p123x;

import S0.b;
import S0.k;

/* JADX INFO: loaded from: classes.dex */
public final class X implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f13725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f13726b;

    public X(a0 a0Var, a0 a0Var2) {
        this.f13725a = a0Var;
        this.f13726b = a0Var2;
    }

    @Override // p123x.a0
    public final int a(b bVar, k kVar) {
        return Math.max(this.f13725a.a(bVar, kVar), this.f13726b.a(bVar, kVar));
    }

    @Override // p123x.a0
    public final int b(b bVar, k kVar) {
        return Math.max(this.f13725a.b(bVar, kVar), this.f13726b.b(bVar, kVar));
    }

    @Override // p123x.a0
    public final int c(b bVar) {
        return Math.max(this.f13725a.c(bVar), this.f13726b.c(bVar));
    }

    @Override // p123x.a0
    public final int d(b bVar) {
        return Math.max(this.f13725a.d(bVar), this.f13726b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        return E4.k.a(x6.f13725a, this.f13725a) && E4.k.a(x6.f13726b, this.f13726b);
    }

    public final int hashCode() {
        return (this.f13726b.hashCode() * 31) + this.f13725a.hashCode();
    }

    public final String toString() {
        return "(" + this.f13725a + " ∪ " + this.f13726b + ')';
    }
}
