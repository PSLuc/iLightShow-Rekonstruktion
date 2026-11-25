package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: classes.dex */
public final class M extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M f7564l = new M(Integer.TYPE, 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M f7565m = new M(Integer.class, null);

    public M(Class cls, Integer num) {
        super(cls, p104t2.d.f12496m, num, 0);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        if (iVar.v0()) {
            return Integer.valueOf(iVar.Z());
        }
        return this.f7571k ? Integer.valueOf(_parseIntPrimitive(iVar, fVar)) : _parseInteger(iVar, fVar, Integer.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        if (iVar.v0()) {
            return Integer.valueOf(iVar.Z());
        }
        return this.f7571k ? Integer.valueOf(_parseIntPrimitive(iVar, fVar)) : _parseInteger(iVar, fVar, Integer.class);
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }
}
