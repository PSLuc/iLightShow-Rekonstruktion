package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import p109u2.C0964c;

/* JADX INFO: loaded from: classes.dex */
public final class U extends c0 {
    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        boolean[] zArr = (boolean[]) obj;
        boolean[] zArr2 = (boolean[]) obj2;
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        return zArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        boolean z_parseBooleanPrimitive;
        int i;
        if (!iVar.w0()) {
            return (boolean[]) f(iVar, fVar);
        }
        K2.k kVarL0 = fVar.l0();
        if (((C0964c) kVarL0.f2102h) == null) {
            kVarL0.f2102h = new C0964c(0);
        }
        C0964c c0964c = (C0964c) kVarL0.f2102h;
        boolean[] zArr = (boolean[]) c0964c.d();
        int i3 = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return (boolean[]) c0964c.c(i3, zArr);
                }
                try {
                    if (kVarB0 == T1.k.VALUE_TRUE) {
                        z_parseBooleanPrimitive = true;
                    } else {
                        if (kVarB0 != T1.k.VALUE_FALSE) {
                            if (kVarB0 == T1.k.VALUE_NULL) {
                                p032f2.l lVar = this.f7584j;
                                if (lVar != null) {
                                    lVar.getNullValue(fVar);
                                } else {
                                    _verifyNullForPrimitive(fVar);
                                }
                            } else {
                                z_parseBooleanPrimitive = _parseBooleanPrimitive(iVar, fVar);
                            }
                        }
                        z_parseBooleanPrimitive = false;
                    }
                    zArr[i3] = z_parseBooleanPrimitive;
                    i3 = i;
                } catch (Exception e6) {
                    e = e6;
                    i3 = i;
                    throw JsonMappingException.i(e, zArr, c0964c.f12683d + i3);
                }
                if (i3 >= zArr.length) {
                    boolean[] zArr2 = (boolean[]) c0964c.b(i3, zArr);
                    i3 = 0;
                    zArr = zArr2;
                }
                i = i3 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object e() {
        return new boolean[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) {
        return new boolean[]{_parseBooleanPrimitive(iVar, fVar)};
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return new U(this, lVar, bool);
    }
}
