package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0417b implements RandomAccess {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final T f6821k = new T(new Object[0], 0, false);
    public Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6822j;

    public T(Object[] objArr, int i, boolean z5) {
        this.f6841h = z5;
        this.i = objArr;
        this.f6822j = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.f6822j;
        Object[] objArr = this.i;
        if (i == objArr.length) {
            this.i = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.i;
        int i3 = this.f6822j;
        this.f6822j = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f6822j) {
            StringBuilder sbV = p012c.k.v(i, "Index:", ", Size:");
            sbV.append(this.f6822j);
            throw new IndexOutOfBoundsException(sbV.toString());
        }
    }

    public final T g(int i) {
        if (i >= this.f6822j) {
            return new T(Arrays.copyOf(this.i, i), this.f6822j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.i[i];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0417b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        d(i);
        Object[] objArr = this.i;
        Object obj = objArr[i];
        int i3 = this.f6822j;
        if (i < i3 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i3 - i) - 1);
        }
        this.f6822j--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        d(i);
        Object[] objArr = this.i;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6822j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        c();
        if (i >= 0 && i <= (i3 = this.f6822j)) {
            Object[] objArr = this.i;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
            } else {
                Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.i, i, objArr2, i + 1, this.f6822j - i);
                this.i = objArr2;
            }
            this.i[i] = obj;
            this.f6822j++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbV = p012c.k.v(i, "Index:", ", Size:");
        sbV.append(this.f6822j);
        throw new IndexOutOfBoundsException(sbV.toString());
    }
}
