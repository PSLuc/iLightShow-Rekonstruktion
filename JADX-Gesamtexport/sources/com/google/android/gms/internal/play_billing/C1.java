package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends p081p0.c {
    @Override // p081p0.c
    public final void I0(D1 d1, D1 d6) {
        d1.f7821b = d6;
    }

    @Override // p081p0.c
    public final void K0(D1 d1, Thread thread) {
        d1.f7820a = thread;
    }

    @Override // p081p0.c
    public final boolean M0(E1 e6, U0 u0, U0 u6) {
        synchronized (e6) {
            try {
                if (e6.f7841b != u0) {
                    return false;
                }
                e6.f7841b = u6;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p081p0.c
    public final boolean N0(E1 e6, Object obj, Object obj2) {
        synchronized (e6) {
            try {
                if (e6.f7840a != obj) {
                    return false;
                }
                e6.f7840a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p081p0.c
    public final boolean O0(E1 e6, D1 d1, D1 d6) {
        synchronized (e6) {
            try {
                if (e6.f7842c != d1) {
                    return false;
                }
                e6.f7842c = d6;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
