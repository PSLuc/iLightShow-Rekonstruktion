package p005a4;

import R3.c;
import X3.e;
import X3.h;
import java.util.concurrent.atomic.AtomicReference;
import p028e4.a;
import p043h4.f;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AtomicReference implements c, u5.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final W f6233h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f6235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f6237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6238n;

    public X(W w6, int i) {
        this.f6233h = w6;
        this.i = i;
        this.f6234j = i - (i >> 2);
    }

    @Override // u5.b
    public final void b() {
        this.f6237m = true;
        this.f6233h.b();
    }

    @Override // u5.b
    public final void c(Object obj) {
        if (this.f6238n != 2) {
            this.f6235k.offer(obj);
        }
        this.f6233h.b();
    }

    @Override // u5.c
    public final void cancel() {
        f.a(this);
    }

    @Override // u5.c
    public final void e(long j4) {
        if (this.f6238n != 1) {
            long j6 = this.f6236l + j4;
            if (j6 < this.f6234j) {
                this.f6236l = j6;
            } else {
                this.f6236l = 0L;
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
                    this.f6238n = i;
                    this.f6235k = eVar;
                    this.f6237m = true;
                    this.f6233h.b();
                    return;
                }
                if (i == 2) {
                    this.f6238n = i;
                    this.f6235k = eVar;
                    cVar.e(this.i);
                    return;
                }
            }
            this.f6235k = new a(this.i);
            cVar.e(this.i);
        }
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        W w6 = this.f6233h;
        if (!w6.f6230l.a(th)) {
            G4.a.A(th);
        } else {
            this.f6237m = true;
            w6.b();
        }
    }
}
