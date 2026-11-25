package androidx.lifecycle;

import com.fasterxml.jackson.databind.deser.std.d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0461v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f7007a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f7008b = new HashMap();

    public static void a(Constructor constructor, r rVar) {
        try {
            E4.k.e("{\n            constructo…tance(`object`)\n        }", constructor.newInstance(rVar));
            throw new ClassCastException();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0145 A[SYNTHETIC] */
    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i;
        boolean z5;
        HashMap map = f7007a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r6 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r6 != null ? r6.getName() : "";
                E4.k.e("fullPackage", name);
                if (name.length() != 0) {
                    E4.k.e("name", canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    E4.k.e("this as java.lang.String).substring(startIndex)", canonicalName);
                }
                E4.k.e("if (fullPackage.isEmpty(…g(fullPackage.length + 1)", canonicalName);
                String strConcat = M4.s.U(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap map2 = f7008b;
            if (declaredConstructor != null) {
                map2.put(cls, d0.v(declaredConstructor));
            } else {
                C0444d c0444d = C0444d.f6986c;
                HashMap map3 = c0444d.f6988b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((y) declaredMethods[i6].getAnnotation(y.class)) != null) {
                                c0444d.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i6++;
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && r.class.isAssignableFrom(superclass)) {
                        E4.k.e("superclass", superclass);
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            E4.k.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            E4.k.e("klass.interfaces", interfaces);
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && r.class.isAssignableFrom(cls2)) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5) {
                                    E4.k.e("intrface", cls2);
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        E4.k.c(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        E4.k.e("klass.interfaces", interfaces);
                        while (i < r7) {
                            if (cls2 == null) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                E4.k.e("intrface", cls2);
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    E4.k.c(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i3 = 2;
        }
        map.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
