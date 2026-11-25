package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.gson.internal.bind.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0616i extends p105t3.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0626t f8099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0626t f8100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p116v3.m f8101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapTypeAdapterFactory f8102d;

    public C0616i(MapTypeAdapterFactory mapTypeAdapterFactory, p105t3.m mVar, Type type, p105t3.C c6, Type type2, p105t3.C c7, p116v3.m mVar2) {
        this.f8102d = mapTypeAdapterFactory;
        this.f8099a = new C0626t(mVar, c6, type);
        this.f8100b = new C0626t(mVar, c7, type2);
        this.f8101c = mVar2;
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        int iF0 = aVar.f0();
        if (iF0 == 9) {
            aVar.b0();
            return null;
        }
        Map map = (Map) this.f8101c.l();
        if (iF0 == 1) {
            aVar.b();
            while (aVar.L()) {
                aVar.b();
                Object objA = ((p105t3.C) this.f8099a.f8136c).a(aVar);
                if (map.put(objA, ((p105t3.C) this.f8100b.f8136c).a(aVar)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + objA);
                }
                aVar.s();
            }
            aVar.s();
            return map;
        }
        aVar.c();
        while (aVar.L()) {
            p085q.b.f11188j.getClass();
            if (aVar instanceof C0613f) {
                C0613f c0613f = (C0613f) aVar;
                c0613f.p0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) c0613f.t0()).next();
                c0613f.v0(entry.getValue());
                c0613f.v0(new p105t3.u((String) entry.getKey()));
            } else {
                int iO = aVar.f14636n;
                if (iO == 0) {
                    iO = aVar.o();
                }
                if (iO == 13) {
                    aVar.f14636n = 9;
                } else if (iO == 12) {
                    aVar.f14636n = 8;
                } else {
                    if (iO != 14) {
                        throw aVar.o0("a name");
                    }
                    aVar.f14636n = 10;
                }
            }
            Object objA2 = ((p105t3.C) this.f8099a.f8136c).a(aVar);
            if (map.put(objA2, ((p105t3.C) this.f8100b.f8136c).a(aVar)) != null) {
                throw new JsonSyntaxException("duplicate key: " + objA2);
            }
        }
        aVar.v();
        return map;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            cVar.G();
            return;
        }
        this.f8102d.getClass();
        C0626t c0626t = this.f8100b;
        cVar.k();
        for (Map.Entry entry : map.entrySet()) {
            cVar.C(String.valueOf(entry.getKey()));
            c0626t.b(cVar, entry.getValue());
        }
        cVar.v();
    }
}
