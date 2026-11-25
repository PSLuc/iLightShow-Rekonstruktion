package androidx.lifecycle;

import android.app.Application;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f6970a = p089q4.m.M(Application.class, G.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f6971b = d0.v(G.class);

    public static final Constructor a(Class cls, List list) {
        E4.k.f("signature", list);
        Constructor<?>[] constructors = cls.getConstructors();
        E4.k.e("modelClass.constructors", constructors);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            E4.k.e("constructor.parameterTypes", parameterTypes);
            List listT0 = p089q4.k.t0(parameterTypes);
            if (list.equals(listT0)) {
                return constructor;
            }
            if (list.size() == listT0.size() && listT0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final O b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (O) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
