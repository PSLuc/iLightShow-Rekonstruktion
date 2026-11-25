package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f8202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f8203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f8204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f8206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f8207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f8208g;

    static {
        Unsafe unsafeJ = j();
        f8202a = unsafeJ;
        f8203b = AbstractC0635c.f8198a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        d0 c0Var = null;
        if (unsafeJ != null) {
            if (!AbstractC0635c.a()) {
                c0Var = new c0(unsafeJ);
            } else if (zF) {
                c0Var = new b0(unsafeJ, 1);
            } else if (zF2) {
                c0Var = new b0(unsafeJ, 0);
            }
        }
        f8204c = c0Var;
        f8205d = c0Var == null ? false : c0Var.r();
        f8206e = c0Var == null ? false : c0Var.q();
        f8207f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && c0Var != null) {
            c0Var.j(fieldE);
        }
        f8208g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(e0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f8202a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int c(Class cls) {
        if (f8206e) {
            return f8204c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f8206e) {
            f8204c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0635c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!AbstractC0635c.a()) {
            return false;
        }
        try {
            Class cls2 = f8203b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j4) {
        return f8204c.d(f8207f + j4, bArr);
    }

    public static byte h(long j4, Object obj) {
        return (byte) ((f8204c.g((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & 255);
    }

    public static byte i(long j4, Object obj) {
        return (byte) ((f8204c.g((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j4, byte b6) {
        long j6 = (-4) & j4;
        int iG = f8204c.g(j6, obj);
        int i = ((~((int) j4)) & 3) << 3;
        m(((255 & b6) << i) | (iG & (~(255 << i))), j6, obj);
    }

    public static void l(Object obj, long j4, byte b6) {
        long j6 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        m(((255 & b6) << i) | (f8204c.g(j6, obj) & (~(255 << i))), j6, obj);
    }

    public static void m(int i, long j4, Object obj) {
        f8204c.n(i, j4, obj);
    }

    public static void n(long j4, Object obj, Object obj2) {
        f8204c.p(j4, obj, obj2);
    }
}
