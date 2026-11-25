package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.gson.internal.bind.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0632z extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        int iF0 = aVar.f0();
        if (iF0 != 9) {
            return iF0 == 8 ? Boolean.toString(aVar.T()) : aVar.d0();
        }
        aVar.b0();
        return null;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        cVar.Z((String) obj);
    }
}
