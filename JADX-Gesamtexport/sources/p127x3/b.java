package p127x3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p027e3.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f14140j = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f14141k = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f14142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f14143m;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f14142l = cls.getMethod("getName", null);
        this.f14143m = cls.getMethod("getType", null);
    }

    @Override // p027e3.a
    public final Method d0(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // p027e3.a
    public final Constructor e0(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f14141k.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f14143m.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // p027e3.a
    public final String[] i0(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f14141k.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f14142l.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // p027e3.a
    public final boolean k0(Class cls) {
        try {
            return ((Boolean) this.f14140j.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }
}
