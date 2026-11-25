package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: classes.dex */
public class K extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        String strD0 = aVar.d0();
        try {
            return Currency.getInstance(strD0);
        } catch (IllegalArgumentException e6) {
            StringBuilder sbW = p012c.k.w("Failed parsing '", strD0, "' as Currency; at path ");
            sbW.append(aVar.J());
            throw new JsonSyntaxException(sbW.toString(), e6);
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        cVar.Z(((Currency) obj).getCurrencyCode());
    }
}
