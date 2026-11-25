package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0514j implements p032f2.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.q f7548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p015c2.j f7549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p071n2.d f7550n;

    public D(p015c2.h hVar, p015c2.q qVar, p015c2.j jVar, p071n2.d dVar) {
        super(hVar, (p032f2.l) null, (Boolean) null);
        if (((p104t2.j) hVar).f12515r.i.length != 2) {
            throw new IllegalArgumentException("Missing generic type information for " + hVar);
        }
        this.f7548l = qVar;
        this.f7549m = jVar;
        this.f7550n = dVar;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        p015c2.h hVar = this.f7605h;
        p015c2.q qVar = this.f7548l;
        p015c2.q qVarH0 = qVar == null ? fVar.h0(((p104t2.j) hVar).f12515r.d(0)) : qVar;
        p015c2.j jVar = this.f7549m;
        p015c2.j jVarFindConvertingContentDeserializer = findConvertingContentDeserializer(fVar, interfaceC0472c, jVar);
        p015c2.h hVarD = ((p104t2.j) hVar).f12515r.d(1);
        p015c2.j jVarF0 = jVarFindConvertingContentDeserializer == null ? fVar.f0(hVarD, interfaceC0472c) : fVar.q0(jVarFindConvertingContentDeserializer, interfaceC0472c, hVarD);
        p071n2.d dVar = this.f7550n;
        p071n2.d dVarF = dVar != null ? dVar.f(interfaceC0472c) : dVar;
        return (qVar == qVarH0 && jVar == jVarF0 && dVar == dVarF) ? this : new D(this, qVarH0, jVarF0, dVarF);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j
    public final p015c2.j d() {
        return this.f7549m;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.d(iVar, fVar);
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12493j;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws IOException {
        Object objDeserializeWithType;
        T1.k kVarS = iVar.s();
        if (kVarS == T1.k.START_OBJECT) {
            kVarS = iVar.B0();
        } else if (kVarS != T1.k.FIELD_NAME && kVarS != T1.k.END_OBJECT) {
            if (kVarS == T1.k.START_ARRAY) {
                return (Map.Entry) _deserializeFromArray(iVar, fVar);
            }
            fVar.r0(iVar, getValueType(fVar));
            throw null;
        }
        T1.k kVar = T1.k.FIELD_NAME;
        if (kVarS != kVar) {
            if (kVarS == T1.k.END_OBJECT) {
                fVar.J0(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
                throw null;
            }
            fVar.s0(iVar, handledType());
            throw null;
        }
        String strO = iVar.o();
        Object objA = this.f7548l.a(fVar, strO);
        T1.k kVarB0 = iVar.B0();
        try {
            T1.k kVar2 = T1.k.VALUE_NULL;
            p015c2.j jVar = this.f7549m;
            if (kVarB0 == kVar2) {
                objDeserializeWithType = jVar.getNullValue(fVar);
            } else {
                p071n2.d dVar = this.f7550n;
                if (dVar == null) {
                    objDeserializeWithType = jVar.deserialize(iVar, fVar);
                } else {
                    objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
                }
            }
            T1.k kVarB1 = iVar.B0();
            if (kVarB1 == T1.k.END_OBJECT) {
                return new AbstractMap.SimpleEntry(objA, objDeserializeWithType);
            }
            if (kVarB1 == kVar) {
                fVar.J0(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", iVar.o());
                throw null;
            }
            fVar.J0(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + kVarB1, new Object[0]);
            throw null;
        } catch (Exception e6) {
            AbstractC0514j.e(fVar, e6, Map.Entry.class, strO);
            throw null;
        }
    }

    public D(D d6, p015c2.q qVar, p015c2.j jVar, p071n2.d dVar) {
        super(d6, d6.i, d6.f7607k);
        this.f7548l = qVar;
        this.f7549m = jVar;
        this.f7550n = dVar;
    }
}
