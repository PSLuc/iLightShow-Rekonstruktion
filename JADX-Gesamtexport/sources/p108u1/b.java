package p108u1;

import B.C0024m;
import D4.c;
import E4.k;
import K4.e;
import P4.InterfaceC0335w;
import android.content.Context;
import com.fasterxml.jackson.databind.deser.std.d0;
import h5.r;
import java.util.List;
import p058l0.I;
import p092r1.C0882c;
import p092r1.J;
import p103t1.f;
import p114v1.d;
import q5.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0335w f12650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12651d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile d f12652e;

    public b(String str, c cVar, InterfaceC0335w interfaceC0335w) {
        this.f12648a = str;
        this.f12649b = cVar;
        this.f12650c = interfaceC0335w;
    }

    public final Object a(e eVar, Object obj) {
        d dVar;
        Context context = (Context) obj;
        k.f("property", eVar);
        d dVar2 = this.f12652e;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f12651d) {
            try {
                if (this.f12652e == null) {
                    Context applicationContext = context.getApplicationContext();
                    c cVar = this.f12649b;
                    k.e("applicationContext", applicationContext);
                    List list = (List) cVar.invoke(applicationContext);
                    InterfaceC0335w interfaceC0335w = this.f12650c;
                    C0024m c0024m = new C0024m(applicationContext, 12, this);
                    k.f("migrations", list);
                    this.f12652e = new d(new d(new J(new f(r.f9368a, new I(10, c0024m)), d0.v(new C0882c(list, null)), new n(2), interfaceC0335w)));
                }
                dVar = this.f12652e;
                k.c(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
