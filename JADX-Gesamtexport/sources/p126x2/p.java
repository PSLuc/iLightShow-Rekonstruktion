package p126x2;

import D2.b;
import D4.a;
import E4.k;
import E4.l;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class p extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14091h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i) {
        super(0);
        this.f14091h = i;
        this.i = rVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f14091h) {
            case 0:
                r rVar = this.i;
                rVar.getClass();
                g gVar = rVar.f14100e;
                k.f("hook", gVar);
                b bVar = new b();
                bVar.f760a = gVar;
                return bVar;
            default:
                this.i.getClass();
                SSLSocketFactory defaultSSLSocketFactory = HttpsURLConnection.getDefaultSSLSocketFactory();
                k.e("keystore?.let {\n        …DefaultSSLSocketFactory()", defaultSSLSocketFactory);
                return defaultSSLSocketFactory;
        }
    }
}
