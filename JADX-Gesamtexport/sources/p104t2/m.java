package p104t2;

import B.AbstractC0013g0;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p015c2.h;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f12527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h[] f12528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m f12529n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f12530h;
    public final h[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String[] f12531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12532k;

    static {
        String[] strArr = new String[0];
        f12527l = strArr;
        h[] hVarArr = new h[0];
        f12528m = hVarArr;
        f12529n = new m(strArr, hVarArr, null);
    }

    public m(String[] strArr, h[] hVarArr, String[] strArr2) {
        strArr = strArr == null ? f12527l : strArr;
        this.f12530h = strArr;
        hVarArr = hVarArr == null ? f12528m : hVarArr;
        this.i = hVarArr;
        if (strArr.length != hVarArr.length) {
            StringBuilder sb = new StringBuilder("Mismatching names (");
            sb.append(strArr.length);
            sb.append("), types (");
            throw new IllegalArgumentException(AbstractC0013g0.l(sb, hVarArr.length, ")"));
        }
        int length = hVarArr.length;
        int i = 1;
        for (int i3 = 0; i3 < length; i3++) {
            i += this.i[i3].f7282l;
        }
        this.f12531j = strArr2;
        this.f12532k = i;
    }

    public static m a(h hVar, Class cls) {
        TypeVariable[] typeParameters;
        if (cls == Collection.class) {
            typeParameters = l.f12520b;
        } else if (cls == List.class) {
            typeParameters = l.f12522d;
        } else if (cls == ArrayList.class) {
            typeParameters = l.f12523e;
        } else if (cls == AbstractList.class) {
            typeParameters = l.f12519a;
        } else if (cls == Iterable.class) {
            typeParameters = l.f12521c;
        } else {
            TypeVariable[] typeVariableArr = l.f12519a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 1) {
            return new m(new String[]{typeParameters[0].getName()}, new h[]{hVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static m b(Class cls, h hVar, h hVar2) {
        TypeVariable[] typeParameters;
        if (cls == Map.class) {
            typeParameters = l.f12524f;
        } else if (cls == HashMap.class) {
            typeParameters = l.f12525g;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = l.f12526h;
        } else {
            TypeVariable[] typeVariableArr = l.f12519a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 2) {
            return new m(new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, new h[]{hVar, hVar2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static m c(Class cls, h[] hVarArr) {
        String[] strArr;
        if (hVarArr == null) {
            hVarArr = f12528m;
        } else {
            int length = hVarArr.length;
            if (length == 1) {
                return a(hVarArr[0], cls);
            }
            if (length == 2) {
                return b(cls, hVarArr[0], hVarArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = f12527l;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == hVarArr.length) {
            return new m(strArr, hVarArr, null);
        }
        StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
        sb.append(cls.getName());
        sb.append(" with ");
        sb.append(hVarArr.length);
        sb.append(" type parameter");
        sb.append(hVarArr.length == 1 ? "" : "s");
        sb.append(": class expects ");
        sb.append(strArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public final h d(int i) {
        if (i < 0) {
            return null;
        }
        h[] hVarArr = this.i;
        if (i >= hVarArr.length) {
            return null;
        }
        return hVarArr[i];
    }

    public final List e() {
        h[] hVarArr = this.i;
        return hVarArr.length == 0 ? Collections.EMPTY_LIST : Arrays.asList(hVarArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i.s(m.class, obj)) {
            return false;
        }
        h[] hVarArr = this.i;
        int length = hVarArr.length;
        h[] hVarArr2 = ((m) obj).i;
        if (length != hVarArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!hVarArr2[i].equals(hVarArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.i.length == 0;
    }

    public final int hashCode() {
        return this.f12532k;
    }

    public final String toString() {
        h[] hVarArr = this.i;
        if (hVarArr.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder("<");
        int length = hVarArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            h hVar = hVarArr[i];
            StringBuilder sb2 = new StringBuilder(40);
            hVar.a0(sb2);
            sb.append(sb2.toString());
        }
        sb.append('>');
        return sb.toString();
    }
}
