package c5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D implements a5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.g f7385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5.g f7386c;

    public D(String str, a5.g gVar, a5.g gVar2) {
        this.f7384a = str;
        this.f7385b = gVar;
        this.f7386c = gVar2;
    }

    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        Integer numX = M4.s.X(str);
        if (numX != null) {
            return numX.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // a5.g
    public final String b() {
        return this.f7384a;
    }

    @Override // a5.g
    public final S1.h0 c() {
        return a5.j.f6376l;
    }

    @Override // a5.g
    public final List d() {
        return p089q4.u.f11237h;
    }

    @Override // a5.g
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d6 = (D) obj;
        return E4.k.a(this.f7384a, d6.f7384a) && E4.k.a(this.f7385b, d6.f7385b) && E4.k.a(this.f7386c, d6.f7386c);
    }

    @Override // a5.g
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // a5.g
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return this.f7386c.hashCode() + ((this.f7385b.hashCode() + (this.f7384a.hashCode() * 31)) * 31);
    }

    @Override // a5.g
    public final boolean i() {
        return false;
    }

    @Override // a5.g
    public final List j(int i) {
        if (i >= 0) {
            return p089q4.u.f11237h;
        }
        throw new IllegalArgumentException(p012c.k.u(p012c.k.v(i, "Illegal index ", ", "), this.f7384a, " expects only non-negative indices").toString());
    }

    @Override // a5.g
    public final a5.g k(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(p012c.k.u(p012c.k.v(i, "Illegal index ", ", "), this.f7384a, " expects only non-negative indices").toString());
        }
        int i3 = i % 2;
        if (i3 == 0) {
            return this.f7385b;
        }
        if (i3 == 1) {
            return this.f7386c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // a5.g
    public final boolean l(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(p012c.k.u(p012c.k.v(i, "Illegal index ", ", "), this.f7384a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f7384a + '(' + this.f7385b + ", " + this.f7386c + ')';
    }
}
