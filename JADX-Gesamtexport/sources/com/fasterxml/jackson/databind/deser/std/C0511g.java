package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0511g extends n0 {
    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        p109u2.f fVar2 = new p109u2.f(byteBuffer);
        iVar.C0(fVar.f7249l.i.f8685n, fVar2);
        fVar2.close();
        return byteBuffer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12501r;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        iVar.getClass();
        return ByteBuffer.wrap(iVar.D(T1.b.f5157a));
    }
}
