package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final J f7558l = new J(Character.TYPE, 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final J f7559m = new J(Character.class, null);

    public J(Class cls, Character ch) {
        super(cls, p104t2.d.f12496m, ch, (char) 0);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        J j4;
        p015c2.f fVar2;
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return (Character) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 11) {
            if (this.f7571k) {
                _verifyNullForPrimitive(fVar);
            }
            return (Character) getNullValue(fVar);
        }
        Object obj = this.f7570j;
        if (iV == 6) {
            String strI0 = iVar.i0();
            if (strI0.length() == 1) {
                return Character.valueOf(strI0.charAt(0));
            }
            p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
            if (bVar_checkFromStringCoercion == p026e2.b.f8687j) {
                return (Character) getNullValue(fVar);
            }
            if (bVar_checkFromStringCoercion == p026e2.b.f8688k) {
                return (Character) obj;
            }
            String strTrim = strI0.trim();
            if (_checkTextualNull(fVar, strTrim)) {
                return (Character) getNullValue(fVar);
            }
            fVar.w0(handledType(), strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
            throw null;
        }
        if (iV != 7) {
            fVar.r0(iVar, getValueType(fVar));
            throw null;
        }
        p026e2.b bVarD0 = fVar.d0(this.f7569h, this._valueClass, p026e2.d.f8691h);
        int iOrdinal = bVarD0.ordinal();
        if (iOrdinal == 0) {
            j4 = this;
            fVar2 = fVar;
            j4._checkCoercionFail(fVar2, bVarD0, this._valueClass, iVar.c0(), "Integer value (" + iVar.i0() + ")");
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return (Character) obj;
                }
                int iZ = iVar.Z();
                if (iZ >= 0 && iZ <= 65535) {
                    return Character.valueOf((char) iZ);
                }
                fVar.v0(handledType(), Integer.valueOf(iZ), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                throw null;
            }
            j4 = this;
            fVar2 = fVar;
        }
        return (Character) j4.getNullValue(fVar2);
    }
}
