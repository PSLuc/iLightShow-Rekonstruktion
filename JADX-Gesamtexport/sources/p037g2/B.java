package p037g2;

import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.Method;
import p015c2.A;
import p015c2.C0474e;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p032f2.l;
import p032f2.r;
import p046i2.AbstractC0771g;
import p046i2.C0772h;
import p046i2.t;
import p071n2.d;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public final class B extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0772h f9101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f9102u;

    public B(t tVar, h hVar, d dVar, InterfaceC0963b interfaceC0963b, C0772h c0772h) {
        super(tVar, hVar, dVar, interfaceC0963b);
        this.f9101t = c0772h;
        this.f9102u = c0772h.f9547l;
    }

    @Override // p032f2.r
    public final Object A(Object obj, Object obj2) {
        z(obj, obj2);
        throw null;
    }

    @Override // p032f2.r
    public final r C(A a6) {
        return new B(this, a6);
    }

    @Override // p032f2.r
    public final r D(l lVar) {
        return new B(this, this.f8935l, lVar);
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
        return new B(this, jVar, lVar);
    }

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return this.f9101t;
    }

    @Override // p032f2.r
    public final void j(i iVar, f fVar, Object obj) throws JsonMappingException {
        if (iVar.s0(k.VALUE_NULL)) {
            return;
        }
        d dVar = this.f8936m;
        A a6 = this.f8933j;
        if (dVar != null) {
            fVar.O("Problem deserializing 'setterless' property (\"" + a6.f7195h + "\"): no way to handle typed deser with setterless yet");
            throw null;
        }
        try {
            Object objInvoke = this.f9102u.invoke(obj, null);
            if (objInvoke != null) {
                this.f8935l.deserialize(iVar, fVar, objInvoke);
                return;
            }
            fVar.O("Problem deserializing 'setterless' property '" + a6.f7195h + "': get method returned null");
            throw null;
        } catch (Exception e6) {
            p109u2.i.D(e6);
            p109u2.i.E(e6);
            Throwable thQ = p109u2.i.q(e6);
            throw new JsonMappingException(iVar, p109u2.i.i(thQ), thQ);
        }
    }

    @Override // p032f2.r
    public final Object k(i iVar, f fVar, Object obj) throws JsonMappingException {
        j(iVar, fVar, obj);
        return obj;
    }

    @Override // p032f2.r
    public final void m(C0474e c0474e) {
        this.f9101t.m(c0474e.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // p032f2.r
    public final void z(Object obj, Object obj2) {
        throw new UnsupportedOperationException(p012c.k.u(new StringBuilder("Should never call `set()` on setterless property ('"), this.f8933j.f7195h, "')"));
    }

    public B(B b6, j jVar, l lVar) {
        super(b6, jVar, lVar);
        this.f9101t = b6.f9101t;
        this.f9102u = b6.f9102u;
    }

    public B(B b6, A a6) {
        super(b6, a6);
        this.f9101t = b6.f9101t;
        this.f9102u = b6.f9102u;
    }
}
