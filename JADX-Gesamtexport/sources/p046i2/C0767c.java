package p046i2;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import p015c2.h;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: renamed from: i2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0767c extends m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Constructor f9538l;

    public C0767c(J j4, Constructor constructor, C0715p c0715p, C0715p[] c0715pArr) {
        super(j4, c0715p, c0715pArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.f9538l = constructor;
    }

    @Override // p046i2.m
    public final Class A(int i) {
        Class<?>[] parameterTypes = this.f9538l.getParameterTypes();
        if (i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    @Override // p046i2.q
    public final AnnotatedElement e() {
        return this.f9538l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i.s(C0767c.class, obj)) {
            return false;
        }
        Constructor constructor = ((C0767c) obj).f9538l;
        Constructor constructor2 = this.f9538l;
        if (constructor == null) {
            return constructor2 == null;
        }
        return constructor.equals(constructor2);
    }

    @Override // p046i2.q
    public final Class g() {
        return this.f9538l.getDeclaringClass();
    }

    @Override // p046i2.q
    public final String getName() {
        return this.f9538l.getName();
    }

    @Override // p046i2.q
    public final h h() {
        return this.i.c(this.f9538l.getDeclaringClass());
    }

    public final int hashCode() {
        return this.f9538l.getName().hashCode();
    }

    @Override // p046i2.AbstractC0771g
    public final Class n() {
        return this.f9538l.getDeclaringClass();
    }

    @Override // p046i2.AbstractC0771g
    public final Member p() {
        return this.f9538l;
    }

    @Override // p046i2.AbstractC0771g
    public final Object q(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of ".concat(this.f9538l.getDeclaringClass().getName()));
    }

    @Override // p046i2.AbstractC0771g
    public final q t(C0715p c0715p) {
        return new C0767c(this.i, this.f9538l, c0715p, this.f9558k);
    }

    public final String toString() {
        Constructor constructor = this.f9538l;
        int parameterCount = constructor.getParameterCount();
        return String.format("[constructor for %s (%d arg%s), annotations: %s", i.z(constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : "s", this.f9546j);
    }

    @Override // p046i2.m
    public final Object u() {
        return this.f9538l.newInstance(null);
    }

    @Override // p046i2.m
    public final Object v(Object[] objArr) {
        return this.f9538l.newInstance(objArr);
    }

    @Override // p046i2.m
    public final Object w(Object obj) {
        return this.f9538l.newInstance(obj);
    }

    @Override // p046i2.m
    public final int y() {
        return this.f9538l.getParameterCount();
    }

    @Override // p046i2.m
    public final h z(int i) {
        Type[] genericParameterTypes = this.f9538l.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.i.c(genericParameterTypes[i]);
    }
}
