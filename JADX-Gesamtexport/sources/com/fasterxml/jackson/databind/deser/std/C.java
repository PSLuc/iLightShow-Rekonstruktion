package com.fasterxml.jackson.databind.deser.std;

import S1.C0360w;
import c5.C0495p;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0514j implements p032f2.i, p032f2.m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.q f7536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p015c2.j f7538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p071n2.d f7539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p032f2.t f7540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p015c2.j f7541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O1.u f7542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Set f7544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Set f7545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p009b2.k f7546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f7547w;

    public C(p104t2.e eVar, p032f2.t tVar, p015c2.q qVar, p015c2.j jVar, p071n2.d dVar) {
        super(eVar, (p032f2.l) null, (Boolean) null);
        this.f7536l = qVar;
        this.f7538n = jVar;
        this.f7539o = dVar;
        this.f7540p = tVar;
        this.f7543s = tVar.j();
        this.f7541q = null;
        this.f7542r = null;
        this.f7537m = f(eVar, qVar);
        this.f7546v = null;
        this.f7547w = eVar.f12506u.h0(Object.class);
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        AbstractC0771g abstractC0771gE;
        p015c2.h hVar = this.f7605h;
        p015c2.q qVar = this.f7536l;
        p015c2.q qVarH0 = qVar == null ? fVar.h0(hVar.b0()) : qVar;
        p015c2.j jVar = this.f7538n;
        p015c2.j jVarFindConvertingContentDeserializer = interfaceC0472c != null ? findConvertingContentDeserializer(fVar, interfaceC0472c, jVar) : jVar;
        p015c2.h hVarY = hVar.Y();
        p015c2.j jVarF0 = jVarFindConvertingContentDeserializer == null ? fVar.f0(hVarY, interfaceC0472c) : fVar.q0(jVarFindConvertingContentDeserializer, interfaceC0472c, hVarY);
        p071n2.d dVar = this.f7539o;
        p071n2.d dVarF = dVar != null ? dVar.f(interfaceC0472c) : dVar;
        Set hashSet = this.f7544t;
        Set hashSet2 = this.f7545u;
        p015c2.B bD = fVar.f7249l.d();
        if (g0._neitherNull(bD, interfaceC0472c) && (abstractC0771gE = interfaceC0472c.e()) != null) {
            C0360w c0360wH = bD.H(abstractC0771gE);
            if (c0360wH != null) {
                Set set = c0360wH.f4981k ? Collections.EMPTY_SET : c0360wH.f4979h;
                if (!set.isEmpty()) {
                    hashSet = hashSet == null ? new HashSet() : new HashSet(hashSet);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        hashSet.add((String) it.next());
                    }
                }
            }
            Set<String> set2 = bD.K(abstractC0771gE).f4909h;
            if (set2 != null) {
                HashSet hashSet3 = new HashSet();
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(set2);
                } else {
                    for (String str : set2) {
                        if (hashSet2.contains(str)) {
                            hashSet3.add(str);
                        }
                    }
                    hashSet2 = hashSet3;
                }
            }
        }
        Set set3 = hashSet;
        Set set4 = hashSet2;
        p032f2.l lVarFindContentNullProvider = findContentNullProvider(fVar, interfaceC0472c, jVarF0);
        return (qVar == qVarH0 && jVar == jVarF0 && dVar == dVarF && this.i == lVarFindContentNullProvider && this.f7544t == set3 && this.f7545u == set4) ? this : new C(this, qVarH0, jVarF0, dVarF, lVarFindContentNullProvider, set3, set4);
    }

    @Override // p032f2.m
    public final void b(p015c2.f fVar) throws InvalidDefinitionException {
        p032f2.t tVar = this.f7540p;
        boolean zK = tVar.k();
        p015c2.h hVar = this.f7605h;
        if (zK) {
            C0474e c0474e = fVar.f7249l;
            p015c2.h hVarB = tVar.B();
            if (hVarB == null) {
                fVar.O(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", hVar, tVar.getClass().getName()));
                throw null;
            }
            this.f7541q = findDeserializer(fVar, hVarB, null);
        } else if (tVar.i()) {
            C0474e c0474e2 = fVar.f7249l;
            p015c2.h hVarY = tVar.y();
            if (hVarY == null) {
                fVar.O(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", hVar, tVar.getClass().getName()));
                throw null;
            }
            this.f7541q = findDeserializer(fVar, hVarY, null);
        }
        if (tVar.g()) {
            this.f7542r = O1.u.f(fVar, tVar, tVar.C(fVar.f7249l), fVar.f7249l.k(p015c2.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.f7537m = f(hVar, this.f7536l);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j
    public final p015c2.j d() {
        return this.f7538n;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws IOException {
        String strO;
        Object objDeserialize;
        String strO2;
        Object objDeserialize2;
        Map map = (Map) obj;
        iVar.E0(map);
        T1.k kVarS = iVar.s();
        if (kVarS != T1.k.START_OBJECT && kVarS != T1.k.FIELD_NAME) {
            fVar.s0(iVar, this.f7605h.f7281k);
            throw null;
        }
        boolean z5 = this.f7537m;
        p071n2.d dVar = this.f7539o;
        p015c2.j jVar = this.f7538n;
        p032f2.l lVar = this.i;
        boolean z6 = this.f7606j;
        if (z5) {
            if (iVar.x0()) {
                strO2 = iVar.z0();
            } else {
                T1.k kVarS2 = iVar.s();
                if (kVarS2 != T1.k.END_OBJECT) {
                    T1.k kVar = T1.k.FIELD_NAME;
                    if (kVarS2 != kVar) {
                        fVar.L0(this, kVar, null, new Object[0]);
                        throw null;
                    }
                    strO2 = iVar.o();
                }
            }
            while (strO2 != null) {
                T1.k kVarB0 = iVar.B0();
                p009b2.k kVar2 = this.f7546v;
                if (kVar2 == null || !kVar2.s(strO2)) {
                    try {
                        if (kVarB0 != T1.k.VALUE_NULL) {
                            Object obj2 = map.get(strO2);
                            if (obj2 != null) {
                                objDeserialize2 = dVar == null ? jVar.deserialize(iVar, fVar, obj2) : jVar.deserializeWithType(iVar, fVar, dVar, obj2);
                            } else {
                                objDeserialize2 = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
                            }
                            if (objDeserialize2 != obj2) {
                                map.put(strO2, objDeserialize2);
                            }
                        } else if (!z6) {
                            map.put(strO2, lVar.getNullValue(fVar));
                        }
                    } catch (Exception e6) {
                        AbstractC0514j.e(fVar, e6, map, strO2);
                        throw null;
                    }
                } else {
                    iVar.F0();
                }
                strO2 = iVar.z0();
            }
        } else {
            if (iVar.x0()) {
                strO = iVar.z0();
            } else {
                T1.k kVarS3 = iVar.s();
                if (kVarS3 != T1.k.END_OBJECT) {
                    T1.k kVar3 = T1.k.FIELD_NAME;
                    if (kVarS3 != kVar3) {
                        fVar.L0(this, kVar3, null, new Object[0]);
                        throw null;
                    }
                    strO = iVar.o();
                }
            }
            while (strO != null) {
                Object objA = this.f7536l.a(fVar, strO);
                T1.k kVarB1 = iVar.B0();
                p009b2.k kVar4 = this.f7546v;
                if (kVar4 == null || !kVar4.s(strO)) {
                    try {
                        if (kVarB1 != T1.k.VALUE_NULL) {
                            Object obj3 = map.get(objA);
                            if (obj3 != null) {
                                objDeserialize = dVar == null ? jVar.deserialize(iVar, fVar, obj3) : jVar.deserializeWithType(iVar, fVar, dVar, obj3);
                            } else {
                                objDeserialize = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
                            }
                            if (objDeserialize != obj3) {
                                map.put(objA, objDeserialize);
                            }
                        } else if (!z6) {
                            map.put(objA, lVar.getNullValue(fVar));
                        }
                    } catch (Exception e7) {
                        AbstractC0514j.e(fVar, e7, map, strO);
                        throw null;
                    }
                } else {
                    iVar.F0();
                }
                strO = iVar.z0();
            }
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.d(iVar, fVar);
    }

    public final boolean f(p015c2.h hVar, p015c2.q qVar) {
        p015c2.h hVarB0;
        if (qVar == null || (hVarB0 = hVar.b0()) == null) {
            return true;
        }
        Class cls = hVarB0.f7281k;
        return (cls == String.class || cls == Object.class) && isDefaultKeyDeserializer(qVar);
    }

    public final void g(T1.i iVar, p015c2.f fVar, Map map) throws IOException {
        String strO;
        p015c2.f fVar2;
        Map map2;
        C c6;
        Exception exc;
        UnresolvedForwardReference unresolvedForwardReference;
        Object nullValue;
        p015c2.j jVar = this.f7538n;
        boolean z5 = jVar.getObjectIdReader() != null;
        C0495p c0495p = z5 ? new C0495p(this.f7605h.Y().f7281k, map) : null;
        if (iVar.x0()) {
            strO = iVar.z0();
        } else {
            T1.k kVarS = iVar.s();
            T1.k kVar = T1.k.FIELD_NAME;
            if (kVarS != kVar) {
                if (kVarS == T1.k.END_OBJECT) {
                    return;
                }
                fVar.L0(this, kVar, null, new Object[0]);
                throw null;
            }
            strO = iVar.o();
        }
        while (strO != null) {
            Object objA = this.f7536l.a(fVar, strO);
            T1.k kVarB0 = iVar.B0();
            p009b2.k kVar2 = this.f7546v;
            if (kVar2 == null || !kVar2.s(strO)) {
                try {
                    if (kVarB0 == T1.k.VALUE_NULL) {
                        try {
                            if (!this.f7606j) {
                                nullValue = this.i.getNullValue(fVar);
                            }
                        } catch (UnresolvedForwardReference e6) {
                            unresolvedForwardReference = e6;
                            c6 = this;
                            fVar2 = fVar;
                            c6.i(fVar2, c0495p, objA, unresolvedForwardReference);
                            throw null;
                        } catch (Exception e7) {
                            exc = e7;
                            fVar2 = fVar;
                            map2 = map;
                            AbstractC0514j.e(fVar2, exc, map2, strO);
                            throw null;
                        }
                    } else {
                        p071n2.d dVar = this.f7539o;
                        nullValue = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
                    }
                    Object obj = nullValue;
                    if (z5) {
                        c0495p.w(objA, obj);
                    } else {
                        Object objPut = map.put(objA, obj);
                        if (objPut != null) {
                            c6 = this;
                            fVar2 = fVar;
                            map2 = map;
                            try {
                                c6.h(fVar2, map2, objA, objPut, obj);
                            } catch (UnresolvedForwardReference e8) {
                                e = e8;
                                unresolvedForwardReference = e;
                                c6.i(fVar2, c0495p, objA, unresolvedForwardReference);
                                throw null;
                            } catch (Exception e9) {
                                e = e9;
                                exc = e;
                                AbstractC0514j.e(fVar2, exc, map2, strO);
                                throw null;
                            }
                        }
                        strO = iVar.z0();
                        this = c6;
                        fVar = fVar2;
                        map = map2;
                    }
                } catch (UnresolvedForwardReference e10) {
                    e = e10;
                    c6 = this;
                    fVar2 = fVar;
                } catch (Exception e11) {
                    e = e11;
                    fVar2 = fVar;
                    map2 = map;
                }
            } else {
                iVar.F0();
            }
            c6 = this;
            fVar2 = fVar;
            map2 = map;
            strO = iVar.z0();
            this = c6;
            fVar = fVar2;
            map = map2;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final p032f2.t getValueInstantiator() {
        return this.f7540p;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j, com.fasterxml.jackson.databind.deser.std.g0
    public final p015c2.h getValueType() {
        return this.f7605h;
    }

    public final void h(p015c2.f fVar, Map map, Object obj, Object obj2, Object obj3) {
        if (this.f7547w && fVar.A0(T1.o.DUPLICATE_PROPERTIES)) {
            if (obj2 instanceof List) {
                ((List) obj2).add(obj3);
                map.put(obj, obj2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj2);
                arrayList.add(obj3);
                map.put(obj, arrayList);
            }
        }
    }

    public final void i(p015c2.f fVar, C0495p c0495p, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws MismatchedInputException {
        if (c0495p != null) {
            ((ArrayList) c0495p.f7476j).add(new B(c0495p, unresolvedForwardReference, obj));
            throw null;
        }
        fVar.J0(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        throw null;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return this.f7538n == null && this.f7536l == null && this.f7539o == null && this.f7544t == null && this.f7545u == null;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12493j;
    }

    public C(C c6, p015c2.q qVar, p015c2.j jVar, p071n2.d dVar, p032f2.l lVar, Set set, Set set2) {
        super(c6, lVar, c6.f7607k);
        this.f7536l = qVar;
        this.f7538n = jVar;
        this.f7539o = dVar;
        this.f7540p = c6.f7540p;
        this.f7542r = c6.f7542r;
        this.f7541q = c6.f7541q;
        this.f7543s = c6.f7543s;
        this.f7544t = set;
        this.f7545u = set2;
        this.f7546v = S1.V.p(set, set2);
        this.f7537m = f(this.f7605h, qVar);
        this.f7547w = c6.f7547w;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws IOException {
        String strO;
        Object objDeserializeWithType;
        String strO2;
        Object objDeserializeWithType2;
        O1.u uVar = this.f7542r;
        p071n2.d dVar = this.f7539o;
        p015c2.j jVar = this.f7538n;
        p032f2.l lVar = this.i;
        boolean z5 = this.f7606j;
        p015c2.h hVar = this.f7605h;
        if (uVar != null) {
            p037g2.z zVarV = uVar.v(iVar, fVar, null);
            if (iVar.x0()) {
                strO2 = iVar.z0();
            } else {
                strO2 = iVar.s0(T1.k.FIELD_NAME) ? iVar.o() : null;
            }
            while (strO2 != null) {
                T1.k kVarB0 = iVar.B0();
                p009b2.k kVar = this.f7546v;
                if (kVar != null && kVar.s(strO2)) {
                    iVar.F0();
                } else {
                    p032f2.r rVarG = uVar.g(strO2);
                    if (rVarG != null) {
                        if (zVarV.b(rVarG, rVarG.i(iVar, fVar))) {
                            iVar.B0();
                            try {
                                Map map = (Map) uVar.d(fVar, zVarV);
                                g(iVar, fVar, map);
                                return map;
                            } catch (Exception e6) {
                                AbstractC0514j.e(fVar, e6, hVar.f7281k, strO2);
                                throw null;
                            }
                        }
                    } else {
                        Object objA = this.f7536l.a(fVar, strO2);
                        try {
                            if (kVarB0 == T1.k.VALUE_NULL) {
                                if (!z5) {
                                    objDeserializeWithType2 = lVar.getNullValue(fVar);
                                }
                            } else if (dVar == null) {
                                objDeserializeWithType2 = jVar.deserialize(iVar, fVar);
                            } else {
                                objDeserializeWithType2 = jVar.deserializeWithType(iVar, fVar, dVar);
                            }
                            zVarV.f9178h = new p037g2.x(zVarV.f9178h, objDeserializeWithType2, objA, 0);
                        } catch (Exception e7) {
                            AbstractC0514j.e(fVar, e7, hVar.f7281k, strO2);
                            throw null;
                        }
                    }
                }
                strO2 = iVar.z0();
            }
            try {
                return (Map) uVar.d(fVar, zVarV);
            } catch (Exception e8) {
                AbstractC0514j.e(fVar, e8, hVar.f7281k, strO2);
                throw null;
            }
        }
        p015c2.j jVar2 = this.f7541q;
        p032f2.t tVar = this.f7540p;
        if (jVar2 != null) {
            return (Map) tVar.w(fVar, jVar2.deserialize(iVar, fVar));
        }
        if (this.f7543s) {
            int iV = iVar.v();
            if (iV != 1 && iV != 2) {
                if (iV == 3) {
                    return (Map) _deserializeFromArray(iVar, fVar);
                }
                if (iV != 5) {
                    if (iV == 6) {
                        return (Map) _deserializeFromString(iVar, fVar);
                    }
                    fVar.r0(iVar, getValueType(fVar));
                    throw null;
                }
            }
            Map map2 = (Map) tVar.v(fVar);
            if (this.f7537m) {
                boolean z6 = jVar.getObjectIdReader() != null;
                C0495p c0495p = z6 ? new C0495p(hVar.Y().f7281k, map2) : null;
                if (iVar.x0()) {
                    strO = iVar.z0();
                } else {
                    T1.k kVarS = iVar.s();
                    if (kVarS != T1.k.END_OBJECT) {
                        T1.k kVar2 = T1.k.FIELD_NAME;
                        if (kVarS == kVar2) {
                            strO = iVar.o();
                        } else {
                            fVar.L0(this, kVar2, null, new Object[0]);
                            throw null;
                        }
                    }
                    return map2;
                }
                while (strO != null) {
                    T1.k kVarB1 = iVar.B0();
                    p009b2.k kVar3 = this.f7546v;
                    if (kVar3 != null && kVar3.s(strO)) {
                        iVar.F0();
                    } else {
                        try {
                            if (kVarB1 == T1.k.VALUE_NULL) {
                                if (!z5) {
                                    objDeserializeWithType = lVar.getNullValue(fVar);
                                }
                            } else if (dVar == null) {
                                objDeserializeWithType = jVar.deserialize(iVar, fVar);
                            } else {
                                objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
                            }
                            Object obj = objDeserializeWithType;
                            if (z6) {
                                c0495p.w(strO, obj);
                            } else {
                                Object objPut = map2.put(strO, obj);
                                if (objPut != null) {
                                    h(fVar, map2, strO, objPut, obj);
                                }
                            }
                        } catch (UnresolvedForwardReference e9) {
                            i(fVar, c0495p, strO, e9);
                            throw null;
                        } catch (Exception e10) {
                            AbstractC0514j.e(fVar, e10, map2, strO);
                            throw null;
                        }
                    }
                    strO = iVar.z0();
                }
                return map2;
            }
            g(iVar, fVar, map2);
            return map2;
        }
        fVar.o0(hVar.f7281k, tVar, "no default constructor found", new Object[0]);
        throw null;
    }
}
