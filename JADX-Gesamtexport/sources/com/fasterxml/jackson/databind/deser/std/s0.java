package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.util.Set;
import p037g2.C0719c;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends p032f2.d {
    @Override // p032f2.d
    public final Object C(T1.i iVar, p015c2.f fVar) throws IOException {
        if (this.f8887m != null) {
            return e(iVar, fVar);
        }
        p015c2.j jVar = this.f8885k;
        p032f2.t tVar = this.f8884j;
        if (jVar != null) {
            return tVar.w(fVar, jVar.deserialize(iVar, fVar));
        }
        p015c2.h hVar = this.f8883h;
        boolean zI0 = hVar.i0();
        Class cls = hVar.f7281k;
        if (zI0) {
            fVar.o0(cls, tVar, "abstract type (need to add/enable type information?)", new Object[0]);
            throw null;
        }
        boolean zH = tVar.h();
        boolean zJ = tVar.j();
        if (!zH && !zJ) {
            fVar.o0(cls, tVar, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
            throw null;
        }
        Throwable th = null;
        Object[] objArr = null;
        Throwable[] thArr = null;
        int i = 0;
        while (!iVar.s0(T1.k.END_OBJECT)) {
            String strO = iVar.o();
            C0719c c0719c = this.f8890p;
            p032f2.r rVarI = c0719c.i(strO);
            iVar.B0();
            if (rVarI != null) {
                if (th != null) {
                    rVarI.j(iVar, fVar, th);
                } else {
                    if (objArr == null) {
                        int i3 = c0719c.f9114j;
                        objArr = new Object[i3 + i3];
                    }
                    int i6 = i + 1;
                    objArr[i] = rVarI;
                    i += 2;
                    objArr[i6] = rVarI.i(iVar, fVar);
                }
            } else if ("message".equalsIgnoreCase(strO) && zH) {
                th = (Throwable) tVar.t(fVar, iVar.q0());
            } else {
                Set set = this.f8893s;
                if (set != null && set.contains(strO)) {
                    iVar.F0();
                } else if ("suppressed".equalsIgnoreCase(strO)) {
                    thArr = (Throwable[]) fVar.F0(iVar, Throwable[].class);
                } else if ("localizedMessage".equalsIgnoreCase(strO)) {
                    iVar.F0();
                } else {
                    p032f2.p pVar = this.f8892r;
                    if (pVar != null) {
                        pVar.c(iVar, fVar, th, strO);
                    } else {
                        handleUnknownProperty(iVar, fVar, th, strO);
                    }
                }
            }
            iVar.B0();
        }
        if (th == null) {
            th = zH ? (Throwable) tVar.t(fVar, null) : (Throwable) tVar.v(fVar);
        }
        if (objArr != null) {
            for (int i7 = 0; i7 < i; i7 += 2) {
                ((p032f2.r) objArr[i7]).z(th, objArr[i7 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th2 : thArr) {
                th.addSuppressed(th2);
            }
        }
        return th;
    }

    @Override // p032f2.d, p032f2.e, p015c2.j
    public final p015c2.j unwrappingDeserializer(p109u2.s sVar) {
        return new s0(this, sVar);
    }
}
