package p087q2;

import T1.m;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.concurrent.ConcurrentHashMap;
import p015c2.C;
import p015c2.C0474e;
import p015c2.g;
import p015c2.h;
import p015c2.j;
import p015c2.w;
import p015c2.y;
import p032f2.k;
import p055k2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f11221a;

    static {
        a aVar = new a();
        f11221a = new y(aVar, aVar.f7320j);
        C c6 = aVar.f7320j;
        new y(aVar, c6);
        m mVar = c6.f7199r;
        w wVar = w.i;
        if (mVar == null) {
            mVar = y.f7331n;
        }
        if (wVar != (mVar == null ? wVar : new w(mVar))) {
        }
        h hVarJ = aVar.i.j(JsonNode.class);
        C0474e c0474e = aVar.f7323m;
        k kVar = aVar.f7324n;
        ConcurrentHashMap concurrentHashMap = aVar.f7326p;
        c0474e.getClass();
        c0474e.p(g.UNWRAP_ROOT_VALUE);
        if (hVarJ != null && c0474e.p(g.EAGER_DESERIALIZER_FETCH) && ((j) concurrentHashMap.get(hVarJ)) == null) {
            try {
                kVar.getClass();
                j jVarK0 = new k(kVar, c0474e).k0(hVarJ);
                if (jVarK0 != null) {
                    concurrentHashMap.put(hVarJ, jVarK0);
                }
            } catch (JacksonException unused) {
            }
        }
    }
}
