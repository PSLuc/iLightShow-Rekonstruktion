package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p020d2.n {
    @Override // p020d2.n
    public final I O(C0549a0 c0549a0) {
        I i;
        I i3 = I.f7858d;
        synchronized (c0549a0) {
            try {
                i = c0549a0.f7896b;
                if (i != i3) {
                    c0549a0.f7896b = i3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // p020d2.n
    public final N P(C0549a0 c0549a0) {
        N n6;
        N n7 = N.f7886c;
        synchronized (c0549a0) {
            try {
                n6 = c0549a0.f7897c;
                if (n6 != n7) {
                    c0549a0.f7897c = n7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n6;
    }

    @Override // p020d2.n
    public final void Q(N n6, N n7) {
        n6.f7888b = n7;
    }

    @Override // p020d2.n
    public final void R(N n6, Thread thread) {
        n6.f7887a = thread;
    }

    @Override // p020d2.n
    public final boolean S(C0549a0 c0549a0, I i, I i3) {
        synchronized (c0549a0) {
            try {
                if (c0549a0.f7896b != i) {
                    return false;
                }
                c0549a0.f7896b = i3;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p020d2.n
    public final boolean T(O o6, Object obj, Object obj2) {
        synchronized (o6) {
            try {
                if (o6.f7895a != obj) {
                    return false;
                }
                o6.f7895a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p020d2.n
    public final boolean U(O o6, N n6, N n7) {
        synchronized (o6) {
            try {
                if (o6.f7897c != n6) {
                    return false;
                }
                o6.f7897c = n7;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
