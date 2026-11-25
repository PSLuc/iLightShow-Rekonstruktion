package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0444d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0444d f6986c = new C0444d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6987a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6988b = new HashMap();

    public static void b(HashMap map, C0443c c0443c, EnumC0453m enumC0453m, Class cls) {
        EnumC0453m enumC0453m2 = (EnumC0453m) map.get(c0443c);
        if (enumC0453m2 == null || enumC0453m == enumC0453m2) {
            if (enumC0453m2 == null) {
                map.put(c0443c, enumC0453m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0443c.f6985b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0453m2 + ", new value " + enumC0453m);
    }

    public final C0442b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f6987a;
        if (superclass != null) {
            C0442b c0442bA = (C0442b) map2.get(superclass);
            if (c0442bA == null) {
                c0442bA = a(superclass, null);
            }
            map.putAll(c0442bA.f6983b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0442b c0442bA2 = (C0442b) map2.get(cls2);
            if (c0442bA2 == null) {
                c0442bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0442bA2.f6983b.entrySet()) {
                b(map, (C0443c) entry.getKey(), (EnumC0453m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0458s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0453m enumC0453mValue = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0453m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0453mValue != EnumC0453m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0443c(i, method), enumC0453mValue, cls);
                z5 = true;
            }
        }
        C0442b c0442b = new C0442b(map);
        map2.put(cls, c0442b);
        this.f6988b.put(cls, Boolean.valueOf(z5));
        return c0442b;
    }
}
