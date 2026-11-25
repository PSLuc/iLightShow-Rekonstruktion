package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends p015c2.q implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f7596h;
    public final p015c2.j i;

    public h0(Class cls, p015c2.j jVar) {
        this.f7596h = cls;
        this.i = jVar;
    }

    @Override // p015c2.q
    public final Object a(p015c2.f fVar, String str) throws InvalidFormatException {
        Class cls = this.f7596h;
        if (str == null) {
            return null;
        }
        p109u2.A aA0 = fVar.a0(fVar.f7252o);
        aA0.s0(str);
        try {
            p109u2.y yVarH0 = aA0.H0(aA0.i);
            yVarH0.B0();
            Object objDeserialize = this.i.deserialize(yVarH0, fVar);
            if (objDeserialize != null) {
                return objDeserialize;
            }
            fVar.u0(cls, str, "not a valid representation", new Object[0]);
            throw null;
        } catch (Exception e6) {
            fVar.u0(cls, str, "not a valid representation: %s", e6.getMessage());
            throw null;
        }
    }
}
