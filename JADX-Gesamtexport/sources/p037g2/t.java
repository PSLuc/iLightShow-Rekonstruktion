package p037g2;

import T1.i;
import T1.k;
import p015c2.A;
import p015c2.f;
import p015c2.j;
import p015c2.z;
import p032f2.l;
import p032f2.r;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public final class t extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f9163t;

    public t(r rVar, z zVar) {
        super(rVar.i, rVar.f9158h, zVar, rVar.f9160k);
        this.f9163t = rVar;
    }

    @Override // p032f2.r
    public final Object A(Object obj, Object obj2) {
        r rVar = this.f9163t.f9161l;
        if (rVar != null) {
            return rVar.A(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    @Override // p032f2.r
    public final r C(A a6) {
        return new t(this, a6);
    }

    @Override // p032f2.r
    public final r D(l lVar) {
        return new t(this, this.f8935l, lVar);
    }

    @Override // p032f2.r
    public final r E(j jVar) {
        j jVar2 = this.f8935l;
        if (jVar2 == jVar) {
            return this;
        }
        l lVar = this.f8937n;
        if (jVar2 == lVar) {
            lVar = jVar;
        }
        return new t(this, jVar, lVar);
    }

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return null;
    }

    @Override // p032f2.r
    public final void j(i iVar, f fVar, Object obj) {
        k(iVar, fVar, obj);
    }

    @Override // p032f2.r
    public final Object k(i iVar, f fVar, Object obj) {
        if (iVar.s0(k.VALUE_NULL)) {
            return null;
        }
        fVar.j0(this.f8935l.deserialize(iVar, fVar), this.f9163t.f9159j).getClass();
        throw null;
    }

    @Override // p032f2.r
    public final void z(Object obj, Object obj2) {
        A(obj, obj2);
    }

    public t(t tVar, j jVar, l lVar) {
        super(tVar, jVar, lVar);
        this.f9163t = tVar.f9163t;
    }

    public t(t tVar, A a6) {
        super(tVar, a6);
        this.f9163t = tVar.f9163t;
    }
}
