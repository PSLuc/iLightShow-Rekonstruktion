package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import p109u2.C0964c;

/* JADX INFO: loaded from: classes.dex */
public final class X extends c0 {
    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
        return dArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        p032f2.l lVar;
        if (!iVar.w0()) {
            return (double[]) f(iVar, fVar);
        }
        K2.k kVarL0 = fVar.l0();
        if (((C0964c) kVarL0.f2107n) == null) {
            kVarL0.f2107n = new C0964c(2);
        }
        C0964c c0964c = (C0964c) kVarL0.f2107n;
        double[] dArr = (double[]) c0964c.d();
        int i = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return (double[]) c0964c.c(i, dArr);
                }
                if (kVarB0 != T1.k.VALUE_NULL || (lVar = this.f7584j) == null) {
                    double d_parseDoublePrimitive = _parseDoublePrimitive(iVar, fVar);
                    if (i >= dArr.length) {
                        double[] dArr2 = (double[]) c0964c.b(i, dArr);
                        i = 0;
                        dArr = dArr2;
                    }
                    int i3 = i + 1;
                    try {
                        dArr[i] = d_parseDoublePrimitive;
                        i = i3;
                    } catch (Exception e6) {
                        e = e6;
                        i = i3;
                        throw JsonMappingException.i(e, dArr, c0964c.f12683d + i);
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
        return new double[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) {
        return new double[]{_parseDoublePrimitive(iVar, fVar)};
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return new X(this, lVar, bool);
    }
}
