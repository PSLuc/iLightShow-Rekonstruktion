package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import p109u2.C0964c;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c0 {
    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        short[] sArr = (short[]) obj;
        short[] sArr2 = (short[]) obj2;
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
        return sArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        short s_parseShortPrimitive;
        int i;
        if (!iVar.w0()) {
            return (short[]) f(iVar, fVar);
        }
        K2.k kVarL0 = fVar.l0();
        if (((C0964c) kVarL0.f2103j) == null) {
            kVarL0.f2103j = new C0964c(6);
        }
        C0964c c0964c = (C0964c) kVarL0.f2103j;
        short[] sArr = (short[]) c0964c.d();
        int i3 = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return (short[]) c0964c.c(i3, sArr);
                }
                try {
                    if (kVarB0 == T1.k.VALUE_NULL) {
                        p032f2.l lVar = this.f7584j;
                        if (lVar != null) {
                            lVar.getNullValue(fVar);
                        } else {
                            _verifyNullForPrimitive(fVar);
                            s_parseShortPrimitive = 0;
                        }
                    } else {
                        s_parseShortPrimitive = _parseShortPrimitive(iVar, fVar);
                    }
                    sArr[i3] = s_parseShortPrimitive;
                    i3 = i;
                } catch (Exception e6) {
                    e = e6;
                    i3 = i;
                    throw JsonMappingException.i(e, sArr, c0964c.f12683d + i3);
                }
                if (i3 >= sArr.length) {
                    short[] sArr2 = (short[]) c0964c.b(i3, sArr);
                    i3 = 0;
                    sArr = sArr2;
                }
                i = i3 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object e() {
        return new short[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) {
        return new short[]{_parseShortPrimitive(iVar, fVar)};
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return new b0(this, lVar, bool);
    }
}
