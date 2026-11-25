package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.io.IOException;
import java.util.EnumMap;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0520p extends AbstractC0514j implements p032f2.i, p032f2.m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Class f7641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p015c2.q f7642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p015c2.j f7643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p071n2.d f7644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p032f2.t f7645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p015c2.j f7646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O1.u f7647r;

    public C0520p(p015c2.h hVar, p015c2.j jVar, p032f2.t tVar, p071n2.d dVar) {
        super(hVar, (p032f2.l) null, (Boolean) null);
        this.f7641l = hVar.b0().f7281k;
        this.f7642m = null;
        this.f7643n = jVar;
        this.f7644o = dVar;
        this.f7645p = tVar;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        p015c2.q qVar = this.f7642m;
        p015c2.h hVar = this.f7605h;
        p015c2.q qVarH0 = qVar == null ? fVar.h0(hVar.b0()) : qVar;
        p015c2.h hVarY = hVar.Y();
        p015c2.j jVar = this.f7643n;
        p015c2.j jVarF0 = jVar == null ? fVar.f0(hVarY, interfaceC0472c) : fVar.q0(jVar, interfaceC0472c, hVarY);
        p071n2.d dVar = this.f7644o;
        p071n2.d dVarF = dVar != null ? dVar.f(interfaceC0472c) : dVar;
        p032f2.l lVarFindContentNullProvider = findContentNullProvider(fVar, interfaceC0472c, jVarF0);
        return (qVarH0 == qVar && lVarFindContentNullProvider == this.i && jVarF0 == jVar && dVarF == dVar) ? this : new C0520p(this, qVarH0, jVarF0, dVarF, lVarFindContentNullProvider);
    }

    @Override // p032f2.m
    public final void b(p015c2.f fVar) throws InvalidDefinitionException {
        p032f2.t tVar = this.f7645p;
        if (tVar != null) {
            boolean zK = tVar.k();
            p015c2.h hVar = this.f7605h;
            if (zK) {
                C0474e c0474e = fVar.f7249l;
                p015c2.h hVarB = tVar.B();
                if (hVarB != null) {
                    this.f7646q = findDeserializer(fVar, hVarB, null);
                    return;
                } else {
                    fVar.O(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", hVar, tVar.getClass().getName()));
                    throw null;
                }
            }
            if (!tVar.i()) {
                if (tVar.g()) {
                    this.f7647r = O1.u.f(fVar, tVar, tVar.C(fVar.f7249l), fVar.f7249l.k(p015c2.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                    return;
                }
                return;
            }
            C0474e c0474e2 = fVar.f7249l;
            p015c2.h hVarY = tVar.y();
            if (hVarY != null) {
                this.f7646q = findDeserializer(fVar, hVarY, null);
            } else {
                fVar.O(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", hVar, tVar.getClass().getName()));
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j
    public final p015c2.j d() {
        return this.f7643n;
    }

    @Override // p015c2.j
    public final /* bridge */ /* synthetic */ Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws IOException {
        EnumMap enumMap = (EnumMap) obj;
        g(iVar, fVar, enumMap);
        return enumMap;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.d(iVar, fVar);
    }

    public final EnumMap f(p015c2.f fVar) throws JsonMappingException {
        p032f2.t tVar = this.f7645p;
        if (tVar == null) {
            return new EnumMap(this.f7641l);
        }
        try {
            if (tVar.j()) {
                return (EnumMap) tVar.v(fVar);
            }
            fVar.o0(handledType(), tVar, "no default constructor found", new Object[0]);
            throw null;
        } catch (IOException e6) {
            p109u2.i.B(fVar, e6);
            throw null;
        }
    }

    public final void g(T1.i iVar, p015c2.f fVar, EnumMap enumMap) throws IOException {
        String strO;
        Object objDeserialize;
        iVar.E0(enumMap);
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
            Enum r6 = (Enum) this.f7642m.a(fVar, strO);
            T1.k kVarB0 = iVar.B0();
            if (r6 != null) {
                try {
                    if (kVarB0 != T1.k.VALUE_NULL) {
                        p015c2.j jVar = this.f7643n;
                        p071n2.d dVar = this.f7644o;
                        objDeserialize = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
                    } else if (!this.f7606j) {
                        objDeserialize = this.i.getNullValue(fVar);
                    }
                    enumMap.put(r6, objDeserialize);
                } catch (Exception e6) {
                    AbstractC0514j.e(fVar, e6, enumMap, strO);
                    throw null;
                }
            } else {
                if (!fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    fVar.w0(this.f7641l, strO, "value not one of declared Enum instance names for %s", this.f7605h.b0());
                    throw null;
                }
                iVar.F0();
            }
            strO = iVar.z0();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j, p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return f(fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final p032f2.t getValueInstantiator() {
        return this.f7645p;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return this.f7643n == null && this.f7642m == null && this.f7644o == null;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12493j;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws IOException {
        String strO;
        Object objDeserialize;
        O1.u uVar = this.f7647r;
        if (uVar == null) {
            p015c2.j jVar = this.f7646q;
            if (jVar != null) {
                return (EnumMap) this.f7645p.w(fVar, jVar.deserialize(iVar, fVar));
            }
            int iV = iVar.v();
            if (iV != 1 && iV != 2) {
                if (iV == 3) {
                    return (EnumMap) _deserializeFromArray(iVar, fVar);
                }
                if (iV != 5) {
                    if (iV == 6) {
                        return (EnumMap) _deserializeFromString(iVar, fVar);
                    }
                    fVar.r0(iVar, getValueType(fVar));
                    throw null;
                }
            }
            EnumMap enumMapF = f(fVar);
            g(iVar, fVar, enumMapF);
            return enumMapF;
        }
        p037g2.z zVarV = uVar.v(iVar, fVar, null);
        if (iVar.x0()) {
            strO = iVar.z0();
        } else {
            strO = iVar.s0(T1.k.FIELD_NAME) ? iVar.o() : null;
        }
        while (true) {
            p015c2.h hVar = this.f7605h;
            if (strO == null) {
                try {
                    return (EnumMap) uVar.d(fVar, zVarV);
                } catch (Exception e6) {
                    AbstractC0514j.e(fVar, e6, hVar.f7281k, strO);
                    throw null;
                }
            }
            T1.k kVarB0 = iVar.B0();
            p032f2.r rVarG = uVar.g(strO);
            if (rVarG == null) {
                Enum r6 = (Enum) this.f7642m.a(fVar, strO);
                if (r6 != null) {
                    try {
                        if (kVarB0 != T1.k.VALUE_NULL) {
                            p071n2.d dVar = this.f7644o;
                            p015c2.j jVar2 = this.f7643n;
                            objDeserialize = dVar == null ? jVar2.deserialize(iVar, fVar) : jVar2.deserializeWithType(iVar, fVar, dVar);
                        } else if (!this.f7606j) {
                            objDeserialize = this.i.getNullValue(fVar);
                        }
                        zVarV.f9178h = new p037g2.x(zVarV.f9178h, objDeserialize, r6, 0);
                    } catch (Exception e7) {
                        AbstractC0514j.e(fVar, e7, hVar.f7281k, strO);
                        throw null;
                    }
                } else {
                    if (!fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        fVar.w0(this.f7641l, strO, "value not one of declared Enum instance names for %s", hVar.b0());
                        throw null;
                    }
                    iVar.B0();
                    iVar.F0();
                }
            } else if (zVarV.b(rVarG, rVarG.i(iVar, fVar))) {
                iVar.B0();
                try {
                    EnumMap enumMap = (EnumMap) uVar.d(fVar, zVarV);
                    g(iVar, fVar, enumMap);
                    return enumMap;
                } catch (Exception e8) {
                    AbstractC0514j.e(fVar, e8, hVar.f7281k, strO);
                    throw null;
                }
            }
            strO = iVar.z0();
        }
    }

    public C0520p(C0520p c0520p, p015c2.q qVar, p015c2.j jVar, p071n2.d dVar, p032f2.l lVar) {
        super(c0520p, lVar, c0520p.f7607k);
        this.f7641l = c0520p.f7641l;
        this.f7642m = qVar;
        this.f7643n = jVar;
        this.f7644o = dVar;
        this.f7645p = c0520p.f7645p;
        this.f7646q = c0520p.f7646q;
        this.f7647r = c0520p.f7647r;
    }
}
