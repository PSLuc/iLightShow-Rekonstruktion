package p005a4;

import R3.c;
import R3.k;
import X3.h;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import p043h4.a;
import p043h4.f;
import u5.b;

/* JADX INFO: renamed from: a4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0412u extends a implements c, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f6321h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f6323k = new AtomicLong();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u5.c f6324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f6325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f6326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f6327o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Throwable f6328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6331s;

    public AbstractRunnableC0412u(k kVar, int i) {
        this.f6321h = kVar;
        this.i = i;
        this.f6322j = i - (i >> 2);
    }

    @Override // u5.b
    public final void b() {
        if (this.f6327o) {
            return;
        }
        this.f6327o = true;
        n();
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (this.f6327o) {
            return;
        }
        if (this.f6329q == 2) {
            n();
            return;
        }
        if (!this.f6325m.offer(obj)) {
            this.f6324l.cancel();
            this.f6328p = new MissingBackpressureException("Queue is full?!");
            this.f6327o = true;
        }
        n();
    }

    @Override // u5.c
    public final void cancel() {
        if (this.f6326n) {
            return;
        }
        this.f6326n = true;
        this.f6324l.cancel();
        this.f6321h.a();
        if (getAndIncrement() == 0) {
            this.f6325m.clear();
        }
    }

    @Override // X3.h
    public final void clear() {
        this.f6325m.clear();
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            p027e3.a.O(this.f6323k, j4);
            n();
        }
    }

    @Override // X3.d
    public final int i(int i) {
        this.f6331s = true;
        return 2;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.f6325m.isEmpty();
    }

    public final boolean j(boolean z5, boolean z6, b bVar) {
        if (this.f6326n) {
            clear();
            return true;
        }
        if (!z5) {
            return false;
        }
        Throwable th = this.f6328p;
        if (th != null) {
            clear();
            bVar.onError(th);
            this.f6321h.a();
            return true;
        }
        if (!z6) {
            return false;
        }
        bVar.b();
        this.f6321h.a();
        return true;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public final void n() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f6321h.c(this);
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        if (this.f6327o) {
            G4.a.A(th);
            return;
        }
        this.f6328p = th;
        this.f6327o = true;
        n();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6331s) {
            l();
        } else if (this.f6329q == 1) {
            m();
        } else {
            k();
        }
    }
}
