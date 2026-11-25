package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f6866a;

    public h0(Unsafe unsafe) {
        this.f6866a = unsafe;
    }

    public final int a(Class cls) {
        return this.f6866a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f6866a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j4, Object obj);

    public abstract double d(long j4, Object obj);

    public abstract float e(long j4, Object obj);

    public final int f(long j4, Object obj) {
        return this.f6866a.getInt(obj, j4);
    }

    public final long g(long j4, Object obj) {
        return this.f6866a.getLong(obj, j4);
    }

    public final Object h(long j4, Object obj) {
        return this.f6866a.getObject(obj, j4);
    }

    public final long i(Field field) {
        return this.f6866a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j4, boolean z5);

    public abstract void k(Object obj, long j4, byte b6);

    public abstract void l(Object obj, long j4, double d6);

    public abstract void m(Object obj, long j4, float f6);

    public final void n(int i, long j4, Object obj) {
        this.f6866a.putInt(obj, j4, i);
    }

    public final void o(Object obj, long j4, long j6) {
        this.f6866a.putLong(obj, j4, j6);
    }

    public final void p(long j4, Object obj, Object obj2) {
        this.f6866a.putObject(obj, j4, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f6866a;
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
            i0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
