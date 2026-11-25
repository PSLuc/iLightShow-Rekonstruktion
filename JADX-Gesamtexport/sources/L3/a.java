package L3;

import E4.k;
import L2.h;
import L2.i;
import L2.j;
import M2.g;
import N.C0217h0;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import com.nanjoran.ilightshow.Model.Data.AuthRequestKt;
import com.nanjoran.ilightshow.Services.C0;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p119w1.n;
import p119w1.o;
import p126x2.z;
import p131y1.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3085h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3087k;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f3085h = i;
        this.i = obj;
        this.f3086j = obj2;
        this.f3087k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3085h) {
            case 0:
                k.f("this$0", (c) this.i);
                ArrayList arrayList = (ArrayList) this.f3086j;
                J3.b bVar = (J3.b) this.f3087k;
                arrayList.toString();
                bVar.invoke(arrayList);
                return;
            case 1:
                i iVar = (i) this.f3086j;
                String str = iVar.f3065a;
                h hVar = (h) this.f3087k;
                Q2.b bVar2 = (Q2.b) this.i;
                bVar2.getClass();
                Logger logger = Q2.b.f4694f;
                try {
                    g gVarA = bVar2.f4697c.a(str);
                    if (gVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((S2.h) bVar2.f4699e).v(new Q2.a(bVar2, iVar, ((J2.d) gVarA).a(hVar), 0));
                    }
                    return;
                } catch (Exception e6) {
                    logger.warning("Error scheduling event " + e6.getMessage());
                    return;
                }
            case 2:
                C0 c6 = (C0) this.i;
                k.f("this$0", c6);
                z zVar = (z) this.f3086j;
                k.f("$response", zVar);
                Boolean bool = Boolean.FALSE;
                c6.f8245h.setValue(bool);
                boolean zIsSpotifyInvalidGrant = AuthRequestKt.isSpotifyInvalidGrant(zVar.f14135b, new String(zVar.f14139f.e(), M4.a.f3520a));
                C0217h0 c0217h0 = c6.f8243f;
                C0217h0 c0217h1 = c6.f8242e;
                if (zIsSpotifyInvalidGrant) {
                    c6.f8239b = null;
                    c0217h1.setValue(null);
                    c6.f8241d = null;
                    c6.f8240c = 0L;
                    c6.c();
                    c0217h0.setValue(Boolean.TRUE);
                    c6.d(true);
                    c6.e();
                    return;
                }
                AuthRequest authRequest = (AuthRequest) this.f3087k;
                if ((authRequest != null ? authRequest.getAccess_token() : null) == null || authRequest.getIls_access_token() == null) {
                    return;
                }
                c6.f8239b = authRequest.getAccess_token();
                c6.f8241d = authRequest.getIls_access_token();
                String refresh_token = authRequest.getRefresh_token();
                if (refresh_token == null) {
                    refresh_token = (String) c0217h1.getValue();
                }
                c0217h1.setValue(refresh_token);
                c6.f8240c = Long.valueOf(new Date().getTime() + ((long) 3300000));
                c0217h0.setValue(bool);
                c6.d(false);
                c6.c();
                return;
            default:
                j jVar = (j) this.i;
                f fVar = (f) this.f3086j;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3087k;
                jVar.getClass();
                try {
                    o oVarA = p129y.k.a(jVar.f3068a);
                    if (oVarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    n nVar = (n) oVarA.f13439a;
                    synchronized (nVar.f13433d) {
                        nVar.f13435f = threadPoolExecutor;
                        break;
                    }
                    oVarA.f13439a.a(new p119w1.j(fVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    fVar.b(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f3085h = i;
        this.i = obj;
        this.f3086j = obj2;
        this.f3087k = obj4;
    }
}
