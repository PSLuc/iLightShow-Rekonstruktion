package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends n0 {
    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        T1.k kVarB0;
        p109u2.A aA0 = fVar.a0(iVar);
        if (!iVar.s0(T1.k.FIELD_NAME)) {
            aA0.I0(iVar);
            return aA0;
        }
        aA0.o0();
        do {
            aA0.I0(iVar);
            kVarB0 = iVar.B0();
        } while (kVarB0 == T1.k.FIELD_NAME);
        T1.k kVar = T1.k.END_OBJECT;
        if (kVarB0 == kVar) {
            aA0.M();
            return aA0;
        }
        throw p015c2.f.O0(fVar.f7252o, kVar, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + kVarB0);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12495l;
    }
}
