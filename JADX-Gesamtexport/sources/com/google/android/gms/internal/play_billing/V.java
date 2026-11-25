package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class V implements X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f7916b = new W(V.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7917a;

    public V(Object obj) {
        this.f7917a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f7917a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f7917a.toString() + "]]";
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final void z(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            f7916b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", p012c.k.s("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f7917a;
    }
}
