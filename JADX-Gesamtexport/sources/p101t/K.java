package p101t;

import B.C0024m;
import E0.a;
import E0.g;
import E0.h;
import E4.k;
import E4.w;
import P4.AbstractC0336x;
import p024e0.c;
import p024e0.o;
import p024e0.q;
import p024e0.r;
import p058l0.I;
import p117w.e;
import p117w.f;
import p117w.m;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;
import p124x0.InterfaceC1108p;
import p124x0.Y;
import p124x0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC1105m implements c, m0, InterfaceC1108p, o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f12250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final I f12251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final L f12252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final M f12253z;

    public K(m mVar) {
        I i = new I();
        i.f12246u = mVar;
        y0(i);
        this.f12251x = i;
        L l6 = new L();
        y0(l6);
        this.f12252y = l6;
        M m6 = new M();
        y0(m6);
        this.f12253z = m6;
        y0(new r());
    }

    @Override // p124x0.InterfaceC1108p
    public final void A(Y y2) {
        this.f12253z.A(y2);
    }

    public final void B0(m mVar) {
        e eVar;
        I i = this.f12251x;
        if (k.a(i.f12246u, mVar)) {
            return;
        }
        m mVar2 = i.f12246u;
        if (mVar2 != null && (eVar = i.f12247v) != null) {
            mVar2.b(new f(eVar));
        }
        i.f12247v = null;
        i.f12246u = mVar;
    }

    @Override // p024e0.c
    public final void J(q qVar) {
        N nY0;
        if (k.a(this.f12250w, qVar)) {
            return;
        }
        boolean zA = qVar.a();
        if (zA) {
            AbstractC0336x.o(n0(), null, new J(this, null), 3);
        }
        if (this.f5969t) {
            AbstractC1098f.n(this);
        }
        I i = this.f12251x;
        m mVar = i.f12246u;
        if (mVar != null) {
            if (zA) {
                e eVar = i.f12247v;
                if (eVar != null) {
                    i.y0(mVar, new f(eVar));
                    i.f12247v = null;
                }
                e eVar2 = new e();
                i.y0(mVar, eVar2);
                i.f12247v = eVar2;
            } else {
                e eVar3 = i.f12247v;
                if (eVar3 != null) {
                    i.y0(mVar, new f(eVar3));
                    i.f12247v = null;
                }
            }
        }
        M m6 = this.f12253z;
        if (zA != m6.f12255u) {
            if (zA) {
                Y y2 = m6.f12256v;
                if (y2 != null && y2.M0().f5969t && (nY0 = m6.y0()) != null) {
                    nY0.y0(m6.f12256v);
                }
            } else {
                N nY1 = m6.y0();
                if (nY1 != null) {
                    nY1.y0(null);
                }
            }
            m6.f12255u = zA;
        }
        L l6 = this.f12252y;
        if (zA) {
            l6.getClass();
            w wVar = new w();
            AbstractC1098f.p(l6, new C0024m(wVar, 11, l6));
            if (wVar.f1074h != null) {
                throw new ClassCastException();
            }
        }
        l6.getClass();
        this.f12250w = qVar;
    }

    @Override // p124x0.m0
    public final void g0(h hVar) {
        q qVar = this.f12250w;
        boolean z5 = false;
        if (qVar != null && qVar.a()) {
            z5 = true;
        }
        K4.e[] eVarArr = E0.q.f997a;
        E0.r rVar = E0.o.f980k;
        K4.e eVar = E0.q.f997a[4];
        rVar.a(hVar, Boolean.valueOf(z5));
        hVar.i(g.f932t, new a(null, new I(7, this)));
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }
}
