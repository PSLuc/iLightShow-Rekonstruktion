package p050j2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p012c.k;
import p109u2.i;
import p109u2.u;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RuntimeException f9713e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f9714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f9715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f9716c;

    static {
        a aVar = null;
        try {
            e = null;
            aVar = new a();
        } catch (RuntimeException e6) {
            e = e6;
        }
        f9712d = aVar;
        f9713e = e;
    }

    public a() {
        try {
            this.f9714a = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f9715b = cls.getMethod("getName", null);
            this.f9716c = cls.getMethod("getType", null);
        } catch (Exception e6) {
            throw new RuntimeException(k.s("Failed to access Methods needed to support `java.lang.Record`: (", e6.getClass().getName(), ") ", e6.getMessage()), e6);
        }
    }

    public final Object[] a(Class cls) {
        boolean zEquals;
        try {
            return (Object[]) this.f9714a.invoke(cls, null);
        } catch (Exception e6) {
            e = e6;
            if (u.f12713a && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"))) {
                if (e instanceof InvocationTargetException) {
                    e = e.getCause();
                }
                zEquals = e.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
            } else {
                zEquals = false;
            }
            if (zEquals) {
                return null;
            }
            throw new IllegalArgumentException("Failed to access RecordComponents of type " + i.z(cls));
        }
    }
}
