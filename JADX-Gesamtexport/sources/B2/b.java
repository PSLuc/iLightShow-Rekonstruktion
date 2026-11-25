package B2;

import N3.M0;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p126x2.InterfaceC1118a;
import p126x2.t;
import p126x2.u;
import p126x2.v;
import p126x2.w;
import p126x2.x;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w, Future {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f490e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p084p4.m f491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Future f494d;

    static {
        String canonicalName = b.class.getCanonicalName();
        E4.k.e("CancellableRequest::class.java.canonicalName", canonicalName);
        f490e = canonicalName;
    }

    public b(w wVar, Future future) {
        this.f493c = wVar;
        this.f494d = future;
        G4.a.z(new a(this, 1));
        this.f491a = G4.a.z(new a(this, 0));
        this.f492b = this;
    }

    @Override // p126x2.w
    public final w a(v vVar) {
        E4.k.f("handler", vVar);
        return this.f493c.a(vVar);
    }

    @Override // p126x2.w
    public final void b(x xVar) {
        this.f493c.b(xVar);
    }

    @Override // p126x2.w
    public final w c() {
        return this.f493c.c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return this.f494d.cancel(z5);
    }

    @Override // p126x2.w
    public final w d(String str, String str2) {
        E4.k.f("value", str2);
        return this.f493c.d(str, str2);
    }

    @Override // p126x2.w
    public final void e(URL url) {
        E4.k.f("<set-?>", url);
        this.f493c.e(url);
    }

    @Override // p126x2.w
    public final x f() {
        return this.f493c.f();
    }

    @Override // p126x2.w
    public final b g(M0 m6) {
        return this.f493c.g(m6);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return (z) this.f494d.get();
    }

    @Override // p126x2.w
    public final w h(String str, Charset charset) {
        E4.k.f("body", str);
        E4.k.f("charset", charset);
        return this.f493c.h(str, charset);
    }

    @Override // p126x2.w
    public final b i(p000a.a aVar) {
        return this.f493c.i(aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f494d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f494d.isDone();
    }

    @Override // p126x2.w
    public final InterfaceC1118a j() {
        return this.f493c.j();
    }

    @Override // p126x2.w
    public final w k(v vVar) {
        E4.k.f("handler", vVar);
        return this.f493c.k(vVar);
    }

    @Override // p126x2.w
    public final t l() {
        return this.f493c.l();
    }

    @Override // p126x2.w
    public final b m(defpackage.d dVar) {
        return this.f493c.m(dVar);
    }

    @Override // p126x2.w
    public final void n() {
        this.f493c.n();
    }

    @Override // p126x2.w
    public final w o(t tVar) {
        return this.f493c.o(tVar);
    }

    @Override // p126x2.w
    public final w p(String str, String str2) {
        return this.f493c.p("Content-Type", "application/json");
    }

    @Override // p126x2.w
    public final URL q() {
        return this.f493c.q();
    }

    @Override // p126x2.w
    public final b r(AuthRequest.Deserializer deserializer, D4.f fVar) {
        return this.f493c.r(deserializer, fVar);
    }

    @Override // p126x2.w
    public final w s(p084p4.h... hVarArr) {
        return this.f493c.s(hVarArr);
    }

    @Override // p126x2.w
    public final List t() {
        return this.f493c.t();
    }

    @Override // p126x2.w
    public final String toString() {
        StringBuilder sb = new StringBuilder("Cancellable[\n\r\t");
        sb.append(this.f493c);
        sb.append("\n\r] done=");
        Future future = this.f494d;
        sb.append(future.isDone());
        sb.append(" cancelled=");
        sb.append(future.isCancelled());
        return sb.toString();
    }

    @Override // p126x2.y
    public final w u() {
        return this.f492b;
    }

    @Override // p126x2.w
    public final w v(InterfaceC1118a interfaceC1118a) {
        E4.k.f("body", interfaceC1118a);
        return this.f493c.v(interfaceC1118a);
    }

    @Override // p126x2.w
    public final Map w() {
        return this.f493c.w();
    }

    @Override // p126x2.w
    public final u x() {
        return this.f493c.x();
    }

    @Override // p126x2.w
    public final p084p4.n y() {
        return this.f493c.y();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return (z) this.f494d.get(j4, timeUnit);
    }

    @Override // p126x2.w, java.util.concurrent.Future
    public final Collection get() {
        return this.f493c.get();
    }
}
