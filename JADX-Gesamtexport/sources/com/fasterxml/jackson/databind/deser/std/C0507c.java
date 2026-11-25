package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0507c extends n0 {
    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.v0()) {
            return new AtomicInteger(iVar.Z());
        }
        Integer num_parseInteger = _parseInteger(iVar, fVar, AtomicInteger.class);
        if (num_parseInteger == null) {
            return null;
        }
        return new AtomicInteger(num_parseInteger.intValue());
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return new AtomicInteger();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12496m;
    }
}
