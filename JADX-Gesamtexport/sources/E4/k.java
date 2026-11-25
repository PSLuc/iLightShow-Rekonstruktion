package E4;

import B.AbstractC0013g0;
import android.net.Uri;
import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Uri uri) {
        if (uri != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Uri.parse(this) must not be null");
        k(illegalStateException, k.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        k(nullPointerException, k.class.getName());
        throw nullPointerException;
    }

    public static void d(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        k(nullPointerException, k.class.getName());
        throw nullPointerException;
    }

    public static void e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        k(nullPointerException, k.class.getName());
        throw nullPointerException;
    }

    public static void f(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i(str));
        k(nullPointerException, k.class.getName());
        throw nullPointerException;
    }

    public static void g(String str, Object obj) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i(str));
        k(illegalArgumentException, k.class.getName());
        throw illegalArgumentException;
    }

    public static int h(int i, int i3) {
        if (i < i3) {
            return -1;
        }
        return i == i3 ? 0 : 1;
    }

    public static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = k.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbO = AbstractC0013g0.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbO.append(str);
        return sbO.toString();
    }

    public static final b j(Object[] objArr) {
        f("array", objArr);
        return new b(objArr);
    }

    public static void k(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String l(String str, Object obj) {
        return str + obj;
    }

    public static void m(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(AbstractC0013g0.i("lateinit property ", str, " has not been initialized"));
        k(uninitializedPropertyAccessException, k.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
