package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class E1 implements X {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f7836d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f7837e = Logger.getLogger(E1.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p081p0.c f7838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f7839g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f7840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile U0 f7841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile D1 f7842c;

    static {
        p081p0.c c6;
        try {
            c6 = new r1(AtomicReferenceFieldUpdater.newUpdater(D1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(D1.class, D1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(E1.class, D1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(E1.class, U0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(E1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c6 = new C1();
        }
        Throwable th2 = th;
        f7838f = c6;
        if (th2 != null) {
            f7837e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f7839g = new Object();
    }

    public static void b(E1 e6) {
        D1 d1;
        p081p0.c cVar;
        U0 u0;
        U0 u6;
        U0 u7;
        do {
            d1 = e6.f7842c;
            cVar = f7838f;
        } while (!cVar.O0(e6, d1, D1.f7819c));
        while (true) {
            u0 = null;
            if (d1 == null) {
                break;
            }
            Thread thread = d1.f7820a;
            if (thread != null) {
                d1.f7820a = null;
                LockSupport.unpark(thread);
            }
            d1 = d1.f7821b;
        }
        do {
            u6 = e6.f7841b;
        } while (!cVar.M0(e6, u6, U0.f7912d));
        while (true) {
            u7 = u0;
            u0 = u6;
            if (u0 == null) {
                break;
            }
            u6 = u0.f7915c;
            u0.f7915c = u7;
        }
        while (u7 != null) {
            Runnable runnable = u7.f7913a;
            U0 u8 = u7.f7915c;
            d(runnable, u7.f7914b);
            u7 = u8;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f7837e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", p012c.k.s("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e6);
        }
    }

    public static final Object f(Object obj) throws ExecutionException {
        if (obj instanceof C0582m0) {
            CancellationException cancellationException = ((C0582m0) obj).f7972a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof G0) {
            throw new ExecutionException(((G0) obj).f7850a);
        }
        if (obj == f7839g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void c(StringBuilder sb) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e6) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e6.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e7) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e7.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        C0582m0 c0582m0;
        Object obj = this.f7840a;
        if (obj != null) {
            return false;
        }
        if (f7836d) {
            c0582m0 = new C0582m0(new CancellationException("Future.cancel() was called."));
        } else {
            c0582m0 = z5 ? C0582m0.f7970b : C0582m0.f7971c;
        }
        if (!f7838f.N0(this, obj, c0582m0)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(D1 d1) {
        d1.f7820a = null;
        while (true) {
            D1 d6 = this.f7842c;
            if (d6 != D1.f7819c) {
                D1 d7 = null;
                while (d6 != null) {
                    D1 d8 = d6.f7821b;
                    if (d6.f7820a != null) {
                        d7 = d6;
                    } else if (d7 != null) {
                        d7.f7821b = d8;
                        if (d7.f7820a == null) {
                        }
                    } else if (!f7838f.O0(this, d6, d8)) {
                    }
                    d6 = d8;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7840a;
        if (obj2 != null) {
            return f(obj2);
        }
        D1 d1 = this.f7842c;
        D1 d6 = D1.f7819c;
        if (d1 != d6) {
            D1 d7 = new D1();
            do {
                p081p0.c cVar = f7838f;
                cVar.I0(d7, d1);
                if (cVar.O0(this, d1, d7)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            e(d7);
                            throw new InterruptedException();
                        }
                        obj = this.f7840a;
                    } while (obj == null);
                    return f(obj);
                }
                d1 = this.f7842c;
            } while (d1 != d6);
        }
        return f(this.f7840a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7840a instanceof C0582m0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7840a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7840a instanceof C0582m0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                strConcat = a();
            } catch (RuntimeException e6) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e6.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final void z(Runnable runnable, Executor executor) {
        executor.getClass();
        U0 u0 = this.f7841b;
        U0 u6 = U0.f7912d;
        if (u0 != u6) {
            U0 u7 = new U0(runnable, executor);
            do {
                u7.f7915c = u0;
                if (f7838f.M0(this, u0, u7)) {
                    return;
                } else {
                    u0 = this.f7841b;
                }
            } while (u0 != u6);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.f7840a;
            if (obj != null) {
                return f(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                D1 d1 = this.f7842c;
                D1 d6 = D1.f7819c;
                if (d1 != d6) {
                    D1 d7 = new D1();
                    while (true) {
                        p081p0.c cVar = f7838f;
                        cVar.I0(d7, d1);
                        if (cVar.O0(this, d1, d7)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7840a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    e(d7);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(d7);
                            break;
                        }
                        d1 = this.f7842c;
                        if (d1 == d6) {
                        }
                    }
                }
                return f(this.f7840a);
            }
            while (nanos > 0) {
                Object obj3 = this.f7840a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j6 = -nanos;
                long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(jConvert);
                boolean z5 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z5 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z5) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z5) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
