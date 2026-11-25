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
public final class p extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0772h f9152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Method f9153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9154v;

    public p(t tVar, h hVar, d dVar, InterfaceC0963b interfaceC0963b, C0772h c0772h) {
        super(tVar, hVar, dVar, interfaceC0963b);
        this.f9152t = c0772h;
        this.f9153u = c0772h.f9547l;
        this.f9154v = q.a(this.f8937n);
    }

    @Override // p032f2.r
    public final Object A(Object obj, Object obj2) throws JsonMappingException {
        try {
            Object objInvoke = this.f9153u.invoke(obj, obj2);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e6) {
            g(null, e6, obj2);
            throw null;
        }
    }

    @Override // p032f2.r
    public final r C(A a6) {
        return new p(this, a6);
    }

    @Override // p032f2.r
    public final r D(l lVar) {
        return new p(this, this.f8935l, lVar);
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
        return new p(this, jVar, lVar);
    }

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return this.f9152t;
    }

    @Override // p032f2.r
    public final void j(i iVar, f fVar, Object obj) throws JsonMappingException {
        Object objDeserializeWithType;
        boolean zS0 = iVar.s0(k.VALUE_NULL);
        l lVar = this.f8937n;
        boolean z5 = this.f9154v;
        if (!zS0) {
            j jVar = this.f8935l;
            d dVar = this.f8936m;
            if (dVar == null) {
                Object objDeserialize = jVar.deserialize(iVar, fVar);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (z5) {
                    return;
                } else {
                    objDeserializeWithType = lVar.getNullValue(fVar);
                }
            } else {
                objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
            }
        } else if (z5) {
            return;
        } else {
            objDeserializeWithType = lVar.getNullValue(fVar);
        }
        try {
            this.f9153u.invoke(obj, objDeserializeWithType);
        } catch (Exception e6) {
            g(iVar, e6, objDeserializeWithType);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b A[RETURN] */
    @Override // p032f2.r
    public final Object k(i iVar, f fVar, Object obj) throws JsonMappingException {
        Object objDeserializeWithType;
        Object objInvoke;
        boolean zS0 = iVar.s0(k.VALUE_NULL);
        l lVar = this.f8937n;
        boolean z5 = this.f9154v;
        if (!zS0) {
            j jVar = this.f8935l;
            d dVar = this.f8936m;
            if (dVar == null) {
                Object objDeserialize = jVar.deserialize(iVar, fVar);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (!z5) {
                    objDeserializeWithType = lVar.getNullValue(fVar);
                }
            } else {
                objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
            }
            objInvoke = this.f9153u.invoke(obj, objDeserializeWithType);
            if (objInvoke == null) {
                return objInvoke;
            }
        } else if (!z5) {
            objDeserializeWithType = lVar.getNullValue(fVar);
            try {
                objInvoke = this.f9153u.invoke(obj, objDeserializeWithType);
                if (objInvoke == null) {
                    return objInvoke;
                }
            } catch (Exception e6) {
                g(iVar, e6, objDeserializeWithType);
                throw null;
            }
        }
        return obj;
    }

    @Override // p032f2.r
    public final void m(C0474e c0474e) {
        this.f9152t.m(c0474e.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // p032f2.r
    public final void z(Object obj, Object obj2) throws JsonMappingException {
        try {
            this.f9153u.invoke(obj, obj2);
        } catch (Exception e6) {
            g(null, e6, obj2);
            throw null;
        }
    }

    public p(p pVar, j jVar, l lVar) {
        super(pVar, jVar, lVar);
        this.f9152t = pVar.f9152t;
        this.f9153u = pVar.f9153u;
        this.f9154v = q.a(lVar);
    }

    public p(p pVar, A a6) {
        super(pVar, a6);
        this.f9152t = pVar.f9152t;
        this.f9153u = pVar.f9153u;
        this.f9154v = pVar.f9154v;
    }
}
