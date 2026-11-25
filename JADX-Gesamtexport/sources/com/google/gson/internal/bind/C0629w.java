package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.gson.internal.bind.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0629w extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() != 9) {
            return Float.valueOf((float) aVar.V());
        }
        aVar.b0();
        return null;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            cVar.G();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        cVar.Y(numberValueOf);
    }
}
