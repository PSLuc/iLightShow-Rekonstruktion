package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0508d extends n0 {
    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.v0()) {
            return new AtomicLong(iVar.a0());
        }
        Long l_parseLong = _parseLong(iVar, fVar, AtomicLong.class);
        if (l_parseLong == null) {
            return null;
        }
        return new AtomicLong(l_parseLong.intValue());
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12496m;
    }
}
