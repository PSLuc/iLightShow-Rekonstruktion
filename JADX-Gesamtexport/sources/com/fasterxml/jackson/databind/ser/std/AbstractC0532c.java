package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.C0360w;
import S1.EnumC0354p;
import S1.V;
import S1.d0;
import S1.f0;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p015c2.C0471b;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0532c extends P implements p093r2.g, p093r2.j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p093r2.b[] f7709p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.h f7710h;
    public final p093r2.b[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p093r2.b[] f7711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H1.d f7712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractC0771g f7714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final K.y f7715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EnumC0354p f7716o;

    static {
        new p015c2.A("#object-ref", null);
        f7709p = new p093r2.b[0];
    }

    public AbstractC0532c(p015c2.h hVar, p093r2.d dVar, p093r2.b[] bVarArr, p093r2.b[] bVarArr2) {
        super(hVar);
        this.f7710h = hVar;
        this.i = bVarArr;
        this.f7711j = bVarArr2;
        if (dVar == null) {
            this.f7714m = null;
            this.f7712k = null;
            this.f7713l = null;
            this.f7715n = null;
            this.f7716o = null;
            return;
        }
        this.f7714m = dVar.f11754g;
        this.f7712k = dVar.f11752e;
        this.f7713l = dVar.f11753f;
        this.f7715n = dVar.f11755h;
        this.f7716o = dVar.f11748a.d().i;
    }

    public static final p093r2.b[] g(p093r2.b[] bVarArr, p109u2.s sVar) {
        if (bVarArr == null || bVarArr.length == 0 || sVar == null || sVar == p109u2.s.f12712h) {
            return bVarArr;
        }
        int length = bVarArr.length;
        p093r2.b[] bVarArr2 = new p093r2.b[length];
        for (int i = 0; i < length; i++) {
            p093r2.b bVar = bVarArr[i];
            if (bVar != null) {
                bVarArr2[i] = bVar.l(sVar);
            }
        }
        return bVarArr2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    @Override // p093r2.j
    public final void a(p015c2.E e6) throws JsonMappingException {
        p093r2.b bVar;
        p071n2.e eVar;
        Object objQ;
        C0545p c0545p;
        p093r2.b bVar2;
        p093r2.b[] bVarArr = this.f7711j;
        int length = bVarArr == null ? 0 : bVarArr.length;
        p093r2.b[] bVarArr2 = this.i;
        int length2 = bVarArr2.length;
        for (int i = 0; i < length2; i++) {
            p093r2.b bVar3 = bVarArr2[i];
            if (!bVar3.f11744v && bVar3.f11741s == null && (c0545p = e6.f7231o) != null) {
                bVar3.j(c0545p);
                if (i < length && (bVar2 = bVarArr[i]) != null) {
                    bVar2.j(c0545p);
                }
            }
            if (bVar3.f11740r == null) {
                p015c2.B bD = e6.f7226j.d();
                p015c2.o oVarO0 = null;
                AbstractC0771g abstractC0771g = bVar3.f11737o;
                if (abstractC0771g != null && (objQ = bD.Q(abstractC0771g)) != null) {
                    p109u2.l lVarM = e6.m(objQ);
                    e6.A();
                    p015c2.h hVar = ((p037g2.m) lVarM).f9146a;
                    oVarO0 = new H(lVarM, hVar, hVar.m0() ? null : e6.o0(hVar, bVar3));
                }
                if (oVarO0 == null) {
                    p015c2.h hVar2 = bVar3.f11735m;
                    if (hVar2 == null) {
                        hVar2 = bVar3.f11734l;
                        if (!Modifier.isFinal(hVar2.f7281k.getModifiers())) {
                            if (hVar2.k0() || ((p104t2.j) hVar2).f12515r.i.length > 0) {
                                bVar3.f11736n = hVar2;
                            }
                        }
                    }
                    oVarO0 = e6.o0(hVar2, bVar3);
                    if (hVar2.k0() && (eVar = (p071n2.e) hVar2.Y().f7284n) != null && (oVarO0 instanceof p093r2.f)) {
                        oVarO0 = ((p093r2.f) oVarO0).c(eVar);
                    }
                    if (i < length) {
                        bVar3.k(oVarO0);
                    } else {
                        bVar3.k(oVarO0);
                    }
                } else if (i < length || (bVar = bVarArr[i]) == null) {
                    bVar3.k(oVarO0);
                } else {
                    bVar.k(oVarO0);
                }
            }
        }
        H1.d dVar = this.f7712k;
        if (dVar != null) {
            p015c2.o oVar = (p015c2.o) dVar.f1758j;
            if (oVar instanceof p093r2.g) {
                p015c2.o oVarS0 = e6.s0(oVar, (C0471b) dVar.i);
                dVar.f1758j = oVarS0;
                if (oVarS0 instanceof C0544o) {
                    dVar.f1759k = (C0544o) oVarS0;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        EnumC0354p enumC0354p;
        Object obj;
        EnumC0354p enumC0354p2;
        int i;
        K.y yVarA;
        int i3;
        Object obj2;
        Set set;
        Set set2;
        p093r2.b[] bVarArr;
        Object obj3;
        p046i2.C cZ;
        EnumC0354p enumC0354p3;
        AbstractC0532c abstractC0532cK = this;
        p015c2.C c6 = e6.f7226j;
        p015c2.B bD = c6.d();
        AbstractC0771g abstractC0771gE = interfaceC0472c != null ? interfaceC0472c.e() : null;
        C0355q c0355qFindFormatOverrides = abstractC0532cK.findFormatOverrides(e6, interfaceC0472c, abstractC0532cK._handledType);
        EnumC0354p enumC0354p4 = abstractC0532cK.f7716o;
        if (c0355qFindFormatOverrides == null || (enumC0354p = c0355qFindFormatOverrides.i) == (enumC0354p3 = EnumC0354p.f4961h)) {
            enumC0354p = null;
        } else if (enumC0354p != enumC0354p3 && enumC0354p != enumC0354p4) {
            p015c2.h hVar = abstractC0532cK.f7710h;
            if (hVar.l0()) {
                int iOrdinal = enumC0354p.ordinal();
                if (iOrdinal == 5 || iOrdinal == 7 || iOrdinal == 8) {
                    c6.i(hVar);
                    Class cls = hVar.f7281k;
                    return e6.s0(new C0540k(p009b2.k.p(c6, cls), C0540k.f(cls, c0355qFindFormatOverrides, true, null)), interfaceC0472c);
                }
            } else if (enumC0354p == EnumC0354p.i && ((!(hVar instanceof p104t2.e) || !Map.class.isAssignableFrom(abstractC0532cK._handledType)) && Map.Entry.class.isAssignableFrom(abstractC0532cK._handledType))) {
                p015c2.h hVarW = hVar.W(Map.Entry.class);
                return e6.s0(new p098s2.f(abstractC0532cK.f7710h, hVarW.V(0), hVarW.V(1), false, null, interfaceC0472c), interfaceC0472c);
            }
        }
        p093r2.b[] bVarArr2 = abstractC0532cK.i;
        K.y yVar = abstractC0532cK.f7715n;
        if (abstractC0771gE != null) {
            C0360w c0360wH = bD.H(abstractC0771gE);
            set2 = c0360wH.f4980j ? Collections.EMPTY_SET : c0360wH.f4979h;
            S1.C cK = bD.K(abstractC0771gE);
            p046i2.C cY = bD.y(abstractC0771gE);
            if (cY != null) {
                p046i2.C cZ2 = bD.z(abstractC0771gE, cY);
                Class cls2 = cZ2.f9477b;
                p015c2.h hVarK = e6.k(cls2);
                e6.A().getClass();
                i = 0;
                p015c2.h hVar2 = p104t2.n.l(hVarK, d0.class)[0];
                p015c2.A a6 = cZ2.f9476a;
                enumC0354p2 = enumC0354p4;
                boolean z5 = cZ2.f9480e;
                if (cls2 == f0.class) {
                    int length = bVarArr2.length;
                    int i6 = 0;
                    while (true) {
                        String str = a6.f7195h;
                        if (i6 == length) {
                            e6.O("Invalid Object Id definition for " + p109u2.i.z(abstractC0532cK.handledType()) + ": cannot find property with name " + p109u2.i.y(str));
                            throw null;
                        }
                        int i7 = length;
                        p093r2.b bVar = bVarArr2[i6];
                        int i8 = i6;
                        if (str.equals(bVar.f11732j.f5505h)) {
                            yVarA = K.y.a(bVar.f11734l, null, new p098s2.g(cZ2.f9479d, bVar), z5);
                            obj = null;
                            i3 = i8;
                            break;
                        }
                        i6 = i8 + 1;
                        length = i7;
                    }
                } else {
                    obj = null;
                    yVarA = K.y.a(hVar2, a6, e6.J(cZ2), z5);
                    i3 = 0;
                }
            } else if (yVar == null || (cZ = bD.z(abstractC0771gE, null)) == null) {
                obj = null;
                yVarA = yVar;
                enumC0354p2 = enumC0354p4;
                i3 = 0;
                i = 0;
            } else {
                boolean z6 = yVar.f2031b;
                boolean z7 = cZ.f9480e;
                obj = null;
                enumC0354p2 = enumC0354p4;
                i3 = 0;
                i = 0;
                yVarA = z7 == z6 ? yVar : new K.y((p015c2.h) yVar.f2032c, (V1.h) yVar.f2033d, (d0) yVar.f2030a, (p015c2.o) yVar.f2034e, z7);
            }
            Object objM = bD.m(abstractC0771gE);
            Set set3 = cK.f4909h;
            if (objM == null || ((obj3 = abstractC0532cK.f7713l) != null && objM.equals(obj3))) {
                set = set3;
                obj2 = obj;
            } else {
                set = set3;
                obj2 = objM;
            }
        } else {
            obj = null;
            enumC0354p2 = enumC0354p4;
            i = 0;
            yVarA = yVar;
            i3 = 0;
            obj2 = null;
            set = null;
            set2 = null;
        }
        if (i3 > 0) {
            p093r2.b[] bVarArr3 = (p093r2.b[]) Arrays.copyOf(bVarArr2, bVarArr2.length);
            p093r2.b bVar2 = bVarArr3[i3];
            int i9 = i;
            System.arraycopy(bVarArr3, i9, bVarArr3, 1, i3);
            bVarArr3[i9] = bVar2;
            p093r2.b[] bVarArr4 = abstractC0532cK.f7711j;
            if (bVarArr4 == null) {
                bVarArr = obj;
            } else {
                bVarArr = (p093r2.b[]) Arrays.copyOf(bVarArr4, bVarArr4.length);
                p093r2.b bVar3 = bVarArr[i3];
                System.arraycopy(bVarArr, i9, bVarArr, 1, i3);
                bVarArr[i9] = bVar3;
            }
            abstractC0532cK = abstractC0532cK.m(bVarArr3, bVarArr);
        }
        if (yVarA != null) {
            K.y yVar2 = new K.y((p015c2.h) yVarA.f2032c, (V1.h) yVarA.f2033d, (d0) yVarA.f2030a, e6.o0((p015c2.h) yVarA.f2032c, interfaceC0472c), yVarA.f2031b);
            if (yVar2 != yVar) {
                abstractC0532cK = abstractC0532cK.l(yVar2);
            }
        }
        if ((set2 != null && !set2.isEmpty()) || set != null) {
            abstractC0532cK = abstractC0532cK.j(set2, set);
        }
        if (obj2 != null) {
            abstractC0532cK = abstractC0532cK.withFilterId(obj2);
        }
        return (enumC0354p == null ? enumC0354p2 : enumC0354p) == EnumC0354p.f4963k ? abstractC0532cK.f() : abstractC0532cK;
    }

    public final void c(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) throws IOException {
        K.y yVar = this.f7715n;
        p098s2.s sVarK0 = e6.k0(obj, (d0) yVar.f2030a);
        if (sVarK0.b(eVar, e6, yVar)) {
            return;
        }
        if (sVarK0.f12194b == null) {
            sVarK0.f12194b = sVarK0.f12193a.c(obj);
        }
        Object obj2 = sVarK0.f12194b;
        if (yVar.f2031b) {
            ((p015c2.o) yVar.f2034e).serialize(obj2, eVar, e6);
            return;
        }
        p003a2.a aVarE = e(eVar2, obj, T1.k.START_OBJECT);
        eVar2.e(eVar, aVarE);
        eVar.C(obj);
        sVarK0.a(eVar, e6, yVar);
        if (this.f7713l != null) {
            i(obj, eVar, e6);
        } else {
            h(obj, eVar, e6);
        }
        eVar2.f(eVar, aVarE);
    }

    public final void d(Object obj, T1.e eVar, p015c2.E e6, boolean z5) throws IOException {
        K.y yVar = this.f7715n;
        p098s2.s sVarK0 = e6.k0(obj, (d0) yVar.f2030a);
        if (sVarK0.b(eVar, e6, yVar)) {
            return;
        }
        if (sVarK0.f12194b == null) {
            sVarK0.f12194b = sVarK0.f12193a.c(obj);
        }
        Object obj2 = sVarK0.f12194b;
        if (yVar.f2031b) {
            ((p015c2.o) yVar.f2034e).serialize(obj2, eVar, e6);
            return;
        }
        if (z5) {
            eVar.p0(obj);
        }
        sVarK0.a(eVar, e6, yVar);
        if (this.f7713l != null) {
            i(obj, eVar, e6);
        } else {
            h(obj, eVar, e6);
        }
        if (z5) {
            eVar.M();
        }
    }

    public final p003a2.a e(p071n2.e eVar, Object obj, T1.k kVar) {
        AbstractC0771g abstractC0771g = this.f7714m;
        if (abstractC0771g == null) {
            return eVar.d(kVar, obj);
        }
        Object objQ = abstractC0771g.q(obj);
        if (objQ == null) {
            objQ = "";
        }
        p003a2.a aVarD = eVar.d(kVar, obj);
        aVarD.f6159c = objQ;
        return aVarD;
    }

    public abstract AbstractC0532c f();

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) throws JsonMappingException {
        JsonNode schema;
        String strId;
        p087q2.r rVarCreateSchemaNode = createSchemaNode("object", true);
        p065m2.a aVar = (p065m2.a) this._handledType.getAnnotation(p065m2.a.class);
        if (aVar != null && (strId = aVar.id()) != null && !strId.isEmpty()) {
            rVarCreateSchemaNode.q(AuthorizationClient.PlayStoreParams.ID, strId);
        }
        p087q2.m mVar = rVarCreateSchemaNode.f11215h;
        mVar.getClass();
        p087q2.r rVar = new p087q2.r(mVar);
        Object obj = this.f7713l;
        if (obj != null) {
            findPropertyFilter(e6, obj, null);
        }
        int i = 0;
        while (true) {
            p093r2.b[] bVarArr = this.i;
            if (i >= bVarArr.length) {
                rVarCreateSchemaNode.w("properties", rVar);
                return rVarCreateSchemaNode;
            }
            p093r2.b bVar = bVarArr[i];
            p015c2.h hVar = bVar.f11734l;
            p015c2.h hVar2 = bVar.f11735m;
            Type type2 = hVar2 == null ? hVar : hVar2.f7281k;
            p015c2.o oVarO0 = bVar.f11740r;
            if (oVarO0 == null) {
                oVarO0 = e6.o0(hVar, bVar);
            }
            boolean z5 = !bVar.d();
            if (oVarO0 instanceof P) {
                schema = ((P) oVarO0).getSchema(e6, type2, z5);
            } else {
                p087q2.r rVar2 = new p087q2.r(p087q2.m.f11222h);
                rVar2.q("type", "any");
                schema = rVar2;
            }
            bVar.g(rVar, schema);
            i++;
        }
    }

    public final void h(Object obj, T1.e eVar, p015c2.E e6) throws IOException {
        if (this.f7711j != null) {
            e6.getClass();
        }
        p093r2.b[] bVarArr = this.i;
        int i = 0;
        try {
            int length = bVarArr.length;
            while (i < length) {
                p093r2.b bVar = bVarArr[i];
                if (bVar != null) {
                    bVar.n(obj, eVar, e6);
                }
                i++;
            }
            H1.d dVar = this.f7712k;
            if (dVar != null) {
                dVar.h(obj, eVar, e6);
            }
        } catch (Exception e7) {
            wrapAndThrow(e6, e7, obj, i != bVarArr.length ? bVarArr[i].f11732j.f5505h : "[anySetter]");
        } catch (StackOverflowError e8) {
            JsonMappingException jsonMappingException = new JsonMappingException(eVar, "Infinite recursion (StackOverflowError)", e8);
            jsonMappingException.e(i != bVarArr.length ? bVarArr[i].f11732j.f5505h : "[anySetter]", obj);
            throw jsonMappingException;
        }
    }

    public final void i(Object obj, T1.e eVar, p015c2.E e6) throws IOException {
        if (this.f7711j != null) {
            e6.getClass();
        }
        findPropertyFilter(e6, this.f7713l, obj);
        h(obj, eVar, e6);
    }

    public abstract AbstractC0532c j(Set set, Set set2);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC0532c withFilterId(Object obj);

    public abstract AbstractC0532c l(K.y yVar);

    public abstract AbstractC0532c m(p093r2.b[] bVarArr, p093r2.b[] bVarArr2);

    @Override // p015c2.o
    public final Iterator properties() {
        return Arrays.asList(this.i).iterator();
    }

    @Override // p015c2.o
    public void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) throws IOException {
        if (this.f7715n != null) {
            c(obj, eVar, e6, eVar2);
            return;
        }
        p003a2.a aVarE = e(eVar2, obj, T1.k.START_OBJECT);
        eVar2.e(eVar, aVarE);
        eVar.C(obj);
        if (this.f7713l != null) {
            i(obj, eVar, e6);
        } else {
            h(obj, eVar, e6);
        }
        eVar2.f(eVar, aVarE);
    }

    @Override // p015c2.o
    public final boolean usesObjectId() {
        return this.f7715n != null;
    }

    public AbstractC0532c(AbstractC0532c abstractC0532c, p093r2.b[] bVarArr, p093r2.b[] bVarArr2) {
        super(abstractC0532c._handledType);
        this.f7710h = abstractC0532c.f7710h;
        this.i = bVarArr;
        this.f7711j = bVarArr2;
        this.f7714m = abstractC0532c.f7714m;
        this.f7712k = abstractC0532c.f7712k;
        this.f7715n = abstractC0532c.f7715n;
        this.f7713l = abstractC0532c.f7713l;
        this.f7716o = abstractC0532c.f7716o;
    }

    public AbstractC0532c(AbstractC0532c abstractC0532c, K.y yVar, Object obj) {
        super(abstractC0532c._handledType);
        this.f7710h = abstractC0532c.f7710h;
        this.i = abstractC0532c.i;
        this.f7711j = abstractC0532c.f7711j;
        this.f7714m = abstractC0532c.f7714m;
        this.f7712k = abstractC0532c.f7712k;
        this.f7715n = yVar;
        this.f7713l = obj;
        this.f7716o = abstractC0532c.f7716o;
    }

    public AbstractC0532c(AbstractC0532c abstractC0532c, Set set, Set set2) {
        super(abstractC0532c._handledType);
        this.f7710h = abstractC0532c.f7710h;
        p093r2.b[] bVarArr = abstractC0532c.i;
        p093r2.b[] bVarArr2 = abstractC0532c.f7711j;
        int length = bVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = bVarArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            p093r2.b bVar = bVarArr[i];
            if (!V.M(bVar.f11732j.f5505h, set, set2)) {
                arrayList.add(bVar);
                if (bVarArr2 != null) {
                    arrayList2.add(bVarArr2[i]);
                }
            }
        }
        this.i = (p093r2.b[]) arrayList.toArray(new p093r2.b[arrayList.size()]);
        this.f7711j = arrayList2 != null ? (p093r2.b[]) arrayList2.toArray(new p093r2.b[arrayList2.size()]) : null;
        this.f7714m = abstractC0532c.f7714m;
        this.f7712k = abstractC0532c.f7712k;
        this.f7715n = abstractC0532c.f7715n;
        this.f7713l = abstractC0532c.f7713l;
        this.f7716o = abstractC0532c.f7716o;
    }
}
