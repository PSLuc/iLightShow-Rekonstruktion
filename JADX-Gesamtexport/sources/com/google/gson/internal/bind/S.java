package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class S extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() != 9) {
            return Boolean.valueOf(aVar.d0());
        }
        aVar.b0();
        return null;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        cVar.Z(bool == null ? "null" : bool.toString());
    }
}
