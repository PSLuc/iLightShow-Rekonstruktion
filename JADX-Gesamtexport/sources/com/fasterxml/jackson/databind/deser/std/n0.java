package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import p015c2.C0474e;
import p109u2.EnumC0962a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends g0 {
    @Override // p015c2.j
    public Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws InvalidDefinitionException {
        fVar.m0(this);
        return deserialize(iVar, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.e(iVar, fVar);
    }

    @Override // p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.i;
    }

    @Override // p015c2.j
    public EnumC0962a getNullAccessPattern() {
        return EnumC0962a.f12677h;
    }

    @Override // p015c2.j
    public p104t2.d logicalType() {
        return p104t2.d.f12503t;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.FALSE;
    }
}
