package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0436v extends AbstractC0416a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0436v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0436v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f6844f;
    }

    public static AbstractC0436v d(Class cls) {
        AbstractC0436v abstractC0436v = defaultInstanceMap.get(cls);
        if (abstractC0436v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0436v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC0436v != null) {
            return abstractC0436v;
        }
        AbstractC0436v abstractC0436v2 = (AbstractC0436v) ((AbstractC0436v) i0.d(cls)).c(6);
        if (abstractC0436v2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0436v2);
        return abstractC0436v2;
    }

    public static Object e(Method method, AbstractC0416a abstractC0416a, Object... objArr) {
        try {
            return method.invoke(abstractC0416a, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(AbstractC0436v abstractC0436v, boolean z5) {
        byte bByteValue = ((Byte) abstractC0436v.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        S s6 = S.f6818c;
        s6.getClass();
        boolean zC = s6.a(abstractC0436v.getClass()).c(abstractC0436v);
        if (z5) {
            abstractC0436v.c(2);
        }
        return zC;
    }

    public static void j(Class cls, AbstractC0436v abstractC0436v) {
        abstractC0436v.h();
        defaultInstanceMap.put(cls, abstractC0436v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0416a
    public final int a(V v6) {
        int i;
        int i3;
        if (g()) {
            if (v6 == null) {
                S s6 = S.f6818c;
                s6.getClass();
                i3 = s6.a(getClass()).i(this);
            } else {
                i3 = v6.i(this);
            }
            if (i3 >= 0) {
                return i3;
            }
            throw new IllegalStateException(p012c.k.r(i3, "serialized size must be non-negative, was "));
        }
        int i6 = this.memoizedSerializedSize;
        if ((i6 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i6 & Integer.MAX_VALUE;
        }
        if (v6 == null) {
            S s7 = S.f6818c;
            s7.getClass();
            i = s7.a(getClass()).i(this);
        } else {
            i = v6.i(this);
        }
        k(i);
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0416a
    public final void b(C0427l c0427l) {
        S s6 = S.f6818c;
        s6.getClass();
        V vA = s6.a(getClass());
        D d6 = c0427l.f6890m;
        if (d6 == null) {
            d6 = new D(c0427l);
        }
        vA.e(this, d6);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        S s6 = S.f6818c;
        s6.getClass();
        return s6.a(getClass()).g(this, (AbstractC0436v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            S s6 = S.f6818c;
            s6.getClass();
            return s6.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            S s7 = S.f6818c;
            s7.getClass();
            this.memoizedHashCode = s7.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0436v i() {
        return (AbstractC0436v) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            throw new IllegalStateException(p012c.k.r(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = K.f6798a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        K.c(this, sb, 0);
        return sb.toString();
    }
}
