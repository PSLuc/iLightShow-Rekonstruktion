package p126x2;

import D4.a;
import E4.k;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class l extends E4.l implements a {
    public static final l i = new l(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f14083j = new l(0, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f14084k = new l(0, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f14085l = new l(0, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14086h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i3, int i6) {
        super(i3);
        this.f14086h = i6;
    }

    @Override // D4.a
    public final Object invoke() throws IllegalAccessException, InstantiationException {
        switch (this.f14086h) {
            case 0:
                return new r();
            case 1:
                try {
                    Object objNewInstance = Class.forName("com.github.kittinunf.fuel.android.util.AndroidEnvironment").newInstance();
                    if (objNewInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.github.kittinunf.fuel.core.Environment");
                    }
                    return e.f14073h;
                } catch (ClassNotFoundException unused) {
                }
                break;
            case 2:
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(q.f14092h);
                k.e("Executors.newCachedThrea…e\n            }\n        }", executorServiceNewCachedThreadPool);
                return executorServiceNewCachedThreadPool;
            default:
                HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
                k.e("HttpsURLConnection.getDefaultHostnameVerifier()", defaultHostnameVerifier);
                return defaultHostnameVerifier;
        }
    }
}
