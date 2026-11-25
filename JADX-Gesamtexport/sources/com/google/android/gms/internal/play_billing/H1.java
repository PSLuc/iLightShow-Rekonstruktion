package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class H1 implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1 f7857b = new G1(this);

    public H1(F1 f6) {
        this.f7856a = new WeakReference(f6);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        F1 f6 = (F1) this.f7856a.get();
        boolean zCancel = this.f7857b.cancel(z5);
        if (!zCancel || f6 == null) {
            return zCancel;
        }
        f6.f7845a = null;
        f6.f7846b = null;
        f6.f7847c.g(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f7857b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7857b.f7840a instanceof C0582m0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7857b.isDone();
    }

    public final String toString() {
        return this.f7857b.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final void z(Runnable runnable, Executor executor) {
        this.f7857b.z(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f7857b.get(j4, timeUnit);
    }
}
