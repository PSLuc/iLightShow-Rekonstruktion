package p123x;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0217h0;
import N.U;
import S0.b;
import S0.k;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f13730b;

    public Z(H h6, String str) {
        this.f13729a = str;
        this.f13730b = C0208d.K(h6, U.f3673m);
    }

    @Override // p123x.a0
    public final int a(b bVar, k kVar) {
        return e().f13688a;
    }

    @Override // p123x.a0
    public final int b(b bVar, k kVar) {
        return e().f13690c;
    }

    @Override // p123x.a0
    public final int c(b bVar) {
        return e().f13689b;
    }

    @Override // p123x.a0
    public final int d(b bVar) {
        return e().f13691d;
    }

    public final H e() {
        return (H) this.f13730b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Z) {
            return E4.k.a(e(), ((Z) obj).e());
        }
        return false;
    }

    public final void f(H h6) {
        this.f13730b.setValue(h6);
    }

    public final int hashCode() {
        return this.f13729a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13729a);
        sb.append("(left=");
        sb.append(e().f13688a);
        sb.append(", top=");
        sb.append(e().f13689b);
        sb.append(", right=");
        sb.append(e().f13690c);
        sb.append(", bottom=");
        return AbstractC0013g0.k(sb, e().f13691d, ')');
    }
}
