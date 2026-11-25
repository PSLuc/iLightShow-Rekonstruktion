package p126x2;

import A0.b;
import A2.c;
import A2.f;
import D.x;
import D4.a;
import E4.k;
import E4.n;
import K4.e;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p089q4.l;
import p089q4.m;
import p089q4.u;
import p089q4.v;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ e[] f14093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x f14094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m f14095p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f14096a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f14101f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f14106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f14107m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14097b = 15000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14098c = 15000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14099d = 8192;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f14100e = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f14102g = u.f11237h;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f14103h = new x((a) new p(this, 1));
    public final x i = new x((a) l.f14085l);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f14104j = new x((a) l.f14084k);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f14105k = m.N(c.f19h);

    static {
        n nVar = new n(r.class, "client", "getClient()Lcom/github/kittinunf/fuel/core/Client;", 0);
        E4.x.f1075a.getClass();
        f14093n = new e[]{nVar, new n(r.class, "socketFactory", "getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;", 0), new n(r.class, "hostnameVerifier", "getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;", 0), new n(r.class, "executorService", "getExecutorService()Ljava/util/concurrent/ExecutorService;", 0), new n(r.class, "callbackExecutor", "getCallbackExecutor()Ljava/util/concurrent/Executor;", 0)};
        f14095p = new m();
        f14094o = new x((a) l.i);
    }

    public r() {
        int i = 0;
        this.f14096a = new x((a) new p(this, i));
        List list = f.f23a;
        this.f14106l = m.N(new A2.e(i, this));
        this.f14107m = new x((a) l.f14083j);
    }

    public final w a(w wVar) {
        Set setKeySet = wVar.l().keySet();
        Map map = t.i;
        Map map2 = this.f14101f;
        if (map2 == null) {
            map2 = v.f11238h;
        }
        t tVarW = AbstractC0599v0.w(map2);
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            tVarW.remove((String) it.next());
        }
        w wVarO = wVar.o(tVarW);
        e[] eVarArr = f14093n;
        d dVar = (d) this.f14096a.n(eVarArr[0], this);
        SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) this.f14103h.n(eVarArr[1], this);
        HostnameVerifier hostnameVerifier = (HostnameVerifier) this.i.n(eVarArr[2], this);
        Executor executor = (Executor) this.f14107m.n(eVarArr[4], this);
        ArrayList arrayList = this.f14105k;
        D4.c cVar = n.i;
        if (!arrayList.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                cVar = (D4.c) ((D4.c) listIterator.previous()).invoke(cVar);
            }
        }
        D4.c cVar2 = cVar;
        ArrayList arrayList2 = this.f14106l;
        D4.e eVar = o.f14090h;
        if (!arrayList2.isEmpty()) {
            ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
            while (listIterator2.hasPrevious()) {
                eVar = (D4.e) ((D4.c) listIterator2.previous()).invoke(eVar);
            }
        }
        x xVar = new x(dVar, sSLSocketFactory, hostnameVerifier, (ExecutorService) this.f14104j.n(eVarArr[3], this), executor, cVar2, eVar);
        xVar.f14122c = this.f14097b;
        xVar.f14123d = this.f14098c;
        wVarO.b(xVar);
        return wVarO;
    }

    public final w b(u uVar, String str, List list) {
        k.f("path", str);
        List listJ0 = this.f14102g;
        if (list != null) {
            listJ0 = l.j0(listJ0, list);
        }
        w wVarU = new b(uVar, str, listJ0).u();
        k.f("convertible", wVarU);
        return a(a(wVarU.u()));
    }
}
