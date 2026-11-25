package p096s;

import N.C0208d;
import N.C0217h0;
import N.U;
import N.V0;

/* JADX INFO: loaded from: classes.dex */
public final class E implements V0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Number f11833h;
    public Number i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w0 f11834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0217h0 f11835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h0 f11836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H f11840p;

    public E(H h6, Number number, Number number2, w0 w0Var, D d6) {
        this.f11840p = h6;
        this.f11833h = number;
        this.i = number2;
        this.f11834j = w0Var;
        this.f11835k = C0208d.K(number, U.f3673m);
        this.f11836l = new h0(d6, w0Var, this.f11833h, this.i, null);
    }

    @Override // N.V0
    public final Object getValue() {
        return this.f11835k.getValue();
    }
}
