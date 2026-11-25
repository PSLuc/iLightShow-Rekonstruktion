package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.math.BigDecimal;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class F extends n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F f7552h = new F(BigDecimal.class);

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return (BigDecimal) _deserializeFromArray(iVar, fVar);
        }
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        if (iV != 6) {
            if (iV == 7) {
                p026e2.b bVar_checkIntToFloatCoercion = _checkIntToFloatCoercion(iVar, fVar, this._valueClass);
                if (bVar_checkIntToFloatCoercion == bVar2) {
                    return (BigDecimal) getNullValue(fVar);
                }
                if (bVar_checkIntToFloatCoercion == bVar) {
                    return BigDecimal.ZERO;
                }
            } else if (iV != 8) {
                fVar.r0(iVar, getValueType(fVar));
                throw null;
            }
            return iVar.T();
        }
        String strI0 = iVar.i0();
        p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
        if (bVar_checkFromStringCoercion == bVar2) {
            return (BigDecimal) getNullValue(fVar);
        }
        if (bVar_checkFromStringCoercion == bVar) {
            return BigDecimal.ZERO;
        }
        String strTrim = strI0.trim();
        if (_hasTextualNull(strTrim)) {
            return (BigDecimal) getNullValue(fVar);
        }
        try {
            String str = V1.e.f5496a;
            return AbstractC0473d.L(strTrim);
        } catch (IllegalArgumentException unused) {
            fVar.w0(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            throw null;
        }
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return BigDecimal.ZERO;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12497n;
    }
}
