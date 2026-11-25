package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Q extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        int iF0 = aVar.f0();
        if (iF0 != 9) {
            return iF0 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.d0())) : Boolean.valueOf(aVar.T());
        }
        aVar.b0();
        return null;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        cVar.X((Boolean) obj);
    }
}
