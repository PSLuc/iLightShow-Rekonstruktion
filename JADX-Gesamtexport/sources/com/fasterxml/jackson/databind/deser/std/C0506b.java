package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0506b extends n0 {
    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        T1.k kVarS = iVar.s();
        if (kVarS == T1.k.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (kVarS == T1.k.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean bool_parseBoolean = _parseBoolean(iVar, fVar, AtomicBoolean.class);
        if (bool_parseBoolean == null) {
            return null;
        }
        return new AtomicBoolean(bool_parseBoolean.booleanValue());
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return new AtomicBoolean(false);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12498o;
    }
}
