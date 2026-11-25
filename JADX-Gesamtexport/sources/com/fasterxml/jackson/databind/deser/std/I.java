package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: loaded from: classes.dex */
public final class I extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I f7556l = new I(Byte.TYPE, (byte) 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I f7557m = new I(Byte.class, null);

    public I(Class cls, Byte b6) {
        super(cls, p104t2.d.f12496m, b6, (byte) 0);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.v0()) {
            return Byte.valueOf(iVar.J());
        }
        if (this.f7571k) {
            return Byte.valueOf(_parseBytePrimitive(iVar, fVar));
        }
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return (Byte) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 11) {
            return (Byte) getNullValue(fVar);
        }
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        Object obj = this.f7570j;
        if (iV != 6) {
            if (iV == 7) {
                return Byte.valueOf(iVar.J());
            }
            if (iV != 8) {
                fVar.r0(iVar, getValueType(fVar));
                throw null;
            }
            p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, this._valueClass);
            if (bVar_checkFloatToIntCoercion == bVar2) {
                return (Byte) getNullValue(fVar);
            }
            return bVar_checkFloatToIntCoercion == bVar ? (Byte) obj : Byte.valueOf(iVar.J());
        }
        String strI0 = iVar.i0();
        p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
        if (bVar_checkFromStringCoercion == bVar2) {
            return (Byte) getNullValue(fVar);
        }
        if (bVar_checkFromStringCoercion == bVar) {
            return (Byte) obj;
        }
        String strTrim = strI0.trim();
        if (_checkTextualNull(fVar, strTrim)) {
            return (Byte) getNullValue(fVar);
        }
        try {
            int iE = V1.e.e(strTrim);
            if (!_byteOverflow(iE)) {
                return Byte.valueOf((byte) iE);
            }
            fVar.w0(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
            throw null;
        } catch (IllegalArgumentException unused) {
            fVar.w0(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
            throw null;
        }
    }
}
