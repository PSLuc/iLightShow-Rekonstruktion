package S1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final A f4905l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC0363z f4906h;
    public final EnumC0363z i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class f4907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f4908k;

    static {
        EnumC0363z enumC0363z = EnumC0363z.f4986l;
        f4905l = new A(enumC0363z, enumC0363z, null, null);
    }

    public A(EnumC0363z enumC0363z, EnumC0363z enumC0363z2, Class cls, Class cls2) {
        EnumC0363z enumC0363z3 = EnumC0363z.f4986l;
        this.f4906h = enumC0363z == null ? enumC0363z3 : enumC0363z;
        this.i = enumC0363z2 == null ? enumC0363z3 : enumC0363z2;
        this.f4907j = cls == Void.class ? null : cls;
        this.f4908k = cls2 == Void.class ? null : cls2;
    }

    public final A a(A a6) {
        if (a6 == null || a6 == f4905l) {
            return this;
        }
        EnumC0363z enumC0363z = EnumC0363z.f4986l;
        EnumC0363z enumC0363z2 = a6.f4906h;
        EnumC0363z enumC0363z3 = this.f4906h;
        boolean z5 = (enumC0363z2 == enumC0363z3 || enumC0363z2 == enumC0363z) ? false : true;
        EnumC0363z enumC0363z4 = a6.i;
        EnumC0363z enumC0363z5 = this.i;
        boolean z6 = (enumC0363z4 == enumC0363z5 || enumC0363z4 == enumC0363z) ? false : true;
        Class cls = a6.f4907j;
        Class cls2 = a6.f4908k;
        Class cls3 = this.f4907j;
        boolean z7 = (cls == cls3 && cls2 == cls3) ? false : true;
        if (z5) {
            return z6 ? new A(enumC0363z2, enumC0363z4, cls, cls2) : new A(enumC0363z2, enumC0363z5, cls, cls2);
        }
        if (z6) {
            return new A(enumC0363z3, enumC0363z4, cls, cls2);
        }
        return z7 ? new A(enumC0363z3, enumC0363z5, cls, cls2) : this;
    }

    public final A b(EnumC0363z enumC0363z) {
        return enumC0363z == this.f4906h ? this : new A(enumC0363z, this.i, this.f4907j, this.f4908k);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != A.class) {
            return false;
        }
        A a6 = (A) obj;
        return a6.f4906h == this.f4906h && a6.i == this.i && a6.f4907j == this.f4907j && a6.f4908k == this.f4908k;
    }

    public final int hashCode() {
        return this.i.hashCode() + (this.f4906h.hashCode() << 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("JsonInclude.Value(value=");
        sb.append(this.f4906h);
        sb.append(",content=");
        sb.append(this.i);
        Class cls = this.f4907j;
        if (cls != null) {
            sb.append(",valueFilter=");
            sb.append(cls.getName());
            sb.append(".class");
        }
        Class cls2 = this.f4908k;
        if (cls2 != null) {
            sb.append(",contentFilter=");
            sb.append(cls2.getName());
            sb.append(".class");
        }
        sb.append(')');
        return sb.toString();
    }
}
