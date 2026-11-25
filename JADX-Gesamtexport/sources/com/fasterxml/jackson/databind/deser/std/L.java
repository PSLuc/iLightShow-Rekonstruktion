package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: loaded from: classes.dex */
public final class L extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final L f7562l = new L(Float.TYPE, Float.valueOf(0.0f));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final L f7563m = new L(Float.class, null);

    public L(Class cls, Float f6) {
        super(cls, p104t2.d.f12497n, f6, Float.valueOf(0.0f));
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.s0(T1.k.VALUE_NUMBER_FLOAT)) {
            return Float.valueOf(iVar.Y());
        }
        if (this.f7571k) {
            return Float.valueOf(_parseFloatPrimitive(iVar, fVar));
        }
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return (Float) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 11) {
            return (Float) getNullValue(fVar);
        }
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        Object obj = this.f7570j;
        if (iV != 6) {
            if (iV == 7) {
                p026e2.b bVar_checkIntToFloatCoercion = _checkIntToFloatCoercion(iVar, fVar, this._valueClass);
                if (bVar_checkIntToFloatCoercion == bVar2) {
                    return (Float) getNullValue(fVar);
                }
                if (bVar_checkIntToFloatCoercion == bVar) {
                    return (Float) obj;
                }
            } else if (iV != 8) {
                fVar.r0(iVar, getValueType(fVar));
                throw null;
            }
            return Float.valueOf(iVar.Y());
        }
        String strI0 = iVar.i0();
        Float f_checkFloatSpecialValue = _checkFloatSpecialValue(strI0);
        if (f_checkFloatSpecialValue != null) {
            return f_checkFloatSpecialValue;
        }
        p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
        if (bVar_checkFromStringCoercion == bVar2) {
            return (Float) getNullValue(fVar);
        }
        if (bVar_checkFromStringCoercion == bVar) {
            return (Float) obj;
        }
        String strTrim = strI0.trim();
        if (_checkTextualNull(fVar, strTrim)) {
            return (Float) getNullValue(fVar);
        }
        try {
            return Float.valueOf(V1.e.d(strTrim, iVar.u0(T1.p.USE_FAST_DOUBLE_PARSER)));
        } catch (IllegalArgumentException unused) {
            fVar.w0(this._valueClass, strTrim, "not a valid `Float` value", new Object[0]);
            throw null;
        }
    }
}
