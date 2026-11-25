package N3;

import c5.AbstractC0476a0;
import com.nanjoran.ilightshow.Services.C0691q;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class R0 implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4093h;
    public final /* synthetic */ Object i;

    public /* synthetic */ R0(int i, Object obj) {
        this.f4093h = i;
        this.i = obj;
    }

    @Override // D4.a
    public final Object invoke() {
        Object next;
        switch (this.f4093h) {
            case 0:
                F3.a aVar = (F3.a) this.i;
                E4.k.f("$it", aVar);
                H3.f.f1787d.d(MusicServiceType.Sonos);
                com.nanjoran.ilightshow.Services.z0 z0Var = com.nanjoran.ilightshow.Services.z0.f8505f;
                z0Var.f8509c = aVar;
                z0Var.f8510d = aVar.f1405a;
                return p084p4.x.f10867a;
            case 1:
                Y4.c cVar = (Y4.c) this.i;
                a5.h hVarR = S1.V.r("kotlinx.serialization.Polymorphic", a5.c.f6350j, new a5.g[0], new M0(2, cVar));
                K4.b bVar = cVar.f5923a;
                E4.k.f("context", bVar);
                return new a5.b(hVarR, bVar);
            case 2:
                return ((c5.K) ((ArrayList) this.i).get(0)).f7402a.f7402a.b();
            case 3:
                p000a.j jVar = (p000a.j) this.i;
                E4.k.f("this$0", jVar);
                while (!jVar.j()) {
                    try {
                        jVar.b();
                        if (!p000a.j.i(3000L)) {
                            return p084p4.x.f10867a;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                return p084p4.x.f10867a;
            case 4:
                a5.h hVar = (a5.h) this.i;
                return Integer.valueOf(AbstractC0476a0.e(hVar, hVar.f6370k));
            case 5:
                com.nanjoran.ilightshow.Services.E0 e6 = (com.nanjoran.ilightshow.Services.E0) this.i;
                E4.k.f("this$0", e6);
                if (com.nanjoran.ilightshow.Services.E0.d()) {
                    return com.nanjoran.ilightshow.Services.F0.MEMBERSHIP_V3;
                }
                X.v vVar = e6.f8252k;
                ArrayList arrayList = new ArrayList(vVar.size());
                Iterator it = vVar.i.iterator();
                while (((X.A) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((X.A) it).next();
                    C0691q c0691q = com.nanjoran.ilightshow.Services.F0.i;
                    String str = (String) entry.getKey();
                    c0691q.getClass();
                    arrayList.add(C0691q.b(str));
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int i = ((com.nanjoran.ilightshow.Services.F0) next).f8262h;
                        do {
                            Object next2 = it2.next();
                            int i3 = ((com.nanjoran.ilightshow.Services.F0) next2).f8262h;
                            if (i < i3) {
                                next = next2;
                                i = i3;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                com.nanjoran.ilightshow.Services.F0 f6 = (com.nanjoran.ilightshow.Services.F0) next;
                return f6 == null ? com.nanjoran.ilightshow.Services.F0.NONE : f6;
            default:
                v5.k kVar = (v5.k) this.i;
                E4.k.f("this$0", kVar);
                return Integer.valueOf(Long.hashCode(kVar.f13331k));
        }
    }
}
