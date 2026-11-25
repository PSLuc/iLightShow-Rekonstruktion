package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import p109u2.C0964c;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends c0 {
    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        return fArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        p032f2.l lVar;
        if (!iVar.w0()) {
            return (float[]) f(iVar, fVar);
        }
        K2.k kVarL0 = fVar.l0();
        if (((C0964c) kVarL0.f2106m) == null) {
            kVarL0.f2106m = new C0964c(3);
        }
        C0964c c0964c = (C0964c) kVarL0.f2106m;
        float[] fArr = (float[]) c0964c.d();
        int i = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return (float[]) c0964c.c(i, fArr);
                }
                if (kVarB0 != T1.k.VALUE_NULL || (lVar = this.f7584j) == null) {
                    float f_parseFloatPrimitive = _parseFloatPrimitive(iVar, fVar);
                    if (i >= fArr.length) {
                        float[] fArr2 = (float[]) c0964c.b(i, fArr);
                        i = 0;
                        fArr = fArr2;
                    }
                    int i3 = i + 1;
                    try {
                        fArr[i] = f_parseFloatPrimitive;
                        i = i3;
                    } catch (Exception e6) {
                        e = e6;
                        i = i3;
                        throw JsonMappingException.i(e, fArr, c0964c.f12683d + i);
                    }
                } else {
                    lVar.getNullValue(fVar);
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object e() {
        return new float[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) {
        return new float[]{_parseFloatPrimitive(iVar, fVar)};
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return new Y(this, lVar, bool);
    }
}
