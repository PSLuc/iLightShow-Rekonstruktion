package c5;

import B.AbstractC0013g0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements a5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.f f7453b;

    public g0(String str, a5.f fVar) {
        E4.k.f("kind", fVar);
        this.f7452a = str;
        this.f7453b = fVar;
    }

    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // a5.g
    public final String b() {
        return this.f7452a;
    }

    @Override // a5.g
    public final S1.h0 c() {
        return this.f7453b;
    }

    @Override // a5.g
    public final List d() {
        return p089q4.u.f11237h;
    }

    @Override // a5.g
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (E4.k.a(this.f7452a, g0Var.f7452a)) {
            if (E4.k.a(this.f7453b, g0Var.f7453b)) {
                return true;
            }
        }
        return false;
    }

    @Override // a5.g
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // a5.g
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return (this.f7453b.hashCode() * 31) + this.f7452a.hashCode();
    }

    @Override // a5.g
    public final boolean i() {
        return false;
    }

    @Override // a5.g
    public final List j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // a5.g
    public final a5.g k(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // a5.g
    public final boolean l(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("PrimitiveDescriptor("), this.f7452a, ')');
    }
}
