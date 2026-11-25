package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: classes.dex */
public final class H extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final H f7554l = new H(Boolean.TYPE, Boolean.FALSE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final H f7555m = new H(Boolean.class, null);

    public H(Class cls, Boolean bool) {
        super(cls, p104t2.d.f12498o, bool, Boolean.FALSE);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        T1.k kVarS = iVar.s();
        if (kVarS == T1.k.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (kVarS == T1.k.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return this.f7571k ? Boolean.valueOf(_parseBooleanPrimitive(iVar, fVar)) : _parseBoolean(iVar, fVar, this._valueClass);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        T1.k kVarS = iVar.s();
        if (kVarS == T1.k.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (kVarS == T1.k.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return this.f7571k ? Boolean.valueOf(_parseBooleanPrimitive(iVar, fVar)) : _parseBoolean(iVar, fVar, this._valueClass);
    }
}
