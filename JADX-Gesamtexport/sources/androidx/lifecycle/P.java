package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class P extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static P f6973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W2.g f6974d = new W2.g(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f6975b;

    public P(Application application) {
        this.f6975b = application;
    }

    @Override // androidx.lifecycle.S, androidx.lifecycle.Q
    public final O a(Class cls) {
        Application application = this.f6975b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.S, androidx.lifecycle.Q
    public final O c(Class cls, C1.c cVar) {
        if (this.f6975b != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) cVar.f603h).get(f6974d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0441a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return p027e3.a.V(cls);
    }

    public final O d(Class cls, Application application) {
        if (!AbstractC0441a.class.isAssignableFrom(cls)) {
            return p027e3.a.V(cls);
        }
        try {
            O o6 = (O) cls.getConstructor(Application.class).newInstance(application);
            E4.k.e("{\n                try {\n…          }\n            }", o6);
            return o6;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }
}
