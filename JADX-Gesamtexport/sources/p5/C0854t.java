package p5;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: p5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0854t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f11140k = LoggerFactory.getLogger((Class<?>) C0854t.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f11141l = LoggerFactory.getLogger(C0854t.class + "owner");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f11142a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0853s f11143b = new C0853s(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f0 f11144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m5.q f11147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetSocketAddress f11148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0855u f11149h;
    public volatile C i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f11150j;

    public C0854t(InetSocketAddress inetSocketAddress, m5.q qVar) {
        if (inetSocketAddress == null) {
            throw new NullPointerException("Peer address must not be null");
        }
        long jNanoTime = System.nanoTime();
        this.f11148g = inetSocketAddress;
        this.f11147f = qVar;
        this.f11146e = jNanoTime;
    }

    public final boolean a(InetSocketAddress inetSocketAddress) {
        InetSocketAddress inetSocketAddress2 = this.f11148g;
        if (inetSocketAddress2 == inetSocketAddress) {
            return true;
        }
        if (inetSocketAddress2 == null) {
            return false;
        }
        return inetSocketAddress2.equals(inetSocketAddress);
    }

    public final Q b() {
        return (Q) this.f11142a.get();
    }

    public final C c(int i) {
        C c6;
        C c7 = this.i;
        if (c7 != null && c7.f10905t == i) {
            return c7;
        }
        Q q6 = (Q) this.f11142a.get();
        if (q6 == null || (c6 = q6.f10995v) == null || c6.f10905t != i) {
            return null;
        }
        return c6;
    }

    public final boolean d() {
        return this.i != null;
    }

    public final boolean e() {
        m5.q qVar = this.f11147f;
        return (qVar == null || qVar.isShutdown()) ? false : true;
    }

    public final void f() {
        m5.q qVar = this.f11147f;
        if (qVar != null) {
        }
    }

    public final void g(InetSocketAddress inetSocketAddress) {
        Q qB;
        if (a(inetSocketAddress)) {
            return;
        }
        if (this.i == null && inetSocketAddress != null) {
            throw new IllegalArgumentException("Address change without established sesson is not supported!");
        }
        System.nanoTime();
        this.f11148g = inetSocketAddress;
        if (this.i != null) {
            this.i.f10894h = inetSocketAddress;
        }
        if (inetSocketAddress != null || (qB = b()) == null) {
            return;
        }
        if (this.i == null || qB.f10995v != this.i) {
            qB.k(new IOException("address changed!"));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("dtls-con: ");
        C0855u c0855u = this.f11149h;
        if (c0855u != null) {
            sb.append(c0855u);
        }
        if (this.f11148g != null) {
            sb.append(", ");
            sb.append(this.f11148g);
            if (b() != null) {
                sb.append(", ongoing handshake ");
                t0 t0Var = b().f10995v.i;
                if (t0Var != null && !t0Var.b()) {
                    sb.append(m5.s.b(6, t0Var.f10440a));
                }
            }
            if (this.f11150j) {
                sb.append(", resumption required");
            } else if (d()) {
                sb.append(", session established ");
                t0 t0Var2 = this.i.i;
                if (t0Var2 != null && !t0Var2.b()) {
                    sb.append(m5.s.b(6, t0Var2.f10440a));
                }
            }
        }
        if (e()) {
            sb.append(", is alive");
        }
        return sb.toString();
    }
}
