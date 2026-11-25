package p089q4;

import B.AbstractC0013g0;
import E4.k;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p006b.a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object[] f11232k = new Object[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11233h;
    public Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11234j;

    public j() {
        this.i = f11232k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i3 = this.f11234j;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        p();
        j(this.f11234j + 1);
        int iO = o(this.f11233h + i);
        int i6 = this.f11234j;
        if (i < ((i6 + 1) >> 1)) {
            if (iO == 0) {
                Object[] objArr = this.i;
                k.f("<this>", objArr);
                iO = objArr.length;
            }
            int i7 = iO - 1;
            int i8 = this.f11233h;
            if (i8 == 0) {
                Object[] objArr2 = this.i;
                k.f("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i8 - 1;
            }
            int i9 = this.f11233h;
            if (i7 >= i9) {
                Object[] objArr3 = this.i;
                objArr3[length] = objArr3[i9];
                k.e0(objArr3, objArr3, i9, i9 + 1, i7 + 1);
            } else {
                Object[] objArr4 = this.i;
                k.e0(objArr4, objArr4, i9 - 1, i9, objArr4.length);
                Object[] objArr5 = this.i;
                objArr5[objArr5.length - 1] = objArr5[0];
                k.e0(objArr5, objArr5, 0, 1, i7 + 1);
            }
            this.i[i7] = obj;
            this.f11233h = length;
        } else {
            int iO2 = o(i6 + this.f11233h);
            if (iO < iO2) {
                Object[] objArr6 = this.i;
                k.e0(objArr6, objArr6, iO + 1, iO, iO2);
            } else {
                Object[] objArr7 = this.i;
                k.e0(objArr7, objArr7, 1, 0, iO2);
                Object[] objArr8 = this.i;
                objArr8[0] = objArr8[objArr8.length - 1];
                k.e0(objArr8, objArr8, iO + 1, iO, objArr8.length - 1);
            }
            this.i[iO] = obj;
        }
        this.f11234j++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k.f("elements", collection);
        int i3 = this.f11234j;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f11234j) {
            return addAll(collection);
        }
        p();
        j(collection.size() + this.f11234j);
        int iO = o(this.f11234j + this.f11233h);
        int iO2 = o(this.f11233h + i);
        int size = collection.size();
        if (i >= ((this.f11234j + 1) >> 1)) {
            int i6 = iO2 + size;
            if (iO2 < iO) {
                int i7 = size + iO;
                Object[] objArr = this.i;
                if (i7 <= objArr.length) {
                    k.e0(objArr, objArr, i6, iO2, iO);
                } else if (i6 >= objArr.length) {
                    k.e0(objArr, objArr, i6 - objArr.length, iO2, iO);
                } else {
                    int length = iO - (i7 - objArr.length);
                    k.e0(objArr, objArr, 0, length, iO);
                    Object[] objArr2 = this.i;
                    k.e0(objArr2, objArr2, i6, iO2, length);
                }
            } else {
                Object[] objArr3 = this.i;
                k.e0(objArr3, objArr3, size, 0, iO);
                Object[] objArr4 = this.i;
                if (i6 >= objArr4.length) {
                    k.e0(objArr4, objArr4, i6 - objArr4.length, iO2, objArr4.length);
                } else {
                    k.e0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.i;
                    k.e0(objArr5, objArr5, i6, iO2, objArr5.length - size);
                }
            }
            i(iO2, collection);
            return true;
        }
        int i8 = this.f11233h;
        int length2 = i8 - size;
        if (iO2 < i8) {
            Object[] objArr6 = this.i;
            k.e0(objArr6, objArr6, length2, i8, objArr6.length);
            if (size >= iO2) {
                Object[] objArr7 = this.i;
                k.e0(objArr7, objArr7, objArr7.length - size, 0, iO2);
            } else {
                Object[] objArr8 = this.i;
                k.e0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.i;
                k.e0(objArr9, objArr9, 0, size, iO2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.i;
            k.e0(objArr10, objArr10, length2, i8, iO2);
        } else {
            Object[] objArr11 = this.i;
            length2 += objArr11.length;
            int i9 = iO2 - i8;
            int length3 = objArr11.length - length2;
            if (length3 >= i9) {
                k.e0(objArr11, objArr11, length2, i8, iO2);
            } else {
                k.e0(objArr11, objArr11, length2, i8, i8 + length3);
                Object[] objArr12 = this.i;
                k.e0(objArr12, objArr12, 0, this.f11233h + length3, iO2);
            }
        }
        this.f11233h = length2;
        i(m(iO2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        j(this.f11234j + 1);
        int length = this.f11233h;
        if (length == 0) {
            Object[] objArr = this.i;
            k.f("<this>", objArr);
            length = objArr.length;
        }
        int i = length - 1;
        this.f11233h = i;
        this.i[i] = obj;
        this.f11234j++;
    }

    public final void addLast(Object obj) {
        p();
        j(c() + 1);
        this.i[o(c() + this.f11233h)] = obj;
        this.f11234j = c() + 1;
    }

    @Override // p089q4.f
    public final int c() {
        return this.f11234j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.f11233h, o(c() + this.f11233h));
        }
        this.f11233h = 0;
        this.f11234j = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.i[this.f11233h];
    }

    @Override // p089q4.f
    public final Object g(int i) {
        int i3 = this.f11234j;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, i3, ", size: "));
        }
        if (i == m.L(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        p();
        int iO = o(this.f11233h + i);
        Object[] objArr = this.i;
        Object obj = objArr[iO];
        if (i < (this.f11234j >> 1)) {
            int i6 = this.f11233h;
            if (iO >= i6) {
                k.e0(objArr, objArr, i6 + 1, i6, iO);
            } else {
                k.e0(objArr, objArr, 1, 0, iO);
                Object[] objArr2 = this.i;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f11233h;
                k.e0(objArr2, objArr2, i7 + 1, i7, objArr2.length - 1);
            }
            Object[] objArr3 = this.i;
            int i8 = this.f11233h;
            objArr3[i8] = null;
            this.f11233h = k(i8);
        } else {
            int iO2 = o(m.L(this) + this.f11233h);
            if (iO <= iO2) {
                Object[] objArr4 = this.i;
                k.e0(objArr4, objArr4, iO, iO + 1, iO2 + 1);
            } else {
                Object[] objArr5 = this.i;
                k.e0(objArr5, objArr5, iO, iO + 1, objArr5.length);
                Object[] objArr6 = this.i;
                objArr6[objArr6.length - 1] = objArr6[0];
                k.e0(objArr6, objArr6, 0, 1, iO2 + 1);
            }
            this.i[iO2] = null;
        }
        this.f11234j--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iC = c();
        if (i < 0 || i >= iC) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, iC, ", size: "));
        }
        return this.i[o(this.f11233h + i)];
    }

    public final void i(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.i.length;
        while (i < length && it.hasNext()) {
            this.i[i] = it.next();
            i++;
        }
        int i3 = this.f11233h;
        for (int i6 = 0; i6 < i3 && it.hasNext(); i6++) {
            this.i[i6] = it.next();
        }
        this.f11234j = collection.size() + this.f11234j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iO = o(c() + this.f11233h);
        int length = this.f11233h;
        if (length < iO) {
            while (length < iO) {
                if (k.a(obj, this.i[length])) {
                    i = this.f11233h;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iO) {
            return -1;
        }
        int length2 = this.i.length;
        while (length < length2) {
            if (k.a(obj, this.i[length])) {
                i = this.f11233h;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < iO; i3++) {
            if (k.a(obj, this.i[i3])) {
                length = i3 + this.i.length;
                i = this.f11233h;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final void j(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.i;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f11232k) {
            if (i < 10) {
                i = 10;
            }
            this.i = new Object[i];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i < 0) {
            i3 = i;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        k.e0(objArr, objArr2, 0, this.f11233h, objArr.length);
        Object[] objArr3 = this.i;
        int length2 = objArr3.length;
        int i6 = this.f11233h;
        k.e0(objArr3, objArr2, length2 - i6, 0, i6);
        this.f11233h = 0;
        this.i = objArr2;
    }

    public final int k(int i) {
        Object[] objArr = this.i;
        k.f("<this>", objArr);
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.i[o(m.L(this) + this.f11233h)];
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.i[o(m.L(this) + this.f11233h)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iO = o(this.f11234j + this.f11233h);
        int i3 = this.f11233h;
        if (i3 < iO) {
            length = iO - 1;
            if (i3 <= length) {
                while (!k.a(obj, this.i[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i = this.f11233h;
                return length - i;
            }
            return -1;
        }
        if (i3 > iO) {
            for (int i6 = iO - 1; -1 < i6; i6--) {
                if (k.a(obj, this.i[i6])) {
                    length = i6 + this.i.length;
                    i = this.f11233h;
                    return length - i;
                }
            }
            Object[] objArr = this.i;
            k.f("<this>", objArr);
            length = objArr.length - 1;
            int i7 = this.f11233h;
            if (i7 <= length) {
                while (!k.a(obj, this.i[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                i = this.f11233h;
                return length - i;
            }
        }
        return -1;
    }

    public final int m(int i) {
        return i < 0 ? i + this.i.length : i;
    }

    public final void n(int i, int i3) {
        if (i < i3) {
            k.j0(i, i3, this.i);
            return;
        }
        Object[] objArr = this.i;
        k.j0(i, objArr.length, objArr);
        k.j0(0, i3, this.i);
    }

    public final int o(int i) {
        Object[] objArr = this.i;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iO;
        k.f("elements", collection);
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.i.length != 0) {
            int iO2 = o(this.f11234j + this.f11233h);
            int i = this.f11233h;
            if (i < iO2) {
                iO = i;
                while (i < iO2) {
                    Object obj = this.i[i];
                    if (collection.contains(obj)) {
                        z5 = true;
                    } else {
                        this.i[iO] = obj;
                        iO++;
                    }
                    i++;
                }
                k.j0(iO, iO2, this.i);
            } else {
                int length = this.i.length;
                boolean z6 = false;
                int i3 = i;
                while (i < length) {
                    Object[] objArr = this.i;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z6 = true;
                    } else {
                        this.i[i3] = obj2;
                        i3++;
                    }
                    i++;
                }
                iO = o(i3);
                for (int i6 = 0; i6 < iO2; i6++) {
                    Object[] objArr2 = this.i;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        z6 = true;
                    } else {
                        this.i[iO] = obj3;
                        iO = k(iO);
                    }
                }
                z5 = z6;
            }
            if (z5) {
                p();
                this.f11234j = m(iO - this.f11233h);
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        Object[] objArr = this.i;
        int i = this.f11233h;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f11233h = k(i);
        this.f11234j = c() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        int iO = o(m.L(this) + this.f11233h);
        Object[] objArr = this.i;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.f11234j = c() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        a.r(i, i3, this.f11234j);
        int i6 = i3 - i;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f11234j) {
            clear();
            return;
        }
        if (i6 == 1) {
            g(i);
            return;
        }
        p();
        if (i < this.f11234j - i3) {
            int iO = o((i - 1) + this.f11233h);
            int iO2 = o((i3 - 1) + this.f11233h);
            while (i > 0) {
                int i7 = iO + 1;
                int iMin = Math.min(i, Math.min(i7, iO2 + 1));
                Object[] objArr = this.i;
                int i8 = iO2 - iMin;
                int i9 = iO - iMin;
                k.e0(objArr, objArr, i8 + 1, i9 + 1, i7);
                iO = m(i9);
                iO2 = m(i8);
                i -= iMin;
            }
            int iO3 = o(this.f11233h + i6);
            n(this.f11233h, iO3);
            this.f11233h = iO3;
        } else {
            int iO4 = o(this.f11233h + i3);
            int iO5 = o(this.f11233h + i);
            int i10 = this.f11234j;
            while (true) {
                i10 -= i3;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.i;
                i3 = Math.min(i10, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.i;
                int i11 = iO4 + i3;
                k.e0(objArr3, objArr3, iO5, iO4, i11);
                iO4 = o(i11);
                iO5 = o(iO5 + i3);
            }
            int iO6 = o(this.f11234j + this.f11233h);
            n(m(iO6 - i6), iO6);
        }
        this.f11234j -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iO;
        k.f("elements", collection);
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.i.length != 0) {
            int iO2 = o(this.f11234j + this.f11233h);
            int i = this.f11233h;
            if (i < iO2) {
                iO = i;
                while (i < iO2) {
                    Object obj = this.i[i];
                    if (collection.contains(obj)) {
                        this.i[iO] = obj;
                        iO++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                k.j0(iO, iO2, this.i);
            } else {
                int length = this.i.length;
                boolean z6 = false;
                int i3 = i;
                while (i < length) {
                    Object[] objArr = this.i;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.i[i3] = obj2;
                        i3++;
                    } else {
                        z6 = true;
                    }
                    i++;
                }
                iO = o(i3);
                for (int i6 = 0; i6 < iO2; i6++) {
                    Object[] objArr2 = this.i;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        this.i[iO] = obj3;
                        iO = k(iO);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                p();
                this.f11234j = m(iO - this.f11233h);
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iC = c();
        if (i < 0 || i >= iC) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, iC, ", size: "));
        }
        int iO = o(this.f11233h + i);
        Object[] objArr = this.i;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    public j(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f11232k;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(p012c.k.r(i, "Illegal Capacity: "));
        }
        this.i = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.f("array", objArr);
        int length = objArr.length;
        int i = this.f11234j;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            k.d("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iO = o(this.f11234j + this.f11233h);
        int i3 = this.f11233h;
        if (i3 < iO) {
            k.g0(this.i, objArr, i3, iO, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.i;
            k.e0(objArr2, objArr, 0, this.f11233h, objArr2.length);
            Object[] objArr3 = this.i;
            k.e0(objArr3, objArr, objArr3.length - this.f11233h, 0, iO);
        }
        int i6 = this.f11234j;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.f("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        p();
        j(collection.size() + c());
        i(o(c() + this.f11233h), collection);
        return true;
    }
}
