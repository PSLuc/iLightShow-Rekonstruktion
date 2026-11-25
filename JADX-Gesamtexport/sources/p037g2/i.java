package p037g2;

import T1.k;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.Field;
import p015c2.A;
import p015c2.C0474e;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p032f2.l;
import p032f2.r;
import p046i2.AbstractC0771g;
import p046i2.C0769e;
import p046i2.t;
import p071n2.d;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0769e f9139t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Field f9140u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9141v;

    public i(t tVar, h hVar, d dVar, InterfaceC0963b interfaceC0963b, C0769e c0769e) {
        super(tVar, hVar, dVar, interfaceC0963b);
        this.f9139t = c0769e;
        this.f9140u = c0769e.f9542k;
        this.f9141v = q.a(this.f8937n);
    }

    @Override // p032f2.r
    public final Object A(Object obj, Object obj2) throws JsonMappingException {
        try {
            this.f9140u.set(obj, obj2);
            return obj;
        } catch (Exception e6) {
            g(null, e6, obj2);
            throw null;
        }
    }

    @Override // p032f2.r
    public final r C(A a6) {
        return new i(this, a6);
    }

    @Override // p032f2.r
    public final r D(l lVar) {
        return new i(this, this.f8935l, lVar);
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
        return new i(this, jVar, lVar);
    }

    @Override // p015c2.InterfaceC0472c
    public final AbstractC0771g e() {
        return this.f9139t;
    }

    @Override // p032f2.r
    public final void j(T1.i iVar, f fVar, Object obj) throws JsonMappingException {
        Object objDeserializeWithType;
        boolean zS0 = iVar.s0(k.VALUE_NULL);
        l lVar = this.f8937n;
        boolean z5 = this.f9141v;
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
            this.f9140u.set(obj, objDeserializeWithType);
        } catch (Exception e6) {
            g(iVar, e6, objDeserializeWithType);
            throw null;
        }
    }

    @Override // p032f2.r
    public final Object k(T1.i iVar, f fVar, Object obj) throws JsonMappingException {
        Object objDeserializeWithType;
        boolean zS0 = iVar.s0(k.VALUE_NULL);
        l lVar = this.f8937n;
        boolean z5 = this.f9141v;
        if (zS0) {
            if (!z5) {
                objDeserializeWithType = lVar.getNullValue(fVar);
                try {
                    this.f9140u.set(obj, objDeserializeWithType);
                    return obj;
                } catch (Exception e6) {
                    g(iVar, e6, objDeserializeWithType);
                    throw null;
                }
            }
            return obj;
        }
        j jVar = this.f8935l;
        d dVar = this.f8936m;
        if (dVar == null) {
            Object objDeserialize = jVar.deserialize(iVar, fVar);
            if (objDeserialize == null) {
                if (!z5) {
                    objDeserializeWithType = lVar.getNullValue(fVar);
                }
                return obj;
            }
            objDeserializeWithType = objDeserialize;
        } else {
            objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
        }
        this.f9140u.set(obj, objDeserializeWithType);
        return obj;
    }

    @Override // p032f2.r
    public final void m(C0474e c0474e) {
        p109u2.i.e(this.f9140u, c0474e.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // p032f2.r
    public final void z(Object obj, Object obj2) throws JsonMappingException {
        try {
            this.f9140u.set(obj, obj2);
        } catch (Exception e6) {
            g(null, e6, obj2);
            throw null;
        }
    }

    public i(i iVar, j jVar, l lVar) {
        super(iVar, jVar, lVar);
        this.f9139t = iVar.f9139t;
        this.f9140u = iVar.f9140u;
        this.f9141v = q.a(lVar);
    }

    public i(i iVar, A a6) {
        super(iVar, a6);
        this.f9139t = iVar.f9139t;
        this.f9140u = iVar.f9140u;
        this.f9141v = iVar.f9141v;
    }
}
