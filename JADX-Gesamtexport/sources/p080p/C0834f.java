package p080p;

import F4.b;
import F4.f;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p085q.a;
import p089q4.k;
import p089q4.l;

/* JADX INFO: renamed from: p.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0834f implements Collection, Set, b, f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f10733h = a.f11185a;
    public Object[] i = a.f11187c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10734j;

    public C0834f(Object obj) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iC;
        int i3 = this.f10734j;
        if (obj == null) {
            iC = m.c(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iC = m.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i6 = ~iC;
        int[] iArr = this.f10733h;
        if (i3 >= iArr.length) {
            int i7 = 8;
            if (i3 >= 8) {
                i7 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.i;
            m.b(this, i7);
            if (i3 != this.f10734j) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f10733h;
            if (iArr2.length != 0) {
                k.f0(0, iArr.length, 6, iArr, iArr2);
                k.g0(objArr, this.i, 0, objArr.length, 6);
            }
        }
        if (i6 < i3) {
            int[] iArr3 = this.f10733h;
            int i8 = i6 + 1;
            k.c0(i8, i6, i3, iArr3, iArr3);
            Object[] objArr2 = this.i;
            k.e0(objArr2, objArr2, i8, i6, i3);
        }
        int i9 = this.f10734j;
        if (i3 == i9) {
            int[] iArr4 = this.f10733h;
            if (i6 < iArr4.length) {
                iArr4[i6] = i;
                this.i[i6] = obj;
                this.f10734j = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        E4.k.f("elements", collection);
        int size = collection.size() + this.f10734j;
        int i = this.f10734j;
        int[] iArr = this.f10733h;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.i;
            m.b(this, size);
            int i3 = this.f10734j;
            if (i3 > 0) {
                k.f0(0, i3, 6, iArr, this.f10733h);
                k.g0(objArr, this.i, 0, this.f10734j, 6);
            }
        }
        if (this.f10734j != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object c(int i) {
        int i3 = this.f10734j;
        Object[] objArr = this.i;
        Object obj = objArr[i];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i6 = i3 - 1;
        int[] iArr = this.f10733h;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i6) {
                int i7 = i + 1;
                k.c0(i, i7, i3, iArr, iArr);
                Object[] objArr2 = this.i;
                k.e0(objArr2, objArr2, i, i7, i3);
            }
            this.i[i6] = null;
        } else {
            m.b(this, i3 > 8 ? i3 + (i3 >> 1) : 8);
            if (i > 0) {
                k.f0(0, i, 6, iArr, this.f10733h);
                k.g0(objArr, this.i, 0, i, 6);
            }
            if (i < i6) {
                int i8 = i + 1;
                k.c0(i, i8, i3, iArr, this.f10733h);
                k.e0(objArr, this.i, i, i8, i3);
            }
        }
        if (i3 != this.f10734j) {
            throw new ConcurrentModificationException();
        }
        this.f10734j = i6;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f10734j != 0) {
            this.f10733h = a.f11185a;
            this.i = a.f11187c;
            this.f10734j = 0;
        }
        if (this.f10734j != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m.c(this, null, 0) : m.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        E4.k.f("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f10734j != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f10734j;
            for (int i3 = 0; i3 < i; i3++) {
                if (!((Set) obj).contains(this.i[i3])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f10733h;
        int i = this.f10734j;
        int i3 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i3 += iArr[i6];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f10734j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0829a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? m.c(this, null, 0) : m.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        c(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        E4.k.f("elements", collection);
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        E4.k.f("elements", collection);
        boolean z5 = false;
        for (int i = this.f10734j - 1; -1 < i; i--) {
            Collection collection2 = collection;
            Object obj = this.i[i];
            if (!(collection2 instanceof Collection ? collection2.contains(obj) : l.b0(collection2, obj) >= 0)) {
                c(i);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f10734j;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return k.i0(0, this.f10734j, this.i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10734j * 14);
        sb.append('{');
        int i = this.f10734j;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.i[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        E4.k.e("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        E4.k.f("array", objArr);
        int i = this.f10734j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        k.e0(this.i, objArr, 0, 0, this.f10734j);
        return objArr;
    }
}
