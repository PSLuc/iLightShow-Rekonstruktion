package p133y4;

import E4.k;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f14592a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        k.c(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (k.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                k.e("getParameterTypes(...)", parameterTypes);
                if (k.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f14592a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !k.a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
