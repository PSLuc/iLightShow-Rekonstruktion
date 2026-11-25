package p017c4;

import R3.g;
import R3.k;
import S3.b;
import V3.a;
import X3.h;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AtomicInteger implements g, Runnable, X3.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7352h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f7354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f7355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Throwable f7356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f7357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f7358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7360q;

    public c(g gVar, k kVar, int i) {
        this.f7352h = gVar;
        this.i = kVar;
        this.f7353j = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [S3.b, java.lang.Object] */
    @Override // S3.b
    public final void a() {
        if (this.f7358o) {
            return;
        }
        this.f7358o = true;
        this.f7355l.a();
        this.i.a();
        if (getAndIncrement() == 0) {
            this.f7354k.clear();
        }
    }

    @Override // R3.g
    public final void b() {
        if (this.f7357n) {
            return;
        }
        this.f7357n = true;
        if (getAndIncrement() == 0) {
            this.i.c(this);
        }
    }

    @Override // R3.g
    public final void c(Object obj) {
        if (this.f7357n) {
            return;
        }
        if (this.f7359p != 2) {
            this.f7354k.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.i.c(this);
        }
    }

    @Override // X3.h
    public final void clear() {
        this.f7354k.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [R3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [R3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void d(b bVar) {
        if (a.e(this.f7355l, bVar)) {
            this.f7355l = bVar;
            if (bVar instanceof X3.c) {
                X3.c cVar = (X3.c) bVar;
                int i = cVar.i(7);
                if (i == 1) {
                    this.f7359p = i;
                    this.f7354k = cVar;
                    this.f7357n = true;
                    this.f7352h.d(this);
                    if (getAndIncrement() == 0) {
                        this.i.c(this);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    this.f7359p = i;
                    this.f7354k = cVar;
                    this.f7352h.d(this);
                    return;
                }
            }
            this.f7354k = new p028e4.b(this.f7353j);
            this.f7352h.d(this);
        }
    }

    public final boolean e(boolean z5, boolean z6, g gVar) {
        if (this.f7358o) {
            this.f7354k.clear();
            return true;
        }
        if (!z5) {
            return false;
        }
        Throwable th = this.f7356m;
        if (th != null) {
            this.f7354k.clear();
            gVar.onError(th);
            this.i.a();
            return true;
        }
        if (!z6) {
            return false;
        }
        gVar.b();
        this.i.a();
        return true;
    }

    @Override // X3.d
    public final int i(int i) {
        this.f7360q = true;
        return 2;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.f7354k.isEmpty();
    }

    @Override // X3.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // R3.g
    public final void onError(Throwable th) {
        if (this.f7357n) {
            G4.a.A(th);
            return;
        }
        this.f7356m = th;
        this.f7357n = true;
        if (getAndIncrement() == 0) {
            this.i.c(this);
        }
    }

    @Override // X3.h
    public final Object poll() {
        return this.f7354k.poll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [R3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [R3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [R3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [R3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [R3.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [S3.b, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int iAddAndGet = 1;
        if (this.f7360q) {
            while (!this.f7358o) {
                boolean z5 = this.f7357n;
                Throwable th = this.f7356m;
                if (z5 && th != null) {
                    this.f7352h.onError(th);
                    this.i.a();
                    return;
                }
                this.f7352h.c(null);
                if (z5) {
                    Throwable th2 = this.f7356m;
                    if (th2 != null) {
                        this.f7352h.onError(th2);
                    } else {
                        this.f7352h.b();
                    }
                    this.i.a();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        h hVar = this.f7354k;
        ?? r6 = this.f7352h;
        int iAddAndGet2 = 1;
        while (!e(this.f7357n, hVar.isEmpty(), r6)) {
            while (true) {
                boolean z6 = this.f7357n;
                try {
                    Object objPoll = hVar.poll();
                    boolean z7 = objPoll == null;
                    if (e(z6, z7, r6)) {
                        return;
                    }
                    if (z7) {
                        break;
                    } else {
                        r6.c(objPoll);
                    }
                } catch (Throwable th3) {
                    p027e3.a.w0(th3);
                    this.f7355l.a();
                    hVar.clear();
                    r6.onError(th3);
                    this.i.a();
                    return;
                }
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
        }
    }
}
