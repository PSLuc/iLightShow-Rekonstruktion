package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;
import p109u2.C0964c;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Z f7580l = new Z(int[].class);

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        int iZ;
        int i;
        if (!iVar.w0()) {
            return (int[]) f(iVar, fVar);
        }
        K2.k kVarL0 = fVar.l0();
        if (((C0964c) kVarL0.f2104k) == null) {
            kVarL0.f2104k = new C0964c(4);
        }
        C0964c c0964c = (C0964c) kVarL0.f2104k;
        int[] iArr = (int[]) c0964c.d();
        int i3 = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return (int[]) c0964c.c(i3, iArr);
                }
                try {
                    if (kVarB0 == T1.k.VALUE_NUMBER_INT) {
                        iZ = iVar.Z();
                    } else if (kVarB0 == T1.k.VALUE_NULL) {
                        p032f2.l lVar = this.f7584j;
                        if (lVar != null) {
                            lVar.getNullValue(fVar);
                        } else {
                            _verifyNullForPrimitive(fVar);
                            iZ = 0;
                        }
                    } else {
                        iZ = _parseIntPrimitive(iVar, fVar);
                    }
                    iArr[i3] = iZ;
                    i3 = i;
                } catch (Exception e6) {
                    e = e6;
                    i3 = i;
                    throw JsonMappingException.i(e, iArr, c0964c.f12683d + i3);
                }
                if (i3 >= iArr.length) {
                    int[] iArr2 = (int[]) c0964c.b(i3, iArr);
                    i3 = 0;
                    iArr = iArr2;
                }
                i = i3 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object e() {
        return new int[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) {
        return new int[]{_parseIntPrimitive(iVar, fVar)};
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return new Z(this, lVar, bool);
    }
}
