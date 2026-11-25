package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0550a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f7930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f7931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z0 f7932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f7933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f7934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f7935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f7936g;

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:4:0x001c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0168 A[PHI: r0
  0x0168: PHI (r0v41 java.lang.reflect.Field) = (r0v34 java.lang.reflect.Field), (r0v36 java.lang.reflect.Field) binds: [B:44:0x0158, B:50:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        Z0 x6;
        Field declaredField;
        boolean z5;
        boolean z6;
        Field declaredField2;
        Field field;
        Z0 z7;
        Class<Class> cls = Class.class;
        Unsafe unsafeH = h();
        f7930a = unsafeH;
        int i = AbstractC0578k0.f7955a;
        f7931b = Memory.class;
        Class<?> cls2 = Long.TYPE;
        boolean zN = n(cls2);
        Class cls3 = Integer.TYPE;
        boolean zN2 = n(cls3);
        if (unsafeH == null) {
            x6 = null;
        } else if (zN) {
            x6 = new Y0(unsafeH);
        } else if (zN2) {
            x6 = new X0(unsafeH);
        } else {
            x6 = null;
        }
        f7932c = x6;
        if (x6 == null) {
            z5 = false;
        } else {
            try {
                Class<?> cls4 = x6.f7928a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("getLong", Object.class, cls2);
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
                        declaredField = null;
                    }
                    if (declaredField == null || declaredField.getType() != cls2) {
                        declaredField = null;
                    }
                }
                if (declaredField == null) {
                    z5 = false;
                } else {
                    cls = cls;
                    z5 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(AbstractC0550a1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f7933d = z5;
        Z0 z8 = f7932c;
        if (z8 == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls5 = z8.f7928a.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                cls5.getMethod("arrayBaseOffset", cls);
                cls5.getMethod("arrayIndexScale", cls);
                cls5.getMethod("getInt", Object.class, cls2);
                cls5.getMethod("putInt", Object.class, cls2, cls3);
                cls5.getMethod("getLong", Object.class, cls2);
                cls5.getMethod("putLong", Object.class, cls2, cls2);
                cls5.getMethod("getObject", Object.class, cls2);
                cls5.getMethod("putObject", Object.class, cls2, Object.class);
                z6 = true;
            } catch (Throwable th2) {
                Logger.getLogger(AbstractC0550a1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z6 = false;
            }
        }
        f7934e = z6;
        f7935f = o(byte[].class);
        o(boolean[].class);
        a(boolean[].class);
        o(int[].class);
        a(int[].class);
        o(long[].class);
        a(long[].class);
        o(float[].class);
        a(float[].class);
        o(double[].class);
        a(double[].class);
        o(Object[].class);
        a(Object[].class);
        int i3 = AbstractC0578k0.f7955a;
        try {
            declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused4) {
                declaredField2 = null;
            }
            if (declaredField2 == null || declaredField2.getType() != cls2) {
                field = null;
            } else {
                field = declaredField2;
            }
        } else {
            field = declaredField2;
        }
        if (field != null && (z7 = f7932c) != null) {
            z7.f7928a.objectFieldOffset(field);
        }
        f7936g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f7934e) {
            f7932c.f7928a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j4, byte b6) {
        Unsafe unsafe = f7932c.f7928a;
        long j6 = (-4) & j4;
        int i = unsafe.getInt(obj, j6);
        int i3 = ((~((int) j4)) & 3) << 3;
        unsafe.putInt(obj, j6, ((255 & b6) << i3) | (i & (~(255 << i3))));
    }

    public static void c(Object obj, long j4, byte b6) {
        Unsafe unsafe = f7932c.f7928a;
        long j6 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        unsafe.putInt(obj, j6, ((255 & b6) << i) | (unsafe.getInt(obj, j6) & (~(255 << i))));
    }

    public static int d(long j4, Object obj) {
        return f7932c.f7928a.getInt(obj, j4);
    }

    public static long e(long j4, Object obj) {
        return f7932c.f7928a.getLong(obj, j4);
    }

    public static Object f(Class cls) {
        try {
            return f7930a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static Object g(long j4, Object obj) {
        return f7932c.f7928a.getObject(obj, j4);
    }

    public static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new W0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(int i, long j4, Object obj) {
        f7932c.f7928a.putInt(obj, j4, i);
    }

    public static void j(Object obj, long j4, long j6) {
        f7932c.f7928a.putLong(obj, j4, j6);
    }

    public static void k(long j4, Object obj, Object obj2) {
        f7932c.f7928a.putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean l(long j4, Object obj) {
        return ((byte) ((f7932c.f7928a.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean m(long j4, Object obj) {
        return ((byte) ((f7932c.f7928a.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    public static boolean n(Class cls) {
        int i = AbstractC0578k0.f7955a;
        try {
            Class cls2 = f7931b;
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

    public static int o(Class cls) {
        if (f7934e) {
            return f7932c.f7928a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
