package p015c2;

import V1.h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final A f7193k = new A("", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final A f7194l = new A(new String(""), null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7195h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f7196j;

    public A(String str, String str2) {
        Annotation[] annotationArr = i.f12697a;
        this.f7195h = str == null ? "" : str;
        this.i = str2;
    }

    public static A a(String str) {
        return (str == null || str.isEmpty()) ? f7193k : new A(p009b2.h.i.a(str), null);
    }

    public static A b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? f7193k : new A(p009b2.h.i.a(str), str2);
    }

    public final boolean c() {
        return this.i == null && this.f7195h.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != A.class) {
            return false;
        }
        A a6 = (A) obj;
        String str = a6.f7195h;
        String str2 = this.f7195h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = a6.i;
        String str4 = this.i;
        if (str4 == null) {
            return str3 == null;
        }
        return str4.equals(str3);
    }

    public final int hashCode() {
        String str = this.f7195h;
        String str2 = this.i;
        return str2 == null ? str.hashCode() : str2.hashCode() ^ str.hashCode();
    }

    public final String toString() {
        String str = this.f7195h;
        String str2 = this.i;
        if (str2 == null) {
            return str;
        }
        return "{" + str2 + "}" + str;
    }
}
