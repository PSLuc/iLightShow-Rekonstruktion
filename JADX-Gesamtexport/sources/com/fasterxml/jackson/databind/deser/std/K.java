package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: loaded from: classes.dex */
public final class K extends P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final K f7560l = new K(Double.TYPE, Double.valueOf(0.0d));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final K f7561m = new K(Double.class, null);

    public K(Class cls, Double d6) {
        super(cls, p104t2.d.f12497n, d6, Double.valueOf(0.0d));
    }

    public final Double d(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return (Double) _deserializeFromArray(iVar, fVar);
        }
        if (iV == 11) {
            return (Double) getNullValue(fVar);
        }
        Object obj = this.f7570j;
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        if (iV != 6) {
            if (iV == 7) {
                p026e2.b bVar_checkIntToFloatCoercion = _checkIntToFloatCoercion(iVar, fVar, this._valueClass);
                if (bVar_checkIntToFloatCoercion == bVar2) {
                    return (Double) getNullValue(fVar);
                }
                if (bVar_checkIntToFloatCoercion == bVar) {
                    return (Double) obj;
                }
            } else if (iV != 8) {
                fVar.r0(iVar, getValueType(fVar));
                throw null;
            }
            return Double.valueOf(iVar.V());
        }
        String strI0 = iVar.i0();
        Double d_checkDoubleSpecialValue = _checkDoubleSpecialValue(strI0);
        if (d_checkDoubleSpecialValue != null) {
            return d_checkDoubleSpecialValue;
        }
        p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
        if (bVar_checkFromStringCoercion == bVar2) {
            return (Double) getNullValue(fVar);
        }
        if (bVar_checkFromStringCoercion == bVar) {
            return (Double) obj;
        }
        String strTrim = strI0.trim();
        if (_checkTextualNull(fVar, strTrim)) {
            return (Double) getNullValue(fVar);
        }
        try {
            return Double.valueOf(g0._parseDouble(strTrim, iVar.u0(T1.p.USE_FAST_DOUBLE_PARSER)));
        } catch (IllegalArgumentException unused) {
            fVar.w0(this._valueClass, strTrim, "not a valid `Double` value", new Object[0]);
            throw null;
        }
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        if (iVar.s0(T1.k.VALUE_NUMBER_FLOAT)) {
            return Double.valueOf(iVar.V());
        }
        return this.f7571k ? Double.valueOf(_parseDoublePrimitive(iVar, fVar)) : d(iVar, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        if (iVar.s0(T1.k.VALUE_NUMBER_FLOAT)) {
            return Double.valueOf(iVar.V());
        }
        return this.f7571k ? Double.valueOf(_parseDoublePrimitive(iVar, fVar)) : d(iVar, fVar);
    }
}
