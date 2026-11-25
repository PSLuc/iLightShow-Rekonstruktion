package p101t;

import E0.f;
import E0.h;
import E0.o;
import E0.q;
import E0.r;
import K4.e;
import Z.n;
import p124x0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends n implements m0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s0 f12397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12398v;

    @Override // p124x0.m0
    public final void g0(h hVar) {
        e[] eVarArr = q.f997a;
        r rVar = o.f981l;
        e[] eVarArr2 = q.f997a;
        e eVar = eVarArr2[6];
        rVar.a(hVar, Boolean.TRUE);
        f fVar = new f(new o0(this, 0), new o0(this, 1));
        if (this.f12398v) {
            r rVar2 = o.f985p;
            e eVar2 = eVarArr2[11];
            rVar2.a(hVar, fVar);
        } else {
            r rVar3 = o.f984o;
            e eVar3 = eVarArr2[10];
            rVar3.a(hVar, fVar);
        }
    }
}
