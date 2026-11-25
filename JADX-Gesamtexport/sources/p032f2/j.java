package p032f2;

import S1.C0340b;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import p015c2.A;
import p015c2.C0474e;
import p015c2.f;
import p015c2.h;
import p015c2.z;
import p046i2.AbstractC0771g;
import p046i2.C0776l;
import p071n2.d;
import p109u2.InterfaceC0963b;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class j extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0776l f8917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0340b f8918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r f8919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f8920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8921x;

    public j(A a6, h hVar, d dVar, InterfaceC0963b interfaceC0963b, C0776l c0776l, int i, C0340b c0340b, z zVar) {
        super(a6, hVar, null, dVar, interfaceC0963b, zVar);
        this.f8917t = c0776l;
        this.f8920w = i;
        this.f8918u = c0340b;
        this.f8919v = null;
    }

    @Override // p032f2.r
    public final Object A(Object obj, Object obj2) throws InvalidDefinitionException {
        F();
        return this.f8919v.A(obj, obj2);
    }

    @Override // p032f2.r
    public final r C(A a6) {
        return new j(this, a6);
    }

    @Override // p032f2.r
    public final r D(l lVar) {
        return new j(this, this.f8935l, lVar);
    }

    @Override // p032f2.r
    public final r E(p015c2.j jVar) {
        p015c2.j jVar2 = this.f8935l;
        if (jVar2 == jVar) {
            return this;
        }
        l lVar = this.f8937n;
        if (jVar2 == lVar) {
            lVar = jVar;
        }
        return new j(this, jVar, lVar);
    }

    public final void F() throws InvalidDefinitionException {
        if (this.f8919v != null) {
            return;
        }
        throw new InvalidDefinitionException(null, "No fallback setter/field defined for creator property " + i.y(this.f8933j.f7195h));
    }

    @Override // p046i2.w, p015c2.InterfaceC0472c
    public final z c() {
        r rVar = this.f8919v;
        z zVar = this.f9578h;
        return rVar != null ? zVar.b(rVar.c().f7343l) : zVar;
    }

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return this.f8917t;
    }

    @Override // p032f2.r
    public final void j(T1.i iVar, f fVar, Object obj) throws InvalidDefinitionException {
        F();
        this.f8919v.z(obj, i(iVar, fVar));
    }

    @Override // p032f2.r
    public final Object k(T1.i iVar, f fVar, Object obj) throws InvalidDefinitionException {
        F();
        return this.f8919v.A(obj, i(iVar, fVar));
    }

    @Override // p032f2.r
    public final void m(C0474e c0474e) {
        r rVar = this.f8919v;
        if (rVar != null) {
            rVar.m(c0474e);
        }
    }

    @Override // p032f2.r
    public final int n() {
        return this.f8920w;
    }

    @Override // p032f2.r
    public final Object o() {
        C0340b c0340b = this.f8918u;
        if (c0340b == null) {
            return null;
        }
        return c0340b.f4927h;
    }

    @Override // p032f2.r
    public final String toString() {
        return "[creator property, name " + i.y(this.f8933j.f7195h) + "; inject id '" + o() + "']";
    }

    @Override // p032f2.r
    public final boolean w() {
        return this.f8921x;
    }

    @Override // p032f2.r
    public final boolean x() {
        C0340b c0340b = this.f8918u;
        if (c0340b == null) {
            return false;
        }
        Boolean bool = c0340b.i;
        return !(bool == null ? true : bool.booleanValue());
    }

    @Override // p032f2.r
    public final void y() {
        this.f8921x = true;
    }

    @Override // p032f2.r
    public final void z(Object obj, Object obj2) throws InvalidDefinitionException {
        F();
        this.f8919v.z(obj, obj2);
    }

    public j(j jVar, A a6) {
        super(jVar, a6);
        this.f8917t = jVar.f8917t;
        this.f8918u = jVar.f8918u;
        this.f8919v = jVar.f8919v;
        this.f8920w = jVar.f8920w;
        this.f8921x = jVar.f8921x;
    }

    public j(j jVar, p015c2.j jVar2, l lVar) {
        super(jVar, jVar2, lVar);
        this.f8917t = jVar.f8917t;
        this.f8918u = jVar.f8918u;
        this.f8919v = jVar.f8919v;
        this.f8920w = jVar.f8920w;
        this.f8921x = jVar.f8921x;
    }
}
