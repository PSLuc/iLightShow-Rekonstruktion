package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0605y0 extends AbstractC0573i0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected V0 zzc;
    private int zzd;

    public AbstractC0605y0() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = V0.f7918f;
    }

    public static final boolean g(AbstractC0605y0 abstractC0605y0, boolean z5) {
        byte bByteValue = ((Byte) abstractC0605y0.h(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = P0.f7899c.a(abstractC0605y0.getClass()).h(abstractC0605y0);
        if (z5) {
            abstractC0605y0.h(2);
        }
        return zH;
    }

    public static AbstractC0605y0 k(Class cls) {
        Map map = zzb;
        AbstractC0605y0 abstractC0605y0 = (AbstractC0605y0) map.get(cls);
        if (abstractC0605y0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0605y0 = (AbstractC0605y0) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (abstractC0605y0 != null) {
            return abstractC0605y0;
        }
        AbstractC0605y0 abstractC0605y1 = (AbstractC0605y0) ((AbstractC0605y0) AbstractC0550a1.f(cls)).h(6);
        if (abstractC0605y1 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC0605y1);
        return abstractC0605y1;
    }

    public static Object l(Method method, AbstractC0573i0 abstractC0573i0, Object... objArr) {
        try {
            return method.invoke(abstractC0573i0, objArr);
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

    public static void n(Class cls, AbstractC0605y0 abstractC0605y0) {
        abstractC0605y0.m();
        zzb.put(cls, abstractC0605y0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0573i0
    public final void a(C0590q0 c0590q0) {
        S0 s0A = P0.f7899c.a(getClass());
        H0 h1 = c0590q0.f7985d;
        if (h1 == null) {
            h1 = new H0(c0590q0);
        }
        s0A.f(this, h1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0573i0
    public final int c(S0 s1) {
        if (f()) {
            int iE = s1.e(this);
            if (iE >= 0) {
                return iE;
            }
            throw new IllegalStateException(p012c.k.r(iE, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = s1.e(this);
        if (iE2 < 0) {
            throw new IllegalStateException(p012c.k.r(iE2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
        return iE2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0573i0
    public final int d() {
        if (f()) {
            int iE = P0.f7899c.a(getClass()).e(this);
            if (iE >= 0) {
                return iE;
            }
            throw new IllegalStateException(p012c.k.r(iE, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = P0.f7899c.a(getClass()).e(this);
        if (iE2 < 0) {
            throw new IllegalStateException(p012c.k.r(iE2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
        return iE2;
    }

    public final void e() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return P0.f7899c.a(getClass()).i(this, (AbstractC0605y0) obj);
    }

    public final boolean f() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object h(int i);

    public final int hashCode() {
        if (f()) {
            return P0.f7899c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iG = P0.f7899c.a(getClass()).g(this);
        this.zza = iG;
        return iG;
    }

    public final AbstractC0603x0 i() {
        return (AbstractC0603x0) h(5);
    }

    public final AbstractC0603x0 j() {
        AbstractC0603x0 abstractC0603x0 = (AbstractC0603x0) h(5);
        if (!abstractC0603x0.f8016h.equals(this)) {
            if (!abstractC0603x0.i.f()) {
                AbstractC0605y0 abstractC0605y0 = (AbstractC0605y0) abstractC0603x0.f8016h.h(4);
                P0.f7899c.a(abstractC0605y0.getClass()).b(abstractC0605y0, abstractC0603x0.i);
                abstractC0603x0.i = abstractC0605y0;
            }
            AbstractC0605y0 abstractC0605y1 = abstractC0603x0.i;
            P0.f7899c.a(abstractC0605y1.getClass()).b(abstractC0605y1, this);
        }
        return abstractC0603x0;
    }

    public final void m() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L0.f7869a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        L0.c(this, sb, 0);
        return sb.toString();
    }
}
