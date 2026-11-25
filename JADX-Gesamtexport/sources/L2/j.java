package L2;

import B.C0031p0;
import D.x;
import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p119w1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3068a;

    public j(Context context, int i) {
        switch (i) {
            case 2:
                this.f3068a = context.getApplicationContext();
                break;
            default:
                this.f3068a = context;
                break;
        }
    }

    @Override // p119w1.g
    public void a(p131y1.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new p119w1.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new L3.a(this, fVar, threadPoolExecutor, 3));
    }

    public k b() {
        Context context = this.f3068a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.f3069h = N2.a.a(m.f3076a);
        N2.c cVar = new N2.c(context);
        kVar.i = cVar;
        kVar.f3070j = N2.a.a(new x(cVar, 11, new M2.e(cVar, 0)));
        N2.c cVar2 = kVar.i;
        kVar.f3071k = new M2.e(cVar2, 2);
        p079o4.a aVarA = N2.a.a(new x(kVar.f3071k, 17, N2.a.a(new M2.e(cVar2, 1))));
        kVar.f3072l = aVarA;
        W2.g gVar = new W2.g(12);
        N2.c cVar3 = kVar.i;
        C0031p0 c0031p0 = new C0031p0(cVar3, aVarA, gVar, 17);
        p079o4.a aVar = kVar.f3069h;
        p079o4.a aVar2 = kVar.f3070j;
        G0.p pVar = new G0.p(aVar, aVar2, c0031p0, aVarA, aVarA);
        K2.k kVar2 = new K2.k();
        kVar2.f2102h = cVar3;
        kVar2.i = aVar2;
        kVar2.f2103j = aVarA;
        kVar2.f2104k = c0031p0;
        kVar2.f2105l = aVar;
        kVar2.f2106m = aVarA;
        kVar2.f2107n = aVarA;
        H1.d dVar = new H1.d();
        dVar.i = aVar;
        dVar.f1757h = aVarA;
        dVar.f1758j = c0031p0;
        dVar.f1759k = aVarA;
        kVar.f3073m = N2.a.a(new C0031p0(pVar, kVar2, dVar, 11));
        return kVar;
    }
}
