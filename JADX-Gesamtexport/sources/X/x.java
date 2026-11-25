package X;

import B.C0003b0;
import B.C0031p0;
import N.C0208d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.l f5741a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5743c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J2.b f5747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f5748h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f5742b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0003b0 f5744d = new C0003b0(15, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A2.e f5745e = new A2.e(22, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P.d f5746f = new P.d(new w[16]);
    public long i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public x(D4.c cVar) {
        this.f5741a = (E4.l) cVar;
    }

    public static final boolean a(x xVar) {
        boolean z5;
        Set set;
        synchronized (xVar.f5746f) {
            z5 = xVar.f5743c;
        }
        if (z5) {
            return false;
        }
        boolean z6 = false;
        while (true) {
            AtomicReference atomicReference = xVar.f5742b;
            Object obj = atomicReference.get();
            Set set2 = null;
            objSubList = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0208d.x("Unexpected notification");
                        throw null;
                    }
                    List list = (List) obj;
                    set = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                }
                Object obj2 = objSubList;
                while (true) {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set2 = set;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set2 == null) {
                return z6;
            }
            synchronized (xVar.f5746f) {
                P.d dVar = xVar.f5746f;
                int i = dVar.f4583j;
                if (i > 0) {
                    Object[] objArr = dVar.f4582h;
                    int i3 = 0;
                    do {
                        z6 = ((w) objArr[i3]).b(set2) || z6;
                        i3++;
                    } while (i3 < i);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f5746f) {
            P.d dVar = this.f5746f;
            int i = dVar.f4583j;
            if (i > 0) {
                Object[] objArr = dVar.f4582h;
                int i3 = 0;
                do {
                    w wVar = (w) objArr[i3];
                    ((p080p.x) wVar.f5734e.i).a();
                    wVar.f5735f.a();
                    ((p080p.x) wVar.f5739k.i).a();
                    wVar.f5740l.clear();
                    i3++;
                } while (i3 < i);
            }
        }
    }

    public final void c(Object obj, D4.c cVar, D4.a aVar) {
        Object obj2;
        w wVar;
        synchronized (this.f5746f) {
            P.d dVar = this.f5746f;
            int i = dVar.f4583j;
            if (i <= 0) {
                obj2 = null;
                break;
            }
            Object[] objArr = dVar.f4582h;
            int i3 = 0;
            while (true) {
                obj2 = objArr[i3];
                if (((w) obj2).f5730a == cVar) {
                    break;
                }
                i3++;
                if (i3 >= i) {
                    obj2 = null;
                    break;
                }
            }
            wVar = (w) obj2;
            if (wVar == null) {
                E4.k.d("null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>", cVar);
                E4.z.d(1, cVar);
                wVar = new w(cVar);
                dVar.c(wVar);
            }
        }
        w wVar2 = this.f5748h;
        long j4 = this.i;
        if (j4 == -1 || j4 == C0208d.z()) {
            try {
                this.f5748h = wVar;
                this.i = C0208d.z();
                wVar.a(obj, this.f5745e, aVar);
                return;
            } finally {
                this.f5748h = wVar2;
                this.i = j4;
            }
        }
        C0208d.S("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j4 + "), currentThread={id=" + C0208d.z() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        C0003b0 c0003b0 = this.f5744d;
        C0031p0 c0031p0 = o.f5708a;
        o.f(n.f5706j);
        synchronized (o.f5709b) {
            o.f5714g = p089q4.l.k0(o.f5714g, c0003b0);
        }
        this.f5747g = new J2.b(c0003b0);
    }
}
