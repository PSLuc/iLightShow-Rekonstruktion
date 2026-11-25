package p126x2;

import D4.c;
import D4.e;
import E4.k;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p090r.v;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f14120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f14121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f14124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f14126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f14127h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SSLSocketFactory f14128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HostnameVerifier f14129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f14130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Executor f14131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f14132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f14133o;

    public x(d dVar, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ExecutorService executorService, Executor executor, c cVar, e eVar) {
        k.f("client", dVar);
        k.f("executorService", executorService);
        k.f("callbackExecutor", executor);
        k.f("requestTransformer", cVar);
        k.f("responseTransformer", eVar);
        this.i = dVar;
        this.f14128j = sSLSocketFactory;
        this.f14129k = hostnameVerifier;
        this.f14130l = executorService;
        this.f14131m = executor;
        this.f14132n = cVar;
        this.f14133o = eVar;
        this.f14120a = new v();
        this.f14121b = new v();
        this.f14122c = 15000;
        this.f14123d = 15000;
        this.f14125f = new ArrayList();
        this.f14126g = n.f14088j;
        this.f14127h = new v(14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k.a(this.i, xVar.i) && k.a(this.f14128j, xVar.f14128j) && k.a(this.f14129k, xVar.f14129k) && k.a(this.f14130l, xVar.f14130l) && k.a(this.f14131m, xVar.f14131m) && k.a(this.f14132n, xVar.f14132n) && k.a(this.f14133o, xVar.f14133o);
    }

    public final int hashCode() {
        d dVar = this.i;
        int iHashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        SSLSocketFactory sSLSocketFactory = this.f14128j;
        int iHashCode2 = (iHashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f14129k;
        int iHashCode3 = (iHashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        ExecutorService executorService = this.f14130l;
        int iHashCode4 = (iHashCode3 + (executorService != null ? executorService.hashCode() : 0)) * 31;
        Executor executor = this.f14131m;
        int iHashCode5 = (iHashCode4 + (executor != null ? executor.hashCode() : 0)) * 31;
        c cVar = this.f14132n;
        int iHashCode6 = (iHashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        e eVar = this.f14133o;
        return iHashCode6 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "RequestExecutionOptions(client=" + this.i + ", socketFactory=" + this.f14128j + ", hostnameVerifier=" + this.f14129k + ", executorService=" + this.f14130l + ", callbackExecutor=" + this.f14131m + ", requestTransformer=" + this.f14132n + ", responseTransformer=" + this.f14133o + ")";
    }
}
