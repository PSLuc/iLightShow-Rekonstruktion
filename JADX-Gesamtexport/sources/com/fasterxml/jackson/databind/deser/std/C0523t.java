package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0523t extends AbstractC0525v {
    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0525v
    public final Object d(p015c2.f fVar, String str) {
        return new StringBuffer(str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0525v, p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        String strQ0 = iVar.q0();
        return strQ0 != null ? new StringBuffer(strQ0) : super.deserialize(iVar, fVar);
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return new StringBuffer();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0525v, com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12500q;
    }
}
