package com.fasterxml.jackson.databind.deser.std;

import B.h1;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import p015c2.C0474e;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0510f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final A f7533k = new A(JsonNode.class, null);

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0510f
    public final p015c2.j d(boolean z5, boolean z6) {
        return new A(this, z5, z6);
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        h1 h1Var = new h1();
        p087q2.m mVar = fVar.f7249l.f7244r;
        int iV = iVar.v();
        if (iV == 1) {
            mVar.getClass();
            p087q2.r rVar = new p087q2.r(mVar);
            f(iVar, fVar, mVar, h1Var, rVar);
            return rVar;
        }
        if (iV == 2) {
            mVar.getClass();
            return new p087q2.r(mVar);
        }
        if (iV != 3) {
            return iV != 5 ? e(iVar, fVar) : g(iVar, fVar, mVar, h1Var);
        }
        mVar.getClass();
        p087q2.a aVar = new p087q2.a(mVar);
        f(iVar, fVar, mVar, h1Var, aVar);
        return aVar;
    }

    @Override // p015c2.j, p032f2.l
    public final Object getAbsentValue(p015c2.f fVar) {
        return null;
    }

    @Override // p015c2.j, p032f2.l
    public final Object getNullValue(p015c2.f fVar) {
        fVar.f7249l.f7244r.getClass();
        return p087q2.p.f11225h;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0510f, p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return this.f7591h;
    }
}
