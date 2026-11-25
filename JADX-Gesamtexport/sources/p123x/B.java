package p123x;

import S0.b;
import S0.k;

/* JADX INFO: loaded from: classes.dex */
public final class B implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f13675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f13676b;

    public B(a0 a0Var, a0 a0Var2) {
        this.f13675a = a0Var;
        this.f13676b = a0Var2;
    }

    @Override // p123x.a0
    public final int a(b bVar, k kVar) {
        int iA = this.f13675a.a(bVar, kVar) - this.f13676b.a(bVar, kVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // p123x.a0
    public final int b(b bVar, k kVar) {
        int iB = this.f13675a.b(bVar, kVar) - this.f13676b.b(bVar, kVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // p123x.a0
    public final int c(b bVar) {
        int iC = this.f13675a.c(bVar) - this.f13676b.c(bVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // p123x.a0
    public final int d(b bVar) {
        int iD = this.f13675a.d(bVar) - this.f13676b.d(bVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b6 = (B) obj;
        return E4.k.a(b6.f13675a, this.f13675a) && E4.k.a(b6.f13676b, this.f13676b);
    }

    public final int hashCode() {
        return this.f13676b.hashCode() + (this.f13675a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f13675a + " - " + this.f13676b + ')';
    }
}
