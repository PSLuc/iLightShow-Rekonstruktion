package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0549a0 extends O implements J {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X f7929h;
    public ScheduledFuture i;

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof E) {
            RuntimeException runtimeException = ((E) obj).f7825b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof H) {
            throw new ExecutionException(((H) obj).f7853a);
        }
        if (obj == O.f7891d) {
            return null;
        }
        return obj;
    }

    public static boolean e(Object obj) {
        return !(obj instanceof F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object f(X x6) {
        Throwable thA;
        if (x6 instanceof J) {
            Object e6 = ((C0549a0) x6).f7895a;
            if (e6 instanceof E) {
                E e7 = (E) e6;
                if (e7.f7824a) {
                    RuntimeException runtimeException = e7.f7825b;
                    e6 = runtimeException != null ? new E(false, runtimeException) : E.f7823d;
                }
            }
            Objects.requireNonNull(e6);
            return e6;
        }
        if ((x6 instanceof AbstractC0552b0) && (thA = ((AbstractC0552b0) x6).a()) != null) {
            return new H(thA);
        }
        boolean zIsCancelled = x6.isCancelled();
        if ((!O.f7893f) && zIsCancelled) {
            E e8 = E.f7823d;
            Objects.requireNonNull(e8);
            return e8;
        }
        try {
            Object objG = g(x6);
            if (zIsCancelled) {
                return new E(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(x6))));
            }
            return objG == null ? O.f7891d : objG;
        } catch (Error | Exception e9) {
            return new H(e9);
        } catch (CancellationException e10) {
            return !zIsCancelled ? new H(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(x6)), e10)) : new E(false, e10);
        } catch (ExecutionException e11) {
            return zIsCancelled ? new E(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(x6)), e11)) : new H(e11.getCause());
        }
    }

    public static Object g(X x6) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = x6.get();
                break;
            } catch (InterruptedException unused) {
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
        return obj;
    }

    public static void i(C0549a0 c0549a0) {
        I i = null;
        while (true) {
            c0549a0.getClass();
            for (N nP = O.f7894g.P(c0549a0); nP != null; nP = nP.f7888b) {
                Thread thread = nP.f7887a;
                if (thread != null) {
                    nP.f7887a = null;
                    LockSupport.unpark(thread);
                }
            }
            X x6 = c0549a0.f7929h;
            if ((c0549a0.f7895a instanceof E) & (x6 != null)) {
                Object obj = c0549a0.f7895a;
                x6.cancel((obj instanceof E) && ((E) obj).f7824a);
            }
            ScheduledFuture scheduledFuture = c0549a0.i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            c0549a0.f7929h = null;
            c0549a0.i = null;
            I i3 = i;
            I iO = O.f7894g.O(c0549a0);
            I i6 = i3;
            while (iO != null) {
                I i7 = iO.f7861c;
                iO.f7861c = i6;
                i6 = iO;
                iO = i7;
            }
            while (i6 != null) {
                Runnable runnable = i6.f7859a;
                I i8 = i6.f7861c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof F) {
                    F f6 = (F) runnable;
                    c0549a0 = f6.f7843h;
                    if (c0549a0.f7895a != f6) {
                        continue;
                    } else if (O.f7894g.T(c0549a0, f6, f(f6.i))) {
                        i = i8;
                    }
                } else {
                    Executor executor = i6.f7860b;
                    Objects.requireNonNull(executor);
                    j(runnable, executor);
                }
                i6 = i8;
            }
            return;
        }
    }

    public static void j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            O.f7892e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", p012c.k.s("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0552b0
    public final Throwable a() {
        if (!(this instanceof J)) {
            return null;
        }
        Object obj = this.f7895a;
        if (obj instanceof H) {
            return ((H) obj).f7853a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        E e6;
        Object obj = this.f7895a;
        if (!(obj instanceof F) && !(obj == null)) {
            return false;
        }
        if (O.f7893f) {
            e6 = new E(z5, new CancellationException("Future.cancel() was called."));
        } else {
            e6 = z5 ? E.f7822c : E.f7823d;
            Objects.requireNonNull(e6);
        }
        boolean z6 = false;
        while (true) {
            if (O.f7894g.T(this, obj, e6)) {
                i(this);
                if (obj instanceof F) {
                    X x6 = ((F) obj).i;
                    if (x6 instanceof J) {
                        this = (C0549a0) x6;
                        obj = this.f7895a;
                        if ((obj == null) | (obj instanceof F)) {
                            z6 = true;
                        }
                    } else {
                        x6.cancel(z5);
                    }
                }
                return true;
            }
            obj = this.f7895a;
            if (e(obj)) {
                return z6;
            }
        }
    }

    public final String d() {
        X x6 = this.f7929h;
        ScheduledFuture scheduledFuture = this.i;
        if (x6 == null) {
            return null;
        }
        String strI = AbstractC0013g0.i("inputFuture=[", x6.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strI + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strI;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7895a;
        if ((obj2 != null) && e(obj2)) {
            return c(obj2);
        }
        N n6 = this.f7897c;
        N n7 = N.f7886c;
        if (n6 != n7) {
            N n8 = new N();
            do {
                p020d2.n nVar = O.f7894g;
                nVar.Q(n8, n6);
                if (nVar.U(this, n6, n8)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(n8);
                            throw new InterruptedException();
                        }
                        obj = this.f7895a;
                    } while (!((obj != null) & e(obj)));
                    return c(obj);
                }
                n6 = this.f7897c;
            } while (n6 != n7);
        }
        Object obj3 = this.f7895a;
        Objects.requireNonNull(obj3);
        return c(obj3);
    }

    public final void h(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            if (objG == null) {
                sb.append("null");
            } else if (objG == this) {
                sb.append("this future");
            } else {
                sb.append(objG.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objG)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        } catch (Exception e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7895a instanceof E;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f7895a;
        return (obj != null) & e(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f7895a instanceof E) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f7895a;
            if (obj instanceof F) {
                sb.append(", setFuture=[");
                X x6 = ((F) obj).i;
                try {
                    if (x6 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(x6);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = d();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                h(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final void z(Runnable runnable, Executor executor) {
        I i;
        I i3;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (i = this.f7896b) != (i3 = I.f7858d)) {
            I i6 = new I(runnable, executor);
            do {
                i6.f7861c = i;
                if (O.f7894g.S(this, i, i6)) {
                    return;
                } else {
                    i = this.f7896b;
                }
            } while (i != i3);
        }
        j(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j6;
        long nanos = timeUnit.toNanos(j4);
        if (!Thread.interrupted()) {
            Object obj = this.f7895a;
            if ((obj != null) & e(obj)) {
                return c(obj);
            }
            long j7 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                N n6 = this.f7897c;
                N n7 = N.f7886c;
                if (n6 != n7) {
                    N n8 = new N();
                    while (true) {
                        p020d2.n nVar = O.f7894g;
                        nVar.Q(n8, n6);
                        if (nVar.U(this, n6, n8)) {
                            j6 = j7;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7895a;
                                    if ((obj2 != null) & e(obj2)) {
                                        return c(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    b(n8);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(n8);
                            break;
                        }
                        long j8 = j7;
                        n6 = this.f7897c;
                        if (n6 != n7) {
                            j7 = j8;
                        }
                    }
                }
                Object obj3 = this.f7895a;
                Objects.requireNonNull(obj3);
                return c(obj3);
            }
            j6 = 0;
            while (nanos > j6) {
                Object obj4 = this.f7895a;
                if ((obj4 != null) & e(obj4)) {
                    return c(obj4);
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
            if (nanos + 1000 < j6) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j9 = -nanos;
                long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(jConvert);
                boolean z5 = jConvert == j6 || nanos2 > 1000;
                if (jConvert > j6) {
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
