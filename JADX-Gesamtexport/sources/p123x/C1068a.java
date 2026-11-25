package p123x;

import B.AbstractC0013g0;
import N.C0208d;
import N.C0217h0;
import N.U;
import S0.b;
import S0.k;
import p008b1.c;
import p045i1.c0;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1068a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0217h0 f13733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f13734d;

    public C1068a(int i, String str) {
        this.f13731a = i;
        this.f13732b = str;
        c cVar = c.f7046e;
        U u6 = U.f3673m;
        this.f13733c = C0208d.K(cVar, u6);
        this.f13734d = C0208d.K(Boolean.TRUE, u6);
    }

    @Override // p123x.a0
    public final int a(b bVar, k kVar) {
        return e().f7047a;
    }

    @Override // p123x.a0
    public final int b(b bVar, k kVar) {
        return e().f7049c;
    }

    @Override // p123x.a0
    public final int c(b bVar) {
        return e().f7048b;
    }

    @Override // p123x.a0
    public final int d(b bVar) {
        return e().f7050d;
    }

    public final c e() {
        return (c) this.f13733c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1068a) {
            return this.f13731a == ((C1068a) obj).f13731a;
        }
        return false;
    }

    public final void f(c0 c0Var, int i) {
        int i3 = this.f13731a;
        if (i == 0 || (i & i3) != 0) {
            this.f13733c.setValue(c0Var.f9452a.f(i3));
            this.f13734d.setValue(Boolean.valueOf(c0Var.f9452a.p(i3)));
        }
    }

    public final int hashCode() {
        return this.f13731a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13732b);
        sb.append('(');
        sb.append(e().f7047a);
        sb.append(", ");
        sb.append(e().f7048b);
        sb.append(", ");
        sb.append(e().f7049c);
        sb.append(", ");
        return AbstractC0013g0.k(sb, e().f7050d, ')');
    }
}
