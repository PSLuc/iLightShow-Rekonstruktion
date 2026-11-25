package p034f4;

import S3.a;
import S3.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AtomicReferenceArray implements Runnable, Callable, b {
    public static final Object i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f8985j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f8986k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f8987l = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f8988h;

    public q(Runnable runnable, a aVar) {
        super(3);
        this.f8988h = runnable;
        lazySet(0, aVar);
    }

    @Override // S3.b
    public final void a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f8987l;
            if (obj6 == obj || obj6 == (obj4 = f8985j) || obj6 == (obj5 = f8986k)) {
                break;
            }
            boolean z5 = get(2) != Thread.currentThread();
            if (z5) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z5);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = i) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((a) obj2).c(this);
    }

    public final void b(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f8987l) {
                return;
            }
            if (obj == f8985j) {
                future.cancel(false);
                return;
            } else if (obj == f8986k) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f8986k;
        Object obj3 = f8985j;
        Object obj4 = i;
        Object obj5 = f8987l;
        lazySet(2, Thread.currentThread());
        try {
            this.f8988h.run();
        } catch (Throwable th) {
            try {
                G4.a.A(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((a) obj6).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((a) obj7).c(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
