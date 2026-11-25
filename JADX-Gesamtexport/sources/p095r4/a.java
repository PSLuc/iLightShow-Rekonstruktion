package p095r4;

import B.AbstractC0013g0;
import E4.k;
import X.y;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p015c2.AbstractC0473d;
import p089q4.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f11777h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f11779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f11780l;

    public a(Object[] objArr, int i, int i3, a aVar, b bVar) {
        k.f("backing", objArr);
        k.f("root", bVar);
        this.f11777h = objArr;
        this.i = i;
        this.f11778j = i3;
        this.f11779k = aVar;
        this.f11780l = bVar;
        ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m();
        l();
        k(this.i + this.f11778j, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.f("elements", collection);
        m();
        l();
        int size = collection.size();
        j(this.i + this.f11778j, collection, size);
        return size > 0;
    }

    @Override // p089q4.f
    public final int c() {
        l();
        return this.f11778j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m();
        l();
        o(this.i, this.f11778j);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        l();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return AbstractC0473d.h(this.f11777h, this.i, this.f11778j, (List) obj);
        }
        return false;
    }

    @Override // p089q4.f
    public final Object g(int i) {
        m();
        l();
        int i3 = this.f11778j;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        return n(this.i + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        l();
        int i3 = this.f11778j;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        return this.f11777h[this.i + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        l();
        Object[] objArr = this.f11777h;
        int i = this.f11778j;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        l();
        for (int i = 0; i < this.f11778j; i++) {
            if (k.a(this.f11777h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        l();
        return this.f11778j == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        b bVar = this.f11780l;
        a aVar = this.f11779k;
        if (aVar != null) {
            aVar.j(i, collection, i3);
        } else {
            b bVar2 = b.f11781k;
            bVar.j(i, collection, i3);
        }
        this.f11777h = bVar.f11782h;
        this.f11778j += i3;
    }

    public final void k(int i, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f11780l;
        a aVar = this.f11779k;
        if (aVar != null) {
            aVar.k(i, obj);
        } else {
            b bVar2 = b.f11781k;
            bVar.k(i, obj);
        }
        this.f11777h = bVar.f11782h;
        this.f11778j++;
    }

    public final void l() {
        if (((AbstractList) this.f11780l).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        l();
        for (int i = this.f11778j - 1; i >= 0; i--) {
            if (k.a(this.f11777h[this.i + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m() {
        if (this.f11780l.f11783j) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object n(int i) {
        Object objN;
        ((AbstractList) this).modCount++;
        a aVar = this.f11779k;
        if (aVar != null) {
            objN = aVar.n(i);
        } else {
            b bVar = b.f11781k;
            objN = this.f11780l.n(i);
        }
        this.f11778j--;
        return objN;
    }

    public final void o(int i, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f11779k;
        if (aVar != null) {
            aVar.o(i, i3);
        } else {
            b bVar = b.f11781k;
            this.f11780l.o(i, i3);
        }
        this.f11778j -= i3;
    }

    public final int p(int i, int i3, Collection collection, boolean z5) {
        int iP;
        a aVar = this.f11779k;
        if (aVar != null) {
            iP = aVar.p(i, i3, collection, z5);
        } else {
            b bVar = b.f11781k;
            iP = this.f11780l.p(i, i3, collection, z5);
        }
        if (iP > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f11778j -= iP;
        return iP;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m();
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
        m();
        l();
        return p(this.i, this.f11778j, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k.f("elements", collection);
        m();
        l();
        return p(this.i, this.f11778j, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m();
        l();
        int i3 = this.f11778j;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        Object[] objArr = this.f11777h;
        int i6 = this.i;
        Object obj2 = objArr[i6 + i];
        objArr[i6 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i3) {
        p006b.a.r(i, i3, this.f11778j);
        return new a(this.f11777h, this.i + i, i3 - i, this, this.f11780l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.f("array", objArr);
        l();
        int length = objArr.length;
        int i = this.f11778j;
        int i3 = this.i;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f11777h, i3, i + i3, objArr.getClass());
            k.e("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        p089q4.k.e0(this.f11777h, objArr, 0, i3, i + i3);
        int i6 = this.f11778j;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        l();
        return AbstractC0473d.i(this.f11777h, this.i, this.f11778j, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        l();
        int i3 = this.f11778j;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        return new y(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m();
        l();
        int i3 = this.f11778j;
        if (i >= 0 && i <= i3) {
            k(this.i + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k.f("elements", collection);
        m();
        l();
        int i3 = this.f11778j;
        if (i >= 0 && i <= i3) {
            int size = collection.size();
            j(this.i + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        l();
        Object[] objArr = this.f11777h;
        int i = this.f11778j;
        int i3 = this.i;
        return p089q4.k.i0(i3, i + i3, objArr);
    }
}
