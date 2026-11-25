package p095r4;

import B.AbstractC0013g0;
import E4.k;
import X.y;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p006b.a;
import p015c2.AbstractC0473d;
import p089q4.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f11781k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f11782h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11783j;

    static {
        b bVar = new b(0);
        bVar.f11783j = true;
        f11781k = bVar;
    }

    public b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f11782h = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i = this.i;
        ((AbstractList) this).modCount++;
        m(i, 1);
        this.f11782h[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.f("elements", collection);
        l();
        int size = collection.size();
        j(this.i, collection, size);
        return size > 0;
    }

    @Override // p089q4.f
    public final int c() {
        return this.i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        o(0, this.i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (AbstractC0473d.h(this.f11782h, 0, this.i, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p089q4.f
    public final Object g(int i) {
        l();
        int i3 = this.i;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        return n(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i3 = this.i;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        return this.f11782h[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f11782h;
        int i = this.i;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.i; i++) {
            if (k.a(this.f11782h[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        m(i, i3);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i3; i6++) {
            this.f11782h[i + i6] = it.next();
        }
    }

    public final void k(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m(i, 1);
        this.f11782h[i] = obj;
    }

    public final void l() {
        if (this.f11783j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.i - 1; i >= 0; i--) {
            if (k.a(this.f11782h[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i, int i3) {
        int i6 = this.i + i3;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f11782h;
        if (i6 > objArr.length) {
            int length = objArr.length;
            int i7 = length + (length >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i7);
            k.e("copyOf(...)", objArrCopyOf);
            this.f11782h = objArrCopyOf;
        }
        Object[] objArr2 = this.f11782h;
        p089q4.k.e0(objArr2, objArr2, i + i3, i, this.i);
        this.i += i3;
    }

    public final Object n(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f11782h;
        Object obj = objArr[i];
        p089q4.k.e0(objArr, objArr, i, i + 1, this.i);
        Object[] objArr2 = this.f11782h;
        int i3 = this.i - 1;
        k.f("<this>", objArr2);
        objArr2[i3] = null;
        this.i--;
        return obj;
    }

    public final void o(int i, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f11782h;
        p089q4.k.e0(objArr, objArr, i, i + i3, this.i);
        Object[] objArr2 = this.f11782h;
        int i6 = this.i;
        AbstractC0473d.Q(i6 - i3, i6, objArr2);
        this.i -= i3;
    }

    public final int p(int i, int i3, Collection collection, boolean z5) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            int i8 = i + i6;
            if (collection.contains(this.f11782h[i8]) == z5) {
                Object[] objArr = this.f11782h;
                i6++;
                objArr[i7 + i] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i3 - i7;
        Object[] objArr2 = this.f11782h;
        p089q4.k.e0(objArr2, objArr2, i + i7, i3 + i, this.i);
        Object[] objArr3 = this.f11782h;
        int i10 = this.i;
        AbstractC0473d.Q(i10 - i9, i10, objArr3);
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.i -= i9;
        return i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            g(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        k.f("elements", collection);
        l();
        return p(0, this.i, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k.f("elements", collection);
        l();
        return p(0, this.i, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        int i3 = this.i;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        Object[] objArr = this.f11782h;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i3) {
        a.r(i, i3, this.i);
        return new a(this.f11782h, i, i3 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.f("array", objArr);
        int length = objArr.length;
        int i = this.i;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f11782h, 0, i, objArr.getClass());
            k.e("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        p089q4.k.e0(this.f11782h, objArr, 0, 0, i);
        int i3 = this.i;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0473d.i(this.f11782h, 0, this.i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i3 = this.i;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        return new y(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k.f("elements", collection);
        l();
        int i3 = this.i;
        if (i >= 0 && i <= i3) {
            int size = collection.size();
            j(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        int i3 = this.i;
        if (i >= 0 && i <= i3) {
            ((AbstractList) this).modCount++;
            m(i, 1);
            this.f11782h[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return p089q4.k.i0(0, this.i, this.f11782h);
    }
}
