package p037g2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import p012c.k;
import p015c2.A;
import p032f2.r;

/* JADX INFO: renamed from: g2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0719c implements Iterable, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9113h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f9116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r[] f9117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f9118n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f9119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Locale f9120p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap] */
    public C0719c(boolean z5, Collection collection, Map map, Locale locale) {
        ?? map2;
        this.f9113h = z5;
        this.f9117m = (r[]) collection.toArray(new r[collection.size()]);
        this.f9118n = map;
        this.f9120p = locale;
        if (map == null || map.isEmpty()) {
            map2 = Collections.EMPTY_MAP;
        } else {
            map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                String lowerCase = (String) entry.getKey();
                lowerCase = z5 ? lowerCase.toLowerCase(locale) : lowerCase;
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    String lowerCase2 = ((A) it.next()).f7195h;
                    if (z5) {
                        lowerCase2 = lowerCase2.toLowerCase(locale);
                    }
                    map2.put(lowerCase2, lowerCase);
                }
            }
        }
        this.f9119o = map2;
        k(collection);
    }

    public final int c(r rVar) {
        r[] rVarArr = this.f9117m;
        int length = rVarArr.length;
        for (int i = 0; i < length; i++) {
            if (rVarArr[i] == rVar) {
                return i;
            }
        }
        throw new IllegalStateException(k.u(new StringBuilder("Illegal state: property '"), rVar.f8933j.f7195h, "' missing from _propsInOrder"));
    }

    public final r d(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode() & this.i;
        int i = iHashCode << 1;
        Object obj = this.f9116l[i];
        if (str.equals(obj)) {
            return (r) this.f9116l[i + 1];
        }
        if (obj == null) {
            return null;
        }
        int i3 = this.i + 1;
        int i6 = ((iHashCode >> 1) + i3) << 1;
        Object obj2 = this.f9116l[i6];
        if (str.equals(obj2)) {
            return (r) this.f9116l[i6 + 1];
        }
        if (obj2 != null) {
            int i7 = (i3 + (i3 >> 1)) << 1;
            int i8 = this.f9115k + i7;
            while (i7 < i8) {
                Object obj3 = this.f9116l[i7];
                if (obj3 == str || str.equals(obj3)) {
                    return (r) this.f9116l[i7 + 1];
                }
                i7 += 2;
            }
        }
        return null;
    }

    public final void g() {
        int length = this.f9116l.length;
        int i = 0;
        for (int i3 = 1; i3 < length; i3 += 2) {
            r rVar = (r) this.f9116l[i3];
            if (rVar != null) {
                rVar.h(i);
                i++;
            }
        }
    }

    public final r i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if (this.f9113h) {
            str = str.toLowerCase(this.f9120p);
        }
        int iHashCode = str.hashCode() & this.i;
        int i = iHashCode << 1;
        Object obj = this.f9116l[i];
        if (obj == str || str.equals(obj)) {
            return (r) this.f9116l[i + 1];
        }
        Map map = this.f9119o;
        if (obj == null) {
            return d((String) map.get(str));
        }
        int i3 = this.i + 1;
        int i6 = ((iHashCode >> 1) + i3) << 1;
        Object obj2 = this.f9116l[i6];
        if (str.equals(obj2)) {
            return (r) this.f9116l[i6 + 1];
        }
        if (obj2 != null) {
            int i7 = (i3 + (i3 >> 1)) << 1;
            int i8 = this.f9115k + i7;
            while (i7 < i8) {
                Object obj3 = this.f9116l[i7];
                if (obj3 == str || str.equals(obj3)) {
                    return (r) this.f9116l[i7 + 1];
                }
                i7 += 2;
            }
        }
        return d((String) map.get(str));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList(this.f9114j);
        int length = this.f9116l.length;
        for (int i = 1; i < length; i += 2) {
            r rVar = (r) this.f9116l[i];
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList.iterator();
    }

    public final String j(r rVar) {
        return this.f9113h ? rVar.f8933j.f7195h.toLowerCase(this.f9120p) : rVar.f8933j.f7195h;
    }

    public final void k(Collection collection) {
        int i;
        int size = collection.size();
        this.f9114j = size;
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i3 = 32;
            while (i3 < size + (size >> 2)) {
                i3 += i3;
            }
            i = i3;
        }
        this.i = i - 1;
        int i6 = (i >> 1) + i;
        Object[] objArrCopyOf = new Object[i6 * 2];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                String strJ = j(rVar);
                int iHashCode = strJ.hashCode() & this.i;
                int i8 = iHashCode << 1;
                if (objArrCopyOf[i8] != null) {
                    i8 = ((iHashCode >> 1) + i) << 1;
                    if (objArrCopyOf[i8] != null) {
                        i8 = (i6 << 1) + i7;
                        i7 += 2;
                        if (i8 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i8] = strJ;
                objArrCopyOf[i8 + 1] = rVar;
            }
        }
        this.f9116l = objArrCopyOf;
        this.f9115k = i7;
    }

    public final void l(r rVar) {
        ArrayList arrayList = new ArrayList(this.f9114j);
        String strJ = j(rVar);
        int length = this.f9116l.length;
        boolean zEquals = false;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = this.f9116l;
            r rVar2 = (r) objArr[i];
            if (rVar2 != null) {
                if (zEquals || !(zEquals = strJ.equals(objArr[i - 1]))) {
                    arrayList.add(rVar2);
                } else {
                    this.f9117m[c(rVar2)] = null;
                }
            }
        }
        if (!zEquals) {
            throw new NoSuchElementException(k.u(new StringBuilder("No entry '"), rVar.f8933j.f7195h, "' found, can't remove"));
        }
        k(arrayList);
    }

    public final C0719c m(t tVar) {
        String strJ = j(tVar);
        int length = this.f9116l.length;
        for (int i = 1; i < length; i += 2) {
            r rVar = (r) this.f9116l[i];
            if (rVar != null && rVar.f8933j.f7195h.equals(strJ)) {
                return new C0719c(this, tVar, i, c(rVar));
            }
        }
        return new C0719c(this, tVar, strJ, strJ.hashCode() & this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Properties=[");
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            r rVar = (r) it.next();
            int i3 = i + 1;
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(rVar.f8933j.f7195h);
            sb.append('(');
            sb.append(rVar.f8934k);
            sb.append(')');
            i = i3;
        }
        sb.append(']');
        Map map = this.f9118n;
        if (!map.isEmpty()) {
            sb.append("(aliases: ");
            sb.append(map);
            sb.append(")");
        }
        return sb.toString();
    }

    public C0719c(C0719c c0719c, t tVar, int i, int i3) {
        this.f9113h = c0719c.f9113h;
        this.f9120p = c0719c.f9120p;
        this.i = c0719c.i;
        this.f9114j = c0719c.f9114j;
        this.f9115k = c0719c.f9115k;
        this.f9118n = c0719c.f9118n;
        this.f9119o = c0719c.f9119o;
        Object[] objArr = c0719c.f9116l;
        this.f9116l = Arrays.copyOf(objArr, objArr.length);
        r[] rVarArr = c0719c.f9117m;
        r[] rVarArr2 = (r[]) Arrays.copyOf(rVarArr, rVarArr.length);
        this.f9117m = rVarArr2;
        this.f9116l[i] = tVar;
        rVarArr2[i3] = tVar;
    }

    public C0719c(C0719c c0719c, t tVar, String str, int i) {
        this.f9113h = c0719c.f9113h;
        this.f9120p = c0719c.f9120p;
        this.i = c0719c.i;
        this.f9114j = c0719c.f9114j;
        this.f9115k = c0719c.f9115k;
        this.f9118n = c0719c.f9118n;
        this.f9119o = c0719c.f9119o;
        Object[] objArr = c0719c.f9116l;
        this.f9116l = Arrays.copyOf(objArr, objArr.length);
        r[] rVarArr = c0719c.f9117m;
        int length = rVarArr.length;
        r[] rVarArr2 = (r[]) Arrays.copyOf(rVarArr, length + 1);
        this.f9117m = rVarArr2;
        rVarArr2[length] = tVar;
        int i3 = this.i + 1;
        int i6 = i << 1;
        Object[] objArr2 = this.f9116l;
        if (objArr2[i6] != null) {
            i6 = ((i >> 1) + i3) << 1;
            if (objArr2[i6] != null) {
                int i7 = this.f9115k;
                i6 = ((i3 + (i3 >> 1)) << 1) + i7;
                this.f9115k = i7 + 2;
                if (i6 >= objArr2.length) {
                    this.f9116l = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.f9116l;
        objArr3[i6] = str;
        objArr3[i6 + 1] = tVar;
    }

    public C0719c(C0719c c0719c, boolean z5) {
        this.f9113h = z5;
        this.f9120p = c0719c.f9120p;
        this.f9118n = c0719c.f9118n;
        this.f9119o = c0719c.f9119o;
        r[] rVarArr = c0719c.f9117m;
        r[] rVarArr2 = (r[]) Arrays.copyOf(rVarArr, rVarArr.length);
        this.f9117m = rVarArr2;
        k(Arrays.asList(rVarArr2));
    }
}
