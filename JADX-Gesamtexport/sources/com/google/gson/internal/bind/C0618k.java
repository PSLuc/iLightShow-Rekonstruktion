package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: com.google.gson.internal.bind.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0618k extends p105t3.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p105t3.D f8105c = new ObjectTypeAdapter$1(p105t3.B.f12557h);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p105t3.m f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p105t3.B f8107b;

    public C0618k(p105t3.m mVar, p105t3.B b6) {
        this.f8106a = mVar;
        this.f8107b = b6;
    }

    public static p105t3.D c(p105t3.B b6) {
        return b6 == p105t3.B.f12557h ? f8105c : new ObjectTypeAdapter$1(b6);
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iF0 = aVar.f0();
        int iD = AbstractC0916i.d(iF0);
        if (iD == 0) {
            aVar.b();
            arrayList = new ArrayList();
        } else if (iD != 2) {
            arrayList = null;
        } else {
            aVar.c();
            arrayList = new p116v3.l(true);
        }
        if (arrayList == null) {
            return d(aVar, iF0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.L()) {
                String strZ = arrayList instanceof Map ? aVar.Z() : null;
                int iF1 = aVar.f0();
                int iD2 = AbstractC0916i.d(iF1);
                if (iD2 == 0) {
                    aVar.b();
                    arrayList2 = new ArrayList();
                } else if (iD2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.c();
                    arrayList2 = new p116v3.l(true);
                }
                boolean z5 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, iF1);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strZ, arrayList2);
                }
                if (z5) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.s();
                } else {
                    aVar.v();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
            return;
        }
        Class<?> cls = obj.getClass();
        p105t3.m mVar = this.f8106a;
        mVar.getClass();
        p105t3.C cG = mVar.g(p132y3.a.get((Class) cls));
        if (!(cG instanceof C0618k)) {
            cG.b(cVar, obj);
        } else {
            cVar.k();
            cVar.v();
        }
    }

    public final Serializable d(p138z3.a aVar, int i) throws IOException {
        int iD = AbstractC0916i.d(i);
        if (iD == 5) {
            return aVar.d0();
        }
        if (iD == 6) {
            return this.f8107b.a(aVar);
        }
        if (iD == 7) {
            return Boolean.valueOf(aVar.T());
        }
        if (iD != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(p138z3.b.b(i)));
        }
        aVar.b0();
        return null;
    }
}
