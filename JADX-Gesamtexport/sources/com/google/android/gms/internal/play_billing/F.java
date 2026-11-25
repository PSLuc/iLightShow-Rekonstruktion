package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0549a0 f7843h;
    public final X i;

    public F(C0549a0 c0549a0, X x6) {
        this.f7843h = c0549a0;
        this.i = x6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7843h.f7895a != this) {
            return;
        }
        X x6 = this.i;
        if (O.f7894g.T(this.f7843h, this, C0549a0.f(x6))) {
            C0549a0.i(this.f7843h);
        }
    }
}
