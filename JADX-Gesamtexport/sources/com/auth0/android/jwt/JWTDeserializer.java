package com.auth0.android.jwt;

import W2.g;
import Z2.f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p105t3.o;
import p105t3.p;
import p105t3.q;
import p105t3.r;
import p105t3.s;
import p105t3.t;
import p116v3.i;
import p116v3.j;
import p116v3.k;
import p116v3.l;

/* JADX INFO: loaded from: classes.dex */
class JWTDeserializer implements q {
    public static void a(t tVar, String str) {
        l lVar = tVar.f12592h;
        if (lVar.containsKey(str)) {
            new Date(((r) lVar.get(str)).j() * 1000);
        }
    }

    @Override // p105t3.q
    public final Object deserialize(r rVar, Type type, p pVar) {
        rVar.getClass();
        if ((rVar instanceof s) || !(rVar instanceof t)) {
            throw new DecodeException("The token's payload had an invalid JSON format.");
        }
        t tVarG = rVar.g();
        l lVar = tVarG.f12592h;
        if (lVar.containsKey("iss")) {
            ((r) lVar.get("iss")).k();
        }
        if (lVar.containsKey("sub")) {
            ((r) lVar.get("sub")).k();
        }
        a(tVarG, "exp");
        a(tVarG, "nbf");
        a(tVarG, "iat");
        if (lVar.containsKey("jti")) {
            ((r) lVar.get("jti")).k();
        }
        List list = Collections.EMPTY_LIST;
        if (lVar.containsKey("aud")) {
            r rVar2 = (r) lVar.get("aud");
            rVar2.getClass();
            if (rVar2 instanceof o) {
                ArrayList arrayList = rVar2.d().f12590h;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList2.add(((r) arrayList.get(i)).k());
                }
            } else {
                Collections.singletonList(rVar2.k());
            }
        }
        HashMap map = new HashMap();
        Iterator it = ((j) lVar.entrySet()).iterator();
        while (((i) it).hasNext()) {
            k kVarB = ((i) it).b();
            Object key = kVarB.getKey();
            map.put(key, new f(22, false));
        }
        g gVar = new g(23);
        Collections.unmodifiableMap(map);
        return gVar;
    }
}
