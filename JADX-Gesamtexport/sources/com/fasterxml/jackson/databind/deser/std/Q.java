package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Q f7572l = new Q(Short.TYPE, 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Q f7573m = new Q(Short.class, null);

    public Q(Class cls, Short sh) {
        super(cls, p104t2.d.f12496m, sh, (short) 0);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.v0()) {
            return Short.valueOf(iVar.h0());
        }
        if (this.f7571k) {
            return Short.valueOf(_parseShortPrimitive(iVar, fVar));
        }
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return (Short) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 11) {
            return (Short) getNullValue(fVar);
        }
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        Object obj = this.f7570j;
        if (iV != 6) {
            if (iV == 7) {
                return Short.valueOf(iVar.h0());
            }
            if (iV != 8) {
                fVar.r0(iVar, getValueType(fVar));
                throw null;
            }
            p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, this._valueClass);
            if (bVar_checkFloatToIntCoercion == bVar2) {
                return (Short) getNullValue(fVar);
            }
            return bVar_checkFloatToIntCoercion == bVar ? (Short) obj : Short.valueOf(iVar.h0());
        }
        String strI0 = iVar.i0();
        p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
        if (bVar_checkFromStringCoercion == bVar2) {
            return (Short) getNullValue(fVar);
        }
        if (bVar_checkFromStringCoercion == bVar) {
            return (Short) obj;
        }
        String strTrim = strI0.trim();
        if (_checkTextualNull(fVar, strTrim)) {
            return (Short) getNullValue(fVar);
        }
        try {
            int iE = V1.e.e(strTrim);
            if (!_shortOverflow(iE)) {
                return Short.valueOf((short) iE);
            }
            fVar.w0(this._valueClass, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
            throw null;
        } catch (IllegalArgumentException unused) {
            fVar.w0(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            throw null;
        }
    }
}
