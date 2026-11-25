package p046i2;

import B.AbstractC0013g0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class[] f9471c = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class[] f9473b;

    public A(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != A.class) {
            return false;
        }
        A a6 = (A) obj;
        if (!this.f9472a.equals(a6.f9472a)) {
            return false;
        }
        Class[] clsArr = this.f9473b;
        int length = clsArr.length;
        Class[] clsArr2 = a6.f9473b;
        if (clsArr2.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr2[i] != clsArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f9472a.hashCode() + this.f9473b.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9472a);
        sb.append("(");
        return AbstractC0013g0.l(sb, this.f9473b.length, "-args)");
    }

    public A(Constructor constructor) {
        this("", constructor.getParameterTypes());
    }

    public A(String str, Class[] clsArr) {
        this.f9472a = str;
        this.f9473b = clsArr == null ? f9471c : clsArr;
    }
}
