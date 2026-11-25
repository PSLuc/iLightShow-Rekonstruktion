package p005a4;

import W2.g;
import X3.h;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p043h4.f;
import p047i4.a;
import u5.c;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AtomicInteger implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R3.c f6227h;
    public final X[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f6228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f6229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f6230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f6231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object[] f6232n;

    public W(R3.c cVar, g gVar, int i, int i3) {
        this.f6227h = cVar;
        this.f6228j = gVar;
        X[] xArr = new X[i];
        for (int i6 = 0; i6 < i; i6++) {
            xArr[i6] = new X(this, i3);
        }
        this.f6232n = new Object[i];
        this.i = xArr;
        this.f6229k = new AtomicLong();
        this.f6230l = new a();
    }

    public final void a() {
        for (X x6 : this.i) {
            x6.getClass();
            f.a(x6);
        }
    }

    public final void b() {
        int i;
        long j4;
        if (getAndIncrement() != 0) {
            return;
        }
        R3.c cVar = this.f6227h;
        X[] xArr = this.i;
        int length = xArr.length;
        Object[] objArr = this.f6232n;
        int iAddAndGet = 1;
        do {
            long j6 = this.f6229k.get();
            long j7 = 0;
            while (true) {
                if (j6 == j7) {
                    j4 = 0;
                    break;
                }
                if (this.f6231m) {
                    return;
                }
                if (this.f6230l.get() != null) {
                    a();
                    cVar.onError(this.f6230l.b());
                    return;
                }
                boolean z5 = false;
                for (int i3 = 0; i3 < length; i3++) {
                    X x6 = xArr[i3];
                    if (objArr[i3] == null) {
                        try {
                            boolean z6 = x6.f6237m;
                            h hVar = x6.f6235k;
                            Object objPoll = hVar != null ? hVar.poll() : null;
                            boolean z7 = objPoll == null;
                            if (z6 && z7) {
                                a();
                                if (((Throwable) this.f6230l.get()) != null) {
                                    cVar.onError(this.f6230l.b());
                                    return;
                                } else {
                                    cVar.b();
                                    return;
                                }
                            }
                            if (z7) {
                                z5 = true;
                            } else {
                                objArr[i3] = objPoll;
                            }
                        } catch (Throwable th) {
                            p027e3.a.w0(th);
                            this.f6230l.a(th);
                            a();
                            cVar.onError(this.f6230l.b());
                            return;
                        }
                    }
                }
                j4 = 0;
                if (z5) {
                    break;
                }
                try {
                    cVar.c(this.f6228j.apply(objArr.clone()));
                    j7++;
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th2) {
                    p027e3.a.w0(th2);
                    a();
                    this.f6230l.a(th2);
                    cVar.onError(this.f6230l.b());
                    return;
                }
            }
            if (j6 == j7) {
                if (this.f6231m) {
                    return;
                }
                if (this.f6230l.get() != null) {
                    a();
                    cVar.onError(this.f6230l.b());
                    return;
                }
                for (int i6 = 0; i6 < length; i6++) {
                    X x7 = xArr[i6];
                    if (objArr[i6] == null) {
                        try {
                            boolean z8 = x7.f6237m;
                            h hVar2 = x7.f6235k;
                            Object objPoll2 = hVar2 != null ? hVar2.poll() : null;
                            boolean z9 = objPoll2 == null;
                            if (z8 && z9) {
                                a();
                                if (((Throwable) this.f6230l.get()) != null) {
                                    cVar.onError(this.f6230l.b());
                                    return;
                                } else {
                                    cVar.b();
                                    return;
                                }
                            }
                            if (!z9) {
                                objArr[i6] = objPoll2;
                            }
                        } catch (Throwable th3) {
                            p027e3.a.w0(th3);
                            this.f6230l.a(th3);
                            a();
                            cVar.onError(this.f6230l.b());
                            return;
                        }
                    }
                }
            }
            if (j7 != j4) {
                for (X x8 : xArr) {
                    x8.e(j7);
                }
                if (j6 != Long.MAX_VALUE) {
                    this.f6229k.addAndGet(-j7);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // u5.c
    public final void cancel() {
        if (this.f6231m) {
            return;
        }
        this.f6231m = true;
        a();
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4)) {
            p027e3.a.O(this.f6229k, j4);
            b();
        }
    }
}
