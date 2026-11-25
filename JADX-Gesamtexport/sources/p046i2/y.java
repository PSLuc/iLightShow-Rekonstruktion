package p046i2;

import java.lang.reflect.Method;
import p015c2.r;
import p026e2.n;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9582c = "get";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9583d = "is";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9584e;

    public y(n nVar, String str) {
        this.f9580a = nVar.k(r.USE_STD_BEAN_NAMING);
        this.f9581b = nVar.k(r.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this.f9584e = str;
    }

    public static String d(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String e(int i, String str) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        int i3 = i + 1;
        if (i3 < length && Character.isUpperCase(str.charAt(i3))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i3, length);
        return sb.toString();
    }

    public final String a(C0772h c0772h, String str) {
        String str2 = this.f9583d;
        if (str2 == null) {
            return null;
        }
        Class<?> returnType = c0772h.f9547l.getReturnType();
        if ((this.f9581b || returnType == Boolean.class || returnType == Boolean.TYPE) && str.startsWith(str2)) {
            return this.f9580a ? e(2, str) : d(2, str);
        }
        return null;
    }

    public final String b(String str) {
        String str2 = this.f9584e;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.f9580a ? e(str2.length(), str) : d(str2.length(), str);
    }

    public String c(C0772h c0772h, String str) {
        String str2 = this.f9582c;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        boolean zEquals = "getCallbacks".equals(str);
        Method method = c0772h.f9547l;
        if (zEquals) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isArray()) {
                String name = returnType.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    return null;
                }
            }
        } else if ("getMetaClass".equals(str) && method.getReturnType().getName().startsWith("groovy.lang")) {
            return null;
        }
        return this.f9580a ? e(str2.length(), str) : d(str2.length(), str);
    }
}
