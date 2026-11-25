package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Arrays;
import p109u2.C0964c;

/* JADX INFO: loaded from: classes.dex */
public final class V extends c0 {
    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object d(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        byte bJ;
        int i;
        T1.k kVarS = iVar.s();
        if (kVarS == T1.k.VALUE_STRING) {
            try {
                return iVar.D(fVar.f7249l.i.f8685n);
            } catch (StreamReadException e6) {
                String strB = e6.b();
                if (strB.contains("base64")) {
                    fVar.w0(byte[].class, iVar.i0(), strB, new Object[0]);
                    throw null;
                }
            }
        }
        if (kVarS == T1.k.VALUE_EMBEDDED_OBJECT) {
            Object objX = iVar.X();
            if (objX == null) {
                return null;
            }
            if (objX instanceof byte[]) {
                return (byte[]) objX;
            }
        }
        if (!iVar.w0()) {
            return (byte[]) f(iVar, fVar);
        }
        K2.k kVarL0 = fVar.l0();
        if (((C0964c) kVarL0.i) == null) {
            kVarL0.i = new C0964c(1);
        }
        C0964c c0964c = (C0964c) kVarL0.i;
        byte[] bArr = (byte[]) c0964c.d();
        int i3 = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return (byte[]) c0964c.c(i3, bArr);
                }
                try {
                    if (kVarB0 == T1.k.VALUE_NUMBER_INT) {
                        bJ = iVar.J();
                    } else if (kVarB0 == T1.k.VALUE_NULL) {
                        p032f2.l lVar = this.f7584j;
                        if (lVar != null) {
                            lVar.getNullValue(fVar);
                        } else {
                            _verifyNullForPrimitive(fVar);
                            bJ = 0;
                        }
                    } else {
                        bJ = _parseBytePrimitive(iVar, fVar);
                    }
                    bArr[i3] = bJ;
                    i3 = i;
                } catch (Exception e7) {
                    e = e7;
                    i3 = i;
                    throw JsonMappingException.i(e, bArr, c0964c.f12683d + i3);
                }
                if (i3 >= bArr.length) {
                    byte[] bArr2 = (byte[]) c0964c.b(i3, bArr);
                    i3 = 0;
                    bArr = bArr2;
                }
                i = i3 + 1;
            } catch (Exception e8) {
                e = e8;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object e() {
        return new byte[0];
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final Object g(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        T1.k kVarS = iVar.s();
        if (kVarS == T1.k.VALUE_NUMBER_INT) {
            return new byte[]{iVar.J()};
        }
        if (kVarS != T1.k.VALUE_NULL) {
            fVar.s0(iVar, this._valueClass.getComponentType());
            throw null;
        }
        p032f2.l lVar = this.f7584j;
        if (lVar != null) {
            lVar.getNullValue(fVar);
            return (byte[]) getEmptyValue(fVar);
        }
        _verifyNullForPrimitive(fVar);
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0
    public final c0 h(p032f2.l lVar, Boolean bool) {
        return new V(this, lVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.c0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12501r;
    }
}
