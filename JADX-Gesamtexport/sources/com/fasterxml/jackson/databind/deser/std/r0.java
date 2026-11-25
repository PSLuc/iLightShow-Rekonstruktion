package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r0 f7666h = new r0(String.class);

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        if (iVar.s0(T1.k.VALUE_STRING)) {
            return iVar.i0();
        }
        return iVar.s0(T1.k.START_ARRAY) ? (String) _deserializeFromArray(iVar, fVar) : _parseString(iVar, fVar, this);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        if (iVar.s0(T1.k.VALUE_STRING)) {
            return iVar.i0();
        }
        return iVar.s0(T1.k.START_ARRAY) ? (String) _deserializeFromArray(iVar, fVar) : _parseString(iVar, fVar, this);
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return "";
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12500q;
    }
}
