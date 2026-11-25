package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public class N extends p105t3.C {
    public static p105t3.r c(p138z3.a aVar, int i) throws IOException {
        int iD = AbstractC0916i.d(i);
        if (iD == 5) {
            return new p105t3.u(aVar.d0());
        }
        if (iD == 6) {
            return new p105t3.u(new p116v3.h(aVar.d0()));
        }
        if (iD == 7) {
            return new p105t3.u(Boolean.valueOf(aVar.T()));
        }
        if (iD != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(p138z3.b.b(i)));
        }
        aVar.b0();
        return p105t3.s.f12591h;
    }

    public static void d(p105t3.r rVar, p138z3.c cVar) throws IOException {
        if (rVar == null || (rVar instanceof p105t3.s)) {
            cVar.G();
            return;
        }
        if (rVar instanceof p105t3.u) {
            p105t3.u uVarI = rVar.i();
            Serializable serializable = uVarI.f12593h;
            if (serializable instanceof Number) {
                cVar.Y(uVarI.o());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.a0(uVarI.m());
                return;
            } else {
                cVar.Z(uVarI.k());
                return;
            }
        }
        if (rVar instanceof p105t3.o) {
            cVar.c();
            ArrayList arrayList = rVar.d().f12590h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d((p105t3.r) obj, cVar);
            }
            cVar.s();
            return;
        }
        if (!(rVar instanceof p105t3.t)) {
            throw new IllegalArgumentException("Couldn't write " + rVar.getClass());
        }
        cVar.k();
        Iterator it = ((p116v3.j) rVar.g().f12592h.entrySet()).iterator();
        while (((p116v3.i) it).hasNext()) {
            p116v3.k kVarB = ((p116v3.i) it).b();
            cVar.C((String) kVarB.getKey());
            d((p105t3.r) kVarB.getValue(), cVar);
        }
        cVar.v();
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        p105t3.r oVar;
        p105t3.r oVar2;
        if (aVar instanceof C0613f) {
            C0613f c0613f = (C0613f) aVar;
            int iF0 = c0613f.f0();
            if (iF0 != 5 && iF0 != 2 && iF0 != 4 && iF0 != 10) {
                p105t3.r rVar = (p105t3.r) c0613f.t0();
                c0613f.m0();
                return rVar;
            }
            throw new IllegalStateException("Unexpected " + p138z3.b.b(iF0) + " when reading a JsonElement.");
        }
        int iF1 = aVar.f0();
        int iD = AbstractC0916i.d(iF1);
        if (iD == 0) {
            aVar.b();
            oVar = new p105t3.o();
        } else if (iD != 2) {
            oVar = null;
        } else {
            aVar.c();
            oVar = new p105t3.t();
        }
        if (oVar == null) {
            return c(aVar, iF1);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.L()) {
                String strZ = oVar instanceof p105t3.t ? aVar.Z() : null;
                int iF2 = aVar.f0();
                int iD2 = AbstractC0916i.d(iF2);
                if (iD2 == 0) {
                    aVar.b();
                    oVar2 = new p105t3.o();
                } else if (iD2 != 2) {
                    oVar2 = null;
                } else {
                    aVar.c();
                    oVar2 = new p105t3.t();
                }
                boolean z5 = oVar2 != null;
                if (oVar2 == null) {
                    oVar2 = c(aVar, iF2);
                }
                if (oVar instanceof p105t3.o) {
                    ((p105t3.o) oVar).f12590h.add(oVar2);
                } else {
                    ((p105t3.t) oVar).f12592h.put(strZ, oVar2);
                }
                if (z5) {
                    arrayDeque.addLast(oVar);
                    oVar = oVar2;
                }
            } else {
                if (oVar instanceof p105t3.o) {
                    aVar.s();
                } else {
                    aVar.v();
                }
                if (arrayDeque.isEmpty()) {
                    return oVar;
                }
                oVar = (p105t3.r) arrayDeque.removeLast();
            }
        }
    }

    @Override // p105t3.C
    public final /* bridge */ /* synthetic */ void b(p138z3.c cVar, Object obj) throws IOException {
        d((p105t3.r) obj, cVar);
    }
}
