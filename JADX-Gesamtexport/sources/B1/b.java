package B1;

import E4.k;
import N.AbstractC0231o0;
import N.W0;
import S1.V;
import androidx.lifecycle.InterfaceC0458s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import p084p4.c;
import p084p4.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0231o0 f488a;

    static {
        Object objV;
        try {
            ClassLoader classLoader = InterfaceC0458s.class.getClassLoader();
            k.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC0231o0) {
                        objV = (AbstractC0231o0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof c)) {
                    i++;
                }
                objV = null;
                break;
            }
        } catch (Throwable th) {
            objV = V.v(th);
        }
        AbstractC0231o0 w6 = (AbstractC0231o0) (objV instanceof j ? null : objV);
        if (w6 == null) {
            w6 = new W0(a.f487h);
        }
        f488a = w6;
    }
}
