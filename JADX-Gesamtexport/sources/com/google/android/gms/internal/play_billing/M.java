package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p020d2.n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Unsafe f7870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f7871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f7872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f7873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f7874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f7875p;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new S());
            }
            try {
                f7872m = unsafe.objectFieldOffset(O.class.getDeclaredField("c"));
                f7871l = unsafe.objectFieldOffset(O.class.getDeclaredField("b"));
                f7873n = unsafe.objectFieldOffset(O.class.getDeclaredField("a"));
                f7874o = unsafe.objectFieldOffset(N.class.getDeclaredField("a"));
                f7875p = unsafe.objectFieldOffset(N.class.getDeclaredField("b"));
                f7870k = unsafe;
            } catch (NoSuchFieldException e6) {
                throw new RuntimeException(e6);
            }
        } catch (PrivilegedActionException e7) {
            throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
        }
    }

    @Override // p020d2.n
    public final I O(C0549a0 c0549a0) {
        I i;
        I i3 = I.f7858d;
        do {
            i = c0549a0.f7896b;
            if (i3 == i) {
                break;
            }
        } while (!S(c0549a0, i, i3));
        return i;
    }

    @Override // p020d2.n
    public final N P(C0549a0 c0549a0) {
        N n6;
        N n7 = N.f7886c;
        do {
            n6 = c0549a0.f7897c;
            if (n7 == n6) {
                break;
            }
        } while (!U(c0549a0, n6, n7));
        return n6;
    }

    @Override // p020d2.n
    public final void Q(N n6, N n7) {
        f7870k.putObject(n6, f7875p, n7);
    }

    @Override // p020d2.n
    public final void R(N n6, Thread thread) {
        f7870k.putObject(n6, f7874o, thread);
    }

    @Override // p020d2.n
    public final boolean S(C0549a0 c0549a0, I i, I i3) {
        return Q.a(f7870k, c0549a0, f7871l, i, i3);
    }

    @Override // p020d2.n
    public final boolean T(O o6, Object obj, Object obj2) {
        return Q.a(f7870k, o6, f7873n, obj, obj2);
    }

    @Override // p020d2.n
    public final boolean U(O o6, N n6, N n7) {
        return Q.a(f7870k, o6, f7872m, n6, n7);
    }
}
