package p032f2;

import p015c2.A;
import p015c2.C0474e;
import p015c2.j;
import p046i2.AbstractC0771g;
import p046i2.C;
import p071n2.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f8931t;

    public q(r rVar) {
        super(rVar);
        this.f8931t = rVar;
    }

    @Override // p032f2.r
    public Object A(Object obj, Object obj2) {
        return this.f8931t.A(obj, obj2);
    }

    @Override // p032f2.r
    public final r C(A a6) {
        r rVar = this.f8931t;
        r rVarC = rVar.C(a6);
        return rVarC == rVar ? this : F(rVarC);
    }

    @Override // p032f2.r
    public final r D(l lVar) {
        r rVar = this.f8931t;
        r rVarD = rVar.D(lVar);
        return rVarD == rVar ? this : F(rVarD);
    }

    @Override // p032f2.r
    public final r E(j jVar) {
        r rVar = this.f8931t;
        r rVarE = rVar.E(jVar);
        return rVarE == rVar ? this : F(rVarE);
    }

    public abstract r F(r rVar);

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return this.f8931t.e();
    }

    @Override // p032f2.r
    public final void h(int i) {
        this.f8931t.h(i);
    }

    @Override // p032f2.r
    public void m(C0474e c0474e) {
        this.f8931t.m(c0474e);
    }

    @Override // p032f2.r
    public final int n() {
        return this.f8931t.n();
    }

    @Override // p032f2.r
    public final Object o() {
        return this.f8931t.o();
    }

    @Override // p032f2.r
    public final String p() {
        return this.f8931t.p();
    }

    @Override // p032f2.r
    public final C q() {
        return this.f8931t.q();
    }

    @Override // p032f2.r
    public final j r() {
        return this.f8931t.r();
    }

    @Override // p032f2.r
    public final d s() {
        return this.f8931t.s();
    }

    @Override // p032f2.r
    public final boolean t() {
        return this.f8931t.t();
    }

    @Override // p032f2.r
    public final boolean u() {
        return this.f8931t.u();
    }

    @Override // p032f2.r
    public final boolean v() {
        return this.f8931t.v();
    }

    @Override // p032f2.r
    public final boolean x() {
        return this.f8931t.x();
    }

    @Override // p032f2.r
    public void z(Object obj, Object obj2) {
        this.f8931t.z(obj, obj2);
    }
}
