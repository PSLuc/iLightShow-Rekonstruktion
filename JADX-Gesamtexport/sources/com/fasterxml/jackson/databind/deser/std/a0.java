package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import p109u2.C0964c;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a0 f7581l = new a0(long[].class);

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        return jArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        long jA0;
        int i;
        if (!iVar.w0()) {
            return (long[]) f(iVar, fVar);
        }
        K2.k kVarL0 = fVar.l0();
        if (((C0964c) kVarL0.f2105l) == null) {
            kVarL0.f2105l = new C0964c(5);
        }
        C0964c c0964c = (C0964c) kVarL0.f2105l;
        long[] jArr = (long[]) c0964c.d();
        int i3 = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return (long[]) c0964c.c(i3, jArr);
                }
                try {
                    if (kVarB0 == T1.k.VALUE_NUMBER_INT) {
                        jA0 = iVar.a0();
                    } else if (kVarB0 == T1.k.VALUE_NULL) {
                        p032f2.l lVar = this.f7584j;
                        if (lVar != null) {
                            lVar.getNullValue(fVar);
                        } else {
                            _verifyNullForPrimitive(fVar);
                            jA0 = 0;
                        }
                    } else {
                        jA0 = _parseLongPrimitive(iVar, fVar);
                    }
                    jArr[i3] = jA0;
                    i3 = i;
                } catch (Exception e6) {
                    e = e6;
                    i3 = i;
                    throw JsonMappingException.i(e, jArr, c0964c.f12683d + i3);
                }
                if (i3 >= jArr.length) {
                    long[] jArr2 = (long[]) c0964c.b(i3, jArr);
                    i3 = 0;
                    jArr = jArr2;
                }
                i = i3 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object e() {
        return new long[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) {
        return new long[]{_parseLongPrimitive(iVar, fVar)};
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return new a0(this, lVar, bool);
    }
}
