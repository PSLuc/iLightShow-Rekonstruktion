package com.fasterxml.jackson.databind.deser.std;

import B.h1;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0529z extends AbstractC0510f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0529z f7685k = new C0529z(p087q2.r.class, Boolean.TRUE);

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0510f
    public final p015c2.j d(boolean z5, boolean z6) {
        return new C0529z(this, z5, z6);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws MismatchedInputException {
        p087q2.r rVar = (p087q2.r) obj;
        if (iVar.x0() || iVar.s0(T1.k.FIELD_NAME)) {
            return (p087q2.r) n(iVar, fVar, rVar, new h1());
        }
        fVar.s0(iVar, p087q2.r.class);
        throw null;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        p087q2.m mVar = fVar.f7249l.f7244r;
        if (iVar.x0()) {
            mVar.getClass();
            p087q2.r rVar = new p087q2.r(mVar);
            f(iVar, fVar, mVar, new h1(), rVar);
            return rVar;
        }
        if (iVar.s0(T1.k.FIELD_NAME)) {
            return g(iVar, fVar, mVar, new h1());
        }
        if (iVar.s0(T1.k.END_OBJECT)) {
            mVar.getClass();
            return new p087q2.r(mVar);
        }
        fVar.s0(iVar, p087q2.r.class);
        throw null;
    }
}
