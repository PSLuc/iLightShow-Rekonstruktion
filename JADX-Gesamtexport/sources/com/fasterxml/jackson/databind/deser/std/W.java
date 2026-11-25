package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class W extends c0 {
    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        char[] cArr = (char[]) obj;
        char[] cArr2 = (char[]) obj2;
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
        return cArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        String strI0;
        if (iVar.s0(T1.k.VALUE_STRING)) {
            char[] cArrJ0 = iVar.j0();
            int iL0 = iVar.l0();
            int iK0 = iVar.k0();
            char[] cArr = new char[iK0];
            System.arraycopy(cArrJ0, iL0, cArr, 0, iK0);
            return cArr;
        }
        if (!iVar.w0()) {
            if (iVar.s0(T1.k.VALUE_EMBEDDED_OBJECT)) {
                Object objX = iVar.X();
                if (objX == null) {
                    return null;
                }
                if (objX instanceof char[]) {
                    return (char[]) objX;
                }
                if (objX instanceof String) {
                    return ((String) objX).toCharArray();
                }
                if (objX instanceof byte[]) {
                    return T1.b.f5157a.d((byte[]) objX).toCharArray();
                }
            }
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        StringBuilder sb = new StringBuilder(64);
        while (true) {
            T1.k kVarB0 = iVar.B0();
            if (kVarB0 == T1.k.END_ARRAY) {
                return sb.toString().toCharArray();
            }
            if (kVarB0 == T1.k.VALUE_STRING) {
                strI0 = iVar.i0();
            } else {
                if (kVarB0 != T1.k.VALUE_NULL) {
                    fVar.s0(iVar, Character.TYPE);
                    throw null;
                }
                p032f2.l lVar = this.f7584j;
                if (lVar != null) {
                    lVar.getNullValue(fVar);
                } else {
                    _verifyNullForPrimitive(fVar);
                    strI0 = "\u0000";
                }
            }
            if (strI0.length() != 1) {
                fVar.J0(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(strI0.length()));
                throw null;
            }
            sb.append(strI0.charAt(0));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object e() {
        return new char[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        fVar.s0(iVar, this._valueClass);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return this;
    }
}
