package p095r4;

import E4.k;
import F4.e;
import S.j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Map, Serializable, e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f11789u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f11790h;
    public Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f11791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f11792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f11798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f11799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g f11800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11801t;

    static {
        f fVar = new f(0);
        fVar.f11801t = true;
        f11789u = fVar;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f11790h = objArr;
        this.i = null;
        this.f11791j = iArr;
        this.f11792k = new int[iHighestOneBit];
        this.f11793l = 2;
        this.f11794m = 0;
        this.f11795n = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int iJ = j(obj);
            int i = this.f11793l * 2;
            int length = this.f11792k.length / 2;
            if (i > length) {
                i = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.f11792k;
                int i6 = iArr[iJ];
                if (i6 <= 0) {
                    int i7 = this.f11794m;
                    Object[] objArr = this.f11790h;
                    if (i7 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i8 = i7 + 1;
                    this.f11794m = i8;
                    objArr[i7] = obj;
                    this.f11791j[i7] = iJ;
                    iArr[iJ] = i8;
                    this.f11797p++;
                    this.f11796o++;
                    if (i3 > this.f11793l) {
                        this.f11793l = i3;
                    }
                    return i7;
                }
                if (k.a(this.f11790h[i6 - 1], obj)) {
                    return -i6;
                }
                i3++;
                if (i3 > i) {
                    k(this.f11792k.length * 2);
                    break;
                }
                iJ = iJ == 0 ? this.f11792k.length - 1 : iJ - 1;
            }
        }
    }

    public final void b() {
        if (this.f11801t) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z5) {
        int i;
        Object[] objArr = this.i;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            i = this.f11794m;
            if (i3 >= i) {
                break;
            }
            int[] iArr = this.f11791j;
            int i7 = iArr[i3];
            if (i7 >= 0) {
                Object[] objArr2 = this.f11790h;
                objArr2[i6] = objArr2[i3];
                if (objArr != null) {
                    objArr[i6] = objArr[i3];
                }
                if (z5) {
                    iArr[i6] = i7;
                    this.f11792k[i7] = i6 + 1;
                }
                i6++;
            }
            i3++;
        }
        AbstractC0473d.Q(i6, i, this.f11790h);
        if (objArr != null) {
            AbstractC0473d.Q(i6, this.f11794m, objArr);
        }
        this.f11794m = i6;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.f11794m - 1;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f11791j;
                int i6 = iArr[i3];
                if (i6 >= 0) {
                    this.f11792k[i6] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        AbstractC0473d.Q(0, this.f11794m, this.f11790h);
        Object[] objArr = this.i;
        if (objArr != null) {
            AbstractC0473d.Q(0, this.f11794m, objArr);
        }
        this.f11797p = 0;
        this.f11794m = 0;
        this.f11796o++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final boolean e(Collection collection) {
        k.f("m", collection);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f11800s;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f11800s = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f11797p == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        k.f("entry", entry);
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.i;
        k.c(objArr);
        return k.a(objArr[iH], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f11790h;
        int length = objArr.length;
        int i3 = this.f11794m;
        int i6 = length - i3;
        int i7 = i3 - this.f11797p;
        if (i6 < i && i6 + i7 >= i && i7 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i8 = i3 + i;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > objArr.length) {
            int length2 = objArr.length;
            int i9 = length2 + (length2 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i9);
            k.e("copyOf(...)", objArrCopyOf2);
            this.f11790h = objArrCopyOf2;
            Object[] objArr2 = this.i;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i9);
                k.e("copyOf(...)", objArrCopyOf);
            } else {
                objArrCopyOf = null;
            }
            this.i = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f11791j, i9);
            k.e("copyOf(...)", iArrCopyOf);
            this.f11791j = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i9 >= 1 ? i9 : 1) * 3);
            if (iHighestOneBit > this.f11792k.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.i;
        k.c(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.f11793l;
        while (true) {
            int i3 = this.f11792k[iJ];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i6 = i3 - 1;
                if (k.a(this.f11790h[i6], obj)) {
                    return i6;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f11792k.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i = 0;
        while (cVar.hasNext()) {
            int i3 = cVar.f11786h;
            f fVar = (f) cVar.f11788k;
            if (i3 >= fVar.f11794m) {
                throw new NoSuchElementException();
            }
            cVar.f11786h = i3 + 1;
            cVar.i = i3;
            Object obj = fVar.f11790h[i3];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.i;
            k.c(objArr);
            Object obj2 = objArr[cVar.i];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f11794m;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f11791j[i] >= 0) {
                Object[] objArr = this.i;
                k.c(objArr);
                if (k.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11797p == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f11795n;
    }

    public final void k(int i) {
        int[] iArr;
        this.f11796o++;
        int i3 = 0;
        if (this.f11794m > this.f11797p) {
            c(false);
        }
        this.f11792k = new int[i];
        this.f11795n = Integer.numberOfLeadingZeros(i) + 1;
        while (i3 < this.f11794m) {
            int i6 = i3 + 1;
            int iJ = j(this.f11790h[i3]);
            int i7 = this.f11793l;
            while (true) {
                iArr = this.f11792k;
                if (iArr[iJ] == 0) {
                    break;
                }
                i7--;
                if (i7 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iJ = iJ == 0 ? iArr.length - 1 : iJ - 1;
            }
            iArr[iJ] = i6;
            this.f11791j[i3] = iJ;
            i3 = i6;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f11798q;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f11798q = gVar2;
        return gVar2;
    }

    public final void l(int i) {
        Object[] objArr = this.f11790h;
        k.f("<this>", objArr);
        objArr[i] = null;
        Object[] objArr2 = this.i;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f11791j[i];
        int i3 = this.f11793l * 2;
        int length2 = this.f11792k.length / 2;
        if (i3 > length2) {
            i3 = length2;
        }
        int i6 = i3;
        int i7 = 0;
        int i8 = length;
        do {
            length = length == 0 ? this.f11792k.length - 1 : length - 1;
            i7++;
            if (i7 > this.f11793l) {
                this.f11792k[i8] = 0;
            } else {
                int[] iArr = this.f11792k;
                int i9 = iArr[length];
                if (i9 == 0) {
                    iArr[i8] = 0;
                } else {
                    if (i9 < 0) {
                        iArr[i8] = -1;
                    } else {
                        int i10 = i9 - 1;
                        int iJ = j(this.f11790h[i10]) - length;
                        int[] iArr2 = this.f11792k;
                        if ((iJ & (iArr2.length - 1)) >= i7) {
                            iArr2[i8] = i9;
                            this.f11791j[i10] = i8;
                        }
                        i6--;
                    }
                    i8 = length;
                    i7 = 0;
                    i6--;
                }
            }
            this.f11791j[i] = -1;
            this.f11797p--;
            this.f11796o++;
        } while (i6 >= 0);
        this.f11792k[i8] = -1;
        this.f11791j[i] = -1;
        this.f11797p--;
        this.f11796o++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.i;
        if (objArr == null) {
            int length = this.f11790h.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.i = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k.f("from", map);
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.i;
            if (objArr == null) {
                int length = this.f11790h.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.i = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!k.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.i;
        k.c(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11797p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f11797p * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i = 0;
        while (cVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i3 = cVar.f11786h;
            f fVar = (f) cVar.f11788k;
            if (i3 >= fVar.f11794m) {
                throw new NoSuchElementException();
            }
            cVar.f11786h = i3 + 1;
            cVar.i = i3;
            Object obj = fVar.f11790h[i3];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.i;
            k.c(objArr);
            Object obj2 = objArr[cVar.i];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.c();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        k.e("toString(...)", string);
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f11799r;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(1, this);
        this.f11799r = jVar2;
        return jVar2;
    }
}
