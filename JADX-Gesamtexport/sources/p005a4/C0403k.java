package p005a4;

import R3.c;
import S3.b;
import X3.e;
import X3.h;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;
import p028e4.a;
import p043h4.f;

/* JADX INFO: renamed from: a4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0403k extends AtomicReference implements c, b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6258h;
    public final C0404l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f6261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile h f6262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6264o;

    public C0403k(C0404l c0404l, long j4) {
        this.f6258h = j4;
        this.i = c0404l;
        int i = c0404l.f6269k;
        this.f6260k = i;
        this.f6259j = i >> 2;
    }

    @Override // S3.b
    public final void a() {
        f.a(this);
    }

    @Override // u5.b
    public final void b() {
        this.f6261l = true;
        this.i.d();
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (this.f6264o == 2) {
            this.i.d();
            return;
        }
        C0404l c0404l = this.i;
        if (c0404l.get() == 0 && c0404l.compareAndSet(0, 1)) {
            long j4 = c0404l.f6275q.get();
            h aVar = this.f6262m;
            if (j4 == 0 || !(aVar == null || aVar.isEmpty())) {
                if (aVar == null && (aVar = this.f6262m) == null) {
                    aVar = new a(c0404l.f6269k);
                    this.f6262m = aVar;
                }
                if (!aVar.offer(obj)) {
                    c0404l.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                }
            } else {
                c0404l.f6267h.c(obj);
                if (j4 != Long.MAX_VALUE) {
                    c0404l.f6275q.decrementAndGet();
                }
                d(1L);
            }
            if (c0404l.decrementAndGet() == 0) {
                return;
            }
        } else {
            h aVar2 = this.f6262m;
            if (aVar2 == null) {
                aVar2 = new a(c0404l.f6269k);
                this.f6262m = aVar2;
            }
            if (!aVar2.offer(obj)) {
                c0404l.onError(new MissingBackpressureException("Inner queue full?!"));
                return;
            } else if (c0404l.getAndIncrement() != 0) {
                return;
            }
        }
        c0404l.f();
    }

    public final void d(long j4) {
        if (this.f6264o != 1) {
            long j6 = this.f6263n + j4;
            if (j6 < this.f6259j) {
                this.f6263n = j6;
            } else {
                this.f6263n = 0L;
                ((u5.c) get()).e(j6);
            }
        }
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        if (f.d(this, cVar)) {
            if (cVar instanceof e) {
                e eVar = (e) cVar;
                int i = eVar.i(7);
                if (i == 1) {
                    this.f6264o = i;
                    this.f6262m = eVar;
                    this.f6261l = true;
                    this.i.d();
                    return;
                }
                if (i == 2) {
                    this.f6264o = i;
                    this.f6262m = eVar;
                }
            }
            cVar.e(this.f6260k);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        lazySet(f.f9307h);
        C0404l c0404l = this.i;
        if (!c0404l.f6272n.a(th)) {
            G4.a.A(th);
            return;
        }
        this.f6261l = true;
        c0404l.f6276r.cancel();
        for (C0403k c0403k : (C0403k[]) c0404l.f6274p.getAndSet(C0404l.f6266y)) {
            c0403k.getClass();
            f.a(c0403k);
        }
        c0404l.d();
    }
}
