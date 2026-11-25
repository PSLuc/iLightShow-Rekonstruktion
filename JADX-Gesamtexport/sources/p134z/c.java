package p134z;

import E0.e;
import E0.h;
import E0.o;
import E0.q;
import E0.r;
import F0.a;
import p058l0.I;
import p101t.C0954w;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0954w {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f14607O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public D4.c f14608P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final I f14609Q;

    public c(boolean z5, m mVar, boolean z6, e eVar, D4.c cVar) {
        super(mVar, null, z6, null, eVar, new p107u.m(cVar, z5));
        this.f14607O = z5;
        this.f14608P = cVar;
        this.f14609Q = new I(21, this);
    }

    @Override // p101t.AbstractC0942j
    public final void B0(h hVar) {
        a aVar = this.f14607O ? a.f1239h : a.i;
        K4.e[] eVarArr = q.f997a;
        r rVar = o.f966B;
        K4.e eVar = q.f997a[22];
        rVar.a(hVar, aVar);
    }
}
