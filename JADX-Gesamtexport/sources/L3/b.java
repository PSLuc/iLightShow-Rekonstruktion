package L3;

import E3.g;
import E4.k;
import K.y;
import M3.f;
import M3.h;
import M4.s;
import android.net.nsd.NsdManager;
import android.os.Handler;
import android.os.Looper;
import com.nanjoran.ilightshow.Services.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import p089q4.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends TimerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3088h;
    public final /* synthetic */ J3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J3.a f3089j;

    public /* synthetic */ b(J3.a aVar, J3.b bVar, int i) {
        this.f3088h = i;
        this.f3089j = aVar;
        this.i = bVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        List list;
        switch (this.f3088h) {
            case 0:
                c cVar = (c) this.f3089j;
                ArrayList arrayList = cVar.f3091b;
                ArrayList arrayList2 = new ArrayList(n.P(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    D3.c cVar2 = (D3.c) obj;
                    d dVar = new d();
                    dVar.a(cVar2);
                    dVar.id = String.valueOf(cVar2.f799a);
                    dVar.name = cVar2.f800b;
                    dVar.ip = cVar2.i();
                    dVar.type = K3.d.f2133j;
                    arrayList2.add(dVar);
                }
                new Handler(Looper.getMainLooper()).post(new a(cVar, arrayList2, this.i, 0));
                break;
            default:
                ArrayList arrayList3 = new ArrayList();
                y yVar = (y) this.f3089j;
                Iterator it = ((ArrayList) yVar.f2030a).iterator();
                k.e("iterator(...)", it);
                while (it.hasNext()) {
                    Object next = it.next();
                    k.e("next(...)", next);
                    M3.d dVar2 = (M3.d) next;
                    M3.c cVar3 = new M3.c();
                    String str = dVar2.f3493a;
                    cVar3.id = str;
                    String str2 = dVar2.f3495c;
                    cVar3.name = str2;
                    int i3 = dVar2.f3496d;
                    cVar3.port = Integer.valueOf(i3);
                    String str3 = dVar2.f3494b;
                    cVar3.ip = str3;
                    String str4 = dVar2.f3497e;
                    if (str4 != null && ((list = g.f1027h) == null || !list.isEmpty())) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                cVar3.type = K3.d.f2134k;
                                h hVar = new h();
                                hVar.f799a = str;
                                hVar.f3511l = str3;
                                hVar.f800b = str2;
                                hVar.f3512m = Integer.valueOf(i3);
                                hVar.f3515p = K3.b.f2130k;
                                cVar3.f3491a = hVar;
                            }
                            if (s.W(str4, (String) it2.next(), false)) {
                                cVar3.type = K3.d.f2135l;
                                cVar3.customInfo.put("model", str4);
                                f fVar = new f();
                                fVar.f799a = str;
                                fVar.f3500l = str3;
                                fVar.f3501m = Integer.valueOf(i3);
                                fVar.f3504p = K3.b.f2130k;
                                cVar3.f3492b = fVar;
                            }
                        }
                    } else {
                        cVar3.type = K3.d.f2134k;
                        h hVar2 = new h();
                        hVar2.f799a = str;
                        hVar2.f3511l = str3;
                        hVar2.f800b = str2;
                        hVar2.f3512m = Integer.valueOf(i3);
                        hVar2.f3515p = K3.b.f2130k;
                        cVar3.f3491a = hVar2;
                    }
                    arrayList3.add(cVar3);
                    break;
                }
                this.i.invoke(arrayList3);
                M3.b bVar = (M3.b) yVar.f2034e;
                if (bVar != null) {
                    try {
                        NsdManager nsdManager = (NsdManager) yVar.f2033d;
                        if (nsdManager != null) {
                            nsdManager.stopServiceDiscovery(bVar);
                        }
                    } catch (Exception e6) {
                        e6.toString();
                    }
                    yVar.f2034e = null;
                }
                if (yVar.f2031b) {
                    yVar.f2031b = false;
                    S.f8362c.a();
                    break;
                }
                break;
        }
    }
}
