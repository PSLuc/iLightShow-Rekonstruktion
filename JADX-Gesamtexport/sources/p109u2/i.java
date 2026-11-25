package p109u2;

import B.AbstractC0013g0;
import T1.d;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p012c.k;
import p015c2.f;
import p015c2.h;
import p020d2.a;
import p020d2.n;
import p104t2.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Annotation[] f12697a = new Annotation[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g[] f12698b = new g[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Iterator f12699c = Collections.emptyIterator();

    public static Class A(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void B(f fVar, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException jsonMappingException = new JsonMappingException(fVar == null ? null : fVar.f7252o, iOException.getMessage());
        jsonMappingException.initCause(iOException);
        throw jsonMappingException;
    }

    public static void C(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static void D(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
    }

    public static void E(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
    }

    public static void F(Object obj, Class cls, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(k.u(AbstractC0013g0.o("Sub-class ", obj.getClass().getName(), " (of class ", cls.getName(), ") must override method '"), str, "'"));
        }
    }

    public static Class G(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static void a(Class cls, Class cls2, ArrayList arrayList) {
        if (cls == cls2 || cls == null || cls == Object.class || arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        for (Class<?> cls3 : cls.getInterfaces()) {
            a(cls3, cls2, arrayList);
        }
        a(cls.getSuperclass(), cls2, arrayList);
    }

    public static void b(Class cls, Throwable th) {
        String name = cls.getName();
        String name2 = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder sbO = AbstractC0013g0.o("Failed on call to `getDeclaredMethods()` on class `", name, "`, problem: (", name2, ") ");
        sbO.append(message);
        throw new IllegalArgumentException(sbO.toString(), th);
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static String d(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Member member, boolean z5) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z5 || u(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e6) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e6.getMessage());
        } catch (RuntimeException e7) {
            if (!"InaccessibleObjectException".equals(e7.getClass().getSimpleName())) {
                throw e7;
            }
            String simpleName = member.getClass().getSimpleName();
            String name = member.getName();
            String strZ = z(member.getDeclaringClass());
            String name2 = e7.getClass().getName();
            String message = e7.getMessage();
            StringBuilder sbO = AbstractC0013g0.o("Failed to call `setAccess()` on ", simpleName, " '", name, "' (of class ");
            AbstractC0013g0.t(sbO, strZ, ") due to `", name2, "`, problem: ");
            sbO.append(message);
            throw new IllegalArgumentException(sbO.toString(), e7);
        }
    }

    public static String f(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return z(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static void g(Y1.f fVar, Closeable closeable, Exception exc) {
        if (fVar != null) {
            fVar.A0(d.AUTO_CLOSE_JSON_CONTENT);
            try {
                fVar.close();
            } catch (Exception e6) {
                exc.addSuppressed(e6);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e7) {
                exc.addSuppressed(e7);
            }
        }
        D(exc);
        E(exc);
        throw new RuntimeException(exc);
    }

    public static Object h(Class cls, boolean z5) {
        Constructor constructorK = k(cls, z5);
        if (constructorK == null) {
            throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
        }
        try {
            return constructorK.newInstance(null);
        } catch (Exception e6) {
            String str = "Failed to instantiate class " + cls.getName() + ", problem: " + e6.getMessage();
            Throwable thQ = q(e6);
            E(thQ);
            C(thQ);
            throw new IllegalArgumentException(str, thQ);
        }
    }

    public static String i(Throwable th) {
        if (th instanceof JacksonException) {
            return ((JacksonException) th).b();
        }
        return (!(th instanceof InvocationTargetException) || th.getCause() == null) ? th.getMessage() : th.getCause().getMessage();
    }

    public static Annotation[] j(Class cls) {
        return w(cls) ? f12697a : cls.getDeclaredAnnotations();
    }

    public static Constructor k(Class cls, boolean z5) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (z5) {
                e(declaredConstructor, z5);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e6) {
            String str = "Failed to find default constructor of class " + cls.getName() + ", problem: " + e6.getMessage();
            Throwable thQ = q(e6);
            E(thQ);
            C(thQ);
            throw new IllegalArgumentException(str, thQ);
        }
    }

    public static ArrayList l(Class cls, Class cls2, boolean z5) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z5) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static String m(Object obj) {
        return z(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] n(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e6) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                b(cls, e6);
                throw null;
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Throwable th) {
                    b(cls, th);
                    throw null;
                }
            } catch (ClassNotFoundException e7) {
                e6.addSuppressed(e7);
                b(cls, e6);
                throw null;
            }
        } catch (Throwable th2) {
            b(cls, th2);
            throw null;
        }
    }

    public static g[] o(Class cls) {
        if (cls.isInterface() || w(cls)) {
            return f12698b;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        g[] gVarArr = new g[length];
        for (int i = 0; i < length; i++) {
            gVarArr[i] = new g(declaredConstructors[i]);
        }
        return gVarArr;
    }

    public static Class p(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (((w(cls) || cls.getEnclosingMethod() == null) ? false : true) || w(cls)) {
                    return null;
                }
                return cls.getEnclosingClass();
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable q(Exception exc) {
        Throwable cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }

    public static String r(h hVar) {
        if (hVar == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(((j) hVar).y0());
        sb.append('`');
        return sb.toString();
    }

    public static boolean s(Class cls, Object obj) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean t(Class cls) {
        return cls == Void.class || cls == Void.TYPE || cls == n.class;
    }

    public static boolean u(Class cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean v(Object obj) {
        return obj == null || obj.getClass().getAnnotation(a.class) != null;
    }

    public static boolean w(Class cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static boolean x(Class cls) {
        Class superclass = cls.getSuperclass();
        return superclass != null && "com.android.tools.r8.RecordTag".equals(superclass.getName());
    }

    public static String y(String str) {
        return str == null ? "[null]" : c(str);
    }

    public static String z(Class cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        if (simpleName == null) {
            return "[null]";
        }
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2);
        sb2.append('`');
        sb2.append(simpleName);
        sb2.append('`');
        return sb2.toString();
    }
}
