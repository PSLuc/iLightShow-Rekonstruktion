package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.gson.internal.bind.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0631y extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String strD0 = aVar.d0();
        if (strD0.length() == 1) {
            return Character.valueOf(strD0.charAt(0));
        }
        StringBuilder sbW = p012c.k.w("Expecting character, got: ", strD0, "; at ");
        sbW.append(aVar.J());
        throw new JsonSyntaxException(sbW.toString());
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        cVar.Z(ch == null ? null : String.valueOf(ch));
    }
}
