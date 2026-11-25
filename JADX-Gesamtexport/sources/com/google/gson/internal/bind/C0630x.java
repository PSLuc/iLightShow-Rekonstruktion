package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.gson.internal.bind.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0630x extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() != 9) {
            return Double.valueOf(aVar.V());
        }
        aVar.b0();
        return null;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            cVar.G();
        } else {
            cVar.T(number.doubleValue());
        }
    }
}
