package com.fasterxml.jackson.databind.deser.std;

import java.util.Collection;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p109u2.EnumC0962a;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g0 implements p032f2.i, p032f2.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p109u2.l f7593h;
    public final p015c2.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p015c2.j f7594j;

    public f0(p037g2.m mVar) {
        super(Object.class);
        this.f7593h = mVar;
        this.i = null;
        this.f7594j = null;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        p109u2.l lVar = this.f7593h;
        p015c2.j jVar = this.f7594j;
        if (jVar == null) {
            fVar.A();
            p015c2.h hVar = ((p037g2.m) lVar).f9146a;
            p015c2.j jVarF0 = fVar.f0(hVar, interfaceC0472c);
            p109u2.i.F(this, f0.class, "withDelegate");
            return new f0(lVar, hVar, jVarF0);
        }
        p015c2.h hVar2 = this.i;
        p015c2.j jVarQ0 = fVar.q0(jVar, interfaceC0472c, hVar2);
        if (jVarQ0 == jVar) {
            return this;
        }
        p109u2.i.F(this, f0.class, "withDelegate");
        return new f0(lVar, hVar2, jVarQ0);
    }

    @Override // p032f2.m
    public final void b(p015c2.f fVar) {
        p032f2.l lVar = this.f7594j;
        if (lVar == null || !(lVar instanceof p032f2.m)) {
            return;
        }
        ((p032f2.m) lVar).b(fVar);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        Object objDeserialize = this.f7594j.deserialize(iVar, fVar);
        if (objDeserialize == null) {
            return null;
        }
        return ((p037g2.m) this.f7593h).b(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        Object objDeserialize = this.f7594j.deserialize(iVar, fVar);
        if (objDeserialize == null) {
            return null;
        }
        return ((p037g2.m) this.f7593h).b(objDeserialize);
    }

    @Override // p015c2.j, p032f2.l
    public final Object getAbsentValue(p015c2.f fVar) {
        Object absentValue = this.f7594j.getAbsentValue(fVar);
        if (absentValue == null) {
            return null;
        }
        return ((p037g2.m) this.f7593h).b(absentValue);
    }

    @Override // p015c2.j
    public final p015c2.j getDelegatee() {
        return this.f7594j;
    }

    @Override // p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return this.f7594j.getEmptyAccessPattern();
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        Object emptyValue = this.f7594j.getEmptyValue(fVar);
        if (emptyValue == null) {
            return null;
        }
        return ((p037g2.m) this.f7593h).b(emptyValue);
    }

    @Override // p015c2.j
    public final Collection getKnownPropertyNames() {
        return this.f7594j.getKnownPropertyNames();
    }

    @Override // p015c2.j
    public final EnumC0962a getNullAccessPattern() {
        return this.f7594j.getNullAccessPattern();
    }

    @Override // p015c2.j, p032f2.l
    public final Object getNullValue(p015c2.f fVar) {
        Object nullValue = this.f7594j.getNullValue(fVar);
        if (nullValue == null) {
            return null;
        }
        return ((p037g2.m) this.f7593h).b(nullValue);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Class handledType() {
        return this.f7594j.handledType();
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        p015c2.j jVar = this.f7594j;
        return jVar != null && jVar.isCachable();
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return this.f7594j.logicalType();
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return this.f7594j.supportsUpdate(c0474e);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) {
        p015c2.h hVar = this.i;
        if (hVar.f7281k.isAssignableFrom(obj.getClass())) {
            return this.f7594j.deserialize(iVar, fVar, obj);
        }
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)".concat(obj.getClass().getName()), hVar));
    }

    public f0(p109u2.l lVar, p015c2.h hVar, p015c2.j jVar) {
        super(hVar);
        this.f7593h = lVar;
        this.i = hVar;
        this.f7594j = jVar;
    }
}
