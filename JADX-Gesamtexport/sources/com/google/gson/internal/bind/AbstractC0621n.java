package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.gson.internal.bind.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0621n extends p105t3.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0623p f8117a;

    public AbstractC0621n(C0623p c0623p) {
        this.f8117a = c0623p;
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        Object objC = c();
        Map map = this.f8117a.f8120a;
        try {
            aVar.c();
            while (aVar.L()) {
                C0620m c0620m = (C0620m) map.get(aVar.Z());
                if (c0620m == null) {
                    aVar.m0();
                } else {
                    e(objC, aVar, c0620m);
                }
            }
            aVar.v();
            return d(objC);
        } catch (IllegalAccessException e6) {
            p027e3.a aVar2 = p127x3.c.f14144a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalStateException e7) {
            throw new JsonSyntaxException(e7);
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.G();
            return;
        }
        cVar.k();
        try {
            Iterator it = this.f8117a.f8121b.iterator();
            while (it.hasNext()) {
                ((C0620m) it.next()).a(cVar, obj);
            }
            cVar.v();
        } catch (IllegalAccessException e6) {
            p027e3.a aVar = p127x3.c.f14144a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, p138z3.a aVar, C0620m c0620m);
}
