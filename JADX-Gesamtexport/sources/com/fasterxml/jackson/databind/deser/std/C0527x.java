package com.fasterxml.jackson.databind.deser.std;

import p015c2.C0474e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0527x extends p032f2.s {
    public static p032f2.j E(String str, p015c2.h hVar, int i) {
        return new p032f2.j(p015c2.A.a(str), hVar, null, null, null, i, null, p015c2.z.f7337o);
    }

    @Override // p032f2.t
    public final p032f2.r[] C(C0474e c0474e) {
        p015c2.h hVarC = c0474e.c(Integer.TYPE);
        p015c2.h hVarC2 = c0474e.c(Long.TYPE);
        return new p032f2.r[]{E("sourceRef", c0474e.c(Object.class), 0), E("byteOffset", hVarC2, 1), E("charOffset", hVarC2, 2), E("lineNr", hVarC, 3), E("columnNr", hVarC, 4)};
    }

    @Override // p032f2.t
    public final Object s(p015c2.f fVar, Object[] objArr) {
        Object obj = objArr[0];
        V1.c cVar = obj instanceof V1.c ? (V1.c) obj : new V1.c(obj, false);
        Object obj2 = objArr[1];
        long jLongValue = obj2 == null ? 0L : ((Number) obj2).longValue();
        Object obj3 = objArr[2];
        long jLongValue2 = obj3 != null ? ((Number) obj3).longValue() : 0L;
        Object obj4 = objArr[3];
        int iIntValue = obj4 == null ? 0 : ((Number) obj4).intValue();
        Object obj5 = objArr[4];
        return new T1.f(cVar, jLongValue, jLongValue2, iIntValue, obj5 != null ? ((Number) obj5).intValue() : 0);
    }
}
