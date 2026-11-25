package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.util.concurrent.atomic.AtomicReference;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p109u2.EnumC0962a;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0509e extends g0 implements p032f2.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.h f7587h;
    public final p032f2.t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p071n2.d f7588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p015c2.j f7589k;

    public C0509e(p015c2.h hVar, p015c2.j jVar, p032f2.t tVar, p071n2.d dVar) {
        super(hVar);
        this.i = tVar;
        this.f7587h = hVar;
        this.f7589k = jVar;
        this.f7588j = dVar;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        p015c2.h hVar = this.f7587h;
        p015c2.j jVar = this.f7589k;
        p015c2.j jVarF0 = jVar == null ? fVar.f0(hVar.x(), interfaceC0472c) : fVar.q0(jVar, interfaceC0472c, hVar.x());
        p071n2.d dVar = this.f7588j;
        p071n2.d dVarF = dVar != null ? dVar.f(interfaceC0472c) : dVar;
        return (jVarF0 == jVar && dVarF == dVar) ? this : new C0509e(hVar, jVarF0, this.i, dVarF);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        p032f2.t tVar = this.i;
        if (tVar != null) {
            return deserialize(iVar, fVar, tVar.v(fVar));
        }
        p015c2.j jVar = this.f7589k;
        p071n2.d dVar = this.f7588j;
        return new AtomicReference(dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        if (iVar.s0(T1.k.VALUE_NULL)) {
            return new AtomicReference(this.f7589k.getNullValue(fVar));
        }
        p071n2.d dVar2 = this.f7588j;
        return dVar2 == null ? deserialize(iVar, fVar) : new AtomicReference(dVar2.b(iVar, fVar));
    }

    @Override // p015c2.j, p032f2.l
    public final Object getAbsentValue(p015c2.f fVar) {
        return null;
    }

    @Override // p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.f12678j;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return new AtomicReference(this.f7589k.getNullValue(fVar));
    }

    @Override // p015c2.j
    public final EnumC0962a getNullAccessPattern() {
        return EnumC0962a.f12678j;
    }

    @Override // p015c2.j, p032f2.l
    public final Object getNullValue(p015c2.f fVar) {
        return new AtomicReference(this.f7589k.getNullValue(fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final p032f2.t getValueInstantiator() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final p015c2.h getValueType() {
        return this.f7587h;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        p015c2.j jVar = this.f7589k;
        return jVar != null ? jVar.logicalType() : super.logicalType();
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.TRUE;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws InvalidDefinitionException {
        Object objDeserializeWithType;
        Object objDeserializeWithType2;
        C0474e c0474e = fVar.f7249l;
        p015c2.j jVar = this.f7589k;
        boolean zEquals = jVar.supportsUpdate(c0474e).equals(Boolean.FALSE);
        p071n2.d dVar = this.f7588j;
        if (!zEquals && dVar == null) {
            Object obj2 = ((AtomicReference) obj).get();
            if (obj2 == null) {
                if (dVar == null) {
                    objDeserializeWithType2 = jVar.deserialize(iVar, fVar);
                } else {
                    objDeserializeWithType2 = jVar.deserializeWithType(iVar, fVar, dVar);
                }
                return new AtomicReference(objDeserializeWithType2);
            }
            objDeserializeWithType = jVar.deserialize(iVar, fVar, obj2);
        } else if (dVar == null) {
            objDeserializeWithType = jVar.deserialize(iVar, fVar);
        } else {
            objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
        }
        AtomicReference atomicReference = (AtomicReference) obj;
        atomicReference.set(objDeserializeWithType);
        return atomicReference;
    }
}
