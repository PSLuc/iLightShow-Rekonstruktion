package com.fasterxml.jackson.databind.deser.std;

import B.h1;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0528y extends AbstractC0510f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0528y f7684k = new C0528y(p087q2.a.class, Boolean.TRUE);

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0510f
    public final p015c2.j d(boolean z5, boolean z6) {
        return new C0528y(this, z5, z6);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws MismatchedInputException {
        p087q2.a aVar = (p087q2.a) obj;
        if (iVar.w0()) {
            f(iVar, fVar, fVar.f7249l.f7244r, new h1(), aVar);
            return aVar;
        }
        fVar.s0(iVar, p087q2.a.class);
        throw null;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.w0()) {
            p087q2.m mVar = fVar.f7249l.f7244r;
            mVar.getClass();
            p087q2.a aVar = new p087q2.a(mVar);
            f(iVar, fVar, mVar, new h1(), aVar);
            return aVar;
        }
        fVar.s0(iVar, p087q2.a.class);
        throw null;
    }
}
