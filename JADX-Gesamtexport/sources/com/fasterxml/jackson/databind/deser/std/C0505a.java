package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0505a extends C0513i {
    @Override // com.fasterxml.jackson.databind.deser.std.C0513i, com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.c(iVar, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C0513i
    public final Collection f(T1.i iVar, p015c2.f fVar, Collection collection) throws JsonMappingException {
        if (collection == null) {
            collection = new ArrayList();
        }
        Collection collectionF = super.f(iVar, fVar, collection);
        return collectionF.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collectionF.size(), false, collectionF);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C0513i
    public final Collection g(p015c2.f fVar) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C0513i
    public final C0513i i(p015c2.j jVar, p015c2.j jVar2, p071n2.d dVar, p032f2.l lVar, Boolean bool) {
        return new C0505a(this.f7605h, jVar2, dVar, this.f7599n, jVar, lVar, bool);
    }
}
