package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class G extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String strD0 = aVar.d0();
        if (strD0.equals("null")) {
            return null;
        }
        return new URL(strD0);
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        URL url = (URL) obj;
        cVar.Z(url == null ? null : url.toExternalForm());
    }
}
