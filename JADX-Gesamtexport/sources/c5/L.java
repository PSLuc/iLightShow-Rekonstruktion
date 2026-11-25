package c5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class L implements a5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.g f7403a;

    public L(a5.g gVar) {
        this.f7403a = gVar;
    }

    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        Integer numX = M4.s.X(str);
        if (numX != null) {
            return numX.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // a5.g
    public final S1.h0 c() {
        return a5.j.f6375k;
    }

    @Override // a5.g
    public final List d() {
        return p089q4.u.f11237h;
    }

    @Override // a5.g
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l6 = (L) obj;
        return E4.k.a(this.f7403a, l6.f7403a) && E4.k.a(b(), l6.b());
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
        return b().hashCode() + (this.f7403a.hashCode() * 31);
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
        StringBuilder sbV = p012c.k.v(i, "Illegal index ", ", ");
        sbV.append(b());
        sbV.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbV.toString().toString());
    }

    @Override // a5.g
    public final a5.g k(int i) {
        if (i >= 0) {
            return this.f7403a;
        }
        StringBuilder sbV = p012c.k.v(i, "Illegal index ", ", ");
        sbV.append(b());
        sbV.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbV.toString().toString());
    }

    @Override // a5.g
    public final boolean l(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbV = p012c.k.v(i, "Illegal index ", ", ");
        sbV.append(b());
        sbV.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbV.toString().toString());
    }

    public final String toString() {
        return b() + '(' + this.f7403a + ')';
    }
}
