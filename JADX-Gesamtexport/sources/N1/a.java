package N1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p080p.C0833e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0833e f3880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0833e f3881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0833e f3882c;

    public a(C0833e c0833e, C0833e c0833e2, C0833e c0833e3) {
        this.f3880a = c0833e;
        this.f3881b = c0833e2;
        this.f3882c = c0833e3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0833e c0833e = this.f3882c;
        Class cls2 = (Class) c0833e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0833e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        C0833e c0833e = this.f3880a;
        Method method = (Method) c0833e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        c0833e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0833e c0833e = this.f3881b;
        Method method = (Method) c0833e.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        c0833e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((b) this).f3884e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String string = ((b) this).f3884e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract void h(int i);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f3884e.writeString(null);
            return;
        }
        try {
            ((b) this).f3884e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                int i = bVarA.i;
                if (i >= 0) {
                    int i3 = bVarA.f3883d.get(i);
                    Parcel parcel = bVarA.f3884e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(iDataPosition - i3);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (InvocationTargetException e9) {
                if (!(e9.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
                }
                throw ((RuntimeException) e9.getCause());
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
