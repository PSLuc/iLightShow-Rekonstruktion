package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f7928a;

    public Z0(Unsafe unsafe) {
        this.f7928a = unsafe;
    }

    public abstract double a(long j4, Object obj);

    public abstract float b(long j4, Object obj);

    public abstract void c(Object obj, long j4, boolean z5);

    public abstract void d(Object obj, long j4, byte b6);

    public abstract void e(Object obj, long j4, double d6);

    public abstract void f(Object obj, long j4, float f6);

    public abstract boolean g(long j4, Object obj);
}
