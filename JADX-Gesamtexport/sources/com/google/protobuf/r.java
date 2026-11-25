package com.google.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC0633a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, r> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected V unknownFields;

    public r() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = V.f8188e;
    }

    public static r b(Class cls) {
        r rVar = defaultInstanceMap.get(cls);
        if (rVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = (r) ((r) e0.b(cls)).a(6);
        if (rVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, rVar2);
        return rVar2;
    }

    public static Object c(Method method, AbstractC0633a abstractC0633a, Object... objArr) {
        try {
            return method.invoke(abstractC0633a, objArr);
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

    public static final boolean d(r rVar, boolean z5) {
        byte bByteValue = ((Byte) rVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        O o6 = O.f8176c;
        o6.getClass();
        boolean zC = o6.a(rVar.getClass()).c(rVar);
        if (z5) {
            rVar.a(2);
        }
        return zC;
    }

    public static r h(r rVar, byte[] bArr) throws InvalidProtocolBufferException {
        int length = bArr.length;
        C0643k c0643kA = C0643k.a();
        r rVarG = rVar.g();
        try {
            O o6 = O.f8176c;
            o6.getClass();
            S sA = o6.a(rVarG.getClass());
            J2.c cVar = new J2.c();
            c0643kA.getClass();
            sA.f(rVarG, bArr, 0, length, cVar);
            sA.b(rVarG);
            if (d(rVarG, true)) {
                return rVarG;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e6) {
            throw e6;
        } catch (UninitializedMessageException e7) {
            throw new InvalidProtocolBufferException(e7.getMessage());
        } catch (IOException e8) {
            if (e8.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e8.getCause());
            }
            throw new InvalidProtocolBufferException(e8.getMessage(), e8);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public static void i(Class cls, r rVar) {
        rVar.f();
        defaultInstanceMap.put(cls, rVar);
    }

    public abstract Object a(int i);

    public final boolean e() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        O o6 = O.f8176c;
        o6.getClass();
        return o6.a(getClass()).e(this, (r) obj);
    }

    public final void f() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final r g() {
        return (r) a(4);
    }

    public final int hashCode() {
        if (e()) {
            O o6 = O.f8176c;
            o6.getClass();
            return o6.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            O o7 = O.f8176c;
            o7.getClass();
            this.memoizedHashCode = o7.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final void j(int i) {
        if (i < 0) {
            throw new IllegalStateException(p012c.k.r(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = H.f8157a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        H.c(this, sb, 0);
        return sb.toString();
    }
}
