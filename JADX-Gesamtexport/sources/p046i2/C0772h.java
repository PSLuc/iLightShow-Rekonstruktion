package p046i2;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p015c2.h;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: renamed from: i2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0772h extends m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient Method f9547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Class[] f9548m;

    public C0772h(J j4, Method method, C0715p c0715p, C0715p[] c0715pArr) {
        super(j4, c0715p, c0715pArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.f9547l = method;
    }

    @Override // p046i2.m
    public final Class A(int i) {
        if (this.f9548m == null) {
            this.f9548m = this.f9547l.getParameterTypes();
        }
        Class[] clsArr = this.f9548m;
        if (clsArr.length <= 0) {
            return null;
        }
        return clsArr[0];
    }

    @Override // p046i2.q
    public final AnnotatedElement e() {
        return this.f9547l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i.s(C0772h.class, obj)) {
            return false;
        }
        Method method = ((C0772h) obj).f9547l;
        Method method2 = this.f9547l;
        if (method == null) {
            return method2 == null;
        }
        return method.equals(method2);
    }

    @Override // p046i2.q
    public final Class g() {
        return this.f9547l.getReturnType();
    }

    @Override // p046i2.q
    public final String getName() {
        return this.f9547l.getName();
    }

    @Override // p046i2.q
    public final h h() {
        return this.i.c(this.f9547l.getGenericReturnType());
    }

    public final int hashCode() {
        return this.f9547l.getName().hashCode();
    }

    @Override // p046i2.AbstractC0771g
    public final Class n() {
        return this.f9547l.getDeclaringClass();
    }

    @Override // p046i2.AbstractC0771g
    public final String o() {
        String strO = super.o();
        Method method = this.f9547l;
        int parameterCount = method.getParameterCount();
        if (parameterCount == 0) {
            return strO + "()";
        }
        if (parameterCount != 1) {
            return String.format("%s(%d params)", super.o(), Integer.valueOf(method.getParameterCount()));
        }
        return strO + "(" + A(0).getName() + ")";
    }

    @Override // p046i2.AbstractC0771g
    public final Member p() {
        return this.f9547l;
    }

    @Override // p046i2.AbstractC0771g
    public final Object q(Object obj) {
        try {
            return this.f9547l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new IllegalArgumentException("Failed to getValue() with method " + o() + ": " + i.i(e6), e6);
        }
    }

    @Override // p046i2.AbstractC0771g
    public final q t(C0715p c0715p) {
        return new C0772h(this.i, this.f9547l, c0715p, this.f9558k);
    }

    public final String toString() {
        return "[method " + o() + "]";
    }

    @Override // p046i2.m
    public final Object u() {
        return this.f9547l.invoke(null, null);
    }

    @Override // p046i2.m
    public final Object v(Object[] objArr) {
        return this.f9547l.invoke(null, objArr);
    }

    @Override // p046i2.m
    public final Object w(Object obj) {
        return this.f9547l.invoke(null, obj);
    }

    @Override // p046i2.m
    public final int y() {
        return this.f9547l.getParameterCount();
    }

    @Override // p046i2.m
    public final h z(int i) {
        Type[] genericParameterTypes = this.f9547l.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.i.c(genericParameterTypes[i]);
    }
}
