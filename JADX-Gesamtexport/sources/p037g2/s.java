package p037g2;

import T1.i;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import p015c2.A;
import p015c2.C0474e;
import p015c2.f;
import p015c2.j;
import p032f2.l;
import p032f2.r;
import p046i2.AbstractC0771g;
import p046i2.C;

/* JADX INFO: loaded from: classes.dex */
public final class s extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f9162t;

    public s(r rVar, C c6) {
        super(rVar);
        this.f9162t = rVar;
        this.f8939p = c6;
    }

    @Override // p032f2.r
    public final Object A(Object obj, Object obj2) {
        return this.f9162t.A(obj, obj2);
    }

    @Override // p032f2.r
    public final r C(A a6) {
        return new s(this, a6);
    }

    @Override // p032f2.r
    public final r D(l lVar) {
        return new s(this, this.f8935l, lVar);
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
        return new s(this, jVar, lVar);
    }

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return this.f9162t.e();
    }

    @Override // p032f2.r
    public final void j(i iVar, f fVar, Object obj) throws JsonMappingException {
        k(iVar, fVar, obj);
    }

    @Override // p032f2.r
    public final Object k(i iVar, f fVar, Object obj) throws JsonMappingException {
        try {
            return this.f9162t.A(obj, i(iVar, fVar));
        } catch (UnresolvedForwardReference e6) {
            if (this.f8939p == null && this.f8935l.getObjectIdReader() == null) {
                throw new JsonMappingException(iVar, "Unresolved forward reference but no identity info", e6);
            }
            Class cls = this.f8934k.f7281k;
            throw null;
        }
    }

    @Override // p032f2.r
    public final void m(C0474e c0474e) {
        r rVar = this.f9162t;
        if (rVar != null) {
            rVar.m(c0474e);
        }
    }

    @Override // p032f2.r
    public final int n() {
        return this.f9162t.n();
    }

    @Override // p032f2.r
    public final void z(Object obj, Object obj2) {
        this.f9162t.z(obj, obj2);
    }

    public s(s sVar, j jVar, l lVar) {
        super(sVar, jVar, lVar);
        this.f9162t = sVar.f9162t;
        this.f8939p = sVar.f8939p;
    }

    public s(s sVar, A a6) {
        super(sVar, a6);
        this.f9162t = sVar.f9162t;
        this.f8939p = sVar.f8939p;
    }
}
