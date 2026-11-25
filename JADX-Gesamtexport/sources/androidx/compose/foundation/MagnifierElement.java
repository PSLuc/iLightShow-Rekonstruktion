package androidx.compose.foundation;

import E0.r;
import F.V;
import F.W;
import Z.n;
import android.view.View;
import p012c.k;
import p101t.e0;
import p101t.f0;
import p101t.j0;
import p124x0.AbstractC1098f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f6580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f6581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f6582c;

    public MagnifierElement(V v6, W w6, j0 j0Var) {
        this.f6580a = v6;
        this.f6581b = w6;
        this.f6582c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        V v6 = ((MagnifierElement) obj).f6580a;
        return false;
    }

    public final int hashCode() {
        return this.f6582c.hashCode() + ((this.f6581b.hashCode() + k.m(true, k.i(Float.NaN, k.i(Float.NaN, k.l(k.m(true, k.i(Float.NaN, this.f6580a.hashCode() * 961, 31), 31), 31, 9205357640488583168L), 31), 31), 31)) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        return new e0(this.f6580a, this.f6581b, this.f6582c);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        e0 e0Var = (e0) nVar;
        e0Var.getClass();
        j0 j0Var = e0Var.f12320w;
        View view = e0Var.f12321x;
        S0.b bVar = e0Var.f12322y;
        e0Var.f12318u = this.f6580a;
        e0Var.f12319v = this.f6581b;
        j0 j0Var2 = this.f6582c;
        e0Var.f12320w = j0Var2;
        View viewV = AbstractC1098f.v(e0Var);
        S0.b bVar2 = AbstractC1098f.s(e0Var).f13850x;
        if (e0Var.f12323z != null) {
            r rVar = f0.f12327a;
            if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
                j0Var2.getClass();
            }
            if (!S0.e.a(Float.NaN, Float.NaN) || !S0.e.a(Float.NaN, Float.NaN) || !j0Var2.equals(j0Var) || !viewV.equals(view) || !E4.k.a(bVar2, bVar)) {
                e0Var.z0();
            }
        }
        e0Var.A0();
    }
}
