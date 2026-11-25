package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public class H extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        try {
            String strD0 = aVar.d0();
            if (strD0.equals("null")) {
                return null;
            }
            return new URI(strD0);
        } catch (URISyntaxException e6) {
            throw new JsonIOException(e6);
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        cVar.Z(uri == null ? null : uri.toASCIIString());
    }
}
