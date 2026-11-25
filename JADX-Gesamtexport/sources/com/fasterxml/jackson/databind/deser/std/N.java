package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: classes.dex */
public final class N extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final N f7566l = new N(Long.TYPE, 0L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N f7567m = new N(Long.class, null);

    public N(Class cls, Long l6) {
        super(cls, p104t2.d.f12496m, l6, 0L);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        if (iVar.v0()) {
            return Long.valueOf(iVar.a0());
        }
        return this.f7571k ? Long.valueOf(_parseLongPrimitive(iVar, fVar)) : _parseLong(iVar, fVar, Long.class);
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }
}
