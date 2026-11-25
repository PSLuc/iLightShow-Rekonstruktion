package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class O extends n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O f7568h = new O(Number.class);

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return _deserializeFromArray(iVar, fVar);
        }
        if (iV != 6) {
            if (iV == 7) {
                return fVar.x0(g0.F_MASK_INT_COERCIONS) ? _coerceIntegral(iVar, fVar) : iVar.c0();
            }
            if (iV == 8) {
                return (!fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS) || iVar.y0()) ? iVar.c0() : iVar.T();
            }
            fVar.r0(iVar, getValueType(fVar));
            throw null;
        }
        String strI0 = iVar.i0();
        p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
        if (bVar_checkFromStringCoercion == p026e2.b.f8687j) {
            return getNullValue(fVar);
        }
        if (bVar_checkFromStringCoercion == p026e2.b.f8688k) {
            return getEmptyValue(fVar);
        }
        String strTrim = strI0.trim();
        if (_hasTextualNull(strTrim)) {
            return getNullValue(fVar);
        }
        if (_isPosInf(strTrim)) {
            return Double.valueOf(Double.POSITIVE_INFINITY);
        }
        if (_isNegInf(strTrim)) {
            return Double.valueOf(Double.NEGATIVE_INFINITY);
        }
        if (_isNaN(strTrim)) {
            return Double.valueOf(Double.NaN);
        }
        try {
            if (_isIntNumber(strTrim)) {
                if (fVar.B0(p015c2.g.USE_BIG_INTEGER_FOR_INTS)) {
                    return V1.e.b(strTrim);
                }
                long jG = V1.e.g(strTrim);
                return (fVar.B0(p015c2.g.USE_LONG_FOR_INTS) || jG > 2147483647L || jG < -2147483648L) ? Long.valueOf(jG) : Integer.valueOf((int) jG);
            }
            if (!fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS)) {
                return Double.valueOf(V1.e.c(strTrim, iVar.u0(T1.p.USE_FAST_DOUBLE_PARSER)));
            }
            String str = V1.e.f5496a;
            return AbstractC0473d.L(strTrim);
        } catch (IllegalArgumentException unused) {
            fVar.w0(this._valueClass, strTrim, "not a valid number", new Object[0]);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        int iV = iVar.v();
        return (iV == 6 || iV == 7 || iV == 8) ? deserialize(iVar, fVar) : dVar.e(iVar, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12496m;
    }
}
