package com.fasterxml.jackson.databind.deser.std;

import p015c2.C0474e;

/* JADX INFO: loaded from: classes.dex */
public final class E extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f7551h = new E(Object.class);

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        if (!iVar.s0(T1.k.FIELD_NAME)) {
            iVar.F0();
            return null;
        }
        while (true) {
            T1.k kVarB0 = iVar.B0();
            if (kVarB0 == null || kVarB0 == T1.k.END_OBJECT) {
                return null;
            }
            iVar.F0();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        int iV = iVar.v();
        if (iV == 1 || iV == 3 || iV == 5) {
            return dVar.b(iVar, fVar);
        }
        return null;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.FALSE;
    }
}
