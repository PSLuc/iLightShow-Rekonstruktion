package p037g2;

import T1.i;
import p015c2.f;
import p032f2.q;
import p032f2.r;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC0771g f9151u;

    public o(r rVar, AbstractC0771g abstractC0771g) {
        super(rVar);
        this.f9151u = abstractC0771g;
    }

    @Override // p032f2.q, p032f2.r
    public final Object A(Object obj, Object obj2) {
        return obj2 != null ? this.f8931t.A(obj, obj2) : obj;
    }

    @Override // p032f2.q
    public final r F(r rVar) {
        return new o(rVar, this.f9151u);
    }

    @Override // p032f2.r
    public final void j(i iVar, f fVar, Object obj) {
        Object objQ = this.f9151u.q(obj);
        r rVar = this.f8931t;
        Object objI = objQ == null ? rVar.i(iVar, fVar) : rVar.l(iVar, fVar, objQ);
        if (objI != objQ) {
            rVar.z(obj, objI);
        }
    }

    @Override // p032f2.r
    public final Object k(i iVar, f fVar, Object obj) {
        Object objQ = this.f9151u.q(obj);
        r rVar = this.f8931t;
        Object objI = objQ == null ? rVar.i(iVar, fVar) : rVar.l(iVar, fVar, objQ);
        return (objI == objQ || objI == null) ? obj : rVar.A(obj, objI);
    }

    @Override // p032f2.q, p032f2.r
    public final void z(Object obj, Object obj2) {
        if (obj2 != null) {
            this.f8931t.z(obj, obj2);
        }
    }
}
