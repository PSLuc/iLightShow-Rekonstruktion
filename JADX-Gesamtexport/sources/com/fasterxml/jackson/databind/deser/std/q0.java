package com.fasterxml.jackson.databind.deser.std;

import S1.EnumC0352n;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.util.Collection;
import java.util.Objects;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends AbstractC0514j implements p032f2.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.j f7657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p032f2.t f7658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p015c2.j f7659n;

    public q0(p015c2.h hVar, p032f2.t tVar, p015c2.j jVar, p015c2.j jVar2, p032f2.l lVar, Boolean bool) {
        super(hVar, lVar, bool);
        this.f7657l = jVar2;
        this.f7658m = tVar;
        this.f7659n = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        p015c2.j jVar;
        p015c2.j jVarQ0;
        p015c2.j jVarFindDeserializer;
        p032f2.t tVar = this.f7658m;
        if (tVar == null) {
            jVar = null;
        } else {
            if (tVar.x() != null) {
                C0474e c0474e = fVar.f7249l;
                jVarFindDeserializer = findDeserializer(fVar, tVar.y(), interfaceC0472c);
            } else if (tVar.A() != null) {
                C0474e c0474e2 = fVar.f7249l;
                jVarFindDeserializer = findDeserializer(fVar, tVar.B(), interfaceC0472c);
            } else {
                jVar = null;
            }
            jVar = jVarFindDeserializer;
        }
        p015c2.h hVarY = this.f7605h.Y();
        p015c2.j jVar2 = this.f7657l;
        if (jVar2 == null) {
            jVarQ0 = findConvertingContentDeserializer(fVar, interfaceC0472c, jVar2);
            if (jVarQ0 == null) {
                jVarQ0 = fVar.f0(hVarY, interfaceC0472c);
            }
        } else {
            jVarQ0 = fVar.q0(jVar2, interfaceC0472c, hVarY);
        }
        Boolean boolFindFormatFeature = findFormatFeature(fVar, interfaceC0472c, Collection.class, EnumC0352n.f4954h);
        p032f2.l lVarFindContentNullProvider = findContentNullProvider(fVar, interfaceC0472c, jVarQ0);
        p015c2.j jVar3 = isDefaultDeserializer(jVarQ0) ? null : jVarQ0;
        return (Objects.equals(this.f7607k, boolFindFormatFeature) && this.i == lVarFindContentNullProvider && jVar2 == jVar3 && this.f7659n == jVar) ? this : new q0(this.f7605h, this.f7658m, jVar, jVar3, lVarFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j
    public final p015c2.j d() {
        return this.f7657l;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.c(iVar, fVar);
    }

    @Override // p015c2.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Collection deserialize(T1.i iVar, p015c2.f fVar, Collection collection) throws JsonMappingException {
        String str_parseString;
        String str;
        q0 q0Var;
        T1.i iVar2;
        p015c2.f fVar2;
        String str_parseString2;
        p026e2.b bVarE0;
        boolean zW0 = iVar.w0();
        p015c2.j jVar = this.f7657l;
        boolean z5 = this.f7606j;
        p032f2.l lVar = this.i;
        if (!zW0) {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = this.f7607k;
            if (bool2 != bool && (bool2 != null || !fVar.B0(p015c2.g.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                if (iVar.s0(T1.k.VALUE_STRING)) {
                    return (Collection) _deserializeFromString(iVar, fVar);
                }
                fVar.r0(iVar, this.f7605h);
                throw null;
            }
            if (iVar.s() != T1.k.VALUE_NULL) {
                if (iVar.s0(T1.k.VALUE_STRING)) {
                    String strI0 = iVar.i0();
                    boolean zIsEmpty = strI0.isEmpty();
                    p026e2.b bVar = p026e2.b.f8686h;
                    p104t2.d dVar = p104t2.d.i;
                    if (zIsEmpty) {
                        p026e2.b bVarD0 = fVar.d0(dVar, handledType(), p026e2.d.f8695m);
                        if (bVarD0 != bVar) {
                            return (Collection) _deserializeFromEmptyString(iVar, fVar, bVarD0, handledType(), "empty String (\"\")");
                        }
                        q0Var = this;
                        iVar2 = iVar;
                        fVar2 = fVar;
                    } else {
                        q0Var = this;
                        iVar2 = iVar;
                        if (g0._isBlank(strI0) && (bVarE0 = fVar.e0(dVar, q0Var.handledType())) != bVar) {
                            return (Collection) q0Var._deserializeFromEmptyString(iVar2, fVar, bVarE0, q0Var.handledType(), "blank String (all whitespace)");
                        }
                        fVar2 = fVar;
                    }
                } else {
                    q0Var = this;
                    iVar2 = iVar;
                    fVar2 = fVar;
                }
                try {
                    str_parseString2 = jVar == null ? q0Var._parseString(iVar2, fVar2, lVar) : (String) jVar.deserialize(iVar2, fVar2);
                } catch (Exception e6) {
                    throw JsonMappingException.i(e6, collection, collection.size());
                }
            } else if (!z5) {
                str_parseString2 = (String) lVar.getNullValue(fVar);
            }
            collection.add(str_parseString2);
            return collection;
        }
        if (jVar != null) {
            while (true) {
                try {
                    if (iVar.A0() == null) {
                        T1.k kVarS = iVar.s();
                        if (kVarS == T1.k.END_ARRAY) {
                            break;
                        }
                        if (kVarS != T1.k.VALUE_NULL) {
                            str = (String) jVar.deserialize(iVar, fVar);
                        } else if (!z5) {
                            str = (String) lVar.getNullValue(fVar);
                        }
                    } else {
                        str = (String) jVar.deserialize(iVar, fVar);
                    }
                    collection.add(str);
                } catch (Exception e7) {
                    throw JsonMappingException.i(e7, collection, collection.size());
                }
            }
        } else {
            while (true) {
                try {
                    String strA0 = iVar.A0();
                    if (strA0 != null) {
                        collection.add(strA0);
                    } else {
                        T1.k kVarS2 = iVar.s();
                        if (kVarS2 == T1.k.END_ARRAY) {
                            break;
                        }
                        if (kVarS2 != T1.k.VALUE_NULL) {
                            str_parseString = _parseString(iVar, fVar, lVar);
                        } else if (!z5) {
                            str_parseString = (String) lVar.getNullValue(fVar);
                        }
                        collection.add(str_parseString);
                    }
                } catch (Exception e8) {
                    throw JsonMappingException.i(e8, collection, collection.size());
                }
            }
        }
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final p032f2.t getValueInstantiator() {
        return this.f7658m;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return this.f7657l == null && this.f7659n == null;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.i;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        p032f2.t tVar = this.f7658m;
        p015c2.j jVar = this.f7659n;
        return jVar != null ? (Collection) tVar.w(fVar, jVar.deserialize(iVar, fVar)) : deserialize(iVar, fVar, (Collection) tVar.v(fVar));
    }
}
