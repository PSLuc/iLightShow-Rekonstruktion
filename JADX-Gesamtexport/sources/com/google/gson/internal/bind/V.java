package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class V extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        try {
            return Integer.valueOf(aVar.X());
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            cVar.G();
        } else {
            cVar.V(number.intValue());
        }
    }
}
