package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class G extends n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G f7553h = new G(BigInteger.class);

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.v0()) {
            return iVar.C();
        }
        int iV = iVar.v();
        if (iV == 1) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        if (iV == 3) {
            return (BigInteger) _deserializeFromArray(iVar, fVar);
        }
        p026e2.b bVar = p026e2.b.f8688k;
        p026e2.b bVar2 = p026e2.b.f8687j;
        if (iV != 6) {
            if (iV != 8) {
                fVar.r0(iVar, getValueType(fVar));
                throw null;
            }
            p026e2.b bVar_checkFloatToIntCoercion = _checkFloatToIntCoercion(iVar, fVar, this._valueClass);
            if (bVar_checkFloatToIntCoercion == bVar2) {
                return (BigInteger) getNullValue(fVar);
            }
            return bVar_checkFloatToIntCoercion == bVar ? BigInteger.ZERO : iVar.T().toBigInteger();
        }
        String strI0 = iVar.i0();
        p026e2.b bVar_checkFromStringCoercion = _checkFromStringCoercion(fVar, strI0);
        if (bVar_checkFromStringCoercion == bVar2) {
            return (BigInteger) getNullValue(fVar);
        }
        if (bVar_checkFromStringCoercion == bVar) {
            return BigInteger.ZERO;
        }
        String strTrim = strI0.trim();
        if (_hasTextualNull(strTrim)) {
            return (BigInteger) getNullValue(fVar);
        }
        try {
            return V1.e.b(strTrim);
        } catch (IllegalArgumentException unused) {
            fVar.w0(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            throw null;
        }
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return BigInteger.ZERO;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12496m;
    }
}
