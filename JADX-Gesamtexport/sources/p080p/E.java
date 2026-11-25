package p080p;

import E4.k;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p085q.a;

/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f10716h;
    public Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10717j;

    public E(int i) {
        this.f10716h = i == 0 ? a.f11185a : new int[i];
        this.i = i == 0 ? a.f11187c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f10717j * 2;
        Object[] objArr = this.i;
        if (obj == null) {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i3 = this.f10717j;
        if (i3 == 0) {
            return -1;
        }
        int iA = a.a(i3, i, this.f10716h);
        if (iA < 0 || k.a(obj, this.i[iA << 1])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i3 && this.f10716h[i6] == i) {
            if (k.a(obj, this.i[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f10716h[i7] == i; i7--) {
            if (k.a(obj, this.i[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public final int c(Object obj) {
        return obj == null ? e() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f10717j > 0) {
            this.f10716h = a.f11185a;
            this.i = a.f11187c;
            this.f10717j = 0;
        }
        if (this.f10717j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int e() {
        int i = this.f10717j;
        if (i == 0) {
            return -1;
        }
        int iA = a.a(i, 0, this.f10716h);
        if (iA < 0 || this.i[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i && this.f10716h[i3] == 0) {
            if (this.i[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f10716h[i6] == 0; i6--) {
            if (this.i[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof E) {
                int i = this.f10717j;
                if (i != ((E) obj).f10717j) {
                    return false;
                }
                E e6 = (E) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    Object objF = f(i3);
                    Object objI = i(i3);
                    Object obj2 = e6.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !e6.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f10717j != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.f10717j;
            for (int i7 = 0; i7 < i6; i7++) {
                Object objF2 = f(i7);
                Object objI2 = i(i7);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z5 = false;
        if (i >= 0 && i < this.f10717j) {
            z5 = true;
        }
        if (z5) {
            return this.i[i << 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object g(int i) {
        if (!(i >= 0 && i < this.f10717j)) {
            a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.i;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        int i6 = this.f10717j;
        if (i6 <= 1) {
            clear();
            return obj;
        }
        int i7 = i6 - 1;
        int[] iArr = this.f10716h;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            if (i < i7) {
                int i8 = i + 1;
                p089q4.k.c0(i, i8, i6, iArr, iArr);
                Object[] objArr2 = this.i;
                p089q4.k.e0(objArr2, objArr2, i3, i8 << 1, i6 << 1);
            }
            Object[] objArr3 = this.i;
            int i9 = i7 << 1;
            objArr3[i9] = null;
            objArr3[i9 + 1] = null;
        } else {
            int i10 = i6 > 8 ? i6 + (i6 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f10716h = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.i, i10 << 1);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.i = objArrCopyOf;
            if (i6 != this.f10717j) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                p089q4.k.c0(0, 0, i, iArr, this.f10716h);
                p089q4.k.e0(objArr, this.i, 0, 0, i3);
            }
            if (i < i7) {
                int i11 = i + 1;
                p089q4.k.c0(i, i11, i6, iArr, this.f10716h);
                p089q4.k.e0(objArr, this.i, i3, i11 << 1, i6 << 1);
            }
        }
        if (i6 != this.f10717j) {
            throw new ConcurrentModificationException();
        }
        this.f10717j = i7;
        return obj;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.i[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.i[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z5 = false;
        if (i >= 0 && i < this.f10717j) {
            z5 = true;
        }
        if (!z5) {
            a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i3 = (i << 1) + 1;
        Object[] objArr = this.i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f10716h;
        Object[] objArr = this.i;
        int i = this.f10717j;
        int i3 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        boolean z5 = false;
        if (i >= 0 && i < this.f10717j) {
            z5 = true;
        }
        if (z5) {
            return this.i[(i << 1) + 1];
        }
        a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f10717j <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.f10717j;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : e();
        if (iB >= 0) {
            int i3 = (iB << 1) + 1;
            Object[] objArr = this.i;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i6 = ~iB;
        int[] iArr = this.f10716h;
        if (i >= iArr.length) {
            int i7 = 8;
            if (i >= 8) {
                i7 = (i >> 1) + i;
            } else if (i < 4) {
                i7 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f10716h = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.i, i7 << 1);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.i = objArrCopyOf;
            if (i != this.f10717j) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i) {
            int[] iArr2 = this.f10716h;
            int i8 = i6 + 1;
            p089q4.k.c0(i8, i6, i, iArr2, iArr2);
            Object[] objArr2 = this.i;
            p089q4.k.e0(objArr2, objArr2, i8 << 1, i6 << 1, this.f10717j << 1);
        }
        int i9 = this.f10717j;
        if (i == i9) {
            int[] iArr3 = this.f10716h;
            if (i6 < iArr3.length) {
                iArr3[i6] = iHashCode;
                Object[] objArr3 = this.i;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.f10717j = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return h(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f10717j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10717j * 28);
        sb.append('{');
        int i = this.f10717j;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objF = f(i3);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i3);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        k.e("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !k.a(obj2, i(iC))) {
            return false;
        }
        g(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !k.a(obj2, i(iC))) {
            return false;
        }
        h(iC, obj3);
        return true;
    }
}
