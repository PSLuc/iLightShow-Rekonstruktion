package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f6875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f6876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f6880g;

    static {
        Unsafe unsafeI = i();
        f6874a = unsafeI;
        f6875b = AbstractC0418c.f6842a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        h0 g0Var = null;
        if (unsafeI != null) {
            if (!AbstractC0418c.a()) {
                g0Var = new g0(unsafeI);
            } else if (zH) {
                g0Var = new f0(unsafeI, 1);
            } else if (zH2) {
                g0Var = new f0(unsafeI, 0);
            }
        }
        f6876c = g0Var;
        f6877d = g0Var == null ? false : g0Var.r();
        f6878e = g0Var == null ? false : g0Var.q();
        f6879f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && g0Var != null) {
            g0Var.i(fieldG);
        }
        f6880g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j4, Object obj) {
        return ((byte) ((f6876c.f((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j4, Object obj) {
        return ((byte) ((f6876c.f((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f6874a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int e(Class cls) {
        if (f6878e) {
            return f6876c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f6878e) {
            f6876c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0418c.a()) {
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

    public static boolean h(Class cls) {
        if (!AbstractC0418c.a()) {
            return false;
        }
        try {
            Class cls2 = f6875b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j4, byte b6) {
        f6876c.k(bArr, f6879f + j4, b6);
    }

    public static void k(Object obj, long j4, byte b6) {
        long j6 = (-4) & j4;
        int iF = f6876c.f(j6, obj);
        int i = ((~((int) j4)) & 3) << 3;
        m(((255 & b6) << i) | (iF & (~(255 << i))), j6, obj);
    }

    public static void l(Object obj, long j4, byte b6) {
        long j6 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        m(((255 & b6) << i) | (f6876c.f(j6, obj) & (~(255 << i))), j6, obj);
    }

    public static void m(int i, long j4, Object obj) {
        f6876c.n(i, j4, obj);
    }

    public static void n(Object obj, long j4, long j6) {
        f6876c.o(obj, j4, j6);
    }

    public static void o(long j4, Object obj, Object obj2) {
        f6876c.p(j4, obj, obj2);
    }
}
