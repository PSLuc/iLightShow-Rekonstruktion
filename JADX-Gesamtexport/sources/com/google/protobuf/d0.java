package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f8200a;

    public d0(Unsafe unsafe) {
        this.f8200a = unsafe;
    }

    public final int a(Class cls) {
        return this.f8200a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f8200a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract byte d(long j4, Object obj);

    public abstract double e(long j4, Object obj);

    public abstract float f(long j4, Object obj);

    public final int g(long j4, Object obj) {
        return this.f8200a.getInt(obj, j4);
    }

    public final long h(long j4, Object obj) {
        return this.f8200a.getLong(obj, j4);
    }

    public final Object i(long j4, Object obj) {
        return this.f8200a.getObject(obj, j4);
    }

    public final long j(Field field) {
        return this.f8200a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j4, boolean z5);

    public abstract void l(Object obj, long j4, double d6);

    public abstract void m(Object obj, long j4, float f6);

    public final void n(int i, long j4, Object obj) {
        this.f8200a.putInt(obj, j4, i);
    }

    public final void o(Object obj, long j4, long j6) {
        this.f8200a.putLong(obj, j4, j6);
    }

    public final void p(long j4, Object obj, Object obj2) {
        this.f8200a.putObject(obj, j4, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f8200a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            e0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
