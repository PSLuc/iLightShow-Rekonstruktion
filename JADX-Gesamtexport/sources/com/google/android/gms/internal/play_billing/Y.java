package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0549a0 f7927h;

    @Override // java.lang.Runnable
    public final void run() {
        X x6;
        H h6;
        C0549a0 c0549a0 = this.f7927h;
        if (c0549a0 == null || (x6 = c0549a0.f7929h) == null) {
            return;
        }
        this.f7927h = null;
        if (x6.isDone()) {
            Object obj = c0549a0.f7895a;
            if (obj == null) {
                if (x6.isDone()) {
                    if (O.f7894g.T(c0549a0, null, C0549a0.f(x6))) {
                        C0549a0.i(c0549a0);
                        return;
                    }
                    return;
                }
                F f6 = new F(c0549a0, x6);
                if (O.f7894g.T(c0549a0, null, f6)) {
                    try {
                        x6.z(f6, T.f7909h);
                        return;
                    } catch (Throwable th) {
                        try {
                            h6 = new H(th);
                        } catch (Error | Exception unused) {
                            h6 = H.f7852b;
                        }
                        O.f7894g.T(c0549a0, f6, h6);
                        return;
                    }
                }
                obj = c0549a0.f7895a;
            }
            if (obj instanceof E) {
                x6.cancel(((E) obj).f7824a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c0549a0.i;
            c0549a0.i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    if (O.f7894g.T(c0549a0, null, new H(new Z(str)))) {
                        C0549a0.i(c0549a0);
                    }
                    throw th2;
                }
            }
            if (O.f7894g.T(c0549a0, null, new H(new Z(str + ": " + x6.toString())))) {
                C0549a0.i(c0549a0);
            }
            x6.cancel(true);
        } catch (Throwable th3) {
            x6.cancel(true);
            throw th3;
        }
    }
}
