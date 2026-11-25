package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class B extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String strD0 = aVar.d0();
        try {
            p116v3.d.d(strD0);
            return new BigInteger(strD0);
        } catch (NumberFormatException e6) {
            StringBuilder sbW = p012c.k.w("Failed parsing '", strD0, "' as BigInteger; at path ");
            sbW.append(aVar.J());
            throw new JsonSyntaxException(sbW.toString(), e6);
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        cVar.Y((BigInteger) obj);
    }
}
