package p032f2;

import S1.d0;
import S1.f0;
import T1.k;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p015c2.A;
import p015c2.B;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p037g2.r;
import p037g2.v;
import p046i2.AbstractC0771g;
import p046i2.C;
import p071n2.d;
import p104t2.n;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j implements i, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f8869h;
    public final r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f8870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient LinkedHashMap f8871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f8875o;

    public a(a aVar, r rVar) {
        this.f8869h = aVar.f8869h;
        this.f8870j = aVar.f8870j;
        this.f8872l = aVar.f8872l;
        this.f8873m = aVar.f8873m;
        this.f8874n = aVar.f8874n;
        this.f8875o = aVar.f8875o;
        this.i = rVar;
        this.f8871k = null;
    }

    @Override // p032f2.i
    public final j a(f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        AbstractC0771g abstractC0771gE;
        C cY;
        d0 d0VarJ;
        h hVar;
        r rVar;
        B bD = fVar.f7249l.d();
        LinkedHashMap linkedHashMap = this.f8871k;
        if (interfaceC0472c == null || (abstractC0771gE = interfaceC0472c.e()) == null || (cY = bD.y(abstractC0771gE)) == null) {
            return linkedHashMap == null ? this : new a(this, this.i);
        }
        fVar.K(cY);
        C cZ = bD.z(abstractC0771gE, cY);
        Class cls = cZ.f9477b;
        A a6 = cZ.f9476a;
        if (cls == f0.class) {
            String str = a6.f7195h;
            r rVar2 = linkedHashMap == null ? null : (r) linkedHashMap.get(str);
            if (rVar2 == null) {
                fVar.O("Invalid Object Id definition for " + i.z(this.f8869h.f7281k) + ": cannot find property with name " + i.c(str));
                throw null;
            }
            v vVar = new v(cZ.f9479d);
            hVar = rVar2.f8934k;
            d0VarJ = vVar;
            rVar = rVar2;
        } else {
            fVar.K(cZ);
            h hVarB0 = fVar.b0(cls);
            fVar.A().getClass();
            h hVar2 = n.l(hVarB0, d0.class)[0];
            d0VarJ = fVar.J(cZ);
            hVar = hVar2;
            rVar = null;
        }
        return new a(this, new r(hVar, a6, d0VarJ, fVar.k0(hVar), rVar));
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, f fVar) throws MismatchedInputException {
        h hVar = this.f8869h;
        fVar.o0(hVar.f7281k, new s(hVar), "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
        throw null;
    }

    @Override // p015c2.j
    public final Object deserializeWithType(T1.i iVar, f fVar, d dVar) {
        k kVarS;
        Object objI0 = null;
        r rVar = this.i;
        if (rVar != null && (kVarS = iVar.s()) != null) {
            if (kVarS.f5237o) {
                fVar.j0(rVar.f9160k.deserialize(iVar, fVar), rVar.f9159j).getClass();
                throw null;
            }
            if (kVarS == k.START_OBJECT) {
                kVarS = iVar.B0();
            }
            if (kVarS == k.FIELD_NAME) {
                rVar.f9159j.getClass();
            }
        }
        int iV = iVar.v();
        boolean z5 = this.f8873m;
        switch (iV) {
            case 6:
                if (this.f8872l) {
                    objI0 = iVar.i0();
                }
                break;
            case 7:
                if (this.f8874n) {
                    objI0 = Integer.valueOf(iVar.Z());
                }
                break;
            case 8:
                if (this.f8875o) {
                    objI0 = Double.valueOf(iVar.V());
                }
                break;
            case 9:
                if (z5) {
                    objI0 = Boolean.TRUE;
                }
                break;
            case 10:
                if (z5) {
                    objI0 = Boolean.FALSE;
                }
                break;
        }
        return objI0 != null ? objI0 : dVar.d(iVar, fVar);
    }

    @Override // p015c2.j
    public final r findBackReference(String str) {
        HashMap map = this.f8870j;
        if (map == null) {
            return null;
        }
        return (r) map.get(str);
    }

    @Override // p015c2.j
    public final r getObjectIdReader() {
        return this.i;
    }

    @Override // p015c2.j
    public final Class handledType() {
        return this.f8869h.f7281k;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12494k;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return null;
    }

    public a(f fVar, p046i2.r rVar, HashMap map, LinkedHashMap linkedHashMap) {
        h hVar = rVar.f9562a;
        this.f8869h = hVar;
        this.i = fVar.f8909j;
        this.f8870j = map;
        this.f8871k = linkedHashMap;
        Class cls = hVar.f7281k;
        this.f8872l = cls.isAssignableFrom(String.class);
        boolean z5 = true;
        this.f8873m = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.f8874n = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        if (cls != Double.TYPE && !cls.isAssignableFrom(Double.class)) {
            z5 = false;
        }
        this.f8875o = z5;
    }

    public a(p046i2.r rVar) {
        h hVar = rVar.f9562a;
        this.f8869h = hVar;
        this.i = null;
        this.f8870j = null;
        Class cls = hVar.f7281k;
        this.f8872l = cls.isAssignableFrom(String.class);
        boolean z5 = true;
        this.f8873m = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.f8874n = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        if (cls != Double.TYPE && !cls.isAssignableFrom(Double.class)) {
            z5 = false;
        }
        this.f8875o = z5;
    }
}
